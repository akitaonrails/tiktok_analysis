package X;

import com.bytedance.android.starship.engine.graph.config.GraphConfig;
import com.bytedance.android.starship.strategy.repository.StrategyModel;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0k67, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306290k67 extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1306250k63 LLILLJJLI;
    public final /* synthetic */ Map<String, GraphConfig> LLILLL;
    public final /* synthetic */ Map<String, StrategyModel> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306290k67(String str, C1306250k63 c1306250k63, Map<String, GraphConfig> map, Map<String, StrategyModel> map2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = c1306250k63;
        this.LLILLL = map;
        this.LLILZ = map2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("name:");
        sbLIZ.append(this.LL);
        sbLIZ.append(" init>>> ");
        C1306250k63 c1306250k63 = this.LLILLJJLI;
        Map<String, GraphConfig> map = this.LLILLL;
        Map<String, StrategyModel> map2 = this.LLILZ;
        c1306250k63.getClass();
        sbLIZ.append(C1306250k63.LJIILLIIL(map, map2));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
