package X;

import android.content.Context;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.LoginMethodName;

/* JADX INFO: renamed from: X.0XUw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C849680XUw {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(BaseLoginMethod baseLoginMethod) {
        if (baseLoginMethod.m157isOneClickLogin()) {
            return "oneclick";
        }
        return "history";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(com.ss.android.ugc.aweme.account.model.BaseLoginMethod r5) {
        /*
            boolean r0 = X.C846430XIj.LIZIZ()
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L49
            boolean r0 = r5.m157isOneClickLogin()
            if (r0 == 0) goto L47
            java.lang.String r0 = r5.getOneClickLoginToken()
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L2c
            X.0XWA r2 = X.C0XWA.LIZ
            java.lang.String r1 = r5.getUid()
            monitor-enter(r2)
            java.util.Set<java.lang.String> r0 = X.C0XWA.LIZJ     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L26
            goto L29
        L26:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L29:
            monitor-exit(r2)
            if (r0 == 0) goto L38
        L2c:
            java.lang.Boolean r1 = r5.getHasOIDC()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L47
        L38:
            com.ss.android.ugc.aweme.account.model.CommonUserInfo r0 = r5.getCommonUserInfo()
            if (r0 == 0) goto L40
            java.lang.String r3 = r0.userName
        L40:
            boolean r0 = X.C123100dR.LIZ(r3)
            if (r0 == 0) goto L47
            return r4
        L47:
            r4 = 0
            return r4
        L49:
            boolean r0 = r5.m157isOneClickLogin()
            if (r0 == 0) goto L68
            java.lang.String r0 = r5.getOneClickLoginToken()
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L68
            com.ss.android.ugc.aweme.account.model.CommonUserInfo r0 = r5.getCommonUserInfo()
            if (r0 == 0) goto L61
            java.lang.String r3 = r0.userName
        L61:
            boolean r0 = X.C123100dR.LIZ(r3)
            if (r0 == 0) goto L68
            return r4
        L68:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C849680XUw.LJ(com.ss.android.ugc.aweme.account.model.BaseLoginMethod):boolean");
    }

    public static String LJFF(BaseLoginMethod baseLoginMethod) {
        LoginMethodName loginMethodName = baseLoginMethod.getLoginMethodName();
        if (loginMethodName == LoginMethodName.EMAIL_PASS) {
            return "email";
        }
        if (loginMethodName == LoginMethodName.USER_NAME_PASS) {
            return "username";
        }
        if (loginMethodName == LoginMethodName.PHONE_NUMBER_PASS) {
            return "phone";
        }
        if (loginMethodName == LoginMethodName.PHONE_SMS) {
            return "sms_verification";
        }
        if (loginMethodName == LoginMethodName.THIRD_PARTY) {
            return baseLoginMethod.findPlatform();
        }
        return "";
    }

    public static long LIZIZ(BaseLoginMethod baseLoginMethod, long j) {
        long jLongValue;
        Long lastActiveTime = baseLoginMethod.getLastActiveTime();
        long jLongValue2 = -1;
        if (lastActiveTime != null) {
            jLongValue = lastActiveTime.longValue();
        } else {
            jLongValue = -1;
        }
        Long loginTime = baseLoginMethod.getLoginTime();
        if (loginTime != null) {
            jLongValue2 = loginTime.longValue();
        }
        if (jLongValue > 0) {
            return jLongValue;
        }
        if (jLongValue2 > 0) {
            return jLongValue2;
        }
        return baseLoginMethod.safeExpires().getTime() - j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String LIZLLL(Context context, String str) {
        switch (str.hashCode()) {
            case -1343791663:
                if (str.equals("USER_NAME_PASS")) {
                    return context.getString(2131838735);
                }
                return str;
            case -1240244679:
                if (!str.equals("google")) {
                    return str;
                }
                return context.getString(2131838767);
            case -916346253:
                if (!str.equals("twitter")) {
                    return str;
                }
                return context.getString(2131838769);
            case 3765:
                if (str.equals("vk")) {
                    return context.getString(2131838764);
                }
                return str;
            case 3321844:
                if (str.equals("line")) {
                    return context.getString(2131838763);
                }
                return str;
            case 28903346:
                if (str.equals("instagram")) {
                    return context.getString(2131838761);
                }
                return str;
            case 78744022:
                if (!str.equals("PHONE_NUMBER_PASS")) {
                    return str;
                }
                return context.getString(2131838768);
            case 323062851:
                if (!str.equals("google_onetap")) {
                    return str;
                }
                return context.getString(2131838767);
            case 486515695:
                if (str.equals("kakaotalk")) {
                    return context.getString(2131838762);
                }
                return str;
            case 497130182:
                if (str.equals("facebook")) {
                    return context.getString(2131838766);
                }
                return str;
            case 1758879432:
                if (!str.equals("PHONE_SMS")) {
                    return str;
                }
                return context.getString(2131838768);
            case 1833209588:
                if (str.equals("EMAIL_PASS")) {
                    return context.getString(2131838765);
                }
                return str;
            case 1997837473:
                if (!str.equals("m_twitter")) {
                    return str;
                }
                return context.getString(2131838769);
            default:
                return str;
        }
    }
}
