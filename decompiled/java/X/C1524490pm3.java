package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0pm3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1524490pm3 {
    public static C1524560pmA LIZ(int i, String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            str2 = "network error:" + str;
        } else {
            str2 = "network error";
        }
        return new C1524560pmA(false, i, 21105, "", str2, 91);
    }
}
