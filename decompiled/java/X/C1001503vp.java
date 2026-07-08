package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.sku.ISkuManagerAbility;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03vp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel$updateSkuInfo$1", f = "PdpViewModel.kt", l = {2352}, m = "invokeSuspend")
public final class C1001503vp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SkuPanelState LLILLJJLI;
    public final /* synthetic */ PdpViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001503vp(SkuPanelState skuPanelState, PdpViewModel pdpViewModel, InterfaceC1364105Vn<? super C1001503vp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = skuPanelState;
        this.LLILLL = pdpViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1001503vp(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String[] strArr;
        String str;
        String[] strArr2;
        ISkuManagerAbility iSkuManagerAbility;
        Map<String, Object> mapEG1;
        C1C7U.LIZ("PdpViewModel@6cb1.updateSkuInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Pair[] pairArr = new Pair[3];
            SkuPanelState skuPanelState = this.LLILLJJLI;
            Integer num = null;
            if (skuPanelState != null) {
                strArr = skuPanelState.checkedSkuIds;
            } else {
                strArr = null;
            }
            pairArr[0] = new Pair("checked_sku_ids", strArr);
            SkuPanelState skuPanelState2 = this.LLILLJJLI;
            if (skuPanelState2 == null || (str = skuPanelState2.skuId) == null) {
                str = "";
            }
            pairArr[1] = new Pair("sku_id", str);
            SkuPanelState skuPanelState3 = this.LLILLJJLI;
            if (skuPanelState3 != null) {
                num = skuPanelState3.productQuantity;
            }
            pairArr[2] = new Pair("quantity", num);
            Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            SkuPanelState skuPanelState4 = this.LLILLJJLI;
            PdpViewModel pdpViewModel = this.LLILLL;
            if (skuPanelState4 != null && (strArr2 = skuPanelState4.checkedSkuIds) != null && (iSkuManagerAbility = pdpViewModel.f) != null && (mapEG1 = iSkuManagerAbility.eG1(strArr2)) != null) {
                mapLJIIJ.putAll(mapEG1);
            }
            C0NJ1 c0nj1 = this.LLILLL.LLIZ;
            this.LL = 1;
            if (c0nj1.LJFF(mapLJIIJ, this) == objLJFF) {
                C1C7U.LIZIZ("PdpViewModel@6cb1.updateSkuInfo$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpViewModel@6cb1.updateSkuInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
