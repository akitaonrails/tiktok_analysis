package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.matchentry.GuestMatchEntryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CY9, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.matchentry.GuestMatchEntryFragment$onCreateView$1$1$1$1", f = "GuestMatchEntryFragment.kt", l = {}, m = "invokeSuspend")
public final class C0CY9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ GuestMatchEntryViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CY9(GuestMatchEntryViewModel guestMatchEntryViewModel, InterfaceC1364105Vn<? super C0CY9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = guestMatchEntryViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CY9(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GuestMatchEntryFragment@36ee.onCreateView$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.vQ2(C0CYA.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GuestMatchEntryFragment@36ee.onCreateView$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
