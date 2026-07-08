package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorDetailDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.14pB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20382314pB {
    public static PlaybookAnchorDetailDialog LIZ(PlaybookAnchorViewModel playbookAnchorViewModel, DataChannel dataChannel, C20382814pG c20382814pG, long j, String str) {
        boolean zBooleanValue;
        Boolean bool;
        Boolean bool2;
        PlaybookAnchorDetailDialog playbookAnchorDetailDialog = new PlaybookAnchorDetailDialog();
        playbookAnchorDetailDialog.LLJZIJLIL = playbookAnchorViewModel;
        playbookAnchorDetailDialog.LLLFF = dataChannel;
        playbookAnchorDetailDialog.LLL = c20382814pG;
        playbookAnchorDetailDialog.LLLF = j;
        if (dataChannel != null && (bool2 = (Boolean) dataChannel.gg0(C1083530eIp.class)) != null) {
            zBooleanValue = bool2.booleanValue();
        } else {
            zBooleanValue = false;
        }
        playbookAnchorDetailDialog.LLLFZ = zBooleanValue;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C956690b0F.class)) != null) {
            bool.booleanValue();
        }
        playbookAnchorDetailDialog.LLLI = str;
        return playbookAnchorDetailDialog;
    }
}
