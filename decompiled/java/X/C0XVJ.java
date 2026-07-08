package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.0XVJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XVJ {
    public static C0XVK LIZ(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        String string = bundle.getString("previous_uid");
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        C0XQ7.LJFF();
        boolean zLJJIJL = AbstractC848400XPy.LJJIJL(string);
        C0XQ7.LJFF();
        boolean zLJJIJL2 = AbstractC848400XPy.LJJIJL(curUserId);
        if (zLJJIJL) {
            if (!zLJJIJL2) {
                return C0XVK.LOGIN;
            }
        } else if (!zLJJIJL2) {
            return C0XVK.SWITCH_ACCOUNT;
        }
        return C0XVK.LOGOUT;
    }
}
