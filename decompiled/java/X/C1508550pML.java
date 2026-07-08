package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.spark.PdpSparkLiteCardHolder;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0pML, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.spark.PdpSparkLiteCardHolder$onCreate$5", f = "PdpSparkLiteCardHolder.kt", l = {}, m = "invokeSuspend")
public final class C1508550pML extends C09AX implements InterfaceC1631620sYq<Map<String, ? extends Object>, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1470205pE>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PdpSparkLiteCardHolder LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1508550pML(PdpSparkLiteCardHolder pdpSparkLiteCardHolder, InterfaceC1364105Vn<? super C1508550pML> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = pdpSparkLiteCardHolder;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpSparkLiteCardHolder@81b6.onCreate$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Map map = (Map) this.LL;
        this.LLILLL.c6();
        AbstractC1470205pE abstractC1470205pELIZ = C1508540pMK.LIZ(this.LLILLL.itemView, map);
        C1C7U.LIZIZ("PdpSparkLiteCardHolder@81b6.onCreate$5");
        return abstractC1470205pELIZ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, InterfaceC1364105Vn<? super AbstractC1470205pE> interfaceC1364105Vn) {
        C1508550pML c1508550pML = new C1508550pML(this.LLILLL, interfaceC1364105Vn);
        c1508550pML.LL = map;
        c1508550pML.LLILLJJLI = map2;
        return c1508550pML.invokeSuspend(Unit.LIZ);
    }
}
