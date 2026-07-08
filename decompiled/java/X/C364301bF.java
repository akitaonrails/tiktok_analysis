package X;

import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01bF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinImageGeckoManager$fetchResource$1", f = "BulletinImageGeckoManager.kt", l = {75, 89}, m = "invokeSuspend")
public final class C364301bF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Function2<Boolean, C1533790q13, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C364301bF(String str, String str2, String str3, Function2<? super Boolean, ? super C1533790q13, Unit> function2, InterfaceC1364105Vn<? super C364301bF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C364301bF(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinImageGeckoManager@3c6e.fetchResource$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BulletinImageGeckoManager@3c6e.fetchResource$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILZIL;
            String str2 = this.LLILZLL;
            String str3 = this.LLIZ;
            this.LL = str;
            this.LLILLJJLI = str2;
            this.LLILLL = str3;
            this.LLILZ = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            Forest forest = (Forest) C364401bG.LIZ.getValue();
            RequestParams requestParams = new RequestParams(null, 1, null);
            requestParams.channel = str2;
            requestParams.bundle = str3;
            requestParams.waitGeckoUpdate = true;
            requestParams.enableRequestReuse = true;
            requestParams.enableMemoryCache = true;
            forest.fetchResourceAsync(str, requestParams, new C5183020f(c23260099m, 255));
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinImageGeckoManager@3c6e.fetchResource$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C364201bE c364201bE = new C364201bE((C1533790q13) obj, this.LLIZLLLIL, null);
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c364201bE) == objLJFF) {
            C1C7U.LIZIZ("BulletinImageGeckoManager@3c6e.fetchResource$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BulletinImageGeckoManager@3c6e.fetchResource$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
