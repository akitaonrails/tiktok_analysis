package X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0gSL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1166310gSL extends AbstractC712240Rwk {
    public final WeakReference<C1846060y8i> LL;
    public int LLILLJJLI;
    public int LLILLL;

    public C1166310gSL(C1846060y8i c1846060y8i) {
        this.LL = new WeakReference<>(c1846060y8i);
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageScrollStateChanged(int i) {
        this.LLILLJJLI = this.LLILLL;
        this.LLILLL = i;
    }

    @Override // X.AbstractC712240Rwk
    public final void onPageSelected(int i) {
        boolean z;
        C1846060y8i c1846060y8i = this.LL.get();
        if (c1846060y8i == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageSelected position=");
        sbLIZ.append(i);
        sbLIZ.append(" selectedTabPosition=");
        sbLIZ.append(c1846060y8i.getSelectedTabPosition());
        sbLIZ.append(" tabCount=");
        sbLIZ.append(c1846060y8i.getTabCount());
        C20441214yg.LIZIZ("TuxTabBarViewPager2Exts", C2188811AlT.LIZIZ(sbLIZ));
        if (c1846060y8i.getSelectedTabPosition() != i && i < c1846060y8i.getTabCount()) {
            int i2 = this.LLILLL;
            boolean z2 = true;
            if (i2 != 0) {
                if (i2 == 2 && this.LLILLJJLI == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (0 == 0 && !z) {
                    z2 = false;
                }
            }
            c1846060y8i.LJIILL(c1846060y8i.LJII(i), z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020 A[PHI: r0
      0x0020: PHI (r0v6 boolean) = (r0v4 boolean), (r0v7 boolean) binds: [B:20:0x0026, B:15:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
    @Override // X.AbstractC712240Rwk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageScrolled(int r6, float r7, int r8) {
        /*
            r5 = this;
            java.lang.ref.WeakReference<X.0y8i> r0 = r5.LL
            java.lang.Object r4 = r0.get()
            X.0y8i r4 = (X.C1846060y8i) r4
            if (r4 != 0) goto Lb
            return
        Lb:
            int r2 = r5.LLILLL
            r1 = 2
            r3 = 0
            r0 = 1
            if (r2 != r1) goto L2e
            r2 = 1
        L13:
            int r1 = r5.LLILLJJLI
            if (r1 != r0) goto L29
            r0 = 1
        L18:
            r1 = 0
        L19:
            if (r2 == 0) goto L25
            if (r0 != 0) goto L25
            r0 = 0
        L1e:
            if (r1 != 0) goto L21
        L20:
            r3 = 1
        L21:
            r4.LJIJ(r6, r7, r0, r3)
            return
        L25:
            r0 = 1
            if (r2 == 0) goto L20
            goto L1e
        L29:
            r0 = 0
            if (r1 != 0) goto L18
            r1 = 1
            goto L19
        L2e:
            r2 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1166310gSL.onPageScrolled(int, float, int):void");
    }
}
