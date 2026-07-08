package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0D5v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpFragment$observeViewModel$1$1$5$1", f = "PdpFragment.kt", l = {}, m = "invokeSuspend")
public final class C333570D5v extends C09AX implements Function2<Long, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ long LL;
    public final /* synthetic */ PdpFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333570D5v(PdpFragment pdpFragment, InterfaceC1364105Vn<? super C333570D5v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pdpFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C333570D5v c333570D5v = new C333570D5v(this.LLILLJJLI, interfaceC1364105Vn);
        c333570D5v.LL = ((Number) obj).longValue();
        return c333570D5v;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpFragment@d2f1.observeViewModel$1$1$5$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long j = this.LL;
        if (j != 0) {
            PdpFragment pdpFragment = this.LLILLJJLI;
            if (j != pdpFragment.LLJJJJJIL) {
                pdpFragment.LLJJJJJIL = j;
                if (pdpFragment.NR()) {
                    C343970De7 c343970De7 = C343970De7.LIZ;
                    String str = TuxSheet._pnsPageId;
                    C1391190mJ3.LJFF(pdpFragment, c343970De7);
                } else {
                    C19EG activity = pdpFragment.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PdpFragment@d2f1.observeViewModel$1$1$5$1");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PdpFragment@d2f1.observeViewModel$1$1$5$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Long l, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Long.valueOf(l.longValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
