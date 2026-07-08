package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookGiftSettingDialog;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aRj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935290aRj extends C09AY implements Function1<MultiLiveAnchorPanelSettings, Unit> {
    public final /* synthetic */ PlaybookGiftSettingDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C935290aRj(PlaybookGiftSettingDialog playbookGiftSettingDialog) {
        super(1);
        this.LL = playbookGiftSettingDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = multiLiveAnchorPanelSettings;
        PlaybookGiftSettingDialog playbookGiftSettingDialog = this.LL;
        if (multiLiveAnchorPanelSettings2 == null) {
            playbookGiftSettingDialog.getClass();
        } else {
            MultiGuestDataHolder multiGuestDataHolderES = playbookGiftSettingDialog.ES();
            if (multiGuestDataHolderES != null) {
                multiGuestDataHolderES.LJJ(MultiLiveAnchorPanelSettings.LIZ(multiLiveAnchorPanelSettings2, 0, 0, 0, 8388607));
            }
            C924810aAp.LJ().LJJIII = MultiLiveAnchorPanelSettings.LIZ(multiLiveAnchorPanelSettings2, 0, 0, 0, 8388607);
            InterfaceC934710aQn.Mb.LJFF(MultiLiveAnchorPanelSettings.LIZ(multiLiveAnchorPanelSettings2, 0, 0, 0, 8388607));
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL.LLIIJLIL()) != null) {
                interfaceC937900aVwLLIIJLIL.LIZJ("MultiLiveAnchorSettingDialog updateSeiSetting");
            }
        }
        return Unit.LIZ;
    }
}
