package X;

import com.larus.business.markdown.api.model.TitleStyle;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.18lA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21376618lA {
    public static final /* synthetic */ int LIZ = 0;

    public static C21425518t3 LIZ(TitleStyle titleStyle) {
        int i;
        if (titleStyle != null && (i = C21376518l9.LIZ[titleStyle.ordinal()]) != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return new C21425518t3(C445120Hcs.LIZ(10), R.drawable.be_, C445120Hcs.LIZ(7), C445120Hcs.LIZ(7), C445120Hcs.LIZ(7), C445120Hcs.LIZ(7), C445120Hcs.LIZ(5), Integer.valueOf(R.drawable.btk));
                    }
                    throw new C1954807lC();
                }
            } else {
                return new C21425518t3(C445120Hcs.LIZ(9), R.drawable.be_, C445120Hcs.LIZ(7), C445120Hcs.LIZ(7), C445120Hcs.LIZ(7), C445120Hcs.LIZ(7), C445120Hcs.LIZ(8), Integer.valueOf(R.drawable.btk));
            }
        }
        return new C21425518t3(C445120Hcs.LIZ(6), R.drawable.be9, C445120Hcs.LIZ(4), 0, 0, 0, C445120Hcs.LIZ(12), null);
    }
}
