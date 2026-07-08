package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.IMusicService;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nIO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429220nIO extends AbstractC1429240nIQ {
    public final C1429160nII LIZIZ;
    public Integer LIZJ;
    public C1429230nIP LIZLLL;

    @Override // X.InterfaceC1429290nIV
    public final boolean LIZIZ() {
        String str = this.LIZIZ.LIZJ;
        return (str == null || str.length() == 0) && !Intrinsics.LJFF(this.LIZIZ.LJ, Boolean.TRUE);
    }

    public final void LJI() {
        Integer num = this.LIZJ;
        if (num != null) {
            Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C0CHQ.LIZ).removeSubThreadListener(num.intValue(), this.LIZLLL);
        }
    }

    @Override // X.AbstractC1429240nIQ, X.InterfaceC1429290nIV
    public final void cancel() {
        this.LIZ = EnumC1429260nIS.CANCELED;
        Integer num = this.LIZJ;
        if (num != null) {
            Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C0CHQ.LIZ).cancel(num.intValue());
            LJI();
        }
    }

    @Override // X.InterfaceC1429290nIV
    public final EnumC1429270nIT getTaskType() {
        return EnumC1429270nIT.DOWNLOAD_MUSIC_FROM_URL;
    }

    public C1429220nIO(C1429160nII c1429160nII) {
        this.LIZIZ = c1429160nII;
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [X.0nIP] */
    @Override // X.AbstractC1429240nIQ
    public final void LIZJ(final InterfaceC1429300nIW interfaceC1429300nIW) {
        String str;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("downloadMusicFromUrl: musicUrl = ");
        sbLIZ.append(this.LIZIZ.LIZJ);
        sbLIZ.append(", musicId = ");
        sbLIZ.append(this.LIZIZ.LIZIZ);
        sbLIZ.append(", musicName = ");
        AVMusic aVMusic = this.LIZIZ.LIZLLL;
        if (aVMusic != null) {
            str = aVMusic.musicName;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        final boolean zLJFF = Intrinsics.LJFF(this.LIZIZ.LJ, Boolean.TRUE);
        String str2 = this.LIZIZ.LIZJ;
        if (str2 != null && str2.length() != 0) {
            String downloadDir = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).getDownloadDir();
            String downloadFileName = ((IMusicService) ServiceManager.get().getService(IMusicService.class)).getDownloadFileName(this.LIZIZ.LIZJ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(downloadDir);
            sbLIZ2.append(downloadFileName);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("downloadMusicFromUrl: localMusicPath = ");
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(", exist? ");
            sbLIZ3.append(C2286708xd.LIZJ(strLIZIZ));
            C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ3));
            if (C2286708xd.LIZJ(strLIZIZ)) {
                C1429160nII c1429160nII = this.LIZIZ;
                c1429160nII.LJFF = strLIZIZ;
                c1429160nII.LJI = true;
                if (interfaceC1429300nIW != null) {
                    LJFF(interfaceC1429300nIW);
                    return;
                }
                return;
            }
            final C1429160nII c1429160nII2 = this.LIZIZ;
            this.LIZLLL = new AbsDownloadListener(this, c1429160nII2, interfaceC1429300nIW, zLJFF) { // from class: X.0nIP
                public final C1429160nII LL;
                public final InterfaceC1429300nIW LLILLJJLI;
                public final boolean LLILLL;
                public final WeakReference<C1429220nIO> LLILZ;

                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onSuccessed(DownloadInfo downloadInfo) {
                    String targetFilePath;
                    super.onSuccessed(downloadInfo);
                    C1429220nIO c1429220nIO = this.LLILZ.get();
                    if (c1429220nIO == null) {
                        return;
                    }
                    c1429220nIO.LIZJ = null;
                    if (downloadInfo != null && (targetFilePath = downloadInfo.getTargetFilePath()) != null && targetFilePath.length() != 0) {
                        if (!C2286708xd.LIZJ(targetFilePath)) {
                            this.LL.LJII = -10003;
                            this.LL.LJIIIIZZ = "musicPath is invalid";
                            InterfaceC1429300nIW interfaceC1429300nIW2 = this.LLILLJJLI;
                            if (interfaceC1429300nIW2 != null) {
                                interfaceC1429300nIW2.LIZ(EnumC1429270nIT.DOWNLOAD_MUSIC_FROM_URL, this.LLILLL);
                                return;
                            }
                            return;
                        }
                        C1429160nII c1429160nII3 = this.LL;
                        c1429160nII3.LJFF = targetFilePath;
                        c1429160nII3.LJI = false;
                        InterfaceC1429300nIW interfaceC1429300nIW3 = this.LLILLJJLI;
                        if (interfaceC1429300nIW3 != null) {
                            c1429220nIO.LJFF(interfaceC1429300nIW3);
                        }
                        if (C299990BpN.LIZ()) {
                            c1429220nIO.LJI();
                            return;
                        }
                        return;
                    }
                    this.LL.LJII = -10001;
                    this.LL.LJIIIIZZ = "musicPath is null or empty";
                    InterfaceC1429300nIW interfaceC1429300nIW4 = this.LLILLJJLI;
                    if (interfaceC1429300nIW4 != null) {
                        interfaceC1429300nIW4.LIZ(EnumC1429270nIT.DOWNLOAD_MUSIC_FROM_URL, this.LLILLL);
                    }
                }

                @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
                public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                    Integer numValueOf;
                    super.onFailed(downloadInfo, baseException);
                    C1429220nIO c1429220nIO = this.LLILZ.get();
                    if (c1429220nIO == null) {
                        return;
                    }
                    String errorMessage = null;
                    c1429220nIO.LIZJ = null;
                    C1429160nII c1429160nII3 = this.LL;
                    if (baseException != null) {
                        numValueOf = Integer.valueOf(baseException.getErrorCode());
                    } else {
                        numValueOf = null;
                    }
                    c1429160nII3.LJII = numValueOf;
                    C1429160nII c1429160nII4 = this.LL;
                    if (baseException != null) {
                        errorMessage = baseException.getErrorMessage();
                    }
                    c1429160nII4.LJIIIIZZ = errorMessage;
                    InterfaceC1429300nIW interfaceC1429300nIW2 = this.LLILLJJLI;
                    boolean z = this.LLILLL;
                    if (interfaceC1429300nIW2 != null) {
                        c1429220nIO.LIZLLL(interfaceC1429300nIW2, z);
                    }
                    if (C299990BpN.LIZ()) {
                        c1429220nIO.LJI();
                    }
                }

                {
                    this.LL = c1429160nII2;
                    this.LLILLJJLI = interfaceC1429300nIW;
                    this.LLILLL = zLJFF;
                    this.LLILZ = new WeakReference<>(this);
                }
            };
            DownloadTask downloadTaskWith = C2200151B8z.with(C0CHQ.LIZ);
            downloadTaskWith.url(this.LIZIZ.LIZJ);
            downloadTaskWith.savePath(downloadDir);
            downloadTaskWith.name(downloadFileName);
            downloadTaskWith.subThreadListener(this.LIZLLL);
            this.LIZJ = Integer.valueOf(downloadTaskWith.download());
            return;
        }
        this.LIZIZ.LJII = -10005;
        this.LIZIZ.LJIIIIZZ = "musicUrl is null or empty";
        if (interfaceC1429300nIW != null) {
            LIZLLL(interfaceC1429300nIW, zLJFF);
        }
    }
}
