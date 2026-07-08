package X;

import android.view.View;
import android.view.ViewParent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;

/* JADX INFO: renamed from: X.10jI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19326610jI {
    public static final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZ(SparkContext sparkContext) {
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

    public static final WebKitView LIZIZ(SparkContext sparkContext) {
        C1529870puj c1529870puj = C1529870puj.LIZ;
        String str = sparkContext.containerId;
        c1529870puj.getClass();
        InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(str);
        if (interfaceC1541990qEHLJFF == null || !(interfaceC1541990qEHLJFF instanceof WebKitView)) {
            return null;
        }
        return (WebKitView) interfaceC1541990qEHLJFF;
    }
}
