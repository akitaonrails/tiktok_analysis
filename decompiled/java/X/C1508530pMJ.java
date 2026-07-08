package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0pMJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment$initSubscribe$33", f = "PdpFragment.kt", l = {}, m = "invokeSuspend")
public final class C1508530pMJ extends C09AX implements InterfaceC1631620sYq<Map<String, ? extends Object>, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1470205pE>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PdpFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1508530pMJ(PdpFragment pdpFragment, InterfaceC1364105Vn<? super C1508530pMJ> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = pdpFragment;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpFragment@ab0c.initSubscribe$33");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map map = (Map) this.LL;
        this.LLILLL.JS();
        AbstractC1470205pE abstractC1470205pELIZ = C1508540pMK.LIZ(this.LLILLL.requireView(), map);
        C1C7U.LIZIZ("PdpFragment@ab0c.initSubscribe$33");
        return abstractC1470205pELIZ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, InterfaceC1364105Vn<? super AbstractC1470205pE> interfaceC1364105Vn) {
        C1508530pMJ c1508530pMJ = new C1508530pMJ(this.LLILLL, interfaceC1364105Vn);
        c1508530pMJ.LL = map;
        c1508530pMJ.LLILLJJLI = map2;
        return c1508530pMJ.invokeSuspend(Unit.LIZ);
    }
}
