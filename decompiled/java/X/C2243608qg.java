package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08qg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2243608qg {
    public static final void LIZ(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        try {
            C189200o6.m2constructorimpl(obj);
            interfaceC1364105Vn.resumeWith(obj);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final void LIZIZ(Throwable th, InterfaceC1364105Vn interfaceC1364105Vn) {
        try {
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC1364105Vn.resumeWith(c098200Yq);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
