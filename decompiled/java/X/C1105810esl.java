package X;

import com.bytedance.android.livesdk.rank.api.RankAnimationType;
import java.util.Comparator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0esl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105810esl<T> implements Comparator {
    public static final C1105810esl<T> LL = new C1105810esl<>();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int iIntValue;
        Map<Object, Integer> map = RankAnimationType.LJIJJLI;
        Integer num = map.get(obj);
        int iIntValue2 = Integer.MAX_VALUE;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        Integer num2 = map.get(obj2);
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        return Intrinsics.LJI(iIntValue, iIntValue2);
    }
}
