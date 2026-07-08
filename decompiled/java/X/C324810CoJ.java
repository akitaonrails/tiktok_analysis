package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS23S0000100_4;
import njp.a;

/* JADX INFO: renamed from: X.0CoJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.TakoServiceImpl$processSchemaFromInbox$1", f = "TakoServiceImpl.kt", l = {1860}, m = "invokeSuspend")
public final class C324810CoJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324810CoJ(long j, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324810CoJ(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoServiceImpl@d56d.processSchemaFromInbox$1");
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
            C1863400yag.LIZ.getClass();
            C1863380yae c1863380yae = C1863400yag.LIZLLL;
            if (c1863380yae != null) {
                String str = this.LLILLJJLI;
                long j = this.LLILLL;
                C325210Cox c325210Cox = C325210Cox.LIZ;
                AwS23S0000100_4 awS23S0000100_4 = new AwS23S0000100_4(j, 2);
                c325210Cox.getClass();
                C325210Cox.LIZJ(str, awS23S0000100_4);
                C324800CoI.LIZ.getClass();
                boolean zLIZ = C324800CoI.LIZ();
                Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("source", "session_list_chat_sug"), new Pair("enter_time", String.valueOf(j)), new Pair("enter_from", "notification_page_tikbot"), new Pair("enter_method", "click_tikbot_cell"), new Pair("process_id", str));
                this.LL = 1;
                if (c1863380yae.LJIIIZ(CardStruct.IStatusCode.DEFAULT, zLIZ, true, mapLJIIIIZZ, false, null, this) == objLJFF) {
                    C1C7U.LIZIZ("TakoServiceImpl@d56d.processSchemaFromInbox$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoServiceImpl@d56d.processSchemaFromInbox$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
