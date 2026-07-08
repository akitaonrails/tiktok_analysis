package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1BtP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2219211BtP implements InterfaceC2219391Bth {
    public Function1<? super C09FQ, Unit> LIZ;
    public Function1<? super InterfaceC2219391Bth, Unit> LIZIZ;

    public final void LIZIZ() {
        if (this.LIZIZ != null) {
            synchronized (this) {
                try {
                    Function1<? super InterfaceC2219391Bth, Unit> function1 = this.LIZIZ;
                    if (function1 != null) {
                        function1.invoke(this);
                    }
                    this.LIZIZ = null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC2219391Bth
    public final void LIZ(C1448560nna c1448560nna) {
        this.LIZ = c1448560nna;
    }
}
