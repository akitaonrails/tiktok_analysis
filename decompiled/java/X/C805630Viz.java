package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Viz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805630Viz {
    public static final byte[] LJI = {80, 82, 79, 84};
    public static final byte[] LJII = {48, 48, 52};
    public static final byte[] LJIIIIZZ = {120, 86, 52, 18};
    public static final Pattern LJIIIZ = PatternProtector.compile("^com\\.bytedance(\\.\\w+)*$");
    public static JSONObject LJIIJ = null;
    public static JSONObject LJIIJJI = null;
    public ArrayList<String> LIZIZ;
    public ArrayList<String> LIZJ;
    public final ArrayList<String> LIZ = new ArrayList<>();
    public byte[] LIZLLL = null;
    public int LJ = 0;
    public boolean LJFF = true;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0367 A[PHI: r13 r24 r25
      0x0367: PHI (r13v6 byte[] A[IMMUTABLE_TYPE]) = (r13v4 byte[]), (r13v11 byte[]) binds: [B:154:0x0365, B:148:0x034d] A[DONT_GENERATE, DONT_INLINE]
      0x0367: PHI (r24v3 X.0Vj2) = (r24v1 X.0Vj2), (r24v4 X.0Vj2) binds: [B:154:0x0365, B:148:0x034d] A[DONT_GENERATE, DONT_INLINE]
      0x0367: PHI (r25v1 java.lang.String) = (r25v0 java.lang.String), (r25v2 java.lang.String) binds: [B:154:0x0365, B:148:0x034d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04f0 A[PHI: r0
      0x04f0: PHI (r0v156 long) = (r0v153 long), (r0v160 long), (r0v160 long), (r0v160 long) binds: [B:249:0x0517, B:238:0x04ea, B:239:0x04ec, B:240:0x04ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x04f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0494 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instruction units count: 1764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C805630Viz.LIZLLL():void");
    }

    public static boolean LIZ(JSONObject jSONObject) {
        if (LJIIJ == null) {
            LJIIJ = new JSONObject();
        }
        if (LJIIJJI == null) {
            LJIIJJI = new JSONObject();
        }
        try {
            String strOptString = jSONObject.optString("scope");
            if (strOptString.isEmpty() || !strOptString.startsWith("com.bytedance.")) {
                return false;
            }
            LJIIJJI.put(strOptString, jSONObject);
            LJIIJ.put(strOptString, 1);
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            return false;
        }
    }

    public static Long LIZIZ(Object obj) {
        if (obj == null || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (str.isEmpty()) {
            return null;
        }
        if (str.startsWith("0x") || str.startsWith("0X")) {
            try {
                return Long.valueOf(CastLongProtector.parseLong(str.substring(2), 16));
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public static boolean LIZJ(String str) {
        if (str.length() < 256 && LJIIIZ.matcher(str).matches()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|(9:3|(0)|(1:7)|22|9|(3:11|(4:14|(3:25|16|28)(1:27)|26|12)|24)|17|20|21)(1:8)|5|(0)|22|9|(0)|17|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        r0.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024 A[Catch: Exception -> 0x0057, TryCatch #0 {Exception -> 0x0057, blocks: (B:9:0x001f, B:11:0x0024, B:12:0x0028, B:14:0x002e, B:16:0x003c, B:17:0x0049), top: B:22:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(org.json.JSONObject r6) {
        /*
            if (r6 == 0) goto L1d
            java.lang.String r0 = "scope_list"
            org.json.JSONObject r5 = r6.optJSONObject(r0)
            java.lang.String r0 = "config_list"
            org.json.JSONObject r4 = r6.optJSONObject(r0)
            if (r5 != 0) goto L15
        L10:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
        L15:
            if (r4 != 0) goto L1f
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            goto L1f
        L1d:
            r4 = 0
            goto L10
        L1f:
            org.json.JSONObject r0 = X.C805630Viz.LJIIJJI     // Catch: java.lang.Exception -> L57
            r3 = 1
            if (r0 == 0) goto L49
            java.util.Iterator r2 = r0.keys()     // Catch: java.lang.Exception -> L57
        L28:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L57
            if (r0 == 0) goto L49
            org.json.JSONObject r1 = X.C805630Viz.LJIIJJI     // Catch: java.lang.Exception -> L57
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Exception -> L57
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L57
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch: java.lang.Exception -> L57
            if (r1 == 0) goto L28
            java.lang.String r0 = "scope"
            java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Exception -> L57
            r4.put(r0, r1)     // Catch: java.lang.Exception -> L57
            r5.put(r0, r3)     // Catch: java.lang.Exception -> L57
            goto L28
        L49:
            java.lang.String r0 = "com.bytedance.__default__"
            r5.put(r0, r3)     // Catch: java.lang.Exception -> L57
            java.lang.String r1 = "__default__.unwindstack.maps"
            java.lang.String r0 = "{ \"scope\": \"com.bytedance.__default__.unwindstack.maps\",\"signals\": [\"SIGSEGV\"], \"backtraces\":[ { \"elf_name\": \"libunwindstack.so\", \"symbol_name\": \"_ZN11unwindstack6Global19FindAndReadVariableEPNS_4MapsEPKc\", \"return_from_current_stack\": 1 }, { \"elf_name\": \"libunwindstack.so\", \"symbol_name\": \"_ZN11unwindstack15GlobalDebugImplINS_7DexFileEmNS_8Uint64_AEE14ForEachSymfileIZNS3_15GetFunctionNameEPNS_4MapsEmPNS_12SharedStringEPmEUlPS1_E_EEbS6_mT_\" }, { \"elf_name\": \"libunwindstack.so\", \"symbol_name\": \"_ZN11unwindstack15GlobalDebugImplINS_7DexFileEmNS_8Uint64_AEE15GetFunctionNameEPNS_4MapsEmPNS_12SharedStringEPm\" }, { \"elf_name\": \"libunwindstack.so\", \"symbol_name\": \"_ZN11unwindstack8Unwinder14FillInDexFrameEv\" } ] } "
            r4.put(r1, r0)     // Catch: java.lang.Exception -> L57
            goto L5e
        L57:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0.getMessage()
        L5e:
            X.C805630Viz.LJIIJ = r5
            X.C805630Viz.LJIIJJI = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C805630Viz.LJ(org.json.JSONObject):void");
    }
}
