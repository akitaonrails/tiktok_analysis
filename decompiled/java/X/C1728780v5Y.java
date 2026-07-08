package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v5Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.utils.BillboardImageEffectHelper$cancelEffect$2", f = "BillboardImageEffectHelper.kt", l = {}, m = "invokeSuspend")
public final class C1728780v5Y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1728760v5W LL;
    public final /* synthetic */ EffectRootData LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728780v5Y(C1728760v5W c1728760v5W, EffectRootData effectRootData, InterfaceC1364105Vn<? super C1728780v5Y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1728760v5W;
        this.LLILLJJLI = effectRootData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728780v5Y(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("BillboardImageEffectHelper@3558.cancelEffect$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EffectRootData effectRootData = this.LLILLJJLI;
        if (effectRootData != null) {
            str = effectRootData.authorId;
        } else {
            str = null;
        }
        C1728830v5d.LLJLILLLLZIIL(null, str);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BillboardImageEffectHelper@3558.cancelEffect$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
