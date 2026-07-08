package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.SeaUserRightViewHolderV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03oS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.SeaUserRightViewHolderV2$onClick$1", f = "SeaUserRightViewHolderV2.kt", l = {250}, m = "invokeSuspend")
public final class C955803oS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SeaUserRightViewHolderV2 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C955803oS(SeaUserRightViewHolderV2 seaUserRightViewHolderV2, String str, String str2, InterfaceC1364105Vn<? super C955803oS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = seaUserRightViewHolderV2;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C955803oS c955803oS = new C955803oS(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c955803oS.LLILLJJLI = obj;
        return c955803oS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        HashMap<String, Object> mapLJIIJ;
        Object objRS2 = obj;
        C1C7U.LIZ("SeaUserRightViewHolderV2@5810.onClick$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objRS2);
            } else {
                C155000ia.LIZIZ(objRS2);
                SeaUserRightViewHolderV2 seaUserRightViewHolderV2 = this.LLILLL;
                String str = this.LLILZ;
                String str2 = this.LLILZIL;
                C1054104Ah c1054104Ah = ((SeaPdpViewModel) seaUserRightViewHolderV2.LLJJJ.getValue()).LLJLIL;
                if (c1054104Ah != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (C770702zh.LIZIZ(str2) && (mapLJIIJ = C1741890vQh.LJIIJ(str2)) != null) {
                        linkedHashMap.putAll(mapLJIIJ);
                    }
                    C1054104Ah.LJJII(c1054104Ah, "user_rights", null, null, null, linkedHashMap, null, null, null, null, 494);
                }
                IPageNodeMonitorService iPageNodeMonitorService = (IPageNodeMonitorService) PluggableExtentionKt.pluggableSpi$default(IPageNodeMonitorService.class, false, false, false, 14, null);
                if (iPageNodeMonitorService != null) {
                    iPageNodeMonitorService.LJIIIZ("rights_service");
                }
                String strC6 = seaUserRightViewHolderV2.c6(str);
                SeaPdpViewModel seaPdpViewModel = (SeaPdpViewModel) seaUserRightViewHolderV2.LLJJJ.getValue();
                C955903oT c955903oT = new C955903oT(seaUserRightViewHolderV2, strC6, null);
                this.LL = 1;
                objRS2 = seaPdpViewModel.rS2(this, c955903oT, false);
                if (objRS2 == objLJFF) {
                    C1C7U.LIZIZ("SeaUserRightViewHolderV2@5810.onClick$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl((Unit) objRS2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaUserRightViewHolderV2@5810.onClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
