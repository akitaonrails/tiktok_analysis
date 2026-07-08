package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import wuk.d0;

/* JADX INFO: renamed from: X.0916, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$dealCategoricalStickers$2$1$4", f = "DefaultStickerSource.kt", l = {397}, m = "invokeSuspend")
public final class AnonymousClass0916 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CategoryEffectModel LLILLJJLI;
    public final /* synthetic */ d0 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0916(d0 d0Var, CategoryEffectModel categoryEffectModel, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = categoryEffectModel;
        this.LLILLL = d0Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0916(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStickerSource@cf79.dealCategoricalStickers$2$1$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Intrinsics.LJFF(this.LLILLJJLI.getCategoryKey(), this.LLILLL.LJJII);
            d0 d0Var = this.LLILLL;
            CategoryEffectModel categoryEffectModel = this.LLILLJJLI;
            this.LL = 1;
            if (d0Var.LJJIIZ(categoryEffectModel, false, this) == objLJFF) {
                C1C7U.LIZIZ("DefaultStickerSource@cf79.dealCategoricalStickers$2$1$4");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStickerSource@cf79.dealCategoricalStickers$2$1$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
