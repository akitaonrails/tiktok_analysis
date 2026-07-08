package X;

import Y.ACListenerS27S1300000_15;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.LinkReceiveEnlargeMessageEvent;
import com.bytedance.android.live.liveinteract.api.ZoomedPositionsUpdateEvent;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aMA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C931840aMA extends C931830aM9 {
    public final void C6() {
        User user;
        String str;
        if (C917810ZzX.LJIIIIZZ()) {
            C500260Jjc.LJIILIIL(this.LLJZ);
            return;
        }
        if (C924230a9t.LIZ(1) || U5() == null) {
            C500260Jjc.LJIILIIL(this.LLJZ);
            return;
        }
        LinkPlayerInfo linkPlayerInfo = this.LLLIIL;
        if (linkPlayerInfo != null) {
            user = linkPlayerInfo.mUser;
            str = linkPlayerInfo.mInteractIdStr;
        } else {
            user = null;
            str = null;
        }
        InterfaceC927510aFB interfaceC927510aFBU5 = U5();
        if (interfaceC927510aFBU5 == null) {
            return;
        }
        C500260Jjc.LLFFF(this.LLJZ);
        C919870a2r.LIZLLL(C928700aH6.LIZ(U5()), String.valueOf(UserService.getInstance().user().getCurrentUser().getId()), String.valueOf(user != null ? Long.valueOf(user.getId()) : null), "show", "guest", "anchor_connection_panel");
        EnumC920250a3T enumC920250a3TLJIL = interfaceC927510aFBU5.LJIL(str == null ? "" : str);
        C930480aJy c930480aJy = C930480aJy.LIZ;
        LiveIconView liveIconView = this.LLJZ;
        Context context = this.LLLIIIL;
        int iLIZIZ = C20736316Cj.LIZIZ(R.attr.ex3, context);
        int iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.ewz, this.LLLIIIL);
        c930480aJy.getClass();
        C930480aJy.LJJJ(liveIconView, enumC920250a3TLJIL, context, iLIZIZ, iLIZIZ2, false);
        if (enumC920250a3TLJIL == EnumC920250a3T.CAN_ZOOM_TO_MIN) {
            C915850ZwN.LJIIJJI(24, user != null ? user.getId() : 0L, "show", null, false);
        }
        LiveIconView liveIconView2 = this.LLJZ;
        if (liveIconView2 != null) {
            liveIconView2.setEnabled(enumC920250a3TLJIL != EnumC920250a3T.ZOOM_DISABLED);
        }
        LiveIconView liveIconView3 = this.LLJZ;
        if (liveIconView3 != null) {
            C786410Ut5.g8(liveIconView3, new ACListenerS27S1300000_15(enumC920250a3TLJIL, user, this, str, 1));
        }
    }

    @Override // X.C931830aM9, X.AbstractC960470b6L
    public final void LLIILZL() {
        super.LLIILZL();
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // X.C931830aM9
    public final int P5(LinkPlayerInfo linkPlayerInfo) {
        Boolean boolValueOf;
        InterfaceC922070a6P interfaceC922070a6P;
        if (linkPlayerInfo == null) {
            return 1;
        }
        DataChannel dataChannel = this.LL;
        if (dataChannel != null && (interfaceC922070a6P = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel, InterfaceC922070a6P.class)) != null) {
            boolValueOf = Boolean.valueOf(interfaceC922070a6P.LJIJI(linkPlayerInfo.mInteractIdStr));
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJJI(boolValueOf)) {
            return 1;
        }
        return 2;
    }

    @Override // X.C931830aM9
    public final void W5(final LinkPlayerInfo linkPlayerInfo) {
        Boolean boolValueOf;
        InterfaceC922070a6P interfaceC922070a6P;
        InterfaceC922070a6P interfaceC922070a6P2;
        DataChannel dataChannel = this.LL;
        Boolean boolValueOf2 = null;
        if (dataChannel != null && (interfaceC922070a6P2 = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel, InterfaceC922070a6P.class)) != null) {
            boolValueOf = Boolean.valueOf(interfaceC922070a6P2.LJIJJLI(linkPlayerInfo.mInteractIdStr));
        } else {
            boolValueOf = null;
        }
        final boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null && (interfaceC922070a6P = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel2, InterfaceC922070a6P.class)) != null) {
            boolValueOf2 = Boolean.valueOf(interfaceC922070a6P.LJJIIJZLJL(linkPlayerInfo.mInteractIdStr));
        }
        final boolean zLJJJI2 = C500260Jjc.LJJJI(boolValueOf2);
        C786410Ut5.LJZI(0, this.LLJLLL);
        z6(linkPlayerInfo);
        C786410Ut5.Q7(this.LLJLLL, new View.OnClickListener() { // from class: X.0aMJ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Boolean bool;
                if (!zLJJJI && !zLJJJI2) {
                    DataChannel dataChannel3 = this.LL;
                    if (dataChannel3 != null) {
                        bool = (Boolean) dataChannel3.gg0(MuteMicChannel.class);
                    } else {
                        bool = null;
                    }
                    boolean zLJJJI3 = C500260Jjc.LJJJI(bool);
                    DataChannel dataChannel4 = this.LL;
                    if (dataChannel4 != null) {
                        dataChannel4.zW(MuteMicChannel.class, Boolean.valueOf(!zLJJJI3));
                    }
                    this.z6(linkPlayerInfo);
                }
            }
        });
        if (C931780aM4.LIZJ()) {
            C933980aPc.LJIILL((int) C497740JfY.LIZIZ(49.0f), this.LLJLLL);
            v6();
            DataChannel dataChannel3 = this.LL;
            if (dataChannel3 != null) {
                dataChannel3.CQ2(LinkReceiveEnlargeMessageEvent.class, this, new AwS594S0100000_15(this, 891));
                dataChannel3.CQ2(ZoomedPositionsUpdateEvent.class, this, new AwS594S0100000_15(this, 892));
            }
        } else {
            C933980aPc.LJIILL(0, this.LLJLLL);
        }
        C500260Jjc.LJIILIIL(this.LLJZ);
    }

    public final void z6(LinkPlayerInfo linkPlayerInfo) {
        Boolean boolValueOf;
        InterfaceC922070a6P interfaceC922070a6P;
        InterfaceC922070a6P interfaceC922070a6P2;
        DataChannel dataChannel = this.LL;
        Boolean boolValueOf2 = null;
        if (dataChannel != null && (interfaceC922070a6P2 = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel, InterfaceC922070a6P.class)) != null) {
            boolValueOf = Boolean.valueOf(interfaceC922070a6P2.LJIJJLI(linkPlayerInfo.mInteractIdStr));
        } else {
            boolValueOf = null;
        }
        boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null && (interfaceC922070a6P = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel2, InterfaceC922070a6P.class)) != null) {
            boolValueOf2 = Boolean.valueOf(interfaceC922070a6P.LJJIIJZLJL(linkPlayerInfo.mInteractIdStr));
        }
        boolean zLJJJI2 = C500260Jjc.LJJJI(boolValueOf2);
        int iP5 = P5(linkPlayerInfo);
        C930480aJy c930480aJy = C930480aJy.LIZ;
        ImageView imageView = this.LLJLLL;
        Context context = this.LLLIIIL;
        c930480aJy.getClass();
        C930480aJy.LJJIL(imageView, iP5, context, zLJJJI, zLJJJI2);
    }

    @Override // X.C931830aM9
    public final void X5(LinkPlayerInfo linkPlayerInfo, C929150aHp c929150aHp) {
        Boolean boolValueOf;
        InterfaceC922070a6P interfaceC922070a6P;
        InterfaceC922070a6P interfaceC922070a6P2;
        if (linkPlayerInfo.mUser == null) {
            return;
        }
        DataChannel dataChannel = this.LL;
        Boolean boolValueOf2 = null;
        if (dataChannel != null && (interfaceC922070a6P2 = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel, InterfaceC922070a6P.class)) != null) {
            boolValueOf = Boolean.valueOf(interfaceC922070a6P2.LJIJJLI(linkPlayerInfo.mInteractIdStr));
        } else {
            boolValueOf = null;
        }
        boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null && (interfaceC922070a6P = (InterfaceC922070a6P) C933980aPc.LJII(dataChannel2, InterfaceC922070a6P.class)) != null) {
            boolValueOf2 = Boolean.valueOf(interfaceC922070a6P.LJJIIJZLJL(linkPlayerInfo.mInteractIdStr));
        }
        c929150aHp.LIZIZ = a6(linkPlayerInfo, zLJJJI, C500260Jjc.LJJJI(boolValueOf2));
    }

    @Override // X.C931830aM9
    public final void b6(LinkPlayerInfo linkPlayerInfo, C929150aHp c929150aHp) {
        super.b6(linkPlayerInfo, c929150aHp);
        C933980aPc.LJIILL((int) C497740JfY.LIZIZ(25.0f), this.LLJLLL);
        if (C931780aM4.LIZJ()) {
            C6();
            DataChannel dataChannel = this.LL;
            if (dataChannel != null) {
                dataChannel.CQ2(LinkReceiveEnlargeMessageEvent.class, this, new AwS594S0100000_15(this, 893));
                dataChannel.CQ2(ZoomedPositionsUpdateEvent.class, this, new AwS594S0100000_15(this, 894));
            }
        }
    }

    public C931840aMA(View view, DataChannel dataChannel, InterfaceC931760aM2 interfaceC931760aM2, MultiGuestDataHolder multiGuestDataHolder, LinkControlDataHolder linkControlDataHolder, int i) {
        super(view, dataChannel, interfaceC931760aM2, multiGuestDataHolder, linkControlDataHolder, i, null, null, null, null);
    }
}
