package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0DRo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339220DRo implements InterfaceC1246800iYA {
    public static final C339220DRo LIZ = new C339220DRo();

    @Override // X.InterfaceC1246800iYA
    public final float LIZJ(float f) {
        if (f > 495.0f) {
            return 495.0f;
        }
        return f;
    }

    @Override // X.InterfaceC1246800iYA
    public final float LIZ(float f) {
        return f - C418440Gaw.LIZIZ(Float.valueOf(25.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c A[PHI: r4
      0x003c: PHI (r4v1 double) = (r4v0 double), (r4v3 double) binds: [B:11:0x0031, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1246800iYA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.view.View r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L5d
            X.0DRo r0 = X.C339220DRo.LIZ
            r0.getClass()
            android.content.Context r7 = r9.getContext()
            if (r7 == 0) goto L5d
            android.app.Activity r1 = X.C1388190mED.LIZ(r7)
            if (r1 == 0) goto L5d
            r0 = 0
            X.0mG5 r6 = X.C1389340mG4.LIZJ(r1, r0)
            int r2 = r6.LIZIZ()
            int r0 = r6.LIZ()
            if (r2 >= r0) goto L23
            r2 = r0
        L23:
            r0 = 4602318531202457272(0x3fdeb851eb851eb8, double:0.48)
            double r2 = (double) r2
            double r2 = r2 * r0
            r4 = 4648928676283416576(0x4084500000000000, double:650.0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L3c
            r4 = 4646272256190709760(0x407ae00000000000, double:430.0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L3d
        L3c:
            r2 = r4
        L3d:
            int r0 = r6.LIZIZ()
            int r0 = r0 + (-60)
            double r4 = (double) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L5d
            android.content.res.Resources r0 = r7.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            double r0 = (double) r0
            double r2 = r2 * r0
            int r1 = (int) r2
            if (r1 <= 0) goto L5d
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            r0.width = r1
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C339220DRo.LIZLLL(android.view.View):void");
    }

    @Override // X.InterfaceC1246800iYA
    public final boolean LJ(Context context) {
        if (!((Boolean) C1097904Rd.LIZ.getValue()).booleanValue()) {
            return false;
        }
        C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(context, null);
        if (Math.min(c1389350mG5LIZJ.LIZIZ(), c1389350mG5LIZJ.LIZ()) > 650) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1246800iYA
    public final void LIZIZ(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("presenting", str);
        c2344009Gk.LJIIIIZZ("presented", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        C20684815ws.LJIILLIIL("tux_sheet_will_present", c2344009Gk.LIZ);
    }
}
