package X;

import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS251S0300000_7;

/* JADX INFO: renamed from: X.0KOz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516910KOz {
    public final C0KO7 LIZ;
    public final IapService LIZIZ = (IapService) C1161920gLG.LIZJ(IapService.class);

    public C516910KOz(C516640KNy c516640KNy) {
        this.LIZ = c516640KNy;
    }

    public final void LIZ(C0KP3 c0kp3, String str, String str2) {
        int i;
        HashMap map = new HashMap();
        map.put("source", "super_fan");
        map.put("source_page", c0kp3.LJIIL);
        map.put("enter_from", c0kp3.LJIILIIL);
        map.put("user_id", Long.valueOf(UserService.getInstance().user().getCurrentUserId()));
        map.put("to_user_id", c0kp3.LJIIIIZZ);
        C0KN4 c0kn4 = new C0KN4(c0kp3.LIZJ.get());
        c0kp3.LIZ = c0kn4;
        c0kn4.LLIZ = true;
        C1789970wgF c1789970wgF = new C1789970wgF(str2, map);
        boolean zLIZ = c0kp3.LIZ();
        C0KM7 c0km7LIZ = C0W0R.LIZ(c0kp3.LIZJ.get());
        C516010KLn c516010KLn = C516010KLn.LIZ;
        String str3 = c0kp3.LIZLLL;
        String str4 = c0kp3.LIZIZ;
        c516010KLn.getClass();
        C516010KLn.LJIIIZ(zLIZ, str, str3, str4, c0km7LIZ, c0kp3);
        Map<? extends String, ? extends String> mapLIZIZ = C0KSH.LIZIZ(c0kp3);
        C512030K6f c512030K6fLIZ = C512040K6g.LIZ("livesdk_pcs_payment_iap_start");
        c512030K6fLIZ.LIZLLL.putAll(mapLIZIZ);
        c512030K6fLIZ.LIZ(Long.valueOf(System.currentTimeMillis()), "timestamp");
        c512030K6fLIZ.LIZIZ(C0K6H.EVENT_TYPE_TEA_AND_SLARDAR_LOG);
        AwS251S0300000_7 awS251S0300000_7 = new AwS251S0300000_7(this, c0kp3, c1789970wgF, 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            awS251S0300000_7.invoke();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C516010KLn c516010KLn2 = C516010KLn.LIZ;
            Boolean boolValueOf = Boolean.valueOf(zLIZ);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            String str5 = c0kp3.LIZLLL;
            String str6 = c0kp3.LIZIZ;
            Map linkedHashMap = c0kp3.LJ;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
            }
            C0KM7 c0km7LIZ2 = C0W0R.LIZ(c0kp3.LIZJ.get());
            C0KN4 c0kn42 = c0kp3.LIZ;
            if (c0kn42 != null) {
                i = c0kn42.LLIZLLLIL;
            } else {
                i = 0;
            }
            c516010KLn2.getClass();
            C516010KLn.LJII(boolValueOf, str, jCurrentTimeMillis2, LSPassThroughRecordSizeConfig.DEFAULT, 0, "", "", str5, str6, linkedHashMap, c0km7LIZ2, i, null);
        }
    }
}
