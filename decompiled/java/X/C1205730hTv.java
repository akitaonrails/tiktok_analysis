package X;

import Y.AgS169S0300000_18;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcAISearchViewModel;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS597S0100000_18;
import njp.a;

/* JADX INFO: renamed from: X.0hTv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcAISearchViewModel$performAIChatStreamRequest$1", f = "EcAISearchViewModel.kt", l = {280}, m = "invokeSuspend")
public final class C1205730hTv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C238400w2 LL;
    public int LLILLJJLI;
    public final /* synthetic */ EcAISearchViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function2<C1205700hTs, String, InterfaceC346201Wa<AbstractC1156400gCM<n>>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1205730hTv(EcAISearchViewModel ecAISearchViewModel, String str, Function2<? super C1205700hTs, ? super String, ? extends InterfaceC346201Wa<? extends AbstractC1156400gCM<n>>> function2, InterfaceC1364105Vn<? super C1205730hTv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = ecAISearchViewModel;
        this.LLILZ = str;
        this.LLILZIL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1205730hTv(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C238400w2 c238400w2;
        C1C7U.LIZ("EcAISearchViewModel@cbd8.performAIChatStreamRequest$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    c238400w2 = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                c238400w2 = new C238400w2();
                C013C c013c = new C013C();
                EcAISearchViewModel.yQ2(this.LLILLL, "net_request_start", C2097908Jt.LIZJ(new Pair("task_id", this.LLILZ)), 4);
                C2325381G0q c2325381G0q = new C2325381G0q(C09IC.LJIL(new C2325381G0q(this.LLILZIL.invoke(new C1205700hTs(new AwS597S0100000_18(this.LLILLL, 76)), this.LLILZ), new C1205720hTu(this.LLILLL, null), 2), C0PEM.LIZJ), new C1205740hTw(this.LLILLL, null), 2);
                AgS169S0300000_18 agS169S0300000_18 = new AgS169S0300000_18(c238400w2, c013c, this.LLILLL, 0);
                this.LL = c238400w2;
                this.LLILLJJLI = 1;
                if (c2325381G0q.collect(agS169S0300000_18, this) == objLJFF) {
                    C1C7U.LIZIZ("EcAISearchViewModel@cbd8.performAIChatStreamRequest$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (e instanceof CancellationException) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ViewModel coroutine cancelled: ");
                sbLIZ.append(e.getMessage());
                C2286608xc.LJ(Log.d("EcAISearchViewModel", C2188811AlT.LIZIZ(sbLIZ)));
            } else {
                EcAISearchViewModel ecAISearchViewModel = this.LLILLL;
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("error_code", C2286608xc.LJ(-1));
                String message = e.getMessage();
                String str = "Unknown error";
                if (message == null) {
                    message = "Unknown error";
                }
                pairArr[1] = new Pair("error_msg", message);
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("chunk_count", C2286608xc.LJFF(c238400w2.element)));
                if (ecAISearchViewModel.LLJILJIL) {
                    ecAISearchViewModel.LLJI.postValue(new C1205760hTy("net_request_failure", mapLJIIIIZZ, mapLIZJ, SystemClock.elapsedRealtime()));
                }
                n nVar = new n();
                nVar.LJJIII(C2286608xc.LJ(-1), "status_code");
                String message2 = e.getMessage();
                if (message2 != null) {
                    str = message2;
                }
                nVar.LJJIIJ("data", str);
                this.LLILLL.wQ2(nVar);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcAISearchViewModel@cbd8.performAIChatStreamRequest$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
