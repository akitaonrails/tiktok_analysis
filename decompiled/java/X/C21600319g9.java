package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19g9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21600319g9 {
    public boolean LIZIZ;
    public final C21600419gA LIZ = new C21600419gA();
    public final C01GW LIZJ = C452501pT.LIZIZ(new C21601519gL());

    public final boolean LIZ() {
        if (this.LIZIZ && ((Boolean) C279300Ax6.LIZ.getValue()).booleanValue()) {
            return C21600419gA.LJIILLIIL || ((Boolean) this.LIZJ.getValue()).booleanValue();
        }
        return false;
    }

    public final void LIZIZ(InterfaceC21604319gn interfaceC21604319gn) {
        if (!LIZ()) {
            return;
        }
        try {
            this.LIZ.LIZIZ(interfaceC21604319gn);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LIZLLL(InterfaceC21604319gn interfaceC21604319gn) {
        if (!LIZ()) {
            return;
        }
        try {
            this.LIZ.LIZJ(interfaceC21604319gn);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[Catch: all -> 0x00b9, TryCatch #0 {all -> 0x00b9, blocks: (B:5:0x0007, B:9:0x002e, B:15:0x003d, B:20:0x0048, B:22:0x0069, B:23:0x006b, B:25:0x006f, B:27:0x007c, B:29:0x0080, B:30:0x0085, B:32:0x0089, B:33:0x0090, B:35:0x0094, B:36:0x0099, B:37:0x009c, B:38:0x00a9, B:40:0x00af, B:14:0x003c, B:19:0x0046), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080 A[Catch: all -> 0x00b9, TryCatch #0 {all -> 0x00b9, blocks: (B:5:0x0007, B:9:0x002e, B:15:0x003d, B:20:0x0048, B:22:0x0069, B:23:0x006b, B:25:0x006f, B:27:0x007c, B:29:0x0080, B:30:0x0085, B:32:0x0089, B:33:0x0090, B:35:0x0094, B:36:0x0099, B:37:0x009c, B:38:0x00a9, B:40:0x00af, B:14:0x003c, B:19:0x0046), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089 A[Catch: all -> 0x00b9, TryCatch #0 {all -> 0x00b9, blocks: (B:5:0x0007, B:9:0x002e, B:15:0x003d, B:20:0x0048, B:22:0x0069, B:23:0x006b, B:25:0x006f, B:27:0x007c, B:29:0x0080, B:30:0x0085, B:32:0x0089, B:33:0x0090, B:35:0x0094, B:36:0x0099, B:37:0x009c, B:38:0x00a9, B:40:0x00af, B:14:0x003c, B:19:0x0046), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094 A[Catch: all -> 0x00b9, TryCatch #0 {all -> 0x00b9, blocks: (B:5:0x0007, B:9:0x002e, B:15:0x003d, B:20:0x0048, B:22:0x0069, B:23:0x006b, B:25:0x006f, B:27:0x007c, B:29:0x0080, B:30:0x0085, B:32:0x0089, B:33:0x0090, B:35:0x0094, B:36:0x0099, B:37:0x009c, B:38:0x00a9, B:40:0x00af, B:14:0x003c, B:19:0x0046), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af A[Catch: all -> 0x00b9, LOOP:0: B:38:0x00a9->B:40:0x00af, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x00b9, blocks: (B:5:0x0007, B:9:0x002e, B:15:0x003d, B:20:0x0048, B:22:0x0069, B:23:0x006b, B:25:0x006f, B:27:0x007c, B:29:0x0080, B:30:0x0085, B:32:0x0089, B:33:0x0090, B:35:0x0094, B:36:0x0099, B:37:0x009c, B:38:0x00a9, B:40:0x00af, B:14:0x003c, B:19:0x0046), top: B:44:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(float r9, float r10) {
        /*
            r8 = this;
            boolean r0 = r8.LIZ()
            if (r0 != 0) goto L7
            return
        L7:
            X.19gA r3 = r8.LIZ     // Catch: java.lang.Throwable -> Lb9
            r2 = 1
            r3.LJIIIZ = r2     // Catch: java.lang.Throwable -> Lb9
            float r1 = r3.LIZ     // Catch: java.lang.Throwable -> Lb9
            float r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> Lb9
            float r9 = r9 - r1
            float r10 = r10 - r0
            double r4 = (double) r10     // Catch: java.lang.Throwable -> Lb9
            double r0 = (double) r9     // Catch: java.lang.Throwable -> Lb9
            double r0 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> Lb9
            double r4 = r4 / r0
            double r0 = java.lang.Math.abs(r4)     // Catch: java.lang.Throwable -> Lb9
            double r0 = java.lang.Math.atan(r0)     // Catch: java.lang.Throwable -> Lb9
            double r4 = java.lang.Math.toDegrees(r0)     // Catch: java.lang.Throwable -> Lb9
            r7 = 0
            int r6 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r6 <= 0) goto L32
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 <= 0) goto L32
            r0 = 360(0x168, float:5.04E-43)
            double r0 = (double) r0     // Catch: java.lang.Throwable -> Lb9
            goto L3d
        L32:
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            r1 = 180(0xb4, float:2.52E-43)
            if (r0 >= 0) goto L40
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 >= 0) goto L40
            double r0 = (double) r1     // Catch: java.lang.Throwable -> Lb9
        L3d:
            double r4 = r0 - r4
            goto L48
        L40:
            if (r6 <= 0) goto L48
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 >= 0) goto L48
            double r0 = (double) r1     // Catch: java.lang.Throwable -> Lb9
            double r4 = r4 + r0
        L48:
            r3.LJIIIIZZ = r4     // Catch: java.lang.Throwable -> Lb9
            android.view.VelocityTracker r0 = r3.LIZ()     // Catch: java.lang.Throwable -> Lb9
            r0.computeCurrentVelocity(r2)     // Catch: java.lang.Throwable -> Lb9
            android.view.VelocityTracker r0 = r3.LIZ()     // Catch: java.lang.Throwable -> Lb9
            float r0 = r0.getXVelocity()     // Catch: java.lang.Throwable -> Lb9
            r3.LJIIJ = r0     // Catch: java.lang.Throwable -> Lb9
            android.view.VelocityTracker r0 = r3.LIZ()     // Catch: java.lang.Throwable -> Lb9
            float r0 = r0.getYVelocity()     // Catch: java.lang.Throwable -> Lb9
            r3.LJIIJJI = r0     // Catch: java.lang.Throwable -> Lb9
            org.json.JSONObject r0 = r3.LJIIL     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto L6b
            r3.LJIILIIL = r0     // Catch: java.lang.Throwable -> Lb9
        L6b:
            boolean r0 = r3.LJ     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto L9c
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lb9
            long r0 = r3.LJFF     // Catch: java.lang.Throwable -> Lb9
            long r4 = r4 - r0
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L9c
            android.os.Handler r1 = X.C21600419gA.LJIJJ     // Catch: java.lang.Throwable -> Lb9
            if (r1 == 0) goto L85
            X.19gD r0 = r3.LJI     // Catch: java.lang.Throwable -> Lb9
            r1.removeCallbacks(r0)     // Catch: java.lang.Throwable -> Lb9
        L85:
            org.json.JSONObject r2 = r3.LJIILIIL     // Catch: java.lang.Throwable -> Lb9
            if (r2 == 0) goto L90
            java.lang.String r1 = "is_scroll_fail"
            java.lang.String r0 = "2"
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> Lb9
        L90:
            X.19gv r1 = X.C21600419gA.LJIJI     // Catch: java.lang.Throwable -> Lb9
            if (r1 == 0) goto L99
            org.json.JSONObject r0 = r3.LJIILIIL     // Catch: java.lang.Throwable -> Lb9
            r1.LIZ(r0)     // Catch: java.lang.Throwable -> Lb9
        L99:
            r0 = 0
            r3.LJIILIIL = r0     // Catch: java.lang.Throwable -> Lb9
        L9c:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb9
            r2.<init>()     // Catch: java.lang.Throwable -> Lb9
            r3.LJIIL = r2     // Catch: java.lang.Throwable -> Lb9
            java.util.HashSet<X.19gn> r0 = r3.LJIILJJIL     // Catch: java.lang.Throwable -> Lb9
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> Lb9
        La9:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto Lbd
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> Lb9
            X.19gn r0 = (X.InterfaceC21604319gn) r0     // Catch: java.lang.Throwable -> Lb9
            r0.LIZIZ(r2)     // Catch: java.lang.Throwable -> Lb9
            goto La9
        Lb9:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21600319g9.LIZJ(float, float):void");
    }
}
