package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0khG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329320khG {
    static {
        float f = C2509209sQ.LIZ;
        if (C2509209sQ.LIZ > 0.0f) {
            C1329430khR c1329430khR = C0V7X.LIZ;
            C1329310khF<InterfaceC1324680kZm, InterfaceC1327060kdc> c1329310khFLJIIJ = C1328130kfL.LJIILIIL().LJIIJ();
            if (c1329310khFLJIIJ != null) {
                c1329430khR.LIZ.remove(c1329310khFLJIIJ);
            } else {
                c1329430khR.getClass();
            }
        }
    }

    public static final void LIZ(double d) {
        C1329510khZ c1329510khZ;
        float f = C2509209sQ.LIZ;
        if (f > 0.0f) {
            C1325540kbA c1325540kbALJIIL = C1328130kfL.LJIILIIL().LJIIL();
            c1325540kbALJIIL.LIZLLL.LIZIZ(new InterfaceC1325100kaS() { // from class: X.0khv
                @Override // X.InterfaceC1325100kaS
                public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                    return true;
                }
            });
            C1325170kaZ c1325170kaZ = c1325540kbALJIIL.LJ;
            if (c1325170kaZ != null) {
                c1325170kaZ.LIZIZ(new InterfaceC1325100kaS() { // from class: X.0khw
                    @Override // X.InterfaceC1325100kaS
                    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                        return true;
                    }
                });
            }
            InterfaceC1325150kaX<InterfaceC1324680kZm, AbstractC1327750kej> interfaceC1325150kaX = c1325540kbALJIIL.LJFF;
            if (interfaceC1325150kaX != null) {
                interfaceC1325150kaX.LIZIZ(new InterfaceC1325100kaS() { // from class: X.0khx
                    @Override // X.InterfaceC1325100kaS
                    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                        return true;
                    }
                });
            }
            if (d == 1.0d) {
                C1328130kfL.LJIILIIL().LJIIJJI().LIZIZ(new InterfaceC1325100kaS() { // from class: X.0khy
                    @Override // X.InterfaceC1325100kaS
                    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
                        return true;
                    }
                });
                return;
            }
            C1329310khF<InterfaceC1324680kZm, InterfaceC1327060kdc> c1329310khFLJIIJ = C1328130kfL.LJIILIIL().LJIIJ();
            int iLJI = c1329310khFLJIIJ.LLILLJJLI.LJI();
            C1330050kiR c1330050kiR = C1330400kj0.LIZ;
            if (c1330050kiR.LIZ == null && (c1329510khZ = c1330050kiR.LIZIZ) != null) {
                c1330050kiR.LIZ = c1329510khZ.LIZ();
            }
            if (c1330050kiR.LIZ == null) {
                c1330050kiR.LIZ = C1328800kgQ.LJII();
            }
            C1332310km5 c1332310km5 = c1330050kiR.LIZ.LIZ.LJIIIIZZ;
            InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
            int i = (int) (f * ((C1329770khz) ((InterfaceC1320070kSL) c1332310km5.LIZ()).get()).LIZ);
            if (iLJI <= i) {
                return;
            }
            double dDoubleValue = Double.valueOf((((double) (iLJI - i)) * 1.0d) / ((double) iLJI)).doubleValue();
            synchronized (c1329310khFLJIIJ) {
                try {
                    int iMax = Math.max(0, (int) (((double) c1329310khFLJIIJ.LLILLJJLI.LJI()) * (1.0d - dDoubleValue)));
                    while (c1329310khFLJIIJ.LLILLJJLI.LJI() > iMax) {
                        InterfaceC1324680kZm interfaceC1324680kZmLJ = c1329310khFLJIIJ.LLILLJJLI.LJ();
                        if (interfaceC1324680kZmLJ != null) {
                            C1325210kad<InterfaceC1324680kZm, InterfaceC1327060kdc> c1325210kadLJIIIIZZ = c1329310khFLJIIJ.LLILLJJLI.LJIIIIZZ(interfaceC1324680kZmLJ);
                            C1325210kad<InterfaceC1324680kZm, InterfaceC1327060kdc> c1325210kadLJIIIIZZ2 = c1329310khFLJIIJ.LL.LJIIIIZZ(interfaceC1324680kZmLJ);
                            if (c1329310khFLJIIJ.LLILZLL.LJII) {
                                C314750CVl.LIZIZ(interfaceC1324680kZmLJ.toString());
                            }
                            if (c1325210kadLJIIIIZZ != null) {
                                c1329310khFLJIIJ.LJIJ(c1325210kadLJIIIIZZ);
                                C1323050kX9.LJII(c1329310khFLJIIJ.LJJIIJ(c1325210kadLJIIIIZZ));
                            }
                            if (c1325210kadLJIIIIZZ2 != null) {
                                C1329310khF.LJJIFFI(c1325210kadLJIIIIZZ2);
                            }
                        } else {
                            return;
                        }
                    }
                    c1329310khFLJIIJ.LJJII();
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C1328130kfL.LJIILIIL().LJIIL().LIZIZ();
    }
}
