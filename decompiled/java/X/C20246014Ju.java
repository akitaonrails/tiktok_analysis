package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: renamed from: X.14Ju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20246014Ju {
    public static final C20246014Ju LIZIZ;
    public final C20245614Jq LIZ;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            LIZIZ = C20246214Jw.LJIILLIIL;
        } else {
            LIZIZ = C20245614Jq.LIZIZ;
        }
    }

    public final int LIZJ() {
        return this.LIZ.LJIIJJI().LIZLLL;
    }

    public final int LIZLLL() {
        return this.LIZ.LJIIJJI().LIZ;
    }

    public final int LJ() {
        return this.LIZ.LJIIJJI().LIZJ;
    }

    public final int LJFF() {
        return this.LIZ.LJIIJJI().LIZIZ;
    }

    public final boolean LJII() {
        return this.LIZ.LJIILJJIL();
    }

    public final WindowInsets LJIIJ() {
        C20245614Jq c20245614Jq = this.LIZ;
        if (c20245614Jq instanceof C20245514Jp) {
            return ((C20245514Jp) c20245614Jq).LIZJ;
        }
        return null;
    }

    public final int hashCode() {
        C20245614Jq c20245614Jq = this.LIZ;
        if (c20245614Jq == null) {
            return 0;
        }
        return c20245614Jq.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C20246014Ju(X.C20246014Ju r4) {
        /*
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L6b
            X.14Jq r2 = r4.LIZ
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L1f
            boolean r0 = r2 instanceof X.C20246214Jw
            if (r0 == 0) goto L36
            X.14Jw r1 = new X.14Jw
            r0 = r2
            X.14Jw r0 = (X.C20246214Jw) r0
            r1.<init>(r3, r0)
            r3.LIZ = r1
        L1b:
            r2.LJ(r3)
            return
        L1f:
            r0 = 29
            if (r1 >= r0) goto L36
            r0 = 28
            if (r1 < r0) goto L45
        L27:
            boolean r0 = r2 instanceof X.C20246114Jv
            if (r0 == 0) goto L45
            X.14Jv r1 = new X.14Jv
            r0 = r2
            X.14Jv r0 = (X.C20246114Jv) r0
            r1.<init>(r3, r0)
            r3.LIZ = r1
            goto L1b
        L36:
            boolean r0 = r2 instanceof X.C20246314Jx
            if (r0 == 0) goto L27
            X.14Jx r1 = new X.14Jx
            r0 = r2
            X.14Jx r0 = (X.C20246314Jx) r0
            r1.<init>(r3, r0)
            r3.LIZ = r1
            goto L1b
        L45:
            boolean r0 = r2 instanceof X.C14K1
            if (r0 == 0) goto L54
            X.14K1 r1 = new X.14K1
            r0 = r2
            X.14K1 r0 = (X.C14K1) r0
            r1.<init>(r3, r0)
            r3.LIZ = r1
            goto L1b
        L54:
            boolean r0 = r2 instanceof X.C20245514Jp
            if (r0 == 0) goto L63
            X.14Jp r1 = new X.14Jp
            r0 = r2
            X.14Jp r0 = (X.C20245514Jp) r0
            r1.<init>(r3, r0)
            r3.LIZ = r1
            goto L1b
        L63:
            X.14Jq r0 = new X.14Jq
            r0.<init>(r3)
            r3.LIZ = r0
            goto L1b
        L6b:
            X.14Jq r0 = new X.14Jq
            r0.<init>(r3)
            r3.LIZ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20246014Ju.<init>(X.14Ju):void");
    }

    public final C20244914Jj LIZ(int i) {
        return this.LIZ.LJI(i);
    }

    public final C20244914Jj LIZIZ(int i) {
        return this.LIZ.LJII(i);
    }

    public final boolean LJIIIIZZ(int i) {
        return this.LIZ.LJIILLIIL(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20246014Ju)) {
            return false;
        }
        return Objects.equals(this.LIZ, ((C20246014Ju) obj).LIZ);
    }

    public C20246014Ju(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.LIZ = new C20246214Jw(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.LIZ = new C20246314Jx(this, windowInsets);
        } else if (i >= 28) {
            this.LIZ = new C20246114Jv(this, windowInsets);
        } else {
            this.LIZ = new C14K1(this, windowInsets);
        }
    }

    public static C20246014Ju LJIIJJI(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C20246014Ju c20246014Ju = new C20246014Ju(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            c20246014Ju.LIZ.LJIJI(C14K4.LIZ(view));
            c20246014Ju.LIZ.LIZLLL(view.getRootView());
        }
        return c20246014Ju;
    }

    public final C20246014Ju LJIIIZ(int i, int i2, int i3, int i4) {
        C20246414Jy c20246414Jy = new C20246414Jy(this);
        c20246414Jy.LIZ.LJI(C20244914Jj.LIZIZ(i, i2, i3, i4));
        return c20246414Jy.LIZ();
    }

    public static C20244914Jj LJI(C20244914Jj c20244914Jj, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, c20244914Jj.LIZ - i);
        int iMax2 = Math.max(0, c20244914Jj.LIZIZ - i2);
        int iMax3 = Math.max(0, c20244914Jj.LIZJ - i3);
        int iMax4 = Math.max(0, c20244914Jj.LIZLLL - i4);
        if (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) {
            return c20244914Jj;
        }
        return C20244914Jj.LIZIZ(iMax, iMax2, iMax3, iMax4);
    }
}
