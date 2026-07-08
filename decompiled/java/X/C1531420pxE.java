package X;

import android.view.View;
import com.bytedance.android.monitorV2.jsworker.JsWorkerModule;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.JSModuleManager;
import com.bytedance.vmsdk.jsbridge.JSModuleWrapper;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0pxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531420pxE {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, JSModuleManager jSModuleManager) {
        JSModule module;
        JsWorkerModule jsWorkerModule;
        C1521680phW module2;
        try {
            JSModuleWrapper jSModuleWrapperLIZ = jSModuleManager.LIZ("hybridMonitor");
            Unit unit = null;
            if (jSModuleWrapperLIZ != null && (module = jSModuleWrapperLIZ.getModule()) != null && (module instanceof JsWorkerModule) && (jsWorkerModule = (JsWorkerModule) module) != null && (module2 = jsWorkerModule.getModule()) != null) {
                module2.o5(view);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
