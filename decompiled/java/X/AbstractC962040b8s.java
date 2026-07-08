package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.ttnet.TTNetInit;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0b8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC962040b8s extends C0K04 {
    public final long LIZ = SystemClock.uptimeMillis();
    public final JSONObject LIZIZ = new JSONObject();
    public final JSONObject LIZJ = new JSONObject();
    public final JSONObject LIZLLL = new JSONObject();

    public abstract void LJIILIIL();

    public final void LJIIL() {
        LJIIJ(this.LIZJ, "cost", Long.valueOf(SystemClock.uptimeMillis() - this.LIZ), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017 A[PHI: r2 r7
      0x0017: PHI (r2v6 long) = (r2v1 long), (r2v2 long), (r2v3 long), (r2v7 long) binds: [B:24:0x007e, B:19:0x0069, B:14:0x0054, B:7:0x0015] A[DONT_GENERATE, DONT_INLINE]
      0x0017: PHI (r7v5 java.lang.String) = (r7v1 java.lang.String), (r7v2 java.lang.String), (r7v3 java.lang.String), (r7v6 java.lang.String) binds: [B:24:0x007e, B:19:0x0069, B:14:0x0054, B:7:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(java.lang.Throwable r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L3
            return
        L3:
            boolean r0 = r9 instanceof X.C501470JlZ
            if (r0 == 0) goto L42
            r1 = r9
            X.0JlZ r1 = (X.C501470JlZ) r1
            int r0 = r1.getErrorCode()
            long r2 = (long) r0
            java.lang.String r6 = r1.getErrorMsg()
            java.lang.String r7 = "ApiServerException"
            if (r6 != 0) goto L18
        L17:
            r6 = r7
        L18:
            java.lang.Class r0 = r9.getClass()
            java.lang.String r5 = r0.getName()
            org.json.JSONObject r1 = r8.LIZIZ
            java.lang.String r0 = "error_class"
            r4 = 1
            LJIIJ(r1, r0, r5, r4)
            org.json.JSONObject r1 = r8.LIZIZ
            java.lang.String r0 = "error_class_source"
            LJIIJ(r1, r0, r7, r4)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            org.json.JSONObject r1 = r8.LIZIZ
            java.lang.String r0 = "error_msg"
            LJIIJ(r1, r0, r2, r4)
            org.json.JSONObject r1 = r8.LIZLLL
            java.lang.String r0 = "error_detail"
            LJIIJ(r1, r0, r6, r4)
            return
        L42:
            boolean r0 = r9 instanceof X.C1811850xFX
            if (r0 == 0) goto L57
            r1 = r9
            X.0xFX r1 = (X.C1811850xFX) r1
            int r0 = r1.getCronetError()
            long r2 = (long) r0
            java.lang.String r6 = r1.getMessage()
            java.lang.String r7 = "NetworkErrorException"
            if (r6 != 0) goto L18
            goto L17
        L57:
            boolean r0 = r9 instanceof X.C501520Jle
            if (r0 == 0) goto L6c
            r1 = r9
            X.0Jle r1 = (X.C501520Jle) r1
            int r0 = r1.getErrorCode()
            long r2 = (long) r0
            java.lang.String r6 = r1.getMessage()
            java.lang.String r7 = "ApiException"
            if (r6 != 0) goto L18
            goto L17
        L6c:
            boolean r0 = r9 instanceof X.C1494690ozz
            if (r0 == 0) goto L81
            r1 = r9
            X.0ozz r1 = (X.C1494690ozz) r1
            int r0 = r1.getCronetInternalErrorCode()
            long r2 = (long) r0
            java.lang.String r6 = r1.getMessage()
            java.lang.String r7 = "CronetIOException"
            if (r6 != 0) goto L18
            goto L17
        L81:
            java.lang.String r6 = r9.getMessage()
            java.lang.String r7 = "unknow_exception"
            if (r6 != 0) goto L8a
            r6 = r7
        L8a:
            r2 = -1
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC962040b8s.LJIIJJI(java.lang.Throwable):void");
    }

    public final void LJIILJJIL(String str) {
        LJIIJ(this.LIZIZ, "event_id", str, true);
        LJIIJ(this.LIZLLL, "event_id", str, true);
        LJIIJ(this.LIZLLL, "network_type", Long.valueOf(TTNetInit.getEffectiveConnectionType()), true);
        LJIIJ(this.LIZLLL, "server_timestamp", Long.valueOf(C158B.LIZ()), true);
        LJIIJ(this.LIZLLL, "device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()), true);
        LJIILIIL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("eventId:");
        sbLIZ.append(str);
        sbLIZ.append(" extra:");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" category:");
        sbLIZ.append(this.LIZIZ);
        C944240agA.LJFF("ttlive_cohost", C2188811AlT.LIZIZ(sbLIZ));
        JSONObject jSONObject = this.LIZIZ;
        JSONObject jSONObject2 = this.LIZJ;
        JSONObject jSONObject3 = this.LIZLLL;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject3.put(next, jSONObject.opt(next));
        }
        Iterator<String> itKeys2 = jSONObject2.keys();
        while (itKeys2.hasNext()) {
            String next2 = itKeys2.next();
            jSONObject3.put(next2, jSONObject2.opt(next2));
        }
        C1CC2.LIZJ(((C962050b8t) this).LJ, jSONObject, jSONObject2, jSONObject3);
        C962910bAH.LIZJ(str, this.LIZLLL, this.LIZIZ, this.LIZJ, false, 0, false);
    }

    public static final void LJIIJ(JSONObject jSONObject, String str, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (jSONObject.has(str) && !z) {
            return;
        }
        if (obj instanceof Integer) {
            C0K04.LIZLLL(((Number) obj).intValue(), str, jSONObject);
            return;
        }
        if (obj instanceof Long) {
            C0K04.LJ(str, ((Number) obj).longValue(), jSONObject);
            return;
        }
        if (obj instanceof Float) {
            C0K04.LJIIIIZZ(jSONObject, str, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            C0K04.LIZJ(((Number) obj).doubleValue(), str, jSONObject);
            return;
        }
        if (obj instanceof String) {
            C0K04.LJFF(str, (String) obj, jSONObject);
            return;
        }
        if (obj instanceof Boolean) {
            C0K04.LJIIIZ(jSONObject, str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof JSONObject) {
            C0K04.LJII(str, jSONObject, (JSONObject) obj);
        } else if (obj instanceof JSONArray) {
            C0K04.LJI(str, (JSONArray) obj, jSONObject);
        } else {
            C0K04.LJFF(str, obj.toString(), jSONObject);
        }
    }
}
