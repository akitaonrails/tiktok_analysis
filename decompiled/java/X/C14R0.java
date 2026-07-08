package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.14R0, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14R0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final int LIZ(String str) {
        String string;
        if (str != null) {
            string = a0.LJLIIIL(str).toString();
        } else {
            string = null;
        }
        if (string != null) {
            switch (string.hashCode()) {
                case -1078030475:
                    string.equals("medium");
                    return 2;
                case 3560192:
                    if (string.equals("tiny")) {
                        return 0;
                    }
                    break;
                case 102742843:
                    if (string.equals("large")) {
                        return 3;
                    }
                    break;
                case 109548807:
                    if (string.equals("small")) {
                        return 1;
                    }
                    break;
            }
        }
        return 2;
    }

    public static final int LIZIZ(String str) {
        String string;
        if (str != null) {
            string = a0.LJLIIIL(str).toString();
        } else {
            string = null;
        }
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -817598092) {
                if (iHashCode != -324798127) {
                    if (iHashCode == -314765822) {
                        string.equals("primary");
                    }
                } else if (string.equals("constSecondary")) {
                    return 2;
                }
            } else if (string.equals("secondary")) {
                return 1;
            }
        }
        return 0;
    }
}
