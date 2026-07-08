package X;

import android.text.StaticLayout;
import android.text.TextPaint;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0DIW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DIW {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZLLL(int i) {
        switch (i / 10) {
            case 1:
                return 24;
            case 2:
                return 20;
            case 3:
                return 17;
            case 4:
                return 15;
            case 5:
                return 14;
            case 6:
                return 13;
            case 7:
                return 12;
            case 8:
                return 11;
            case BdTuring.TYPE_ECAF /* 9 */:
                return 10;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
                return 16;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return 32;
            default:
                return 0;
        }
    }

    public static int LIZ(CharSequence charSequence, TextPaint textPaint, int i, float f, List list, boolean z) {
        if (list.isEmpty()) {
            return 0;
        }
        if (i > 0 && charSequence.length() != 0) {
            TextPaint textPaint2 = new TextPaint(textPaint);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i2 = 0;
            Integer numValueOf = null;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    Pair pair = (Pair) obj;
                    int iIntValue = ((Number) pair.getFirst()).intValue();
                    int iIntValue2 = ((Number) pair.getSecond()).intValue();
                    while (iIntValue <= iIntValue2) {
                        int i4 = (iIntValue + iIntValue2) / 2;
                        Integer numValueOf2 = Integer.valueOf(i4);
                        Object objValueOf = linkedHashMap.get(numValueOf2);
                        if (objValueOf == null) {
                            textPaint2.setTextSize(i4 * f);
                            objValueOf = Integer.valueOf(StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint2, i).setIncludePad(z).build().getLineCount());
                            linkedHashMap.put(numValueOf2, objValueOf);
                        }
                        if (((Number) objValueOf).intValue() <= i3) {
                            numValueOf = Integer.valueOf(i4);
                            iIntValue = i4 + 1;
                        } else {
                            iIntValue2 = i4 - 1;
                        }
                    }
                    if (numValueOf != null) {
                        return numValueOf.intValue();
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return ((Number) ((Pair) C13LP.LJJLIIIJJI(list)).getFirst()).intValue();
        }
        return ((Number) ((Pair) C13LP.LJJJJZI(list)).getSecond()).intValue();
    }

    public static Integer LIZIZ(CharSequence charSequence, TextPaint textPaint, int i, float f, List list, int i2, boolean z) {
        if (list.isEmpty() || i2 <= 0) {
            return null;
        }
        if (i > 0) {
            int i3 = 0;
            if (charSequence.length() != 0) {
                TextPaint textPaint2 = new TextPaint(textPaint);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : list) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        Pair pair = (Pair) obj;
                        int iIntValue = ((Number) pair.getFirst()).intValue();
                        int iIntValue2 = ((Number) pair.getSecond()).intValue();
                        if (LIZJ(linkedHashMap, textPaint2, f, charSequence, i, z, iIntValue) <= i4) {
                            int iMin = Math.min(LIZJ(linkedHashMap, textPaint2, f, charSequence, i, z, iIntValue2), i2);
                            Integer numValueOf = null;
                            while (iIntValue <= iIntValue2) {
                                int i5 = (iIntValue + iIntValue2) / 2;
                                if (LIZJ(linkedHashMap, textPaint2, f, charSequence, i, z, i5) <= iMin) {
                                    numValueOf = Integer.valueOf(i5);
                                    iIntValue = i5 + 1;
                                } else {
                                    iIntValue2 = i5 - 1;
                                }
                            }
                            if (numValueOf != null) {
                                return Integer.valueOf(numValueOf.intValue());
                            }
                        }
                        i3 = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                return null;
            }
        }
        return (Integer) ((Pair) C13LP.LJJJJZI(list)).getSecond();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int LIZJ(Map<Integer, Integer> map, TextPaint textPaint, float f, CharSequence charSequence, int i, boolean z, int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        Object objValueOf = ((LinkedHashMap) map).get(numValueOf);
        if (objValueOf == null) {
            textPaint.setTextSize(i2 * f);
            objValueOf = Integer.valueOf(StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i).setIncludePad(z).build().getLineCount());
            map.put(numValueOf, objValueOf);
        }
        return ((Number) objValueOf).intValue();
    }
}
