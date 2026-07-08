package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CXj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.amazon.AmazonLoginHandler$collectLoginEvent$$inlined$collect$1$2$2", f = "AmazonLoginHandler.kt", l = {135}, m = "invokeSuspend")
public final class C315250CXj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0DHD LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315250CXj(Object obj, InterfaceC1364105Vn interfaceC1364105Vn, C0DHD c0dhd, long j, String str, String str2, int i) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = obj;
        this.LLILLL = c0dhd;
        this.LLILZ = j;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315250CXj(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AmazonLoginHandler@ccef.collectLoginEvent$$inlined$collect$1$2$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i == 1) {
                        C155000ia.LIZIZ(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    Object obj2 = this.LLILLJJLI;
                    System.currentTimeMillis();
                    C0CY1 c0cy1 = (C0CY1) obj2;
                    C1DFH c1dfh = C0PEM.LIZ;
                    AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                    C0CZR c0czr = new C0CZR(this.LLILLL, this.LLILZ, c0cy1, this.LLILZIL, this.LLILZLL, this.LLIZ, null);
                    this.LL = 1;
                    if (C23250099c.LJI(this, abstractC2238408pq, c0czr) == objLJFF) {
                        C1C7U.LIZIZ("AmazonLoginHandler@ccef.collectLoginEvent$$inlined$collect$1$2$2");
                        return objLJFF;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LLILLL.LJFF();
            System.currentTimeMillis();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AmazonLoginHandler@ccef.collectLoginEvent$$inlined$collect$1$2$2");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.LJFF();
            throw th;
        }
    }
}
