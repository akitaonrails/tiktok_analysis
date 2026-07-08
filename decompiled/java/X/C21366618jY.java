package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18jY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21366618jY implements InterfaceC2219181BtM {
    public InterfaceC1463990oCT LIZ;
    public Function1<? super InterfaceC2219181BtM, Unit> LIZIZ;

    @Override // X.InterfaceC2219181BtM
    public final void LIZ() {
        this.LIZ = C0FWM.LIZ;
    }

    @Override // X.InterfaceC2219181BtM
    public final InterfaceC1463990oCT getLogger() {
        if (this.LIZIZ != null) {
            synchronized (this) {
                try {
                    Function1<? super InterfaceC2219181BtM, Unit> function1 = this.LIZIZ;
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
        return this.LIZ;
    }
}
