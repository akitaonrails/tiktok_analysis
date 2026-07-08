package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.0Xbk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C852100Xbk {
    public static int LIZ(C0XYD c0xyd) {
        if (c0xyd.scene() == EnumC852660Xce.MODIFY_PHONE) {
            return 26;
        }
        Bundle extras = c0xyd.getExtras();
        if (extras != null) {
            if (extras.getBoolean("from_changePwd")) {
                return 11;
            }
            if (c0xyd.scene() == EnumC852660Xce.SIGN_UP) {
                return 1;
            }
            return 6;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
