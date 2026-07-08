package X;

import android.app.Activity;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.common.applog.AppLog;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827040WcQ {
    public static volatile String LIZJ;
    public static final C827040WcQ LIZ = new C827040WcQ();
    public static final C11PR<C827120WcY> LIZIZ = new C11RK().LJLLLL();
    public static final C827090WcV LIZLLL = new InterfaceC2211071BgH() { // from class: X.0WcV
        @Override // X.InterfaceC2211071BgH
        public final void LIZIZ(long j) {
            C827040WcQ.LIZIZ.onNext(new C827120WcY(EnumC827110WcX.Start, ""));
        }

        @Override // X.InterfaceC2211071BgH
        public final void LIZ(String str, long j, JSONObject jSONObject) {
            C827040WcQ.LIZIZ.onNext(new C827120WcY(EnumC827110WcX.End, str));
        }

        @Override // X.InterfaceC2211071BgH
        public final void LIZJ(String str, long j, JSONObject jSONObject) {
            C827040WcQ c827040WcQ = C827040WcQ.LIZ;
            C827040WcQ.LIZJ = str;
            C827040WcQ.LIZIZ.onNext(new C827120WcY(EnumC827110WcX.LogSessionBatch, str));
        }
    };
    public static final C01GW LJ = C452501pT.LIZIZ(new C806630Vkb());

    public static void LIZ(Activity activity) {
        boolean zLJI = MethodIDManager.LJI(71731);
        if (C807630VmD.LIZ.LIZIZ.get()) {
            AppLog.onPause(activity);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LIZIZ(Activity activity) {
        if (!C827030WcP.LIZ) {
            C827030WcP.LIZIZ = new WeakReference<>(activity);
        } else {
            if (!C807630VmD.LIZ.LIZIZ.get()) {
                return;
            }
            AppLog.onResume(activity);
        }
    }
}
