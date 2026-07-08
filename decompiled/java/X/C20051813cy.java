package X;

/* JADX INFO: renamed from: X.13cy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20051813cy {
    public final C19968013Aw<C20053713dH> LIZ = new C19968013Aw<>(new C20053713dH[16]);
    public C20053713dH[] LIZIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [X.13dY] */
    public static void LIZ(C20053713dH c20053713dH) {
        if (c20053713dH.LLJLLL.LIZLLL == EnumC20047813cK.Idle && !c20053713dH.LJJIIZI() && !c20053713dH.LJJIJ() && !c20053713dH.LLLII && c20053713dH.LJIJJ()) {
            AbstractC20055413dY abstractC20055413dY = c20053713dH.LLJLLIL.LJ;
            if ((abstractC20055413dY.LLILZ & 256) != 0) {
                do {
                    if ((abstractC20055413dY.LLILLL & 256) != 0) {
                        ?? LIZIZ = abstractC20055413dY;
                        ?? c19968013Aw = 0;
                        do {
                            if (LIZIZ instanceof InterfaceC20051913cz) {
                                InterfaceC20051913cz interfaceC20051913cz = (InterfaceC20051913cz) LIZIZ;
                                interfaceC20051913cz.LLIIII(C20052513d5.LIZLLL(interfaceC20051913cz, 256));
                            } else if ((LIZIZ.LLILLL & 256) != 0 && (LIZIZ instanceof AbstractC20055313dX)) {
                                AbstractC20055413dY abstractC20055413dY2 = ((AbstractC20055313dX) LIZIZ).LLJJI;
                                int i = 0;
                                c19968013Aw = c19968013Aw;
                                LIZIZ = LIZIZ;
                                while (abstractC20055413dY2 != null) {
                                    if ((abstractC20055413dY2.LLILLL & 256) != 0) {
                                        i++;
                                        c19968013Aw = c19968013Aw;
                                        if (i == 1) {
                                            LIZIZ = abstractC20055413dY2;
                                        } else {
                                            if (c19968013Aw == 0) {
                                                c19968013Aw = new C19968013Aw(new AbstractC20055413dY[16]);
                                            }
                                            if (LIZIZ != 0) {
                                                c19968013Aw.LIZLLL(LIZIZ);
                                                LIZIZ = 0;
                                            }
                                            c19968013Aw.LIZLLL(abstractC20055413dY2);
                                        }
                                    }
                                    abstractC20055413dY2 = abstractC20055413dY2.LLILZLL;
                                    c19968013Aw = c19968013Aw;
                                    LIZIZ = LIZIZ;
                                }
                                if (i == 1) {
                                }
                            }
                            LIZIZ = C20052513d5.LIZIZ(c19968013Aw);
                        } while (LIZIZ != 0);
                    }
                    if ((abstractC20055413dY.LLILZ & 256) == 0) {
                        break;
                    } else {
                        abstractC20055413dY = abstractC20055413dY.LLILZLL;
                    }
                } while (abstractC20055413dY != null);
            }
        }
        c20053713dH.LLLI = false;
        C19968013Aw<C20053713dH> c19968013AwLJJIL = c20053713dH.LJJIL();
        C20053713dH[] c20053713dHArr = c19968013AwLJJIL.LL;
        int i2 = c19968013AwLJJIL.LLILLL;
        for (int i3 = 0; i3 < i2; i3++) {
            LIZ(c20053713dHArr[i3]);
        }
    }
}
