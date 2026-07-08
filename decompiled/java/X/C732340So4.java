package X;

import java.util.Random;

/* JADX INFO: renamed from: X.0So4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732340So4 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C732350So5());

    public static boolean LIZ(float f) {
        Random random = (Random) LIZ.getValue();
        if (f == 0.0f) {
            return false;
        }
        float f2 = f * 1.0f;
        if (f2 >= 1.0f || f2 < 0.0f || random.nextFloat() < f2) {
            return true;
        }
        return false;
    }
}
