package X;

import android.os.Bundle;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Mm1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578190Mm1 extends AbstractC578150Mlx {
    public final LifecycleOwner LLIZ;
    public C099G LLIZLLLIL;
    public final C01GW LLJ;

    @Override // X.AbstractC578150Mlx
    public final void LJI() {
    }

    @Override // X.AbstractC578150Mlx
    public final Bundle LJFF() {
        return LIZ();
    }

    @Override // X.AbstractC578150Mlx, X.InterfaceC578210Mm3
    public final void init() {
        LIZ();
        C786410Ut5.f3((C578200Mm2) this.LLJ.getValue(), Looper.getMainLooper().getQueue());
    }

    public C578190Mm1(C578250Mm7 c578250Mm7, C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = c578250Mm7;
        this.LLJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 139));
    }

    @Override // X.AbstractC578150Mlx
    public final void LJ(Bundle bundle, C578160Mly c578160Mly, InterfaceC332260D0u<EnumC578300MmC> interfaceC332260D0u) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLIZ), null, null, new C578170Mlz(this, c578160Mly, bundle, interfaceC332260D0u, null), 3);
    }
}
