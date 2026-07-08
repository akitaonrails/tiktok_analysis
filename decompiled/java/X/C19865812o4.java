package X;

import java.security.SecureRandom;

/* JADX INFO: renamed from: X.12o4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19865812o4 {
    public static boolean LIZ(int i) {
        if (i <= 0) {
            return false;
        }
        if (i < 10000 && new SecureRandom().nextInt(10000) >= i) {
            return false;
        }
        return true;
    }
}
