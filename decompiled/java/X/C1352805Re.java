package X;

import Y.AgS193S0200000_2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Re, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.actionbar.TranslationToggleVM$setUpTranslationStateListenerIfNeeded$1", f = "TranslationToggleVM.kt", l = {47}, m = "invokeSuspend")
public final class C1352805Re extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1352905Rf LLILLJJLI;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1352805Re(C1352905Rf c1352905Rf, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C1352805Re> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1352905Rf;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1352805Re(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TranslationToggleVM@67ea.setUpTranslationStateListenerIfNeeded$1");
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
            C05RH c05rh = new C05RH(C746760TRa.LIZ().LJJJIL());
            AgS193S0200000_2 agS193S0200000_2 = new AgS193S0200000_2(this.LLILLJJLI, this.LLILLL, 20);
            this.LL = 1;
            if (c05rh.collect(agS193S0200000_2, this) == objLJFF) {
                C1C7U.LIZIZ("TranslationToggleVM@67ea.setUpTranslationStateListenerIfNeeded$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TranslationToggleVM@67ea.setUpTranslationStateListenerIfNeeded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
