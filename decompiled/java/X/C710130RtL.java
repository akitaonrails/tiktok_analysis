package X;

import Y.AgS292S0100000_11;
import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RtL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel$onPrepared$3", f = "TranslationStatusViewModel.kt", l = {131}, m = "invokeSuspend")
public final class C710130RtL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TranslationStatusViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C710130RtL(TranslationStatusViewModel translationStatusViewModel, InterfaceC1364105Vn<? super C710130RtL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = translationStatusViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C710130RtL(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TranslationStatusViewModel@c9c1.onPrepared$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            TranslationStatusViewModel translationStatusViewModel = this.LLILLJJLI;
            C2252321DDq c2252321DDq = translationStatusViewModel.LL.LJJIJIIJI;
            AgS292S0100000_11 agS292S0100000_11 = new AgS292S0100000_11(translationStatusViewModel, 9);
            this.LL = 1;
            if (c2252321DDq.collect(agS292S0100000_11, this) == objLJFF) {
                C1C7U.LIZIZ("TranslationStatusViewModel@c9c1.onPrepared$3");
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
