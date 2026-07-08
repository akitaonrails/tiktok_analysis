package X;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.13gK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20072613gK {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.13BV] */
    public static final boolean LIZ(List<C20068213fc> list) {
        ?? arrayList;
        long j;
        ArrayList arrayList2 = (ArrayList) list;
        if (arrayList2.size() < 2) {
            return true;
        }
        if (arrayList2.size() <= 1) {
            arrayList = C13BV.INSTANCE;
        } else {
            arrayList = new ArrayList();
            Object obj = ListProtector.get(list, 0);
            int size = arrayList2.size() - 1;
            int i = 0;
            while (i < size) {
                i++;
                Object obj2 = ListProtector.get(list, i);
                C20068213fc c20068213fc = (C20068213fc) obj2;
                C20068213fc c20068213fc2 = (C20068213fc) obj;
                arrayList.add(new C1378605aS((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (c20068213fc2.LJ().LIZJ() >> 32)) - Float.intBitsToFloat((int) (c20068213fc.LJ().LIZJ() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (c20068213fc2.LJ().LIZJ() & 4294967295L)) - Float.intBitsToFloat((int) (c20068213fc.LJ().LIZJ() & 4294967295L))))) & 4294967295L)));
                obj = obj2;
            }
        }
        if (arrayList.size() == 1) {
            j = ((C1378605aS) C13LP.LJJJJZI(arrayList)).LIZ;
        } else {
            if (arrayList.isEmpty()) {
                C09RP.LIZIZ("Empty collection can't be reduced.");
            }
            Object objLJJJJZI = C13LP.LJJJJZI(arrayList);
            int size2 = arrayList.size() - 1;
            if (1 <= size2) {
                int i2 = 1;
                while (true) {
                    objLJJJJZI = new C1378605aS(C1378605aS.LJI(((C1378605aS) objLJJJJZI).LIZ, ((C1378605aS) ListProtector.get(arrayList, i2)).LIZ));
                    if (i2 == size2) {
                        break;
                    }
                    i2++;
                }
            }
            j = ((C1378605aS) objLJJJJZI).LIZ;
        }
        if (Float.intBitsToFloat((int) (j & 4294967295L)) < Float.intBitsToFloat((int) (j >> 32))) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(C20068213fc c20068213fc) {
        if (C20069413fo.LIZ(c20068213fc.LJII(), C1696500uFU.LJI) == null && C20069413fo.LIZ(c20068213fc.LJII(), C1696500uFU.LJFF) == null) {
            return false;
        }
        return true;
    }

    public static final void LIZJ(C20068213fc c20068213fc, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int size;
        C1690920u6U c1690920u6U = (C1690920u6U) C20069413fo.LIZ(c20068213fc.LJII(), C1696500uFU.LJI);
        if (c1690920u6U != null) {
            accessibilityNodeInfoCompat.setCollectionInfo(C20093113jd.LIZIZ(c1690920u6U.LIZ, c1690920u6U.LIZIZ, 0, false));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (C20069413fo.LIZ(c20068213fc.LJII(), C1696500uFU.LJFF) != null) {
            List<C20068213fc> listLJIIIZ = c20068213fc.LJIIIZ();
            int size2 = listLJIIIZ.size();
            for (int i = 0; i < size2; i++) {
                C20068213fc c20068213fc2 = (C20068213fc) ListProtector.get(listLJIIIZ, i);
                if (c20068213fc2.LJII().LJ(C1696500uFU.LJJIJIIJI)) {
                    arrayList.add(c20068213fc2);
                }
            }
        }
        int size3 = 1;
        if (!arrayList.isEmpty()) {
            if (LIZ(arrayList)) {
                size = 1;
                size3 = arrayList.size();
            } else {
                size = arrayList.size();
            }
            accessibilityNodeInfoCompat.setCollectionInfo(C20093113jd.LIZIZ(size, size3, 0, false));
        }
    }

    public static final void LIZLLL(C20068213fc c20068213fc, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i;
        int i2 = 0;
        if (C20069413fo.LIZ(c20068213fc.LJII(), C1696500uFU.LJII) != null) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(C20092913jb.LIZ(0, 0, 0, 0, ((Boolean) c20068213fc.LJII().LJIIIZ(C1696500uFU.LJJIJIIJI, AFwS217S0000000_28.get$arr$(649))).booleanValue()));
        }
        C20068213fc c20068213fcLJIIIIZZ = c20068213fc.LJIIIIZZ();
        if (c20068213fcLJIIIIZZ != null && C20069413fo.LIZ(c20068213fcLJIIIIZZ.LJII(), C1696500uFU.LJFF) != null) {
            C1690920u6U c1690920u6U = (C1690920u6U) C20069413fo.LIZ(c20068213fcLJIIIIZZ.LJII(), C1696500uFU.LJI);
            if ((c1690920u6U != null && (c1690920u6U.LIZ < 0 || c1690920u6U.LIZIZ < 0)) || !c20068213fc.LJII().LJ(C1696500uFU.LJJIJIIJI)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            List<C20068213fc> listLJIIIZ = c20068213fcLJIIIIZZ.LJIIIZ();
            int size = listLJIIIZ.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                C20068213fc c20068213fc2 = (C20068213fc) ListProtector.get(listLJIIIZ, i4);
                if (c20068213fc2.LJII().LJ(C1696500uFU.LJJIJIIJI)) {
                    arrayList.add(c20068213fc2);
                    if (c20068213fc2.LIZJ.LJJIJL() < c20068213fc.LIZJ.LJJIJL()) {
                        i3++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                if (LIZ(arrayList)) {
                    i = 0;
                    i2 = i3;
                } else {
                    i = i3;
                }
                accessibilityNodeInfoCompat.setCollectionItemInfo(C20092913jb.LIZ(i, 1, i2, 1, ((Boolean) c20068213fc.LJII().LJIIIZ(C1696500uFU.LJJIJIIJI, AFwS219S0000000_30.get$arr$(306))).booleanValue()));
            }
        }
    }
}
