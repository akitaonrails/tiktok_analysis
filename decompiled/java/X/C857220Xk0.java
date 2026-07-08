package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xk0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857220Xk0 implements InterfaceC856160XiI {
    public final /* synthetic */ C857230Xk1 LIZ;

    @Override // X.InterfaceC856160XiI
    public final void cancel() {
        this.LIZ.LIZJ();
    }

    public C857220Xk0(C857230Xk1 c857230Xk1) {
        this.LIZ = c857230Xk1;
    }

    @Override // X.InterfaceC856160XiI
    public final void LIZ(AbstractC857240Xk2<?> abstractC857240Xk2) {
        C857230Xk1 c857230Xk1 = this.LIZ;
        synchronized (this) {
            try {
                if (c857230Xk1.LJIIJJI == EnumC864300XvQ.CANCELED) {
                    return;
                }
                if (abstractC857240Xk2 != null) {
                    if (c857230Xk1.LJFF.contains(abstractC857240Xk2)) {
                        return;
                    } else {
                        c857230Xk1.LJFF.add(abstractC857240Xk2);
                    }
                }
                c857230Xk1.LJIIJJI = EnumC864300XvQ.RUNNING;
                c857230Xk1.LJII = null;
                C857230Xk1 c857230Xk12 = this.LIZ;
                c857230Xk12.LJ(new AwS415S0200000_14(c857230Xk12, abstractC857240Xk2, this, 52));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC856160XiI
    public final void LIZIZ(AbstractC857240Xk2<?> abstractC857240Xk2) {
        C857230Xk1 c857230Xk1 = this.LIZ;
        synchronized (this) {
            try {
                if (c857230Xk1.LJIIJJI == EnumC864300XvQ.CANCELED) {
                    return;
                }
                c857230Xk1.LJII = abstractC857240Xk2;
                c857230Xk1.LJIIJJI = EnumC864300XvQ.PENDING;
                String strLIZJ = c857230Xk1.LIZJ.get(c857230Xk1.LJIIL).LIZJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("pending by: ");
                sbLIZ.append(strLIZJ);
                C857230Xk1.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC856160XiI
    public final void LIZJ(AbstractC857240Xk2<?> abstractC857240Xk2) {
        C857230Xk1 c857230Xk1 = this.LIZ;
        synchronized (this) {
            try {
                if (c857230Xk1.LJIIJJI == EnumC864300XvQ.PENDING && Intrinsics.LJFF(c857230Xk1.LJII, abstractC857240Xk2)) {
                    cancel();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
