package X;

import com.ss.android.ugc.aweme.ecommerce.preload.gecko.settings.EcomGeckoPreloadConfigItem;

/* JADX INFO: renamed from: X.0qPS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.preload.gecko.EcomGeckoPreloader", f = "EcomGeckoPreloader.kt", l = {272, 276}, m = "checkPreloadChannels")
public final class C1548920qPS extends AbstractC23140094w {
    public EcomGeckoPreloadConfigItem LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public C1551950qUL LLILZIL;
    public Object LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C1548910qPR LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1548920qPS(C1548910qPR c1548910qPR, InterfaceC1364105Vn<? super C1548920qPS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c1548910qPR;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcomGeckoPreloader@f894.checkPreloadChannels$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZLLLIL.LIZ(null, null, this);
        C1C7U.LIZIZ("EcomGeckoPreloader@f894.checkPreloadChannels$1");
        return objLIZ;
    }
}
