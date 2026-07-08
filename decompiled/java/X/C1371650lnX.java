package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0lnX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1371650lnX {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(java.util.List r7) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1371650lnX.LIZ(java.util.List):void");
    }

    public static final int LIZJ(String str, List list) {
        if (list.contains(str)) {
            return list.indexOf(str);
        }
        return Integer.MAX_VALUE;
    }

    public static final Map LIZIZ(int i, List list, List list2) {
        int iIntValue;
        HashMap map = new HashMap();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            map.put(it2.next(), 0);
        }
        if (list.size() >= 100) {
            C1374860lsi.LIZJ().LJ = Integer.valueOf(((C353310DtB) ListProtector.get(list, list.size() - 1)).LIZ);
        }
        if (list.size() > i && i <= 100) {
            list = list.subList(0, i);
        }
        for (C353310DtB c353310DtB : list) {
            C352000Dr4.LIZIZ.LIZIZ(new AwS549S0100000_5(c353310DtB, 1074));
            int size = list.size() - list.indexOf(c353310DtB);
            Integer num = (Integer) map.get(c353310DtB.LIZJ);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (iIntValue < size) {
                map.put(c353310DtB.LIZJ, Integer.valueOf(size));
            }
        }
        return map;
    }
}
