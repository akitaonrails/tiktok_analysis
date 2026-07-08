package X;

import Y.ACallableS432S0100000_29;
import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.christmas.FestivalEntity;
import com.ss.android.ugc.aweme.christmas.ResEntity;
import java.io.File;

/* JADX INFO: renamed from: X.126f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197011126f extends AbstractC197012126g {
    public static final String LLILZ;
    public static volatile C197011126f LLILZIL;
    public String LL;
    public String LLILLJJLI;
    public InterfaceC197013126h LLILLL;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
    }

    public static C197011126f LJIIIIZZ() {
        if (LLILZIL == null) {
            synchronized (C197011126f.class) {
                try {
                    if (LLILZIL == null) {
                        LLILZIL = new C197011126f();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LLILZIL;
    }

    static {
        File fileY2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Context context = C2354709Kn.LIZ;
        if (Environment.isExternalStorageEmulated() || (fileY2 = C786410Ut5.y2(context, null)) == null) {
            fileY2 = C2354709Kn.LIZ(context);
        } else {
            C2354709Kn.LJI(fileY2);
        }
        sbLIZ.append(fileY2.getPath());
        sbLIZ.append(File.separator);
        sbLIZ.append("festival");
        LLILZ = C2188811AlT.LIZIZ(sbLIZ);
    }

    public C197011126f() {
        if (C828040We2.LIZIZ()) {
            C2137908Zd.LIZJ.LIZIZ(LLILZ);
        } else {
            LJI(LLILZ);
        }
    }

    public static final String LJII() {
        ResEntity resEntity;
        UrlModel urlModel;
        FestivalEntity festivalEntityLIZ = C828040We2.LIZ();
        if (festivalEntityLIZ == null || (resEntity = festivalEntityLIZ.resEntity) == null || (urlModel = resEntity.resourceUrl) == null || C086I.LIZIZ(urlModel.getUrlList())) {
            return null;
        }
        return (String) ListProtector.get(urlModel.getUrlList(), 0);
    }

    public static void LJI(String str) {
        try {
            C2137908Zd.LIZJ.LIZLLL(str);
        } catch (NoSuchMethodError e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NoSuchMethodError in FestivalResDownloader-deleteFiles, path is ");
            sbLIZ.append(str);
            sbLIZ.append(", error is ");
            sbLIZ.append(e.getMessage());
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        String targetFilePath = downloadInfo.getTargetFilePath();
        if (TextUtils.isEmpty(targetFilePath)) {
            return;
        }
        C0VSJ c0vsj = new C0VSJ(targetFilePath);
        if (C828040We2.LIZ() != null && C828040We2.LIZ().resEntity != null) {
            String str = C828040We2.LIZ().resEntity.md5;
            if (c0vsj.exists() && TextUtils.equals(C08HM.LIZIZ(c0vsj), str)) {
                C0VSJ c0vsj2 = new C0VSJ(this.LLILLJJLI);
                if (c0vsj2.exists() && c0vsj2.listFiles().length > 0) {
                    LJI(c0vsj2.getPath());
                }
                File fileLIZIZ = C2137908Zd.LIZJ.LIZIZ(this.LLILLJJLI);
                try {
                    C08SA.LIZJ(new C0VSJ(targetFilePath), fileLIZIZ);
                    this.LL = fileLIZIZ.getPath();
                    if (this.LLILLL != null) {
                        C15O7.LIZIZ(new ACallableS432S0100000_29(this, 15), C15O7.LJIIIIZZ, null);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            LJI(c0vsj.getPath());
        }
    }
}
