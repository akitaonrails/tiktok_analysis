package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment;

/* JADX INFO: renamed from: X.0z2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class RunnableC1880820z2m implements Runnable {
    public final /* synthetic */ GameDetailMixPageBaseFragment LL;
    public final /* synthetic */ C19YU LLILLJJLI;

    public RunnableC1880820z2m(GameDetailMixPageBaseFragment gameDetailMixPageBaseFragment, C19YU c19yu) {
        this.LL = gameDetailMixPageBaseFragment;
        this.LLILLJJLI = c19yu;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d A[PHI: r8 r9
      0x007d: PHI (r8v3 java.lang.String) = (r8v0 java.lang.String), (r8v4 java.lang.String) binds: [B:23:0x007b, B:21:0x0077] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r9v4 X.0z3c) = (r9v1 X.0z3c), (r9v5 X.0z3c) binds: [B:23:0x007b, B:21:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be A[PHI: r8 r9
      0x00be: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v3 java.lang.String), (r8v3 java.lang.String) binds: [B:23:0x007b, B:25:0x0081, B:27:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x00be: PHI (r9v2 X.0z3c) = (r9v1 X.0z3c), (r9v4 X.0z3c), (r9v4 X.0z3c) binds: [B:23:0x007b, B:25:0x0081, B:27:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r11 = this;
            com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageBaseFragment r7 = r11.LL
            X.19YU r6 = r11.LLILLJJLI
            X.01GW r0 = r7.LLJJIJIL
            java.lang.Object r0 = r0.getValue()
            java.util.HashSet r0 = (java.util.HashSet) r0
            int r1 = r0.size()
            int r0 = r6.getTabCount()
            if (r1 == r0) goto Lc2
            int r5 = r6.getTabCount()
            r4 = 0
            r3 = 0
        L1c:
            if (r3 >= r5) goto Lc2
            X.01GW r0 = r7.LLJJIJIL
            java.lang.Object r1 = r0.getValue()
            java.util.HashSet r1 = (java.util.HashSet) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Lba
            android.view.View r0 = r6.getChildAt(r4)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r0.getChildAt(r3)
            int r2 = r6.getScrollX()
            int r1 = r0.getLeft()
            int r0 = r0.getRight()
            if (r2 > r0) goto Lba
            int r0 = r6.getWidth()
            int r2 = r2 + r0
            if (r2 < r1) goto Lba
            X.01GW r0 = r7.LLJJIJIL
            java.lang.Object r1 = r0.getValue()
            java.util.HashSet r1 = (java.util.HashSet) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.add(r0)
            X.0z41 r0 = r7.LLJZIJLIL
            r10 = 0
            if (r0 == 0) goto Lc0
            X.0z3c r9 = r0.LJIIIZ()
            if (r9 == 0) goto L79
            X.0z6O r0 = r9.LJIIJJI()
            if (r0 == 0) goto L79
            X.0z4M r0 = r0.LJIIL(r3)
            if (r0 == 0) goto L79
            java.lang.String r8 = r0.LIZIZ
            if (r8 != 0) goto L7d
        L79:
            java.lang.String r8 = ""
            if (r9 == 0) goto Lbe
        L7d:
            X.0z6O r0 = r9.LJIIJJI()
            if (r0 == 0) goto Lbe
            X.0z4M r0 = r0.LJIIIZ()
            if (r0 == 0) goto Lbe
            java.lang.String r0 = r0.LIZIZ
        L8b:
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r8)
            java.lang.String r0 = "livesdk_gamepad_tab_show"
            X.0IjA r2 = X.C0IJT.LIZ(r0)
            X.C1880070z1Z.LIZ(r2, r9)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r0 = "is_default"
            r2.LJJII(r1, r0)
            java.lang.String r0 = "tab_name"
            r2.LJJII(r8, r0)
            if (r9 == 0) goto Lac
            X.0z5M r10 = X.C1882380z5I.LIZLLL(r9)
        Lac:
            java.util.Map r0 = X.C1882380z5I.LIZ(r10)
            java.util.Map r0 = X.C476770Imp.LJFF(r0)
            r2.LJJIIZI(r0)
            r2.LIZ()
        Lba:
            int r3 = r3 + 1
            goto L1c
        Lbe:
            r0 = r10
            goto L8b
        Lc0:
            r9 = r10
            goto L79
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1880820z2m.LIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("GameDetailMixPageBaseFragment@91f6.checkTabVisibilityReport$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GameDetailMixPageBaseFragment@91f6.checkTabVisibilityReport$1");
    }
}
