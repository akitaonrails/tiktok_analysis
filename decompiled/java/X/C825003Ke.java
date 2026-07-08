package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Ke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel$checkAndUpdateBillInfoData$1$4", f = "MiniOspViewModel.kt", l = {1032, 1035}, m = "invokeSuspend")
public final class C825003Ke extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BillInfoData LLILLJJLI;
    public final /* synthetic */ MiniOspViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C825003Ke(BillInfoData billInfoData, MiniOspViewModel miniOspViewModel, InterfaceC1364105Vn<? super C825003Ke> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = billInfoData;
        this.LLILLL = miniOspViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C825003Ke(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IECommerceHostService iECommerceHostService;
        C928103jz top;
        Context context;
        Activity activityLIZ;
        boolean z;
        String name;
        BillInfoData billInfoData;
        C1C7U.LIZ("MiniOspViewModel@8f4.checkAndUpdateBillInfoData$1$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    billInfoData = this.LLILLJJLI;
                    if (billInfoData != null && billInfoData.exceptionUX != null) {
                        MiniOspViewModel miniOspViewModel = this.LLILLL;
                        miniOspViewModel.LLJJIJIIJIL = "query_bill_info";
                        miniOspViewModel.iR2(1);
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MiniOspViewModel@8f4.checkAndUpdateBillInfoData$1$4");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            BillInfoData billInfoData2 = this.LLILLJJLI;
            if (billInfoData2 == null || C7806033c.LJJ(billInfoData2)) {
                C1750960vfK c1750960vfK = C1750960vfK.LIZ;
                this.LL = 1;
                obj = c1750960vfK.LIZLLL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MiniOspViewModel@8f4.checkAndUpdateBillInfoData$1$4");
                    return objLJFF;
                }
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MiniOspViewModel@8f4.checkAndUpdateBillInfoData$1$4");
            return unit2;
        }
        if (((Boolean) obj).booleanValue()) {
            MiniOspViewModel miniOspViewModel2 = this.LLILLL;
            if (!miniOspViewModel2.LLLLII) {
                miniOspViewModel2.LLLLII = true;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    if (iECommerceHostService != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name2 = IApplicationDependencyService.class.getName();
                    if (iECommerceHostService != null) {
                        name = iECommerceHostService.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
                if (rootPageMonitor != null && (top = rootPageMonitor.getTop()) != null && (context = top.LIZ) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                    C1750960vfK c1750960vfK2 = C1750960vfK.LIZ;
                    this.LL = 2;
                    if (c1750960vfK2.LJFF(activityLIZ, this) == objLJFF) {
                        C1C7U.LIZIZ("MiniOspViewModel@8f4.checkAndUpdateBillInfoData$1$4");
                        return objLJFF;
                    }
                }
            }
        }
        billInfoData = this.LLILLJJLI;
        if (billInfoData != null) {
            MiniOspViewModel miniOspViewModel3 = this.LLILLL;
            miniOspViewModel3.LLJJIJIIJIL = "query_bill_info";
            miniOspViewModel3.iR2(1);
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("MiniOspViewModel@8f4.checkAndUpdateBillInfoData$1$4");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
