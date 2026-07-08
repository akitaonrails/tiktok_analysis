package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0QHQ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QHQ implements InterfaceC1386380mBI {
    public static final C0QHQ LIZ = new C0QHQ();

    @Override // X.InterfaceC1386380mBI
    public final boolean F() {
        try {
            return C0C59.LJ().LJI("search_auto_scroll", 0, false) == 1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }
}
