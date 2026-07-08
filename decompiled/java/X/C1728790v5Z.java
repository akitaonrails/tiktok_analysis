package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v5Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.utils.BillboardImageEffectHelper$setEffect$3", f = "BillboardImageEffectHelper.kt", l = {}, m = "invokeSuspend")
public final class C1728790v5Z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1728760v5W LL;
    public final /* synthetic */ C1729210v6F LLILLJJLI;
    public final /* synthetic */ EffectRootData LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728790v5Z(C1728760v5W c1728760v5W, C1729210v6F c1729210v6F, EffectRootData effectRootData, InterfaceC1364105Vn<? super C1728790v5Z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1728760v5W;
        this.LLILLJJLI = c1729210v6F;
        this.LLILLL = effectRootData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728790v5Z(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BillboardImageEffectHelper@3558.setEffect$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1728830v5d.LLJLILLLLZIIL(this.LLILLJJLI, this.LLILLL.authorId);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BillboardImageEffectHelper@3558.setEffect$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
