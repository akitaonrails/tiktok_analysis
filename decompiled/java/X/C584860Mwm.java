package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Mwm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584860Mwm extends C09AY implements Function1<HashMap<String, Object>, Unit> {
    public final /* synthetic */ AbstractC1492360owE LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C584860Mwm(AbstractC1492360owE abstractC1492360owE) {
        super(1);
        this.LL = abstractC1492360owE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(HashMap<String, Object> map) {
        HashMap<String, Object> map2 = map;
        AbstractC1492360owE abstractC1492360owE = this.LL;
        if (!abstractC1492360owE.LJFF) {
            abstractC1492360owE.LJFF = true;
            C2344009Gk c2344009Gk = new C2344009Gk();
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                c2344009Gk.LJ(entry.getValue(), entry.getKey());
            }
            C20684815ws.LJIILLIIL("network_observe_report", c2344009Gk.LIZ);
        }
        return Unit.LIZ;
    }
}
