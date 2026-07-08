package X;

import Y.AObserverS129S0300000_24;
import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.ss.android.ugc.aweme.components.purchasebutton.PurchaseButtonParams;
import com.ss.android.ugc.aweme.components.purchaseoption.PricePacket;
import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0s9K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.components.purchasebutton.PurchaseButtonComponentKt$PurchaseButtonComponent$2$buttonDisplayText$2$1", f = "PurchaseButtonComponent.kt", l = {}, m = "invokeSuspend")
public final class C1615800s9K extends C09AX implements Function2<InterfaceC345960DhK<SpannableStringBuilder>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1615420s8i LLILLJJLI;
    public final /* synthetic */ PurchaseButtonParams LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1615800s9K(C1615420s8i c1615420s8i, PurchaseButtonParams purchaseButtonParams, InterfaceC1364105Vn<? super C1615800s9K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1615420s8i;
        this.LLILLL = purchaseButtonParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1615800s9K c1615800s9K = new C1615800s9K(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1615800s9K.LL = obj;
        return c1615800s9K;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        PurchaseButtonParams purchaseButtonParams;
        PricePacket pricePacket;
        C1C7U.LIZ("PurchaseButtonComponentKt@c391.PurchaseButtonComponent$2$buttonDisplayText$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC345960DhK interfaceC345960DhK = (InterfaceC345960DhK) this.LL;
        C1615420s8i c1615420s8i = this.LLILLJJLI;
        if (c1615420s8i != null && (str = c1615420s8i.LIZ) != null && (purchaseButtonParams = this.LLILLL) != null && (pricePacket = purchaseButtonParams.originalPrice) != null) {
            Map<String, IapProductDetail> map = C1617050sBL.LIZ;
            C844470XAv.LIZ.getClass();
            C1617050sBL.LIZ(C844470XAv.LIZ(), Collections.singletonList(new C1615810s9L(str, pricePacket, purchaseButtonParams.discountedPrice))).observeForever(new AObserverS129S0300000_24(c1615420s8i, purchaseButtonParams, interfaceC345960DhK, 2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PurchaseButtonComponentKt@c391.PurchaseButtonComponent$2$buttonDisplayText$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC345960DhK<SpannableStringBuilder> interfaceC345960DhK, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC345960DhK, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
