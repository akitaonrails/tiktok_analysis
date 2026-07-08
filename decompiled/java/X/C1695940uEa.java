package X;

import android.graphics.Path;

/* JADX INFO: renamed from: X.0uEa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695940uEa {
    public static final C1695950uEb LIZ() {
        return new C1695950uEb(0);
    }

    public static final Path.Direction LIZIZ(EnumC1669110tXJ enumC1669110tXJ) {
        int i = C1669120tXK.LIZ[enumC1669110tXJ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Path.Direction.CW;
            }
            throw new C1954807lC();
        }
        return Path.Direction.CCW;
    }

    public static final void LIZJ(String str) {
        throw new IllegalStateException(str);
    }
}
