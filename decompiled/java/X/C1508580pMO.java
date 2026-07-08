package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.spark.PdpSparkLiteCardHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS270S0300000_26;

/* JADX INFO: renamed from: X.0pMO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.spark.PdpSparkLiteCardHolder$onCreate$3", f = "PdpSparkLiteCardHolder.kt", l = {}, m = "invokeSuspend")
public final class C1508580pMO extends C09AX implements InterfaceC1631620sYq<Map<String, ? extends Object>, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1470205pE>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PdpSparkLiteCardHolder LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1508580pMO(PdpSparkLiteCardHolder pdpSparkLiteCardHolder, InterfaceC1364105Vn<? super C1508580pMO> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = pdpSparkLiteCardHolder;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c1470005pC;
        C19EG activity;
        C1C7U.LIZ("PdpSparkLiteCardHolder@81b6.onCreate$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map map = (Map) this.LL;
        C1508590pMP c1508590pMP = new Object() { // from class: X.0pMP
        };
        PdpViewModel pdpViewModelC6 = this.LLILLL.c6();
        View view = this.LLILLL.itemView;
        c1508590pMP.getClass();
        Fragment fragmentLIZ = C946803n0.LIZ(view);
        if (fragmentLIZ != null && (activity = fragmentLIZ.getActivity()) != null) {
            C03U5.LIZ(new AwS270S0300000_26(pdpViewModelC6, (PdpViewModel) view, (View) map, (Map<String, ? extends Object>) 155), C1745060vVo.LIZ(activity), null);
            c1470005pC = new C1470305pF((Map) null, 3);
        } else {
            c1470005pC = new C1470005pC(0, "Activity is null", null);
        }
        C1C7U.LIZIZ("PdpSparkLiteCardHolder@81b6.onCreate$3");
        return c1470005pC;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, InterfaceC1364105Vn<? super AbstractC1470205pE> interfaceC1364105Vn) {
        C1508580pMO c1508580pMO = new C1508580pMO(this.LLILLL, interfaceC1364105Vn);
        c1508580pMO.LL = map;
        c1508580pMO.LLILLJJLI = map2;
        return c1508580pMO.invokeSuspend(Unit.LIZ);
    }
}
