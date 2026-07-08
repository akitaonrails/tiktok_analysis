package X;

/* JADX INFO: renamed from: X.0Tcp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C750850Tcp {
    public static final int LIZIZ(boolean z) {
        if (z) {
            return 1;
        }
        if (!z) {
            return 2;
        }
        throw new C1954807lC();
    }

    public static final boolean LIZ(boolean z, Integer num) {
        if (num != null && num.intValue() != 0) {
            if (num.intValue() == 1) {
                return true;
            }
            return false;
        }
        return z;
    }
}
