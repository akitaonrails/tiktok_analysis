package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpViewModel;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.sku.SkuBottomSheetFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D5m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.sku.SkuBottomSheetFragment$observeViewModel$1", f = "SkuBottomSheetFragment.kt", l = {302}, m = "invokeSuspend")
public final class C333480D5m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SkuBottomSheetFragment LLILLJJLI;
    public final /* synthetic */ PdpViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333480D5m(PdpViewModel pdpViewModel, SkuBottomSheetFragment skuBottomSheetFragment, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = skuBottomSheetFragment;
        this.LLILLL = pdpViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C333480D5m(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkuBottomSheetFragment@770d.observeViewModel$1");
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
            LifecycleOwner viewLifecycleOwner = this.LLILLJJLI.getViewLifecycleOwner();
            Lifecycle.State state = Lifecycle.State.STARTED;
            C333460D5k c333460D5k = new C333460D5k(this.LLILLL, this.LLILLJJLI, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, c333460D5k, this) == objLJFF) {
                C1C7U.LIZIZ("SkuBottomSheetFragment@770d.observeViewModel$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkuBottomSheetFragment@770d.observeViewModel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
