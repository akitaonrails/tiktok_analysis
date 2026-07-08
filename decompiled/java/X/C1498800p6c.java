package X;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import java.io.File;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0p6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1498800p6c {
    public static final void LIZ(C19EG c19eg, String str, C1622850sKh c1622850sKh) {
        new DownloadInfo();
        if (TextUtils.isEmpty(str)) {
            new BaseException(0, "url=null");
        }
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!C036E.LIZ.LIZIZ()) {
            new BaseException(0, "network error");
        }
        String strEncodeToString = Base64.encodeToString(str.getBytes(Charsets.UTF_8), 2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EffectPlatform.LLILZ.getAbsolutePath());
        String str2 = File.separator;
        sbLIZ.append(str2);
        sbLIZ.append(strEncodeToString);
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        DownloadTask downloadTaskWith = C2200151B8z.with(c19eg);
        downloadTaskWith.url(str);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c0vsj.getParent());
        sbLIZ2.append(str2);
        downloadTaskWith.savePath(C2188811AlT.LIZIZ(sbLIZ2));
        downloadTaskWith.name(c0vsj.getName());
        downloadTaskWith.mainThreadListener(c1622850sKh);
        downloadTaskWith.retryCount(1);
        downloadTaskWith.download();
    }
}
