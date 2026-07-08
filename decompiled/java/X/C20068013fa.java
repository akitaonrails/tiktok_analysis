package X;

import android.graphics.Rect;
import android.graphics.Region;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import p2.j1;

/* JADX INFO: renamed from: X.13fa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20068013fa {
    public static final C1683130ttv LIZ = new C1683130ttv(0.0f, 0.0f, 10.0f, 10.0f);

    public static final C20029713Yp LIZIZ(C20064713f3 c20064713f3) {
        C20068213fc c20068213fcLIZ = c20064713f3.LIZ();
        if (c20068213fcLIZ.LIZJ.LJIJJ() && c20068213fcLIZ.LIZJ.LIZLLL()) {
            C20029713Yp c20029713Yp = new C20029713Yp(48);
            C1683130ttv c1683130ttvLJ = c20068213fcLIZ.LJ();
            LIZJ(new Region(Math.round(c1683130ttvLJ.LIZ), Math.round(c1683130ttvLJ.LIZIZ), Math.round(c1683130ttvLJ.LIZJ), Math.round(c1683130ttvLJ.LIZLLL)), c20068213fcLIZ, c20029713Yp, c20068213fcLIZ, new Region());
            return c20029713Yp;
        }
        return C1685990tyX.LIZ;
    }

    public static final C1692150u8T LIZLLL(C13WG c13wg) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        C1212320heY<C1697110uGT<Function1<List<C1692150u8T>, Boolean>>> c1212320heY = C1694480uCE.LIZ;
        C1697110uGT c1697110uGT = (C1697110uGT) C20069413fo.LIZ(c13wg, C1694480uCE.LIZ);
        if (c1697110uGT == null || (function1 = (Function1) c1697110uGT.LIZIZ) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (C1692150u8T) ListProtector.get(arrayList, 0);
    }

    public static final boolean LJ(C20068213fc c20068213fc) {
        j1 j1VarLIZJ = c20068213fc.LIZJ();
        if (j1VarLIZJ == null || !j1VarLIZJ.LLILLJJLI()) {
            C13WG c13wg = c20068213fc.LIZLLL;
            C1696500uFU c1696500uFU = C1696500uFU.LIZ;
            if (!c13wg.LJ(C1696500uFU.LJIILL) && !c20068213fc.LIZLLL.LJ(C1696500uFU.LJIILJJIL)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJFF(C20068213fc c20068213fc) {
        if (LJ(c20068213fc)) {
            return false;
        }
        C13WG c13wg = c20068213fc.LIZLLL;
        if (!c13wg.LLILLL) {
            C19991913Kb<C1212320heY<?>, Object> c19991913Kb = c13wg.LL;
            Object[] objArr = c19991913Kb.LIZIZ;
            long[] jArr = c19991913Kb.LIZ;
            int length = jArr.length - 2;
            if (length < 0) {
                return false;
            }
            int i = 0;
            loop0: while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && ((C1212320heY) objArr[(i << 3) + i3]).LIZJ) {
                            break loop0;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return false;
                    }
                }
                if (i == length) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    public static final String LJII(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final C20075713gp LIZ(int i, List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C20075713gp) ListProtector.get(arrayList, i2)).LL == i) {
                return (C20075713gp) ListProtector.get(arrayList, i2);
            }
        }
        return null;
    }

    public static final C20084713iH LJI(C20082613hw c20082613hw, int i) {
        Object next;
        Iterator<T> it2 = c20082613hw.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C20053713dH) ((Map.Entry) next).getKey()).LLILLJJLI == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return (C20084713iH) entry.getValue();
    }

    public static final void LIZJ(Region region, C20068213fc c20068213fc, C20029713Yp<C20071413g8> c20029713Yp, C20068213fc c20068213fc2, Region region2) {
        boolean z;
        InterfaceC1691470u7N interfaceC1691470u7NLIZIZ;
        boolean z2;
        C1683130ttv c1683130ttv;
        C1683130ttv c1683130ttvLJ;
        C20053713dH c20053713dH;
        if (c20068213fc2.LIZJ.LJIJJ() && c20068213fc2.LIZJ.LIZLLL()) {
            z = false;
        } else {
            z = true;
        }
        if (!region.isEmpty() || c20068213fc2.LJI == c20068213fc.LJI) {
            if (z && !c20068213fc2.LJ) {
                return;
            }
            if (!c20068213fc2.LIZLLL.LLILLL || (interfaceC1691470u7NLIZIZ = C20051513cv.LIZIZ(c20068213fc2.LIZJ)) == null) {
                interfaceC1691470u7NLIZIZ = c20068213fc2.LIZ;
            }
            AbstractC20055413dY abstractC20055413dYLJIJJ = interfaceC1691470u7NLIZIZ.LJIJJ();
            if (C20069413fo.LIZ(c20068213fc2.LIZLLL, C1694480uCE.LIZIZ) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!abstractC20055413dYLJIJJ.LL.LLJILLL) {
                c1683130ttv = C1683130ttv.LJ;
            } else if (!z2) {
                j1 j1VarLIZLLL = C20052513d5.LIZLLL(abstractC20055413dYLJIJJ, 8);
                c1683130ttv = C1692940u9k.LIZLLL(j1VarLIZLLL).LJJJJZI(j1VarLIZLLL, true);
            } else {
                j1 j1VarLIZLLL2 = C20052513d5.LIZLLL(abstractC20055413dYLJIJJ, 8);
                if (!j1VarLIZLLL2.LIZLLL()) {
                    c1683130ttv = C1683130ttv.LJ;
                } else {
                    InterfaceC1692950u9l interfaceC1692950u9lLIZLLL = C1692940u9k.LIZLLL(j1VarLIZLLL2);
                    C1696010uEh c1696010uEh = j1VarLIZLLL2.LLJL;
                    if (c1696010uEh == null) {
                        c1696010uEh = new C1696010uEh();
                        j1VarLIZLLL2.LLJL = c1696010uEh;
                    }
                    long jLJLLLL = j1VarLIZLLL2.LJLLLL(j1VarLIZLLL2.LLIIIILZ());
                    int i = (int) (jLJLLLL >> 32);
                    c1696010uEh.LIZ = -Float.intBitsToFloat(i);
                    int i2 = (int) (jLJLLLL & 4294967295L);
                    c1696010uEh.LIZIZ = -Float.intBitsToFloat(i2);
                    c1696010uEh.LIZJ = j1VarLIZLLL2.LJJLI() + Float.intBitsToFloat(i);
                    c1696010uEh.LIZLLL = j1VarLIZLLL2.LJJL() + Float.intBitsToFloat(i2);
                    while (true) {
                        if (j1VarLIZLLL2 != interfaceC1692950u9lLIZLLL) {
                            j1VarLIZLLL2.LLJI(c1696010uEh, false, true);
                            if (c1696010uEh.LIZIZ()) {
                                c1683130ttv = C1683130ttv.LJ;
                                break;
                            }
                            j1VarLIZLLL2 = j1VarLIZLLL2.LLJJIII;
                        } else {
                            c1683130ttv = new C1683130ttv(c1696010uEh.LIZ, c1696010uEh.LIZIZ, c1696010uEh.LIZJ, c1696010uEh.LIZLLL);
                            break;
                        }
                    }
                }
            }
            int iRound = Math.round(c1683130ttv.LIZ);
            int iRound2 = Math.round(c1683130ttv.LIZIZ);
            int iRound3 = Math.round(c1683130ttv.LIZJ);
            int iRound4 = Math.round(c1683130ttv.LIZLLL);
            region2.set(iRound, iRound2, iRound3, iRound4);
            int i3 = c20068213fc2.LJI;
            if (i3 == c20068213fc.LJI) {
                i3 = -1;
            }
            if (region2.op(region, Region.Op.INTERSECT)) {
                c20029713Yp.LJII(i3, new C20071413g8(c20068213fc2, region2.getBounds()));
                List<C20068213fc> listLJIIIZ = c20068213fc2.LJIIIZ();
                for (int size = listLJIIIZ.size() - 1; -1 < size; size--) {
                    if (!((C20068213fc) ListProtector.get(listLJIIIZ, size)).LJII().LJ(C1696500uFU.LJJIFFI)) {
                        LIZJ(region, c20068213fc, c20029713Yp, (C20068213fc) ListProtector.get(listLJIIIZ, size), region2);
                    }
                }
                if (LJFF(c20068213fc2)) {
                    region.op(iRound, iRound2, iRound3, iRound4, Region.Op.DIFFERENCE);
                    return;
                }
                return;
            }
            if (c20068213fc2.LJ) {
                C20068213fc c20068213fcLJIIIIZZ = c20068213fc2.LJIIIIZZ();
                if (c20068213fcLJIIIIZZ != null && (c20053713dH = c20068213fcLJIIIIZZ.LIZJ) != null && c20053713dH.LJIJJ()) {
                    c1683130ttvLJ = c20068213fcLJIIIIZZ.LJ();
                } else {
                    c1683130ttvLJ = LIZ;
                }
                c20029713Yp.LJII(i3, new C20071413g8(c20068213fc2, new Rect(Math.round(c1683130ttvLJ.LIZ), Math.round(c1683130ttvLJ.LIZIZ), Math.round(c1683130ttvLJ.LIZJ), Math.round(c1683130ttvLJ.LIZLLL))));
                return;
            }
            if (i3 == -1) {
                c20029713Yp.LJII(i3, new C20071413g8(c20068213fc2, region2.getBounds()));
            }
        }
    }
}
