package X;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cd6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.SocialThoughtPanelFragment$onCreateView$1$1$6$1", f = "SocialThoughtPanelFragment.kt", l = {}, m = "invokeSuspend")
public final class C317860Cd6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317860Cd6(boolean z, InterfaceC1364105Vn<? super C317860Cd6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317860Cd6(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialThoughtPanelFragment@3c57.onCreateView$1$1$6$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            C0DZM.LIZ.getClass();
            if (C306730C0p.LIZ() && !C0DZM.LJ() && C0DZM.LJI.compareAndSet(false, true)) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(ProcessLifecycleOwner.Companion.get()), null, null, new C317870Cd7(null), 3);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtPanelFragment@3c57.onCreateView$1$1$6$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
