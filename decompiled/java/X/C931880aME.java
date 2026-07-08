package X;

import Y.ACListenerS0S0221000_15;
import Y.ACListenerS10S1201000_15;
import Y.ACListenerS118S0200000_15;
import Y.ACListenerS150S0100000_15;
import Y.ACListenerS45S0201000_15;
import Y.ACListenerS51S0101000_7;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.MultiLivePreCheckInviteFailedEvent;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MicClickableEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteAudioEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveGuestMuteVideoEvent;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicModeratorClickSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicMultiGuestSimplifyReservationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPanelVideoPermissionIconStatus;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aME, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C931880aME extends AbstractC960470b6L<LinkPlayerInfo> {
    public final DataChannel LL;
    public InterfaceC931940aMK LLILLJJLI;
    public MultiGuestDataHolder LLILLL;
    public LinkControlDataHolder LLILZ;
    public final int LLILZIL;
    public final C1099610eil LLILZLL;
    public final View LLIZ;
    public final View LLIZLLLIL;
    public final C1324720kZq LLJ;
    public final C1324720kZq LLJI;
    public final C16F5 LLJIJIL;
    public final C16F5 LLJILJIL;
    public final C16F5 LLJILJILJ;
    public final C16F5 LLJILLL;
    public final ImageView LLJJ;
    public final ImageView LLJJI;
    public final C16FS LLJJIII;
    public final LiveIconView LLJJIJI;
    public final ImageView LLJJIJIIJIL;
    public final C931950aML LLJJIJIL;
    public final ViewGroup LLJJJ;
    public final C01GW LLJJJIL;
    public final Context LLJJJJ;
    public LinkPlayerInfo LLJJJJJIL;

    @Override // X.AbstractC960470b6L
    public final void LLIILZL() {
        this.LLILLJJLI = null;
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public final boolean W5() {
        User user;
        LinkPlayerInfo linkPlayerInfo = this.LLJJJJJIL;
        return (linkPlayerInfo == null || (user = linkPlayerInfo.mUser) == null || user.getId() != UserService.getInstance().user().getCurrentUserId()) ? false : true;
    }

    public static final boolean V5(User user) {
        Number numberValueOf;
        long id = user.getId();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            numberValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            numberValueOf = 0;
        }
        if (!(numberValueOf instanceof Long) || id != numberValueOf.longValue()) {
            return false;
        }
        return true;
    }

    public final void L5(LinkPlayerInfo linkPlayerInfo) {
        boolean z;
        LiveMode liveMode;
        int i;
        String str;
        boolean z2;
        boolean z3;
        LinkControlDataHolder linkControlDataHolder;
        this.itemView.setTag(R.id.yo6, linkPlayerInfo.mUser.getIdStr());
        this.itemView.setTag(R.id.yo7, new C929150aHp(linkPlayerInfo.LIZ, linkPlayerInfo.mRoleType, Integer.valueOf(linkPlayerInfo.LIZIZ)));
        this.LLJJJJJIL = linkPlayerInfo;
        User user = linkPlayerInfo.mUser;
        C1099610eil c1099610eil = this.LLILZLL;
        C1121670fIL.LJIILIIL(c1099610eil, user.getAvatarThumb(), c1099610eil.getWidth(), c1099610eil.getHeight(), R.drawable.el_);
        this.LLJIJIL.setText(C0KVU.LIZ(user));
        if (V5(user)) {
            C786410Ut5.LJLLLLLL(0, this.LLIZ);
            C786410Ut5.LJLLLLLL(0, this.LLIZLLLIL);
        } else {
            C786410Ut5.LJLLLLLL(8, this.LLIZ);
            C786410Ut5.LJLLLLLL(8, this.LLIZLLLIL);
        }
        if (P5(linkPlayerInfo) == 2 && linkPlayerInfo.LIZ != 4) {
            z = true;
        } else {
            z = false;
        }
        if (z || (P5(linkPlayerInfo) == 3 && linkPlayerInfo.LIZ != 4)) {
            C16F5 c16f5 = this.LLJILJIL;
            if (c16f5 != null) {
                C439101nJ.LJI(c16f5);
            }
            b6(this.LLJILJILJ, linkPlayerInfo, true);
        } else if (P5(linkPlayerInfo) == 2 && linkPlayerInfo.LIZ != 4) {
            C16F5 c16f52 = this.LLJILJIL;
            if (c16f52 != null) {
                C439101nJ.LJI(c16f52);
            }
            b6(this.LLJILJILJ, linkPlayerInfo, false);
        } else {
            C439101nJ.LJI(this.LLJILJILJ);
            C16F5 c16f53 = this.LLJILJIL;
            if (c16f53 != null) {
                b6(c16f53, linkPlayerInfo, false);
            }
        }
        C786410Ut5.LLJLLL(this.LLJJIJIL, 8);
        this.LLJJIJIL.setEnabled(true);
        this.LLJJIJIL.setViewer(false);
        this.LLJJIJIL.setButtonStyle(0);
        C786410Ut5.LLJJJ(this.LLJJIII, 8);
        this.LLJJIII.setEnabled(true);
        C786410Ut5.LJZI(8, this.LLJJIJIIJIL);
        C786410Ut5.LLJJIJIL(this.LLJJIJI, 8);
        C786410Ut5.LJZI(8, this.LLJJ);
        C786410Ut5.LJZI(8, this.LLJJI);
        int iP5 = P5(linkPlayerInfo);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("type = ");
        sbLIZ.append(iP5);
        C20441214yg.LJ("MultiLiveLinkPanelUserInfo", C2188811AlT.LIZIZ(sbLIZ));
        if (iP5 != 1) {
            if (iP5 != 2) {
                String str2 = "room_viewer";
                if (iP5 != 3) {
                    if (iP5 == 4 || iP5 == 6) {
                        int iP52 = P5(linkPlayerInfo);
                        if (iP52 == 4) {
                            str2 = "outroom_friend";
                        } else if (iP52 == 6) {
                            str2 = "outroom_recommend_user";
                        }
                        if (linkPlayerInfo.mRoleType == 3 || ((linkControlDataHolder = this.LLILZ) != null && linkControlDataHolder.LIZIZ(linkPlayerInfo.mUser.getId()))) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        this.LLJJIJIL.setViewer(true);
                        C786410Ut5.LLJLLL(this.LLJJIJIL, 0);
                        C786410Ut5.q8(this.LLJJIJIL, new ACListenerS10S1201000_15(this, linkPlayerInfo, str2, iP52, 0));
                        if (z3) {
                            this.LLJJIJIL.setText(C497740JfY.LJIJI(2131840633));
                            this.LLJJIJIL.setEnabled(false);
                        } else {
                            this.LLJJIJIL.setText(C497740JfY.LJIJI(2131842208));
                            this.LLJJIJIL.setEnabled(true);
                        }
                    }
                } else {
                    int iP53 = P5(linkPlayerInfo);
                    if (iP53 == 4) {
                        str2 = "outroom_friend";
                    } else if (iP53 == 6) {
                        str2 = "outroom_recommend_user";
                    }
                    if (linkPlayerInfo.mRoleType == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (C919610a2R.LIZIZ()) {
                        C1834150xpV.LJIIJ(this.LLJJIJIL, true);
                        this.LLJJIJIL.setButtonStyle(1);
                    } else if (LinkmicMultiGuestSimplifyReservationSetting.INSTANCE.enable()) {
                        this.LLJJIJIL.setButtonStyle(2);
                    }
                    this.LLJJIJIL.setViewer(true);
                    C786410Ut5.LLJLLL(this.LLJJIJIL, 0);
                    C786410Ut5.q8(this.LLJJIJIL, new ACListenerS10S1201000_15(this, linkPlayerInfo, str2, iP53, 1));
                    if (!z2) {
                        this.LLJJIJIL.setText(C497740JfY.LJIJI(2131842208));
                        this.LLJJIJIL.setEnabled(true);
                    } else if (!this.LLJJIJIL.isEnabled() && C919610a2R.LIZIZ()) {
                        X5(linkPlayerInfo, str2);
                    } else {
                        this.LLJJIJIL.setText(C497740JfY.LJIJI(2131840633));
                        this.LLJJIJIL.setEnabled(false);
                    }
                    if (linkPlayerInfo.permissionAsViewer == 2) {
                        this.LLJJIJIL.setEnabled(false);
                        C1834150xpV.LJIIJ(this.LLJJIJIL, false);
                    }
                    DataChannel dataChannel = this.LL;
                    if (dataChannel != null) {
                        dataChannel.CQ2(MultiLivePreCheckInviteFailedEvent.class, this, new AwS381S0200000_15(this, (C931880aME) new AwS381S0200000_15(this, linkPlayerInfo, 160), (Function1<Object, Unit>) 161));
                    }
                }
            } else if (linkPlayerInfo.LIZ == 4) {
                C786410Ut5.LLJJJ(this.LLJJIII, 0);
                this.LLJJIII.setText(C497740JfY.LJIJI(2131843398));
                C786410Ut5.h8(this.LLJJIII, new View.OnClickListener() { // from class: X.0aMR
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                    }
                });
                this.LLJJIII.setEnabled(false);
                C786410Ut5.LJZI(0, this.LLJJIJIIJIL);
                C786410Ut5.Q7(this.LLJJIJIIJIL, new ACListenerS118S0200000_15(this, linkPlayerInfo, 62));
            } else if (C924990aB7.LIZJ() && linkPlayerInfo.isFullPositionPreApproved) {
                C786410Ut5.LLJJJ(this.LLJJIII, 8);
                C786410Ut5.LJZI(8, this.LLJJIJIIJIL);
            } else {
                this.LLJJIII.setEnabled(true);
                C786410Ut5.LLJJJ(this.LLJJIII, 0);
                this.LLJJIII.setText(C497740JfY.LJIJI(2131840786));
                C786410Ut5.h8(this.LLJJIII, new ACListenerS118S0200000_15(this, linkPlayerInfo, 63));
                C786410Ut5.LJZI(0, this.LLJJIJIIJIL);
                C786410Ut5.Q7(this.LLJJIJIIJIL, new ACListenerS118S0200000_15(this, linkPlayerInfo, 64));
            }
        } else if (linkPlayerInfo.mUser != null) {
            C923330a8R c923330a8R = C923330a8R.LIZ;
            if (C923330a8R.LJIIIZ()) {
                if (W5()) {
                    DataChannel dataChannel2 = this.LL;
                    if (dataChannel2 != null) {
                        dataChannel2.DQ2(MultiLiveGuestMuteVideoEvent.class, this, new AwS381S0200000_15(this, (C931880aME) new AwS594S0100000_15(this, 1047), (Function1<Object, Unit>) 162));
                    }
                    U5(this, this.LLILLL.LJIIJ);
                    C786410Ut5.Q7(this.LLJJ, new ACListenerS150S0100000_15(this, 271));
                    T5(this, this.LLILLL.LJIIIZ);
                    this.LLJJI.setClickable(this.LLILLL.LJJIJLIJ);
                    C786410Ut5.Q7(this.LLJJI, new ACListenerS150S0100000_15(this, 270));
                    DataChannel dataChannel3 = this.LL;
                    if (dataChannel3 != null) {
                        dataChannel3.DQ2(MultiLiveGuestMuteAudioEvent.class, this, new AwS381S0200000_15(this, (C931880aME) new AwS594S0100000_15(this, 1045), (Function1<Object, Unit>) 162));
                        dataChannel3.DQ2(MicClickableEvent.class, this, new AwS381S0200000_15(this, (C931880aME) new AwS594S0100000_15(this, 1046), (Function1<Object, Unit>) 162));
                    }
                } else {
                    R5(linkPlayerInfo);
                }
            }
            C786410Ut5.LLJJIJIL(this.LLJJIJI, 0);
            this.LLJJIJI.setIconAttr(R.attr.e0k);
            C786410Ut5.g8(this.LLJJIJI, new ACListenerS118S0200000_15(this, linkPlayerInfo, 61));
        }
        DataChannel dataChannel4 = this.LL;
        Object objGg0 = null;
        if (dataChannel4 != null) {
            liveMode = (LiveMode) dataChannel4.gg0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        if (C781520UlC.LJ(liveMode)) {
            C439101nJ.LJI(this.LLJJ);
        }
        C786410Ut5.H8(this.LLILZLL, new ACListenerS51S0101000_7(iP5, linkPlayerInfo, 2));
        if ((P5(linkPlayerInfo) == 2 && linkPlayerInfo.LIZ != 4) || (P5(linkPlayerInfo) == 3 && linkPlayerInfo.LIZ != 4)) {
            List<String> list = linkPlayerInfo.recommendTagList;
            if (list != null && list.size() > 0) {
                View view = (View) this.LLJJJIL.getValue();
                if (view != null) {
                    C12ES.LJIILL(0, view);
                }
                TextView textView = (TextView) this.LLJJJIL.getValue();
                if (textView != null) {
                    textView.setText(C13LP.LJJLIIIJ(C932140aMe.LJII(linkPlayerInfo), "\n", null, null, 0, null, null, 62));
                }
            } else {
                View view2 = (View) this.LLJJJIL.getValue();
                if (view2 != null) {
                    C439101nJ.LJI(view2);
                }
            }
        } else {
            View view3 = (View) this.LLJJJIL.getValue();
            if (view3 != null) {
                C439101nJ.LJI(view3);
            }
        }
        C932140aMe.LJIIIZ(this.LLJIJIL, this.LLJILJILJ, this.LLJJJ.getMeasuredWidth());
        DataChannel dataChannel5 = this.LL;
        if (dataChannel5 != null) {
            objGg0 = dataChannel5.gg0(LiveModeChannel.class);
        }
        if (this.LLILZIL == 0 && objGg0 != LiveMode.LIVE_VOICE && (((i = linkPlayerInfo.LIZIZ) == 2 || i == 3) && C916490ZxP.LIZIZ(linkPlayerInfo.linkTypePermission))) {
            int value = MultiGuestPanelVideoPermissionIconStatus.INSTANCE.getValue();
            if (value != 1) {
                if (value != 2) {
                    str = "";
                } else {
                    str = "ttlive_multiguest_av_user_permission_icon_green_light.png";
                }
            } else {
                str = "ttlive_multiguest_av_user_permission_icon_grey_light.png";
            }
            if (str.length() > 0) {
                C500260Jjc.LLFFF(this.LLJI);
                C1143680frq.LIZLLL(this.LLJI, "tiktok_live_interaction_normal_3", str);
            } else {
                C500260Jjc.LJIILIIL(this.LLJI);
            }
        } else {
            C500260Jjc.LJIILIIL(this.LLJI);
        }
        C917720ZzO.LIZ.getClass();
        if (C917720ZzO.LIZJ()) {
            if (linkPlayerInfo.linkUserType == 1 && linkPlayerInfo.LIZIZ != 1) {
                if (this.LLJI.getVisibility() == 0) {
                    C500260Jjc.LJIILIIL(this.LLJ);
                    C500260Jjc.LLFFF(this.LLJILLL);
                    this.LLJILLL.setText(C497740JfY.LJIJI(2131854196));
                    return;
                } else {
                    C500260Jjc.LLFFF(this.LLJ);
                    C500260Jjc.LJIILIIL(this.LLJILLL);
                    C1143680frq.LIZLLL(this.LLJ, "tiktok_live_interaction_normal_1", "ttlive_multiguest_karaoke_avatar_icon.png");
                    return;
                }
            }
            C500260Jjc.LJIILIIL(this.LLJ);
            C500260Jjc.LJIILIIL(this.LLJILLL);
        }
    }

    public int N5(LinkPlayerInfo linkPlayerInfo) {
        C930480aJy c930480aJy = C930480aJy.LIZ;
        MultiGuestDataHolder multiGuestDataHolder = this.LLILLL;
        c930480aJy.getClass();
        return C930480aJy.LIZ(linkPlayerInfo, multiGuestDataHolder);
    }

    public final int P5(LinkPlayerInfo linkPlayerInfo) {
        if (V5(linkPlayerInfo.mUser)) {
            return 0;
        }
        return linkPlayerInfo.LIZIZ;
    }

    public void R5(LinkPlayerInfo linkPlayerInfo) {
        boolean z;
        Boolean boolValueOf;
        LiveMode liveMode;
        boolean z2 = true;
        if (this.LLILLL.LJIIJJI(linkPlayerInfo.mInteractIdStr) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLILLL.LIZJ(linkPlayerInfo.mInteractIdStr) != 4 && this.LLILLL.LIZJ(linkPlayerInfo.mInteractIdStr) != 3) {
            z2 = false;
        }
        C786410Ut5.LJZI(0, this.LLJJ);
        C930480aJy c930480aJy = C930480aJy.LIZ;
        MultiGuestDataHolder multiGuestDataHolder = this.LLILLL;
        c930480aJy.getClass();
        int iLIZJ = C930480aJy.LIZJ(linkPlayerInfo, multiGuestDataHolder);
        ImageView imageView = this.LLJJ;
        Context context = this.LLJJJJ;
        DataChannel dataChannel = this.LL;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            boolValueOf = Boolean.valueOf(C781520UlC.LJ(liveMode));
        } else {
            boolValueOf = null;
        }
        C930480aJy.LJJIZ(imageView, iLIZJ, context, z, boolValueOf);
        if (!z) {
            C786410Ut5.Q7(this.LLJJ, new ACListenerS45S0201000_15(this, linkPlayerInfo, iLIZJ, 3));
        } else {
            this.LLJJ.setClickable(false);
        }
        S5(linkPlayerInfo, z, z2);
    }

    public static final void T5(C931880aME c931880aME, boolean z) {
        int i;
        C786410Ut5.LJZI(0, c931880aME.LLJJI);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        C930480aJy c930480aJy = C930480aJy.LIZ;
        ImageView imageView = c931880aME.LLJJI;
        Context context = c931880aME.LLJJJJ;
        c930480aJy.getClass();
        C930480aJy.LJJIL(imageView, i, context, false, false);
    }

    public static final void U5(C931880aME c931880aME, boolean z) {
        int i;
        Boolean boolValueOf;
        LiveMode liveMode;
        C786410Ut5.LJZI(0, c931880aME.LLJJ);
        C930480aJy c930480aJy = C930480aJy.LIZ;
        ImageView imageView = c931880aME.LLJJ;
        if (C927560aFG.LIZJ()) {
            i = 0;
        } else if (z) {
            i = 1;
        } else {
            i = 2;
        }
        Context context = c931880aME.LLJJJJ;
        DataChannel dataChannel = c931880aME.LL;
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            boolValueOf = Boolean.valueOf(C781520UlC.LJ(liveMode));
        } else {
            boolValueOf = null;
        }
        c930480aJy.getClass();
        C930480aJy.LJJIZ(imageView, i, context, false, boolValueOf);
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        L5((LinkPlayerInfo) obj);
    }

    public final void X5(final LinkPlayerInfo linkPlayerInfo, final String str) {
        final Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            C782110Um9 c782110Um9 = new C782110Um9(this.LLJJJJ);
            c782110Um9.LJIIZILJ(2131843354);
            c782110Um9.LJIILIIL(2131843356, new InterfaceC743640TFa() { // from class: X.0aMF
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                    C931880aME c931880aME = this.LIZ;
                    LinkPlayerInfo linkPlayerInfo2 = linkPlayerInfo;
                    c931880aME.a6(linkPlayerInfo2, "cancel_invite", str, c931880aME.P5(linkPlayerInfo2));
                    new C927240aEk("cancelInviteAlert", "cancelBtn").LIZ();
                    InterfaceC931940aMK interfaceC931940aMK = this.LIZ.LLILLJJLI;
                    if (interfaceC931940aMK != null) {
                        interfaceC931940aMK.LJI(linkPlayerInfo, room.getId());
                    }
                    long ownerUserId = room.getOwnerUserId();
                    long id = linkPlayerInfo.mUser.getId();
                    long id2 = room.getId();
                    C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                    C307001Gy.LIZ().getClass();
                    C925600aC6.LJIIJJI(ownerUserId, id, id2, true, true, C927600aFK.LJII());
                }
            });
            c782110Um9.LJIIJ(2131843353, new InterfaceC743640TFa() { // from class: X.0aMM
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            });
            C786410Ut5.E4(c782110Um9.LIZ());
            long ownerUserId = room.getOwnerUserId();
            long id = linkPlayerInfo.mUser.getId();
            long id2 = room.getId();
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            C925600aC6.LJIIJJI(ownerUserId, id, id2, true, false, C927600aFK.LJII());
        }
    }

    public final void S5(LinkPlayerInfo linkPlayerInfo, boolean z, boolean z2) {
        C786410Ut5.LJZI(0, this.LLJJI);
        int iN5 = N5(linkPlayerInfo);
        C930480aJy c930480aJy = C930480aJy.LIZ;
        ImageView imageView = this.LLJJI;
        Context context = this.LLJJJJ;
        c930480aJy.getClass();
        C930480aJy.LJJIL(imageView, iN5, context, z, z2);
        C786410Ut5.Q7(this.LLJJI, new ACListenerS0S0221000_15(z, z2, this, linkPlayerInfo, iN5, 1));
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.CQ2(MicClickableEvent.class, this, new AwS381S0200000_15(this, (C931880aME) new AwS381S0200000_15(this, linkPlayerInfo, 159), (Function1<Object, Unit>) 161));
        }
    }

    public final void b6(C16F5 c16f5, LinkPlayerInfo linkPlayerInfo, boolean z) {
        if (V5(linkPlayerInfo.mUser)) {
            c16f5.setText(C497740JfY.LJIJI(2131843156));
            C786410Ut5.LLJJJJ(c16f5, 0);
            return;
        }
        C786410Ut5.LLJJJJ(c16f5, 8);
        String strLJFF = C932140aMe.LJFF(linkPlayerInfo, 0, z);
        if ((!TextUtils.isEmpty(strLJFF)) && strLJFF != null) {
            C786410Ut5.LLJJJJ(c16f5, 0);
            c16f5.setText(strLJFF);
        }
    }

    public final void a6(LinkPlayerInfo linkPlayerInfo, String str, String str2, int i) {
        InterfaceC931940aMK interfaceC931940aMK;
        List<LinkPlayerInfo> listLJIIIZ;
        String str3;
        User user;
        if (LinkMicModeratorClickSetting.INSTANCE.opt() && (interfaceC931940aMK = this.LLILLJJLI) != null && (listLJIIIZ = interfaceC931940aMK.LJIIIZ(i)) != null) {
            ConcurrentHashSet<String> concurrentHashSet = C924950aB3.LIZ;
            String idStr = linkPlayerInfo.mUser.getIdStr();
            int size = listLJIIIZ.size();
            String strValueOf = String.valueOf(linkPlayerInfo.mUser.getId());
            int i2 = 0;
            int i3 = 1;
            for (LinkPlayerInfo linkPlayerInfo2 : listLJIIIZ) {
                int i4 = i2 + 1;
                Long lValueOf = null;
                if (i2 >= 0) {
                    LinkPlayerInfo linkPlayerInfo3 = linkPlayerInfo2;
                    if (linkPlayerInfo3 != null && (user = linkPlayerInfo3.mUser) != null) {
                        lValueOf = Long.valueOf(user.getId());
                    }
                    if (Intrinsics.LJFF(String.valueOf(lValueOf), strValueOf)) {
                        i3 = i4;
                    }
                    i2 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (Intrinsics.LJFF(str, "cancel_invite")) {
                str3 = "abnormal";
            } else {
                str3 = "normal";
            }
            long followStatus = linkPlayerInfo.mUser.getFollowInfo().getFollowStatus();
            C924950aB3.LIZLLL(new C924960aB4(str2, str, size, i3, str3, idStr, null, null, null, null, null, null, Long.valueOf(followStatus), C923240a8I.LIZ(Long.valueOf(linkPlayerInfo.linkTypePermission)), C920500a3s.LIZ, null, null, null, null, C930540aK4.LJIILJJIL(linkPlayerInfo), linkPlayerInfo.trackMap, null, 10457024));
        }
    }

    public C931880aME(View view, DataChannel dataChannel, InterfaceC931940aMK interfaceC931940aMK, MultiGuestDataHolder multiGuestDataHolder, LinkControlDataHolder linkControlDataHolder, int i) {
        super(view);
        this.LL = dataChannel;
        this.LLILLJJLI = interfaceC931940aMK;
        this.LLILLL = multiGuestDataHolder;
        this.LLILZ = linkControlDataHolder;
        this.LLILZIL = i;
        this.LLILZLL = (C1099610eil) view.findViewById(R.id.lms);
        this.LLIZ = view.findViewById(R.id.azf);
        this.LLIZLLLIL = view.findViewById(R.id.aze);
        this.LLJ = (C1324720kZq) view.findViewById(R.id.lmx);
        this.LLJI = (C1324720kZq) view.findViewById(R.id.lmy);
        this.LLJIJIL = (C16F5) view.findViewById(R.id.tv_user_name);
        this.LLJILJIL = (C16F5) view.findViewById(R.id.zyw);
        this.LLJILJILJ = (C16F5) view.findViewById(R.id.tv_relationship);
        this.LLJILLL = (C16F5) view.findViewById(R.id.tv_request_from_karaoke);
        this.LLJJ = (ImageView) view.findViewById(R.id.lks);
        this.LLJJI = (ImageView) view.findViewById(R.id.lkr);
        this.LLJJIII = (C16FS) view.findViewById(R.id.cmm);
        this.LLJJIJI = (LiveIconView) view.findViewById(R.id.lko);
        this.LLJJIJIIJIL = (ImageView) view.findViewById(R.id.jwi);
        this.LLJJIJIL = (C931950aML) view.findViewById(R.id.cra);
        this.LLJJJ = (ViewGroup) view.findViewById(R.id.mha);
        this.LLJJJIL = C452501pT.LIZIZ(new AwS559S0100000_15(view, 1055));
        this.LLJJJJ = view.getContext();
    }
}
