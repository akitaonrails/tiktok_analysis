package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.setting.ClientAiEventDrivenConfig;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsClientAiEventDrivenConfigSetting;
import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.EventDrivenConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0efF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1097430efF extends C09AY implements Function0<Map<String, ? extends List<? extends EventDrivenConfig>>> {
    public C1097430efF() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends List<? extends EventDrivenConfig>> invoke() {
        List<EventDrivenConfig> list;
        ClientAiEventDrivenConfig value = LivePcsClientAiEventDrivenConfigSetting.INSTANCE.getValue();
        if (value == null || (list = value.eventConfigList) == null) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EventDrivenConfig eventDrivenConfig : list) {
            String str = eventDrivenConfig.strategy;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(eventDrivenConfig);
        }
        return linkedHashMap;
    }
}
