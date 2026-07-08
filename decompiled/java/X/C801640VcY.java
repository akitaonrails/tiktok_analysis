package X;

import android.os.SystemClock;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.monitor.k;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VcY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801640VcY {
    public static void LIZJ(JSONObject jSONObject, File file) {
        String strLJFF;
        if (C802260VdY.LJIIIIZZ && (strLJFF = C2112008Pe.LJFF(new C0VSJ(file, "custom.json"))) != null) {
            try {
                C0VJO.LIZLLL(jSONObject, new JSONObject(strLJFF));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LIZIZ(File file, CrashType crashType, int i) {
        List<InterfaceC801650VcZ> list;
        if (!C802260VdY.LJIIIIZZ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(file.getAbsolutePath());
        sbLIZ.append("/");
        sbLIZ.append("custom");
        sbLIZ.append(".json");
        C801720Vcg c801720Vcg = new C801720Vcg(C2188811AlT.LIZIZ(sbLIZ));
        c801720Vcg.LJIIIZ();
        c801720Vcg.LJII("custom");
        c801720Vcg.LJIIIZ();
        C802790VeP c802790VeP = k.LIZ;
        if (c802790VeP != null) {
            List<AttachUserData> listLIZLLL = c802790VeP.LIZJ.LIZLLL(crashType);
            boolean zLIZ = true;
            if (listLIZLLL != null) {
                zLIZ = true;
                for (int i2 = 0; i2 < listLIZLLL.size(); i2++) {
                    AttachUserData attachUserData = (AttachUserData) ListProtector.get(listLIZLLL, i2);
                    try {
                        zLIZ = LIZ(c801720Vcg, attachUserData.getUserData(crashType), attachUserData.getClass().getName(), SystemClock.uptimeMillis(), zLIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            C802410Vdn c802410Vdn = c802790VeP.LIZJ;
            synchronized (c802410Vdn.LJIIJ) {
                try {
                    list = c802410Vdn.LJIIJ.getList(crashType);
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            if (list != null) {
                JSONObject jSONObject = new JSONObject();
                C0VJO.LJIIIIZZ(jSONObject, "tid", Integer.valueOf(i));
                for (int i3 = 0; i3 < list.size(); i3++) {
                    InterfaceC801650VcZ interfaceC801650VcZ = (InterfaceC801650VcZ) ListProtector.get(list, i3);
                    try {
                        zLIZ = LIZ(c801720Vcg, interfaceC801650VcZ.LIZ(jSONObject), interfaceC801650VcZ.getClass().getName(), SystemClock.uptimeMillis(), zLIZ);
                    } catch (Throwable th2) {
                    }
                }
            }
        }
        c801720Vcg.LJIIJ();
        c801720Vcg.LJIIJ();
        c801720Vcg.LJI();
    }

    public static boolean LIZ(C801720Vcg c801720Vcg, Map<? extends String, ? extends String> map, String str, long j, boolean z) {
        if (map != null && map.size() != 0) {
            StringBuilder sb = new StringBuilder("zz_cost_");
            sb.append(str);
            for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                if (z) {
                    z = false;
                } else {
                    c801720Vcg.LJIIIIZZ();
                }
                c801720Vcg.LJII(entry.getKey());
                c801720Vcg.LJIIJJI(entry.getValue());
                sb.append("_");
                sb.append(entry.getKey());
            }
            c801720Vcg.LIZ(',');
            c801720Vcg.LJII(sb.toString());
            c801720Vcg.LIZJ(SystemClock.uptimeMillis() - j);
        }
        return z;
    }
}
