package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetAddonPanelLayoutRequest;
import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetAddonPanelLayoutResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.addon.dto.GetAddonPanelResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.03Q1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.utils.AddonInterceptUtils$handleSoftIntercept$1", f = "AddonInterceptUtils.kt", l = {71}, m = "invokeSuspend")
public final class C03Q1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C03O6 LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03Q1(C03O6 c03o6, int i, InterfaceC1364105Vn<? super C03Q1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c03o6;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03Q1(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLJFF;
        GetAddonPanelLayoutResponseData getAddonPanelLayoutResponseData;
        GetAddonPanelLayoutResponseData getAddonPanelLayoutResponseData2;
        C1C7U.LIZ("AddonInterceptUtils@1c0d.handleSoftIntercept$1");
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
                GetAddonPanelLayoutRequest getAddonPanelLayoutRequestLIZ = this.LLILLJJLI.LIZ(this.LLILLL);
                C859303Xj c859303Xj = InterfaceC859003Xg.LIZ;
                this.LL = 1;
                obj = c859303Xj.LIZ(getAddonPanelLayoutRequestLIZ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AddonInterceptUtils@1c0d.handleSoftIntercept$1");
                    return objLJFF;
                }
            }
            GetAddonPanelResponse getAddonPanelResponse = (GetAddonPanelResponse) obj;
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LLILLJJLI.LIZ;
            if (orderSubmitAssemViewModel != null) {
                if (getAddonPanelResponse == null) {
                    getAddonPanelLayoutResponseData2 = null;
                } else {
                    getAddonPanelLayoutResponseData2 = getAddonPanelResponse.data;
                }
                orderSubmitAssemViewModel.LLLZZIL = getAddonPanelLayoutResponseData2;
            }
            if (orderSubmitAssemViewModel != null && (getAddonPanelLayoutResponseData = orderSubmitAssemViewModel.LLLZZIL) != null) {
                zLJFF = Intrinsics.LJFF(getAddonPanelLayoutResponseData.showPanel, true);
            } else {
                zLJFF = false;
            }
            if (zLJFF) {
                OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LLILLJJLI.LIZ;
                if (orderSubmitAssemViewModel2 != null) {
                    orderSubmitAssemViewModel2.withState(new AwS580S0100000_1(orderSubmitAssemViewModel2, 402));
                }
            } else {
                OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = this.LLILLJJLI.LIZ;
                if (orderSubmitAssemViewModel3 != null) {
                    orderSubmitAssemViewModel3.withState(new AwS580S0100000_1(orderSubmitAssemViewModel3, 411));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LIZJ("get addon panel Fail");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddonInterceptUtils@1c0d.handleSoftIntercept$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
