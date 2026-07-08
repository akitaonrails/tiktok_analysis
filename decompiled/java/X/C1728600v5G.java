package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v5G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.utils.SeaLiveBillboardImageEffectHelper$cancelEffect$result$1", f = "SeaLiveBillboardImageEffectHelper.kt", l = {}, m = "invokeSuspend")
public final class C1728600v5G extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ InterfaceC1728700v5Q LL;
    public final /* synthetic */ LiveEffect LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728600v5G(InterfaceC1728700v5Q interfaceC1728700v5Q, LiveEffect liveEffect, InterfaceC1364105Vn<? super C1728600v5G> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1728700v5Q;
        this.LLILLJJLI = liveEffect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728600v5G(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaLiveBillboardImageEffectHelper@6ebc.cancelEffect$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1728700v5Q interfaceC1728700v5Q = this.LL;
        Boolean boolValueOf = Boolean.valueOf(interfaceC1728700v5Q.LJII(interfaceC1728700v5Q.LIZ(), this.LLILLJJLI, null, null, false, null));
        C1C7U.LIZIZ("SeaLiveBillboardImageEffectHelper@6ebc.cancelEffect$result$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
