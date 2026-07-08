package X;

import android.content.Context;
import android.graphics.Color;
import android.text.Layout;
import android.util.TypedValue;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0F9I, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F9I {
    public static final Set<Integer> LIZ = C13LQ.LJLIIL(new Integer[]{-1, -16777216, -1425344, -27843, -864954, -8863138, -8861530, -13265168, -14400333, -11053355, -469015, -5994149, -13479364, -13670003, -7170146, -13421773});
    public static final int[] LIZIZ = {-1, -16777216, -1425344, -27843, -864954, -8863138, -16732005, -16734003, -13265168, -14400333, -11053355, -6723855, -3592449, -2988141, -12505560, -5090498, -5994149, -13479364, -13670003, -14600875, -7545365, -7033857, -4935681, -343041, -19024, -2138, -7170146, -13421773};
    public static final Set<Integer> LIZJ = C13LQ.LJLIIL(new Integer[]{-2988141, -7545365, -7033857, -4935681, -343041, -19024, -2138});

    public static final int[] LJ() {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "edit_text_sticker_add_christmas_color", true, false)) {
            return LIZIZ;
        }
        List<Integer> listLJJZZIII = C13LQ.LJJZZIII(LIZIZ);
        ListProtector.add(listLJJZZIII, 2, -4970705);
        ListProtector.add(listLJJZZIII, 3, -16738494);
        return C13LP.LLII(listLJJZZIII);
    }

    public static List LIZ(int i) {
        return C1697810uHb.LJ(Float.valueOf(((i >> 16) & 255) / 255.0f), Float.valueOf(((i >> 8) & 255) / 255.0f), Float.valueOf((i & 255) / 255.0f), Float.valueOf(((i >> 24) & 255) / 255.0f));
    }

    public static String LIZIZ(C385340F8y c385340F8y) {
        Layout layout = c385340F8y.getLayout();
        if (layout == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            CharSequence charSequenceSubSequence = C2204961BRm.LLJILLL(c385340F8y, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSULBhVsNHRBO+qI7yuRLiYTMUFmmxp4kmKn8KwP3dULrQ==", null)).subSequence(layout.getLineStart(i), layout.getLineEnd(i));
            sb.append(charSequenceSubSequence);
            if (i != layout.getLineCount() - 1 && !a0.LJJIJIL(charSequenceSubSequence, "\n")) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static int LIZJ(int i, int i2) {
        int i3;
        int i4 = (16711680 & i) >> 16;
        int i5 = (65280 & i) >> 8;
        int i6 = i & 255;
        if (LIZJ.contains(Integer.valueOf(i2))) {
            i3 = 77;
        } else {
            i3 = 153;
        }
        return Color.argb(i3, i4, i5, i6);
    }

    public static Pair LIZLLL(int i, int i2) {
        switch (i) {
            case -16732005:
            case -8861530:
                int i3 = C385340F8y.LLJLLL;
                if (C0F8K.LIZ(i2, true)) {
                    return new Pair(-1, -16732005);
                }
                if (i2 == 4) {
                    return new Pair(-16732005, -1);
                }
                return new Pair(-16732005, -1);
            case -14400333:
                int i4 = C385340F8y.LLJLLL;
                if (C0F8K.LIZ(i2, true)) {
                    return new Pair(-1, Integer.valueOf(i));
                }
                if (i2 == 4) {
                    return new Pair(Integer.valueOf(i), -864954);
                }
                return new Pair(Integer.valueOf(i), -1);
            case -7545365:
                int i5 = C385340F8y.LLJLLL;
                if (C0F8K.LIZ(i2, false)) {
                    return new Pair(-15639704, Integer.valueOf(i));
                }
                if (i2 == 3) {
                    return new Pair(-1770497, Integer.valueOf(i));
                }
                if (i2 == 4) {
                    return new Pair(Integer.valueOf(i), -15639704);
                }
                return new Pair(Integer.valueOf(i), -1);
            case -7033857:
                int i6 = C385340F8y.LLJLLL;
                if (C0F8K.LIZ(i2, false)) {
                    return new Pair(-14601095, Integer.valueOf(i));
                }
                if (i2 == 3) {
                    return new Pair(-1770497, Integer.valueOf(i));
                }
                if (i2 == 4) {
                    return new Pair(Integer.valueOf(i), -14601095);
                }
                return new Pair(Integer.valueOf(i), -1);
            case -4935681:
                int i7 = C385340F8y.LLJLLL;
                if (C0F8K.LIZ(i2, false)) {
                    return new Pair(-12505167, Integer.valueOf(i));
                }
                if (i2 == 3) {
                    return new Pair(Integer.valueOf(i), -1645313);
                }
                if (i2 == 4) {
                    return new Pair(Integer.valueOf(i), -12505167);
                }
                return new Pair(Integer.valueOf(i), -1);
            case -2988141:
            case -469015:
                int i8 = C385340F8y.LLJLLL;
                if (C0F8K.LIZ(i2, false)) {
                    return new Pair(-2078329, -469015);
                }
                if (i2 == 3) {
                    return new Pair(-6156, -6156);
                }
                if (i2 == 4) {
                    return new Pair(-469015, -2988141);
                }
                return new Pair(-469015, -1);
            case -864954:
                int i9 = C385340F8y.LLJLLL;
                if (C0F8K.LIZ(i2, false)) {
                    return new Pair(-7976680, Integer.valueOf(i));
                }
                if (i2 == 3) {
                    return new Pair(-1, Integer.valueOf(i));
                }
                if (i2 == 4) {
                    return new Pair(Integer.valueOf(i), -7976680);
                }
                return new Pair(Integer.valueOf(i), -1);
            case -343041:
                int i10 = C385340F8y.LLJLLL;
                if (C0F8K.LIZ(i2, false)) {
                    return new Pair(-7198037, Integer.valueOf(i));
                }
                if (i2 == 3) {
                    return new Pair(-206081, Integer.valueOf(i));
                }
                if (i2 == 4) {
                    return new Pair(Integer.valueOf(i), -7198037);
                }
                return new Pair(Integer.valueOf(i), -1);
            case -27843:
                int i11 = C385340F8y.LLJLLL;
                if (C0F8K.LIZ(i2, true)) {
                    return new Pair(-1, Integer.valueOf(i));
                }
                if (i2 == 4) {
                    return new Pair(Integer.valueOf(i), -12052986);
                }
                return new Pair(Integer.valueOf(i), -1);
            case -19024:
                int i12 = C385340F8y.LLJLLL;
                if (C0F8K.LIZ(i2, false)) {
                    return new Pair(-2213325, -466473);
                }
                if (i2 == 3) {
                    return new Pair(-69141, -466473);
                }
                if (i2 == 4) {
                    return new Pair(-466473, -2213325);
                }
                return new Pair(Integer.valueOf(i), -1);
            case -2138:
                int i13 = C385340F8y.LLJLLL;
                if (C0F8K.LIZ(i2, false)) {
                    return new Pair(-5282775, Integer.valueOf(i));
                }
                if (i2 == 3) {
                    return new Pair(-540, Integer.valueOf(i));
                }
                if (i2 == 4) {
                    return new Pair(Integer.valueOf(i), -5282775);
                }
                return new Pair(Integer.valueOf(i), -1);
            case -1:
                int i14 = C385340F8y.LLJLLL;
                if (C0F8K.LIZ(i2, false)) {
                    return new Pair(-16777216, -1);
                }
                if (i2 == 3) {
                    return new Pair(-1, -1);
                }
                return new Pair(-1, -16777216);
            default:
                int i15 = C385340F8y.LLJLLL;
                if (C0F8K.LIZ(i2, true)) {
                    return new Pair(-1, Integer.valueOf(i));
                }
                return new Pair(Integer.valueOf(i), -1);
        }
    }

    public static float LJFF(float f, Context context) {
        return (C11VU.LIZIZ(4.0f, context) / TypedValue.applyDimension(2, 28.0f, context.getResources().getDisplayMetrics())) * f;
    }

    public static final Pair<Integer, Integer> LJI(int i, int i2) {
        int iIntValue;
        int iIntValue2;
        Pair pairLIZLLL = LIZLLL(i2, i);
        int i3 = C385340F8y.LLJLLL;
        if (!C0F8K.LIZ(i, false) && i != 4) {
            if (i == 3) {
                iIntValue = ((Number) pairLIZLLL.getFirst()).intValue();
                iIntValue2 = LIZJ(((Number) pairLIZLLL.getSecond()).intValue(), i2);
            } else {
                iIntValue = ((Number) pairLIZLLL.getFirst()).intValue();
                iIntValue2 = -1;
            }
        } else {
            iIntValue = ((Number) pairLIZLLL.getFirst()).intValue();
            iIntValue2 = ((Number) pairLIZLLL.getSecond()).intValue();
        }
        return new Pair<>(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
    }
}
