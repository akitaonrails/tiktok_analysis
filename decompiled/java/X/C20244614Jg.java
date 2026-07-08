package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: renamed from: X.14Jg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20244614Jg {
    public static final C20244614Jg LIZIZ;
    public final C20244514Jf LIZ;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            LIZIZ = C20245114Jl.LJIJ;
        } else {
            LIZIZ = C20244514Jf.LIZJ;
        }
    }

    public final WindowInsets LIZJ() {
        C20244514Jf c20244514Jf = this.LIZ;
        if (c20244514Jf instanceof C20244714Jh) {
            return ((C20244714Jh) c20244514Jf).LIZLLL;
        }
        return null;
    }

    public final int hashCode() {
        C20244514Jf c20244514Jf = this.LIZ;
        if (c20244514Jf == null) {
            return 0;
        }
        return c20244514Jf.hashCode();
    }

    public C20244614Jg() {
        this.LIZ = new C20244514Jf(this);
    }

    public C20244614Jg(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.LIZ = new C20245114Jl(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.LIZ = new C20245314Jn(this, windowInsets);
        } else if (i >= 28) {
            this.LIZ = new C20245014Jk(this, windowInsets);
        } else {
            this.LIZ = new C14K2(this, windowInsets);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r2.getBoolean(r0) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(android.content.Context r7) {
        /*
            java.lang.String r3 = "android"
            r6 = 0
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r5 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "get"
            r4 = 1
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L33
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r6] = r0     // Catch: java.lang.Exception -> L33
            java.lang.reflect.Method r2 = r5.getMethod(r2, r1)     // Catch: java.lang.Exception -> L33
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L33
            java.lang.String r0 = "qemu.hw.mainkeys"
            r1[r6] = r0     // Catch: java.lang.Exception -> L33
            java.lang.Object r1 = r2.invoke(r5, r1)     // Catch: java.lang.Exception -> L33
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L33
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L33
            if (r0 != 0) goto L4b
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L33
            if (r0 == 0) goto L37
            goto L4c
        L33:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L37:
            android.content.res.Resources r2 = r7.getResources()
            java.lang.String r1 = "bool"
            java.lang.String r0 = "config_showNavigationBar"
            int r0 = X.C786410Ut5.n3(r2, r0, r1, r3)
            if (r0 <= 0) goto L4b
            boolean r0 = r2.getBoolean(r0)
            if (r0 != 0) goto L4c
        L4b:
            return r6
        L4c:
            android.content.res.Resources r2 = r7.getResources()
            java.lang.String r1 = "navigation_bar_height"
            java.lang.String r0 = "dimen"
            int r0 = X.C786410Ut5.n3(r2, r1, r0, r3)
            if (r0 <= 0) goto L5f
            int r0 = r2.getDimensionPixelSize(r0)
            return r0
        L5f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20244614Jg.LIZIZ(android.content.Context):int");
    }

    public final C20244814Ji LIZ(int i) {
        return this.LIZ.LJFF(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20244614Jg)) {
            return false;
        }
        return Objects.equals(this.LIZ, ((C20244614Jg) obj).LIZ);
    }

    public static C20244614Jg LIZLLL(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C20244614Jg c20244614Jg = new C20244614Jg(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            c20244614Jg.LIZ.LJIILL(C14JX.LIZ(view));
            c20244614Jg.LIZ.LIZLLL(view.getRootView());
        }
        return c20244614Jg;
    }
}
