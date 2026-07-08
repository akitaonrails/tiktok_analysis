package X;

import androidx.compose.runtime.s;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13ZF, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13ZF {
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static List LIZ(C13ZE c13ze, int i, C13ZE c13ze2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        List list;
        int i2;
        boolean zLJJIJ;
        boolean z5;
        int i3;
        C13Z7 c13z7LJJJJ;
        int i4;
        int iLJIILL = c13ze.LJIILL(i);
        int i5 = i + iLJIILL;
        int iLJ = c13ze.LJ(c13ze.LJIILIIL(i), c13ze.LIZIZ);
        int iLJ2 = c13ze.LJ(c13ze.LJIILIIL(i5), c13ze.LIZIZ);
        int i6 = iLJ2 - iLJ;
        if (i >= 0 && (c13ze.LIZIZ[(c13ze.LJIILIIL(i) * 5) + 1] & 201326592) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        c13ze2.LJIIZILJ(iLJIILL);
        c13ze2.LJIJ(i6, c13ze2.LJIJI);
        if (c13ze.LJI < i5) {
            c13ze.LJIL(i5);
        }
        if (c13ze.LJIIJ < iLJ2) {
            c13ze.LJJ(iLJ2, i5);
        }
        int[] iArr = c13ze2.LIZIZ;
        int i7 = c13ze2.LJIJI;
        int i8 = i7 * 5;
        int i9 = i * 5;
        System.arraycopy(c13ze.LIZIZ, i9, iArr, i8, (i5 * 5) - i9);
        Object[] objArr = c13ze2.LIZJ;
        int i10 = c13ze2.LJIIIIZZ;
        System.arraycopy(c13ze.LIZJ, iLJ, objArr, i10, i6);
        int i11 = c13ze2.LJIJJLI;
        iArr[i8 + 2] = i11;
        int i12 = i7 - i;
        int i13 = i7 + iLJIILL;
        int iLJ3 = i10 - c13ze2.LJ(i7, iArr);
        int i14 = c13ze2.LJIIL;
        int i15 = c13ze2.LJIIJJI;
        int length = objArr.length;
        for (int i16 = i7; i16 < i13; i16++) {
            if (i16 != i7) {
                int i17 = (i16 * 5) + 2;
                iArr[i17] = iArr[i17] + i12;
            }
            int iLJ4 = c13ze2.LJ(i16, iArr) + iLJ3;
            if (i14 < i16) {
                i4 = 0;
            } else {
                i4 = c13ze2.LJIIJ;
            }
            if (iLJ4 > i4) {
                iLJ4 = -(((length - i15) - iLJ4) + 1);
            }
            iArr[(i16 * 5) + 4] = iLJ4;
            if (i16 == i14) {
                i14++;
            }
        }
        c13ze2.LJIIL = i14;
        int iLIZIZ = C13ZA.LIZIZ(c13ze.LIZLLL, i, c13ze.LJIIJ());
        int iLIZIZ2 = C13ZA.LIZIZ(c13ze.LIZLLL, i5, c13ze.LJIIJ());
        if (iLIZIZ < iLIZIZ2) {
            ArrayList<C13Z7> arrayList = c13ze.LIZLLL;
            ArrayList arrayList2 = new ArrayList(iLIZIZ2 - iLIZIZ);
            for (int i18 = iLIZIZ; i18 < iLIZIZ2; i18++) {
                C13Z7 c13z7 = (C13Z7) ListProtector.get(arrayList, i18);
                c13z7.LIZ += i12;
                arrayList2.add(c13z7);
            }
            c13ze2.LIZLLL.addAll(C13ZA.LIZIZ(c13ze2.LIZLLL, c13ze2.LJIJI, c13ze2.LJIIJ()), arrayList2);
            arrayList.subList(iLIZIZ, iLIZIZ2).clear();
            list = arrayList2;
        } else {
            list = C13BV.INSTANCE;
        }
        if (!list.isEmpty()) {
            HashMap<C13Z7, C20031613Zi> map = c13ze.LJ;
            HashMap<C13Z7, C20031613Zi> map2 = c13ze2.LJ;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i19 = 0; i19 < size; i19++) {
                    Object obj = ListProtector.get(list, i19);
                    C20031613Zi c20031613Zi = map.get(obj);
                    if (c20031613Zi != null) {
                        map.remove(obj);
                        map2.put((C13Z7) obj, c20031613Zi);
                    }
                }
            }
        }
        int i20 = c13ze2.LJIJJLI;
        C20031613Zi c20031613ZiLJJIZ = c13ze2.LJJIZ(i11);
        if (c20031613ZiLJJIZ != null) {
            int iLIZ = i20 + 1;
            int i21 = c13ze2.LJIJI;
            int i22 = -1;
            while (iLIZ < i21) {
                i22 = iLIZ;
                iLIZ = C13ZA.LIZ(iLIZ, c13ze2.LIZIZ) + iLIZ;
            }
            ArrayList<Object> arrayList3 = c20031613ZiLJJIZ.LIZIZ;
            if (arrayList3 == null) {
                arrayList3 = new ArrayList<>();
                c20031613ZiLJJIZ.LIZIZ = arrayList3;
            }
            if (i22 >= 0 && (c13z7LJJJJ = c13ze2.LJJJJ(i22)) != null) {
                int size2 = arrayList3.size();
                i3 = 0;
                while (true) {
                    if (i3 < size2) {
                        Object obj2 = ListProtector.get(arrayList3, i3);
                        if (Intrinsics.LJFF(obj2, c13z7LJJJJ) || ((obj2 instanceof C20031613Zi) && ((C20031613Zi) obj2).LIZ(c13z7LJJJJ))) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
            } else {
                i3 = 0;
            }
            ListProtector.add(arrayList3, i3, c13ze2.LIZIZ(i21));
        }
        int iLJJIII = c13ze.LJJIII(i);
        if (z3) {
            if (z) {
                if (iLJJIII >= 0) {
                    z5 = true;
                    c13ze.LJJJ();
                    c13ze.LIZ(iLJJIII - c13ze.LJIJI);
                    c13ze.LJJJ();
                } else {
                    z5 = false;
                }
                c13ze.LIZ(i - c13ze.LJIJI);
                zLJJIJ = c13ze.LJJIIZI();
                if (z5) {
                    c13ze.LJJIJIL();
                    c13ze.LJI();
                    c13ze.LJJIJIL();
                    c13ze.LJI();
                }
            } else {
                zLJJIJ = c13ze.LJJIJ(i, iLJIILL);
                c13ze.LJJIJIIJI(iLJ, i6, i - 1);
            }
            if (!(!zLJJIJ)) {
                s.LIZJ("Unexpectedly removed anchors");
            }
        }
        int i23 = c13ze2.LJIILJJIL;
        int i24 = iArr[i8 + 1];
        if ((1073741824 & i24) != 0) {
            i2 = 1;
        } else {
            i2 = i24 & 67108863;
        }
        c13ze2.LJIILJJIL = i23 + i2;
        if (z2) {
            c13ze2.LJIJI = i13;
            c13ze2.LJIIIIZZ = i10 + i6;
        }
        if (z4) {
            c13ze2.LJJJJJ(i11);
        }
        return list;
    }
}
