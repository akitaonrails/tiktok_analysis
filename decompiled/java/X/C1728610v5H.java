package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v5H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.utils.SeaLiveBillboardImageEffectHelper$cancelEffect$2", f = "SeaLiveBillboardImageEffectHelper.kt", l = {}, m = "invokeSuspend")
public final class C1728610v5H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1728650v5L LL;
    public final /* synthetic */ SeaLiveEffectRootData LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728610v5H(C1728650v5L c1728650v5L, SeaLiveEffectRootData seaLiveEffectRootData, InterfaceC1364105Vn<? super C1728610v5H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1728650v5L;
        this.LLILLJJLI = seaLiveEffectRootData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728610v5H(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("SeaLiveBillboardImageEffectHelper@6ebc.cancelEffect$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SeaLiveEffectRootData seaLiveEffectRootData = this.LLILLJJLI;
        if (seaLiveEffectRootData != null) {
            str = seaLiveEffectRootData.authorId;
        } else {
            str = null;
        }
        C1728670v5N.LLJLILLLLZIIL(null, str);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaLiveBillboardImageEffectHelper@6ebc.cancelEffect$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
