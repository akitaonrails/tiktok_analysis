package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cQm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011580cQm implements InterfaceC1011430cQX {
    public final LifecycleOwner LIZ;
    public final C2252331DDr LIZIZ = C09IR.LIZIZ(0, 0, null, 7);
    public final C2252321DDq LIZJ;
    public final AnonymousClass0951 LIZLLL;

    @Override // X.InterfaceC1011430cQX
    public final AnonymousClass0951 LIZJ() {
        return this.LIZLLL;
    }

    public C1011580cQm(LifecycleOwner lifecycleOwner) {
        this.LIZ = lifecycleOwner;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1011570cQl(126));
        this.LIZJ = c2252321DDqLIZ;
        this.LIZLLL = C09IC.LIZIZ(c2252321DDqLIZ);
    }

    @Override // X.InterfaceC1011430cQX
    public final void LIZ(C1011570cQl c1011570cQl) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new C1011600cQo(this, c1011570cQl, null), 3);
    }

    @Override // X.InterfaceC1011430cQX
    public final void LIZIZ(EnumC1011130cQ3 enumC1011130cQ3) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new C1011590cQn(enumC1011130cQ3, this, null), 3);
    }

    @Override // X.InterfaceC1011430cQX
    public final void LIZLLL(EnumC1011130cQ3 enumC1011130cQ3, Function0<Unit> function0) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), null, null, new C1011610cQp(this, enumC1011130cQ3, function0, null), 3);
    }
}
