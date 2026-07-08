package X;

import Y.AfS184S0100000_15;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveAnimation;
import com.bytedance.android.livesdk.model.message.ApplyAnimationContent;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.LinkmicAnimationMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: renamed from: X.0aFN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C927630aFN extends C927650aFP {
    public final /* synthetic */ C927610aFL LL;

    public C927630aFN(C927610aFL c927610aFL) {
        this.LL = c927610aFL;
    }

    @Override // X.InterfaceC944650agp
    public final void LLJJLIIIJLLLLLLLZ(LinkMessage linkMessage) {
        C927610aFL c927610aFL = this.LL;
        C925150aBN.LJIIIZ((InterfaceC925160aBO) c927610aFL.mView, c927610aFL.dataChannel);
    }

    @Override // X.InterfaceC944680ags
    public final void LLLLLLLLLL(LinkMessage linkMessage) {
        C927610aFL c927610aFL = this.LL;
        C925150aBN.LJIIL(linkMessage, (InterfaceC925160aBO) c927610aFL.mView, c927610aFL.dataChannel, true);
    }

    @Override // X.InterfaceC944650agp
    public final void S0(LinkMessage linkMessage) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("link_finish_message = ");
        sbLIZ.append(GsonProtectorUtils.toJson(C19748512Ol.LIZJ, linkMessage));
        C20441214yg.LJIIIZ("VoiceChatControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        T t = this.LL.mView;
        if (t == 0) {
            return;
        }
        ((InterfaceC927530aFD) t).Yq(linkMessage);
    }

    @Override // X.InterfaceC927660aFQ
    public final void r1(LinkmicAnimationMessage linkmicAnimationMessage) {
        ApplyAnimationContent applyAnimationContent;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveFriendsAnimationMessage LinkmicAnimationMessage = ");
        sbLIZ.append(linkmicAnimationMessage);
        C20441214yg.LIZIZ("VoiceChatControlPresenter", C2188811AlT.LIZIZ(sbLIZ));
        if (MultiLiveAnimation.INSTANCE.enable() && (applyAnimationContent = linkmicAnimationMessage.applyAnimationContent) != null) {
            C927610aFL c927610aFL = this.LL;
            if (C500260Jjc.LJJJI(Boolean.valueOf(applyAnimationContent.isDisplay)) && Long.valueOf(applyAnimationContent.userId) != null) {
                UserService.getInstance().user().LJIIIIZZ(applyAnimationContent.userId).LJJ(C1701940uOG.LIZIZ()).LJJIIJZLJL(new AfS184S0100000_15(c927610aFL, 79));
            }
        }
    }
}
