package X;

/* JADX INFO: renamed from: X.13cv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20051513cv {
    public static final InterfaceC20051113cr LIZIZ(C20053713dH c20053713dH) {
        AbstractC20055413dY abstractC20055413dY = c20053713dH.LLJLLIL.LJ;
        Object obj = null;
        if ((abstractC20055413dY.LLILZ & 8) != 0) {
            loop0: while (true) {
                if ((abstractC20055413dY.LLILLL & 8) != 0) {
                    AbstractC20055413dY abstractC20055413dYLIZIZ = abstractC20055413dY;
                    C19968013Aw c19968013Aw = null;
                    do {
                        if (abstractC20055413dYLIZIZ instanceof InterfaceC20051113cr) {
                            if (((InterfaceC20051113cr) abstractC20055413dYLIZIZ).LLIIJI()) {
                                obj = abstractC20055413dYLIZIZ;
                                break loop0;
                            }
                        } else if ((abstractC20055413dYLIZIZ.LLILLL & 8) != 0 && (abstractC20055413dYLIZIZ instanceof AbstractC20055313dX)) {
                            int i = 0;
                            for (AbstractC20055413dY abstractC20055413dY2 = ((AbstractC20055313dX) abstractC20055413dYLIZIZ).LLJJI; abstractC20055413dY2 != null; abstractC20055413dY2 = abstractC20055413dY2.LLILZLL) {
                                if ((abstractC20055413dY2.LLILLL & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        abstractC20055413dYLIZIZ = abstractC20055413dY2;
                                    } else {
                                        if (c19968013Aw == null) {
                                            c19968013Aw = new C19968013Aw(new AbstractC20055413dY[16]);
                                        }
                                        if (abstractC20055413dYLIZIZ != null) {
                                            c19968013Aw.LIZLLL(abstractC20055413dYLIZIZ);
                                            abstractC20055413dYLIZIZ = null;
                                        }
                                        c19968013Aw.LIZLLL(abstractC20055413dY2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC20055413dYLIZIZ = C20052513d5.LIZIZ(c19968013Aw);
                    } while (abstractC20055413dYLIZIZ != null);
                    if ((abstractC20055413dY.LLILZ & 8) == 0 || (abstractC20055413dY = abstractC20055413dY.LLILZLL) == null) {
                        break;
                    }
                } else {
                    if ((abstractC20055413dY.LLILZ & 8) == 0) {
                        break;
                    }
                    break;
                    break;
                }
            }
        }
        return (InterfaceC20051113cr) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[PHI: r5
      0x0063: PHI (r5v2 X.13Aw) = (r5v1 X.13Aw), (r5v1 X.13Aw), (r5v4 X.13Aw) binds: [B:16:0x0032, B:18:0x0036, B:33:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[LOOP:1: B:7:0x0013->B:48:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C20068213fc LIZ(X.C20053713dH r8, boolean r9) {
        /*
            X.13dT r0 = r8.LLJLLIL
            X.13dY r4 = r0.LJ
            int r0 = r4.LLILZ
            r0 = r0 & 8
            r7 = 0
            if (r0 == 0) goto L18
        Lb:
            int r0 = r4.LLILLL
            r0 = r0 & 8
            if (r0 == 0) goto L6d
            r6 = r4
            r5 = r7
        L13:
            boolean r0 = r6 instanceof X.InterfaceC20051113cr
            if (r0 == 0) goto L2d
            r7 = r6
        L18:
            X.13dY r2 = r7.LJIJJ()
            X.13WG r1 = r8.LIZIZ()
            if (r1 != 0) goto L27
            X.13WG r1 = new X.13WG
            r1.<init>()
        L27:
            X.13fc r0 = new X.13fc
            r0.<init>(r2, r9, r8, r1)
            return r0
        L2d:
            int r0 = r6.LLILLL
            r0 = r0 & 8
            r3 = 1
            if (r0 == 0) goto L63
            boolean r0 = r6 instanceof X.AbstractC20055313dX
            if (r0 == 0) goto L63
            r0 = r6
            X.13dX r0 = (X.AbstractC20055313dX) r0
            X.13dY r2 = r0.LLJJI
            r1 = 0
        L3e:
            if (r2 == 0) goto L68
            int r0 = r2.LLILLL
            r0 = r0 & 8
            if (r0 == 0) goto L4b
            int r1 = r1 + 1
            if (r1 != r3) goto L4e
            r6 = r2
        L4b:
            X.13dY r2 = r2.LLILZLL
            goto L3e
        L4e:
            if (r5 != 0) goto L59
            X.13Aw r5 = new X.13Aw
            r0 = 16
            X.13dY[] r0 = new X.AbstractC20055413dY[r0]
            r5.<init>(r0)
        L59:
            if (r6 == 0) goto L5f
            r5.LIZLLL(r6)
            r6 = r7
        L5f:
            r5.LIZLLL(r2)
            goto L4b
        L63:
            X.13dY r6 = X.C20052513d5.LIZIZ(r5)
            goto L6a
        L68:
            if (r1 != r3) goto L63
        L6a:
            if (r6 == 0) goto L6d
            goto L13
        L6d:
            int r0 = r4.LLILZ
            r0 = r0 & 8
            if (r0 == 0) goto L18
            X.13dY r4 = r4.LLILZLL
            if (r4 == 0) goto L18
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20051513cv.LIZ(X.13dH, boolean):X.13fc");
    }
}
