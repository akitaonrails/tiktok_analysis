package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0u5u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690560u5u {
    public static final List<Integer> LIZ(InterfaceC1690480u5m interfaceC1690480u5m, C1682920tta c1682920tta, C1690570u5v c1690570u5v) {
        IntRange intRange;
        boolean z;
        if (c1690570u5v.LIZ.LLILLL == 0 && c1682920tta.isEmpty()) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        if (c1690570u5v.LIZ.LLILLL != 0) {
            C19968013Aw<C1690580u5w> c19968013Aw = c1690570u5v.LIZ;
            int i = c19968013Aw.LLILLL;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C1690580u5w[] c1690580u5wArr = c19968013Aw.LL;
                int i2 = c1690580u5wArr[0].LIZ;
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = c1690580u5wArr[i3].LIZ;
                    if (i4 < i2) {
                        i2 = i4;
                    }
                }
                if (i2 < 0) {
                    C1691080u6k.LIZ("negative minIndex");
                }
                C19968013Aw<C1690580u5w> c19968013Aw2 = c1690570u5v.LIZ;
                int i5 = c19968013Aw2.LLILLL;
                if (i5 == 0) {
                    throw new NoSuchElementException("MutableVector is empty.");
                }
                C1690580u5w[] c1690580u5wArr2 = c19968013Aw2.LL;
                int i6 = c1690580u5wArr2[0].LIZIZ;
                for (int i7 = 0; i7 < i5; i7++) {
                    int i8 = c1690580u5wArr2[i7].LIZIZ;
                    if (i8 > i6) {
                        i6 = i8;
                    }
                }
                intRange = new IntRange(i2, Math.min(i6, interfaceC1690480u5m.getItemCount() - 1));
            } else {
                throw new NoSuchElementException("MutableVector is empty.");
            }
        } else {
            IntRange.LLILZIL.getClass();
            intRange = IntRange.LLILZLL;
        }
        int size = c1682920tta.size();
        for (int i9 = 0; i9 < size; i9++) {
            InterfaceC1690590u5x interfaceC1690590u5x = (InterfaceC1690590u5x) ListProtector.get(c1682920tta, i9);
            int iLIZ = C1690460u5k.LIZ(interfaceC1690590u5x.getIndex(), interfaceC1690480u5m, interfaceC1690590u5x.getKey());
            int i10 = intRange.LL;
            if ((iLIZ > intRange.LLILLJJLI || i10 > iLIZ) && iLIZ >= 0 && iLIZ < interfaceC1690480u5m.getItemCount()) {
                arrayList.add(Integer.valueOf(iLIZ));
            }
        }
        int i11 = intRange.LL;
        int i12 = intRange.LLILLJJLI;
        if (i11 <= i12) {
            while (true) {
                arrayList.add(Integer.valueOf(i11));
                if (i11 == i12) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }
}
