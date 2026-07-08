package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VXA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VXA {
    public static final Pattern LIZ = PatternProtector.compile("^(\\d+)-(\\d+)\\.json");
    public static C0VSJ LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:69:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ() {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VXA.LIZ():void");
    }

    public static void LIZIZ(JSONObject jSONObject, File file) {
        String strLJFF;
        C0VSJ c0vsjLJFF;
        String name = file.getName();
        if (LIZIZ == null && (c0vsjLJFF = C0VX9.LJFF()) != null) {
            LIZIZ = C2112008Pe.LIZIZ(c0vsjLJFF, "plugin");
        }
        C0VSJ c0vsj = LIZIZ;
        if (c0vsj != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(name);
            sbLIZ.append(".json");
            C0VSJ c0vsj2 = new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ));
            if (c0vsj2.exists() && (strLJFF = C2112008Pe.LJFF(c0vsj2)) != null) {
                try {
                    C0VJO.LIZLLL(jSONObject, new JSONObject(strLJFF));
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C801940Vd2.LIZIZ("pushTo", th);
                }
            }
        }
        C0VJO.LJIIIIZZ(jSONObject, "mira_init", Boolean.FALSE);
    }
}
