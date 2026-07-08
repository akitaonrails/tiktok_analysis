package X;

import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.translation.viewmodel.BizCompTranslationViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZcN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.translation.viewmodel.BizCompTranslationViewModel$onPrepared$2", f = "BizCompTranslationViewModel.kt", l = {83}, m = "invokeSuspend")
public final class C903450ZcN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BizCompTranslationViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C903450ZcN(BizCompTranslationViewModel bizCompTranslationViewModel, InterfaceC1364105Vn<? super C903450ZcN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bizCompTranslationViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C903450ZcN(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BizCompTranslationViewModel@e8ce.onPrepared$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            BizCompTranslationViewModel bizCompTranslationViewModel = this.LLILLJJLI;
            C2252321DDq c2252321DDq = bizCompTranslationViewModel.LL.LJIJJ;
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(bizCompTranslationViewModel, 27);
            this.LL = 1;
            if (c2252321DDq.collect(agS295S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("BizCompTranslationViewModel@e8ce.onPrepared$2");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
