package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS393S0200000_27;
import njp.a;

/* JADX INFO: renamed from: X.0wfa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.precheck.subs.action.RequestSubscriptionInfoAction$perform$2$defer1$1", f = "RequestSubscriptionInfoAction.kt", l = {38}, m = "invokeSuspend")
public final class C1789560wfa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1789780wfw>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1789610wff LLILZ;
    public final /* synthetic */ C1789490wfT LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789560wfa(C1789490wfT c1789490wfT, C1789610wff c1789610wff, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1789610wff;
        this.LLILZIL = c1789490wfT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1789560wfa c1789560wfa = new C1789560wfa(this.LLILZIL, this.LLILZ, interfaceC1364105Vn);
        c1789560wfa.LLILLL = obj;
        return c1789560wfa;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jCurrentTimeMillis;
        Throwable th;
        Object c098200Yq;
        Object objLIZ = obj;
        C1C7U.LIZ("RequestSubscriptionInfoAction@c210.perform$2$defer1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jCurrentTimeMillis = this.LL;
                try {
                    C155000ia.LIZIZ(objLIZ);
                } catch (Throwable th2) {
                    th = th2;
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            C1789610wff c1789610wff = this.LLILZ;
            C1789460wfQ c1789460wfQ = this.LLILZIL.LIZ;
            InterfaceC1786480wac interfaceC1786480wac = c1789610wff.LIZJ;
            C1789580wfc c1789580wfc = new C1786600wao<C1789590wfd>() { // from class: X.0wfc
                public final boolean equals(Object obj2) {
                    return this == obj2 || (obj2 instanceof C1789580wfc);
                }

                public final int hashCode() {
                    return 811604170;
                }

                public final String toString() {
                    return "Start";
                }

                {
                    new C1789590wfd();
                }
            };
            AwS393S0200000_27 awS393S0200000_27 = new AwS393S0200000_27(c1789610wff, c1789460wfQ, 6);
            c1789580wfc.getClass();
            interfaceC1786480wac.LIZ(new C1786590wan(c1789580wfc, awS393S0200000_27));
            jCurrentTimeMillis = System.currentTimeMillis();
            C1789610wff c1789610wff2 = this.LLILZ;
            C1789490wfT c1789490wfT = this.LLILZIL;
            try {
                InterfaceC1788510wdt interfaceC1788510wdt = c1789610wff2.LIZIZ;
                C1789460wfQ c1789460wfQ2 = c1789490wfT.LIZ;
                String str = c1789460wfQ2.LIZIZ;
                long j = c1789460wfQ2.LIZ;
                String str2 = c1789460wfQ2.LIZJ;
                long j2 = c1789460wfQ2.LIZLLL;
                this.LL = jCurrentTimeMillis;
                this.LLILLJJLI = 1;
                objLIZ = interfaceC1788510wdt.LIZ(j, j2, str, str2, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("RequestSubscriptionInfoAction@c210.perform$2$defer1$1");
                    return objLJFF;
                }
            } catch (Throwable th3) {
                th = th3;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        c098200Yq = (C1789780wfw) objLIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        C1789610wff c1789610wff3 = this.LLILZ;
        C1789490wfT c1789490wfT2 = this.LLILZIL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            c1789610wff3.LIZJ(c1789490wfT2.LIZ, jCurrentTimeMillis, (C1789780wfw) c098200Yq, null);
        }
        C1789610wff c1789610wff4 = this.LLILZ;
        C1789490wfT c1789490wfT3 = this.LLILZIL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            C1C7U.LIZIZ("RequestSubscriptionInfoAction@c210.perform$2$defer1$1");
            return c098200Yq;
        }
        c1789610wff4.LIZJ(c1789490wfT3.LIZ, jCurrentTimeMillis, null, thM5exceptionOrNullimpl);
        throw thM5exceptionOrNullimpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1789780wfw> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
