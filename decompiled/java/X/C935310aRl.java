package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookGiftSettingDialog;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aRl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C935310aRl extends C2217421BqW implements Function1<Integer, Unit> {
    public C935310aRl(Object obj) {
        super(1, obj, PlaybookGiftSettingDialog.class, "requestUpdateSetting", "requestUpdateSetting(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2;
        final int iIntValue = num.intValue();
        final PlaybookGiftSettingDialog playbookGiftSettingDialog = (PlaybookGiftSettingDialog) this.receiver;
        playbookGiftSettingDialog.getClass();
        if (!C925150aBN.LJJIII() ? !((multiLiveAnchorPanelSettings = playbookGiftSettingDialog.LLLFF) == null || multiLiveAnchorPanelSettings.allowViewerReq != 4 || multiLiveAnchorPanelSettings.onlyAllowFollowerReq != 4) : !((multiLiveAnchorPanelSettings2 = playbookGiftSettingDialog.LLLFF) == null || multiLiveAnchorPanelSettings2.allowRequestFromFriends != 4 || multiLiveAnchorPanelSettings2.allowRequestFromFollowers != 4 || multiLiveAnchorPanelSettings2.allowRequestFromOthers != 4)) {
            C782110Um9 c782110Um9 = new C782110Um9(playbookGiftSettingDialog.getContext());
            c782110Um9.LIZJ = C497740JfY.LJIJI(2131854023);
            c782110Um9.LJIIIZ(C497740JfY.LJIJI(2131854022));
            c782110Um9.LJIIJ(2131854087, new InterfaceC743640TFa() { // from class: X.0aRq
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            });
            c782110Um9.LJIILIIL(2131854021, new InterfaceC743640TFa() { // from class: X.0aRk
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                    if (C925150aBN.LJJIII()) {
                        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings3 = playbookGiftSettingDialog.LLLFF;
                        if (multiLiveAnchorPanelSettings3 != null) {
                            multiLiveAnchorPanelSettings3.allowRequestFromFriends = 3;
                            multiLiveAnchorPanelSettings3.allowRequestFromFollowers = 3;
                            multiLiveAnchorPanelSettings3.allowRequestFromOthers = 3;
                        }
                    } else {
                        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings4 = playbookGiftSettingDialog.LLLFF;
                        if (multiLiveAnchorPanelSettings4 != null) {
                            multiLiveAnchorPanelSettings4.allowViewerReq = 3;
                            multiLiveAnchorPanelSettings4.onlyAllowFollowerReq = 3;
                        }
                    }
                    playbookGiftSettingDialog.BS(iIntValue);
                }
            });
            c782110Um9.LJIILL = false;
            C786410Ut5.E4(c782110Um9.LIZ());
        } else {
            playbookGiftSettingDialog.BS(iIntValue);
        }
        return Unit.LIZ;
    }
}
