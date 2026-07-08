package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpViewModel;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.sku.SkuBottomSheetFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D5k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.sku.SkuBottomSheetFragment$observeViewModel$1$1", f = "SkuBottomSheetFragment.kt", l = {}, m = "invokeSuspend")
public final class C333460D5k extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PdpViewModel LLILLJJLI;
    public final /* synthetic */ SkuBottomSheetFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333460D5k(PdpViewModel pdpViewModel, SkuBottomSheetFragment skuBottomSheetFragment, InterfaceC1364105Vn<? super C333460D5k> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pdpViewModel;
        this.LLILLL = skuBottomSheetFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C333460D5k c333460D5k = new C333460D5k(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c333460D5k.LL = obj;
        return c333460D5k;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkuBottomSheetFragment@770d.observeViewModel$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C333470D5l(this.LLILLJJLI, this.LLILLL, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C333450D5j(this.LLILLJJLI, this.LLILLL, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkuBottomSheetFragment@770d.observeViewModel$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
