package X;

import java.util.Locale;
import kotlin.ranges.IntRange;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.09Ut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2381309Ut {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(Object obj) {
        if (obj == null) {
            return 2;
        }
        if (obj instanceof Number) {
            int iIntValue = ((Number) obj).intValue();
            if (iIntValue >= 0 && iIntValue < 3) {
                return iIntValue;
            }
        } else {
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    return 1;
                }
                return 0;
            }
            if (obj instanceof String) {
                String string = a0.LJLIIIL((String) obj).toString();
                if (string.length() != 0) {
                    Integer numLJIIJJI = C2095008Iq.LJIIJJI(string);
                    if (numLJIIJJI != null && new IntRange(0, 2).LJLJL(numLJIIJJI.intValue())) {
                        return numLJIIJJI.intValue();
                    }
                    String lowerCase = string.toLowerCase(Locale.US);
                    int iHashCode = lowerCase.hashCode();
                    if (iHashCode != 110) {
                        if (iHashCode != 121) {
                            if (iHashCode != 3521) {
                                if (iHashCode != 119527) {
                                    if (iHashCode != 3569038) {
                                        if (iHashCode != 97196323 || !lowerCase.equals("false")) {
                                            return 2;
                                        }
                                        return 0;
                                    }
                                    if (!lowerCase.equals("true")) {
                                        return 2;
                                    }
                                    return 1;
                                }
                                if (!lowerCase.equals("yes")) {
                                    return 2;
                                }
                                return 1;
                            }
                            if (!lowerCase.equals("no")) {
                                return 2;
                            }
                            return 0;
                        }
                        if (!lowerCase.equals("y")) {
                            return 2;
                        }
                        return 1;
                    }
                    if (!lowerCase.equals("n")) {
                        return 2;
                    }
                    return 0;
                }
            }
        }
        return 2;
    }
}
