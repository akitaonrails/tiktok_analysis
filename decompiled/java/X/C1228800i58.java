package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.publicgroup.vm.GroupListViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i58, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publicgroup.vm.GroupListViewModel$reportClickCreateGroup$1", f = "GroupListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1228800i58 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ GroupListViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1228800i58(GroupListViewModel groupListViewModel, InterfaceC1364105Vn<? super C1228800i58> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = groupListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1228800i58(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupListViewModel@5b8e.reportClickCreateGroup$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1228780i56 c1228780i56YQ2 = this.LL.yQ2();
        if (c1228780i56YQ2 == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GroupListViewModel@5b8e.reportClickCreateGroup$1");
            return unit;
        }
        C1228810i59 c1228810i59 = c1228780i56YQ2.LL.LIZIZ;
        C459080HzO.LJFF("click_create_group", new Pair("has_menu", CardStruct.IStatusCode.DEFAULT), new Pair("enter_from", c1228810i59.LIZ), new Pair("enter_method", c1228810i59.LIZIZ), new Pair("group_owner_account_type", C1528505yd.LIZ(C461720I8s.LIZIZ())), new Pair("enter_position", c1228810i59.LJIIJJI.get("enter_position")));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GroupListViewModel@5b8e.reportClickCreateGroup$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
