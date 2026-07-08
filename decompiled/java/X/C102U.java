package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.compliance.api.model.AgeGateInfo;
import com.ss.android.ugc.aweme.compliance.api.model.BanInfo;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.102U, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C102U {
    public static boolean LJ;
    public static boolean LJFF;
    public static Boolean LJI;
    public static final C102U LIZ = new C102U();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C102Z());
    public static final C102T LIZJ = new C102T();
    public static int LIZLLL = 3;
    public static final Set<String> LJII = C13LQ.LJLIIL(new String[]{"uoo", "idfa", "webcast_language", "webcast_locale", "content_language", "allow_sell_data", "longitude", "webcast_sdk_version", "gaid", "gps_access", "address_book_access", "city", "city_name", "latitude", "ad_personality_mode", "search_source", "show_location", "mac_address", "google_aid", "android_id", "bid_ad_params", "ad_user_agent", "ssid", "openudid", "idfv", "vid"});

    public static List LIZIZ() {
        C102T c102t = LIZJ;
        List<BanInfo> list = c102t.LIZJ;
        if (list != null) {
            return list;
        }
        try {
            return (List) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), c102t.LIZIZ.getString("account_banned_detail", ""), new TypeToken<List<? extends BanInfo>>() { // from class: X.00Tu
            }.getType());
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static C102V LIZJ() {
        return (C102V) LIZIZ.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[PHI: r0
      0x0040: PHI (r0v1 java.lang.Integer) = (r0v0 java.lang.Integer), (r0v12 java.lang.Integer) binds: [B:3:0x0006, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.EnumC191814102i LIZLLL() {
        /*
            X.102k r3 = X.EnumC191814102i.Companion
            X.102T r1 = X.C102U.LIZJ
            java.lang.Integer r0 = r1.LJII
            if (r0 != 0) goto L40
            com.bytedance.keva.Keva r2 = r1.LIZIZ
            com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting r0 = r1.LIZ()
            if (r0 == 0) goto L39
            com.ss.android.ugc.aweme.compliance.api.model.AgeGateInfo r0 = r0.getAgeGateInfo()
            if (r0 == 0) goto L39
            int r1 = r0.registerAgeGateAction
        L18:
            java.lang.String r0 = "register_age_gate_action"
            int r0 = r2.getInt(r0, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 != 0) goto L40
            r0 = 0
        L25:
            r3.getClass()
            java.util.Map<java.lang.Integer, X.102i> r1 = X.EnumC191814102i.MAP
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            X.102i r0 = (X.EnumC191814102i) r0
            if (r0 != 0) goto L38
            X.102i r0 = X.EnumC191814102i.PASS
        L38:
            return r0
        L39:
            X.102i r0 = X.EnumC191814102i.PASS
            int r1 = r0.getValue()
            goto L18
        L40:
            int r0 = r0.intValue()
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C102U.LIZLLL():X.102i");
    }

    public static boolean LJ() {
        if (!((Boolean) C2279461EKa.LJIIJJI.getValue()).booleanValue()) {
            LIZJ().getClass();
        }
        C102T c102t = LIZJ;
        Boolean boolValueOf = c102t.LJIIIZ;
        if (boolValueOf == null && (boolValueOf = Boolean.valueOf(c102t.LIZIZ.getBoolean("need_block_af_sharing", false))) == null) {
            return false;
        }
        return boolValueOf.booleanValue();
    }

    public static void LIZ(ComplianceSetting complianceSetting) {
        boolean zBooleanValue;
        long jLongValue;
        Integer numValueOf;
        C102T c102t = LIZJ;
        Boolean afSharingBlock = complianceSetting.getAfSharingBlock();
        c102t.LJIIIZ = afSharingBlock;
        Keva keva = c102t.LIZIZ;
        if (afSharingBlock != null) {
            zBooleanValue = afSharingBlock.booleanValue();
        } else {
            zBooleanValue = false;
        }
        keva.storeBoolean("need_block_af_sharing", zBooleanValue);
        Long deviceLimitRegisterExpiredTime = complianceSetting.getDeviceLimitRegisterExpiredTime();
        c102t.LJIIJ = deviceLimitRegisterExpiredTime;
        Keva keva2 = c102t.LIZIZ;
        if (deviceLimitRegisterExpiredTime != null) {
            jLongValue = deviceLimitRegisterExpiredTime.longValue();
        } else {
            jLongValue = 0;
        }
        keva2.storeLong("age_gate_block_device_register_expire_time", jLongValue);
        AgeGateInfo ageGateInfo = complianceSetting.getAgeGateInfo();
        if (ageGateInfo != null) {
            numValueOf = Integer.valueOf(ageGateInfo.registerAgeGateAction);
        } else {
            numValueOf = Integer.valueOf(EnumC191814102i.PASS.getValue());
        }
        c102t.LJII = numValueOf;
        c102t.LIZIZ.storeInt("register_age_gate_action", numValueOf.intValue());
        c102t.LIZIZ(complianceSetting);
        String complianceEncrypt = complianceSetting.getComplianceEncrypt();
        c102t.LJI = complianceEncrypt;
        c102t.LIZIZ.storeString("cmpl_enc", complianceEncrypt);
    }

    public static void LJFF(int i) {
        int iIntValue;
        C102T c102t = LIZJ;
        Integer numValueOf = Integer.valueOf(i);
        c102t.LJ = numValueOf;
        Keva keva = c102t.LIZIZ;
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 0;
        }
        keva.storeInt("remove_photo_sensitive_status", iIntValue);
    }
}
