package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS583S0100000_4;
import njp.a;

/* JADX INFO: renamed from: X.0Cow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoEnterUtil$preloadFirstSugNetwork$1", f = "TakoEnterUtil.kt", l = {524}, m = "invokeSuspend")
public final class C325200Cow extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoEnterParams LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C325200Cow(TakoEnterParams takoEnterParams, InterfaceC1364105Vn<? super C325200Cow> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoEnterParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C325200Cow(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoEnterUtil@4341.preloadFirstSugNetwork$1");
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
            C20235614Fu.LIZ.LIZJ();
            C1863400yag.LIZ.getClass();
            C1863380yae c1863380yae = C1863400yag.LIZLLL;
            if (c1863380yae != null) {
                TakoEnterParams takoEnterParams = this.LLILLJJLI;
                C325210Cox c325210Cox = C325210Cox.LIZ;
                String str = takoEnterParams.processId;
                AwS583S0100000_4 awS583S0100000_4 = new AwS583S0100000_4(takoEnterParams, 251);
                c325210Cox.getClass();
                C325210Cox.LIZJ(str, awS583S0100000_4);
                C324800CoI.LIZ.getClass();
                boolean zLIZ = C324800CoI.LIZ();
                Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("source", takoEnterParams.getSugSource()), new Pair("gid", takoEnterParams.getEnterAwemeId()), new Pair("process_id", takoEnterParams.processId), new Pair("enter_from", takoEnterParams.enterFrom), new Pair("enter_method", takoEnterParams.enterMethod), new Pair("enter_time", String.valueOf(takoEnterParams.enterStartTime)));
                this.LL = 1;
                if (c1863380yae.LJIIIZ(CardStruct.IStatusCode.DEFAULT, zLIZ, true, mapLJIIIIZZ, false, null, this) == objLJFF) {
                    C1C7U.LIZIZ("TakoEnterUtil@4341.preloadFirstSugNetwork$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoEnterUtil@4341.preloadFirstSugNetwork$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
