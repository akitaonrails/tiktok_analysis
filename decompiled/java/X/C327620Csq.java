package X;

import android.text.TextPaint;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Csq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C327620Csq {
    public final C0CVI LIZ;
    public final TextPaint LIZIZ;
    public final int LIZJ;
    public final float LIZLLL;
    public final Function1<? super C327630Csr, Unit> LJ;
    public final Function0<Unit> LJFF;
    public final LifecycleOwner LJI;
    public final long LJII = 1000;
    public boolean LJIIIIZZ;
    public volatile AbstractC327690Csx LJIIIZ;
    public final int LJIIJ;
    public final List<C327610Csp> LJIIJJI;
    public final CopyOnWriteArrayList<C327610Csp> LJIIL;
    public final C01GW LJIILIIL;
    public C1DEV LJIILJJIL;

    public void LIZIZ() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(LJFF()), C0PEM.LIZ, null, new C327510Csf(this, null), 2);
    }

    public final long LIZLLL() {
        return LJII().LIZ();
    }

    public Function1<C327630Csr, Unit> LIZJ() {
        return this.LJ;
    }

    public Function0<Unit> LJ() {
        return this.LJFF;
    }

    public LifecycleOwner LJFF() {
        return this.LJI;
    }

    public float LJI() {
        return this.LIZLLL;
    }

    public C0CVI LJII() {
        return this.LIZ;
    }

    public void LJIIJ(AbstractC327690Csx abstractC327690Csx) {
        this.LJIIIZ = abstractC327690Csx;
        abstractC327690Csx.LJ(this.LJIIL);
    }

    public Object LIZ(C327630Csr c327630Csr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C327610Csp c327610Csp;
        long j;
        EnumC327660Csu enumC327660Csu;
        long jLIZLLL = LIZLLL();
        if (((ArrayList) this.LJIIJJI).isEmpty()) {
            c327610Csp = null;
        } else {
            c327610Csp = (C327610Csp) C13LP.LJJLIIIJJI(this.LJIIJJI);
        }
        long j2 = c327630Csr.LL;
        long j3 = c327630Csr.LLJI + j2;
        long j4 = 0;
        if (c327610Csp != null) {
            j = c327610Csp.LIZJ + c327610Csp.LJ;
        } else {
            j = 0;
        }
        if (j3 < j) {
            enumC327660Csu = EnumC327660Csu.DELAY;
        } else if (j3 < jLIZLLL) {
            enumC327660Csu = EnumC327660Csu.OVERDUE;
        } else if (j2 > jLIZLLL) {
            enumC327660Csu = EnumC327660Csu.NOT_START;
        } else if (j2 <= j) {
            enumC327660Csu = EnumC327660Csu.UNDER_WAY_OTHER_RUNNING;
        } else {
            enumC327660Csu = EnumC327660Csu.UNDER_WAY_ARRIVE_LATE;
        }
        switch (C327650Cst.LIZ[enumC327660Csu.ordinal()]) {
            case 1:
                Function1<C327630Csr, Unit> function1LIZJ = LIZJ();
                if (function1LIZJ != null) {
                    function1LIZJ.invoke(c327630Csr);
                }
                return Unit.LIZ;
            case 2:
                if (c327610Csp != null) {
                    long j5 = c327630Csr.LL;
                    long j6 = c327630Csr.LLJI;
                    long j7 = j5 + j6;
                    long j8 = c327610Csp.LIZJ + c327610Csp.LJ;
                    if (j8 >= j5) {
                        j5 = j8;
                    }
                    c327630Csr.LL = j5;
                    long j9 = this.LJII;
                    if (j9 <= j6) {
                        j6 = j9;
                    }
                    long j10 = j7 - j5;
                    if (j6 < j10) {
                        j6 = j10;
                    }
                    c327630Csr.LLJI = j6;
                }
                Object objLJIIIIZZ = LJIIIIZZ(this, c327630Csr, c327610Csp, interfaceC1364105Vn);
                if (objLJIIIIZZ != C099R.LJFF()) {
                    return Unit.LIZ;
                }
                return objLJIIIIZZ;
            case 3:
                long j11 = this.LJII;
                long j12 = c327630Csr.LLJI;
                if (j11 > j12) {
                    j11 = j12;
                }
                long j13 = (c327630Csr.LL + j12) - jLIZLLL;
                if (j11 < j13) {
                    j11 = j13;
                }
                c327630Csr.LLJI = j11;
                c327630Csr.LL = jLIZLLL;
                Object objLJIIIIZZ2 = LJIIIIZZ(this, c327630Csr, c327610Csp, interfaceC1364105Vn);
                if (objLJIIIIZZ2 != C099R.LJFF()) {
                    return Unit.LIZ;
                }
                return objLJIIIIZZ2;
            case 4:
                if (c327610Csp != null) {
                    long j14 = c327610Csp.LIZJ + c327610Csp.LJ;
                    if (jLIZLLL < j14) {
                        jLIZLLL = j14;
                    }
                }
                long j15 = this.LJII;
                long j16 = c327630Csr.LLJI;
                if (j15 > j16) {
                    j15 = j16;
                }
                long j17 = (c327630Csr.LL + j16) - jLIZLLL;
                if (j15 < j17) {
                    j15 = j17;
                }
                c327630Csr.LLJI = j15;
                c327630Csr.LL = jLIZLLL;
                Object objLJIIIIZZ3 = LJIIIIZZ(this, c327630Csr, c327610Csp, interfaceC1364105Vn);
                if (objLJIIIIZZ3 != C099R.LJFF()) {
                    return Unit.LIZ;
                }
                return objLJIIIIZZ3;
            case 5:
                long j18 = c327630Csr.LL;
                if (c327610Csp != null) {
                    long j19 = c327610Csp.LIZJ + c327610Csp.LJ;
                    if (jLIZLLL < j19) {
                        jLIZLLL = j19;
                    }
                }
                c327630Csr.LL = jLIZLLL;
                long j20 = this.LJII;
                long j21 = c327630Csr.LLJI;
                if (j20 > j21) {
                    j20 = j21;
                }
                long j22 = (j21 + j18) - jLIZLLL;
                if (j20 < j22) {
                    j20 = j22;
                }
                c327630Csr.LLJI = j20;
                Object objLJIIIIZZ4 = LJIIIIZZ(this, c327630Csr, c327610Csp, interfaceC1364105Vn);
                if (objLJIIIIZZ4 != C099R.LJFF()) {
                    return Unit.LIZ;
                }
                return objLJIIIIZZ4;
            case 6:
                if (c327610Csp != null) {
                    long j23 = c327610Csp.LIZJ + c327610Csp.LJ;
                    if (jLIZLLL < j23) {
                        jLIZLLL = j23;
                    }
                }
                c327630Csr.LL = jLIZLLL;
                long j24 = c327630Csr.LLJI;
                if (0 < j24) {
                    j4 = j24;
                }
                c327630Csr.LLJI = j4;
                Object objLJIIIIZZ5 = LJIIIIZZ(this, c327630Csr, c327610Csp, interfaceC1364105Vn);
                if (objLJIIIIZZ5 != C099R.LJFF()) {
                    return Unit.LIZ;
                }
                return objLJIIIIZZ5;
            default:
                throw new C1954807lC();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x013a -> B:41:0x00e2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJIIIIZZ(X.C327620Csq r13, X.C327630Csr r14, X.C327610Csp r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327620Csq.LJIIIIZZ(X.0Csq, X.0Csr, X.0Csp, X.05Vn):java.lang.Object");
    }

    public final List<C327610Csp> LJIIIZ(C327630Csr c327630Csr, C327610Csp c327610Csp, float f, boolean z) {
        int i;
        long j;
        long j2;
        C1085640eME<C327610Csp> c1085640eME;
        int next;
        C327610Csp c327610Csp2 = c327610Csp;
        C327680Csw c327680Csw = (C327680Csw) this.LJIILIIL.getValue();
        TextPaint textPaint = this.LIZIZ;
        c327680Csw.getClass();
        String str = c327630Csr.LLJIJIL;
        long j3 = c327630Csr.LL;
        long j4 = c327630Csr.LLJI;
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        int iFirst = wordInstance.first();
        ArrayList<C327670Csv> arrayList = new ArrayList();
        while (iFirst != -1 && (next = wordInstance.next()) != -1) {
            String string = str.subSequence(iFirst, next).toString();
            float[] fArr = new float[1];
            textPaint.breakText(string, true, f, fArr);
            arrayList.add(new C327670Csv(string, next, iFirst, fArr[0]));
            iFirst = next;
        }
        if (!arrayList.isEmpty()) {
            long size = j4 / ((long) arrayList.size());
            for (C327670Csv c327670Csv : arrayList) {
                c327670Csv.LIZIZ = j3;
                c327670Csv.LJI = size;
                j3 += size;
            }
        }
        c327630Csr.LLJIJIL = "";
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c327630Csr.LIZJ((C327670Csv) it2.next());
        }
        Iterator<C327670Csv> it3 = c327630Csr.LLIZLLLIL.iterator();
        while (it3.hasNext()) {
            it3.next().LJFF = c327630Csr;
        }
        ArrayList<C327670Csv> arrayList2 = new ArrayList();
        arrayList2.addAll(c327630Csr.LLIZLLLIL);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            for (C327670Csv c327670Csv2 : arrayList2) {
            }
            float f2 = 0.0f;
            if (c327610Csp2 != null) {
                Iterator<C327630Csr> it4 = c327610Csp2.LJIIIZ.iterator();
                while (it4.hasNext()) {
                    f2 += it4.next().LLJ;
                }
            }
            C327610Csp c327610Csp3 = c327610Csp2;
            C327630Csr c327630Csr2 = null;
            while (true) {
                if (!arrayList2.isEmpty()) {
                    f2 += ((C327670Csv) ListProtector.get(arrayList2, 0)).LJ;
                    if (f2 > f) {
                        if (c327630Csr2 != null) {
                            c327630Csr2.LJFF();
                            if (c327610Csp3 != null) {
                                c327610Csp3.LIZ(c327630Csr2, z);
                            }
                        }
                    } else {
                        if (c327630Csr2 == null) {
                            long j5 = ((C327670Csv) ListProtector.get(arrayList2, 0)).LIZIZ;
                            C327630Csr c327630Csr3 = ((C327670Csv) ListProtector.get(arrayList2, 0)).LJFF;
                            if (c327630Csr3 != null) {
                                j = c327630Csr3.LLILLJJLI;
                            } else {
                                j = 0;
                            }
                            C327630Csr c327630Csr4 = ((C327670Csv) ListProtector.get(arrayList2, 0)).LJFF;
                            if (c327630Csr4 != null) {
                                j2 = c327630Csr4.LLILLL;
                            } else {
                                j2 = 0;
                            }
                            c327630Csr2 = new C327630Csr(j5, j, j2, c327630Csr.LLILZ, c327630Csr.LLILZIL, c327630Csr.LLILZLL, c327630Csr.LLIZ);
                            c327630Csr2.LLJJ = c327630Csr.LLJJ;
                            c327630Csr2.LIZJ((C327670Csv) ListProtector.get(arrayList2, 0));
                            if (c327610Csp3 == null && ((c1085640eME = c327680Csw.LIZ) == null || (c327610Csp3 = c1085640eME.LIZIZ()) == null)) {
                                c327610Csp3 = new C327610Csp(c327680Csw.LIZ);
                            }
                            i = 0;
                        } else {
                            i = 0;
                            c327630Csr2.LIZJ((C327670Csv) ListProtector.get(arrayList2, 0));
                        }
                        ListProtector.remove(arrayList2, i);
                    }
                } else if (c327630Csr2 != null) {
                    c327630Csr2.LJFF();
                    if (c327610Csp3 != null) {
                        c327610Csp3.LIZ(c327630Csr2, z);
                    }
                }
            }
            if (c327610Csp3 != null && c327610Csp2 == null) {
                arrayList3.add(c327610Csp3);
            }
            c327610Csp2 = null;
        }
        return arrayList3;
    }

    public C327620Csq(C0CVI c0cvi, TextPaint textPaint, int i, float f, Function1<? super C327630Csr, Unit> function1, Function0<Unit> function0, LifecycleOwner lifecycleOwner) {
        this.LIZ = c0cvi;
        this.LIZIZ = textPaint;
        this.LIZJ = i;
        this.LIZLLL = f;
        this.LJ = function1;
        this.LJFF = function0;
        this.LJI = lifecycleOwner;
        int i2 = i - 2;
        this.LJIIJ = 15 <= i2 ? 15 : i2;
        this.LJIIJJI = new ArrayList();
        this.LJIIL = new CopyOnWriteArrayList<>();
        this.LJIILIIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3194));
    }
}
