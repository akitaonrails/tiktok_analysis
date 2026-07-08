package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Uu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editeffect.ui.EditEffectPageView$fetchFavoriteCategoryData$1", f = "EditEffectPageView.kt", l = {1269}, m = "invokeSuspend")
public final class C2381409Uu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C113E LLILLL;
    public final /* synthetic */ Function2<List<? extends Effect>, Integer, Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2381409Uu(C113E c113e, Function2<? super List<? extends Effect>, ? super Integer, Unit> function2, Function0<Unit> function0, InterfaceC1364105Vn<? super C2381409Uu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c113e;
        this.LLILZ = function2;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2381409Uu c2381409Uu = new C2381409Uu(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c2381409Uu.LLILLJJLI = obj;
        return c2381409Uu;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objSS0;
        C1C7U.LIZ("EditEffectPageView@b66d.fetchFavoriteCategoryData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objSS0 = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILLJJLI;
            InterfaceC361290EEl interfaceC361290EEl = this.LLILLL.LLJJJJJIL;
            if (interfaceC361290EEl != null) {
                this.LLILLJJLI = obj2;
                this.LL = 1;
                objSS0 = interfaceC361290EEl.SS0("editingeffect", false, this);
                if (objSS0 == objLJFF) {
                    C1C7U.LIZIZ("EditEffectPageView@b66d.fetchFavoriteCategoryData$1");
                    return objLJFF;
                }
            }
            this.LLILZIL.invoke();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EditEffectPageView@b66d.fetchFavoriteCategoryData$1");
            return unit;
        }
        C1749280vcc c1749280vcc = null;
        if (!C189200o6.m7isFailureimpl(objSS0) && objSS0 != null) {
            C113E c113e = this.LLILLL;
            Function2<List<? extends Effect>, Integer, Unit> function2 = this.LLILZ;
            C1749280vcc c1749280vcc2 = c113e.LLJJJ;
            if (c1749280vcc2 != null) {
                c1749280vcc = c1749280vcc2;
            }
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
            function2.invoke((List<? extends Effect>) objSS0, C2286608xc.LJ(0));
        } else {
            this.LLILZIL.invoke();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EditEffectPageView@b66d.fetchFavoriteCategoryData$1");
        return unit2;
    }
}
