package X;

import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.data.monitor.TouchPointActionRecordUtils;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.082y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20542082y extends C09AY implements Function0<String> {
    public C20542082y() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String string = ((Keva) TouchPointActionRecordUtils.LIZIZ.getValue()).getString("touch_point_action_list_key", "");
        if (string == null || string.length() == 0) {
            return null;
        }
        List<TouchPointActionRecordUtils.TouchPointActionRecord> listLIZLLL = C20484080s.LIZLLL(TouchPointActionRecordUtils.TouchPointActionRecord[].class, string);
        long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (TouchPointActionRecordUtils.TouchPointActionRecord touchPointActionRecord : listLIZLLL) {
            if (touchPointActionRecord.endTime > jCurrentTimeMillis) {
                if (map.get(String.valueOf(touchPointActionRecord.planId)) == null) {
                    map.put(String.valueOf(touchPointActionRecord.planId), new ArrayList());
                }
                List list = (List) map.get(String.valueOf(touchPointActionRecord.planId));
                if ((list != null ? list.size() : 0) < C0C64.LJIILLIIL().LJIJ(31744, 10, "touch_point_action_record_count_limit", true)) {
                    arrayList.add(touchPointActionRecord);
                    List list2 = (List) map.get(String.valueOf(touchPointActionRecord.planId));
                    if (list2 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(touchPointActionRecord.actionType);
                        sbLIZ.append('_');
                        sbLIZ.append(touchPointActionRecord.now);
                        list2.add(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
        }
        ((Keva) TouchPointActionRecordUtils.LIZIZ.getValue()).storeString("touch_point_action_list_key", C20484080s.LIZJ(arrayList));
        if (map.isEmpty()) {
            return null;
        }
        return C20484080s.LIZJ(map);
    }
}
