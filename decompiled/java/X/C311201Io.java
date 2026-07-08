package X;

import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import kotlin.ranges.IntRange;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01Io, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C311201Io {
    public static final /* synthetic */ int LJFF = 0;
    public C311001Im LIZ;
    public boolean LIZIZ;
    public boolean LIZLLL;
    public boolean LIZJ = true;
    public final C515301zb LJ = new C515301zb(this, 12);

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
        C20441214yg.LIZIZ("PlayBannerHelper", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZIZ(String str, JSONObject jSONObject) {
        C311001Im c311001Im = this.LIZ;
        if (c311001Im != null) {
            c311001Im.LIZLLL();
        }
        C01ZY.LIZLLL(jSONObject);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendMultiGuestShowEvent, params: ");
        sbLIZ.append(jSONObject);
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        sbLIZ.append(" needCompensateEventAfterReady:");
        sbLIZ.append(this.LIZJ);
        C20441214yg.LIZIZ("PlayBannerHelper", C2188811AlT.LIZIZ(sbLIZ));
    }
}
