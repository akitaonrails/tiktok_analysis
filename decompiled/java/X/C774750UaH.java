package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0UaH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C774750UaH {
    public static final boolean LIZ(int i, C774740UaG c774740UaG) {
        int iIntValue;
        int iIntValue2;
        Integer num;
        Integer num2;
        Map<Integer, Integer> map = c774740UaG.LIZLLL;
        if (map != null && (num2 = map.get(Integer.valueOf(i))) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        Map<Integer, Integer> map2 = c774740UaG.LJ;
        if (map2 != null && (num = map2.get(Integer.valueOf(i))) != null) {
            iIntValue2 = num.intValue();
        } else {
            iIntValue2 = 0;
        }
        if (iIntValue < 0 || iIntValue > iIntValue2) {
            return false;
        }
        return true;
    }
}
