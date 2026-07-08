package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FQT, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FQT extends AbstractC538070L8j {
    public C538080L8k LJII;
    public boolean LJIIIIZZ;
    public Set<? extends InterfaceC538100L8m> LJIIIZ = C08CX.INSTANCE;

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final void LJIJJ() {
        this.LJIIIIZZ = true;
        for (InterfaceC538100L8m interfaceC538100L8m : this.LJIIIZ) {
            if (!Intrinsics.LJFF(interfaceC538100L8m, this)) {
                interfaceC538100L8m.LJIJJ();
            }
        }
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final int LJIL() {
        return 0;
    }

    @Override // X.InterfaceC538100L8m
    public final String getTaskName() {
        return "ROOT";
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC354490Dv5
    public final void cancel() {
        for (InterfaceC354490Dv5 interfaceC354490Dv5 : this.LJIIIZ) {
            if (Intrinsics.LJFF(interfaceC354490Dv5, this)) {
                super.cancel();
            } else {
                interfaceC354490Dv5.cancel();
            }
        }
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final boolean LJI() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final C538080L8k LJIILLIIL() {
        return this.LJII;
    }

    public C0FQT(C538080L8k c538080L8k) {
        this.LJII = c538080L8k;
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final void LJII(C538080L8k c538080L8k) {
        this.LJII = c538080L8k;
    }

    @Override // X.AbstractC538070L8j, X.InterfaceC538100L8m
    public final boolean LJIIZILJ(C0FQS c0fqs) {
        super.LJIIZILJ(c0fqs);
        c0fqs.LIZ = String.valueOf(System.nanoTime());
        LIZJ(c0fqs, null);
        return false;
    }
}
