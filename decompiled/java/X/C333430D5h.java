package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpFragment;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.sku.SkuBottomSheetFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D5h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpFragment$observeViewModel$1$1$2$1", f = "PdpFragment.kt", l = {}, m = "invokeSuspend")
public final class C333430D5h extends C09AX implements Function2<Integer, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ int LL;
    public final /* synthetic */ PdpFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333430D5h(PdpFragment pdpFragment, InterfaceC1364105Vn<? super C333430D5h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pdpFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C333430D5h c333430D5h = new C333430D5h(this.LLILLJJLI, interfaceC1364105Vn);
        c333430D5h.LL = ((Number) obj).intValue();
        return c333430D5h;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        DialogFragment dialogFragment;
        C1C7U.LIZ("PdpFragment@d2f1.observeViewModel$1$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        Fragment fragmentLJJJJZI = this.LLILLJJLI.getParentFragmentManager().LJJJJZI("SkuBottomSheetFragment");
        if ((fragmentLJJJJZI instanceof SkuBottomSheetFragment) && (dialogFragment = (DialogFragment) fragmentLJJJJZI) != null) {
            dialogFragment.dismissAllowingStateLoss();
            str = "sku";
        } else {
            str = "product_detail";
        }
        PdpFragment.iS(this.LLILLJJLI, i, str, null, 4);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpFragment@d2f1.observeViewModel$1$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Integer.valueOf(num.intValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
