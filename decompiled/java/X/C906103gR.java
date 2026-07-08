package X;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.03gR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C906103gR implements InterfaceC905003gG {
    public static final List<String> LIZ = Collections.singletonList("eg_pi_vnatmcard_c_d_expiration_date_expiration_date");

    @Override // X.InterfaceC905003gG
    public final C904003g6 LIZ(String... strArr) {
        boolean z;
        int iLIZJ;
        String str = (String) C13LQ.LJJIIZ(0, strArr);
        String str2 = (String) C13LQ.LJJIIZ(1, strArr);
        C904003g6 c904003g6 = new C904003g6(0);
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int i2 = calendar.get(2);
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            c904003g6.LIZJ("pipo_common_error_required_field", "pipo_common_payin_expiry_date");
            iLIZJ = -1;
        } else {
            iLIZJ = C906203gS.LIZJ(str);
            if (!Pattern.matches("^[0-9]{2}$", str)) {
                c904003g6.LIZJ("pipo_common_payin_expiry_date", new String[0]);
            } else if (iLIZJ > i + 15) {
                c904003g6.LIZJ("pipo_common_error_year_too_far", new String[0]);
            } else {
                int iLIZIZ = C906203gS.LIZIZ(str2);
                if (iLIZJ < i || (iLIZJ == i && iLIZIZ < i2)) {
                    c904003g6.LIZJ("pipo_common_error_card_expired", new String[0]);
                }
            }
        }
        C904003g6 c904003g62 = new C904003g6(0);
        if (str2 != null && str2.length() != 0) {
            int iLIZ = C906203gS.LIZ(str2);
            if (!Pattern.matches("^[0-9]{2}$", str2)) {
                c904003g62.LIZJ("pipo_common_payin_expiry_date", new String[0]);
            } else if (iLIZ <= 12 && iLIZ >= 1) {
                if ((iLIZJ == i && iLIZ < i2) || iLIZJ < i) {
                    c904003g62.LIZJ("pipo_common_error_card_expired", new String[0]);
                }
            } else {
                c904003g62.LIZJ("pipo_common_error_month_check", new String[0]);
            }
        } else {
            c904003g6.LIZJ("pipo_common_error_required_field", "pipo_common_payin_expiry_date");
        }
        ((ArrayList) c904003g6.LIZIZ).add(c904003g62);
        return c904003g6;
    }
}
