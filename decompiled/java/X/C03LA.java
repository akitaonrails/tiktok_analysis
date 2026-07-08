package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.addon.USAddonOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonProductInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03LA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.addon.USAddonOrderCell$handleSelectResult$1$3", f = "USAddonOrderCell.kt", l = {754}, m = "invokeSuspend")
public final class C03LA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ C719102rN LLILZ;
    public final /* synthetic */ USAddonOrderCell LLILZIL;
    public final /* synthetic */ EnumC805503Cr LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Integer LLIZLLLIL;
    public final /* synthetic */ ConcurrentHashMap<String, Object> LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ C752702wn LLJILJIL;
    public final /* synthetic */ boolean LLJILJILJ;
    public final /* synthetic */ List<AddonProductInfo> LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03LA(View view, List<String> list, C719102rN c719102rN, USAddonOrderCell uSAddonOrderCell, EnumC805503Cr enumC805503Cr, String str, Integer num, ConcurrentHashMap<String, Object> concurrentHashMap, String str2, int i, C752702wn c752702wn, boolean z, List<AddonProductInfo> list2, InterfaceC1364105Vn<? super C03LA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = view;
        this.LLILLL = list;
        this.LLILZ = c719102rN;
        this.LLILZIL = uSAddonOrderCell;
        this.LLILZLL = enumC805503Cr;
        this.LLIZ = str;
        this.LLIZLLLIL = num;
        this.LLJ = concurrentHashMap;
        this.LLJI = str2;
        this.LLJIJIL = i;
        this.LLJILJIL = c752702wn;
        this.LLJILJILJ = z;
        this.LLJILLL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03LA(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        int i;
        Object objLJFF = obj;
        C1C7U.LIZ("USAddonOrderCell@fbec.handleSelectResult$1$3");
        Object objLJFF2 = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(objLJFF);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJFF);
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
            SkuPanelStarter.SkuEnterParams skuEnterParams = new SkuPanelStarter.SkuEnterParams(this.LLIZ, true, true, 13, "order_submit", strArr, this.LLIZLLLIL, this.LLJ, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, C2286608xc.LJ(iIntValue), null, C2286608xc.LJ(i), null, null, null, false, null, null, null, false, this.LLJI, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
            InterfaceC1748810vbr interfaceC1748810vbrLIZ = C1748730vbj.LIZ(this.LLILLJJLI);
            this.LL = 1;
            skuPanelStarter.getClass();
            objLJFF = SkuPanelStarter.LJFF(context, skuEnterParams, "order_submit", interfaceC1748810vbrLIZ, this);
            if (objLJFF == objLJFF2) {
                C1C7U.LIZIZ("USAddonOrderCell@fbec.handleSelectResult$1$3");
                return objLJFF2;
            }
        }
        SkuPanelState skuPanelState = (SkuPanelState) objLJFF;
        if (skuPanelState != null && skuPanelState.closeFrom == 3) {
            USAddonOrderCell uSAddonOrderCell = this.LLILZIL;
            uSAddonOrderCell.LLJJIJI = true;
            HashMap<String, Object> map = uSAddonOrderCell.LLJLL;
            if (map != null) {
                map.put("is_fullscreen", C2286608xc.LJ(0));
            } else {
                map = null;
            }
            uSAddonOrderCell.X5("tiktokec_confirm_sku", map, this.LLILZ, C2286608xc.LJ(this.LLJIJIL));
            OrderSubmitAssemViewModel.sT2(this.LLILZIL.T5(), this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLILZ, skuPanelState, null, null, 96);
            this.LLILZIL.W5("select", this.LLILZLL);
            this.LLILZIL.V5("select", this.LLILZLL, this.LLILZ, this.LLJIJIL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("USAddonOrderCell@fbec.handleSelectResult$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
