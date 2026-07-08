package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0vLs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1738900vLs {
    public static C1738910vLt LIZ(Intent intent) {
        Map mapLJ;
        String str;
        long jLongValue;
        String string;
        Long l;
        Bundle extras;
        Bundle extras2;
        Bundle extras3;
        try {
            extras3 = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (extras3 == null || (mapLJ = C1741890vQh.LIZLLL(extras3, "trackParams")) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        Object obj = mapLJ.get("enter_from");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        try {
            extras2 = intent.getExtras();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (extras2 == null) {
            jLongValue = 0;
        } else {
            jLongValue = extras2.getLong("key_launch_time");
        }
        try {
            extras = intent.getExtras();
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        if (extras == null || (string = extras.getString("previous_page")) == null) {
            string = "";
        }
        Object obj2 = mapLJ.get("start_click_time");
        if ((obj2 instanceof Long) && (l = (Long) obj2) != null) {
            jLongValue = l.longValue();
        }
        return new C1738910vLt(str, string, jLongValue, null, null, null, 496);
    }
}
