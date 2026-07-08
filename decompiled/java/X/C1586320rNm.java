package X;

import android.os.Looper;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0rNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586320rNm {
    public static final C1586320rNm LIZ = new C1586320rNm();

    public static void LIZ(long j, String str, String str2, String str3) {
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("entrance_type", str2);
        linkedHashMap.put("cost", String.valueOf(j));
        linkedHashMap.put("method_name", str3);
        if (Looper.getMainLooper().getThread() == C786410Ut5.u3()) {
            z = true;
        } else {
            z = false;
        }
        linkedHashMap.put("is_main_thread", String.valueOf(z));
        linkedHashMap.put("is_in_cold_start_up", String.valueOf(C0CN5.LJI()));
        C01TQ.LIZ("tikbot_entrance_cost_record", linkedHashMap);
    }
}
