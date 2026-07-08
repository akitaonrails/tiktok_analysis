package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.List;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.09gB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2433309gB {
    public static volatile InterfaceC2433509gD LIZ;

    public static C2433409gC LIZ(List<String> list) {
        String strLIZ;
        C2433409gC c2433409gC = new C2433409gC();
        JSONObject jSONObject = C792400V6o.LJFF;
        if (jSONObject != null) {
            c2433409gC.LIZIZ = jSONObject.optString("aid");
            c2433409gC.LIZ = jSONObject.optString("device_id");
        }
        if (C08MX.LIZ().contains(":")) {
            strLIZ = C08MX.LIZ();
        } else {
            strLIZ = "main";
        }
        c2433409gC.LIZJ = strLIZ;
        c2433409gC.LIZLLL = list;
        c2433409gC.LJ = jSONObject;
        return c2433409gC;
    }

    public static boolean LIZIZ(C2433409gC c2433409gC) {
        List<String> list;
        if (!TextUtils.isEmpty(c2433409gC.LIZIZ) && !TextUtils.isEmpty(c2433409gC.LIZ) && !TextUtils.isEmpty(c2433409gC.LIZJ) && (list = c2433409gC.LIZLLL) != null && list.size() != 0) {
            return true;
        }
        return false;
    }

    public static void LIZJ(C0VSJ c0vsj) {
        if (c0vsj != null && c0vsj.exists()) {
            try {
                File[] fileArrListFiles = c0vsj.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        file.delete();
                    }
                }
                c0vsj.delete();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("deleteTempDir error:");
                sbLIZ.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ);
                C2404309bV.LIZIZ();
            }
        }
    }

    public static String LIZLLL(List<String> list) {
        String strLIZIZ;
        C0VSJ c0vsj = new C0VSJ((String) ListProtector.get(list, 0));
        String parent = c0vsj.getParent();
        String name = c0vsj.getName();
        if (TextUtils.isEmpty(name)) {
            strLIZIZ = "";
        } else {
            int iLastIndexOf = name.lastIndexOf(e3.d);
            if (iLastIndexOf == -1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(name);
                sbLIZ.append(".zip");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(name.substring(0, iLastIndexOf));
                sbLIZ2.append(".zip");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        C0VSJ c0vsj2 = new C0VSJ(parent, strLIZIZ);
        if (c0vsj2.exists()) {
            c0vsj2.delete();
        }
        try {
            C08SC.LIZIZ(c0vsj2.getAbsolutePath(), (String[]) list.toArray(new String[0]));
            return c0vsj2.getAbsolutePath();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                if (c0vsj2.exists()) {
                    c0vsj2.delete();
                    return null;
                }
                return null;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return null;
            }
        }
    }
}
