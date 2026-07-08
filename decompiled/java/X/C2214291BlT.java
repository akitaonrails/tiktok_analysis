package X;

import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS400S0200000_34;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: renamed from: X.1BlT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214291BlT extends C0Y8U implements C19CP {
    public static Application LIZIZ;
    public static final C2214291BlT LIZ = new C2214291BlT();
    public static final ConcurrentHashMap<InterfaceC2214261BlQ, C2214251BlP> LIZJ = new ConcurrentHashMap<>();

    public static void LJJJLL(Function1 function1) {
        C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
        while (c2174008fS.hasNext()) {
            function1.invoke(c2174008fS.next());
        }
    }

    @Override // X.C0Y8U, X.C19AH
    public final void LIZ(Scene scene) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) c2174008fS.next();
                AbstractC1387200mCc c198s = new C198S(scene);
                C520050KaR c520050KaR = new C520050KaR(c198s);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                    c198s = abstractC1387200mCc2;
                } else {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                                c198s = abstractC1387200mCc;
                            } else {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ.LJIILL(c198s);
            }
        }
    }

    @Override // X.C0Y8U, X.C19AH
    public final void LIZJ(Scene scene) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) c2174008fS.next();
                AbstractC1387200mCc c198s = new C198S(scene);
                C520050KaR c520050KaR = new C520050KaR(c198s);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                    c198s = abstractC1387200mCc2;
                } else {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                                c198s = abstractC1387200mCc;
                            } else {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ.LIZIZ(c198s);
            }
        }
    }

    @Override // X.C0Y8U, X.C19AH
    public final void LIZLLL(Scene scene) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) c2174008fS.next();
                AbstractC1387200mCc c198s = new C198S(scene);
                C520050KaR c520050KaR = new C520050KaR(c198s);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                    c198s = abstractC1387200mCc2;
                } else {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                                c198s = abstractC1387200mCc;
                            } else {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ.LJIIIZ(c198s);
            }
        }
    }

    @Override // X.C19CP
    public final void LJ(InterfaceC214902198i interfaceC214902198i) {
        LJJJLL(new AwS613S0100000_34(interfaceC214902198i, 28));
    }

    @Override // X.C19CP
    public final void LJFF(InterfaceC214902198i interfaceC214902198i) {
        LJJJLL(new C2214321BlW(interfaceC214902198i));
    }

    @Override // X.C19CP
    public final void LJI(InterfaceC214902198i interfaceC214902198i) {
        LJJJLL(new C2214311BlV(interfaceC214902198i));
    }

    @Override // X.C0Y8U, X.C19AH
    public final void LJIIIIZZ(Scene scene) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) c2174008fS.next();
                AbstractC1387200mCc c198s = new C198S(scene);
                C520050KaR c520050KaR = new C520050KaR(c198s);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                    c198s = abstractC1387200mCc2;
                } else {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                                c198s = abstractC1387200mCc;
                            } else {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ.LIZLLL(c198s);
            }
        }
    }

    @Override // X.C0Y8U, X.C19AH
    public final void LJIIIZ(Scene scene) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) c2174008fS.next();
                AbstractC1387200mCc c198s = new C198S(scene);
                C520050KaR c520050KaR = new C520050KaR(c198s);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                    c198s = abstractC1387200mCc2;
                } else {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                                c198s = abstractC1387200mCc;
                            } else {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ.LJ(c198s);
            }
        }
    }

    @Override // X.C19CP
    public final void LJIIJ(InterfaceC214902198i interfaceC214902198i) {
        LJJJLL(new AwS613S0100000_34(interfaceC214902198i, 23));
    }

    @Override // X.C0Y8U, X.C19AH
    public final void LJIILIIL(Scene scene) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) c2174008fS.next();
                AbstractC1387200mCc c198s = new C198S(scene);
                C520050KaR c520050KaR = new C520050KaR(c198s);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                    c198s = abstractC1387200mCc2;
                } else {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                                c198s = abstractC1387200mCc;
                            } else {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ.LJIIJJI(c198s);
            }
        }
    }

    @Override // X.C19CP
    public final void LJIILL(InterfaceC214902198i interfaceC214902198i) {
        LJJJLL(new C2214351BlZ(interfaceC214902198i));
    }

    @Override // X.C19CP
    public final void LJIJ(InterfaceC214902198i interfaceC214902198i) {
        LJJJLL(new C2214361Bla(interfaceC214902198i));
    }

    @Override // X.C0Y8U, X.C19AH
    public final void LJIJJ(Scene scene) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) c2174008fS.next();
                AbstractC1387200mCc c198s = new C198S(scene);
                C520050KaR c520050KaR = new C520050KaR(c198s);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                    c198s = abstractC1387200mCc2;
                } else {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                                c198s = abstractC1387200mCc;
                            } else {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ.LJJ(c198s);
            }
        }
    }

    @Override // X.C19CP
    public final void LJIL(InterfaceC214902198i interfaceC214902198i) {
        LJJJLL(new AwS613S0100000_34(interfaceC214902198i, 22));
    }

    @Override // X.C0Y8U, X.C19AH
    public final void LJJ(Scene scene) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) c2174008fS.next();
                AbstractC1387200mCc c198s = new C198S(scene);
                C520050KaR c520050KaR = new C520050KaR(c198s);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                    c198s = abstractC1387200mCc2;
                } else {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                                c198s = abstractC1387200mCc;
                            } else {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ.LJIJJ(c198s);
            }
        }
    }

    @Override // X.C0Y8U, X.C19AH
    public final void LJJIFFI(Scene scene) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) c2174008fS.next();
                AbstractC1387200mCc c198s = new C198S(scene);
                C520050KaR c520050KaR = new C520050KaR(c198s);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                    c198s = abstractC1387200mCc2;
                } else {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                                c198s = abstractC1387200mCc;
                            } else {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ.LJIIIIZZ(c198s);
            }
        }
    }

    @Override // X.C19CP
    public final void LJJII(InterfaceC214902198i interfaceC214902198i) {
        LJJJLL(new AwS613S0100000_34(interfaceC214902198i, 21));
    }

    @Override // X.C0Y8U, X.C19AH
    public final void LJJIIJ(Scene scene) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) c2174008fS.next();
                AbstractC1387200mCc c198s = new C198S(scene);
                C520050KaR c520050KaR = new C520050KaR(c198s);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                    c198s = abstractC1387200mCc2;
                } else {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                                c198s = abstractC1387200mCc;
                            } else {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ.LIZJ(c198s);
            }
        }
    }

    @Override // X.C19CP
    public final void LJJIIJZLJL(InterfaceC214902198i interfaceC214902198i) {
        LJJJLL(new AwS613S0100000_34(interfaceC214902198i, 27));
    }

    @Override // X.C0Y8U, X.C19AH
    public final void LJJIIZ(Scene scene) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) c2174008fS.next();
                AbstractC1387200mCc c198s = new C198S(scene);
                C520050KaR c520050KaR = new C520050KaR(c198s);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                    c198s = abstractC1387200mCc2;
                } else {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                                c198s = abstractC1387200mCc;
                            } else {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ.LJIILJJIL(c198s);
            }
        }
    }

    @Override // X.C19CP
    public final void LJJIJIL(InterfaceC214902198i interfaceC214902198i) {
        LJJJLL(new C2214341BlY(interfaceC214902198i));
    }

    @Override // X.C19CP
    public final void LJJIJL(InterfaceC214902198i interfaceC214902198i) {
        LJJJLL(new AwS613S0100000_34(interfaceC214902198i, 30));
    }

    @Override // X.C19CP
    public final void LJJIJLIJ(InterfaceC214902198i interfaceC214902198i) {
        LJJJLL(new C2214331BlX(interfaceC214902198i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C19CP
    public final void LJJIL(InterfaceC214902198i interfaceC214902198i) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (interfaceC214902198i instanceof Fragment) {
            AbstractC1387200mCc c1844400y62 = new C1844400y62((Fragment) interfaceC214902198i);
            C520050KaR c520050KaR = new C520050KaR(c1844400y62);
            C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
            C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
            if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                c1844400y62 = abstractC1387200mCc2;
            } else {
                synchronized (c830530Wi3) {
                    try {
                        C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                        if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                            c1844400y62 = abstractC1387200mCc;
                        } else {
                            c830530Wi3.put(c520050KaR, c520050KaR);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            C2214211BlL.LIZ(c1844400y62);
            LJJJLL(new AwS613S0100000_34(interfaceC214902198i, 26));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC214902198i);
        sbLIZ.append(" is not a Fragment!");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    @Override // X.C0Y8U, X.C19AH
    public final void LJJIZ(Scene scene) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) c2174008fS.next();
                AbstractC1387200mCc c198s = new C198S(scene);
                C520050KaR c520050KaR = new C520050KaR(c198s);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                    c198s = abstractC1387200mCc2;
                } else {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                                c198s = abstractC1387200mCc;
                            } else {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ.LJIJJLI(c198s);
            }
        }
    }

    @Override // X.C0Y8U, X.C19AH
    public final void LJJJ(Scene scene) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        AbstractC1387200mCc c198s = new C198S(scene);
        C520050KaR c520050KaR = new C520050KaR(c198s);
        C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
        C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
        if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
            c198s = abstractC1387200mCc2;
        } else {
            synchronized (c830530Wi3) {
                try {
                    C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                    if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                        c198s = abstractC1387200mCc;
                    } else {
                        c830530Wi3.put(c520050KaR, c520050KaR);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C2214211BlL.LIZ(c198s);
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                ((InterfaceC2214261BlQ) c2174008fS.next()).LJIJI(c198s);
            }
        }
    }

    @Override // X.C19CP
    public final void LJJJJI(InterfaceC214902198i interfaceC214902198i) {
        LJJJLL(new AwS613S0100000_34(interfaceC214902198i, 25));
    }

    @Override // X.C0Y8U, X.C19AH
    public final void LJJJJIZL(Scene scene) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) c2174008fS.next();
                AbstractC1387200mCc c198s = new C198S(scene);
                C520050KaR c520050KaR = new C520050KaR(c198s);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                    c198s = abstractC1387200mCc2;
                } else {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                                c198s = abstractC1387200mCc;
                            } else {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ.LJFF(c198s);
            }
        }
    }

    @Override // X.C0Y8U, X.C19AH
    public final void LJJJJL(Scene scene) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) c2174008fS.next();
                AbstractC1387200mCc c198s = new C198S(scene);
                C520050KaR c520050KaR = new C520050KaR(c198s);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                    c198s = abstractC1387200mCc2;
                } else {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                                c198s = abstractC1387200mCc;
                            } else {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ.LJIL(c198s);
            }
        }
    }

    @Override // X.C19CP
    public final void LJJJJLI(InterfaceC214902198i interfaceC214902198i) {
        LJJJLL(new AwS613S0100000_34(interfaceC214902198i, 24));
    }

    @Override // X.C19CP
    public final void LJJJJZI(InterfaceC214902198i interfaceC214902198i) {
        LJJJLL(new AwS613S0100000_34(interfaceC214902198i, 29));
    }

    @Override // X.C19CP
    public final void LIZIZ(InterfaceC214902198i interfaceC214902198i, Bundle bundle) {
        LJJJLL(new AwS400S0200000_34(interfaceC214902198i, bundle, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0Y8U, X.C19AH
    public final void LJIIJJI(Scene scene, Bundle bundle) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) c2174008fS.next();
                AbstractC1387200mCc c198s = new C198S(scene);
                C520050KaR c520050KaR = new C520050KaR(c198s);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                    c198s = abstractC1387200mCc2;
                } else {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                                c198s = abstractC1387200mCc;
                            } else {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ.LJIIZILJ(c198s, bundle);
            }
            return;
        }
        ((InterfaceC20630715o9) scene).oo(LIZ, bundle);
    }

    @Override // X.C0Y8U, X.C19AH
    public final void LJIIL(Scene scene, Bundle bundle) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) c2174008fS.next();
                AbstractC1387200mCc c198s = new C198S(scene);
                C520050KaR c520050KaR = new C520050KaR(c198s);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                    c198s = abstractC1387200mCc2;
                } else {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                                c198s = abstractC1387200mCc;
                            } else {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ.LJIJ(c198s, bundle);
            }
        }
    }

    @Override // X.C19CP
    public final void LJIJI(InterfaceC214902198i interfaceC214902198i, Bundle bundle) {
        LJJJLL(new AwS400S0200000_34(interfaceC214902198i, bundle, 3));
    }

    @Override // X.C0Y8U, X.C19AH
    public final void LJIJJLI(Scene scene, Bundle bundle) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) c2174008fS.next();
                AbstractC1387200mCc c198s = new C198S(scene);
                C520050KaR c520050KaR = new C520050KaR(c198s);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                    c198s = abstractC1387200mCc2;
                } else {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                                c198s = abstractC1387200mCc;
                            } else {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ.LJIILLIIL(c198s, bundle);
            }
        }
    }

    @Override // X.C19CP
    public final void LJJIJ(InterfaceC214902198i interfaceC214902198i, Bundle bundle) {
        LJJJLL(new AwS400S0200000_34(interfaceC214902198i, bundle, 2));
    }

    @Override // X.C0Y8U, X.C19AH
    public final void LJJIJIIJIL(Scene scene, Bundle bundle) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) c2174008fS.next();
                AbstractC1387200mCc c198s = new C198S(scene);
                C520050KaR c520050KaR = new C520050KaR(c198s);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                    c198s = abstractC1387200mCc2;
                } else {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                                c198s = abstractC1387200mCc;
                            } else {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ.LJIIJ(c198s, bundle);
            }
        }
    }

    @Override // X.C19CP
    public final void LJJJIL(InterfaceC214902198i interfaceC214902198i, Bundle bundle) {
        LJJJLL(new C2214271BlR(interfaceC214902198i, bundle));
    }

    @Override // X.C19CP
    public final void LJJJJJ(InterfaceC214902198i interfaceC214902198i, Bundle bundle) {
        LJJJLL(new C2214301BlU(interfaceC214902198i, bundle));
    }

    @Override // X.C19CP
    public final void LJJJJJL(InterfaceC214902198i interfaceC214902198i, Bundle bundle) {
        LJJJLL(new C2214281BlS(interfaceC214902198i, bundle));
    }

    @Override // X.C19CP
    public final void LJJJJLL(InterfaceC214902198i interfaceC214902198i, Bundle bundle) {
        LJJJLL(new AwS400S0200000_34(interfaceC214902198i, bundle, 4));
    }

    @Override // X.C0Y8U, X.C19AH
    public final void LJJJJZ(Scene scene, Bundle bundle) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) c2174008fS.next();
                AbstractC1387200mCc c198s = new C198S(scene);
                C520050KaR c520050KaR = new C520050KaR(c198s);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                    c198s = abstractC1387200mCc2;
                } else {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                                c198s = abstractC1387200mCc;
                            } else {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ.LJIILIIL(c198s, bundle);
            }
        }
    }

    @Override // X.C0Y8U, X.C19AH
    public final void LJJJLIIL(Scene scene, Bundle bundle) {
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        if (!(scene instanceof InterfaceC20630715o9)) {
            C2174008fS c2174008fS = new C2174008fS(LIZJ.keys());
            while (c2174008fS.hasNext()) {
                InterfaceC2214261BlQ interfaceC2214261BlQ = (InterfaceC2214261BlQ) c2174008fS.next();
                AbstractC1387200mCc c198s = new C198S(scene);
                C520050KaR c520050KaR = new C520050KaR(c198s);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
                C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
                if (c520050KaR2 != null && (abstractC1387200mCc2 = c520050KaR2.get()) != null) {
                    c198s = abstractC1387200mCc2;
                } else {
                    synchronized (c830530Wi3) {
                        try {
                            C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                            if (c520050KaR3 != null && (abstractC1387200mCc = c520050KaR3.get()) != null) {
                                c198s = abstractC1387200mCc;
                            } else {
                                c830530Wi3.put(c520050KaR, c520050KaR);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                interfaceC2214261BlQ.LJI(c198s, bundle);
            }
        }
    }
}
