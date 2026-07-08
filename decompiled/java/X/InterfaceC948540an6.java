package X;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.linkroom.widget.LandscapeLinkControlWidget;
import com.bytedance.android.live.liveinteract.linkroom.widget.LinkControlWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.MultiGuestAnchorAvatarBgWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.MultiGuestV3AnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.widget.previewlive.layoutwidiget.MultiGuestPreviewLiveLayoutWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.MultiGuestV3GuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.reservation.anchor.MultiGuestV3AnchorReservationWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.reservation.guest.MultiGuestV3GuestReservationWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.ui.TextHeaderDisplayWidget;
import com.bytedance.android.live.liveinteract.multihost.biz.link.MultiCoHostWidget;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchAudienceWidgetV2;
import com.bytedance.android.live.liveinteract.voicechat.main.VoiceChatControlWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.anchor.VoiceChatAnchorWidget;
import com.bytedance.android.live.liveinteract.voicechat.main.guest.VoiceChatWatchWidget;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0an6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC948540an6 {
    MultiGuestV3AnchorWidget LIZ(FrameLayout frameLayout);

    LandscapeLinkControlWidget LIZIZ(DataChannel dataChannel);

    VoiceChatAnchorWidget LIZJ();

    MatchAudienceWidgetV2 LIZLLL(C0J3L c0j3l, C945320ahu c945320ahu);

    LinkControlWidget LJ(InterfaceC943880afa interfaceC943880afa);

    VoiceChatWatchWidget LJFF();

    MultiGuestV3GuestWidget LJI(FrameLayout frameLayout, EnterRoomConfig enterRoomConfig, int i);

    TextHeaderDisplayWidget LJII();

    MultiGuestV3GuestReservationWidget LJIIIIZZ(FrameLayout frameLayout);

    MultiGuestAnchorAvatarBgWidget LJIIIZ();

    VoiceChatControlWidget LJIIJ(InterfaceC926780aE0 interfaceC926780aE0);

    MultiGuestPreviewLiveLayoutWidget LJIIJJI(ViewGroup viewGroup, DataChannel dataChannel);

    MultiCoHostWidget LJIIL(boolean z, C952540atY c952540atY);

    void LJIILIIL(Widget widget, InterfaceC944150ag1 interfaceC944150ag1);

    void LJIILJJIL(InterfaceC754220TiG interfaceC754220TiG);

    MultiGuestV3AnchorReservationWidget LJIILL(FrameLayout frameLayout);

    void LJIILLIIL();
}
