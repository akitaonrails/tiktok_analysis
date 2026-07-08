package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: X.19JA, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19JA {
    public static float[] LIZJ(String str) {
        float[] fArr = {0.0f, 0.0f};
        JSONArray jSONArray = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (jSONArray != null && jSONArray.length() == 2) {
            fArr[0] = (float) jSONArray.optDouble(0);
            fArr[1] = (float) jSONArray.optDouble(1);
        }
        return fArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r5.equals("bottom") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r5.equals("top") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r5.equals("left") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r5.equals("right") == false) goto L7;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(int r4, java.lang.String r5) {
        /*
            int r3 = r4 / 2
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L9
            return r3
        L9:
            r5.getClass()
            int r0 = r5.hashCode()
            r2 = 1
            r1 = 0
            switch(r0) {
                case -1383228885: goto L1e;
                case -1364013995: goto L27;
                case 115029: goto L30;
                case 3317767: goto L39;
                case 108511772: goto L42;
                default: goto L15;
            }
        L15:
            java.lang.String r0 = "%"
            boolean r0 = r5.endsWith(r0)
            if (r0 == 0) goto L64
            goto L4b
        L1e:
            java.lang.String r0 = "bottom"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L6f
            goto L15
        L27:
            java.lang.String r0 = "center"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L15
            return r3
        L30:
            java.lang.String r0 = "top"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L6e
            goto L15
        L39:
            java.lang.String r0 = "left"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L6e
            goto L15
        L42:
            java.lang.String r0 = "right"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L6f
            goto L15
        L4b:
            int r0 = r5.length()     // Catch: java.lang.NumberFormatException -> L5f
            int r0 = r0 - r2
            java.lang.String r0 = r5.substring(r1, r0)     // Catch: java.lang.NumberFormatException -> L5f
            float r0 = com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L5f
            float r1 = (float) r4     // Catch: java.lang.NumberFormatException -> L5f
            float r1 = r1 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
            int r0 = (int) r1     // Catch: java.lang.NumberFormatException -> L5f
            return r0
        L5f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        L64:
            int r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L69
            return r0
        L69:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        L6e:
            return r1
        L6f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19JA.LIZ(int, java.lang.String):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C19J9 LIZIZ(org.json.JSONObject r11, org.json.JSONObject r12) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19JA.LIZIZ(org.json.JSONObject, org.json.JSONObject):X.19J9");
    }
}
