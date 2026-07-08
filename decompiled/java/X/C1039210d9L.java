package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0d9L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039210d9L {
    public static String LIZJ(String str) {
        if (C2093608Ic.LJ(str)) {
            return str;
        }
        try {
            String scheme = UriProtector.parse(str).getScheme();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("snssdk");
            C844470XAv.LIZ.getClass();
            sbLIZ.append(C844470XAv.LJIIJ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if ("sslocal".equals(scheme) || "localsdk".equals(scheme)) {
                str = str.replace(scheme, strLIZIZ);
                return str;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return str;
    }

    public static void LIZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKaBFsUConZKoDNaD3cAGJXWcYoVQReugC4g8=", null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r5.equals(r8) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(android.content.Context r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1039210d9L.LIZIZ(android.content.Context, java.lang.String):boolean");
    }
}
