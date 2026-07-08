package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorDetailDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookEditorUgcSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14oy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20381014oy extends C09AY implements Function0<C20384614pY> {
    public final /* synthetic */ PlaybookAnchorDetailDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20381014oy(PlaybookAnchorDetailDialog playbookAnchorDetailDialog) {
        super(0);
        this.LL = playbookAnchorDetailDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C20384614pY invoke() {
        PlaybookAnchorDetailDialog playbookAnchorDetailDialog = this.LL;
        DataChannel dataChannel = playbookAnchorDetailDialog.LLLFF;
        PlaybookAnchorViewModel playbookAnchorViewModel = playbookAnchorDetailDialog.LLJZIJLIL;
        C20382814pG c20382814pG = playbookAnchorDetailDialog.LLL;
        EnumC20429114wj enumC20429114wj = ((c20382814pG == null || !c20382814pG.LIZLLL) && !PlaybookEditorUgcSetting.INSTANCE.isUgcEnable()) ? EnumC20429114wj.NORMAL : EnumC20429114wj.EDIT;
        PlaybookAnchorDetailDialog playbookAnchorDetailDialog2 = this.LL;
        return C20367814mq.LIZ(playbookAnchorDetailDialog, dataChannel, playbookAnchorViewModel, true, enumC20429114wj, playbookAnchorDetailDialog2.LLL, playbookAnchorDetailDialog2.LLLF, playbookAnchorDetailDialog2.LLLILZLLLI, new C20380914ox(playbookAnchorDetailDialog2), this.LL.LLLI);
    }
}
