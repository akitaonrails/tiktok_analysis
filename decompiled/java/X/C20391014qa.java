package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookInteractivePolymerizationDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14qa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20391014qa {
    public static PlaybookInteractivePolymerizationDialog LIZ(DataChannel dataChannel, PlaybookAnchorViewModel playbookAnchorViewModel, int i, Function0 function0) {
        boolean zBooleanValue;
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        C978360bZC.LIZ = System.currentTimeMillis();
        PlaybookInteractivePolymerizationDialog playbookInteractivePolymerizationDialog = new PlaybookInteractivePolymerizationDialog();
        playbookInteractivePolymerizationDialog.LLJZIJLIL = dataChannel;
        playbookInteractivePolymerizationDialog.LLL = playbookAnchorViewModel;
        Boolean bool = (Boolean) dataChannel.gg0(C1083530eIp.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        playbookInteractivePolymerizationDialog.LLLJ = zBooleanValue;
        playbookInteractivePolymerizationDialog.LLLILZ = i;
        playbookInteractivePolymerizationDialog.LLLJL = function0;
        return playbookInteractivePolymerizationDialog;
    }
}
