package X;

import com.ss.android.ugc.aweme.notification.aggregate.InviteListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06KG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.aggregate.InviteListViewModel$retry$2", f = "InviteListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C06KG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InviteListViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06KG(InviteListViewModel inviteListViewModel, InterfaceC1364105Vn<? super C06KG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = inviteListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06KG(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InviteListViewModel@e654.retry$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.manualListRefresh();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InviteListViewModel@e654.retry$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
