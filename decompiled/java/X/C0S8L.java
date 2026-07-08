package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S8L, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl$makePaywallNetworkCallVhs$3$1$1$1$1", f = "PaidContentVideoHotSwapServiceImpl.kt", l = {476}, m = "invokeSuspend")
public final class C0S8L extends C09AX implements Function2<Object, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0S8A<Object> LLILLL;
    public final /* synthetic */ List<C0S8A<Object>> LLILZ;
    public final /* synthetic */ C0S8H LLILZIL;
    public final /* synthetic */ PaidContentVideoHotSwapServiceImpl LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Aweme LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S8L(C0S8A<Object> c0s8a, List<C0S8A<Object>> list, C0S8H c0s8h, PaidContentVideoHotSwapServiceImpl paidContentVideoHotSwapServiceImpl, String str, String str2, String str3, Aweme aweme, InterfaceC1364105Vn<? super C0S8L> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0s8a;
        this.LLILZ = list;
        this.LLILZIL = c0s8h;
        this.LLILZLL = paidContentVideoHotSwapServiceImpl;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = str3;
        this.LLJI = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0S8L c0s8l = new C0S8L(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c0s8l.LLILLJJLI = obj;
        return c0s8l;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaidContentVideoHotSwapServiceImpl@1955.makePaywallNetworkCallVhs$3$1$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILLJJLI;
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C0S8I c0s8i = new C0S8I(obj2, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c0s8i) == objLJFF) {
                C1C7U.LIZIZ("PaidContentVideoHotSwapServiceImpl@1955.makePaywallNetworkCallVhs$3$1$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaidContentVideoHotSwapServiceImpl@1955.makePaywallNetworkCallVhs$3$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(obj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
