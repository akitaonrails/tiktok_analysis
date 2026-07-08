package X;

import Y.ACListenerS142S0100000_7;
import Y.ACListenerS19S0310000_15;
import Y.ACListenerS51S0400000_15;
import Y.ACListenerS81S0300000_15;
import android.os.BaseBundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFixCapsuleExposeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestEnableMixModeSetting;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;
import com.bytedance.android.livesdk.model.message.LinkmicAudienceApplyGuide;
import com.bytedance.android.livesdk.model.message.LinkmicAudienceInviteGroupChatMemberGuide;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;
import wh6.AbS328S0300000_15;

/* JADX INFO: renamed from: X.0aOg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C933400aOg extends AbstractC1110760f0k<C933890aPT> {
    public final View LLILZ;
    public final ImageView LLILZIL;
    public final C16F5 LLILZLL;
    public final C16F5 LLIZ;
    public boolean LLIZLLLIL;

    public static final boolean R5() {
        return LiveSdkMultiGuestEnableMixModeSetting.isEnable() ? !C949950apN.LIZ() : C949950apN.LIZIZ() != 2;
    }

    public C933400aOg(View view) {
        super(view);
        this.LLILZ = view.findViewById(R.id.eu1);
        this.LLILZIL = (ImageView) view.findViewById(R.id.ep8);
        this.LLILZLL = (C16F5) view.findViewById(R.id.jc2);
        this.LLIZ = (C16F5) view.findViewById(R.id.kyu);
    }

    public static final boolean P5(long j, List<Long> list) {
        InterfaceC2262081DgM currentUser;
        if (j <= 0 || (list != null && list.contains(Long.valueOf(j)))) {
            return false;
        }
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null && currentUser.getId() == j) {
            return false;
        }
        return true;
    }

    public static void S5(String str, List list) {
        String string;
        Long lValueOf;
        String string2;
        String str2;
        String str3;
        LiveMode streamType;
        InterfaceC2262081DgM currentUser;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        BaseBundle baseBundle = (BaseBundle) dataChannelGlobal.gg0(C931430aLV.class);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_chat_live_mutual_notice");
        c474500IjALIZ.LJJII(str, "action_type");
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser == null || (currentUser = interfaceC500940JkiUser.getCurrentUser()) == null || (string = Long.valueOf(currentUser.getId()).toString()) == null) {
            string = "";
        }
        c474500IjALIZ.LJJII(string, "anchor_id");
        Integer numValueOf = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        if (baseBundle != null) {
            string2 = baseBundle.getString("chat_group_id");
        } else {
            string2 = null;
        }
        c474500IjALIZ.LJJII(string2, "chat_group_id");
        if (baseBundle != null) {
            numValueOf = Integer.valueOf(baseBundle.getInt("group_user_num"));
        }
        c474500IjALIZ.LJJII(numValueOf, "chat_group_user_num");
        if (C924810aAp.LJ().LJJII > 0) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str2, "is_guest_connection");
        c474500IjALIZ.LJJII(Integer.valueOf(C924810aAp.LJ().LJJII), "guest_cnt");
        c474500IjALIZ.LJJII(C925150aBN.LIZLLL(), "layout_id");
        if (room == null || (streamType = room.getStreamType()) == null || (str3 = streamType.logStreamingType) == null) {
            str3 = "video_live";
        }
        c474500IjALIZ.LJJII(str3, "live_type");
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        c474500IjALIZ.LJJII(C917520Zz4.LJII(C927600aFK.LJII()).getFirst(), "layout_setting");
        C307001Gy.LIZ().getClass();
        c474500IjALIZ.LJJII(C917520Zz4.LJII(C927600aFK.LJII()).getSecond(), "window_setting");
        if (Intrinsics.LJFF(str, "click")) {
            c474500IjALIZ.LJJII(Integer.valueOf(((ArrayList) list).size()), "invite_num");
            c474500IjALIZ.LJJII(C13LP.LJJLIIIJ(list, ",", e3.e, e3.f, 0, null, null, 56), "invite_uid_list");
        }
        if (Intrinsics.LJFF(str, "click")) {
            C945340ahw c945340ahw = new C945340ahw(c474500IjALIZ);
            c945340ahw.LIZ((Pair[]) Arrays.copyOf(new Pair[0], 0));
            c945340ahw.LIZIZ();
            return;
        }
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC1111020f1A
    public final void L5(C1109770ez9 c1109770ez9, InterfaceC1112060f2q interfaceC1112060f2q) {
        boolean z;
        LinkmicAudienceApplyGuide linkmicAudienceApplyGuide;
        User user;
        ImageModel avatarThumb;
        String str;
        String str2;
        LinkUser linkUserLLD;
        User user2;
        List<Long> list;
        String str3;
        String str4;
        User user3;
        C933890aPT c933890aPT = (C933890aPT) interfaceC1112060f2q;
        if (LinkMicFixCapsuleExposeSetting.INSTANCE.enable()) {
            z = c933890aPT.LJJI;
        } else {
            z = true;
        }
        LinkMicAudienceNoticeMessage linkMicAudienceNoticeMessage = (LinkMicAudienceNoticeMessage) c933890aPT.LJIL;
        int i = linkMicAudienceNoticeMessage.noticeType;
        String str5 = null;
        ArrayList arrayList = null;
        if (i == 0) {
            LinkMicAudienceNoticeMessage.LinkMicAudienceTurnOnGuide linkMicAudienceTurnOnGuide = linkMicAudienceNoticeMessage.turnOnGuide;
            if (linkMicAudienceTurnOnGuide != null && linkMicAudienceTurnOnGuide.content != null && linkMicAudienceTurnOnGuide.buttonContent != null) {
                this.LLILZIL.setImageResource(R.drawable.el3);
                this.LLILZLL.setText(linkMicAudienceTurnOnGuide.content.text);
                this.LLIZ.setText(linkMicAudienceTurnOnGuide.buttonContent.text);
                C786410Ut5.I7(new ACListenerS142S0100000_7(c1109770ez9, 0), this.LLILZ);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_invite_guest_popup_show");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
                return;
            }
            return;
        }
        int followStatus = 0;
        if (i == 1) {
            LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide linkMicAudienceInviteGuide = linkMicAudienceNoticeMessage.inviteGuide;
            if (linkMicAudienceInviteGuide == null || (user3 = linkMicAudienceInviteGuide.user) == null || user3.getAvatarThumb() == null || linkMicAudienceInviteGuide.buttonContent == null || linkMicAudienceInviteGuide.content == null) {
                return;
            }
            T5(linkMicAudienceInviteGuide, false, z);
            C786410Ut5.I7(new ACListenerS81S0300000_15(linkMicAudienceInviteGuide, this, c1109770ez9, 0), this.LLILZ);
            return;
        }
        if (i == 2) {
            LinkmicAudienceInviteGroupChatMemberGuide linkmicAudienceInviteGroupChatMemberGuide = linkMicAudienceNoticeMessage.groupChatMemberInviteGuide;
            if (linkmicAudienceInviteGroupChatMemberGuide == null || (list = linkmicAudienceInviteGroupChatMemberGuide.groupMemberUserIds) == null || list.isEmpty() || linkmicAudienceInviteGroupChatMemberGuide == null || linkmicAudienceInviteGroupChatMemberGuide.content == null || linkmicAudienceInviteGroupChatMemberGuide.buttonContent == null) {
                return;
            }
            this.LLILZ.setBackgroundResource(R.drawable.dw9);
            this.LLILZIL.setImageResource(R.drawable.eo9);
            C16F5 c16f5 = this.LLILZLL;
            LinkMicAudienceNoticeMessage.LinkMicAudienceNoticeText linkMicAudienceNoticeText = linkmicAudienceInviteGroupChatMemberGuide.content;
            if (linkMicAudienceNoticeText != null) {
                str3 = linkMicAudienceNoticeText.text;
            } else {
                str3 = null;
            }
            c16f5.setText(str3);
            C16F5 c16f52 = this.LLIZ;
            LinkMicAudienceNoticeMessage.LinkMicAudienceNoticeText linkMicAudienceNoticeText2 = linkmicAudienceInviteGroupChatMemberGuide.buttonContent;
            if (linkMicAudienceNoticeText2 != null) {
                str4 = linkMicAudienceNoticeText2.text;
            } else {
                str4 = null;
            }
            c16f52.setText(str4);
            C786410Ut5.l8(this.LLIZ, new ACListenerS19S0310000_15(c1109770ez9, linkmicAudienceInviteGroupChatMemberGuide, this, 0));
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            List<LinkPlayerInfo> list2 = C307001Gy.LIZ().LJIILIIL().LJJJ;
            if (list2 != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<LinkPlayerInfo> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Long.valueOf(it2.next().mUser.getId()));
                }
            }
            List<Long> list3 = linkmicAudienceInviteGroupChatMemberGuide.groupMemberUserIds;
            ArrayList arrayList2 = new ArrayList();
            for (Long l : list3) {
                if (P5(l.longValue(), arrayList)) {
                    arrayList2.add(l);
                }
            }
            S5("show", arrayList2);
            return;
        }
        if (i == 3) {
            C1AZW.LIZ.getClass();
            C1AZW.LIZ("invite_outside_friend", "show guest Capsule Ui", null, null);
            LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide linkMicAudienceInviteGuide2 = ((LinkMicAudienceNoticeMessage) c933890aPT.LJIL).inviteGuide;
            if (linkMicAudienceInviteGuide2 == null || (user2 = linkMicAudienceInviteGuide2.user) == null || user2.getAvatarThumb() == null || linkMicAudienceInviteGuide2.buttonContent == null || linkMicAudienceInviteGuide2.content == null) {
                return;
            }
            T5(linkMicAudienceInviteGuide2, true, z);
            this.LLIZLLLIL = false;
            C786410Ut5.l8(this.LLIZ, new ACListenerS51S0400000_15(this, linkMicAudienceInviteGuide2, c1109770ez9, c933890aPT, 0));
            return;
        }
        if (i != 4 || (linkmicAudienceApplyGuide = linkMicAudienceNoticeMessage.applyGuide) == null || (user = linkmicAudienceApplyGuide.user) == null || user.getAvatarThumb() == null || linkmicAudienceApplyGuide.buttonContent == null || linkmicAudienceApplyGuide.content == null) {
            return;
        }
        User user4 = linkmicAudienceApplyGuide.user;
        if (user4 != null && z) {
            long id = user4.getId();
            EnumC918970a1P enumC918970a1PLJI = C917140ZyS.LJI();
            FollowInfo followInfo = user4.getFollowInfo();
            if (followInfo != null) {
                followStatus = (int) followInfo.getFollowStatus();
            }
            Boolean bool = Boolean.FALSE;
            String str6 = linkmicAudienceApplyGuide.linkmicAudienceApplyNoticeReason;
            long id2 = user4.getId();
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL == null || (linkUserLLD = interfaceC954180awCLLJLL.LLD(id2)) == null || (str2 = linkUserLLD.linkMicId) == null) {
                str2 = linkmicAudienceApplyGuide.linkmicId;
            }
            C925600aC6.LJJIJ(id, enumC918970a1PLJI, false, followStatus, bool, str6, "guest_apply_anchor", str2, null);
        }
        this.LLILZ.setBackgroundResource(R.drawable.dw8);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLILZIL.getLayoutParams();
        marginLayoutParams.width = (int) C497740JfY.LIZIZ(32.0f);
        marginLayoutParams.height = (int) C497740JfY.LIZIZ(32.0f);
        marginLayoutParams.leftMargin = (int) C497740JfY.LIZIZ(8.0f);
        marginLayoutParams.rightMargin = (int) C497740JfY.LIZIZ(8.0f);
        C786410Ut5.c6(this.LLILZIL, marginLayoutParams);
        ImageView imageView = this.LLILZIL;
        User user5 = linkmicAudienceApplyGuide.user;
        if (user5 != null) {
            avatarThumb = user5.getAvatarThumb();
        } else {
            avatarThumb = null;
        }
        C1121670fIL.LJIILIIL(imageView, avatarThumb, this.LLILZIL.getWidth(), this.LLILZIL.getHeight(), R.drawable.el_);
        C16F5 c16f53 = this.LLILZLL;
        LinkMicAudienceNoticeMessage.LinkMicAudienceNoticeText linkMicAudienceNoticeText3 = linkmicAudienceApplyGuide.content;
        if (linkMicAudienceNoticeText3 != null) {
            str = linkMicAudienceNoticeText3.text;
        } else {
            str = null;
        }
        c16f53.setText(str);
        C16F5 c16f54 = this.LLIZ;
        LinkMicAudienceNoticeMessage.LinkMicAudienceNoticeText linkMicAudienceNoticeText4 = linkmicAudienceApplyGuide.buttonContent;
        if (linkMicAudienceNoticeText4 != null) {
            str5 = linkMicAudienceNoticeText4.text;
        }
        c16f54.setText(str5);
        C786410Ut5.I7(new AbS328S0300000_15(c1109770ez9, this, linkmicAudienceApplyGuide, 0), this.LLILZ);
    }

    public final void T5(LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide linkMicAudienceInviteGuide, boolean z, boolean z2) {
        int followStatus;
        if (z2) {
            long id = linkMicAudienceInviteGuide.user.getId();
            EnumC918970a1P enumC918970a1PLJI = C917140ZyS.LJI();
            FollowInfo followInfo = linkMicAudienceInviteGuide.user.getFollowInfo();
            if (followInfo == null) {
                followStatus = 0;
            } else {
                followStatus = (int) followInfo.getFollowStatus();
            }
            C925600aC6.LJJIJ(id, enumC918970a1PLJI, false, followStatus, Boolean.valueOf(z), linkMicAudienceInviteGuide.linkmicAudienceInviteNoticeReason, "anchor_invite_guest", null, null);
        }
        this.LLILZ.setBackgroundResource(R.drawable.dw8);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LLILZIL.getLayoutParams();
        marginLayoutParams.width = (int) C497740JfY.LIZIZ(32.0f);
        marginLayoutParams.height = (int) C497740JfY.LIZIZ(32.0f);
        marginLayoutParams.leftMargin = (int) C497740JfY.LIZIZ(8.0f);
        marginLayoutParams.rightMargin = (int) C497740JfY.LIZIZ(8.0f);
        C786410Ut5.c6(this.LLILZIL, marginLayoutParams);
        C1121670fIL.LJIILIIL(this.LLILZIL, linkMicAudienceInviteGuide.user.getAvatarThumb(), this.LLILZIL.getWidth(), this.LLILZIL.getHeight(), R.drawable.el_);
        this.LLILZLL.setText(linkMicAudienceInviteGuide.content.text);
        this.LLIZ.setText(linkMicAudienceInviteGuide.buttonContent.text);
    }
}
