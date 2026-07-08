package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VDO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0VDO implements C0VDD {
    public static final ConcurrentHashMap<String, Long> LIZ = new ConcurrentHashMap<>();

    public abstract String LJFF();

    public abstract boolean LJI(C0VDC c0vdc);

    public static boolean LIZJ(C0VDC c0vdc) {
        String str = c0vdc.LIZJ;
        ConcurrentHashMap<String, Long> concurrentHashMap = LIZ;
        if (concurrentHashMap.containsKey(str)) {
            if (System.currentTimeMillis() - concurrentHashMap.get(str).longValue() < 10000) {
                return false;
            }
            concurrentHashMap.put(str, Long.valueOf(System.currentTimeMillis()));
            return true;
        }
        concurrentHashMap.put(str, Long.valueOf(System.currentTimeMillis()));
        return true;
    }

    public static boolean LIZLLL(C0VDC c0vdc) {
        C0VDM c0vdm = C794160VDi.LIZ;
        if (((HashMap) c0vdm.LIZ).get(c0vdc.LIZJ) == Boolean.TRUE) {
            C0VDB.LIZIZ().getClass();
            if (!C0W1G.LJII(C0VDB.LJFF)) {
                C0VDZ.LIZ(0, c0vdc.LIZJ, "产物超过阈值，等待WiFi环境执行", null);
                return false;
            }
        }
        return true;
    }

    @Override // X.C0VDD
    public final synchronized boolean LIZ(C0VDC c0vdc) {
        if (!LJFF().equals(c0vdc.LIZIZ)) {
            return false;
        }
        try {
            try {
                if (!LIZJ(c0vdc) || !LIZLLL(c0vdc)) {
                    return false;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("start handle message:");
                sbLIZ.append(c0vdc);
                C2188811AlT.LIZIZ(sbLIZ);
                return LJI(c0vdc);
            } catch (C0VFS e) {
                TryCatchGuardChecker.doCheck(e);
                LJII(e.getMessage(), c0vdc);
                return false;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringWriter stringWriter = new StringWriter();
            e2.printStackTrace(new PrintWriter(stringWriter));
            LJII(C786410Ut5.j4("系统错误：%s", new Object[]{stringWriter.toString()}), c0vdc);
            return false;
        }
    }

    public static boolean LJ(JSONObject jSONObject, C0VDC c0vdc) {
        if (jSONObject.optBoolean("wifiOnly", false)) {
            C0VDB.LIZIZ().getClass();
            if (!C0W1G.LJII(C0VDB.LJFF)) {
                C794080VDa c794080VDa = new C794080VDa(c0vdc.LIZJ, null);
                c794080VDa.LIZLLL = 0;
                c794080VDa.LJ = "4G环境下不执行指令";
                C0VDW.LIZJ(c794080VDa);
                return true;
            }
        }
        return false;
    }

    public static void LJII(String str, C0VDC c0vdc) {
        C794080VDa c794080VDa = new C794080VDa(c0vdc.LIZJ, null);
        c794080VDa.LIZLLL = 3;
        c794080VDa.LJ = str;
        C0VDW.LIZJ(c794080VDa);
    }
}
