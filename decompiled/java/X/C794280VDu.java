package X;

import android.webkit.WebView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.security.model.PnsSparkThirdHookModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VDu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C794280VDu {
    public static PnsSparkThirdHookModel LIZ;
    public static long LIZIZ = System.currentTimeMillis();

    public static final PnsSparkThirdHookModel LIZIZ() {
        if (LIZ == null || System.currentTimeMillis() - LIZIZ > 3600000) {
            PnsSparkThirdHookModel pnsSparkThirdHookModel = (PnsSparkThirdHookModel) SettingsManager.LIZLLL().LJIIIIZZ("pns_spark_third_hook", PnsSparkThirdHookModel.class, LIZ);
            if (pnsSparkThirdHookModel == null) {
                pnsSparkThirdHookModel = new PnsSparkThirdHookModel(false, null, false, null, null, null, "com.bytedance.hybrid.spark.third.container.SparkThirdWebViewInner");
            }
            LIZ = pnsSparkThirdHookModel;
            LIZIZ = System.currentTimeMillis();
        }
        return LIZ;
    }

    public static final boolean LIZ(WebView webView, String str) {
        boolean z = false;
        try {
            PnsSparkThirdHookModel pnsSparkThirdHookModelLIZIZ = LIZIZ();
            if (!pnsSparkThirdHookModelLIZIZ.forbidLancetHookEnable || !Intrinsics.LJFF(pnsSparkThirdHookModelLIZIZ.viewName, webView.getClass().getName())) {
                return false;
            }
            List<String> list = pnsSparkThirdHookModelLIZIZ.lancetAllowList;
            if (list != null && list.contains(str)) {
                z = true;
            }
            z = !z;
            return z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            return z;
        }
    }
}
