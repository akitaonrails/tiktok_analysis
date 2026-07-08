package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostWithGuestPhase2AddingMgCheckFromNotifyCoHost;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0axE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954820axE {
    public DataChannel LIZ;
    public AbstractC944020afo LIZIZ = C944050afr.LIZ;

    public final AbstractC944020afo LIZ() {
        if (!CohostWithGuestPhase2AddingMgCheckFromNotifyCoHost.INSTANCE.isEnabled() || ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1()) {
            return this.LIZIZ;
        }
        C20441214yg.LIZIZ("MgNotifyCohostHandler", "getStateInMg, isInMultiGuest=false");
        return C944050afr.LIZ;
    }
}
