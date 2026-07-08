package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import qo2.w;

/* JADX INFO: renamed from: X.0JMH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JMH extends C09AY implements Function0<Map<String, ? extends String>> {
    public final /* synthetic */ DataChannel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JMH(DataChannel dataChannel) {
        super(0);
        this.LL = dataChannel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends String> invoke() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        DataChannel dataChannel = this.LL;
        linkedHashMap.put("iab_click_time", String.valueOf(System.currentTimeMillis()));
        w.LIZ.getClass();
        linkedHashMap.put("request_id", w.LJIJI());
        if (dataChannel != null) {
            C0JMI.LIZ(dataChannel, linkedHashMap);
        }
        return linkedHashMap;
    }
}
