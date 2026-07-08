package X;

import android.view.View;

/* JADX INFO: renamed from: X.18zr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21467718zr {
    public static EnumC21467818zs LIZ(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return EnumC21467818zs.INVISIBLE;
        }
        return LIZIZ(view.getVisibility());
    }

    public static EnumC21467818zs LIZIZ(int i) {
        if (i != 0) {
            if (i != 4) {
                if (i == 8) {
                    return EnumC21467818zs.GONE;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unknown visibility ");
                sbLIZ.append(i);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            return EnumC21467818zs.INVISIBLE;
        }
        return EnumC21467818zs.VISIBLE;
    }
}
