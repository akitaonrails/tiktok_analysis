package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.tiktok.ban.IUserBanDepService;
import com.ss.android.ugc.tiktok.ban.UserBanAppealStatusResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS61S0500000_28;

/* JADX INFO: renamed from: X.0zzr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1917450zzr implements InterfaceC1917490zzv {
    public final String LIZ = "ban_type_user_ban";
    public Map<String, String> LIZIZ = new LinkedHashMap();
    public Map<String, String> LIZJ = new LinkedHashMap();
    public final List<Map<String, String>> LIZLLL = new ArrayList();

    public static String LIZJ(int i) {
        if (i != EnumC1706760uW2.PRIMARY.getValue()) {
            if (i == EnumC1706760uW2.SECONDARY.getValue()) {
                return "secondary";
            }
            if (i == EnumC1706760uW2.DESTRUCTIVE.getValue()) {
                return "destructive";
            }
            return "primary";
        }
        return "primary";
    }

    public static String LIZIZ(String str, String str2, String str3, String str4) {
        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
        if (C123100dR.LIZ(str3)) {
            builderBuildUpon.appendQueryParameter("app_id", str3);
        }
        if (C123100dR.LIZ(str2)) {
            builderBuildUpon.appendQueryParameter("verify_ticket", str2);
        }
        if (C123100dR.LIZ(str4)) {
            builderBuildUpon.appendQueryParameter("user_nick_name", str4);
        }
        return builderBuildUpon.toString();
    }

    @Override // X.InterfaceC1917490zzv
    public final void LIZ(UserBanAppealStatusResponse userBanAppealStatusResponse, Map<String, ? extends Object> map, Map<String, String> map2, Map<String, String> map3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Start ShowPopupWithModel currentThread ");
        sbLIZ.append(C786410Ut5.u3().getName());
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1519030pdF interfaceC1519030pdFLIZ = C1876900ywS.LIZ();
        if (interfaceC1519030pdFLIZ != null) {
            interfaceC1519030pdFLIZ.LIZ("pns_ban_start_show_popup", map2);
        }
        AwS61S0500000_28 awS61S0500000_28 = new AwS61S0500000_28(this, (C1917450zzr) map2, map3, (Map<String, String>) userBanAppealStatusResponse, (UserBanAppealStatusResponse) map, (Map<String, ? extends Object>) 9);
        IUserBanDepService.LIZ.getClass();
        C1519390pdp.LIZ().LIZLLL(awS61S0500000_28, new C1917460zzs(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0127 A[PHI: r15
      0x0127: PHI (r15v2 java.lang.String) = (r15v0 java.lang.String), (r15v3 java.lang.String) binds: [B:57:0x00f7, B:63:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction LIZLLL(java.lang.String r33, java.lang.Integer r34, java.lang.String r35, java.util.Map<java.lang.String, ? extends java.lang.Object> r36) {
        /*
            Method dump skipped, instruction units count: 1406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1917450zzr.LIZLLL(java.lang.String, java.lang.Integer, java.lang.String, java.util.Map):com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction");
    }
}
