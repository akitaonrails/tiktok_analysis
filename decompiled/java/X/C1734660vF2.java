package X;

import com.bytedance.android.livesdkapi.host.IHostPCS;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vF2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1734660vF2 {
    public static final C1734660vF2 LIZ = new C1734660vF2();
    public static JSONObject LIZIZ;
    public static long LIZJ;
    public static boolean LIZLLL;

    public static void LIZIZ() {
        String strT52;
        try {
            LIZLLL = true;
            LIZJ = LIZ();
            IHostPCS iHostPCS = (IHostPCS) C1161920gLG.LIZJ(IHostPCS.class);
            if (iHostPCS != null && (strT52 = iHostPCS.t52()) != null && strT52.length() != 0) {
                LIZIZ = new JSONObject(strT52);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static long LIZ() {
        Object c098200Yq;
        try {
            IHostUser iHostUser = (IHostUser) C1161920gLG.LIZJ(IHostUser.class);
            c098200Yq = Long.valueOf(iHostUser != null ? iHostUser.getCurUserId() : 0L);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = 0L;
        }
        return ((Number) c098200Yq).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009a A[PHI: r2
      0x009a: PHI (r2v4 java.lang.String) = (r2v3 java.lang.String), (r2v5 java.lang.String) binds: [B:38:0x0098, B:27:0x006c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(org.json.JSONObject r7) {
        /*
            java.lang.String r0 = "mobile"
            java.lang.String r6 = r7.optString(r0)
            r7 = 1
            if (r6 == 0) goto L2f
            int r0 = r6.length()
            if (r0 == 0) goto L2f
            r0 = 0
        L10:
            r4 = 0
            if (r0 != 0) goto L9b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r3 = r6.length()
            r2 = 0
        L1d:
            if (r2 >= r3) goto L31
            char r1 = r6.charAt(r2)
            boolean r0 = java.lang.Character.isDigit(r1)
            if (r0 == 0) goto L2c
            r5.append(r1)
        L2c:
            int r2 = r2 + 1
            goto L1d
        L2f:
            r0 = 1
            goto L10
        L31:
            java.lang.String r5 = r5.toString()
            int r0 = r5.length()
            if (r0 != 0) goto L5e
            r0 = 1
        L3c:
            if (r0 != 0) goto L9b
            com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsFormUxOptSetting r0 = com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsFormUxOptSetting.INSTANCE
            boolean r0 = r0.isUxOptEnabled()
            r3 = 7
            r2 = 43
            if (r0 == 0) goto L74
            int r0 = r5.length()
            if (r0 < r3) goto L9b
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r2)
            r0.append(r5)
            java.lang.String r2 = X.C2188811AlT.LIZIZ(r0)
            goto L60
        L5e:
            r0 = 0
            goto L3c
        L60:
            X.1BsN r1 = X.C2218571BsN.LIZJ()     // Catch: java.lang.Exception -> L6f
            X.1BsM r0 = r1.LJIIZILJ(r2, r4)     // Catch: java.lang.Exception -> L6f
            boolean r0 = r1.LJIIL(r0)     // Catch: java.lang.Exception -> L6f
            if (r0 != 0) goto L9a
            return r5
        L6f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r4
        L74:
            java.lang.CharSequence r0 = kotlin.text.a0.LJLJJL(r6)
            java.lang.String r0 = r0.toString()
            boolean r1 = kotlin.text.a0.LJJLIIIJJIZ(r0, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r1 == 0) goto L8a
            r0.append(r2)
        L8a:
            r0.append(r5)
            java.lang.String r2 = r0.toString()
            int r0 = r5.length()
            if (r0 >= r3) goto L98
            r7 = 0
        L98:
            if (r7 == 0) goto L9b
        L9a:
            return r2
        L9b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1734660vF2.LIZJ(org.json.JSONObject):java.lang.String");
    }

    public static String LIZLLL(String str) {
        String string;
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null || string.length() == 0) {
            return null;
        }
        Regex regex = new Regex("\\s+");
        if (!u.LJJIIJZLJL(string, "+", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("86/");
            sbLIZ.append(regex.replace(string, ""));
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        String strSubstring = string.substring(1);
        int length = strSubstring.length();
        int length2 = 0;
        while (true) {
            if (length2 >= length) {
                break;
            }
            if (!Character.isDigit(strSubstring.charAt(length2))) {
                if (length2 == -1) {
                    break;
                }
            } else {
                length2++;
            }
        }
        length2 = strSubstring.length();
        String strSubstring2 = strSubstring.substring(0, length2);
        String strReplace = regex.replace(strSubstring.substring(length2), "");
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strSubstring2);
        sbLIZ2.append('/');
        sbLIZ2.append(strReplace);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
