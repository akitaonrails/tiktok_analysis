package X;

import android.view.View;
import android.view.ViewParent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.lynx.hybrid.webkit.WebKitView;

/* JADX INFO: renamed from: X.0zMk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893200zMk {
    public static final SparkActivity LIZ(SparkContext sparkContext) {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ();
        if (interfaceC1059280dfiLJJIJLIJ == null || !(interfaceC1059280dfiLJJIJLIJ instanceof SparkActivity)) {
            return null;
        }
        return (SparkActivity) interfaceC1059280dfiLJJIJLIJ;
    }

    public static final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZIZ(SparkContext sparkContext) {
        ViewParent parent;
        C1529870puj c1529870puj = C1529870puj.LIZ;
        String str = sparkContext.containerId;
        c1529870puj.getClass();
        Object objLJFF = C1529870puj.LJFF(str);
        if (objLJFF == null || !(objLJFF instanceof View) || (parent = ((View) objLJFF).getParent()) == null || !(parent instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB)) {
            return null;
        }
        return (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) parent;
    }

    public static final void LIZJ(SparkContext sparkContext) {
        WebKitView webKitView;
        C1529870puj c1529870puj = C1529870puj.LIZ;
        String str = sparkContext.containerId;
        c1529870puj.getClass();
        InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(str);
        if (interfaceC1541990qEHLJFF != null && (interfaceC1541990qEHLJFF instanceof WebKitView) && (webKitView = (WebKitView) interfaceC1541990qEHLJFF) != null && webKitView.canGoBack()) {
            webKitView.goBack();
            return;
        }
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ();
        if (interfaceC1059280dfiLJJIJLIJ == null || !(interfaceC1059280dfiLJJIJLIJ instanceof SparkActivity)) {
            return;
        }
        ((SparkActivity) interfaceC1059280dfiLJJIJLIJ).finish();
    }
}
