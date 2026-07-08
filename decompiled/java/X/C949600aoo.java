package X;

import Y.ACListenerS81S0300000_15;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.IsViewerLimitedStatusChannel;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.dataChannel.OpenCoHostEvent;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aoo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949600aoo implements InterfaceC2871019h {
    public final View LIZ;
    public final ImageView LIZIZ;
    public final C16F5 LIZJ;
    public final C16F5 LIZLLL;

    public C949600aoo(View view) {
        this.LIZ = view.findViewById(R.id.eu1);
        this.LIZIZ = (ImageView) view.findViewById(R.id.ep8);
        this.LIZJ = (C16F5) view.findViewById(R.id.jc2);
        this.LIZLLL = (C16F5) view.findViewById(R.id.kyu);
    }

    @Override // X.InterfaceC2871019h
    public final void LIZ(C1109770ez9 c1109770ez9, C154500iV c154500iV) {
        long ownerUserId;
        String idStr;
        this.LIZIZ.setImageResource(R.drawable.el3);
        this.LIZJ.setText(((LinkMicAnchorGuideMessage) c154500iV.LJIL).guideContent);
        this.LIZLLL.setText(((LinkMicAnchorGuideMessage) c154500iV.LJIL).buttonContent);
        this.LIZ.setBackgroundResource(R.drawable.dw_);
        if (c154500iV.LJIILJJIL.LIZJ == 1) {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                ownerUserId = room.getOwnerUserId();
            } else {
                ownerUserId = 0;
            }
            String strValueOf = String.valueOf(ownerUserId);
            if (room != null) {
                idStr = room.getIdStr();
            } else {
                idStr = null;
            }
            C925600aC6.LJJ(strValueOf, idStr, "bubble_guide", String.valueOf(((LinkMicAnchorGuideMessage) c154500iV.LJIL).availableFriendNumber), "");
        }
        C786410Ut5.I7(new ACListenerS81S0300000_15(c1109770ez9, this, c154500iV, 7), this.LIZ);
    }

    public final void LIZIZ(C1109770ez9 c1109770ez9, C154500iV c154500iV) {
        DataChannel dataChannel;
        if ((!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1() || C917860Zzc.LIZIZ()) && ((!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vH0() || ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).J12()) && (((dataChannel = c1109770ez9.LJIIIZ) == null || !((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).o52(dataChannel)) && !((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).t42()))) {
            int i = ((LinkMicAnchorGuideMessage) c154500iV.LJIL).connectType;
            if (i == 1) {
                DataChannel dataChannel2 = c1109770ez9.LJIIIZ;
                if (dataChannel2 != null) {
                    dataChannel2.LC0(OpenCoHostEvent.class, "anchor_host_notice");
                }
                C915980Zwa.LJI().LIZ().LJIIJ(new C943870afZ("anchor_host_notice"));
                if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).J12()) {
                    C955400ayA.LLIFFJFJJ("connection_invite", null, null, null, null, 30);
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_host_notice");
                c474500IjALIZ.LJIJJLI(c1109770ez9.LJIIIZ);
                c474500IjALIZ.LJJII("click", "event_type");
                c474500IjALIZ.LIZ();
                return;
            }
            if (i != 2) {
                return;
            }
            DataChannel dataChannel3 = c1109770ez9.LJIIIZ;
            if (dataChannel3 != null && Intrinsics.LJFF(dataChannel3.gg0(IsViewerLimitedStatusChannel.class), Boolean.TRUE)) {
                C766270U4b.LIZLLL(2131844624);
                return;
            }
            if (C915980Zwa.LJI().LJIIJ().LIZ()) {
                C766270U4b.LIZLLL(2131841103);
                return;
            }
            C949960apO.LIZIZ(this.LIZ.getContext(), ViewTreeLifecycleOwner.get(this.LIZ));
            if (!C970240bM6.LIZ()) {
                return;
            }
            C943870afZ c943870afZ = new C943870afZ("anchor_host_notice");
            c943870afZ.LIZIZ = true;
            C915980Zwa.LJI().LIZ().LJIIJ(c943870afZ);
            C955400ayA.LLIFFJFJJ("connection_invite", null, null, null, null, 30);
            DataChannel dataChannel4 = c1109770ez9.LJIIIZ;
            if (dataChannel4 == null) {
                return;
            }
            dataChannel4.LC0(OpenCoHostEvent.class, "anchor_host_notice");
            return;
        }
        C766270U4b.LIZLLL(2131841103);
    }
}
