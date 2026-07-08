package X;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13di, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20056413di {
    public final InterfaceC20055013dU LIZ;
    public final C19968013Aw<C20056313dh> LIZIZ = new C19968013Aw<>(new C20056313dh[16]);
    public final C19968013Aw<AbstractC1691330u79<?>> LIZJ = new C19968013Aw<>(new AbstractC1691330u79[16]);
    public final C19968013Aw<C20053713dH> LIZLLL = new C19968013Aw<>(new C20053713dH[16]);
    public final C19968013Aw<AbstractC1691330u79<?>> LJ = new C19968013Aw<>(new AbstractC1691330u79[16]);
    public boolean LJFF;

    public final void LIZ() {
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        this.LIZ.LJJI(new AwS574S0100000_30(this, 357));
    }

    public C20056413di(InterfaceC20055013dU interfaceC20055013dU) {
        this.LIZ = interfaceC20055013dU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [X.13Aw] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.13dY] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [X.13dY] */
    public static void LIZIZ(AbstractC20055413dY abstractC20055413dY, AbstractC1691330u79 abstractC1691330u79, Set set) {
        if (!abstractC20055413dY.LL.LLJILLL) {
            C1696250uF5.LIZIZ("visitSubtreeIf called on an unattached node");
        }
        C19968013Aw c19968013Aw = new C19968013Aw(new AbstractC20055413dY[16]);
        AbstractC20055413dY abstractC20055413dY2 = abstractC20055413dY.LL;
        AbstractC20055413dY abstractC20055413dY3 = abstractC20055413dY2.LLILZLL;
        if (abstractC20055413dY3 == null) {
            C20052513d5.LIZ(c19968013Aw, abstractC20055413dY2);
        } else {
            c19968013Aw.LIZLLL(abstractC20055413dY3);
        }
        while (true) {
            int i = c19968013Aw.LLILLL;
            if (i != 0) {
                AbstractC20055413dY abstractC20055413dY4 = (AbstractC20055413dY) c19968013Aw.LJIILIIL(i - 1);
                if ((abstractC20055413dY4.LLILZ & 32) != 0) {
                    AbstractC20055413dY abstractC20055413dY5 = abstractC20055413dY4;
                    do {
                        if ((abstractC20055413dY5.LLILLL & 32) != 0) {
                            ?? LIZIZ = abstractC20055413dY5;
                            ?? c19968013Aw2 = 0;
                            do {
                                if (LIZIZ instanceof InterfaceC1697440uH0) {
                                    InterfaceC1697440uH0 interfaceC1697440uH0 = (InterfaceC1697440uH0) LIZIZ;
                                    if (interfaceC1697440uH0 instanceof C20056313dh) {
                                        C20056313dh c20056313dh = (C20056313dh) interfaceC1697440uH0;
                                        if ((c20056313dh.LLJJ instanceof InterfaceC1697560uHC) && c20056313dh.LLJJIJI.contains(abstractC1691330u79)) {
                                            ((HashSet) set).add(interfaceC1697440uH0);
                                        }
                                    }
                                    if (!(!interfaceC1697440uH0.LJJL().LIZ(abstractC1691330u79))) {
                                        break;
                                    }
                                } else if ((LIZIZ.LLILLL & 32) != 0 && (LIZIZ instanceof AbstractC20055313dX)) {
                                    AbstractC20055413dY abstractC20055413dY6 = ((AbstractC20055313dX) LIZIZ).LLJJI;
                                    int i2 = 0;
                                    c19968013Aw2 = c19968013Aw2;
                                    LIZIZ = LIZIZ;
                                    while (abstractC20055413dY6 != null) {
                                        if ((abstractC20055413dY6.LLILLL & 32) != 0) {
                                            i2++;
                                            c19968013Aw2 = c19968013Aw2;
                                            if (i2 == 1) {
                                                LIZIZ = abstractC20055413dY6;
                                            } else {
                                                if (c19968013Aw2 == 0) {
                                                    c19968013Aw2 = new C19968013Aw(new AbstractC20055413dY[16]);
                                                }
                                                if (LIZIZ != 0) {
                                                    c19968013Aw2.LIZLLL(LIZIZ);
                                                    LIZIZ = 0;
                                                }
                                                c19968013Aw2.LIZLLL(abstractC20055413dY6);
                                            }
                                        }
                                        abstractC20055413dY6 = abstractC20055413dY6.LLILZLL;
                                        c19968013Aw2 = c19968013Aw2;
                                        LIZIZ = LIZIZ;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                LIZIZ = C20052513d5.LIZIZ(c19968013Aw2);
                            } while (LIZIZ != 0);
                        }
                        abstractC20055413dY5 = abstractC20055413dY5.LLILZLL;
                    } while (abstractC20055413dY5 != null);
                }
                C20052513d5.LIZ(c19968013Aw, abstractC20055413dY4);
            } else {
                return;
            }
        }
    }
}
