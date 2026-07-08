package X;

import com.bytedance.forest.model.RequestParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.01bR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nimblecard.tako.handler.GeckoHandler$fetchResource$2", f = "GeckoHandler.kt", l = {202, 241}, m = "invokeSuspend")
public final class C365501bR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1631620sYq LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Function2<Boolean, C1533790q13, Unit> LLJ;
    public final /* synthetic */ InterfaceC1631620sYq<String, RequestParams, Function1<? super C1533790q13, Unit>, C1533910q1F> LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ AtomicBoolean LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C365501bR(String str, Function2<? super Boolean, ? super C1533790q13, Unit> function2, InterfaceC1631620sYq<? super String, ? super RequestParams, ? super Function1<? super C1533790q13, Unit>, C1533910q1F> interfaceC1631620sYq, String str2, String str3, String str4, AtomicBoolean atomicBoolean, InterfaceC1364105Vn<? super C365501bR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = str;
        this.LLJ = function2;
        this.LLJI = interfaceC1631620sYq;
        this.LLJIJIL = str2;
        this.LLJILJIL = str3;
        this.LLJILJILJ = str4;
        this.LLJILLL = atomicBoolean;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C365501bR(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        boolean zLJJIIZI;
        Object objLIZ = obj;
        C1C7U.LIZ("GeckoHandler@3f03.fetchResource$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLIZ;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ExecutorService executorService = C1909880zne.LIZ;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            C1909880zne.LIZJ("", null, message, 26);
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZ);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("GeckoHandler@3f03.fetchResource$2");
                return unit;
            }
            C155000ia.LIZIZ(objLIZ);
        } else {
            C155000ia.LIZIZ(objLIZ);
            InterfaceC1631620sYq<String, RequestParams, Function1<? super C1533790q13, Unit>, C1533910q1F> interfaceC1631620sYq = this.LLJI;
            String str = this.LLJIJIL;
            String str2 = this.LLJILJIL;
            String str3 = this.LLJILJILJ;
            String str4 = this.LLIZLLLIL;
            AtomicBoolean atomicBoolean = this.LLJILLL;
            this.LL = interfaceC1631620sYq;
            this.LLILLJJLI = str;
            this.LLILLL = str2;
            this.LLILZ = str3;
            this.LLILZIL = str4;
            this.LLILZLL = atomicBoolean;
            this.LLIZ = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            try {
                RequestParams requestParams = new RequestParams(null, 1, null);
                requestParams.resourceScene = EnumC1533980q1M.OTHER;
                requestParams.enableRequestReuse = true;
                requestParams.enableMemoryCache = true;
                requestParams.enableCDNCache = true;
                requestParams.sessionId = str2;
                requestParams.channel = str3;
                requestParams.bundle = str4;
                requestParams.geckoUrlRedirect = true;
                interfaceC1631620sYq.invoke(str, requestParams, new C020W(atomicBoolean, c23260099m, 47));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C189200o6.m2constructorimpl(null);
                c23260099m.resumeWith(null);
                ExecutorService executorService2 = C1909880zne.LIZ;
                String message2 = e2.getMessage();
                if (message2 == null) {
                    message2 = "";
                }
                C1909880zne.LIZJ("", null, message2, 26);
            }
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("GeckoHandler@3f03.fetchResource$2");
                return objLJFF;
            }
        }
        C1533790q13 c1533790q13 = (C1533790q13) objLIZ;
        if (c1533790q13 == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("GeckoHandler@3f03.fetchResource$2");
            return unit2;
        }
        if (((Number) C365601bS.LIZ.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str5 = this.LLIZLLLIL;
            if (((Boolean) C365701bT.LIZ.getValue()).booleanValue()) {
                zLJJIIZI = a0.LJJIIZI(str5, "top1_markdown", false);
            } else {
                zLJJIIZI = false;
            }
            if (!zLJJIIZI) {
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C365401bQ c365401bQ = new C365401bQ(c1533790q13, this.LLJ, null);
                this.LL = null;
                this.LLILLJJLI = null;
                this.LLILLL = null;
                this.LLILZ = null;
                this.LLILZIL = null;
                this.LLILZLL = null;
                this.LLIZ = 2;
                objLIZ = C23250099c.LJI(this, abstractC2238408pq, c365401bQ);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("GeckoHandler@3f03.fetchResource$2");
                    return objLJFF;
                }
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("GeckoHandler@3f03.fetchResource$2");
                return unit3;
            }
        }
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            Function2<Boolean, C1533790q13, Unit> function2 = this.LLJ;
            if (function2 != null) {
                function2.invoke(true, c1533790q13);
            }
        } else {
            Function2<Boolean, C1533790q13, Unit> function22 = this.LLJ;
            if (function22 != null) {
                function22.invoke(false, c1533790q13);
            }
        }
        Unit unit32 = Unit.LIZ;
        C1C7U.LIZIZ("GeckoHandler@3f03.fetchResource$2");
        return unit32;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
