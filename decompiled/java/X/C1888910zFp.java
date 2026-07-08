package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyPrompt;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1888910zFp {
    public static String LIZJ;
    public static volatile boolean LJ;
    public static final C1888910zFp LIZ = new C1888910zFp();
    public static final InterfaceC1519050pdH LIZIZ = C100C.LIZ.LJFF().LIZ(1, "privacy_setting");
    public static final Type LIZLLL = new TypeToken<Map<String, ? extends PrivacyPrompt>>() { // from class: X.0zFq
    }.getType();
    public static Map<String, PrivacyPrompt> LJFF = C2097608Jq.LJ();

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ() {
        /*
            X.0zFs r0 = X.C191871104n.LIZJ()
            r3 = 0
            if (r0 == 0) goto L1d
            java.lang.String r1 = r0.LIZLLL()
        Lb:
            java.lang.String r0 = X.C1888910zFp.LIZJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L18
            r0 = 0
            X.C1888910zFp.LJ = r0
            X.C1888910zFp.LIZJ = r1
        L18:
            boolean r0 = X.C1888910zFp.LJ
            if (r0 != 0) goto L6b
            goto L1f
        L1d:
            r1 = r3
            goto Lb
        L1f:
            X.0pdH r1 = X.C1888910zFp.LIZIZ     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = LIZIZ()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = r1.getString(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.reflect.Type r2 = X.C1888910zFp.LIZLLL     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L44
            java.io.StringReader r1 = new java.io.StringReader     // Catch: org.json.JSONException -> L3d java.lang.Throwable -> L4b
            r1.<init>(r0)     // Catch: org.json.JSONException -> L3d java.lang.Throwable -> L4b
            com.google.gson.Gson r0 = X.C1703730uR9.LIZ()     // Catch: org.json.JSONException -> L3d java.lang.Throwable -> L4b
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r0, r1, r2)     // Catch: org.json.JSONException -> L3d java.lang.Throwable -> L4b
            if (r1 != 0) goto L45
            goto L44
        L3d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4b
            r0.getMessage()     // Catch: java.lang.Throwable -> L4b
        L44:
            r1 = r3
        L45:
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L4b
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L4b
            goto L57
        L4b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L57:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L5e
            r3 = r1
        L5e:
            java.util.Map r3 = (java.util.Map) r3
            if (r3 != 0) goto L66
            java.util.Map r3 = X.C2097608Jq.LJ()
        L66:
            X.C1888910zFp.LJFF = r3
            r0 = 1
            X.C1888910zFp.LJ = r0
        L6b:
            java.util.Map<java.lang.String, com.ss.android.ugc.tiktok.tpsc.model.PrivacyPrompt> r0 = X.C1888910zFp.LJFF
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1888910zFp.LIZ():java.util.Map");
    }

    public static String LIZIZ() {
        String strLIZLLL;
        InterfaceC1888940zFs interfaceC1888940zFsLIZJ = C191871104n.LIZJ();
        if (interfaceC1888940zFsLIZJ == null || (strLIZLLL = interfaceC1888940zFsLIZJ.LIZLLL()) == null || strLIZLLL.length() == 0) {
            return "prompts";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prompts_");
        sbLIZ.append(strLIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZJ(Map map) {
        Unit unit;
        if (Intrinsics.LJFF(map, LJFF)) {
            return;
        }
        LJFF = map;
        if (map.isEmpty()) {
            LIZIZ.remove(LIZIZ());
            return;
        }
        try {
            String strLIZJ = C1888930zFr.LIZJ(map);
            if (strLIZJ != null) {
                LIZIZ.putString(LIZIZ(), strLIZJ);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
