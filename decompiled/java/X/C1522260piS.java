package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0piS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522260piS extends C09AY implements Function0<C1514810pWR> {
    public final /* synthetic */ C1537480q70 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1522260piS(C1537480q70 c1537480q70) {
        super(0);
        this.LL = c1537480q70;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0piT] */
    @Override // kotlin.jvm.functions.Function0
    public final C1514810pWR invoke() {
        final C1537480q70 c1537480q70 = this.LL;
        String str = c1537480q70.containerId;
        C1514810pWR c1514810pWR = new C1514810pWR(str, new Function0<Map<String, ? extends Object>>() { // from class: X.0piT
            @Override // kotlin.jvm.functions.Function0
            public final Map<String, ? extends Object> invoke() {
                String did2;
                String strLJIIJJI = c1537480q70.LJIIJJI();
                Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair(EnumC1521110pgb.CONTEXT_PAGE_KEY.getKey(), strLJIIJJI), new Pair(EnumC1521110pgb.CONTEXT_PAGE_KEY_HASH.getKey(), C08HX.LIZIZ(strLJIIJJI)), new Pair(EnumC1521120pgc.SAMPLE_RATIO.getKey(), Double.valueOf(c1537480q70.LJIILL())));
                C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
                C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
                if (c1538050q7v != null && (did2 = c1538050q7v.getDid()) != null) {
                    mapLJIIJ.put(EnumC1521120pgc.SAMPLE_ID.getKey(), did2);
                }
                return mapLJIIJ;
            }
        });
        C1514690pWF.LIZJ(EnumC1514740pWK.Start, str, new JSONObject());
        c1514810pWR.LIZJ("spark_container_id", this.LL.containerId);
        c1514810pWR.LIZJ("spark_container_name", "Spark");
        return c1514810pWR;
    }
}
