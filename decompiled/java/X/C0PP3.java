package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PP3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PP3 {
    public static C0PP4 LIZ;

    public static String LIZ() throws JSONException {
        C0PP4 c0pp4 = LIZ;
        C271290AkB.LIZ();
        if (c0pp4 == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timestamp", c0pp4.LIZ);
        jSONObject.put("query", c0pp4.LIZIZ);
        jSONObject.put("search_type", c0pp4.LIZJ);
        jSONObject.put("card_count", c0pp4.LIZLLL);
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, c0pp4.LJ);
        jSONObject.put("cur_timestamp", System.currentTimeMillis());
        return C786410Ut5.J3(jSONObject);
    }

    public static final boolean LIZIZ(Throwable th) {
        if (C271290AkB.LIZ()) {
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            while (th != null && setNewSetFromMap.add(th)) {
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                if (((th instanceof C1494690ozz) && a0.LJJIIZI(message, "TTNET_APP_TIMED_OUT", false)) || a0.LJJIIZI(message, "TTNET_APP_TIMED_OUT", false) || a0.LJJIIZI(message, "timed out", true) || a0.LJJIIZI(message, "timeout", true)) {
                    return true;
                }
                th = th.getCause();
            }
            return false;
        }
        while (th != null) {
            String message2 = th.getMessage();
            if (message2 == null) {
                message2 = "";
            }
            if (((th instanceof C1494690ozz) && a0.LJJIIZI(message2, "TTNET_APP_TIMED_OUT", false)) || a0.LJJIIZI(message2, "TTNET_APP_TIMED_OUT", false) || a0.LJJIIZI(message2, "timed out", true) || a0.LJJIIZI(message2, "timeout", true)) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static long LIZLLL(String str, String str2) {
        long jCurrentTimeMillis;
        String str3 = str;
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        if (lValueOf != null) {
            jCurrentTimeMillis = lValueOf.longValue();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        if (C271290AkB.LIZ()) {
            if (str3 == null) {
                str3 = "";
            }
            LIZ = new C0PP4(0, str3, str2, jCurrentTimeMillis, "unfinished");
        }
        return jCurrentTimeMillis;
    }

    public static final void LIZJ(Integer num, String str, String str2, Long l, String str3) {
        C0PP4 c0pp4;
        int iIntValue;
        if (C271290AkB.LIZ() && (c0pp4 = LIZ) != null && l != null) {
            long jLongValue = l.longValue();
            if (str == null) {
                return;
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (c0pp4.LIZ == jLongValue && Intrinsics.LJFF(c0pp4.LIZIZ, str) && Intrinsics.LJFF(c0pp4.LIZJ, str2)) {
                LIZ = new C0PP4(iIntValue, c0pp4.LIZIZ, c0pp4.LIZJ, c0pp4.LIZ, str3);
            }
        }
    }
}
