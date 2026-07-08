package X;

import com.ss.android.ugc.aweme.feed.model.ComponentContainerData;
import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import com.ss.android.ugc.aweme.feed.model.RealtimeComponentConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rdy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700600Rdy extends C09AY implements Function1<C700640Re2, C700640Re2> {
    public C700600Rdy() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C700640Re2 invoke(C700640Re2 c700640Re2) {
        List list;
        ComponentContainerData componentContainerData;
        C700640Re2 c700640Re22 = c700640Re2;
        Map<String, GlobalComponentData> map = c700640Re22.LIZLLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        RealtimeComponentConfig realtimeComponentConfig = c700640Re22.LJFF.realtimeComponentConfig;
        if (realtimeComponentConfig == null || (list = realtimeComponentConfig.disableComponents) == null) {
            list = C13BV.INSTANCE;
        }
        for (Object obj : list) {
            GlobalComponentData globalComponentDataRemove = map.remove(obj);
            if (globalComponentDataRemove != null) {
                linkedHashMap.put(obj, globalComponentDataRemove);
                Map<String, ComponentContainerData> map2 = c700640Re22.LJ;
                if (map2 != null && (componentContainerData = map2.get(globalComponentDataRemove.getParentKey())) != null) {
                    componentContainerData.dropChild(globalComponentDataRemove, C0RZ5.LIZ(c700640Re22.LIZ, c700640Re22.LIZIZ));
                }
            }
        }
        return C700640Re2.LIZ(c700640Re22, map, null, new ArrayList(map.keySet()), linkedHashMap, 55);
    }
}
