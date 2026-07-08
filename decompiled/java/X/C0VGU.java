package X;

import android.os.Build;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0VGU, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VGU {
    public static final C0VGU LIZ = new C0VGU();

    public static List LIZIZ(TelephonyManager telephonyManager) {
        TelephonyManager telephonyManagerCreateForSubscriptionId;
        Object c098200Yq;
        int defaultVoiceSubscriptionId = SubscriptionManager.getDefaultVoiceSubscriptionId();
        int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
        int defaultSmsSubscriptionId = SubscriptionManager.getDefaultSmsSubscriptionId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZJ(linkedHashMap, defaultVoiceSubscriptionId, "voice");
        LIZJ(linkedHashMap, defaultDataSubscriptionId, "data");
        LIZJ(linkedHashMap, defaultSmsSubscriptionId, "sms");
        if (linkedHashMap.isEmpty()) {
            return C1697810uHb.LJIIL(LIZ(telephonyManager, Collections.singletonList("default")));
        }
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            Integer num = (Integer) entry.getKey();
            List list = (List) entry.getValue();
            if (Build.VERSION.SDK_INT >= 24) {
                telephonyManagerCreateForSubscriptionId = telephonyManager.createForSubscriptionId(num.intValue());
            } else {
                telephonyManagerCreateForSubscriptionId = telephonyManager;
            }
            LIZ.getClass();
            Object obj = null;
            if (telephonyManagerCreateForSubscriptionId.getSimState() == 5) {
                try {
                    String strLLIL = C2204961BRm.LLIL(telephonyManagerCreateForSubscriptionId, new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK77lcoPOEm9YxGk5qGDsqYVoMQ/hzVu", null));
                    if (strLLIL == null) {
                        strLLIL = "";
                    }
                    String strLLIIJLIL = C2204961BRm.LLIIJLIL(telephonyManagerCreateForSubscriptionId, new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK77lcoPOEm9YxGk5qGDsqYVoMQ/hzVu", null));
                    if (strLLIIJLIL == null) {
                        strLLIIJLIL = "";
                    }
                    String strLLILII = C2204961BRm.LLILII(telephonyManagerCreateForSubscriptionId, new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK77lcoPOEm9YxGk5qGDsqYVoMQ/hzVu", null));
                    if (strLLILII == null) {
                        strLLILII = "";
                    }
                    String strLLIIL = C2204961BRm.LLIIL(telephonyManagerCreateForSubscriptionId, new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK77lcoPOEm9YxGk5qGDsqYVoMQ/hzVu", null));
                    if (strLLIIL == null) {
                        strLLIIL = "";
                    }
                    c098200Yq = new C0VGV(strLLIL, strLLIIJLIL, strLLILII, strLLIIL, telephonyManagerCreateForSubscriptionId.isNetworkRoaming(), list);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj = c098200Yq;
                }
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static C0VGV LIZ(TelephonyManager telephonyManager, List list) {
        Object c098200Yq;
        Object obj = null;
        if (telephonyManager.getSimState() != 5) {
            return null;
        }
        try {
            AtomicBoolean atomicBoolean = C794320VDy.LIZ;
            c098200Yq = new C0VGV(C1300840jxK.LJIIJ(telephonyManager), C1300840jxK.LJ(telephonyManager), C1300840jxK.LJIIL(telephonyManager), C1300840jxK.LJI(telephonyManager), telephonyManager.isNetworkRoaming(), list);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (C0VGV) obj;
    }

    public static final void LIZJ(LinkedHashMap<Integer, List<String>> linkedHashMap, int i, String str) {
        if (i != -1) {
            Integer numValueOf = Integer.valueOf(i);
            List<String> arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(numValueOf, arrayList);
            }
            arrayList.add(str);
        }
    }
}
