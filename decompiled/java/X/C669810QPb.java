package X;

import android.view.View;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;

/* JADX INFO: renamed from: X.0QPb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669810QPb {
    public static final C669810QPb LIZ = new C669810QPb();
    public static boolean LIZIZ;

    public static boolean LIZIZ() {
        if (((Boolean) C0BCT.LIZ.getValue()).booleanValue()) {
            return LIZIZ;
        }
        return false;
    }

    public static void LIZ(View view) {
        String str;
        if (((Boolean) C0BCT.LIZ.getValue()).booleanValue() && LIZIZ) {
            return;
        }
        C669870QPh.LIZ.getClass();
        C669860QPg c669860QPg = C669870QPh.LIZIZ;
        if (c669860QPg != null) {
            long j = 0;
            if (c669860QPg.LIZ != 0 && c669860QPg.LIZIZ == 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C669860QPg c669860QPg2 = C669870QPh.LIZIZ;
                if (c669860QPg2 != null) {
                    j = c669860QPg2.LIZ;
                }
                c669860QPg.LIZIZ = jCurrentTimeMillis - j;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("type:");
                C669860QPg c669860QPg3 = C669870QPh.LIZIZ;
                Long lValueOf = null;
                if (c669860QPg3 != null) {
                    str = c669860QPg3.LJI;
                } else {
                    str = null;
                }
                sbLIZ.append(str);
                sbLIZ.append(" triggerOpen cost:");
                C669860QPg c669860QPg4 = C669870QPh.LIZIZ;
                if (c669860QPg4 != null) {
                    lValueOf = Long.valueOf(c669860QPg4.LIZIZ);
                }
                sbLIZ.append(lValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        KeyboardUtils.LIZLLL(view);
    }
}
