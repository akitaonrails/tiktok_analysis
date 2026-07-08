package X;

import com.bytedance.android.livesdk.replay.proto.LiveFragmentCaptionMsg;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.captions.LiveHighlightCaptionsChannel;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0xG5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812190xG5 {
    public static void LIZ(WsChannelMsg wsChannelMsg) {
        try {
            LiveFragmentCaptionMsg liveFragmentCaptionMsg = (LiveFragmentCaptionMsg) C105700ad.LIZ(new String(wsChannelMsg.LIZ(), Charsets.UTF_8), LiveFragmentCaptionMsg.class);
            if (liveFragmentCaptionMsg != null) {
                DataChannelGlobal.LLILZ.FQ2(LiveHighlightCaptionsChannel.class, new C443120HZe(Integer.valueOf(liveFragmentCaptionMsg.captionStatus), Long.valueOf(liveFragmentCaptionMsg.fragmentId), C13LP.LLIIII(liveFragmentCaptionMsg.captions)));
            }
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
