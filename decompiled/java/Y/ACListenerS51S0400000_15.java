package Y;

import X.C1109770ez9;
import X.C197039127h;
import X.C20441214yg;
import X.C259800zU;
import X.C497740JfY;
import X.C766270U4b;
import X.C917140ZyS;
import X.C918910a1J;
import X.C922480a74;
import X.C923200a8E;
import X.C925600aC6;
import X.C929070aHh;
import X.C930420aJs;
import X.C933400aOg;
import X.C933890aPT;
import X.C946850akN;
import X.C948450amx;
import X.C953550avB;
import X.EnumC918970a1P;
import X.EnumC928610aGx;
import X.EnumC952890au7;
import X.EnumC971520bOA;
import X.InterfaceC920480a3q;
import X.InterfaceC953490av5;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.model.InviteChatGroupHelper;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import webcast.data.multi_guest_play.ConvertNoticeboardMaterialInfo;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: loaded from: classes16.dex */
public class ACListenerS51S0400000_15 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS51S0400000_15 aCListenerS51S0400000_15, View view) {
        int followStatus;
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131842764));
        if (((C933400aOg) aCListenerS51S0400000_15.l0).LLIZLLLIL) {
            C20441214yg.LIZIZ("invite_outside_friend", "has sent privateMessage!");
            return;
        }
        long id = ((LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide) aCListenerS51S0400000_15.l1).user.getId();
        ((C933400aOg) aCListenerS51S0400000_15.l0).getClass();
        EnumC918970a1P enumC918970a1PLJI = C917140ZyS.LJI();
        C933400aOg c933400aOg = (C933400aOg) aCListenerS51S0400000_15.l0;
        FollowInfo followInfo = ((LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide) aCListenerS51S0400000_15.l1).user.getFollowInfo();
        c933400aOg.getClass();
        if (followInfo == null) {
            followStatus = 0;
        } else {
            followStatus = (int) followInfo.getFollowStatus();
        }
        C925600aC6.LJJIJ(id, enumC918970a1PLJI, true, followStatus, Boolean.TRUE, ((LinkMicAudienceNoticeMessage.LinkMicAudienceInviteGuide) aCListenerS51S0400000_15.l1).linkmicAudienceInviteNoticeReason, "anchor_invite_guest", null, null);
        DataChannel dataChannel = ((C1109770ez9) aCListenerS51S0400000_15.l2).LJIIIZ;
        if (view != null && view.getContext() != null && dataChannel != null) {
            if (C933400aOg.R5()) {
                C766270U4b.LIZLLL(2131842740);
                return;
            }
            C922480a74.LIZ(dataChannel, null);
            LinkPlayerInfo linkPlayerInfo = new LinkPlayerInfo();
            linkPlayerInfo.mUser = ((LinkMicAudienceNoticeMessage) ((C933890aPT) aCListenerS51S0400000_15.l3).LJIL).inviteGuide.user;
            linkPlayerInfo.onlineStatus = 1;
            C20441214yg.LIZIZ("invite_outside_friend", "capsule inviteFriendBySharingMessage");
            InterfaceC920480a3q interfaceC920480a3qLIZ = C918910a1J.LIZ();
            if (interfaceC920480a3qLIZ != null) {
                interfaceC920480a3qLIZ.LIZIZ(linkPlayerInfo, 0, true, "multi_guest_invite_by_capsule", new AwS559S0100000_15((C933400aOg) aCListenerS51S0400000_15.l0, 2), AFwS250S0000000_15.get$arr$(2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$1(ACListenerS51S0400000_15 aCListenerS51S0400000_15, View view) {
        InterfaceC953490av5 interfaceC953490av5 = (InterfaceC953490av5) aCListenerS51S0400000_15.l0;
        if (interfaceC953490av5 != null) {
            interfaceC953490av5.LJFF(((C953550avB) aCListenerS51S0400000_15.l1).LIZ.noticeboardTemplateId);
        }
        EnumC971520bOA enumC971520bOA = EnumC971520bOA.REMOVE_FROM_TEMPLATES;
        Long lValueOf = Long.valueOf(((C953550avB) aCListenerS51S0400000_15.l1).LIZ.noticeboardTemplateId);
        MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
        EnumC952890au7 enumC952890au7 = (EnumC952890au7) aCListenerS51S0400000_15.l2;
        multiCanvasUtils.getClass();
        C946850akN.LJIIIZ(enumC971520bOA, lValueOf, "personal", MultiCanvasUtils.LJIIJJI(enumC952890au7), "in_spots");
        PopupWindow popupWindow = (PopupWindow) ((C259800zU) aCListenerS51S0400000_15.l3).element;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$2(ACListenerS51S0400000_15 aCListenerS51S0400000_15, View view) {
        C953550avB c953550avB = (C953550avB) aCListenerS51S0400000_15.l0;
        NoticeboardTemplate noticeboardTemplate = c953550avB.LIZ;
        ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo = noticeboardTemplate.convertNoticeboardMaterialInfo;
        if (convertNoticeboardMaterialInfo != null) {
            InterfaceC953490av5 interfaceC953490av5 = (InterfaceC953490av5) aCListenerS51S0400000_15.l2;
            EnumC952890au7 enumC952890au7 = (EnumC952890au7) aCListenerS51S0400000_15.l3;
            if (interfaceC953490av5 != null) {
                interfaceC953490av5.LJ(noticeboardTemplate.noticeboardTemplateId, noticeboardTemplate.mediaNodeId, convertNoticeboardMaterialInfo);
            }
            EnumC971520bOA enumC971520bOA = EnumC971520bOA.EDIT;
            Long lValueOf = Long.valueOf(c953550avB.LIZ.noticeboardTemplateId);
            MultiCanvasUtils.LIZ.getClass();
            C946850akN.LJIIIZ(enumC971520bOA, lValueOf, "personal", MultiCanvasUtils.LJIIJJI(enumC952890au7), "in_spots");
        }
        PopupWindow popupWindow = (PopupWindow) ((C259800zU) aCListenerS51S0400000_15.l1).element;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$3(ACListenerS51S0400000_15 aCListenerS51S0400000_15, View view) {
        InterfaceC953490av5 interfaceC953490av5 = (InterfaceC953490av5) aCListenerS51S0400000_15.l0;
        if (interfaceC953490av5 != null) {
            interfaceC953490av5.LIZ(((C953550avB) aCListenerS51S0400000_15.l1).LIZ.noticeboardTemplateId);
        }
        EnumC971520bOA enumC971520bOA = EnumC971520bOA.ADD_TO_TEMPLATES;
        Long lValueOf = Long.valueOf(((C953550avB) aCListenerS51S0400000_15.l1).LIZ.noticeboardTemplateId);
        MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
        EnumC952890au7 enumC952890au7 = (EnumC952890au7) aCListenerS51S0400000_15.l2;
        multiCanvasUtils.getClass();
        C946850akN.LJIIIZ(enumC971520bOA, lValueOf, "recommend", MultiCanvasUtils.LJIIJJI(enumC952890au7), "in_spots");
        PopupWindow popupWindow = (PopupWindow) ((C259800zU) aCListenerS51S0400000_15.l3).element;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public static final void onClick$4(ACListenerS51S0400000_15 aCListenerS51S0400000_15, View view) {
        InviteChatGroupHelper inviteChatGroupHelper;
        Object tag = ((C197039127h) aCListenerS51S0400000_15.l0).getTag();
        if (tag instanceof EnumC928610aGx) {
            C929070aHh c929070aHh = (C929070aHh) aCListenerS51S0400000_15.l1;
            if (c929070aHh.LIZIZ != tag) {
                c929070aHh.LIZIZ = (EnumC928610aGx) tag;
                C930420aJs.L5((View) aCListenerS51S0400000_15.l3, c929070aHh, (C930420aJs) aCListenerS51S0400000_15.l2);
                Function1<EnumC928610aGx, Unit> function1 = ((C930420aJs) aCListenerS51S0400000_15.l2).LLILLJJLI;
                if (function1 != null) {
                    function1.invoke((EnumC928610aGx) tag);
                }
                if (tag == EnumC928610aGx.GROUP_CHAT && (inviteChatGroupHelper = (InviteChatGroupHelper) C948450amx.LIZIZ.LJIIJJI("INVITE_CHAT_GROUP_HELPER")) != null && !inviteChatGroupHelper.LJI) {
                    inviteChatGroupHelper.LJI = true;
                    C923200a8E.LIZIZ("click");
                }
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS51S0400000_15(X.EnumC952890au7 r2, X.C953550avB r3, X.InterfaceC953490av5 r4, X.C259800zU r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 1: goto L12;
                case 2: goto L5;
                case 3: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r5
            r0.l2 = r4
            r0.l3 = r2
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.l2 = r2
            r0.l3 = r5
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS51S0400000_15.<init>(X.0au7, X.0avB, X.0av5, X.00zU, int):void");
    }

    public ACListenerS51S0400000_15(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
