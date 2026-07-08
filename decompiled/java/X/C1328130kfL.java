package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: X.0kfL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328130kfL {
    public static final Class<?> LJJIIZI = C1328130kfL.class;
    public static C1328130kfL LJJIJ;
    public static InterfaceC1330200kig LJJIJIIJI;
    public final C1327450keF LIZ;
    public final C1327460keG LIZIZ;
    public final InterfaceC1327470keH LIZJ;
    public C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> LIZLLL;
    public C1325170kaZ<InterfaceC1324680kZm, AbstractC1327750kej> LJ;
    public C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> LJFF;
    public C1325170kaZ<InterfaceC1324680kZm, AbstractC1327750kej> LJI;
    public C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> LJII;
    public C1325170kaZ<InterfaceC1324680kZm, AbstractC1327750kej> LJIIIIZZ;
    public C1325080kaQ<InterfaceC1324680kZm, Bitmap> LJIIIZ;
    public C1325170kaZ<InterfaceC1324680kZm, Bitmap> LJIIJ;
    public C1329310khF<InterfaceC1324680kZm, InterfaceC1327060kdc> LJIIJJI;
    public C1325170kaZ<InterfaceC1324680kZm, InterfaceC1327060kdc> LJIIL;
    public C1326950kdR LJIILIIL;
    public InterfaceC1326920kdO LJIILJJIL;
    public InterfaceC1330200kig LJIILL;
    public C1325540kbA LJIILLIIL;
    public C1327140kdk LJIIZILJ;
    public C1327640keY LJIJ;
    public C1327620keW LJIJI;
    public C1326950kdR LJIJJ;
    public volatile C1333180knU<String, C1326950kdR> LJIJJLI;
    public InterfaceC1326920kdO LJIL;
    public volatile C1333180knU<String, InterfaceC1326920kdO> LJJ;
    public C1328100kfI LJJI;
    public AbstractC1328490kfv LJJIFFI;
    public InterfaceC1322960kX0 LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public long LJJIIJZLJL;
    public boolean LJJIIZ;

    static {
        C1332730kml.LJJJJI.getClass();
        C01GW c01gw = C1332730kml.LIZIZ;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332730kml.LIZ;
        LJJIJ = (C1328130kfL) c01gw.getValue();
    }

    public static C1328130kfL LJIILIIL() {
        C1328130kfL c1328130kfL = LJJIJ;
        C1322350kW1.LIZLLL(c1328130kfL, "ImagePipelineFactory was not initialized!");
        return c1328130kfL;
    }

    public static synchronized boolean LJIJJLI() {
        return LJJIJ != null;
    }

    public final C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> LIZ() {
        if (this.LJII == null) {
            C1332310km5 c1332310km5 = LIZ().LIZ.LIZJ;
            InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
            this.LJII = C1328200kfS.LIZ((InterfaceC1320070kSL) c1332310km5.LIZ(), LIZ().LJIIIZ(), LIZ().LIZ());
        }
        return this.LJII;
    }

    public final InterfaceC1322960kX0 LIZJ() {
        if (this.LJJII == null) {
            LJJII();
            if (this.LJJIII || LIZ().LJIIJJI()) {
                AbstractC1301670jyf abstractC1301670jyfLJIILLIIL = LJIILLIIL();
                InterfaceC1328030kfB interfaceC1328030kfBLIZJ = LIZ().LIZJ();
                C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> c1329310khFLIZ = LIZ();
                if (this.LJIIIZ == null) {
                    this.LJIIIZ = new C1325080kaQ<>();
                }
                this.LJJII = C1324940kaC.LIZ(abstractC1301670jyfLJIILLIIL, interfaceC1328030kfBLIZJ, c1329310khFLIZ, this.LJIIIZ);
            } else {
                AbstractC1301670jyf abstractC1301670jyfLJIILLIIL2 = LJIILLIIL();
                InterfaceC1328030kfB interfaceC1328030kfBLIZJ2 = LIZ().LIZJ();
                C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> c1329310khFLJI = LJI();
                if (this.LJIIIZ == null) {
                    this.LJIIIZ = new C1325080kaQ<>();
                }
                this.LJJII = C1324940kaC.LIZ(abstractC1301670jyfLJIILLIIL2, interfaceC1328030kfBLIZJ2, c1329310khFLJI, this.LJIIIZ);
            }
        }
        return this.LJJII;
    }

    public final C1325170kaZ<InterfaceC1324680kZm, Bitmap> LIZLLL() {
        if (this.LJIIJ == null) {
            if (this.LJIIIZ == null) {
                this.LJIIIZ = new C1325080kaQ<>();
            }
            C1325080kaQ<InterfaceC1324680kZm, Bitmap> c1325080kaQ = this.LJIIIZ;
            final InterfaceC1327000kdW interfaceC1327000kdWLJFF = LIZ().LJFF();
            interfaceC1327000kdWLJFF.LJIIJ();
            this.LJIIJ = new C1325170kaZ<>(c1325080kaQ, new InterfaceC1325180kaa<InterfaceC1324680kZm>() { // from class: X.0kdX
                @Override // X.InterfaceC1325180kaa
                public final void LIZ() {
                    interfaceC1327000kdWLJFF.LJIIL();
                }

                @Override // X.InterfaceC1325180kaa
                public final void LIZJ() {
                    interfaceC1327000kdWLJFF.LJFF();
                }

                @Override // X.InterfaceC1325180kaa
                public final void LIZIZ(InterfaceC1324680kZm interfaceC1324680kZm) {
                    interfaceC1327000kdWLJFF.LIZ();
                }
            });
        }
        return this.LJIIJ;
    }

    public final C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> LJ() {
        if (this.LJFF == null) {
            C1332310km5 c1332310km5 = LIZ().LIZ.LJJIJIIJIL;
            InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
            this.LJFF = C1328200kfS.LIZ((InterfaceC1320070kSL) c1332310km5.LIZ(), LIZ().LJIIIZ(), LIZ().LIZ());
        }
        return this.LJFF;
    }

    public final C1325170kaZ<InterfaceC1324680kZm, AbstractC1327750kej> LJFF() {
        if (this.LJI == null) {
            C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> c1329310khFLJ = LJ();
            InterfaceC1327000kdW interfaceC1327000kdWLJFF = LIZ().LJFF();
            interfaceC1327000kdWLJFF.LJI();
            this.LJI = new C1325170kaZ<>(c1329310khFLJ, new C1327020kdY(interfaceC1327000kdWLJFF));
        }
        return this.LJI;
    }

    public final C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> LJI() {
        if (this.LIZLLL == null) {
            LJJII();
            C1332310km5 c1332310km5 = LIZ().LIZ.LIZIZ;
            InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
            this.LIZLLL = C1328200kfS.LIZ((InterfaceC1320070kSL) c1332310km5.LIZ(), LIZ().LJIIIZ(), LIZ().LIZ());
        }
        return this.LIZLLL;
    }

    public final C1325170kaZ<InterfaceC1324680kZm, AbstractC1327750kej> LJII() {
        if (this.LJ == null) {
            LJJII();
            C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> c1329310khFLJI = LJI();
            InterfaceC1327000kdW interfaceC1327000kdWLJFF = LIZ().LJFF();
            interfaceC1327000kdWLJFF.LJI();
            this.LJ = new C1325170kaZ<>(c1329310khFLJI, new C1327020kdY(interfaceC1327000kdWLJFF));
        }
        return this.LJ;
    }

    public final C1333180knU LJIIIIZZ() {
        if (this.LJIJJLI == null) {
            this.LJIJJLI = new C1333180knU<>();
            C1333180knU c1333180knULJIIIZ = LJIIIZ();
            for (Object obj : c1333180knULJIIIZ.keySet()) {
                C1326950kdR c1326950kdR = new C1326950kdR((InterfaceC1326920kdO) c1333180knULJIIIZ.get(obj), LIZ().LJIIJ().LIZIZ(LIZ().LJIIIIZZ()), LIZ().LJIIJ().LIZJ(), LIZ().LIZJ().LJ(), LIZ().LIZJ().LIZIZ(), LIZ().LJFF());
                C1332310km5 c1332310km5 = LIZ().LIZ.LJJIJIIJI;
                InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
                ((HashMap) c1332310km5.LIZ()).get(obj);
                this.LJIJJLI.put((String) obj, c1326950kdR);
            }
        }
        return this.LJIJJLI;
    }

    public final C1333180knU LJIIIZ() {
        if (this.LJJ == null) {
            this.LJJ = new C1333180knU<>();
            C1332310km5 c1332310km5 = LIZ().LIZ.LJJIJIIJI;
            InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
            HashMap map = (HashMap) c1332310km5.LIZ();
            for (Object obj : map.keySet()) {
                this.LJJ.put((String) obj, LIZ().LJ().LIZ((C1329030kgn) map.get(obj)));
            }
        }
        return this.LJJ;
    }

    public final C1329310khF<InterfaceC1324680kZm, InterfaceC1327060kdc> LJIIJ() {
        if (this.LJIIJJI == null) {
            LJJII();
            C1332310km5 c1332310km5 = LIZ().LIZ.LJIIIIZZ;
            InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
            InterfaceC1320070kSL interfaceC1320070kSL = (InterfaceC1320070kSL) c1332310km5.LIZ();
            InterfaceC1328250kfX interfaceC1328250kfXLJIIIZ = LIZ().LJIIIZ();
            C1329310khF<InterfaceC1324680kZm, InterfaceC1327060kdc> c1329310khF = new C1329310khF<>(new InterfaceC1330260kim<InterfaceC1327060kdc>() { // from class: X.0kfQ
                @Override // X.InterfaceC1330260kim
                public final int LIZ(InterfaceC1327060kdc interfaceC1327060kdc) {
                    return interfaceC1327060kdc.size();
                }
            }, new InterfaceC1330230kij() { // from class: X.0kh0
                @Override // X.InterfaceC1330230kij
                public final double LIZ(EnumC1330650kjP enumC1330650kjP) {
                    int i = C1330640kjO.LIZ[enumC1330650kjP.ordinal()];
                    if (i == 1) {
                        return 0.0d;
                    }
                    if (i != 2 && i != 3 && i != 4 && i != 5) {
                        C1328570kg3.LJIJI("NativeMemoryCacheTrimStrategy", "unknown trim type: %s", enumC1330650kjP);
                        return 0.0d;
                    }
                    return 1.0d;
                }
            }, interfaceC1320070kSL);
            interfaceC1328250kfXLJIIIZ.LIZ(c1329310khF);
            this.LJIIJJI = c1329310khF;
        }
        return this.LJIIJJI;
    }

    public final C1325170kaZ<InterfaceC1324680kZm, InterfaceC1327060kdc> LJIIJJI() {
        if (this.LJIIL == null) {
            LJJII();
            C1329310khF<InterfaceC1324680kZm, InterfaceC1327060kdc> c1329310khFLJIIJ = LJIIJ();
            final InterfaceC1327000kdW interfaceC1327000kdWLJFF = LIZ().LJFF();
            interfaceC1327000kdWLJFF.LJIIIZ();
            this.LJIIL = new C1325170kaZ<>(c1329310khFLJIIJ, new InterfaceC1325180kaa<InterfaceC1324680kZm>() { // from class: X.0kdZ
                @Override // X.InterfaceC1325180kaa
                public final void LIZ() {
                    interfaceC1327000kdWLJFF.LJ();
                }

                @Override // X.InterfaceC1325180kaa
                public final void LIZJ() {
                    interfaceC1327000kdWLJFF.LJIILIIL();
                }

                @Override // X.InterfaceC1325180kaa
                public final void LIZIZ(InterfaceC1324680kZm interfaceC1324680kZm) {
                    interfaceC1327000kdWLJFF.LIZJ();
                }
            });
        }
        return this.LJIIL;
    }

    public final C1325540kbA LJIIL() {
        if (this.LJIILLIIL == null) {
            LJJII();
            if (this.LJJIII || LIZ().LJIIJJI()) {
                C1327620keW c1327620keWLJIJ = LJIJ();
                C1332310km5 c1332310km5 = LIZ().LIZ.LJJ;
                InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
                Set setUnmodifiableSet = Collections.unmodifiableSet((Set) c1332310km5.LIZ());
                InterfaceC1320070kSL interfaceC1320070kSL = (InterfaceC1320070kSL) LIZ().LIZ.LJIILJJIL.LIZ();
                C1325170kaZ<InterfaceC1324680kZm, AbstractC1327750kej> c1325170kaZLJII = LJII();
                if (this.LJIIIIZZ == null) {
                    C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> c1329310khFLIZ = LIZ();
                    InterfaceC1327000kdW interfaceC1327000kdWLJFF = LIZ().LJFF();
                    interfaceC1327000kdWLJFF.LJI();
                    this.LJIIIIZZ = new C1325170kaZ<>(c1329310khFLIZ, new C1327020kdY(interfaceC1327000kdWLJFF));
                }
                C1325170kaZ<InterfaceC1324680kZm, AbstractC1327750kej> c1325170kaZ = this.LJIIIIZZ;
                C1325170kaZ<InterfaceC1324680kZm, Bitmap> c1325170kaZLIZLLL = LIZLLL();
                C1325170kaZ<InterfaceC1324680kZm, InterfaceC1327060kdc> c1325170kaZLJIIJJI = LJIIJJI();
                C1326950kdR c1326950kdRLJIILJJIL = LJIILJJIL();
                C1326950kdR c1326950kdRLJIJI = LJIJI();
                C1333180knU c1333180knULJIIIIZZ = LJIIIIZZ();
                InterfaceC1325590kbF interfaceC1325590kbFLIZIZ = LIZ().LIZIZ();
                C1325570kbD c1325570kbDLIZ = LIZ();
                C1320890kTf c1320890kTf = new C1320890kTf(Boolean.FALSE);
                LIZ().LIZLLL().getClass();
                this.LJIILLIIL = new C1325540kbA(c1327620keWLJIJ, setUnmodifiableSet, interfaceC1320070kSL, c1325170kaZLJII, c1325170kaZ, c1325170kaZLIZLLL, c1325170kaZLJIIJJI, c1326950kdRLJIILJJIL, c1326950kdRLJIJI, c1333180knULJIIIIZZ, interfaceC1325590kbFLIZIZ, c1325570kbDLIZ, c1320890kTf);
            } else {
                C1327620keW c1327620keWLJIJ2 = LJIJ();
                C1332310km5 c1332310km52 = LIZ().LIZ.LJJ;
                InterfaceC2217461Bqa[] interfaceC2217461BqaArr2 = C1332300km4.LJJIJL;
                Set setUnmodifiableSet2 = Collections.unmodifiableSet((Set) c1332310km52.LIZ());
                InterfaceC1320070kSL interfaceC1320070kSL2 = (InterfaceC1320070kSL) LIZ().LIZ.LJIILJJIL.LIZ();
                C1325170kaZ<InterfaceC1324680kZm, AbstractC1327750kej> c1325170kaZLJII2 = LJII();
                C1325170kaZ<InterfaceC1324680kZm, Bitmap> c1325170kaZLIZLLL2 = LIZLLL();
                C1325170kaZ<InterfaceC1324680kZm, InterfaceC1327060kdc> c1325170kaZLJIIJJI2 = LJIIJJI();
                C1326950kdR c1326950kdRLJIILJJIL2 = LJIILJJIL();
                C1326950kdR c1326950kdRLJIJI2 = LJIJI();
                C1333180knU c1333180knULJIIIIZZ2 = LJIIIIZZ();
                InterfaceC1325590kbF interfaceC1325590kbFLIZIZ2 = LIZ().LIZIZ();
                C1325570kbD c1325570kbDLIZ2 = LIZ();
                C1320890kTf c1320890kTf2 = new C1320890kTf(Boolean.FALSE);
                LIZ().LIZLLL().getClass();
                this.LJIILLIIL = new C1325540kbA(c1327620keWLJIJ2, setUnmodifiableSet2, interfaceC1320070kSL2, c1325170kaZLJII2, null, c1325170kaZLIZLLL2, c1325170kaZLJIIJJI2, c1326950kdRLJIILJJIL2, c1326950kdRLJIJI2, c1333180knULJIIIIZZ2, interfaceC1325590kbFLIZIZ2, c1325570kbDLIZ2, c1320890kTf2);
            }
        }
        return this.LJIILLIIL;
    }

    public final C1326950kdR LJIILJJIL() {
        if (this.LJIILIIL == null) {
            LJJII();
            C1326950kdR c1326950kdR = new C1326950kdR(LJIILL(), LIZ().LJIIJ().LIZIZ(LIZ().LJIIIIZZ()), LIZ().LJIIJ().LIZJ(), LIZ().LIZJ().LJ(), LIZ().LIZJ().LIZIZ(), LIZ().LJFF());
            this.LJIILIIL = c1326950kdR;
            C1328730kgJ.LJIJI = c1326950kdR.LJFF;
            C1328730kgJ.LJIJJ = LJIILL();
            C1326950kdR c1326950kdR2 = this.LJIILIIL;
            C1332310km5 c1332310km5 = LIZ().LIZ.LJIILL;
            InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
            c1332310km5.LIZ().getClass();
            c1326950kdR2.getClass();
            C1326950kdR c1326950kdR3 = this.LJIILIIL;
            LIZ().LIZ.LJIILL.LIZ().getClass();
            c1326950kdR3.getClass();
        }
        return this.LJIILIIL;
    }

    public final InterfaceC1326920kdO LJIILL() {
        if (this.LJIILJJIL == null) {
            LJJII();
            C1332310km5 c1332310km5 = LIZ().LIZ.LJIILL;
            InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
            this.LJIILJJIL = LIZ().LJ().LIZ((C1329030kgn) c1332310km5.LIZ());
        }
        return this.LJIILJJIL;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0kfI] */
    public final AbstractC1301670jyf LJIILLIIL() {
        if (this.LJJI == null) {
            LJJII();
            C1328770kgN c1328770kgNLJIIJ = LIZ().LJIIJ();
            LJIIZILJ();
            final InterfaceC1330420kj2 interfaceC1330420kj2LIZ = c1328770kgNLJIIJ.LIZ();
            this.LJJI = new AbstractC1301670jyf(interfaceC1330420kj2LIZ) { // from class: X.0kfI
                public final InterfaceC1330420kj2 LIZ;

                {
                    this.LIZ = interfaceC1330420kj2LIZ;
                }

                @Override // X.AbstractC1301670jyf
                public final C1323050kX9<Bitmap> LJFF(int i, int i2, Bitmap.Config config) {
                    boolean z;
                    int i3 = i * i2;
                    Bitmap bitmap = this.LIZ.get(C1327320ke2.LIZIZ(config) * i3);
                    if (bitmap.getAllocationByteCount() >= i3 * C1327320ke2.LIZIZ(config)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1322350kW1.LIZIZ(z);
                    bitmap.reconfigure(i, i2, config);
                    return C1323050kX9.LJJIZ(bitmap, this.LIZ);
                }
            };
        }
        return this.LJJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1328910kgb LJIIZILJ() {
        /*
            r5 = this;
            X.0kfv r0 = r5.LJJIFFI
            if (r0 != 0) goto L5d
            r5.LJJII()
            X.0keG r0 = r5.LIZIZ
            java.lang.Object r0 = r0.LIZ()
            X.0kgQ r0 = (X.C1328800kgQ) r0
            X.0kgN r4 = r0.LJIIJ()
            X.0keG r0 = r5.LIZIZ
            java.lang.Object r0 = r0.LIZ()
            X.0kgQ r0 = (X.C1328800kgQ) r0
            X.0kfN r0 = r0.LIZLLL()
            r0.getClass()
            X.0keG r0 = r5.LIZIZ
            java.lang.Object r0 = r0.LIZ()
            X.0kgQ r0 = (X.C1328800kgQ) r0
            X.0kfN r0 = r0.LIZLLL()
            boolean r2 = r0.LJI
            X.0keG r0 = r5.LIZIZ
            java.lang.Object r0 = r0.LIZ()
            X.0kgQ r0 = (X.C1328800kgQ) r0
            X.0kfN r0 = r0.LIZLLL()
            r0.getClass()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 != r0) goto L60
            if (r2 == 0) goto L79
            X.0kgP r0 = r4.LIZ
            X.0khE r0 = r0.LIZJ
            int r2 = r0.LIZLLL
            X.0kfM r3 = new X.0kfM
            X.0kj2 r1 = r4.LIZ()
            X.0eME r0 = new X.0eME
            r0.<init>(r2)
            r3.<init>(r1, r2, r0)
        L5b:
            r5.LJJIFFI = r3
        L5d:
            X.0kfv r0 = r5.LJJIFFI
            return r0
        L60:
            r0 = 26
            if (r1 >= r0) goto L79
            X.0kgP r0 = r4.LIZ
            X.0khE r0 = r0.LIZJ
            int r2 = r0.LIZLLL
            X.0kfK r3 = new X.0kfK
            X.0kj2 r1 = r4.LIZ()
            X.0eME r0 = new X.0eME
            r0.<init>(r2)
            r3.<init>(r1, r2, r0)
            goto L5b
        L79:
            X.0kgP r0 = r4.LIZ
            X.0khE r0 = r0.LIZJ
            int r2 = r0.LIZLLL
            X.0kfJ r3 = new X.0kfJ
            X.0kj2 r1 = r4.LIZ()
            X.0eME r0 = new X.0eME
            r0.<init>(r2)
            r3.<init>(r1, r2, r0)
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1328130kfL.LJIIZILJ():X.0kgb");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0338  */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.0kdk] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1327620keW LJIJ() {
        /*
            Method dump skipped, instruction units count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1328130kfL.LJIJ():X.0keW");
    }

    public final C1326950kdR LJIJI() {
        if (this.LJIJJ == null) {
            LJJII();
            this.LJIJJ = new C1326950kdR(LJIJJ(), LIZ().LJIIJ().LIZIZ(LIZ().LJIIIIZZ()), LIZ().LJIIJ().LIZJ(), LIZ().LIZJ().LJ(), LIZ().LIZJ().LIZIZ(), LIZ().LJFF());
            C1332310km5 c1332310km5 = LIZ().LIZ.LJIILL;
            InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
            c1332310km5.LIZ().getClass();
            C1326950kdR c1326950kdR = this.LJIJJ;
            LIZ().LIZ.LJIILL.LIZ().getClass();
            c1326950kdR.getClass();
        }
        return this.LJIJJ;
    }

    public final InterfaceC1326920kdO LJIJJ() {
        if (this.LJIL == null) {
            LJJII();
            C1332310km5 c1332310km5 = LIZ().LIZ.LJJIFFI;
            InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
            this.LJIL = LIZ().LJ().LIZ((C1329030kgn) c1332310km5.LIZ());
        }
        return this.LJIL;
    }

    public final boolean LJJI() {
        C1332310km5 c1332310km5 = LIZ().LIZ.LJJIIJZLJL;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
        return ((Boolean) c1332310km5.LIZ()).booleanValue();
    }

    public final boolean LJJIFFI() {
        C1332310km5 c1332310km5 = LIZ().LIZ.LJJIIZI;
        InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C1332300km4.LJJIJL;
        return ((Boolean) c1332310km5.LIZ()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, X.0kbD] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, X.0kgQ, java.lang.Object] */
    public final void LJJII() {
        if (this.LIZIZ != null) {
            return;
        }
        synchronized (this) {
            try {
                if (this.LIZIZ != null) {
                    return;
                }
                C1336010ks3.LIZIZ();
                ?? LIZ = this.LIZJ.LIZ();
                LIZ.getClass();
                this.LIZ.LIZIZ = new C1325570kbD(LIZ.LIZJ().LIZJ());
                C1336010ks3.LIZIZ();
                this.LIZIZ.LIZIZ = LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0kVh, X.0keG] */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, X.0kbD] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0kVh, X.0keF] */
    public C1328130kfL(C1328800kgQ c1328800kgQ) {
        ?? r2 = new C1322150kVh<C1325570kbD>() { // from class: X.0keF
            @Override // X.C1322150kVh
            public final C1325570kbD LIZIZ() {
                return new C1325570kbD(LIZ().LIZJ().LIZJ());
            }
        };
        this.LIZ = r2;
        ?? r1 = new C1322150kVh<C1328800kgQ>() { // from class: X.0keG
            @Override // X.C1322150kVh
            public final C1328800kgQ LIZIZ() {
                C1336010ks3.LIZIZ();
                InterfaceC1327470keH interfaceC1327470keH = this.LIZJ.LIZJ;
                if (interfaceC1327470keH == null) {
                    C1336010ks3.LIZIZ();
                    return null;
                }
                C1328800kgQ c1328800kgQLIZ = interfaceC1327470keH.LIZ();
                c1328800kgQLIZ.getClass();
                C1336010ks3.LIZIZ();
                return c1328800kgQLIZ;
            }
        };
        this.LIZIZ = r1;
        this.LJJIII = false;
        this.LJJIIJ = false;
        this.LJJIIZ = false;
        C1336010ks3.LIZIZ();
        c1328800kgQ.getClass();
        r1.LIZIZ = c1328800kgQ;
        r2.LIZIZ = new C1325570kbD(c1328800kgQ.LIZJ().LIZJ());
        C1336010ks3.LIZIZ();
    }

    public static synchronized void LJIL(Context context) {
        C1336010ks3.LIZIZ();
        LJJ(new C1328800kgQ(C1328800kgQ.LJIIL(context)));
        C1336010ks3.LIZIZ();
    }

    public static synchronized void LJJ(C1328800kgQ c1328800kgQ) {
        if (LJJIJ != null) {
            C1328570kg3.LJIILL(LJJIIZI, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
        }
        LJJIJ = new C1328130kfL(c1328800kgQ);
    }

    public final InterfaceC1320130kSR LIZIZ(Context context) {
        InterfaceC1322960kX0 interfaceC1322960kX0LIZJ = LIZJ();
        if (interfaceC1322960kX0LIZJ == null) {
            return null;
        }
        return interfaceC1322960kX0LIZJ.getAnimatedDrawableFactory(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0keF] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0keG] */
    public C1328130kfL(C1329510khZ c1329510khZ) {
        this.LIZ = new C1322150kVh<C1325570kbD>() { // from class: X.0keF
            @Override // X.C1322150kVh
            public final C1325570kbD LIZIZ() {
                return new C1325570kbD(LIZ().LIZJ().LIZJ());
            }
        };
        this.LIZIZ = new C1322150kVh<C1328800kgQ>() { // from class: X.0keG
            @Override // X.C1322150kVh
            public final C1328800kgQ LIZIZ() {
                C1336010ks3.LIZIZ();
                InterfaceC1327470keH interfaceC1327470keH = this.LIZJ.LIZJ;
                if (interfaceC1327470keH == null) {
                    C1336010ks3.LIZIZ();
                    return null;
                }
                C1328800kgQ c1328800kgQLIZ = interfaceC1327470keH.LIZ();
                c1328800kgQLIZ.getClass();
                C1336010ks3.LIZIZ();
                return c1328800kgQLIZ;
            }
        };
        this.LJJIII = false;
        this.LJJIIJ = false;
        this.LJJIIZ = false;
        this.LIZJ = c1329510khZ;
    }
}
