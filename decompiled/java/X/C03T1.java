package X;

import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.addon.USAddonOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonProductInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03T1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.addon.USAddonOrderCell$handleSelectResult$1$4", f = "USAddonOrderCell.kt", l = {792}, m = "invokeSuspend")
public final class C03T1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ C719102rN LLILZ;
    public final /* synthetic */ USAddonOrderCell LLILZIL;
    public final /* synthetic */ EnumC805503Cr LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ ConcurrentHashMap<String, Object> LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ C752702wn LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ List<AddonProductInfo> LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03T1(View view, List<String> list, C719102rN c719102rN, USAddonOrderCell uSAddonOrderCell, EnumC805503Cr enumC805503Cr, String str, ConcurrentHashMap<String, Object> concurrentHashMap, String str2, C752702wn c752702wn, boolean z, List<AddonProductInfo> list2, int i, InterfaceC1364105Vn<? super C03T1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = view;
        this.LLILLL = list;
        this.LLILZ = c719102rN;
        this.LLILZIL = uSAddonOrderCell;
        this.LLILZLL = enumC805503Cr;
        this.LLIZ = str;
        this.LLIZLLLIL = concurrentHashMap;
        this.LLJ = str2;
        this.LLJI = c752702wn;
        this.LLJIJIL = z;
        this.LLJILJIL = list2;
        this.LLJILJILJ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03T1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        int i;
        Object objLIZ = obj;
        C1C7U.LIZ("USAddonOrderCell@fbec.handleSelectResult$1$4");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            SkuPanelStarter skuPanelStarter = SkuPanelStarter.LIZ;
            Context context = this.LLILLJJLI.getContext();
            String[] strArr = (String[]) this.LLILLL.toArray(new String[0]);
            Integer num = this.LLILZ.LLJLIL;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (this.LLILZIL.LLJJJJJIL && this.LLILZLL != EnumC805503Cr.BUTTON) {
                i = 1;
            } else {
                i = 0;
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams = new SkuPanelStarter.SkuEnterParams(this.LLIZ, true, true, 13, "order_submit", strArr, null, this.LLIZLLLIL, null, null, null, null, null, null, null, null, null, null, null, null, null, null, C2286608xc.LJ(1), C2286608xc.LJ(iIntValue), null, C2286608xc.LJ(i), null, null, null, false, null, null, null, false, this.LLJ, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
            InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(this.LLILLJJLI);
            String strValueOf = String.valueOf(this.LLILLJJLI.hashCode());
            ProductPackStruct productPackStruct = new ProductPackStruct(null, null, null, null, null, null, null, null, null, new SkcInfo("add_on", null, null, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
            this.LL = 1;
            skuPanelStarter.getClass();
            objLIZ = null;
            if (skuEnterParams.productId != null) {
                C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                SkuPanelStarter.LIZIZ = c23260099m;
                Map mapLIZLLL = SkuPanelStarter.LIZLLL(skuEnterParams, "order_submit", skuEnterParams.trackParams);
                mapLIZLLL.put("is_add_to_cart", 0);
                mapLIZLLL.put("is_from_pdp", 1);
                mapLIZLLL.put("page_hash", strValueOf);
                mapLIZLLL.put("sku_type", Integer.valueOf(C03T3.SKC.getValue()));
                mapLIZLLL.put("adjust_minipdp", 1);
                if (productPackStruct.LJII()) {
                    SmartRoute smartRouteLIZIZ = C919503ib.LIZIZ(context, "aweme://ec/sku", mapLIZLLL, false);
                    if (interfaceC1748810vbrLIZ != null) {
                        C960603pE.LJIIIIZZ(smartRouteLIZIZ, interfaceC1748810vbrLIZ);
                    }
                    smartRouteLIZIZ.open();
                }
                objLIZ = c23260099m.LIZ();
                if (objLIZ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("USAddonOrderCell@fbec.handleSelectResult$1$4");
                return objLJFF;
            }
        }
        SkuPanelState skuPanelState = (SkuPanelState) objLIZ;
        if (skuPanelState != null && skuPanelState.closeFrom == 3) {
            USAddonOrderCell uSAddonOrderCell = this.LLILZIL;
            uSAddonOrderCell.LLJJIJI = true;
            OrderSubmitAssemViewModel.sT2(uSAddonOrderCell.T5(), this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLILZ, skuPanelState, null, null, 96);
            this.LLILZIL.W5("select", this.LLILZLL);
            this.LLILZIL.V5("select", this.LLILZLL, this.LLILZ, this.LLJILJILJ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("USAddonOrderCell@fbec.handleSelectResult$1$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
