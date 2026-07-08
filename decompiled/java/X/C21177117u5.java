package X;

import android.util.Pair;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdk.model.message.DelayParam;
import com.bytedance.android.livesdk.model.message.DispersionInfo;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.Product;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.vo.PopupCardVO;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.17u5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.AbsECLiveExplanationCardWidget$getIntroduceProductResponseV2$2$onResponse$2$1$2", f = "AbsECLiveExplanationCardWidget.kt", l = {2132}, m = "invokeSuspend")
public final class C21177117u5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DispersionInfo LLILLJJLI;
    public final /* synthetic */ AbstractC21194217wq LLILLL;
    public final /* synthetic */ PopProductResp LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ ECommerceMessage LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ Integer LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21177117u5(DispersionInfo dispersionInfo, AbstractC21194217wq abstractC21194217wq, PopProductResp popProductResp, String str, long j, boolean z, ECommerceMessage eCommerceMessage, boolean z2, Integer num, InterfaceC1364105Vn<? super C21177117u5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dispersionInfo;
        this.LLILLL = abstractC21194217wq;
        this.LLILZ = popProductResp;
        this.LLILZIL = str;
        this.LLILZLL = j;
        this.LLIZ = z;
        this.LLIZLLLIL = eCommerceMessage;
        this.LLJ = z2;
        this.LLJI = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21177117u5(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLIZIZ;
        DelayParam delayParam;
        MutableLiveData<Pair<Boolean, String>> mutableLiveData;
        Pair<Boolean, String> value;
        PopupCardVO popupCardVO;
        String string;
        C1C7U.LIZ("AbsECLiveExplanationCardWidget@7dc4.getIntroduceProductResponseV2$2$onResponse$2$1$2");
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
            DispersionInfo dispersionInfo = this.LLILLJJLI;
            if (dispersionInfo != null && (delayParam = dispersionInfo.delayParam) != null) {
                jLIZIZ = C598400NdW.LIZIZ(delayParam);
            } else {
                jLIZIZ = 0;
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLIZIZ, this) == objLJFF) {
                C1C7U.LIZIZ("AbsECLiveExplanationCardWidget@7dc4.getIntroduceProductResponseV2$2$onResponse$2$1$2");
                return objLJFF;
            }
        }
        IFrameSlot.SlotViewModel slotViewModel = this.LLILLL.LLJIJIL;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LL) != null && (value = mutableLiveData.getValue()) != null && Intrinsics.LJFF(value.first, true) && (popupCardVO = this.LLILLL.LJJIJIIJI().LL) != null && popupCardVO.cardType == this.LLILZ.cardType) {
            PopupCardVO popupCardVO2 = this.LLILLL.LJJIJIIJI().LL;
            String str = null;
            if (popupCardVO2 != null) {
                string = C2286608xc.LJFF(popupCardVO2.productId).toString();
            } else {
                string = null;
            }
            Product product = this.LLILZ.product;
            if (product != null) {
                str = product.productId;
            }
            if (Intrinsics.LJFF(string, str)) {
                this.LLILLL.LJJIJIIJIL(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, true);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsECLiveExplanationCardWidget@7dc4.getIntroduceProductResponseV2$2$onResponse$2$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
