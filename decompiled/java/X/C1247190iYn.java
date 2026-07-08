package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.0iYn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247190iYn {
    public static final C1247190iYn LIZ = new C1247190iYn();

    public static String LIZ(boolean z, EnumC1247210iYp enumC1247210iYp) {
        int i = C1247230iYr.LIZ[enumC1247210iYp.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return EnumC1247200iYo.SCHOOL.getMobString();
                }
                throw new C1954807lC();
            }
            if (z) {
                return EnumC1247200iYo.FOLLOWING.getMobString();
            }
            return EnumC1247200iYo.OTHER_FOLLOWING.getMobString();
        }
        if (z) {
            return EnumC1247200iYo.FANS.getMobString();
        }
        return EnumC1247200iYo.OTHER_FANS.getMobString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(String str, long j, AbstractC1623806Xk abstractC1623806Xk, int i) {
        String str2;
        if (abstractC1623806Xk instanceof C491101vh) {
            str2 = "begin";
        } else if (abstractC1623806Xk instanceof C491001vg) {
            str2 = "fail";
        } else if (abstractC1623806Xk instanceof C1623606Xi) {
            if (((Boolean) ((C1623606Xi) abstractC1623806Xk).LIZ).booleanValue()) {
                str2 = "empty";
            } else {
                str2 = "success";
            }
        } else {
            str2 = "";
        }
        if (i > 1) {
            str2 = "intercept";
        }
        String strValueOf = String.valueOf(System.currentTimeMillis() - j);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        c2344009Gk.LJIIIIZZ("duration", strValueOf);
        C20684815ws.LJIILLIIL("page_search_monitor", c2344009Gk.LIZ);
    }
}
