package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18Jq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21264818Jq implements InterfaceC21265418Jw {
    public volatile View LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final float LJIIIIZZ;
    public final int LJIIIZ;
    public final float LJIIJ;

    @Override // X.InterfaceC21265418Jw
    public final View getView() {
        return this.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        if (r1.contains(java.lang.Integer.valueOf(r2)) == true) goto L12;
     */
    @Override // X.InterfaceC21265418Jw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LIZ(android.content.Context r9) {
        /*
            r8 = this;
            java.lang.Integer r2 = X.C20115913nJ.LIZ(r9)
            int r1 = r8.LIZIZ
            r3 = 1
            r7 = 0
            if (r2 == 0) goto Lc5
            int r0 = r2.intValue()
            if (r0 == r1) goto L36
            X.18Jo r1 = X.C21263918Jh.LIZJ
            if (r1 == 0) goto Lc5
            int r0 = r2.intValue()
            int r2 = r8.LIZIZ
            X.18Jv r1 = (X.C21265318Jv) r1
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> r1 = r1.LIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.get(r0)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 == 0) goto Lc5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.contains(r0)
            if (r0 != r3) goto Lc5
        L36:
            android.content.res.Resources r0 = r9.getResources()
            if (r0 == 0) goto Lc4
            android.content.res.Configuration r2 = r0.getConfiguration()
            if (r2 == 0) goto Lc4
            java.lang.String r6 = X.C838590Wv3.LIZ(r2)
            java.lang.String r5 = r8.LIZJ
            if (r6 == 0) goto Lc3
            if (r5 == 0) goto Lc3
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r5)
            if (r0 != 0) goto L70
            java.util.List<java.util.Set<java.lang.String>> r0 = X.C838590Wv3.LIZ
            java.util.Iterator r4 = r0.iterator()
        L58:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lc3
            java.lang.Object r1 = r4.next()
            java.util.Set r1 = (java.util.Set) r1
            boolean r0 = r1.contains(r6)
            if (r0 != 0) goto L70
            boolean r0 = r1.contains(r5)
            if (r0 == 0) goto L58
        L70:
            int r1 = r2.orientation
            int r0 = r8.LIZLLL
            if (r1 == r0) goto L77
            return r7
        L77:
            int r1 = r8.LJ
            int r0 = r2.uiMode
            if (r1 == r0) goto L88
            r1 = r1 & 48
            r0 = r0 & 48
            if (r1 == r0) goto L88
            X.18Jp r0 = X.C21263918Jh.LIZLLL
            if (r0 != 0) goto L88
            return r7
        L88:
            int r1 = r2.screenWidthDp
            int r0 = r8.LJFF
            if (r1 == r0) goto L8f
            return r7
        L8f:
            int r1 = r2.screenHeightDp
            int r0 = r8.LJI
            if (r1 == r0) goto L96
            return r7
        L96:
            int r1 = r2.smallestScreenWidthDp
            int r0 = r8.LJII
            if (r1 == r0) goto L9d
            return r7
        L9d:
            android.content.res.Resources r0 = r9.getResources()
            if (r0 == 0) goto Lc4
            android.util.DisplayMetrics r2 = r0.getDisplayMetrics()
            if (r2 == 0) goto Lc4
            float r1 = r2.density
            float r0 = r8.LJIIIIZZ
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto Lb2
            return r7
        Lb2:
            int r1 = r2.densityDpi
            int r0 = r8.LJIIIZ
            if (r1 == r0) goto Lb9
            return r7
        Lb9:
            float r1 = r2.scaledDensity
            float r0 = r8.LJIIJ
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto Lc2
            return r7
        Lc2:
            return r3
        Lc3:
            return r7
        Lc4:
            return r7
        Lc5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC21264818Jq.LIZ(android.content.Context):boolean");
    }

    public final void LIZIZ(View view) {
        if (this.LIZ == null) {
            synchronized (this) {
                try {
                    if (this.LIZ == null) {
                        this.LIZ = view;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public AbstractC21264818Jq(String str, int i, String str2, int i2, int i3, int i4, int i5, int i6, float f, int i7, float f2) {
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = i4;
        this.LJI = i5;
        this.LJII = i6;
        this.LJIIIIZZ = f;
        this.LJIIIZ = i7;
        this.LJIIJ = f2;
    }
}
