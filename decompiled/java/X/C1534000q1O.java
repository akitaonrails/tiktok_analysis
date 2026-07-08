package X;

import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0q1O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534000q1O {
    public volatile AbstractC1533800q14 LIZ;

    public final boolean LIZIZ() {
        return this.LIZ.LJI();
    }

    public final File LIZJ() {
        return this.LIZ.LJIILL();
    }

    public final C1534010q1P LIZLLL() {
        AbstractC1533800q14 abstractC1533800q14 = this.LIZ;
        if (abstractC1533800q14 instanceof C1534010q1P) {
            return (C1534010q1P) abstractC1533800q14;
        }
        return null;
    }

    public final String toString() {
        return this.LIZ.toString();
    }

    public C1534000q1O(AbstractC1533800q14 abstractC1533800q14) {
        this.LIZ = abstractC1533800q14;
    }

    public final boolean LIZ(final C1533790q13 c1533790q13) {
        C1534010q1P c1534010q1P;
        C1534010q1P c1534010q1P2;
        AbstractC1533800q14 abstractC1533800q14 = this.LIZ;
        abstractC1533800q14.getClass();
        boolean z = false;
        if (abstractC1533800q14 instanceof C1532360pyk) {
            return false;
        }
        AbstractC1533800q14 abstractC1533800q142 = this.LIZ;
        if (abstractC1533800q142 instanceof C1534010q1P) {
            c1534010q1P = (C1534010q1P) abstractC1533800q142;
        } else {
            c1534010q1P = null;
        }
        if (c1534010q1P != null) {
            if (c1534010q1P.LJI()) {
                return true;
            }
            this.LIZ = c1534010q1P.LL;
        }
        if (!LIZIZ()) {
            return false;
        }
        synchronized (this) {
            try {
                AbstractC1533800q14 abstractC1533800q143 = this.LIZ;
                if ((abstractC1533800q143 instanceof C1534010q1P) && (c1534010q1P2 = (C1534010q1P) abstractC1533800q143) != null) {
                    if (c1534010q1P2.LJI()) {
                        return true;
                    }
                    this.LIZ = c1534010q1P2.LL;
                }
                if (!LIZIZ()) {
                    return false;
                }
                try {
                    C1534010q1P c1534010q1P3 = new C1534010q1P(this.LIZ, c1533790q13, null);
                    InterfaceC1534960q2w interfaceC1534960q2w = new InterfaceC1534960q2w() { // from class: X.0q1v
                        @Override // X.InterfaceC1534960q2w
                        public final void LIZIZ() {
                        }

                        @Override // X.InterfaceC1534960q2w
                        public final void onCreate() {
                        }

                        @Override // X.InterfaceC1534960q2w
                        public final void LIZ(C1534010q1P c1534010q1P4) {
                            C1533790q13 c1533790q132 = c1533790q13;
                            Unit unit = null;
                            try {
                                ResourceFetcher resourceFetcher = c1533790q132.LJIJJ;
                                if (resourceFetcher != null) {
                                    resourceFetcher.onBufferClose(c1533790q132, c1534010q1P4);
                                    unit = Unit.LIZ;
                                }
                                C189200o6.m2constructorimpl(unit);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                            }
                            if (c1534010q1P4.LJJJJJ() && !c1533790q13.LIZ.LJJIJIL.booleanValue() && c1533790q13.LIZLLL() == null) {
                                C1533790q13 c1533790q133 = c1533790q13;
                                if (c1533790q133.LJJIIZ) {
                                    C1534000q1O c1534000q1OLJ = c1533790q133.LJ();
                                    if (c1534000q1OLJ != null && c1534000q1OLJ.LIZLLL() == c1534010q1P4) {
                                        ResourceFetcher resourceFetcher2 = c1533790q13.LJIJJ;
                                        if (resourceFetcher2 == null || resourceFetcher2.isFileCommitted$forest_release() || c1533790q13.LIZLLL() != null) {
                                            return;
                                        }
                                        C086F c086f = C086F.LIZ;
                                        AwS567S0100000_23 awS567S0100000_23 = new AwS567S0100000_23(c1533790q13, 171);
                                        c086f.getClass();
                                        C086F.LJI(awS567S0100000_23);
                                        return;
                                    }
                                    Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
                                    C1533480q0Y.LIZJ("ForestBuffer", null, null, null, "should write file but no provider found", c1533790q13.LIZ.LJJJJIZL, null, null, null, c1534010q1P4, null, 7118);
                                }
                            }
                        }
                    };
                    if (c1534010q1P3.LLILZLL != null) {
                        C1533880q1C.LIZ("ForestBuffer", "setBufferListener", "duplicate handler registered", null, c1534010q1P3.LIZLLL());
                    } else {
                        c1534010q1P3.LLILZLL = interfaceC1534960q2w;
                    }
                    this.LIZ = c1534010q1P3;
                    z = true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    Function2<? super String, ? super C1535250q3P, Unit> function2 = C1533480q0Y.LIZ;
                    C1533480q0Y.LIZJ("ForestBuffer", null, null, null, "init ForestBuffer failed", c1533790q13.LIZ.LJJJJIZL, null, th, null, this.LIZ, null, 6734);
                }
                return z;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final InputStream LJ(C1533790q13 c1533790q13, boolean z) {
        Object c098200Yq;
        AbstractC1533800q14 abstractC1533800q14 = this.LIZ;
        abstractC1533800q14.getClass();
        if (abstractC1533800q14 instanceof C1532360pyk) {
            return this.LIZ.LJIILLIIL();
        }
        AbstractC1533800q14 abstractC1533800q142 = this.LIZ;
        try {
            byte[] bArrLJII = abstractC1533800q142.LJII();
            if (bArrLJII != null) {
                c098200Yq = new ByteArrayInputStream(bArrLJII);
            } else {
                C1534010q1P c1534010q1PLIZLLL = LIZLLL();
                if (c1534010q1PLIZLLL != null) {
                    c098200Yq = c1534010q1PLIZLLL.LJJJJJL(c1533790q13, z);
                } else {
                    c098200Yq = null;
                }
                if (c098200Yq == null && (c098200Yq = abstractC1533800q142.LJIILLIIL()) == null) {
                    File fileLJIILL = abstractC1533800q142.LJIILL();
                    if (fileLJIILL != null) {
                        c098200Yq = new C0VSP(fileLJIILL);
                    } else {
                        c098200Yq = null;
                    }
                }
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        InputStream inputStream = (InputStream) c098200Yq;
        if (inputStream == null) {
            return null;
        }
        if (inputStream instanceof C1534050q1T) {
            return inputStream;
        }
        return new C1534050q1T(c1533790q13, inputStream, this);
    }
}
