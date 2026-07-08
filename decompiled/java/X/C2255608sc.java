package X;

import Y.AComparatorS22S0000000_3;
import Y.AComparatorS502S0100000_3;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.08sc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2255608sc implements InterfaceC2256308sj {
    public static List LIZIZ(C2255508sb c2255508sb, int i) {
        if (i <= 0) {
            return C13BV.INSTANCE;
        }
        long j = c2255508sb.LIZJ;
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        long j3 = j / j2;
        long j4 = c2255508sb.LIZLLL / j2;
        int i2 = 1;
        if (i == 1) {
            return Collections.singletonList(Long.valueOf((j3 + j4) / ((long) 2)));
        }
        long j5 = j4 - j3;
        int i3 = i - 1;
        if (i3 >= 1) {
            i2 = i3;
        }
        long j6 = j5 / ((long) i2);
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, i);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRangeLJIILJJIL, 10));
        C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
        while (it2.LLILLL) {
            long jNextInt = (((long) it2.nextInt()) * j6) + j3;
            if (jNextInt > j4) {
                jNextInt = j4;
            }
            arrayList.add(Long.valueOf(jNextInt));
        }
        return arrayList;
    }

    @Override // X.InterfaceC2256308sj
    public final LinkedHashMap LIZ(int i, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list.isEmpty()) {
            return linkedHashMap;
        }
        if (list.size() == 1) {
            linkedHashMap.put(ListProtector.get(list, 0), LIZIZ((C2255508sb) ListProtector.get(list, 0), 3));
            return linkedHashMap;
        }
        if (list.size() <= i) {
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(1);
            }
            int size2 = i - list.size();
            List listLJLLLL = C13LP.LJLLLL(new AComparatorS502S0100000_3(list, 4), C1697810uHb.LJIIIZ(list));
            int i3 = 0;
            while (size2 > 0) {
                int iIntValue = ((Number) ListProtector.get(listLJLLLL, i3 % listLJLLLL.size())).intValue();
                ListProtector.set(arrayList, iIntValue, Integer.valueOf(((Number) ListProtector.get(arrayList, iIntValue)).intValue() + 1));
                size2--;
                i3++;
            }
            int size3 = list.size();
            for (int i4 = 0; i4 < size3; i4++) {
                linkedHashMap.put(ListProtector.get(list, i4), LIZIZ((C2255508sb) ListProtector.get(list, i4), ((Number) ListProtector.get(arrayList, i4)).intValue()));
            }
        } else {
            for (C2255508sb c2255508sb : C13LP.LJLLLL(new AComparatorS22S0000000_3(25), list)) {
                if (i <= 0) {
                    break;
                }
                linkedHashMap.put(c2255508sb, LIZIZ(c2255508sb, 1));
                i--;
            }
        }
        return linkedHashMap;
    }
}
