package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import java.security.SecureRandom;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS98S1000000_13;

/* JADX INFO: renamed from: X.0WXY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WXY {
    public final Function0<String> LIZ;
    public final Random LIZIZ;
    public final C824780WXc LIZJ;

    public C0WXY(n nVar, AwS98S1000000_13 awS98S1000000_13) {
        C824780WXc c824780WXc;
        SecureRandom secureRandom = new SecureRandom();
        this.LIZ = awS98S1000000_13;
        this.LIZIZ = secureRandom;
        try {
            c824780WXc = new C824780WXc(C2215391BnF.LIZIZ(C1931307hP.LIZLLL(nVar, "track")), C2215391BnF.LIZIZ(C1931307hP.LIZLLL(nVar, "monitor")));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Throwable: ");
            sbLIZ.append(e.getClass().getSimpleName());
            sbLIZ.append(' ');
            sbLIZ.append(e.getMessage());
            C201955140j.LJIILL(c20102213l6, "ExceptionConfigParser", C2188811AlT.LIZIZ(sbLIZ));
            c824780WXc = null;
        }
        this.LIZJ = c824780WXc;
    }

    public static boolean LIZ(C0WXY c0wxy, String str) {
        Map<String, C824790WXd> map;
        EnumC824760WXa enumC824760WXa = EnumC824760WXa.TRACK;
        C824780WXc c824780WXc = c0wxy.LIZJ;
        if (c824780WXc != null) {
            int i = C0WXZ.LIZ[enumC824760WXa.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    map = c824780WXc.LIZIZ;
                } else {
                    throw new C1954807lC();
                }
            } else {
                map = c824780WXc.LIZ;
            }
            if (map != null) {
                return map.containsKey(str);
            }
            return false;
        }
        return false;
    }
}
