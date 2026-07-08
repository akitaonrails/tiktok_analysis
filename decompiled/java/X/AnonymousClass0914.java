package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0914, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.pagination.PagingStickerSource$dealCategoricalStickers$1$4", f = "PagingStickerSource.kt", l = {63}, m = "invokeSuspend")
public final class AnonymousClass0914 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C23042091c LLILLJJLI;
    public final /* synthetic */ CategoryEffectModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0914(C23042091c c23042091c, CategoryEffectModel categoryEffectModel, InterfaceC1364105Vn<? super AnonymousClass0914> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c23042091c;
        this.LLILLL = categoryEffectModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0914(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PagingStickerSource@7062.dealCategoricalStickers$1$4");
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
            C23042091c c23042091c = this.LLILLJJLI;
            CategoryEffectModel categoryEffectModel = this.LLILLL;
            this.LL = 1;
            if (c23042091c.LJJIIZ(categoryEffectModel, false, this) == objLJFF) {
                C1C7U.LIZIZ("PagingStickerSource@7062.dealCategoricalStickers$1$4");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PagingStickerSource@7062.dealCategoricalStickers$1$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
