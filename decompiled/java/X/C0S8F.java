package X;

import com.ss.android.ugc.aweme.ab.SubsPaywallSingleBindKillSwitch;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S8F, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl$makePaywallNetworkCallVhs$2", f = "PaidContentVideoHotSwapServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0S8F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public final /* synthetic */ C0S8A<Object> LL;
    public final /* synthetic */ List<C0S8A<Object>> LLILLJJLI;
    public final /* synthetic */ C0S8H LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S8F(C0S8A<Object> c0s8a, List<C0S8A<Object>> list, C0S8H c0s8h, InterfaceC1364105Vn<? super C0S8F> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0s8a;
        this.LLILLJJLI = list;
        this.LLILLL = c0s8h;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0S8F(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.Unit] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object arrayList;
        C1C7U.LIZ("PaidContentVideoHotSwapServiceImpl@1955.makePaywallNetworkCallVhs$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0S8A<Object> c0s8a = this.LL;
        if (c0s8a != null) {
            this.LLILLL.LIZLLL(c0s8a);
        }
        if (SubsPaywallSingleBindKillSwitch.INSTANCE.isEnabled()) {
            C0S8A<Object> c0s8a2 = this.LL;
            if (c0s8a2 != null) {
                this.LLILLL.LIZIZ(c0s8a2);
                arrayList = Unit.LIZ;
            } else {
                arrayList = 0;
            }
        } else {
            List<C0S8A<Object>> list = this.LLILLJJLI;
            C0S8H c0s8h = this.LLILLL;
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C0S8A<Object>> it2 = list.iterator();
            while (it2.hasNext()) {
                c0s8h.LIZIZ(it2.next());
                arrayList.add(Unit.LIZ);
            }
        }
        C1C7U.LIZIZ("PaidContentVideoHotSwapServiceImpl@1955.makePaywallNetworkCallVhs$2");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
