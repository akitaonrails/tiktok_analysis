package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IFrameSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ndc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.billboard.BaseSeaLiveBillboardWidget$toggleClearPreviewScreen$1", f = "BaseSeaLiveBillboardWidget.kt", l = {}, m = "invokeSuspend")
public final class C598460Ndc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1732680vBq LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598460Ndc(AbstractC1732680vBq abstractC1732680vBq, boolean z, InterfaceC1364105Vn<? super C598460Ndc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1732680vBq;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C598460Ndc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MutableLiveData<Boolean> mutableLiveData;
        C1C7U.LIZ("BaseSeaLiveBillboardWidget@4f6b.toggleClearPreviewScreen$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IFrameSlot.SlotViewModel slotViewModel = this.LL.LLILZLL;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LLILZLL) != null) {
            mutableLiveData.setValue(Boolean.valueOf(this.LLILLJJLI));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseSeaLiveBillboardWidget@4f6b.toggleClearPreviewScreen$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
