package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.05WW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05WW {
    public static final C05WW LIZ = new C05WW();
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Effect> LIZJ = new ConcurrentHashMap<>();

    public final synchronized Effect LIZ(String str) {
        ConcurrentHashMap<String, Effect> concurrentHashMap;
        StringBuilder sbLIZ;
        concurrentHashMap = LIZJ;
        sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("textfont-");
        sbLIZ.append(str);
        return concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final synchronized Effect LIZJ(String str) {
        ConcurrentHashMap<String, Effect> concurrentHashMap;
        StringBuilder sbLIZ;
        concurrentHashMap = LIZJ;
        sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("speaking-voice-");
        sbLIZ.append(str);
        return concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.lang.String LIZIZ(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            r1 = 0
            if (r3 == 0) goto Lb
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 != 0) goto L33
            if (r4 == 0) goto L18
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L19
        L18:
            r1 = 1
        L19:
            if (r1 != 0) goto L33
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L37
            r0.append(r3)     // Catch: java.lang.Throwable -> L37
            r0.append(r4)     // Catch: java.lang.Throwable -> L37
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r0)     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = X.C05WW.LIZIZ     // Catch: java.lang.Throwable -> L37
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)
            return r0
        L33:
            java.lang.String r0 = ""
            monitor-exit(r2)
            return r0
        L37:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05WW.LIZIZ(java.lang.String, java.lang.String):java.lang.String");
    }
}
