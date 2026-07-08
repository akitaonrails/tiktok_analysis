package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpViewModel;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.sku.SkuBottomSheetFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0D5i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.sku.SkuBottomSheetFragment$observeViewModel$1$1$2$1", f = "SkuBottomSheetFragment.kt", l = {}, m = "invokeSuspend")
public final class C333440D5i extends C09AX implements Function2<C0D40, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SkuBottomSheetFragment LLILLJJLI;
    public final /* synthetic */ PdpViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333440D5i(PdpViewModel pdpViewModel, SkuBottomSheetFragment skuBottomSheetFragment, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = skuBottomSheetFragment;
        this.LLILLL = pdpViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C333440D5i c333440D5i = new C333440D5i(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
        c333440D5i.LL = obj;
        return c333440D5i;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkuBottomSheetFragment@770d.observeViewModel$1$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0D40 c0d40 = (C0D40) this.LL;
        String str = c0d40.LIZ;
        if (str != null && (!a0.LJJJIL(str))) {
            this.LLILLL.LLJ.put("shopify_variant_id", str);
        }
        InterfaceC1023590ck9 interfaceC1023590ck9SR = this.LLILLJJLI.SR();
        if (interfaceC1023590ck9SR != null) {
            interfaceC1023590ck9SR.logAd(C2264961Dl0.LIZ, this.LLILLJJLI.RR(), new AwS583S0100000_4(c0d40, 310));
        }
        InterfaceC1023590ck9 interfaceC1023590ck9SR2 = this.LLILLJJLI.SR();
        if (interfaceC1023590ck9SR2 != null) {
            interfaceC1023590ck9SR2.logAd(C0DEO.LIZ.LJIIIIZZ("sku"), this.LLILLJJLI.RR(), new AwS583S0100000_4(c0d40, 311));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkuBottomSheetFragment@770d.observeViewModel$1$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0D40 c0d40, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0d40, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
