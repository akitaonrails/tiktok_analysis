package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS6S2100100_27;
import kotlin.jvm.internal.AwS77S1000000_27;
import njp.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wfe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.precheck.subs.action.RequestSubscriptionInfoAction$perform$2$defer2$1", f = "RequestSubscriptionInfoAction.kt", l = {60}, m = "invokeSuspend")
public final class C1789600wfe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C1789750wft>>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1789490wfT LLILZ;
    public final /* synthetic */ C1789610wff LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789600wfe(C1789490wfT c1789490wfT, C1789610wff c1789610wff, InterfaceC1364105Vn<? super C1789600wfe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1789490wfT;
        this.LLILZIL = c1789610wff;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1789600wfe c1789600wfe = new C1789600wfe(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1789600wfe.LLILLL = obj;
        return c1789600wfe;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jCurrentTimeMillis;
        Object c098200Yq;
        Object objLIZJ = obj;
        C1C7U.LIZ("RequestSubscriptionInfoAction@c210.perform$2$defer2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jCurrentTimeMillis = this.LL;
                try {
                    C155000ia.LIZIZ(objLIZJ);
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZJ);
            if (this.LLILZ.LIZIZ.isEmpty()) {
                C1C7U.LIZIZ("RequestSubscriptionInfoAction@c210.perform$2$defer2$1");
                return null;
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            C1789610wff c1789610wff = this.LLILZIL;
            String string = this.LLILZ.LIZIZ.toString();
            InterfaceC1786480wac interfaceC1786480wac = c1789610wff.LIZJ;
            C1789730wfr c1789730wfr = new C1786600wao<C1789740wfs>() { // from class: X.0wfr
                public final boolean equals(Object obj2) {
                    return this == obj2 || (obj2 instanceof C1789730wfr);
                }

                public final int hashCode() {
                    return -421511273;
                }

                public final String toString() {
                    return "Start";
                }

                {
                    new C1789740wfs();
                }
            };
            AwS77S1000000_27 awS77S1000000_27 = new AwS77S1000000_27(string, 0);
            c1789730wfr.getClass();
            interfaceC1786480wac.LIZ(new C1786590wan(c1789730wfr, awS77S1000000_27));
            C1789610wff c1789610wff2 = this.LLILZIL;
            C1789490wfT c1789490wfT = this.LLILZ;
            try {
                InterfaceC1788510wdt interfaceC1788510wdt = c1789610wff2.LIZIZ;
                String str = c1789610wff2.LIZ;
                List<String> list = c1789490wfT.LIZIZ;
                this.LL = jCurrentTimeMillis;
                this.LLILLJJLI = 1;
                objLIZJ = interfaceC1788510wdt.LIZJ(str, list, this);
                if (objLIZJ == objLJFF) {
                    C1C7U.LIZIZ("RequestSubscriptionInfoAction@c210.perform$2$defer2$1");
                    return objLJFF;
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        c098200Yq = (List) objLIZJ;
        C189200o6.m2constructorimpl(c098200Yq);
        C1789610wff c1789610wff3 = this.LLILZIL;
        C1789490wfT c1789490wfT2 = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            List<C1789750wft> list2 = (List) c098200Yq;
            String string2 = c1789490wfT2.LIZIZ.toString();
            c1789610wff3.getClass();
            if (list2 != null) {
                JSONArray jSONArray = new JSONArray();
                for (C1789750wft c1789750wft : list2) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("mid", c1789750wft.LIZJ);
                    jSONObject.put("product_id", c1789750wft.LIZ);
                    jSONObject.put("iap_asset_id", c1789750wft.LIZIZ);
                    jSONObject.put("base_plan_id", c1789750wft.LIZLLL);
                    jSONArray.put(jSONObject);
                }
                String string3 = jSONArray.toString();
                InterfaceC1786480wac interfaceC1786480wac2 = c1789610wff3.LIZJ;
                C1789720wfq c1789720wfq = new C1786600wao<C1789660wfk>() { // from class: X.0wfq
                    public final boolean equals(Object obj2) {
                        return this == obj2 || (obj2 instanceof C1789720wfq);
                    }

                    public final int hashCode() {
                        return -1435087536;
                    }

                    public final String toString() {
                        return "End";
                    }

                    {
                        new C1789660wfk();
                    }
                };
                AwS6S2100100_27 awS6S2100100_27 = new AwS6S2100100_27((Throwable) null, string2, string3, jCurrentTimeMillis, 0);
                c1789720wfq.getClass();
                interfaceC1786480wac2.LIZ(new C1786590wan(c1789720wfq, awS6S2100100_27));
            }
        }
        C1789610wff c1789610wff4 = this.LLILZIL;
        C1789490wfT c1789490wfT3 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            C1C7U.LIZIZ("RequestSubscriptionInfoAction@c210.perform$2$defer2$1");
            return c098200Yq;
        }
        c1789490wfT3.LIZIZ.toString();
        c1789610wff4.getClass();
        throw thM5exceptionOrNullimpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C1789750wft>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
