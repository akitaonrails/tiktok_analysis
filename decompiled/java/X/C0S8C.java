package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS121S1000000_4;
import njp.a;

/* JADX INFO: renamed from: X.0S8C, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl$maybeQueueEligibleAwemesForFullFetchVhs$1$2", f = "PaidContentVideoHotSwapServiceImpl.kt", l = {151}, m = "invokeSuspend")
public final class C0S8C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PaidContentVideoHotSwapServiceImpl LLILLJJLI;
    public final /* synthetic */ List<C0S81> LLILLL;
    public final /* synthetic */ C0S8O LLILZ;
    public final /* synthetic */ LifecycleCoroutineScope LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S8C(PaidContentVideoHotSwapServiceImpl paidContentVideoHotSwapServiceImpl, List<C0S81> list, C0S8O c0s8o, LifecycleCoroutineScope lifecycleCoroutineScope, String str, InterfaceC1364105Vn<? super C0S8C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = paidContentVideoHotSwapServiceImpl;
        this.LLILLL = list;
        this.LLILZ = c0s8o;
        this.LLILZIL = lifecycleCoroutineScope;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0S8C(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI;
        C1C7U.LIZ("PaidContentVideoHotSwapServiceImpl@1955.maybeQueueEligibleAwemesForFullFetchVhs$1$2");
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
            PaidContentVideoHotSwapServiceImpl paidContentVideoHotSwapServiceImpl = this.LLILLJJLI;
            List<C0S81> list = this.LLILLL;
            C0S8O c0s8o = this.LLILZ;
            String str = this.LLILZLL;
            this.LL = 1;
            paidContentVideoHotSwapServiceImpl.getClass();
            if (list.isEmpty()) {
                objLJI = Unit.LIZ;
            } else {
                C13BV c13bv = C13BV.INSTANCE;
                if (!c13bv.isEmpty()) {
                    c0s8o.LIZ(PaidContentVideoHotSwapServiceImpl.LJIIL(list, c13bv));
                }
                if (true ^ list.isEmpty()) {
                    c0s8o.LIZJ(list);
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<C0S81> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().LIZ);
                    }
                    C735930Str.LIZ(c2344009Gk, arrayList, str);
                    C20684815ws.LJIILLIIL("urlless_aweme_fetch_start", c2344009Gk.LIZ);
                    objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C0S8K(list, new AwS121S1000000_4(str, 1), paidContentVideoHotSwapServiceImpl, c0s8o, null));
                    if (objLJI != C099R.LJFF()) {
                        objLJI = Unit.LIZ;
                    }
                } else {
                    objLJI = Unit.LIZ;
                }
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("PaidContentVideoHotSwapServiceImpl@1955.maybeQueueEligibleAwemesForFullFetchVhs$1$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaidContentVideoHotSwapServiceImpl@1955.maybeQueueEligibleAwemesForFullFetchVhs$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
