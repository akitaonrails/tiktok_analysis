package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import wuk.d0;

/* JADX INFO: renamed from: X.091A, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.internals.main.DefaultStickerSource$postCategoryDataUpdate$2$3", f = "DefaultStickerSource.kt", l = {}, m = "invokeSuspend")
public final class C091A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Pair<List<Effect>, Boolean> LL;
    public final /* synthetic */ d0 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ CategoryEffectModel LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C091A(Pair<? extends List<? extends Effect>, Boolean> pair, d0 d0Var, String str, CategoryEffectModel categoryEffectModel, boolean z, InterfaceC1364105Vn<? super C091A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = pair;
        this.LLILLJJLI = d0Var;
        this.LLILLL = str;
        this.LLILZ = categoryEffectModel;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C091A(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStickerSource@cf79.postCategoryDataUpdate$2$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.getSecond().booleanValue()) {
            this.LLILLJJLI.LJJIIJ.getValue().setValue(true);
        }
        this.LLILLJJLI.LJJIII(this.LLILLL).setValue(C1641640sp0.LIZJ(this.LLILZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultStickerSource@cf79.postCategoryDataUpdate$2$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
