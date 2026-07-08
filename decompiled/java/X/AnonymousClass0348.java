package X;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: renamed from: X.0348, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0348<T> implements Comparator {
    public static final AnonymousClass0348<T> LL = new AnonymousClass0348<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iIntValue;
        Map<Integer, Integer> map = AnonymousClass0347.LIZ;
        Integer num = map.get(obj);
        int iIntValue2 = 0;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Integer num2 = map.get(obj2);
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        return iIntValue - iIntValue2;
    }
}
