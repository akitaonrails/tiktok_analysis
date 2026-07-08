package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08EK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08EK {
    public static JSONObject LIZ(Context context, String str) {
        try {
            return new JSONObject(LIZIZ(context, str));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(android.content.Context r6, java.lang.String r7) throws java.lang.Throwable {
        /*
            java.lang.String r5 = ""
            if (r6 != 0) goto L5
            return r5
        L5:
            r4 = 0
            android.content.res.AssetManager r0 = r6.getAssets()     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            java.io.InputStream r3 = r0.open(r7)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L47
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L64
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L64
            r0.<init>(r3)     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L64
            r2.<init>(r0)     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L64
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L62
            r1.<init>()     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L62
        L1d:
            java.lang.String r0 = r2.readLine()     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L62
            if (r0 == 0) goto L27
            r1.append(r0)     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L62
            goto L1d
        L27:
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L3f java.lang.Throwable -> L62
            if (r3 == 0) goto L35
            r3.close()     // Catch: java.io.IOException -> L31
            goto L35
        L31:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L35:
            r2.close()     // Catch: java.io.IOException -> L39
            goto L3e
        L39:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r1
        L3e:
            return r1
        L3f:
            r0 = move-exception
            goto L4a
        L41:
            r0 = move-exception
            r2 = r4
            goto L4a
        L44:
            r1 = move-exception
            r2 = r4
            goto L67
        L47:
            r0 = move-exception
            r2 = r4
            r3 = r2
        L4a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L62
            if (r3 == 0) goto L57
            r3.close()     // Catch: java.io.IOException -> L53
            goto L57
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L57:
            if (r2 == 0) goto L61
            r2.close()     // Catch: java.io.IOException -> L5d
            return r5
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L61:
            return r5
        L62:
            r1 = move-exception
            goto L66
        L64:
            r1 = move-exception
            r2 = r4
        L66:
            r4 = r3
        L67:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L6b
            goto L6d
        L6b:
            r1 = move-exception
            goto L67
        L6d:
            if (r4 == 0) goto L77
            r4.close()     // Catch: java.io.IOException -> L73
            goto L77
        L73:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L77:
            if (r2 == 0) goto L81
            r2.close()     // Catch: java.io.IOException -> L7d
            throw r1
        L7d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L81:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08EK.LIZIZ(android.content.Context, java.lang.String):java.lang.String");
    }
}
