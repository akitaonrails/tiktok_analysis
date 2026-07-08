package X;

import com.bytedance.android.starship.engine.graph.config.GraphConfig;
import com.bytedance.android.starship.engine.graph.config.NodeConfig;
import com.bytedance.android.starship.strategy.repository.GraphList;
import com.bytedance.android.starship.strategy.repository.StrategiesData;
import com.bytedance.android.starship.strategy.repository.StrategyModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0k6C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306340k6C extends C09AY implements Function1<C1306250k63, Unit> {
    public final /* synthetic */ Map.Entry<String, GraphList> LL;
    public final /* synthetic */ Map<String, GraphConfig> LLILLJJLI;
    public final /* synthetic */ Map<String, NodeConfig> LLILLL;
    public final /* synthetic */ Map<String, StrategyModel> LLILZ;
    public final /* synthetic */ StrategiesData LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306340k6C(Map.Entry<String, GraphList> entry, Map<String, GraphConfig> map, Map<String, NodeConfig> map2, Map<String, StrategyModel> map3, StrategiesData strategiesData) {
        super(1);
        this.LL = entry;
        this.LLILLJJLI = map;
        this.LLILLL = map2;
        this.LLILZ = map3;
        this.LLILZIL = strategiesData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1306250k63 c1306250k63) throws Throwable {
        C1306250k63 c1306250k632 = c1306250k63;
        String key = this.LL.getKey();
        Map<String, GraphConfig> map = this.LLILLJJLI;
        Map<String, NodeConfig> map2 = this.LLILLL;
        Map<String, StrategyModel> map3 = this.LLILZ;
        InterfaceC1307160k7W interfaceC1307160k7W = this.LLILZIL.tracer;
        c1306250k632.getClass();
        C23250099c.LJ(C23271099x.INSTANCE, new C1306270k65(interfaceC1307160k7W, key, c1306250k632, map3, map, map2, null));
        return Unit.LIZ;
    }
}
