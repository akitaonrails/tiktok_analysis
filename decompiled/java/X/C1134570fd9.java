package X;

import Y.AComparatorS36S0000000_17;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.guide.model.TaskInfoResponse;
import com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveStrategyFindTpDataCrashFixSetting;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import webcast.data.TouchPointData;

/* JADX INFO: renamed from: X.0fd9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1134570fd9 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static List LIZ(CopyOnWriteArrayList copyOnWriteArrayList) {
        if (LiveStrategyFindTpDataCrashFixSetting.INSTANCE.isEnable()) {
            List listLJLLLL = C13LP.LJLLLL(new AComparatorS36S0000000_17(1), new ArrayList(copyOnWriteArrayList));
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJLLLL.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(((TaskInfo) ((AbstractC1134420fcu) it2.next()).LIZ).tpDataList, arrayList);
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (hashSet.add(Long.valueOf(((TouchPointData) obj).tpId))) {
                    arrayList2.add(obj);
                }
            }
            return new ArrayList(arrayList2);
        }
        List listLJLLLL2 = C13LP.LJLLLL(new AComparatorS36S0000000_17(2), copyOnWriteArrayList);
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = listLJLLLL2.iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(((TaskInfo) ((AbstractC1134420fcu) it3.next()).LIZ).tpDataList, arrayList3);
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (hashSet2.add(Long.valueOf(((TouchPointData) obj2).tpId))) {
                arrayList4.add(obj2);
            }
        }
        return new ArrayList(arrayList4);
    }

    public static void LIZIZ(TaskInfoResponse.Data data, List list) {
        if (data == null) {
            return;
        }
        if (data.tpDataList.isEmpty()) {
            data.tpDataList = list;
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (TouchPointData touchPointData : data.tpDataList) {
            linkedHashMap.put(touchPointData.tpName, touchPointData);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            TouchPointData touchPointData2 = (TouchPointData) it2.next();
            linkedHashMap.put(touchPointData2.tpName, touchPointData2);
        }
        data.tpDataList = new ArrayList(linkedHashMap.values());
    }
}
