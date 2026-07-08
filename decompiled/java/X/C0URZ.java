package X;

import com.bytedance.android.livesdk.livesetting.broadcast.GameLiveLinkingAudienceControlLaterThresholdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.GameLiveLinkingAudienceControlThresholdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameAudienceControlMockTimeSetting;
import com.bytedance.android.livesdk.model.GameTag;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0URZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0URZ {
    public static void LIZ(String str) {
        C0JT6<Map<String, List<Double>>> c0jt6 = InterfaceC772390URp.y0;
        Map<String, List<Double>> mapLIZ = c0jt6.LIZ();
        if (mapLIZ == null) {
            mapLIZ = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapLIZ);
        long j = 60;
        long jCurrentTimeMillis = System.currentTimeMillis() + (LiveGameAudienceControlMockTimeSetting.INSTANCE.getValue() * ((long) 24) * j * j * 1000) + 1209600000;
        List arrayList = (List) linkedHashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        arrayList.add(Double.valueOf(jCurrentTimeMillis));
        linkedHashMap.put(str, arrayList);
        c0jt6.LIZJ(linkedHashMap);
    }

    public static int LIZIZ(GameTag gameTag) {
        String strValueOf = String.valueOf(gameTag.id);
        if (gameTag.gar.size() == 0) {
            return 4;
        }
        int i = 0;
        boolean z = false;
        for (GameTag.GameAgeRating gameAgeRating : gameTag.gar) {
            if (gameAgeRating.rs == 1 && gameAgeRating.ar >= GameLiveLinkingAudienceControlThresholdSetting.INSTANCE.getPEGIThreshold()) {
                z = true;
            }
            if (gameAgeRating.rs == 2 && gameAgeRating.ar >= GameLiveLinkingAudienceControlThresholdSetting.INSTANCE.getESRBThreshold()) {
                z = true;
            }
        }
        if (!z) {
            return 3;
        }
        Map<String, List<Double>> mapLIZ = InterfaceC772390URp.y0.LIZ();
        if (mapLIZ == null) {
            mapLIZ = C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapLIZ);
        List arrayList = (List) linkedHashMap.get(strValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        long j = 60;
        long jCurrentTimeMillis = System.currentTimeMillis() + (LiveGameAudienceControlMockTimeSetting.INSTANCE.getValue() * ((long) 24) * j * j * 1000);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Number) obj).doubleValue() > jCurrentTimeMillis) {
                arrayList2.add(obj);
            }
        }
        linkedHashMap.put(strValueOf, arrayList2);
        if (arrayList2.size() >= GameLiveLinkingAudienceControlLaterThresholdSetting.INSTANCE.getSingleThreshold()) {
            i = 5;
        } else {
            int size = 0;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                List list = (List) entry.getValue();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list) {
                    if (((Number) obj2).doubleValue() > jCurrentTimeMillis) {
                        arrayList3.add(obj2);
                    }
                }
                linkedHashMap.put(key, new ArrayList(arrayList3));
                size += arrayList3.size();
            }
            if (size >= GameLiveLinkingAudienceControlLaterThresholdSetting.INSTANCE.getTotalThreshold()) {
                i = 6;
            }
        }
        InterfaceC772390URp.y0.LIZJ(linkedHashMap);
        return i;
    }
}
