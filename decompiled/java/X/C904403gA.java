package X;

import java.util.List;
import java.util.regex.Pattern;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03gA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C904403gA implements InterfaceC905003gG {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("eg_pi_vnatmcard_c_d_issue_date_holder_name", "eg_pi_vnatmcard_c_d_expiration_date_holder_name");

    @Override // X.InterfaceC905003gG
    public final C904003g6 LIZ(String... strArr) {
        boolean z = false;
        String str = (String) C13LQ.LJJIIZ(0, strArr);
        C904003g6 c904003g6 = new C904003g6(0);
        if (str == null || a0.LJJJIL(str)) {
            z = true;
        }
        if (z) {
            c904003g6.LIZJ("pipo_common_error_required_field", "pipo_common_payin_cardholder_name");
        } else if (!Pattern.matches("^[a-zA-Z ]*$", str)) {
            c904003g6.LIZJ("pipo_common_error_is_invalid", "pipo_common_payin_cardholder_name");
            return c904003g6;
        }
        return c904003g6;
    }
}
