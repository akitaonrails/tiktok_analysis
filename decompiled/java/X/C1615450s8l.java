package X;

import Y.AObserverS81S1200000_24;
import android.content.Context;
import com.bytedance.android.livesdk.iap.IapProductDetail;
import com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionWithPrice;
import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0s8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.components.purchaseoption.PurchaseOptionsListKt$PurchaseOptionCard$price$2$1", f = "PurchaseOptionsList.kt", l = {}, m = "invokeSuspend")
public final class C1615450s8l extends C09AX implements Function2<InterfaceC345960DhK<String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ PurchaseOptionWithPrice LLILLL;
    public final /* synthetic */ C05P0<PurchaseOptionWithPrice> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1615450s8l(String str, PurchaseOptionWithPrice purchaseOptionWithPrice, C05P0<PurchaseOptionWithPrice> c05p0, InterfaceC1364105Vn<? super C1615450s8l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = purchaseOptionWithPrice;
        this.LLILZ = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1615450s8l c1615450s8l = new C1615450s8l(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1615450s8l.LL = obj;
        return c1615450s8l;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PurchaseOptionsListKt@1407.PurchaseOptionCard$price$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC345960DhK interfaceC345960DhK = (InterfaceC345960DhK) this.LL;
        Map<String, IapProductDetail> map = C1617050sBL.LIZ;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        String str = this.LLILLJJLI;
        PurchaseOptionWithPrice purchaseOptionWithPrice = this.LLILLL;
        C1617050sBL.LIZ(contextLIZ, Collections.singletonList(new C1615810s9L(str, purchaseOptionWithPrice.originalPrice, purchaseOptionWithPrice.discountedPrice))).observeForever(new AObserverS81S1200000_24(this.LLILLJJLI, interfaceC345960DhK, this.LLILZ, 1));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PurchaseOptionsListKt@1407.PurchaseOptionCard$price$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC345960DhK<String> interfaceC345960DhK, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC345960DhK, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
