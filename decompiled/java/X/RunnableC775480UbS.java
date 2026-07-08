package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RtcUserInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicUpdatePushParamStoreIdSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;

/* JADX INFO: renamed from: X.0UbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class RunnableC775480UbS implements Runnable {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ RtcUserInfo LLILLJJLI;
    public final /* synthetic */ InterfaceC964790bDJ LLILLL;
    public final /* synthetic */ boolean LLILZ;

    public RunnableC775480UbS(InterfaceC964790bDJ interfaceC964790bDJ, RtcUserInfo rtcUserInfo, boolean z, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = rtcUserInfo;
        this.LLILLL = interfaceC964790bDJ;
        this.LLILZ = z2;
    }

    public final void LIZ() {
        String string;
        String str;
        User owner;
        boolean z = false;
        if (!this.LL) {
            if (LinkMicUpdatePushParamStoreIdSetting.INSTANCE.getValue() && this.LLILZ) {
                C1276840jKc.LIZ.getClass();
                Map<String, String> map = C1276840jKc.LJIIL;
                map.put("channel_id", "");
                map.put("linkmic_id", "");
            }
            RtcUserInfo rtcUserInfo = this.LLILLJJLI;
            if (C500260Jjc.LJJJI(rtcUserInfo != null ? Boolean.valueOf(rtcUserInfo.isOwner()) : null)) {
                return;
            }
            C465520INi.LIZ.T82(false);
            return;
        }
        RtcUserInfo rtcUserInfo2 = this.LLILLJJLI;
        if (!C500260Jjc.LJJJI(rtcUserInfo2 != null ? Boolean.valueOf(rtcUserInfo2.isOwner()) : null)) {
            C465520INi.LIZ.T82(true);
        }
        C1276840jKc.LIZ.getClass();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && (owner = room.getOwner()) != null && owner.getId() == ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId()) {
            z = true;
        }
        Map<String, String> map2 = C1276840jKc.LJIIL;
        map2.put("role", z ? "host" : "guest");
        RtcUserInfo rtcUserInfo3 = this.LLILLJJLI;
        if (rtcUserInfo3 == null || (string = Long.valueOf(rtcUserInfo3.channelId).toString()) == null) {
            string = "";
        }
        map2.put("channel_id", string);
        RtcUserInfo rtcUserInfo4 = this.LLILLJJLI;
        if (rtcUserInfo4 == null || (str = rtcUserInfo4.linkMicId) == null) {
            str = "";
        }
        map2.put("linkmic_id", str);
        String layoutId = this.LLILLL.getLayoutId();
        map2.put("layout_id", layoutId != null ? layoutId : "");
        C465520INi.LIZ.ml0("link_mic_multiguest");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SessionMonitorHelper@f11a.monitorPerformance$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SessionMonitorHelper@f11a.monitorPerformance$1");
    }
}
