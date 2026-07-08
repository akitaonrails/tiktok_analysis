package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0nIR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429250nIR {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(Map map, Map map2) {
        EnumC1429260nIS taskStatus;
        EnumC1429260nIS taskStatus2;
        EnumC1429260nIS taskStatus3;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            LinkedHashMap linkedHashMap = (LinkedHashMap) map2;
            InterfaceC1429290nIV interfaceC1429290nIV = (InterfaceC1429290nIV) linkedHashMap.get(key);
            if (interfaceC1429290nIV != null) {
                taskStatus = interfaceC1429290nIV.getTaskStatus();
            } else {
                taskStatus = null;
            }
            if (taskStatus == EnumC1429260nIS.NONE) {
                if (!list.isEmpty() && !list.isEmpty()) {
                    for (Object obj : list) {
                        InterfaceC1429290nIV interfaceC1429290nIV2 = (InterfaceC1429290nIV) linkedHashMap.get(obj);
                        if (interfaceC1429290nIV2 != null) {
                            taskStatus2 = interfaceC1429290nIV2.getTaskStatus();
                        } else {
                            taskStatus2 = null;
                        }
                        if (taskStatus2 != EnumC1429260nIS.SUCCESS) {
                            InterfaceC1429290nIV interfaceC1429290nIV3 = (InterfaceC1429290nIV) linkedHashMap.get(obj);
                            if (interfaceC1429290nIV3 != null) {
                                taskStatus3 = interfaceC1429290nIV3.getTaskStatus();
                            } else {
                                taskStatus3 = null;
                            }
                            if (taskStatus3 == EnumC1429260nIS.FAILED) {
                            }
                        }
                    }
                }
                Object obj2 = linkedHashMap.get(key);
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
        }
        return arrayList;
    }
}
