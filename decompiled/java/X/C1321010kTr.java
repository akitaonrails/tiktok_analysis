package X;

import android.graphics.drawable.Animatable;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0kTr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321010kTr {
    public static final C1321050kTv LJIIIIZZ = new C1320700kTM<Object>() { // from class: X.0kTv
        @Override // X.C1320700kTM
        public final void LJIIIZ(String str, Object obj, Animatable animatable) {
            if (animatable != null && !animatable.isRunning()) {
                animatable.start();
            }
        }

        @Override // X.C1320700kTM
        public final void LJIIIIZZ(String str, Object obj, Animatable animatable, C1325710kbR c1325710kbR, Map map) {
            if (animatable != null) {
                animatable.start();
            }
        }
    };
    public static final NullPointerException LJIIIZ = new NullPointerException("No image request was specified!");
    public static final AtomicLong LJIIJ = new AtomicLong();
    public Object LIZ;
    public C1325710kbR LIZIZ;
    public C1320700kTM<? super InterfaceC1330440kj4> LIZJ;
    public boolean LIZLLL;
    public C1320970kTn LJ;
    public C1321180kU8 LJFF;
    public final C1325540kbA LJI;
    public final C1320120kSQ LJII;

    public final void LIZIZ() {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = false;
        this.LJ = null;
        this.LJFF = null;
    }

    public final C1320970kTn LIZ() {
        InterfaceC1320070kSL<InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>>> c1321190kU9;
        C1320970kTn c1320970kTn = this.LJ;
        String strValueOf = String.valueOf(LJIIJ.getAndIncrement());
        if (c1320970kTn == null) {
            c1320970kTn = new C1320970kTn(C1321000kTq.LJ, this.LJII, C822690WPb.LIZ());
        }
        final C1325710kbR c1325710kbR = this.LIZIZ;
        if (c1325710kbR != null) {
            final Object obj = this.LIZ;
            c1321190kU9 = new InterfaceC1320070kSL<InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>>>() { // from class: X.0kTs
                @Override // X.InterfaceC1320070kSL
                public final InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> get() {
                    EnumC1320950kTl enumC1320950kTl;
                    C1321010kTr c1321010kTr = this.LIZJ;
                    C1325710kbR c1325710kbR2 = c1325710kbR;
                    Object obj2 = obj;
                    EnumC1321030kTt enumC1321030kTt = EnumC1321030kTt.FULL_FETCH;
                    C1325540kbA c1325540kbA = c1321010kTr.LJI;
                    int i = C1321040kTu.LIZ[enumC1321030kTt.ordinal()];
                    if (i == 1) {
                        enumC1320950kTl = EnumC1320950kTl.FULL_FETCH;
                    } else if (i == 2) {
                        enumC1320950kTl = EnumC1320950kTl.DISK_CACHE;
                    } else {
                        if (i != 3) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Cache level");
                            sbLIZ.append(enumC1321030kTt);
                            sbLIZ.append("is not supported. ");
                            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        enumC1320950kTl = EnumC1320950kTl.BITMAP_MEMORY_CACHE;
                    }
                    EnumC1331380kka enumC1331380kka = EnumC1331380kka.HIGH;
                    return c1325540kbA.LJFF(c1325710kbR2, obj2, enumC1320950kTl, null, EnumC1331380kka.getHigherPriority(enumC1331380kka, c1325710kbR2 != null ? c1325710kbR2.LJIILL : enumC1331380kka));
                }

                public final String toString() {
                    C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
                    c1320100kSOLIZIZ.LIZIZ(c1325710kbR.toString(), "request");
                    return c1320100kSOLIZIZ.toString();
                }
            };
        } else {
            c1321190kU9 = new C1321190kU9(LJIIIZ);
        }
        Object obj2 = this.LIZ;
        C1321180kU8 c1321180kU8 = this.LJFF;
        c1320970kTn.LJIIL = c1325710kbR;
        c1320970kTn.LJIILIIL = c1321180kU8;
        c1320970kTn.LIZJ(obj2, strValueOf);
        c1320970kTn.LJIIJJI = false;
        c1320970kTn.LJIILL = c1321190kU9;
        C1320700kTM<? super InterfaceC1330440kj4> c1320700kTM = this.LIZJ;
        if (c1320700kTM != null) {
            c1320970kTn.LIZ(c1320700kTM);
        }
        if (this.LIZLLL) {
            c1320970kTn.LIZ(LJIIIIZZ);
        }
        return c1320970kTn;
    }

    public C1321010kTr(C1325540kbA c1325540kbA, C1320120kSQ c1320120kSQ) {
        LIZIZ();
        this.LJI = c1325540kbA;
        this.LJII = c1320120kSQ;
    }
}
