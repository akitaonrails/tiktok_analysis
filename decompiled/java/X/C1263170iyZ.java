package X;

import com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import njp.a;

/* JADX INFO: renamed from: X.0iyZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel$init$1$3", f = "UserCardListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1263170iyZ extends C09AX implements Function2<C1263200iyc, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ UserCardListViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1263170iyZ(UserCardListViewModel userCardListViewModel, InterfaceC1364105Vn<? super C1263170iyZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = userCardListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1263170iyZ c1263170iyZ = new C1263170iyZ(this.LLILLJJLI, interfaceC1364105Vn);
        c1263170iyZ.LL = obj;
        return c1263170iyZ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserCardListViewModel@982.init$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1263200iyc c1263200iyc = (C1263200iyc) this.LL;
        UserCardListViewModel userCardListViewModel = this.LLILLJJLI;
        C1263140iyW c1263140iyW = (C1263140iyW) userCardListViewModel.vmDispatcher.getState();
        C1623606Xi c1623606Xi = new C1623606Xi(new C626160OhC(false, c1263200iyc.LIZLLL, 1));
        if (C304890BxH.LIZIZ()) {
            c1263140iyW.getClass();
            if (c1263140iyW.getListState().LLILLJJLI instanceof C1623606Xi) {
                userCardListViewModel.setStateImmediate(new AwS598S0100000_19(c1623606Xi, (C1623606Xi<C626160OhC>) 43));
            } else if ((c1263140iyW.getListState().LLILLJJLI instanceof C491101vh) && (c1263140iyW.getListState().LL instanceof C1623606Xi)) {
                List<InterfaceC1262230ix3> list = c1263200iyc.LJ;
                if (list != null && list.isEmpty() && C036E.LIZ.LIZJ != C0O0L.AVAILABLE) {
                    userCardListViewModel.setStateImmediate(AFwS257S0000000_19.get$arr$(7));
                } else {
                    userCardListViewModel.setStateImmediate(new AwS598S0100000_19(c1623606Xi, (C1623606Xi<C626160OhC>) 40));
                }
            }
        } else {
            c1263140iyW.getClass();
            if (c1263140iyW.getListState().LLILLJJLI instanceof C1623606Xi) {
                userCardListViewModel.setStateImmediate(new AwS598S0100000_19(c1623606Xi, (C1623606Xi<C626160OhC>) 41));
            } else if ((c1263140iyW.getListState().LLILLJJLI instanceof C491101vh) && (c1263140iyW.getListState().LL instanceof C1623606Xi)) {
                List<InterfaceC1262230ix3> list2 = c1263200iyc.LJ;
                if (list2 != null && list2.isEmpty() && C036E.LIZ.LIZJ != C0O0L.AVAILABLE) {
                    userCardListViewModel.setStateImmediate(AFwS257S0000000_19.get$arr$(8));
                } else {
                    userCardListViewModel.setStateImmediate(new AwS598S0100000_19(c1623606Xi, (C1623606Xi<C626160OhC>) 42));
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserCardListViewModel@982.init$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1263200iyc c1263200iyc, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c1263200iyc, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
