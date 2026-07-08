package X;

import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import wuk.d0;

/* JADX INFO: renamed from: X.091a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$refreshHorizontalEffectsWhenFilterChange$1$1", f = "DefaultStickerSource.kt", l = {}, m = "invokeSuspend")
public final class C23040091a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1641640sp0<HorizontalEffectsModel> LL;
    public final /* synthetic */ HorizontalEffectsModel LLILLJJLI;
    public final /* synthetic */ d0 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23040091a(C1641640sp0<HorizontalEffectsModel> c1641640sp0, HorizontalEffectsModel horizontalEffectsModel, d0 d0Var, InterfaceC1364105Vn<? super C23040091a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1641640sp0;
        this.LLILLJJLI = horizontalEffectsModel;
        this.LLILLL = d0Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C23040091a(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [M, com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStickerSource@cf79.refreshHorizontalEffectsWhenFilterChange$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ = this.LLILLJJLI;
        this.LLILLL.LJIJJ.getValue().setValue(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStickerSource@cf79.refreshHorizontalEffectsWhenFilterChange$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
