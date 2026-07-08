package X;

import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0e34, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel$init$1$1", f = "UserCardListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1073760e34 extends C09AX implements Function2<C1263200iyc, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ UserCardListViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1073760e34(UserCardListViewModel userCardListViewModel, InterfaceC1364105Vn<? super C1073760e34> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = userCardListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1073760e34 c1073760e34 = new C1073760e34(this.LLILLJJLI, interfaceC1364105Vn);
        c1073760e34.LL = obj;
        return c1073760e34;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserCardListViewModel@982.init$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        C1264320j0Q c1264320j0Q = C1264320j0Q.LIZ;
        String str = this.LLILLJJLI.LLILZIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("collect source state: ");
        sbLIZ.append(obj2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1264320j0Q.getClass();
        C1264320j0Q.LIZLLL(str, strLIZIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserCardListViewModel@982.init$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1263200iyc c1263200iyc, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c1263200iyc, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
