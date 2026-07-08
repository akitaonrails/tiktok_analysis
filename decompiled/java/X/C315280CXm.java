package X;

import com.ss.android.ugc.aweme.amazon.model.AmazonTokenGenerateResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CXm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.amazon.AmazonLoginHandler$refreshToken$1", f = "AmazonLoginHandler.kt", l = {264, 265}, m = "invokeSuspend")
public final class C315280CXm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0DHD LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315280CXm(C0DHD c0dhd, String str, InterfaceC1364105Vn<? super C315280CXm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0dhd;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315280CXm(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AmazonLoginHandler@ccef.refreshToken$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AmazonLoginHandler@ccef.refreshToken$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0DHD c0dhd = this.LLILLJJLI;
            this.LL = 1;
            obj = c0dhd.LIZLLL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AmazonLoginHandler@ccef.refreshToken$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C315290CXn c315290CXn = new C315290CXn(this.LLILLJJLI, (AmazonTokenGenerateResponse) obj, this.LLILLL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c315290CXn) == objLJFF) {
            C1C7U.LIZIZ("AmazonLoginHandler@ccef.refreshToken$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AmazonLoginHandler@ccef.refreshToken$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
