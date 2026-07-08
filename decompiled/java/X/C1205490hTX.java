package X;

import com.ss.android.ugc.aweme.tracker.LSError;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS17S2000000_18;

/* JADX INFO: renamed from: X.0hTX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1205490hTX extends AbstractC1196150hET {
    public static final C1205490hTX LIZ = new C1205490hTX();
    public static final String LIZIZ = "local_service";

    @Override // X.AbstractC1196150hET
    public final String LIZIZ() {
        return LIZIZ;
    }

    @InterfaceC1294060jmO
    public final void LJ(LSError lSError, Throwable th) {
        String message;
        String message2;
        if (!C1196170hEV.LIZIZ("local_service_custom_error_monitor", lSError.toUniqueString(), null)) {
            return;
        }
        if (th != null) {
            C1AF0.LJ(th);
        } else {
            C1AF0.LIZJ(lSError.message());
        }
        String strMessage = lSError.message();
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        LIZJ("custom_error", new AwS17S2000000_18(strMessage, message, 0));
        String strMessage2 = lSError.message();
        LSError.Priority priority = LSError.Priority.P2;
        if (th != null) {
            message2 = th.getMessage();
        } else {
            message2 = null;
        }
        LJI(strMessage2, priority, null, null, message2);
    }

    public static void LIZLLL(LSError lSError, String str, Map map, Throwable th) {
        String message = null;
        if (!C1196170hEV.LIZIZ("local_service_custom_error_monitor", lSError.toUniqueString(), null)) {
            return;
        }
        if (th != null) {
            C1AF0.LJI(th, "localservice_" + lSError.priority().getValue() + "+error_msg=" + lSError.message() + "+extras=" + str, map);
        } else {
            C1AF0.LIZLLL("localservice_" + lSError.priority().getValue() + "+error_msg=" + lSError.message() + "+extras=" + str, map);
        }
        String strMessage = lSError.message();
        LSError.Priority priority = lSError.priority();
        if (th != null) {
            message = th.getMessage();
        }
        LJI(strMessage, priority, str, map, message);
    }

    public static void LJI(String str, LSError.Priority priority, String str2, Map map, String str3) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1189060h32.LJIJI(linkedHashMap, "custom_error_msg", str);
        C1189060h32.LJIJI(linkedHashMap, "priority", priority.getValue());
        C1189060h32.LJIJI(linkedHashMap, "extras", str2);
        C1189060h32.LJIJI(linkedHashMap, "exception_msg", str3);
        C1189060h32.LJJ("data", C1189060h32.LJJIIJZLJL(map), linkedHashMap);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                C1189060h32.LJIJI(linkedHashMap, entry.getKey(), entry.getValue());
            }
        }
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("local_service_custom_error_monitor", linkedHashMap, null);
    }
}
