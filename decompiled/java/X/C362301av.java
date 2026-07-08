package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor_tool.CategoryEffectsResponse;

/* JADX INFO: renamed from: X.01av, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectManager$fetchCategoryEffectList$2$1$2", f = "LiveEffectManager.kt", l = {}, m = "invokeSuspend")
public final class C362301av extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C470590Icr<CategoryEffectsResponse.Data> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C362301av(String str, C470590Icr<CategoryEffectsResponse.Data> c470590Icr, InterfaceC1364105Vn<? super C362301av> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c470590Icr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C362301av c362301av = new C362301av(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c362301av.LL = obj;
        return c362301av;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEffectManager@e5e4.fetchCategoryEffectList$2$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C23250099c.LIZLLL((InterfaceC497601wk) this.LL, null, null, new C362201au(this.LLILLJJLI, this.LLILLL, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveEffectManager@e5e4.fetchCategoryEffectList$2$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
