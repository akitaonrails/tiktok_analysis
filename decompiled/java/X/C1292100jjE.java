package X;

import android.content.Context;
import android.graphics.Canvas;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0jjE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1292100jjE extends SmartImageView {
    public Method LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;

    public C1292100jjE() {
        throw null;
    }

    public final boolean getScreenAntiBurnEnabled() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322090kVb, android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r9 = this;
            super.onAttachedToWindow()
            boolean r0 = r9.LLJ
            r8 = 0
            r4 = 1
            if (r0 != 0) goto L4b
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "Xiaomi"
            boolean r0 = kotlin.text.u.LJIJI(r0, r1, r4)
            if (r0 == 0) goto L54
            java.lang.String r7 = "ro.mi.os.version.name"
            java.lang.String r6 = ""
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r5 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L3c
            java.lang.String r3 = "get"
            r2 = 2
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L3c
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r8] = r0     // Catch: java.lang.Exception -> L3c
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r4] = r0     // Catch: java.lang.Exception -> L3c
            java.lang.reflect.Method r1 = r5.getMethod(r3, r1)     // Catch: java.lang.Exception -> L3c
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L3c
            r0[r8] = r7     // Catch: java.lang.Exception -> L3c
            r0[r4] = r6     // Catch: java.lang.Exception -> L3c
            java.lang.Object r0 = r1.invoke(r5, r0)     // Catch: java.lang.Exception -> L3c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L3c
            r6 = r0
            goto L40
        L3c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L40:
            int r0 = r6.length()
            if (r0 <= 0) goto L54
            r0 = 1
        L47:
            r9.LLJI = r0
            r9.LLJ = r4
        L4b:
            boolean r0 = r9.LLJI
            if (r0 == 0) goto L82
            java.lang.reflect.Method r0 = r9.LLIZLLLIL
            if (r0 != 0) goto L82
            goto L56
        L54:
            r0 = 0
            goto L47
        L56:
            java.lang.Class<android.view.View> r3 = android.view.View.class
            java.lang.String r2 = "setScreenAntiBurnEnabledNew"
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L6b
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L6b
            r1[r8] = r0     // Catch: java.lang.Throwable -> L6b
            java.lang.reflect.Method r1 = r3.getDeclaredMethod(r2, r1)     // Catch: java.lang.Throwable -> L6b
            r1.setAccessible(r4)     // Catch: java.lang.Throwable -> L6b
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L6b
            goto L77
        L6b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L77:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L7e
            r1 = 0
        L7e:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r9.LLIZLLLIL = r1
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1292100jjE.onAttachedToWindow():void");
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public C1292100jjE(Context context) {
        super(context, null, 0);
    }

    private final void setScreenAntiBurnEnabled(boolean z) {
        Object c098200Yq;
        try {
            Method method = this.LLIZLLLIL;
            c098200Yq = null;
            if (method != null) {
                c098200Yq = C2204961BRm.a0(method, this, new Object[]{Boolean.valueOf(z)}, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOKnbpre3TXNp1lvjxwhvHw7Ls/UuB9TUteicOzN14qBV0Bj0NPgTab+MyOO5T/sgbH4YucpKhQ=", null));
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            if (this.LLJI) {
                setScreenAntiBurnEnabled(false);
            }
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }
}
