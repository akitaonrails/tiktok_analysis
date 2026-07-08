package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.08VP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08VP {
    public static final C08VP LIZ = new C08VP();
    public static final C830490Whz LIZIZ = new C830490Whz();
    public static C08VJ LIZJ;
    public static C08VJ LIZLLL;

    public final C08VJ LIZIZ(boolean z) {
        C08VJ c08vj;
        synchronized (this) {
            try {
                if (z) {
                    c08vj = LIZLLL;
                } else {
                    c08vj = LIZJ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c08vj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(android.content.Context r3, java.lang.String r4) {
        /*
            X.08VP r2 = X.C08VP.LIZ
            monitor-enter(r2)
            if (r4 == 0) goto Lb
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto Ld
        Lb:
            java.lang.String r4 = "0"
        Ld:
            X.0Whz r1 = X.C08VP.LIZIZ     // Catch: java.lang.Throwable -> L34
            boolean r0 = r1.containsKey(r4)     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L1d
            X.08VJ r0 = new X.08VJ     // Catch: java.lang.Throwable -> L34
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L34
            r1.put(r4, r0)     // Catch: java.lang.Throwable -> L34
        L1d:
            java.lang.Object r0 = r1.get(r4)     // Catch: java.lang.Throwable -> L34
            X.08VJ r0 = (X.C08VJ) r0     // Catch: java.lang.Throwable -> L34
            X.C08VP.LIZJ = r0     // Catch: java.lang.Throwable -> L34
            X.08VJ r0 = X.C08VP.LIZLLL     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L32
            X.08VJ r1 = new X.08VJ     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "global_app_key"
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L34
            X.C08VP.LIZLLL = r1     // Catch: java.lang.Throwable -> L34
        L32:
            monitor-exit(r2)
            return
        L34:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08VP.LIZJ(android.content.Context, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C08VJ LIZ(String str, boolean z) {
        C08VJ c08vj;
        synchronized (this) {
            try {
                if (z) {
                    c08vj = LIZLLL;
                } else {
                    C830490Whz c830490Whz = LIZIZ;
                    if (str == null || str.length() == 0) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    c08vj = (C08VJ) c830490Whz.get(str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c08vj;
    }
}
