package X;

import com.bytedance.android.starship.engine.graph.config.GraphConfig;
import com.bytedance.android.starship.strategy.repository.GraphList;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0k6d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306610k6d extends C09AY implements InterfaceC1631620sYq<String, GraphList, GraphConfig, Unit> {
    public final /* synthetic */ Map<String, GraphList> LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306610k6d(Map<String, GraphList> map, String str) {
        super(3);
        this.LL = map;
        this.LLILLJJLI = str;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, GraphList graphList, GraphConfig graphConfig) {
        Map<String, GraphConfig> map;
        GraphList graphList2 = this.LL.get(str);
        if (graphList2 != null && graphList2.graphs != null) {
            GraphList graphList3 = this.LL.get(str);
            if (graphList3 != null && (map = graphList3.graphs) != null) {
                map.put(this.LLILLJJLI, graphConfig);
            }
        } else {
            this.LL.put(str, graphList);
        }
        return Unit.LIZ;
    }
}
