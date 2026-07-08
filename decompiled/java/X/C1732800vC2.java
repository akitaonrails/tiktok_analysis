package X;

import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IFrameSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vC2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.BaseECBillboardWidget$toggleClearPreviewScreen$1", f = "BaseECBillboardWidget.kt", l = {}, m = "invokeSuspend")
public final class C1732800vC2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1732690vBr LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1732800vC2(AbstractC1732690vBr abstractC1732690vBr, boolean z, InterfaceC1364105Vn<? super C1732800vC2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1732690vBr;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1732800vC2(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MutableLiveData<Boolean> mutableLiveData;
        C1C7U.LIZ("BaseECBillboardWidget@a7b6.toggleClearPreviewScreen$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IFrameSlot.SlotViewModel slotViewModel = this.LL.LLILZLL;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LLILZLL) != null) {
            mutableLiveData.setValue(Boolean.valueOf(this.LLILLJJLI));
        }
        C1733020vCO c1733020vCO = this.LL.LLIZ;
        boolean z = this.LLILLJJLI;
        C1733010vCN c1733010vCN = c1733020vCO.LL;
        if (c1733010vCN != null && c1733010vCN.LL == 0) {
            if (z) {
                ViewGroup viewGroup = c1733010vCN.LLJ;
                if (viewGroup != null) {
                    C03DZ.LIZJ(viewGroup);
                }
            } else {
                ViewGroup viewGroup2 = c1733010vCN.LLJ;
                if (viewGroup2 != null) {
                    C12ES.LJIILL(4, viewGroup2);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseECBillboardWidget@a7b6.toggleClearPreviewScreen$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
