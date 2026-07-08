package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import webcast.data.multi_guest_play.ActivePlaybook;

/* JADX INFO: renamed from: X.14mY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20366014mY {
    public static final void LIZ(DataChannel dataChannel, int i, String str) {
        long j;
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel);
        if (playbookAnchorServiceV2LIZIZ != null) {
            ActivePlaybook activePlaybookLIZIZ = playbookAnchorServiceV2LIZIZ.LIZIZ();
            if (activePlaybookLIZIZ != null) {
                j = activePlaybookLIZIZ.playId;
            } else {
                j = 0;
            }
            playbookAnchorServiceV2LIZIZ.LJJJJZI(j, str, EnumC20429314wl.ACTIVITY, i);
        }
    }
}
