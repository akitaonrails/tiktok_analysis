package X;

/* JADX INFO: renamed from: X.1Bxe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221841Bxe {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZJ(int i) {
        return i == 1 || i == 2 || i == 3;
    }

    public static final int LIZ(EnumC19379710rr enumC19379710rr) {
        int i = C19379810rs.LIZ[enumC19379710rr.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            throw new C1954807lC();
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean LIZIZ(String str) {
        double d;
        if (C20338614i8.LIZ) {
            return true;
        }
        switch (str.hashCode()) {
            case -1983264146:
                if (!str.equals("message_dispatch_size")) {
                }
                d = 0.01d;
                if (Math.random() < d) {
                }
                break;
            case -1904210294:
                if (!str.equals("message_hold_dispatch_release")) {
                }
                d = 0.01d;
                if (Math.random() < d) {
                }
                break;
            case -254278833:
                if (!str.equals("message_dispatch_list_delay")) {
                }
                d = 0.01d;
                if (Math.random() < d) {
                }
                break;
            case 717628919:
                if (!str.equals("message_no_listener_consume")) {
                }
                d = 0.01d;
                if (Math.random() < d) {
                }
                break;
            case 973637353:
                if (str.equals("message_sticky_release")) {
                    d = 0.1d;
                    if (Math.random() < d) {
                    }
                }
                break;
            case 1776652286:
                if (str.equals("message_dispatch_universal")) {
                    d = 0.001d;
                    if (Math.random() < d) {
                    }
                }
                break;
        }
        return true;
    }
}
