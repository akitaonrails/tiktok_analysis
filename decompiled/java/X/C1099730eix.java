package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarUIConfig;

/* JADX INFO: renamed from: X.0eix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099730eix {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZ(EnumC1099930ejH enumC1099930ejH) {
        int i = C1099920ejG.LIZ[enumC1099930ejH.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return 48.0f;
            }
            throw new C1954807lC();
        }
        return 44.0f;
    }

    public static float LIZLLL(EnumC1099930ejH enumC1099930ejH) {
        int i = C1099920ejG.LIZ[enumC1099930ejH.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return 12.0f;
                }
                throw new C1954807lC();
            }
            return 8.0f;
        }
        if (LiveToolbarUIConfig.expandContainer()) {
            return 6.0f;
        }
        return 8.0f;
    }

    public static float LIZIZ(boolean z, boolean z2) {
        if (z && !z2 && LiveToolbarUIConfig.expandContainer()) {
            return 38.0f;
        }
        return 36.0f;
    }

    public static float LIZJ(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                return 44.0f;
            }
            if (LiveToolbarUIConfig.expandContainer()) {
                return 38.0f;
            }
            return 36.0f;
        }
        return 36.0f;
    }
}
