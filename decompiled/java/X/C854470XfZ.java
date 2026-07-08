package X;

import android.content.Context;
import com.ss.android.ugc.aweme.account.model.TwoStepVerifyWays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0XfZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C854470XfZ {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static HashMap LIZ(List list) {
        String str;
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                TwoStepVerifyWays twoStepVerifyWays = (TwoStepVerifyWays) it2.next();
                if (twoStepVerifyWays != null && (str = twoStepVerifyWays.verify_way) != null) {
                    switch (str.hashCode()) {
                        case -797498437:
                            if (str.equals("pwd_verify")) {
                                map.put("password", Boolean.TRUE);
                            }
                            break;
                        case 300626556:
                            if (str.equals("email_verify")) {
                                map.put("email", Boolean.TRUE);
                            }
                            break;
                        case 312290780:
                            if (str.equals("mobile_sms_verify")) {
                                map.put("sms", Boolean.TRUE);
                            }
                            break;
                        case 1972338561:
                            if (str.equals("totp_verify")) {
                                map.put("totp", Boolean.TRUE);
                            }
                            break;
                    }
                }
            }
        }
        return map;
    }

    public static EnumC852910Xd3 LIZJ(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -797498437) {
            if (iHashCode != 312290780) {
                if (iHashCode == 1972338561 && str.equals("totp_verify")) {
                    return EnumC852910Xd3.VERIFY_TOTP;
                }
            } else if (str.equals("mobile_sms_verify")) {
                return EnumC852910Xd3.TWO_STEP_EMAIL_PASSWORD_VERIFY_SMS_2SV;
            }
        } else if (str.equals("pwd_verify")) {
            return EnumC852910Xd3.TWO_STEP_PHONE_VERIFY_PASSWORD_2SV;
        }
        return EnumC852910Xd3.TWO_STEP_EMAIL_PASSWORD_VERIFY_EMAIL_CODE_2SV;
    }

    public static String LIZIZ(Context context, String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -797498437) {
            if (iHashCode != 312290780) {
                if (iHashCode == 1972338561 && str.equals("totp_verify")) {
                    return context.getString(2131857344);
                }
            } else if (str.equals("mobile_sms_verify")) {
                return context.getString(2131857347);
            }
        } else if (str.equals("pwd_verify")) {
            return context.getString(2131857346);
        }
        return context.getString(2131857345);
    }
}
