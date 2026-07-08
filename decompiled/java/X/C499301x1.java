package X;

import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.ranges.IntRange;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01x1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C499301x1 {
    public final DataChannel LIZ;
    public final InterfaceC356301Zx LIZIZ;
    public boolean LIZJ;
    public boolean LJ;
    public boolean LIZLLL = true;
    public final C515301zb LJFF = new C515301zb(this, 10);

    public final void LIZ(String str) {
        int i;
        if (this.LIZJ || (i = MultiGuestLiveShowConfigSetting.INSTANCE.getSettingValue().bannerRefreshShuffleTime) < 0) {
            return;
        }
        ((IBannerService) C1161920gLG.LIZJ(IBannerService.class)).mE0(C13LZ.LJIIJ(AbstractC19994813Le.Default, new IntRange(0, i)));
        this.LIZJ = true;
        String strLIZ = C01EI.LIZ(0, "PlaybookBannerHelper");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshBannerIfNeed, source: ");
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }

    public C499301x1(DataChannel dataChannel, C499201x0 c499201x0) {
        this.LIZ = dataChannel;
        this.LIZIZ = c499201x0;
    }

    public final void LIZIZ(String str, JSONObject jSONObject) {
        this.LIZIZ.LIZLLL();
        jSONObject.put("bannerType", "playbook");
        C389001fE.LIZ("playbook_banner_show", jSONObject, System.currentTimeMillis(), true);
        String strLIZ = C01EI.LIZ(0, "PlaybookBannerHelper");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendPLAYBOOK_BANNER_JS_EVENT_SHOW, params: ");
        sbLIZ.append(jSONObject);
        sbLIZ.append(", source=");
        sbLIZ.append(str);
        sbLIZ.append(" needCompensateEventAfterReady:");
        sbLIZ.append(this.LIZLLL);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }
}
