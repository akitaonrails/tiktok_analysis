package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Q0E, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q0E {
    public static final String LIZIZ(String str) {
        return UriProtector.parse(str).buildUpon().appendQueryParameter("x-tt-pns-dt-pass-id", "268959750").toString();
    }

    public static final C0Q0D LIZ(Pair<Integer, Integer> pair, Float f, Float f2) {
        int iIntValue = pair.getFirst().intValue();
        int iIntValue2 = pair.getSecond().intValue();
        if (iIntValue > 0 && iIntValue2 > 0) {
            float f3 = iIntValue;
            float f4 = iIntValue2;
            float f5 = f3 / f4;
            if (f != null && f5 < f.floatValue()) {
                float fFloatValue = f3 / f.floatValue();
                return new C0Q0D(0, (int) ((f4 - fFloatValue) / 2.0f), iIntValue, (int) fFloatValue);
            }
            if (f2 != null && f5 > f2.floatValue()) {
                float fFloatValue2 = f4 * f2.floatValue();
                return new C0Q0D((int) ((f3 - fFloatValue2) / 2.0f), 0, (int) fFloatValue2, iIntValue2);
            }
            return null;
        }
        return null;
    }
}
