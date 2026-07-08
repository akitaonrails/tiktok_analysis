package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: renamed from: X.0Qh0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C677000Qh0 {
    public final C1846140y8q LIZ;
    public final ViewOnAttachStateChangeListenerC20631115oD LIZIZ;
    public final InterfaceC677090Qh9 LIZJ;
    public InterfaceC1194850hCN LIZLLL;
    public boolean LJ;

    public final void LIZ() {
        if (this.LIZ.getTabCount() > 0) {
            int tabCount = this.LIZ.getTabCount() - 1;
            int currentItem = this.LIZIZ.getCurrentItem();
            if (currentItem <= tabCount) {
                tabCount = currentItem;
            }
            if (tabCount != this.LIZ.getSelectedTabPosition()) {
                C1846140y8q c1846140y8q = this.LIZ;
                c1846140y8q.LJIIJ(c1846140y8q.LJ(tabCount), true);
            }
        }
    }

    public final void LIZJ() {
        this.LIZ.LJII();
        InterfaceC1194850hCN interfaceC1194850hCN = this.LIZLLL;
        if (interfaceC1194850hCN != null) {
            int iLJIIIIZZ = interfaceC1194850hCN.getState().LJIIIIZZ();
            for (int i = 0; i < iLJIIIIZZ; i++) {
                C676930Qgt c676930QgtLJFF = this.LIZ.LJFF();
                this.LIZJ.LIZ(c676930QgtLJFF, i);
                C1846140y8q c1846140y8q = this.LIZ;
                c1846140y8q.LIZ(c676930QgtLJFF, c1846140y8q.LLJILJILJ.size(), false);
            }
            if (iLJIIIIZZ > 0) {
                int tabCount = this.LIZ.getTabCount() - 1;
                int currentItem = this.LIZIZ.getCurrentItem();
                if (currentItem <= tabCount) {
                    tabCount = currentItem;
                }
                if (tabCount != this.LIZ.getSelectedTabPosition()) {
                    C1846140y8q c1846140y8q2 = this.LIZ;
                    c1846140y8q2.LJIIJ(c1846140y8q2.LJ(tabCount), true);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028 A[LOOP:0: B:14:0x0026->B:15:0x0028, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r4, int r5) {
        /*
            r3 = this;
            if (r4 < 0) goto L3e
            X.0y8q r0 = r3.LIZ
            int r0 = r0.getTabCount()
            if (r4 > r0) goto L3e
            if (r5 <= 0) goto L3e
            X.0hCN r0 = r3.LIZLLL
            if (r0 != 0) goto L11
            return
        L11:
            X.15jK r0 = r0.getState()
            int r1 = r0.LJIIIIZZ()
            X.0y8q r0 = r3.LIZ
            int r0 = r0.getTabCount()
            int r1 = r1 - r0
            r2 = 0
            if (r1 >= 0) goto L3b
            r1 = 0
        L24:
            r5 = r1
        L25:
            int r5 = r5 + r4
        L26:
            if (r4 >= r5) goto L3e
            X.0y8q r0 = r3.LIZ
            X.0Qgt r1 = r0.LJFF()
            X.0Qh9 r0 = r3.LIZJ
            r0.LIZ(r1, r4)
            X.0y8q r0 = r3.LIZ
            r0.LIZ(r1, r4, r2)
            int r4 = r4 + 1
            goto L26
        L3b:
            if (r1 <= r5) goto L24
            goto L25
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C677000Qh0.LIZIZ(int, int):void");
    }

    public final void LIZLLL(int i, int i2) {
        int i3;
        if (i < 0) {
            return;
        }
        while (i < this.LIZ.getTabCount() && i2 > 0) {
            C1846140y8q c1846140y8q = this.LIZ;
            C676930Qgt c676930Qgt = c1846140y8q.LLJILLL;
            if (c676930Qgt != null) {
                i3 = c676930Qgt.LIZIZ;
            } else {
                i3 = 0;
            }
            c1846140y8q.LJIIIIZZ(i);
            C676930Qgt c676930Qgt2 = (C676930Qgt) ListProtector.remove(c1846140y8q.LLJILJILJ, i);
            C676930Qgt c676930Qgt3 = null;
            c676930Qgt2.LIZJ = null;
            c676930Qgt2.LIZLLL = null;
            c676930Qgt2.LIZ = null;
            c676930Qgt2.LJ = null;
            c676930Qgt2.LIZIZ = -1;
            C1846140y8q.LLLF.LIZ(c676930Qgt2);
            int size = c1846140y8q.LLJILJILJ.size();
            for (int i4 = i; i4 < size; i4++) {
                ((C676930Qgt) ListProtector.get(c1846140y8q.LLJILJILJ, i4)).LIZIZ = i4;
            }
            if (i3 == i) {
                if (!c1846140y8q.LLJILJILJ.isEmpty()) {
                    c676930Qgt3 = (C676930Qgt) ListProtector.get(c1846140y8q.LLJILJILJ, Math.max(0, i - 1));
                }
                c1846140y8q.LJIIJ(c676930Qgt3, true);
            }
            i2--;
        }
    }

    public C677000Qh0(C1846140y8q c1846140y8q, ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD, C676860Qgm c676860Qgm) {
        this.LIZ = c1846140y8q;
        this.LIZIZ = viewOnAttachStateChangeListenerC20631115oD;
        this.LIZJ = c676860Qgm;
    }
}
