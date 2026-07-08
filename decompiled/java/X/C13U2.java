package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13U2, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13U2 implements InterfaceC1633950scb {
    public final C13U4 LIZ;

    public C13U2(C1431970nMp c1431970nMp) {
        this.LIZ = c1431970nMp;
    }

    @Override // X.InterfaceC1633950scb
    public final String LIZIZ(Effect effect) {
        return this.LIZ.LIZ(effect.getId());
    }

    @Override // X.InterfaceC1633950scb
    public final void LIZ(final Effect effect, C1633940sca c1633940sca) {
        if (C123100dR.LIZ(effect.getUnzipPath())) {
            c1633940sca.onSuccessed(new DownloadInfo());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("has downloaded -> ");
            sbLIZ.append(effect.getUnzipPath());
            C201955140j.LJIILIIL("IMStickerDownloader", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!effect.getFile_url().isValid()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("invalid effect path ");
            sbLIZ2.append(effect.getFileUrl().getUrlList());
            C201955140j.LJFF("IMStickerDownloader", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        String strLLJLILLLLZIIL = this.LIZ.LLJLILLLLZIIL(effect.getId());
        if (strLLJLILLLLZIIL != null) {
            effect.setUnzipPath(strLLJLILLLLZIIL);
            c1633940sca.onSuccessed(new DownloadInfo());
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("hit cache -> ");
            sbLIZ3.append(effect.getUnzipPath());
            C201955140j.LJIILIIL("IMStickerDownloader", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        if (!C786590UtN.LIZ(C0CHQ.LIZ)) {
            c1633940sca.onFailed(new DownloadInfo(), new BaseException(10011, "no internet connection"));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("no internet connection -> download fail ");
            sbLIZ4.append(effect.getFileUrl().getUrlList());
            C201955140j.LJFF("IMStickerDownloader", C2188811AlT.LIZIZ(sbLIZ4));
            return;
        }
        DownloadTask downloadTaskWith = C2200151B8z.with(C0CHQ.LIZ);
        downloadTaskWith.url((String) ListProtector.get(effect.getFileUrl().getUrlList(), 0));
        downloadTaskWith.minProgressTimeMsInterval(10);
        downloadTaskWith.savePath(this.LIZ.getCacheDir());
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(effect.getId());
        sbLIZ5.append(".webp");
        downloadTaskWith.name(C2188811AlT.LIZIZ(sbLIZ5));
        downloadTaskWith.mainThreadListener(c1633940sca);
        downloadTaskWith.subThreadListener(new AbsDownloadListener() { // from class: X.13U3
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                String mimeType;
                String str;
                super.onSuccessed(downloadInfo);
                if (downloadInfo != null && (mimeType = downloadInfo.getMimeType()) != null) {
                    C13U2 c13u2 = this;
                    Effect effect2 = effect;
                    if (u.LJJIIJZLJL(mimeType, "image/", false) && (str = (String) C13LP.LJJLIIIJL(a0.LJJLIIIJ(mimeType, new char[]{'/'}, false, 0, 6))) != null && !Intrinsics.LJFF(str, "webp")) {
                        c13u2.getClass();
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("need change suffix ");
                        sbLIZ6.append(str);
                        C201955140j.LJFF("IMStickerDownloader", C2188811AlT.LIZIZ(sbLIZ6));
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append(c13u2.LIZ.getCacheDir());
                        sbLIZ7.append('/');
                        sbLIZ7.append(effect2.getId());
                        sbLIZ7.append('.');
                        sbLIZ7.append(str);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ7);
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append(c13u2.LIZ.getCacheDir());
                        sbLIZ8.append('/');
                        sbLIZ8.append(effect2.getId());
                        sbLIZ8.append(".webp");
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ8);
                        boolean zExists = new C0VSJ(strLIZIZ).exists();
                        if (zExists && new C0VSJ(strLIZIZ2).delete()) {
                            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                            sbLIZ9.append("cache[");
                            sbLIZ9.append(strLIZIZ);
                            sbLIZ9.append("] exist -> ");
                            sbLIZ9.append(zExists);
                            C201955140j.LJIILIIL("IMStickerDownloader", C2188811AlT.LIZIZ(sbLIZ9));
                            effect2.setUnzipPath(strLIZIZ);
                            return;
                        }
                        if (new C0VSJ(strLIZIZ2).renameTo(new C0VSJ(strLIZIZ))) {
                            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                            sbLIZ10.append("rename from ");
                            sbLIZ10.append(strLIZIZ2);
                            sbLIZ10.append(" to ");
                            sbLIZ10.append(strLIZIZ);
                            C201955140j.LJIILIIL("IMStickerDownloader", C2188811AlT.LIZIZ(sbLIZ10));
                            effect2.setUnzipPath(strLIZIZ);
                            return;
                        }
                    }
                }
                Effect effect3 = effect;
                effect3.setUnzipPath(this.LIZ.LIZ(effect3.getId()));
            }
        });
        downloadTaskWith.download();
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("start download ");
        sbLIZ6.append(effect.getFileUrl().getUrlList());
        C201955140j.LJIILIIL("IMStickerDownloader", C2188811AlT.LIZIZ(sbLIZ6));
    }
}
