package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S8M, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl$makePaywallNetworkCallVhs$3$1$1$1", f = "PaidContentVideoHotSwapServiceImpl.kt", l = {475}, m = "invokeSuspend")
public final class C0S8M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05YC<Object> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ C0S8A<Object> LLILZ;
    public final /* synthetic */ List<C0S8A<Object>> LLILZIL;
    public final /* synthetic */ C0S8H LLILZLL;
    public final /* synthetic */ PaidContentVideoHotSwapServiceImpl LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Aweme LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S8M(C05YC<Object> c05yc, Function0<Unit> function0, C0S8A<Object> c0s8a, List<C0S8A<Object>> list, C0S8H c0s8h, PaidContentVideoHotSwapServiceImpl paidContentVideoHotSwapServiceImpl, String str, String str2, String str3, Aweme aweme, InterfaceC1364105Vn<? super C0S8M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05yc;
        this.LLILLL = function0;
        this.LLILZ = c0s8a;
        this.LLILZIL = list;
        this.LLILZLL = c0s8h;
        this.LLIZ = paidContentVideoHotSwapServiceImpl;
        this.LLIZLLLIL = str;
        this.LLJ = str2;
        this.LLJI = str3;
        this.LLJIJIL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0S8M(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaidContentVideoHotSwapServiceImpl@1955.makePaywallNetworkCallVhs$3$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C20099713kh c20099713khLJJIJL = C09IC.LJJIJL(this.LLILLJJLI, 1);
                C0S8L c0s8l = new C0S8L(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, null);
                this.LL = 1;
                if (C09IC.LJII(c20099713khLJJIJL, this, c0s8l) == objLJFF) {
                    C1C7U.LIZIZ("PaidContentVideoHotSwapServiceImpl@1955.makePaywallNetworkCallVhs$3$1$1$1");
                    return objLJFF;
                }
            }
            this.LLILLL.invoke();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PaidContentVideoHotSwapServiceImpl@1955.makePaywallNetworkCallVhs$3$1$1$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.invoke();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
