package X;

import Y.AComparatorS49S0000000_30;
import Y.AComparatorS524S0100000_30;
import android.content.res.Resources;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AFwS318S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13gH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20072313gH {
    public static final Comparator<C20068213fc>[] LIZ;
    public static final AFwS318S0000000_30 LIZIZ;

    static {
        Comparator<C20068213fc>[] comparatorArr = new Comparator[2];
        int i = 0;
        while (true) {
            final Comparator comparator = new Comparator<C20068213fc>() { // from class: X.13gV
                @Override // java.util.Comparator
                public final int compare(C20068213fc c20068213fc, C20068213fc c20068213fc2) {
                    C1683130ttv c1683130ttvLJFF = c20068213fc.LJFF();
                    C1683130ttv c1683130ttvLJFF2 = c20068213fc2.LJFF();
                    int iCompare = Float.compare(c1683130ttvLJFF2.LIZJ, c1683130ttvLJFF.LIZJ);
                    if (iCompare == 0) {
                        int iCompare2 = Float.compare(c1683130ttvLJFF.LIZIZ, c1683130ttvLJFF2.LIZIZ);
                        if (iCompare2 == 0) {
                            int iCompare3 = Float.compare(c1683130ttvLJFF.LIZLLL, c1683130ttvLJFF2.LIZLLL);
                            if (iCompare3 == 0) {
                                return Float.compare(c1683130ttvLJFF2.LIZ, c1683130ttvLJFF.LIZ);
                            }
                            return iCompare3;
                        }
                        return iCompare2;
                    }
                    return iCompare;
                }
            };
            while (true) {
                final AComparatorS49S0000000_30 aComparatorS49S0000000_30 = C20053713dH.LLLIIL;
                comparatorArr[i] = new AComparatorS524S0100000_30(new Comparator() { // from class: X.13go
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        int iCompare = comparator.compare(t, t2);
                        if (iCompare == 0) {
                            return aComparatorS49S0000000_30.compare(((C20068213fc) t).LIZJ, ((C20068213fc) t2).LIZJ);
                        }
                        return iCompare;
                    }
                }, 1);
                i++;
                if (i >= 2) {
                    LIZ = comparatorArr;
                    LIZIZ = AFwS318S0000000_30.get$arr$(4);
                    return;
                } else if (i != 0) {
                    comparator = new Comparator<C20068213fc>() { // from class: X.13gW
                        @Override // java.util.Comparator
                        public final int compare(C20068213fc c20068213fc, C20068213fc c20068213fc2) {
                            C1683130ttv c1683130ttvLJFF = c20068213fc.LJFF();
                            C1683130ttv c1683130ttvLJFF2 = c20068213fc2.LJFF();
                            int iCompare = Float.compare(c1683130ttvLJFF.LIZ, c1683130ttvLJFF2.LIZ);
                            if (iCompare == 0) {
                                int iCompare2 = Float.compare(c1683130ttvLJFF.LIZIZ, c1683130ttvLJFF2.LIZIZ);
                                if (iCompare2 == 0) {
                                    int iCompare3 = Float.compare(c1683130ttvLJFF.LIZLLL, c1683130ttvLJFF2.LIZLLL);
                                    if (iCompare3 == 0) {
                                        return Float.compare(c1683130ttvLJFF.LIZJ, c1683130ttvLJFF2.LIZJ);
                                    }
                                    return iCompare3;
                                }
                                return iCompare2;
                            }
                            return iCompare;
                        }
                    };
                }
            }
        }
    }

    public static final boolean LIZ(C20068213fc c20068213fc) {
        return !c20068213fc.LJII().LJ(C1696500uFU.LJIIIZ);
    }

    public static final boolean LIZIZ(C20068213fc c20068213fc) {
        if (!c20068213fc.LIZLLL.LJ(C1696500uFU.LJJIIZ) || Intrinsics.LJFF(C20069413fo.LIZ(c20068213fc.LIZLLL, C1696500uFU.LJIIJJI), Boolean.TRUE)) {
            C20053713dH c20053713dHLIZJ = LIZJ(c20068213fc.LIZJ, AFwS274S0000000_30.get$arr$(20));
            if (c20053713dHLIZJ == null) {
                return false;
            }
            C13WG c13wgLIZIZ = c20053713dHLIZJ.LIZIZ();
            if (c13wgLIZIZ != null && Intrinsics.LJFF(C20069413fo.LIZ(c13wgLIZIZ, C1696500uFU.LJIIJJI), Boolean.TRUE)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJ(C20068213fc c20068213fc) {
        boolean z;
        C13WG c13wg = c20068213fc.LIZLLL;
        C1696500uFU c1696500uFU = C1696500uFU.LIZ;
        Object objLIZ = C20069413fo.LIZ(c13wg, C1696500uFU.LJJIJIIJIL);
        C20279814Wu c20279814Wu = (C20279814Wu) C20069413fo.LIZ(c20068213fc.LIZLLL, C1696500uFU.LJJ);
        if (objLIZ != null) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = (Boolean) C20069413fo.LIZ(c20068213fc.LIZLLL, C1696500uFU.LJJIJIIJI);
        if (bool != null) {
            bool.booleanValue();
            if (c20279814Wu == null || c20279814Wu.LIZ != 4) {
                return true;
            }
            return z;
        }
        return z;
    }

    public static final C1692220u8a LJI(C20068213fc c20068213fc) {
        C1692220u8a c1692220u8a;
        C13WG c13wg = c20068213fc.LIZLLL;
        C1696500uFU c1696500uFU = C1696500uFU.LIZ;
        C1692220u8a c1692220u8a2 = (C1692220u8a) C20069413fo.LIZ(c13wg, C1696500uFU.LJJIIZ);
        List list = (List) C20069413fo.LIZ(c20068213fc.LIZLLL, C1696500uFU.LJJII);
        if (list != null) {
            c1692220u8a = (C1692220u8a) C13LP.LJJJLL(list);
        } else {
            c1692220u8a = null;
        }
        if (c1692220u8a2 == null) {
            return c1692220u8a;
        }
        return c1692220u8a2;
    }

    public static final boolean LJII(C20068213fc c20068213fc) {
        if (c20068213fc.LIZJ.LLJJL == EnumC1671200tag.Rtl) {
            return true;
        }
        return false;
    }

    public static final C20053713dH LIZJ(C20053713dH c20053713dH, Function1<? super C20053713dH, Boolean> function1) {
        for (C20053713dH c20053713dHLJJIJIL = c20053713dH.LJJIJIL(); c20053713dHLJJIJIL != null; c20053713dHLJJIJIL = c20053713dHLJJIJIL.LJJIJIL()) {
            if (function1.invoke(c20053713dHLJJIJIL).booleanValue()) {
                return c20053713dHLJJIJIL;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJFF(X.C20068213fc r8, android.content.res.Resources r9) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20072313gH.LJFF(X.13fc, android.content.res.Resources):java.lang.String");
    }

    public static final boolean LJIIIIZZ(C20068213fc c20068213fc, Resources resources) {
        Object objLJJJLL;
        boolean z;
        C13WG c13wg = c20068213fc.LIZLLL;
        C1696500uFU c1696500uFU = C1696500uFU.LIZ;
        List list = (List) C20069413fo.LIZ(c13wg, C1696500uFU.LIZIZ);
        if (list != null) {
            objLJJJLL = C13LP.LJJJLL(list);
        } else {
            objLJJJLL = null;
        }
        if (objLJJJLL == null && LJI(c20068213fc) == null && LJFF(c20068213fc, resources) == null && !LJ(c20068213fc)) {
            z = false;
        } else {
            z = true;
        }
        if (C20068013fa.LJ(c20068213fc)) {
            return false;
        }
        if (!c20068213fc.LIZLLL.LLILLL && (!c20068213fc.LJIIJJI() || !z)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3 A[LOOP:1: B:9:0x0037->B:26:0x00c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0 A[EDGE_INSN: B:50:0x00d0->B:31:0x00d0 BREAK  A[LOOP:2: B:17:0x0059->B:28:0x00c9]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6 A[EDGE_INSN: B:48:0x00e6->B:32:0x00e6 BREAK  A[LOOP:1: B:9:0x0037->B:26:0x00c3], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<X.C20068213fc> LJIIIZ(boolean r16, java.util.List<X.C20068213fc> r17, X.AbstractC20029613Yo<X.C20071413g8> r18, android.content.res.Resources r19) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20072313gH.LJIIIZ(boolean, java.util.List, X.13Yo, android.content.res.Resources):java.util.List");
    }

    public static final void LIZLLL(C20068213fc c20068213fc, ArrayList<C20068213fc> arrayList, C20029713Yp<List<C20068213fc>> c20029713Yp, AbstractC20029613Yo<C20071413g8> abstractC20029613Yo, Resources resources) {
        boolean zLJII = LJII(c20068213fc);
        boolean zBooleanValue = ((Boolean) c20068213fc.LIZLLL.LJIIIZ(C1696500uFU.LJIILIIL, AFwS219S0000000_30.get$arr$(24))).booleanValue();
        if ((zBooleanValue || LJIIIIZZ(c20068213fc, resources)) && abstractC20029613Yo.LIZ(c20068213fc.LJI)) {
            arrayList.add(c20068213fc);
        }
        if (zBooleanValue) {
            c20029713Yp.LJII(c20068213fc.LJI, LJIIIZ(zLJII, c20068213fc.LJI(!c20068213fc.LIZIZ, false, false), abstractC20029613Yo, resources));
            return;
        }
        List<C20068213fc> listLJI = c20068213fc.LJI(!c20068213fc.LIZIZ, false, false);
        int size = listLJI.size();
        for (int i = 0; i < size; i++) {
            LIZLLL((C20068213fc) ListProtector.get(listLJI, i), arrayList, c20029713Yp, abstractC20029613Yo, resources);
        }
    }
}
