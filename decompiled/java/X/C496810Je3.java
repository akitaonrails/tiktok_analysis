package X;

import com.bytedance.android.livesdk.api.revenue.privilege.api.PrivilegeApi;
import com.bytedance.android.livesdk.api.revenue.privilege.model.PrivilegeCenterConfig;
import com.bytedance.android.livesdk.profile.cell.HeaderCell;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.privilege.CentreEntranceResponse;
import tikcast.api.privilege.QueryUserPrivilegesResponse;

/* JADX INFO: renamed from: X.0Je3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.profile.cell.HeaderCell$onRequestDataLegacy$2$request$1", f = "HeaderCell.kt", l = {259}, m = "invokeSuspend")
public final class C496810Je3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super PrivilegeCenterConfig>, Object> {
    public int LL;
    public final /* synthetic */ HeaderCell LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496810Je3(HeaderCell headerCell, InterfaceC1364105Vn<? super C496810Je3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = headerCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C496810Je3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List list;
        C1C7U.LIZ("HeaderCell@5d5c.onRequestDataLegacy$2$request$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C480460Ism.LIZ().getClass();
            C19476611Hw c19476611HwLJL = ((PrivilegeApi) C480460Ism.LIZLLL(PrivilegeApi.class)).getPrivilegeCenterEntranceInfo(String.valueOf(this.LLILLJJLI.LL.LJFF.getId()), String.valueOf(this.LLILLJJLI.LL.LJFF.getOwnerUserId()), EnumC496820Je4.REQUEST_FROM_SCENE_PERSONAL_CARD.getType()).LJL(C11S5.LIZ());
            this.LL = 1;
            obj = C500260Jjc.LJJJJL(c19476611HwLJL, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("HeaderCell@5d5c.onRequestDataLegacy$2$request$1");
                return objLJFF;
            }
        }
        CentreEntranceResponse centreEntranceResponse = (CentreEntranceResponse) obj;
        CentreEntranceResponse.Data data = centreEntranceResponse.data;
        if (data == null || !data.showEntrance) {
            z = false;
        }
        QueryUserPrivilegesResponse.EntranceConfig entranceConfigLIZIZ = C498240JgM.LIZIZ(centreEntranceResponse);
        CentreEntranceResponse.Data data2 = centreEntranceResponse.data;
        if (data2 == null || (list = data2.iconAnimation) == null) {
            list = C13BV.INSTANCE;
        }
        PrivilegeCenterConfig privilegeCenterConfig = new PrivilegeCenterConfig(z, entranceConfigLIZIZ, list);
        C1C7U.LIZIZ("HeaderCell@5d5c.onRequestDataLegacy$2$request$1");
        return privilegeCenterConfig;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super PrivilegeCenterConfig> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
