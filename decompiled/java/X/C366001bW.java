package X;

import com.bytedance.forest.model.RequestParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01bW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoGeckoUtil$fetchResource$2", f = "TakoGeckoUtl.kt", l = {41, 59}, m = "invokeSuspend")
public final class C366001bW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1631620sYq LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ InterfaceC1631620sYq<String, RequestParams, Function1<? super C1533790q13, Unit>, C1533910q1F> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ Function2<Boolean, C1533790q13, Unit> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C366001bW(InterfaceC1631620sYq<? super String, ? super RequestParams, ? super Function1<? super C1533790q13, Unit>, C1533910q1F> interfaceC1631620sYq, String str, String str2, String str3, String str4, boolean z, Function2<? super Boolean, ? super C1533790q13, Unit> function2, InterfaceC1364105Vn<? super C366001bW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = interfaceC1631620sYq;
        this.LLIZLLLIL = str;
        this.LLJ = str2;
        this.LLJI = str3;
        this.LLJIJIL = str4;
        this.LLJILJIL = z;
        this.LLJILJILJ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C366001bW(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoGeckoUtil@73b9.fetchResource$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZLL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoGeckoUtil@73b9.fetchResource$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC1631620sYq<String, RequestParams, Function1<? super C1533790q13, Unit>, C1533910q1F> interfaceC1631620sYq = this.LLIZ;
            String str = this.LLIZLLLIL;
            String str2 = this.LLJ;
            String str3 = this.LLJI;
            String str4 = this.LLJIJIL;
            boolean z = this.LLJILJIL;
            this.LL = interfaceC1631620sYq;
            this.LLILLJJLI = str;
            this.LLILLL = str2;
            this.LLILZ = str3;
            this.LLILZIL = str4;
            this.LLILZLL = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            RequestParams requestParams = new RequestParams(null, 1, null);
            requestParams.disableBuiltin = true;
            requestParams.resourceScene = EnumC1533980q1M.OTHER;
            requestParams.enableRequestReuse = true;
            requestParams.enableMemoryCache = true;
            requestParams.enableCDNCache = true;
            requestParams.sessionId = str2;
            requestParams.channel = str3;
            requestParams.bundle = str4;
            requestParams.waitGeckoUpdate = z;
            interfaceC1631620sYq.invoke(str, requestParams, new C5183020f(c23260099m, 203));
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoGeckoUtil@73b9.fetchResource$2");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C366101bX c366101bX = new C366101bX((C1533790q13) obj, this.LLJILJILJ, null);
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c366101bX) == objLJFF) {
            C1C7U.LIZIZ("TakoGeckoUtil@73b9.fetchResource$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoGeckoUtil@73b9.fetchResource$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
