package X;

/* JADX INFO: renamed from: X.0PPS, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PPS {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.view.View r3, java.lang.Runnable r4) {
        /*
            r2 = 0
            if (r3 == 0) goto L12
            android.view.ViewParent r1 = r3.getParent()
        L7:
            if (r1 == 0) goto L12
            boolean r0 = r1 instanceof X.C0PPU
            if (r0 == 0) goto L23
            r2 = r1
            X.0PPU r2 = (X.C0PPU) r2
            if (r2 != 0) goto L28
        L12:
            boolean r0 = r3.isAttachedToWindow()
            if (r0 != 0) goto L28
            X.0R48 r1 = new X.0R48
            r0 = 10
            r1.<init>(r4, r3, r0)
            r3.addOnAttachStateChangeListener(r1)
            return
        L23:
            android.view.ViewParent r1 = r1.getParent()
            goto L7
        L28:
            LIZIZ(r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PPS.LIZ(android.view.View, java.lang.Runnable):void");
    }

    public static void LIZIZ(final C0PPU c0ppu, final Runnable runnable) {
        if (c0ppu != null && c0ppu.getVisibility() != 0) {
            C0PPT c0ppt = new C0PPT() { // from class: X.0PPR
                @Override // X.C0PPT
                public final void LIZ() {
                    runnable.run();
                    c0ppu.LLJIJIL.LIZIZ().remove(this);
                }
            };
            if (c0ppu.LLILZLL && !c0ppu.LLILZIL) {
                return;
            }
            c0ppu.LLJIJIL.LIZIZ().add(c0ppt);
            return;
        }
        runnable.run();
    }
}
