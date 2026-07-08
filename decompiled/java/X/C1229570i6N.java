package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publicgroup.data.model.UpdateShowGroupListRequest;
import com.ss.android.ugc.aweme.publicgroup.vm.GroupListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0i6N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publicgroup.vm.GroupListViewModel$recordNewOrderAndSaveChanges$2", f = "GroupListViewModel.kt", l = {575}, m = "invokeSuspend")
public final class C1229570i6N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GroupListViewModel LLILLJJLI;
    public final /* synthetic */ DialogC1389620mGW LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1229570i6N(GroupListViewModel groupListViewModel, DialogC1389620mGW dialogC1389620mGW, InterfaceC1364105Vn<? super C1229570i6N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = groupListViewModel;
        this.LLILLL = dialogC1389620mGW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1229570i6N(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupListViewModel@5b8e.recordNewOrderAndSaveChanges$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1230140i7I c1230140i7I = C1230140i7I.LIZ;
                UpdateShowGroupListRequest updateShowGroupListRequest = new UpdateShowGroupListRequest(this.LLILLJJLI.LLILZ);
                this.LL = 1;
                if (c1230140i7I.LIZJ(updateShowGroupListRequest, this) == objLJFF) {
                    C1C7U.LIZIZ("GroupListViewModel@5b8e.recordNewOrderAndSaveChanges$2");
                    return objLJFF;
                }
            }
            List<InterfaceC1891350zJl> list = this.LLILLJJLI.getState().LL.LIZ;
            List<C1229760i6g> list2 = this.LLILLJJLI.getState().LLILLJJLI.LIZ;
            GroupListViewModel groupListViewModel = this.LLILLJJLI;
            ArrayList arrayList = new ArrayList();
            for (C1229760i6g c1229760i6g : list2) {
                if (!((ArrayList) groupListViewModel.LLILZ).contains(C2286608xc.LJFF(c1229760i6g.LL))) {
                    arrayList.add(c1229760i6g);
                }
            }
            this.LLILLJJLI.GQ2(list, arrayList, false, null);
            C786410Ut5.LJIIJ(this.LLILLL);
            this.LLILLJJLI.BQ2(true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update group order failed:");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
            C1229780i6i.LIZ(null, C1383370m6R.LJIIJ(2131835079));
            C786410Ut5.LJIIJ(this.LLILLL);
            this.LLILLJJLI.BQ2(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupListViewModel@5b8e.recordNewOrderAndSaveChanges$2");
        return unit;
    }
}
