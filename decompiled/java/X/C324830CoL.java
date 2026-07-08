package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0CoL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.startup.processor.tako.TakoMultiConversationSugCardProcessor$handleSug$1", f = "TakoMultiConversationSugCardProcessor.kt", l = {109}, m = "invokeSuspend")
public final class C324830CoL extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoEnterParams LLILLJJLI;
    public final /* synthetic */ TakoSug LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324830CoL(TakoEnterParams takoEnterParams, TakoSug takoSug, InterfaceC1364105Vn<? super C324830CoL> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = takoEnterParams;
        this.LLILLL = takoSug;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324830CoL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252331DDr c2252331DDr;
        C1C7U.LIZ("TakoMultiConversationSugCardProcessor@ea21.handleSug$1");
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
            C1863400yag c1863400yag = C1863400yag.LIZ;
            Long lLJFF = C2286608xc.LJFF(this.LLILLJJLI.botInfo.botId);
            Integer numLJ = C2286608xc.LJ(this.LLILLJJLI.botInfo.botSource);
            c1863400yag.getClass();
            C1863380yae c1863380yaeLIZJ = C1863400yag.LIZJ(numLJ, lLJFF);
            if (c1863380yaeLIZJ != null && (c2252331DDr = c1863380yaeLIZJ.LJIJ) != null) {
                TakoSug takoSug = this.LLILLL;
                this.LL = 1;
                if (c2252331DDr.emit(takoSug, this) == objLJFF) {
                    C1C7U.LIZIZ("TakoMultiConversationSugCardProcessor@ea21.handleSug$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoMultiConversationSugCardProcessor@ea21.handleSug$1");
        return unit;
    }
}
