package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0VY3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VY3 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZLLL(e, "executeMethodSafely", "ExceptionHelper", "executeMethodSafely", "");
        }
    }

    public static void LIZJ(Function0 function0) {
        if (function0 != null) {
            try {
                function0.invoke();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LIZLLL(e, "executeMethodSafely", "ExceptionHelper", "executeMethodSafely", "");
            }
        }
    }

    public static void LIZIZ(String str, Function0 function0) {
        if (function0 != null) {
            try {
                function0.invoke();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                LIZLLL(e, "executeMethodSafely", str, "executeMethodSafely", "");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(java.lang.Throwable r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17) {
        /*
            java.lang.String r4 = X.C1514430pVp.LIZIZ()
            java.lang.StackTraceElement r7 = new java.lang.StackTraceElement
            r11 = 0
            r0 = r17
            r1 = r16
            r7.<init>(r15, r1, r0, r11)
            java.lang.String r2 = X.C13SZ.LIZIZ(r13)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r5 = 5
            if (r0 != 0) goto L58
            java.lang.String r0 = "\n"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 6
            java.util.List r1 = kotlin.text.a0.LJJLIIIJILLIZJL(r2, r1, r11, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L58
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.util.Iterator r3 = r1.iterator()
            r2 = 0
        L34:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r2 == r5) goto L5b
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            r0 = 10
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r6.append(r0)
            int r2 = r2 + 1
            goto L34
        L58:
            java.lang.String r8 = ""
            goto L5f
        L5b:
            java.lang.String r8 = r6.toString()
        L5f:
            java.lang.Thread r0 = X.C786410Ut5.u3()
            java.lang.String r10 = r0.getName()
            java.lang.String r12 = "EnsureNotReachHere"
            r9 = r14
            X.0Vco r1 = X.C801800Vco.LJ(r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = "activity"
            r1.LIZ(r0, r4)
            im3.c.LIZ(r1)
            java.lang.StackTraceElement[] r1 = r13.getStackTrace()
            int r0 = r1.length
            if (r0 <= r5) goto L85
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r5]
            java.lang.System.arraycopy(r1, r11, r0, r11, r5)
            r13.setStackTrace(r0)
        L85:
            X.C1AF0.LJFF(r13, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VY3.LIZLLL(java.lang.Throwable, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
