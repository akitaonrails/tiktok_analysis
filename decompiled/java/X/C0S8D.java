package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S8D, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl$makePaywallNetworkCallVhs$4$1", f = "PaidContentVideoHotSwapServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0S8D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Unit>>, Object> {
    public final /* synthetic */ List<C0S8A<Object>> LL;
    public final /* synthetic */ C0S8H LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S8D(List<C0S8A<Object>> list, C0S8H c0s8h, InterfaceC1364105Vn<? super C0S8D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = c0s8h;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0S8D(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaidContentVideoHotSwapServiceImpl@1955.makePaywallNetworkCallVhs$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C0S8A<Object>> list = this.LL;
        C0S8H c0s8h = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C0S8A<Object>> it2 = list.iterator();
        while (it2.hasNext()) {
            c0s8h.LIZ(it2.next());
            arrayList.add(Unit.LIZ);
        }
        C1C7U.LIZIZ("PaidContentVideoHotSwapServiceImpl@1955.makePaywallNetworkCallVhs$4$1");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
