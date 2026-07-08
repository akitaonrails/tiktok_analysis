package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0kbA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1325540kbA {
    public static final CancellationException LJIIZILJ = new CancellationException("Prefetching is not enabled");
    public final C1327620keW LIZ;
    public final C1325680kbO LIZIZ;
    public final InterfaceC1320070kSL<Boolean> LIZJ;
    public final InterfaceC1325150kaX<InterfaceC1324680kZm, AbstractC1327750kej> LIZLLL;
    public final C1325170kaZ LJ;
    public final InterfaceC1325150kaX<InterfaceC1324680kZm, AbstractC1327750kej> LJFF;
    public final InterfaceC1325150kaX<InterfaceC1324680kZm, Bitmap> LJI;
    public final InterfaceC1325150kaX<InterfaceC1324680kZm, InterfaceC1327060kdc> LJII;
    public final C1326950kdR LJIIIIZZ;
    public final C1326950kdR LJIIIZ;
    public final Map<String, C1326950kdR> LJIIJ;
    public final InterfaceC1325590kbF LJIIJJI;
    public final C1325570kbD LJIIL;
    public final InterfaceC1320070kSL<Boolean> LJIILIIL;
    public final AtomicLong LJIILJJIL;
    public final InterfaceC1320070kSL<Boolean> LJIILL;
    public final C1320300kSi LJIILLIIL;

    public C1325540kbA() {
        throw null;
    }

    public final void LIZ() {
        this.LJIIIIZZ.LIZJ();
        this.LJIIIZ.LIZJ();
        if (LJIIJ()) {
            return;
        }
        Iterator<String> it2 = this.LJIIJ.keySet().iterator();
        while (it2.hasNext()) {
            C1326950kdR c1326950kdR = this.LJIIJ.get(it2.next());
            if (c1326950kdR != null) {
                c1326950kdR.LIZJ();
            }
        }
    }

    public final void LIZIZ() {
        InterfaceC1325100kaS<InterfaceC1324680kZm> interfaceC1325100kaS = new InterfaceC1325100kaS<InterfaceC1324680kZm>() { // from class: X.0kb9
            @Override // X.InterfaceC1325100kaS
            public final /* bridge */ /* synthetic */ boolean apply(InterfaceC1324680kZm interfaceC1324680kZm) {
                return true;
            }
        };
        this.LIZLLL.LIZIZ(interfaceC1325100kaS);
        C1325170kaZ c1325170kaZ = this.LJ;
        if (c1325170kaZ != null) {
            c1325170kaZ.LIZIZ(interfaceC1325100kaS);
        }
        InterfaceC1325150kaX<InterfaceC1324680kZm, AbstractC1327750kej> interfaceC1325150kaX = this.LJFF;
        if (interfaceC1325150kaX != null) {
            interfaceC1325150kaX.LIZIZ(interfaceC1325100kaS);
        }
        this.LJII.LIZIZ(interfaceC1325100kaS);
    }

    public final boolean LJIIJ() {
        Map<String, C1326950kdR> map = this.LJIIJ;
        return map == null || map.isEmpty();
    }

    public final boolean LJIILL() {
        boolean z;
        C1325570kbD c1325570kbD = this.LJIIL;
        synchronized (c1325570kbD) {
            z = c1325570kbD.LIZ;
        }
        return z;
    }

    public final void LJIILLIIL() {
        C1325570kbD c1325570kbD = this.LJIIL;
        synchronized (c1325570kbD) {
            c1325570kbD.LIZ = true;
        }
    }

    public final void LJIJJ() {
        C1325570kbD c1325570kbD = this.LJIIL;
        synchronized (c1325570kbD) {
            c1325570kbD.LIZ = false;
            while (!c1325570kbD.LIZIZ.isEmpty()) {
                c1325570kbD.LIZJ.execute((Runnable) c1325570kbD.LIZIZ.pop());
            }
            c1325570kbD.LIZIZ.clear();
        }
    }

    public final void LIZJ(Uri uri) {
        LJ(uri);
        LIZLLL(uri);
    }

    public final void LIZLLL(Uri uri) {
        C1326950kdR c1326950kdR;
        C1325710kbR c1325710kbRLIZ = C1325710kbR.LIZ(uri);
        C592490NLr c592490NLrLIZ = this.LJIIJJI.LIZ(c1325710kbRLIZ, null);
        this.LJIIIIZZ.LJIIIZ(c592490NLrLIZ);
        this.LJIIIZ.LJIIIZ(c592490NLrLIZ);
        if (!LJIIJ() && c1325710kbRLIZ != null && (c1326950kdR = this.LJIIJ.get(c1325710kbRLIZ.LJIL)) != null) {
            c1326950kdR.LJIIIZ(c592490NLrLIZ);
        }
    }

    public final void LJ(Uri uri) {
        C1325710kbR c1325710kbRLIZ = C1325710kbR.LIZ(uri);
        if (c1325710kbRLIZ == null) {
            return;
        }
        final Uri uri2 = Uri.parse(C1324810kZz.LJI().LIZJ(c1325710kbRLIZ, null).LIZ);
        InterfaceC1325100kaS<InterfaceC1324680kZm> interfaceC1325100kaS = new InterfaceC1325100kaS<InterfaceC1324680kZm>() { // from class: X.0kb8
            @Override // X.InterfaceC1325100kaS
            public final boolean apply(InterfaceC1324680kZm interfaceC1324680kZm) {
                return interfaceC1324680kZm.LIZIZ(uri2);
            }
        };
        this.LIZLLL.LIZIZ(interfaceC1325100kaS);
        C1325170kaZ c1325170kaZ = this.LJ;
        if (c1325170kaZ != null) {
            c1325170kaZ.LIZIZ(interfaceC1325100kaS);
        }
        InterfaceC1325150kaX<InterfaceC1324680kZm, AbstractC1327750kej> interfaceC1325150kaX = this.LJFF;
        if (interfaceC1325150kaX != null) {
            interfaceC1325150kaX.LIZIZ(interfaceC1325100kaS);
        }
        this.LJII.LIZIZ(interfaceC1325100kaS);
    }

    public final boolean LJIIJJI(Uri uri) {
        if (uri == null) {
            return false;
        }
        return LJIIL(C1325710kbR.LIZ(uri));
    }

    public final boolean LJIIL(C1325710kbR c1325710kbR) {
        C1325170kaZ c1325170kaZ;
        if (c1325710kbR == null) {
            return false;
        }
        C1324660kZk c1324660kZkLIZJ = this.LJIIJJI.LIZJ(c1325710kbR, null);
        C1323050kX9<AbstractC1327750kej> c1323050kX9 = this.LIZLLL.get(c1324660kZkLIZJ);
        if (c1323050kX9 == null && C1328130kfL.LJIILIIL().LJJIIJ && (c1325170kaZ = this.LJ) != null) {
            c1323050kX9 = c1325170kaZ.get(c1324660kZkLIZJ);
        }
        try {
            boolean zLJIJJ = C1323050kX9.LJIJJ(c1323050kX9);
            C1323050kX9.LJII(c1323050kX9);
            return zLJIJJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1323050kX9.LJII(c1323050kX9);
            throw th;
        }
    }

    public final C1321200kUA LJIILIIL(final C1325710kbR c1325710kbR) {
        final C592490NLr c592490NLrLIZ = this.LJIIJJI.LIZ(c1325710kbR, null);
        final C1321200kUA c1321200kUA = new C1321200kUA();
        this.LJIIIIZZ.LIZLLL(c592490NLrLIZ).LJI(new InterfaceC2385309Wh<Boolean, C15O7<Boolean>>() { // from class: X.0kbI
            @Override // X.InterfaceC2385309Wh
            public final C15O7<Boolean> then(C15O7<Boolean> c15o7) {
                C15O7<Boolean> c15o7LIZLLL;
                C1C7U.LIZ("ImagePipeline@addb.isInDiskCache$2");
                if (!c15o7.LJIILIIL() && !c15o7.LJIILL() && c15o7.LJIIL().booleanValue()) {
                    c15o7LIZLLL = C15O7.LJIIJ(Boolean.TRUE);
                } else {
                    c15o7LIZLLL = this.LIZIZ.LJIIIZ.LIZLLL(c592490NLrLIZ);
                }
                C1C7U.LIZIZ("ImagePipeline@addb.isInDiskCache$2");
                return c15o7LIZLLL;
            }
        }).LJI(new InterfaceC2385309Wh<Boolean, C15O7<Boolean>>() { // from class: X.0kbH
            @Override // X.InterfaceC2385309Wh
            public final C15O7<Boolean> then(C15O7<Boolean> c15o7) {
                C15O7<Boolean> c15o7LJIIJ;
                C1326950kdR c1326950kdR;
                C1C7U.LIZ("ImagePipeline@addb.isInDiskCache$1");
                if (!c15o7.LJIILIIL() && !c15o7.LJIILL() && c15o7.LJIIL().booleanValue()) {
                    c15o7LJIIJ = C15O7.LJIIJ(Boolean.TRUE);
                } else if (!this.LIZJ.LJIIJ() && (c1326950kdR = this.LIZJ.LJIIJ.get(c1325710kbR.LJIL)) != null) {
                    c15o7LJIIJ = c1326950kdR.LIZLLL(c592490NLrLIZ);
                } else {
                    c15o7LJIIJ = C15O7.LJIIJ(Boolean.FALSE);
                }
                C1C7U.LIZIZ("ImagePipeline@addb.isInDiskCache$1");
                return c15o7LJIIJ;
            }
        }).LIZLLL(new InterfaceC2385309Wh<Boolean, Void>() { // from class: X.0kbG
            @Override // X.InterfaceC2385309Wh
            public final Void then(C15O7<Boolean> c15o7) throws Throwable {
                boolean z;
                C1C7U.LIZ("ImagePipeline@addb.isInDiskCache$3");
                C1321200kUA c1321200kUA2 = c1321200kUA;
                if (!c15o7.LJIILIIL() && !c15o7.LJIILL() && c15o7.LJIIL().booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                c1321200kUA2.getClass();
                boolValueOf.getClass();
                c1321200kUA2.LJIILIIL(boolValueOf, true);
                C1C7U.LIZIZ("ImagePipeline@addb.isInDiskCache$3");
                return null;
            }
        });
        return c1321200kUA;
    }

    public final boolean LJIILJJIL(C1325710kbR c1325710kbR) {
        C592490NLr c592490NLrLIZ = this.LJIIJJI.LIZ(c1325710kbR, null);
        int i = C1325550kbB.LIZ[c1325710kbR.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && !LJIIJ()) {
                    if (!TextUtils.isEmpty(c1325710kbR.LJIL)) {
                        C1326950kdR c1326950kdR = this.LJIIJ.get(c1325710kbR.LJIL);
                        if (c1326950kdR == null) {
                            return false;
                        }
                        return c1326950kdR.LJFF(c592490NLrLIZ);
                    }
                    Iterator<C1326950kdR> it2 = this.LJIIJ.values().iterator();
                    while (it2.hasNext()) {
                        if (it2.next().LJFF(c592490NLrLIZ)) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return this.LJIIIZ.LJFF(c592490NLrLIZ);
        }
        return this.LJIIIIZZ.LJFF(c592490NLrLIZ);
    }

    public final InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> LJI(C1325710kbR c1325710kbR, Object obj) {
        return LJII(c1325710kbR, obj, EnumC1320950kTl.FULL_FETCH, null);
    }

    public final AbstractC1321260kUG LJIIIIZZ(C1325710kbR c1325710kbR, Object obj) {
        EnumC1331380kka enumC1331380kka;
        C1325710kbR c1325710kbRLIZ = c1325710kbR;
        c1325710kbRLIZ.LIZIZ.getClass();
        try {
            InterfaceC1327390ke9<C1323050kX9<InterfaceC1327060kdc>> interfaceC1327390ke9LJIIL = this.LIZ.LJIIL(c1325710kbRLIZ);
            if (c1325710kbRLIZ.LJIIJJI != null) {
                C1325700kbQ c1325700kbQLIZIZ = C1325700kbQ.LIZIZ(c1325710kbRLIZ);
                c1325700kbQLIZIZ.LIZJ = null;
                c1325710kbRLIZ = c1325700kbQLIZIZ.LIZ();
            }
            EnumC1320950kTl enumC1320950kTl = EnumC1320950kTl.FULL_FETCH;
            if (c1325710kbRLIZ != null) {
                enumC1331380kka = c1325710kbRLIZ.LJIILL;
            } else {
                enumC1331380kka = EnumC1331380kka.HIGH;
            }
            return LJIJJLI(interfaceC1327390ke9LJIIL, c1325710kbRLIZ, enumC1320950kTl, obj, null, enumC1331380kka);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C1321330kUN.LIZ(e);
        }
    }

    public final InterfaceC1325670kbN LJIIIZ(C1325710kbR c1325710kbR, C1320270kSf c1320270kSf) {
        if (c1320270kSf == null) {
            InterfaceC1325670kbN interfaceC1325670kbN = c1325710kbR.LJIJJLI;
            if (interfaceC1325670kbN == null) {
                return this.LIZIZ;
            }
            return new C1325680kbO(this.LIZIZ, interfaceC1325670kbN);
        }
        InterfaceC1325670kbN interfaceC1325670kbN2 = c1325710kbR.LJIJJLI;
        if (interfaceC1325670kbN2 == null) {
            return new C1325680kbO(this.LIZIZ, c1320270kSf);
        }
        return new C1325680kbO(this.LIZIZ, c1320270kSf, interfaceC1325670kbN2);
    }

    public final AbstractC1321260kUG LJIIZILJ(C1325710kbR c1325710kbR, Object obj) {
        InterfaceC1327390ke9<Void> interfaceC1327390ke9LJII;
        EnumC1331380kka enumC1331380kka;
        if (!this.LIZJ.get().booleanValue()) {
            return C1321330kUN.LIZ(LJIIZILJ);
        }
        try {
            if (this.LJIILIIL.get().booleanValue()) {
                interfaceC1327390ke9LJII = this.LIZ.LJIIJJI(c1325710kbR);
            } else {
                interfaceC1327390ke9LJII = this.LIZ.LJII(c1325710kbR);
            }
            EnumC1320950kTl enumC1320950kTl = EnumC1320950kTl.FULL_FETCH;
            if (c1325710kbR != null) {
                enumC1331380kka = c1325710kbR.LJIILL;
            } else {
                enumC1331380kka = EnumC1331380kka.HIGH;
            }
            return LJIL(interfaceC1327390ke9LJII, c1325710kbR, enumC1320950kTl, obj, enumC1331380kka);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C1321330kUN.LIZ(e);
        }
    }

    public final AbstractC1321260kUG LJIJ(C1325710kbR c1325710kbR, Object obj) {
        EnumC1331380kka enumC1331380kka;
        if (c1325710kbR != null) {
            enumC1331380kka = c1325710kbR.LJIILL;
        } else {
            enumC1331380kka = EnumC1331380kka.HIGH;
        }
        return LJIJI(c1325710kbR, obj, enumC1331380kka);
    }

    public final AbstractC1321260kUG LJIJI(C1325710kbR c1325710kbR, Object obj, EnumC1331380kka enumC1331380kka) {
        if (!this.LIZJ.get().booleanValue()) {
            return C1321330kUN.LIZ(LJIIZILJ);
        }
        try {
            return LJIL(this.LIZ.LJIIJJI(c1325710kbR), c1325710kbR, EnumC1320950kTl.FULL_FETCH, obj, enumC1331380kka);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C1321330kUN.LIZ(e);
        }
    }

    public final InterfaceC1320200kSY LJII(C1325710kbR c1325710kbR, Object obj, EnumC1320950kTl enumC1320950kTl, C1320060kSK c1320060kSK) {
        EnumC1331380kka enumC1331380kka;
        if (c1325710kbR != null) {
            enumC1331380kka = c1325710kbR.LJIILL;
        } else {
            enumC1331380kka = EnumC1331380kka.HIGH;
        }
        return LJFF(c1325710kbR, obj, enumC1320950kTl, c1320060kSK, enumC1331380kka);
    }

    public final AbstractC1321260kUG LJFF(C1325710kbR c1325710kbR, Object obj, EnumC1320950kTl enumC1320950kTl, C1320270kSf c1320270kSf, EnumC1331380kka enumC1331380kka) {
        try {
            return LJIJJLI(this.LIZ.LJIIIIZZ(c1325710kbR), c1325710kbR, enumC1320950kTl, obj, c1320270kSf, enumC1331380kka);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C1321330kUN.LIZ(e);
        }
    }

    public final AbstractC1321260kUG LJIL(final InterfaceC1327390ke9 interfaceC1327390ke9, C1325710kbR c1325710kbR, EnumC1320950kTl enumC1320950kTl, Object obj, EnumC1331380kka enumC1331380kka) {
        final InterfaceC1325670kbN interfaceC1325670kbNLJIIIZ = LJIIIZ(c1325710kbR, null);
        try {
            final C1327900key c1327900key = new C1327900key(c1325710kbR, String.valueOf(this.LJIILJJIL.getAndIncrement()), interfaceC1325670kbNLJIIIZ, obj, EnumC1320950kTl.getMax(c1325710kbR.LJIILLIIL, enumC1320950kTl), true, false, EnumC1331380kka.getLowerPriority(enumC1331380kka, EnumC1331380kka.MEDIUM));
            return new AbstractC1325650kbL<T>(interfaceC1327390ke9, c1327900key, interfaceC1325670kbNLJIIIZ) { // from class: X.0kbK
            };
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C1321330kUN.LIZ(e);
        }
    }

    public final AbstractC1321260kUG LJIJJLI(final InterfaceC1327390ke9 interfaceC1327390ke9, C1325710kbR c1325710kbR, EnumC1320950kTl enumC1320950kTl, Object obj, C1320270kSf c1320270kSf, EnumC1331380kka enumC1331380kka) {
        boolean z;
        C1336010ks3.LIZIZ();
        final InterfaceC1325670kbN interfaceC1325670kbNLJIIIZ = LJIIIZ(c1325710kbR, c1320270kSf);
        try {
            try {
                EnumC1320950kTl max = EnumC1320950kTl.getMax(c1325710kbR.LJIILLIIL, enumC1320950kTl);
                String strValueOf = String.valueOf(this.LJIILJJIL.getAndIncrement());
                boolean z2 = c1325710kbR.LJJJ;
                if (!c1325710kbR.LJFF && !c1325710kbR.LJII && C1325880kbi.LJ(c1325710kbR.LIZIZ)) {
                    z = false;
                } else {
                    z = true;
                }
                final C1327900key c1327900key = new C1327900key(c1325710kbR, strValueOf, interfaceC1325670kbNLJIIIZ, obj, max, z2, z, enumC1331380kka);
                C1336010ks3.LIZIZ();
                AbstractC1321260kUG abstractC1321260kUG = new AbstractC1325650kbL<C1323050kX9<T>>(interfaceC1327390ke9, c1327900key, interfaceC1325670kbNLJIIIZ) { // from class: X.0kbJ
                    @Override // X.AbstractC1321260kUG, X.InterfaceC1320200kSY
                    public final Object getResult() {
                        return C1323050kX9.LJFF((C1323050kX9) super.getResult());
                    }

                    @Override // X.AbstractC1321260kUG
                    public final void LJFF(Object obj2) {
                        C1323050kX9.LJII((C1323050kX9) obj2);
                    }

                    @Override // X.AbstractC1325650kbL
                    public final void LJIILL(int i, Object obj2) {
                        super.LJIILL(i, C1323050kX9.LJFF((C1323050kX9) obj2));
                    }
                };
                C1336010ks3.LIZIZ();
                C1336010ks3.LIZIZ();
                return abstractC1321260kUG;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1321200kUA c1321200kUALIZ = C1321330kUN.LIZ(e);
                C1336010ks3.LIZIZ();
                return c1321200kUALIZ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1336010ks3.LIZIZ();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0kSi] */
    public C1325540kbA(C1327620keW c1327620keW, Set set, InterfaceC1320070kSL interfaceC1320070kSL, C1325170kaZ c1325170kaZ, C1325170kaZ c1325170kaZ2, C1325170kaZ c1325170kaZ3, C1325170kaZ c1325170kaZ4, C1326950kdR c1326950kdR, C1326950kdR c1326950kdR2, C1333180knU c1333180knU, InterfaceC1325590kbF interfaceC1325590kbF, C1325570kbD c1325570kbD, C1320890kTf c1320890kTf) {
        C1325170kaZ<InterfaceC1324680kZm, AbstractC1327750kej> c1325170kaZLJFF;
        this.LJIILJJIL = new AtomicLong();
        this.LIZ = c1327620keW;
        this.LIZIZ = new C1325680kbO((Set<InterfaceC1325670kbN>) set);
        this.LIZJ = interfaceC1320070kSL;
        this.LIZLLL = c1325170kaZ;
        if (C1328130kfL.LJIILIIL().LJJIIJ) {
            c1325170kaZLJFF = C1328130kfL.LJIILIIL().LJFF();
        } else {
            c1325170kaZLJFF = null;
        }
        this.LJ = c1325170kaZLJFF;
        this.LJFF = c1325170kaZ2;
        this.LJI = c1325170kaZ3;
        this.LJII = c1325170kaZ4;
        this.LJIIIIZZ = c1326950kdR;
        this.LJIIIZ = c1326950kdR2;
        this.LJIIJ = c1333180knU;
        this.LJIIJJI = interfaceC1325590kbF;
        this.LJIIL = c1325570kbD;
        this.LJIILIIL = c1320890kTf;
        this.LJIILL = null;
        this.LJIILLIIL = new Object() { // from class: X.0kSi
        };
    }
}
