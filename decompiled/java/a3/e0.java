package a3;

import X.C1319890kS3;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* JADX INFO: loaded from: classes21.dex */
public final class e0 {
    public static final C1319890kS3 LIZ = new C1319890kS3();
    public static final long LIZIZ;

    static {
        long j = 0;
        LIZIZ = (j & 4294967295L) | (j << 32);
    }

    public static final TextDirectionHeuristic LIZ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            }
                            return TextDirectionHeuristics.LOCALE;
                        }
                        return TextDirectionHeuristics.ANYRTL_LTR;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        return TextDirectionHeuristics.LTR;
    }
}
