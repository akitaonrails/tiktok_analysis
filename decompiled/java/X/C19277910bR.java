package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.christmas.ActivityStruct;
import com.ss.android.ugc.aweme.christmas.FestivalEntity;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.io.File;

/* JADX INFO: renamed from: X.10bR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19277910bR extends AbsDownloadListener {
    public static volatile C19277910bR LLILLL;
    public static final String LLILZ;
    public String LL = "";
    public boolean LLILLJJLI;

    public static final String LJI() {
        ActivityStruct.WatermarkStruct watermarkStruct;
        UrlModel urlModel;
        FestivalEntity festivalEntity = C1618260sDI.LIZ.LIZ;
        if (festivalEntity == null || (watermarkStruct = festivalEntity.waterMark) == null || (urlModel = watermarkStruct.waterResource) == null || C0IKQ.LIZ(urlModel.getUrlList())) {
            return null;
        }
        return (String) ListProtector.get(urlModel.getUrlList(), 0);
    }

    public static C19277910bR LJII() {
        if (LLILLL == null) {
            synchronized (C19277910bR.class) {
                try {
                    if (LLILLL == null) {
                        LLILLL = new C19277910bR();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLILLL;
    }

    static {
        String strShareDir = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().cacheConfig().shareDir();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strShareDir);
        sbLIZ.append("water");
        sbLIZ.append(File.separator);
        LLILZ = C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJIIIZ() {
        if (!C1618280sDK.LIZ()) {
            C2137908Zd.LIZJ.LIZLLL(LLILZ);
            return;
        }
        String strLJI = LJI();
        if (!TextUtils.isEmpty(strLJI)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LLILZ);
            sbLIZ.append(LJIIIIZZ(strLJI, false));
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            if (c0vsj.exists() && c0vsj.isDirectory() && c0vsj.listFiles().length > 0) {
                this.LL = c0vsj.getPath();
                return;
            }
        }
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        this.LL = "";
        C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
        String str = LLILZ;
        c2137908Zd.LIZLLL(str);
        c2137908Zd.LIZIZ(str);
        String strLJI2 = LJI();
        if (TextUtils.isEmpty(strLJI2)) {
            return;
        }
        DownloadServiceManager downloadServiceManager = DownloadServiceManager.INSTANCE;
        AbstractC2199801B7q abstractC2199801B7qWith = downloadServiceManager.getDownloadService().with(strLJI2);
        abstractC2199801B7qWith.LIZJ = LJIIIIZZ(strLJI2, true);
        abstractC2199801B7qWith.LJ = str;
        abstractC2199801B7qWith.LJII = downloadServiceManager.getRetryExpCount();
        abstractC2199801B7qWith.LJIIL = this;
        abstractC2199801B7qWith.LIZJ();
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        String url = downloadInfo.getUrl();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = LLILZ;
        sbLIZ.append(str);
        sbLIZ.append(LJIIIIZZ(url, true));
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        FestivalEntity festivalEntity = C1618260sDI.LIZ.LIZ;
        ActivityStruct.WatermarkStruct watermarkStruct = null;
        if (festivalEntity != null && festivalEntity.waterMark != null) {
            if (festivalEntity != null) {
                watermarkStruct = festivalEntity.waterMark;
            }
            String str2 = watermarkStruct.md5;
            if (c0vsj.exists() && TextUtils.equals(C08HM.LIZIZ(c0vsj), str2)) {
                String url2 = downloadInfo.getUrl();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(LJIIIIZZ(url2, false));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                C2137908Zd.LIZJ.LIZIZ(strLIZIZ);
                C0VSJ c0vsj2 = new C0VSJ(strLIZIZ);
                if (c0vsj2.exists() && c0vsj2.isDirectory() && c0vsj2.listFiles().length > 0) {
                    this.LL = c0vsj2.getPath();
                    return;
                }
                try {
                    C08SA.LIZJ(c0vsj, c0vsj2);
                    if (c0vsj.exists()) {
                        c0vsj.delete();
                    }
                    this.LL = c0vsj2.getPath();
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
        }
        C2137908Zd.LIZJ.LIZLLL(str);
    }

    public static String LJIIIIZZ(String str, boolean z) {
        String strLIZJ = C08HM.LIZJ(str);
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZJ);
            sbLIZ.append(".zip");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return strLIZJ;
    }
}
