package X;

import android.net.Uri;
import com.bytedance.android.monitorV2.lynx.LynxViewMonitor;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0piW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522300piW {
    public static String LIZ = "";

    public static int LIZ(Integer num) {
        if (num == null) {
            return 3;
        }
        if (num.intValue() == 1) {
            return 0;
        }
        if (num.intValue() == -1) {
            return 1;
        }
        if (num.intValue() != -2) {
            return 3;
        }
        return 2;
    }

    public static void LIZLLL(C1537710q7N c1537710q7N, C1522330piZ c1522330piZ, long j) {
        long jLongValue;
        C1521470phB c1521470phB = new C1521470phB();
        c1521470phB.LJI = c1522330piZ.LIZ;
        c1521470phB.LJII = LIZ(c1522330piZ.LIZIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1522330piZ.LIZJ);
        sbLIZ.append(", isRunInMainThread: ");
        sbLIZ.append(c1522330piZ.LJII);
        c1521470phB.LJIIIIZZ = C2188811AlT.LIZIZ(sbLIZ);
        Long l = c1522330piZ.LJ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c1521470phB.LJIIJ = jLongValue;
        if (jLongValue != 0) {
            c1521470phB.LJIIJJI = j;
            c1521470phB.LJIIIZ = j - jLongValue;
        }
        LynxViewMonitor.Companion.getClass();
        LynxViewMonitor.INSTANCE.reportJsbInfo(c1537710q7N, c1521470phB);
    }

    public static void LIZIZ(String str, C1537480q70 c1537480q70, String str2, JSONObject jSONObject) {
        String str3;
        String str4;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObjectPut = jSONObject.put("timestamp", System.currentTimeMillis());
        if (c1537480q70 != null) {
            str3 = c1537480q70.containerId;
        } else {
            str3 = null;
        }
        C1520360pfO c1520360pfO = new C1520360pfO(str);
        if (c1537480q70 == null || (str4 = c1537480q70.bid) == null) {
            str4 = "hybridkit_default_bid";
        }
        c1520360pfO.LIZIZ = str4;
        c1520360pfO.LIZ = str2;
        c1520360pfO.LIZLLL = jSONObjectPut;
        c1520360pfO.LIZIZ(0);
        C1520080pew.LIZ(str3, c1520360pfO.LIZ());
    }

    public static void LIZJ(C1537480q70 c1537480q70, String str, int i, String str2, Integer num) {
        InterfaceC1531560pxS interfaceC1531560pxS;
        Uri uriLIZ;
        if (str == null && ((interfaceC1531560pxS = c1537480q70.hybridParams) == null || (uriLIZ = interfaceC1531560pxS.LIZ()) == null || (str = uriLIZ.toString()) == null)) {
            str = "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", i);
        if (num != null) {
            jSONObject.put("errorCode", num.intValue());
        }
        if (str2 != null) {
            jSONObject.put("mode", "segmenting");
            jSONObject.put("segmentingID", str2);
        } else {
            jSONObject.put("mode", "legacy");
        }
        LIZIZ("hybrid_prefetch_cache_state", c1537480q70, str, jSONObject);
        if (Intrinsics.LJFF(LIZ, c1537480q70.containerId)) {
            C1520080pew.LJFF(c1537480q70.containerId, "lynx_prefetch", "getResult_2", null, c1537480q70.LJIJI(), c1537480q70.bid, null, String.valueOf(i), 72);
        } else {
            C1520080pew.LJFF(c1537480q70.containerId, "lynx_prefetch", "getResult", null, c1537480q70.LJIJI(), c1537480q70.bid, null, String.valueOf(i), 72);
            LIZ = c1537480q70.containerId;
        }
    }
}
