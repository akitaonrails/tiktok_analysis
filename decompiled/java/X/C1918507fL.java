package X;

import com.bytedance.pipo.stellar.base.fragment.StellarViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07fL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1918507fL extends C09AY implements Function0<Map<String, ? extends Object>> {
    public final /* synthetic */ StellarViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1918507fL(StellarViewModel stellarViewModel) {
        super(0);
        this.LL = stellarViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends Object> invoke() {
        C1716280ulO c1716280ulO = this.LL.LLILLJJLI;
        Map mapLJIIL = C2097608Jq.LJIIL(c1716280ulO.LJI, c1716280ulO.LIZIZ());
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(mapLJIIL.size()));
        for (Map.Entry entry : ((LinkedHashMap) mapLJIIL).entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }
}
