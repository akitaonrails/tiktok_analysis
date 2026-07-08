package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0NFA, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NFA {
    public static int LIZ(int i, String str) {
        int i2;
        if (i >= 2 && i <= 3) {
            i2 = 1080;
        } else {
            i2 = 0;
        }
        if (i >= 10) {
            if (i <= 18) {
                i2 = 720;
            } else if (i >= 20) {
                if (i <= 28) {
                    i2 = 540;
                } else if (i >= 30) {
                    if (i <= 38) {
                        i2 = 480;
                    } else if (i >= 40 && i <= 48) {
                        i2 = 360;
                    }
                }
            }
        }
        if (((Boolean) C1474810oTv.z4.getValue()).booleanValue() && 100000 <= i && i <= 999999) {
            int i3 = (i / 10000) % 10;
            if (i3 == 2) {
                return 480;
            }
            if (i3 == 3) {
                return 540;
            }
            if (i3 == 4) {
                return 720;
            }
            if (i3 == 5) {
                return 1080;
            }
        }
        if (i2 != 0 || TextUtils.isEmpty(str)) {
            return i2;
        }
        if (str.contains("1080")) {
            return 1080;
        }
        if (str.contains("720")) {
            return 720;
        }
        if (str.contains("540")) {
            return 540;
        }
        if (str.contains("480")) {
            return 480;
        }
        if (str.contains("360")) {
            return 360;
        }
        return 0;
    }
}
