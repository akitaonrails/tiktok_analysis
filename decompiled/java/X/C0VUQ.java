package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Calendar;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0VUQ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VUQ {
    public static final C0VUQ LIZ = new C0VUQ();
    public static final C19319410i8 LIZIZ = new C19319410i8("push_ActiveHourStats");

    public static long LIZ(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis() / 86400000;
    }

    public static int[] LIZIZ(String str) {
        int iIntValue;
        int[] iArr = new int[24];
        if (str.length() == 0) {
            return iArr;
        }
        List listLJJLIIIJ = a0.LJJLIIIJ(str, new char[]{','}, false, 0, 6);
        int iMin = Math.min(listLJJLIIIJ.size(), 24);
        for (int i = 0; i < iMin; i++) {
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(a0.LJLIIIL((String) ListProtector.get(listLJJLIIIJ, i)).toString());
            if (numLJIIJJI == null || (iIntValue = numLJIIJJI.intValue()) < 0) {
                iIntValue = 0;
            }
            iArr[i] = iIntValue;
        }
        return iArr;
    }
}
