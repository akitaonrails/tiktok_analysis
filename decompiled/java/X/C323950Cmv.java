package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.publish.campaign.AMEPublishCampaignListResponse;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Cmv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C323950Cmv {
    public static final C323950Cmv LIZ = new C323950Cmv();
    public static final C2252321DDq LIZIZ;
    public static final C2252321DDq LIZJ;
    public static final Keva LIZLLL;
    public static final C01GW LJ;

    static {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C491101vh.LIZ);
        LIZIZ = c2252321DDqLIZ;
        LIZJ = c2252321DDqLIZ;
        LIZLLL = Keva.getRepo("ame_publish_campaign");
        LJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1757));
    }

    public static void LIZJ() {
        C201955140j.LJIILL(C339800DTu.LIZIZ, "AMEPublishCampaignService", "force clear campaign list response cache");
        Keva keva = LIZLLL;
        if (keva.contains("campaign_list_update_time")) {
            keva.erase("campaign_list_update_time");
        }
        if (keva.contains("campaign_list_response")) {
            keva.erase("campaign_list_response");
        }
    }

    public static AMEPublishCampaignListResponse LIZLLL() {
        C01GW c01gw = LJ;
        if (((Number) c01gw.getValue()).longValue() <= 0) {
            C201955140j.LJIILL(C339800DTu.LIZIZ, "AMEPublishCampaignService", "get campaign list response from cache, cache disabled");
            return null;
        }
        Keva keva = LIZLLL;
        long j = keva.getLong("campaign_list_update_time", -1L);
        String string = keva.getString("campaign_list_response", null);
        if (j == -1 || string == null || string.length() == 0) {
            C201955140j.LJIILL(C339800DTu.LIZIZ, "AMEPublishCampaignService", "get campaign list response from cache, cache not exist");
            return null;
        }
        if (System.currentTimeMillis() - j > ((Number) c01gw.getValue()).longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
            C201955140j.LJIILL(C339800DTu.LIZIZ, "AMEPublishCampaignService", "get campaign list response from cache, cache timeout");
            LIZJ();
            return null;
        }
        try {
            return (AMEPublishCampaignListResponse) GsonProtectorUtils.fromJson(C1058250de3.LIZIZ(), string, AMEPublishCampaignListResponse.class);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C339800DTu c339800DTu = C339800DTu.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get campaign list response from cache, parse error: ");
            sbLIZ.append(e);
            C201955140j.LJIIIIZZ(c339800DTu, "AMEPublishCampaignService", C2188811AlT.LIZIZ(sbLIZ));
            LIZJ();
            return null;
        }
    }

    public static void LIZ(AMEPublishCampaignListResponse aMEPublishCampaignListResponse) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Keva keva = LIZLLL;
        keva.storeLong("campaign_list_update_time", jCurrentTimeMillis);
        keva.storeString("campaign_list_response", GsonProtectorUtils.toJson(C1058250de3.LIZIZ(), aMEPublishCampaignListResponse, AMEPublishCampaignListResponse.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super X.AbstractC1623806Xk<? extends java.util.List<com.ss.android.ugc.aweme.model.AMEPublishCampaignItem>>> r10) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C323950Cmv.LIZIZ(X.05Vn):java.lang.Object");
    }
}
