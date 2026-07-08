package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchMixApi;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS419S0200000_18;
import njp.a;

/* JADX INFO: renamed from: X.0hTr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.ai.EcAISearchRepo$createAIChatStreamFlow$1", f = "EcAISearchRepo.kt", l = {168, 255}, m = "invokeSuspend")
public final class C1205690hTr extends C09AX implements Function2<C094D<? super AbstractC1156400gCM<? extends n>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public C238400w2 LLILLL;
    public C013C LLILZ;
    public C259800zU LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C1205700hTs LLIZLLLIL;
    public final /* synthetic */ Map<String, String> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1205690hTr(C1205700hTs c1205700hTs, Map<String, String> map, InterfaceC1364105Vn<? super C1205690hTr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = c1205700hTs;
        this.LLJ = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1205690hTr c1205690hTr = new C1205690hTr(this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1205690hTr.LLIZ = obj;
        return c1205690hTr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, X.0hTq] */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, X.0pY4] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final C094D c094d;
        C259800zU c259800zU;
        C259800zU c259800zU2;
        final C238400w2 c238400w2;
        final C013C c013c;
        C259800zU c259800zU3;
        Object objLIZ = obj;
        C1C7U.LIZ("EcAISearchRepo@3a62.createAIChatStreamFlow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZLL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            C155000ia.LIZIZ(objLIZ);
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("EcAISearchRepo@3a62.createAIChatStreamFlow$1");
                            return unit;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c259800zU = this.LLILZIL;
                    c013c = this.LLILZ;
                    c238400w2 = this.LLILLL;
                    c259800zU2 = this.LLILLJJLI;
                    c259800zU3 = this.LL;
                    c094d = (C094D) this.LLIZ;
                    C155000ia.LIZIZ(objLIZ);
                } else {
                    C155000ia.LIZIZ(objLIZ);
                    c094d = (C094D) this.LLIZ;
                    c259800zU = new C259800zU();
                    c259800zU2 = new C259800zU();
                    c238400w2 = new C238400w2();
                    c013c = new C013C();
                    C1205700hTs.LIZ(this.LLIZLLLIL, "net_do_post_start", null, 6);
                    String str = EcSearchMixApi.LIZ;
                    Map<String, String> map = this.LLJ;
                    Map mapLJ = C2097608Jq.LJ();
                    this.LLIZ = c094d;
                    this.LL = c259800zU;
                    this.LLILLJJLI = c259800zU2;
                    this.LLILLL = c238400w2;
                    this.LLILZ = c013c;
                    this.LLILZIL = c259800zU;
                    this.LLILZLL = 1;
                    objLIZ = EcSearchMixApi.LIZ(map, mapLJ, this);
                    if (objLIZ != objLJFF) {
                        c259800zU3 = c259800zU;
                    } else {
                        C1C7U.LIZIZ("EcAISearchRepo@3a62.createAIChatStreamFlow$1");
                        return objLJFF;
                    }
                }
                ?? r1 = (C1515820pY4) objLIZ;
                C1205700hTs.LIZ(this.LLIZLLLIL, "net_do_post_end", null, 6);
                c259800zU.element = r1;
                if (c259800zU3.element == 0) {
                    LIZ(this.LLIZLLLIL, c238400w2, c094d, -3, null, "Stream is null");
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("EcAISearchRepo@3a62.createAIChatStreamFlow$1");
                    return unit2;
                }
                final C1205700hTs c1205700hTs = this.LLIZLLLIL;
                c259800zU2.element = new C0POE<n>() { // from class: X.0hTq
                    @Override // X.C0POE
                    public final void onComplete() {
                        C1205700hTs.LIZ(c1205700hTs, "net_request_complete", C2097908Jt.LIZJ(new Pair("chunk_count_upstream", Long.valueOf(c238400w2.element))), 2);
                        c094d.LJIIIIZZ(C1156390gCL.LIZ);
                        c094d.LJIIJJI(null);
                    }

                    @Override // X.C0POE
                    public final void onFailed(Throwable th) {
                        if (th instanceof CancellationException) {
                            c094d.LJIIJJI(null);
                        } else {
                            C1205690hTr.LIZ(c1205700hTs, c238400w2, c094d, -4, th, "Stream processing failed");
                        }
                    }

                    @Override // X.C0POE
                    public final void onNext(n nVar) {
                        if (nVar != null) {
                            c238400w2.element++;
                            C013C c013c2 = c013c;
                            if (!c013c2.element) {
                                c013c2.element = true;
                                C1205700hTs.LIZ(c1205700hTs, "net_first_chunk_upstream", null, 6);
                            }
                            c094d.LJIIIIZZ(new C1156410gCN(nVar));
                        }
                    }
                };
                try {
                    C1205700hTs.LIZ(c1205700hTs, "net_subscribe_start", null, 6);
                    ((C1515820pY4) c259800zU3.element).LIZLLL((C0POE) c259800zU2.element);
                    C1205700hTs.LIZ(this.LLIZLLLIL, "net_subscribe_end", null, 6);
                    AwS419S0200000_18 awS419S0200000_18 = new AwS419S0200000_18(c259800zU2, (C259800zU<C0POE<n>>) c259800zU3, (C259800zU<C1515820pY4<n>>) 19);
                    this.LLIZ = null;
                    this.LL = null;
                    this.LLILLJJLI = null;
                    this.LLILLL = null;
                    this.LLILZ = null;
                    this.LLILZIL = null;
                    this.LLILZLL = 2;
                    if (C23128094k.LIZ(c094d, awS419S0200000_18, this) == objLJFF) {
                        C1C7U.LIZIZ("EcAISearchRepo@3a62.createAIChatStreamFlow$1");
                        return objLJFF;
                    }
                    Unit unit3 = Unit.LIZ;
                    C1C7U.LIZIZ("EcAISearchRepo@3a62.createAIChatStreamFlow$1");
                    return unit3;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!(th instanceof CancellationException)) {
                        LIZ(this.LLIZLLLIL, c238400w2, c094d, -5, th, "Unknown error");
                        Unit unit4 = Unit.LIZ;
                        C1C7U.LIZIZ("EcAISearchRepo@3a62.createAIChatStreamFlow$1");
                        return unit4;
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    if (!(th instanceof CancellationException)) {
                        LIZ(this.LLIZLLLIL, c238400w2, c094d, -2, th, "Network request failed");
                        Unit unit5 = Unit.LIZ;
                        C1205700hTs.LIZ(this.LLIZLLLIL, "net_do_post_end", null, 6);
                        C1C7U.LIZIZ("EcAISearchRepo@3a62.createAIChatStreamFlow$1");
                        return unit5;
                    }
                    throw th;
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C1205700hTs.LIZ(this.LLIZLLLIL, "net_do_post_end", null, 6);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super AbstractC1156400gCM<? extends n>> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    public static final void LIZ(C1205700hTs c1205700hTs, C238400w2 c238400w2, C094D<? super AbstractC1156400gCM<n>> c094d, int i, Throwable th, String str) {
        String message;
        if (th != null && (message = th.getMessage()) != null) {
            str = message;
        }
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("error_code", Integer.valueOf(i)), new Pair("error_msg", str));
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("chunk_count", Long.valueOf(c238400w2.element)));
        Function1<C1205760hTy, Unit> function1 = c1205700hTs.LIZ;
        if (function1 != null) {
            function1.invoke(new C1205760hTy("net_request_failure", mapLJIIIIZZ, mapLIZJ, SystemClock.elapsedRealtime()));
        }
        C676770Qgd c676770Qgd = new C676770Qgd(str);
        c676770Qgd.LIZIZ = i;
        c094d.LJIIIIZZ(new C1156380gCK(c676770Qgd));
        c094d.LJIIJJI(null);
    }
}
