package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.SeaUserRightHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03oP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.SeaUserRightHolder$onClick$1", f = "SeaUserRightHolder.kt", l = {}, m = "invokeSuspend")
public final class C955503oP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SeaUserRightHolder LL;
    public final /* synthetic */ C01GW<SeaPdpViewModel> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C955503oP(SeaUserRightHolder seaUserRightHolder, C01GW<? extends SeaPdpViewModel> c01gw, String str, InterfaceC1364105Vn<? super C955503oP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = seaUserRightHolder;
        this.LLILLJJLI = c01gw;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C955503oP(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaUserRightHolder@a3df.onClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C01GW<SeaPdpViewModel> c01gw = this.LLILLJJLI;
        int i = SeaUserRightHolder.LLJJJJLIIL;
        C1054104Ah c1054104Ah = c01gw.getValue().LLJLIL;
        if (c1054104Ah != null) {
            C1054104Ah.LJJII(c1054104Ah, "user_rights", null, null, null, C2097608Jq.LJIIIIZZ(new Pair("rights_cnt", C2286608xc.LJ(this.LL.LLJJJIL)), new Pair("rights_content", this.LL.LLJJJJ.toString()), new Pair("module_show_type", this.LL.LLJJJJJIL)), null, null, null, null, 494);
        }
        ((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LJIIIZ("rights_service");
        FragmentManager fragmentManager = this.LL.LLJJIJIL.getFragmentManager();
        if (fragmentManager != null) {
            SeaUserRightHolder seaUserRightHolder = this.LL;
            String str = this.LLILLL;
            C01GW<SeaPdpViewModel> c01gw2 = this.LLILLJJLI;
            UserRight userRight = ((C955603oQ) seaUserRightHolder.LLILLJJLI).LL;
            String str2 = userRight.name;
            C1053804Ae c1053804Ae = c01gw2.getValue().LLLLL;
            c1053804Ae.getClass();
            C03GT.LIZ(fragmentManager, userRight, str2, null, str, c1053804Ae.LJI("c7829.d9061", null));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaUserRightHolder@a3df.onClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
