package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v5I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.utils.SeaLiveBillboardImageEffectHelper$setEffect$3", f = "SeaLiveBillboardImageEffectHelper.kt", l = {}, m = "invokeSuspend")
public final class C1728620v5I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1728650v5L LL;
    public final /* synthetic */ C1729160v6A LLILLJJLI;
    public final /* synthetic */ SeaLiveEffectRootData LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728620v5I(C1728650v5L c1728650v5L, C1729160v6A c1729160v6A, SeaLiveEffectRootData seaLiveEffectRootData, InterfaceC1364105Vn<? super C1728620v5I> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1728650v5L;
        this.LLILLJJLI = c1729160v6A;
        this.LLILLL = seaLiveEffectRootData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728620v5I(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaLiveBillboardImageEffectHelper@6ebc.setEffect$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1728670v5N.LLJLILLLLZIIL(this.LLILLJJLI, this.LLILLL.authorId);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaLiveBillboardImageEffectHelper@6ebc.setEffect$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
