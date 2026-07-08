package X;

import android.app.Activity;
import com.bytedance.ropa.encrypt.EncryptResult;
import com.bytedance.ropa.encrypt.RopaEncrypt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.discover.model.NearByAuth;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import com.ss.android.ugc.tiktok.location_api.service.PermissionCache;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687860QyW {
    public static final C687860QyW LIZ = new C687860QyW();

    public static JSONObject LIZIZ(NearByAuth nearByAuth) {
        int i;
        int i2;
        String data;
        String str = "";
        JSONObject jSONObject = new JSONObject();
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        ((ILocationService) ServiceManager.get().getService(ILocationService.class)).LJIL("android.permission.ACCESS_COARSE_LOCATION");
        C844470XAv.LIZ.getClass();
        iLocationBaseServiceForMT.LJ(C844470XAv.LIZ());
        boolean zLJIILJJIL = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIILJJIL();
        int iLIZ = C145T.LIZ(C844470XAv.LIZ());
        try {
            try {
                String str2 = nearByAuth.encryptLatitude;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = nearByAuth.encryptLongitude;
                if (str3 == null) {
                    str3 = "";
                }
                C688040Qyo.LIZ.getClass();
                Pair pairLIZ = C1798550wu5.LIZIZ.LIZ(str2, str3);
                jSONObject.put("latitude", ((Number) pairLIZ.getFirst()).doubleValue());
                jSONObject.put("longitude", ((Number) pairLIZ.getSecond()).doubleValue());
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            }
            jSONObject.put("currentLocationStatus", "1");
            int i3 = 1;
            if (iLIZ == 1) {
                jSONObject.put("currentLocationStatus", "2");
            }
            if (iLIZ == 2) {
                jSONObject.put("currentLocationStatus", "3");
            }
            jSONObject.put("supportLocationStatus", String.valueOf(nearByAuth.countryAuth));
            if (nearByAuth.countryAuth == 3 && !zLJIILJJIL) {
                jSONObject.put("supportLocationStatus", "2");
            }
            if (!((InterfaceC1207490hWl) ServiceManager.get().getService(ILocationService.class)).LJI("search", "poi_biz")) {
                jSONObject.put("supportLocationStatus", "1");
            }
            try {
                String str4 = nearByAuth.encryptPlaceName;
                if (str4 == null) {
                    str4 = "";
                }
                EncryptResult decryptSeq = RopaEncrypt.getDecryptSeq(str4);
                if (decryptSeq != null && (data = decryptSeq.getData()) != null) {
                    str = data;
                }
                jSONObject.put("formattedAddress", str);
            } catch (C838130WuJ e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            JSONObject jSONObject2 = new JSONObject();
            SAFHelper.LIZ.getClass();
            Activity activityLJIIIIZZ = SAFHelper.LJIIIIZZ(null);
            if (activityLJIIIIZZ != null) {
                PermissionCache.LL.getClass();
                if (PermissionCache.LIZIZ("android.permission.ACCESS_COARSE_LOCATION")) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject2.put("enable_location", i);
                if (iLocationBaseServiceForMT.LJJIJ()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                jSONObject2.put("inapp_is_precise", i2);
                if (!iLocationBaseServiceForMT.LJ(activityLJIIIIZZ)) {
                    i3 = 0;
                }
                jSONObject2.put("system_is_precise", i3);
            }
            jSONObject.put("locationMobParams", jSONObject2);
            return jSONObject;
        } catch (JSONException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return jSONObject;
        }
    }

    public static void LIZ(DynamicPatch dynamicPatch, C647340PaG c647340PaG) {
        NearByAuth nearByAuth = dynamicPatch.getNearByAuth();
        if (nearByAuth == null) {
            return;
        }
        c647340PaG.LIZIZ.put("location", LIZIZ(nearByAuth));
    }
}
