package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.17wI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.shopbag.ShopBagPreview", f = "ShopBagPreview.kt", l = {119, 150, 180}, m = "fetchShoppingBagPreview")
public final class C21190817wI extends AbstractC23140094w {
    public Object LL;
    public Function1 LLILLJJLI;
    public boolean LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C21190617wG LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21190817wI(C21190617wG c21190617wG, InterfaceC1364105Vn<? super C21190817wI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c21190617wG;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopBagPreview@d7a8.fetchShoppingBagPreview$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZLLLIL.LIZ(null, null, null, false, false, 0L, null, null, null, this);
        C1C7U.LIZIZ("ShopBagPreview@d7a8.fetchShoppingBagPreview$1");
        return objLIZ;
    }
}
