package X;

import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import kotlin.ranges.IntRange;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01Zp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C355501Zp {
    public static final /* synthetic */ int LJFF = 0;
    public final InterfaceC356301Zx LIZ;
    public boolean LIZIZ;
    public boolean LIZLLL;
    public boolean LIZJ = true;
    public final C515301zb LJ = new C515301zb(this, 11);

    public C355501Zp(C355601Zq c355601Zq) {
        this.LIZ = c355601Zq;
    }

    public final void LIZ(String str) {
        int i;
        if (this.LIZIZ || (i = MultiGuestLiveShowConfigSetting.INSTANCE.getSettingValue().bannerRefreshShuffleTime) < 0) {
            return;
        }
        ((IBannerService) C1161920gLG.LIZJ(IBannerService.class)).mE0(C13LZ.LJIIJ(AbstractC19994813Le.Default, new IntRange(0, i)));
        this.LIZIZ = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshBannerIfNeed, source: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("TopGuestBannerHelper", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZIZ(String str, JSONObject jSONObject) {
        this.LIZ.LIZLLL();
        jSONObject.put("bannerType", "guest_point_ranking");
        C389001fE.LIZ("guest_point_ranking_banner_show", jSONObject, System.currentTimeMillis(), true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("send guest_point_ranking_banner_show, params: ");
        sbLIZ.append(jSONObject);
        sbLIZ.append(", source: ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("TopGuestBannerHelper", C2188811AlT.LIZIZ(sbLIZ));
    }
}
