package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xuu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.api.pcs.infra.payment.task.pay.AbsCreateContractTask$doTask$1", f = "AbsCreateContractTask.kt", l = {43}, m = "invokeSuspend")
public final class C1837500xuu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1837530xux<RESPONSE, DATA_GLOBAL> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1837500xuu(AbstractC1837530xux<RESPONSE, DATA_GLOBAL> abstractC1837530xux, InterfaceC1364105Vn<? super C1837500xuu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1837530xux;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1837500xuu(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<String, String> mapLJ;
        final Object obj2;
        C1837830xvR c1837830xvR;
        Map<String, String> mapLJ2;
        C1837830xvR c1837830xvR2;
        C1C7U.LIZ("AbsCreateContractTask@4f23.doTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1DFB c1dfb = C0PEM.LIZJ;
                C1837570xv1 c1837570xv1 = new C1837570xv1(this.LLILLJJLI, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c1837570xv1);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AbsCreateContractTask@4f23.doTask$1");
                    return objLJFF;
                }
            }
            C470590Icr c470590Icr = (C470590Icr) obj;
            if (c470590Icr != null) {
                obj2 = c470590Icr.data;
            } else {
                obj2 = null;
            }
            AbstractC1837530xux<RESPONSE, DATA_GLOBAL>.a aVarLJIIIIZZ = this.LLILLJJLI.LJIIIIZZ((RESPONSE) obj2);
            AbstractC1837530xux<RESPONSE, DATA_GLOBAL> abstractC1837530xux = this.LLILLJJLI;
            C1837680xvC c1837680xvC = abstractC1837530xux.LLILZIL;
            if (c1837680xvC != null && (c1837830xvR2 = c1837680xvC.LJIIIIZZ) != null) {
                ((ConcurrentHashMap) c1837830xvR2.LIZIZ.getValue()).put("contract_id", abstractC1837530xux.LJIIIZ((RESPONSE) obj2));
                if (c470590Icr != null) {
                    str = c470590Icr.LIZIZ;
                }
                if (str == null) {
                    str = "";
                }
                ((ConcurrentHashMap) c1837830xvR2.LIZIZ.getValue()).put("log_id", str);
            }
            if (aVarLJIIIIZZ.LIZ) {
                C1837850xvT c1837850xvT = this.LLILLJJLI.LLILLJJLI;
                if (c1837850xvT != null) {
                    C1837850xvT.LIZ(c1837850xvT, new Object(obj2) { // from class: X.0xvc
                        public final Object LIZ;

                        {
                            this.LIZ = obj2;
                        }
                    });
                }
                C1792750wkj c1792750wkj = new C1792750wkj(this.LLILLJJLI.LJIIJ((RESPONSE) obj2), this.LLILLJJLI.LJIIIZ((RESPONSE) obj2));
                AbstractC1837530xux<RESPONSE, DATA_GLOBAL> abstractC1837530xux2 = this.LLILLJJLI;
                Map<String, String> map = c1792750wkj.LLILLL;
                DATA_GLOBAL data_global = abstractC1837530xux2.LLILZIL;
                if (data_global != 0) {
                    mapLJ2 = data_global.LJIIIZ(abstractC1837530xux2.LL);
                } else {
                    mapLJ2 = C2097608Jq.LJ();
                }
                map.putAll(mapLJ2);
                C1837850xvT c1837850xvT2 = this.LLILLJJLI.LLILLJJLI;
                if (c1837850xvT2 != null) {
                    c1837850xvT2.LIZ.LIZJ(c1792750wkj, false);
                }
            } else {
                AbstractC1837350xuf abstractC1837350xuf = aVarLJIIIIZZ.LIZIZ;
                AbstractC1837530xux<RESPONSE, DATA_GLOBAL> abstractC1837530xux3 = this.LLILLJJLI;
                C1837680xvC c1837680xvC2 = abstractC1837530xux3.LLILZIL;
                if (c1837680xvC2 != null && (c1837830xvR = c1837680xvC2.LJIIIIZZ) != null) {
                    c1837830xvR.LIZ(abstractC1837530xux3.LL, "error_code", String.valueOf(abstractC1837350xuf.getErrorCode()));
                }
                C1837850xvT c1837850xvT3 = this.LLILLJJLI.LLILLJJLI;
                if (c1837850xvT3 != null) {
                    c1837850xvT3.LIZIZ(abstractC1837350xuf);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1837440xuo c1837440xuo = new C1837440xuo(th, null, null);
            Map<String, String> logMap = c1837440xuo.getLogMap();
            AbstractC1837530xux<RESPONSE, DATA_GLOBAL> abstractC1837530xux4 = this.LLILLJJLI;
            DATA_GLOBAL data_global2 = abstractC1837530xux4.LLILZIL;
            if (data_global2 != 0) {
                mapLJ = data_global2.LJIIIZ(abstractC1837530xux4.LL);
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            logMap.putAll(mapLJ);
            logMap.put("error_code", String.valueOf(c1837440xuo.getErrorCode()));
            C1837850xvT c1837850xvT4 = this.LLILLJJLI.LLILLJJLI;
            if (c1837850xvT4 != null) {
                c1837850xvT4.LIZIZ(c1837440xuo);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsCreateContractTask@4f23.doTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
