package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectKt;
import com.ss.ugc.effectplatform.model.DiffEffect;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13MR, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13MR {
    public static boolean LIZ(Effect effect) {
        String uri;
        C1798710wuL c1798710wuL;
        UrlModel diff_url;
        UrlModel base_url;
        if (!EffectKt.containDiffInfo(effect)) {
            return false;
        }
        DiffEffect file_diff = effect.getFile_diff();
        String uri2 = null;
        if (file_diff != null && (base_url = file_diff.getBase_url()) != null) {
            uri = base_url.getUri();
        } else {
            uri = null;
        }
        DiffEffect file_diff2 = effect.getFile_diff();
        if (file_diff2 != null && (diff_url = file_diff2.getDiff_url()) != null) {
            uri2 = diff_url.getUri();
        }
        if (uri2 != null && uri != null && (c1798710wuL = C13MX.LJIILIIL) != null) {
            String str = "";
            String string = c1798710wuL.LIZ.getString(uri2, "");
            if (string != null) {
                str = string;
            }
            if (str.length() != 0 && str != null && str.length() != 0 && !Intrinsics.LJFF(uri, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZIZ(String str, String str2, Map map) {
        boolean zLJJII;
        try {
            zLJJII = C13SB.LJJII(str, str2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("minizip_fallback:");
            sbLIZ.append(th.getClass().getSimpleName());
            map.put("error_info", C2188811AlT.LIZIZ(sbLIZ));
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("unzipWithMiniZip failed, fallback to unzip2, zipFilePath: ");
            sbLIZ2.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            c13ss.getClass();
            C13SS.LIZIZ("EffectDiskLruCache", strLIZIZ, th);
        }
        if (!zLJJII) {
            map.put("unzip_solution", EffectConfiguration.UnZipSolution.NEW_SOLUTION.toString());
            return C13SB.LJIJJLI(str, str2);
        }
        return zLJJII;
    }
}
