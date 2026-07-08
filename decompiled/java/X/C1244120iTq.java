package X;

import android.content.res.Resources;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0iTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1244120iTq {
    public static Object LIZ(int i, Object[] objArr) {
        try {
            return objArr[i];
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String[] LIZIZ(Resources resources, short... sArr) {
        short[] sArrCopyOf = Arrays.copyOf(sArr, sArr.length);
        String[] stringArray = resources.getStringArray(R.array.ak);
        String[] strArr = new String[sArrCopyOf.length];
        int length = sArrCopyOf.length;
        for (int i = 0; i < length; i++) {
            strArr[i] = stringArray[sArrCopyOf[i]];
        }
        return strArr;
    }
}
