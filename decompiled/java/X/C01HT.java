package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicPlayOptConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import webcast.data.multi_guest_play.ShowConfig;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play.TransitionInfo;

/* JADX INFO: renamed from: X.01HT, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01HT {
    public static final boolean LIZIZ() {
        boolean z;
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).J8()) {
            z = LiveAbLabelSetting.INSTANCE.getBooleanValue("live_show_cache_opt") && LinkMicPlayOptConfigSetting.INSTANCE.isLiveShowCodeTechSwitch();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isLiveShowCacheOptEnable, anchor result=");
            sbLIZ.append(z);
            C20441214yg.LJIIIZ("LiveShowUtil", C2188811AlT.LIZIZ(sbLIZ));
            return z;
        }
        Boolean boolLIZLLL = C931820aM8.LIZLLL("live_show_cache_opt");
        z = boolLIZLLL != null && boolLIZLLL.booleanValue() && LinkMicPlayOptConfigSetting.INSTANCE.isLiveShowCodeTechSwitch();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isLiveShowCacheOptEnable, guest result=");
        sbLIZ2.append(z);
        C20441214yg.LJIIIZ("LiveShowUtil", C2188811AlT.LIZIZ(sbLIZ2));
        return z;
    }

    public static final boolean LIZ() {
        ShowContent content;
        ShowConfig showConfig;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        return (interfaceC302601FgLIZ == null || (content = interfaceC302601FgLIZ.getContent()) == null || (showConfig = content.showConfig) == null || showConfig.transitionDurationOfConfig <= 0) ? false : true;
    }

    public static final boolean LIZJ() {
        ShowContent content;
        TransitionInfo transitionInfo;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        return interfaceC302601FgLIZ != null && (content = interfaceC302601FgLIZ.getContent()) != null && (transitionInfo = content.transitionInfo) != null && transitionInfo.transitionStartTime > 0 && transitionInfo.transitionDurationOfCurrent > 0 && C158B.LIZ() - transitionInfo.transitionStartTime < transitionInfo.transitionDurationOfCurrent * 1000;
    }
}
