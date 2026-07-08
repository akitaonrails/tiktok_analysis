package X;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0WkZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C832090WkZ extends AbstractC832120Wkc {
    public static final C832090WkZ LIZ = new C832090WkZ();

    @Override // X.AbstractC832120Wkc
    public final String LIZ() {
        return "Login";
    }

    public static final void LJ(String str) {
        HashMap map = new HashMap();
        map.put("event", "on update user info result check");
        map.put("errorMsg", str);
        LIZ.LIZIZ(map.toString());
    }

    public static final void LIZJ(String str, String str2, EnumC587430N2f enumC587430N2f) {
        String strName;
        HashMap map = new HashMap();
        map.put("event", "login part fail");
        if (str == null) {
            str = "";
        }
        map.put("errorCode", str);
        if (str2 == null) {
            str2 = "";
        }
        map.put("errorMsg", str2);
        if (enumC587430N2f == null || (strName = enumC587430N2f.name()) == null) {
            strName = "";
        }
        map.put("part", strName);
        map.put("loginMethod", "");
        map.put("extra", "");
        LIZ.LIZIZ(map.toString());
    }

    public static final void LIZLLL(int i, String str, boolean z, boolean z2) {
        HashMap map = new HashMap();
        map.put("event", "Auto fill SMS verification code");
        map.put("success", String.valueOf(z));
        map.put("hasSimCard", String.valueOf(z2));
        map.put("googleAvailability", String.valueOf(i));
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                str = "";
            }
            map.put("errorMsg", str);
        }
        LIZ.LIZIZ(map.toString());
    }
}
