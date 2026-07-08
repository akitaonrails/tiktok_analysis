package X;

import Y.ACListenerS149S0100000_14;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveContent;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.dynamic.DynamicInfoComponent;
import com.ss.android.ugc.aweme.im.service.service.IIMNudgeAndStreakService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS132S0110000_14;
import kotlin.jvm.internal.AwS450S0200000_14;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Z9P, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z9P extends C1619110sEf implements InterfaceC19330810jy {
    public static InterfaceC539120LCk LLILLJJLI;
    public static boolean LLIZ;
    public static final C0Z9P LL = new C0Z9P();
    public static final C01GW LLILLL = C452501pT.LIZIZ(new C0Z9R());
    public static final C01GW LLILZ = C452501pT.LIZIZ(new C0Z9Q());
    public static final C01GW LLILZIL = C452501pT.LIZIZ(new C876980Yam());
    public static final int[] LLILZLL = {21};

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        return true;
    }

    public static IMainPageFragment LJIIZILJ() {
        return (IMainPageFragment) LLILLL.getValue();
    }

    public static IIMNudgeAndStreakService LJIJI() {
        return (IIMNudgeAndStreakService) LLILZ.getValue();
    }

    public static final ILightInteractionPlatformService LJIILJJIL() {
        return (ILightInteractionPlatformService) ServiceManager.get().getService(ILightInteractionPlatformService.class);
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return LLILZLL;
    }

    public static final boolean LJIILIIL(InnerPushMessage innerPushMessage) {
        ShareLiveContent shareLiveContentLJIILLIIL = LJIILLIIL(innerPushMessage);
        if (shareLiveContentLJIILLIIL != null) {
            if (C19328310jZ.LIZIZ.LIZLLL("live_inner_push") != 1 || ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().Vs(shareLiveContentLJIILLIIL.getRoomId())) {
                return false;
            }
            return true;
        }
        ShareLiveContent shareLiveContentLJIILL = LJIILL(innerPushMessage);
        if (shareLiveContentLJIILL == null) {
            return true;
        }
        if (C19328310jZ.LIZIZ.LIZLLL("live_inner_push") != 1 || ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().Vs(shareLiveContentLJIILL.getRoomId())) {
            return false;
        }
        return true;
    }

    public static ShareLiveContent LJIILL(InnerPushMessage innerPushMessage) {
        C869590Y9l c869590Y9l;
        BaseTemplate baseTemplateLIZ;
        DynamicCardTemplate dynamicCardTemplate;
        DynamicInfoComponent dynamicInfoComponent;
        String str;
        C879180YeK c879180YeKLJIJ = LJIJ(innerPushMessage);
        if (c879180YeKLJIJ == null || (c869590Y9l = c879180YeKLJIJ.LIZLLL) == null || !((Boolean) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).B4().LIZJ(Boolean.TRUE, "multi_guest_enable_group_push_add_linkmic_action")).booleanValue() || c869590Y9l.getMsgType() != 2000 || !Intrinsics.LJFF(c869590Y9l.getScene(), "live_group_mic_connect")) {
            return null;
        }
        try {
            ByteString contentPB = c869590Y9l.getContentPB();
            if (contentPB != null && contentPB.size() > 0) {
                baseTemplateLIZ = C2241931Cox.LIZ(contentPB, 2000);
            } else {
                baseTemplateLIZ = null;
            }
            if (!(baseTemplateLIZ instanceof DynamicCardTemplate) || (dynamicCardTemplate = (DynamicCardTemplate) baseTemplateLIZ) == null || (dynamicInfoComponent = dynamicCardTemplate.dynamicInfo) == null || (str = dynamicInfoComponent.businessId) == null) {
                return null;
            }
            ShareLiveContent shareLiveContent = new ShareLiveContent(null, null, null, null, null, null, null, null, null, null, null, null, null, null);
            shareLiveContent.setRoomId(str);
            shareLiveContent.setRoomOwnerId(String.valueOf(c869590Y9l.getSender()));
            shareLiveContent.setRoomSecOwnerId(c869590Y9l.getSecSender());
            shareLiveContent.setShareLiveIntent("multi_guest_group_chat_inner_push");
            return shareLiveContent;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static ShareLiveContent LJIILLIIL(InnerPushMessage innerPushMessage) {
        Object obj;
        Map<String, Object> extrasMap;
        if (innerPushMessage != null && (extrasMap = innerPushMessage.getExtrasMap()) != null) {
            obj = extrasMap.get("interact");
        } else {
            obj = null;
        }
        if (!(obj instanceof ShareLiveContent)) {
            return null;
        }
        return (ShareLiveContent) obj;
    }

    public static C879180YeK LJIJ(InnerPushMessage innerPushMessage) {
        Object obj;
        Map<String, Object> extrasMap;
        if (innerPushMessage != null && (extrasMap = innerPushMessage.getExtrasMap()) != null) {
            obj = extrasMap.get("dm");
        } else {
            obj = null;
        }
        if (!(obj instanceof C879180YeK)) {
            return null;
        }
        return (C879180YeK) obj;
    }

    public static boolean LJIJJLI(C869590Y9l c869590Y9l) {
        String scene;
        if (c869590Y9l != null && (scene = c869590Y9l.getScene()) != null) {
            return C1697810uHb.LJIIJJI("streak_pet_unlock_remind", "streak_pet_waiting_remind").contains(scene);
        }
        return false;
    }

    public static void LJIL(C879180YeK c879180YeK) {
        InterfaceC897380ZIi.LIZIZ.getClass();
        C0ZE8 c0ze8LJIIJJI = C897370ZIh.LIZ().LJIIJJI();
        C0ZE7 c0ze7 = new C0ZE7(null);
        c0ze7.LIZLLL = LJIIZILJ().LJJLIIIJJI();
        c0ze7.LJII = Boolean.TRUE;
        c0ze7.LIZIZ(EnumC1910440zoY.DM_INNER_PUSH);
        c0ze7.LJFF = "chat_room";
        c0ze7.LIZJ = c879180YeK.LJIIIZ.LIZIZ;
        c0ze8LJIIJJI.LIZ(c0ze7, false, C0I0B.LJFF.LIZIZ());
    }

    public static void LJJIFFI(Context context) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("enter_from", "inner_push", bundle);
        C786410Ut5.LJJJI("enter_method", "cell", bundle);
        C1336205Ku.LIZ(false).getImChatService().LJIIL(context, bundle, false, null);
    }

    public static int LJJIII(InnerPushMessage innerPushMessage) {
        C19328310jZ c19328310jZ = C19328310jZ.LIZIZ;
        if (c19328310jZ.LIZLLL("in_app_vibrate_live_push") != 1 || c19328310jZ.LIZLLL("live_inner_push") != 1) {
            return 0;
        }
        int iJe = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3().Je();
        if (iJe == 1 || iJe == 2) {
            ShareLiveContent shareLiveContentLJIILLIIL = LJIILLIIL(innerPushMessage);
            if (shareLiveContentLJIILLIIL == null) {
                return 0;
            }
            String roomOwnerId = shareLiveContentLJIILLIIL.getRoomOwnerId();
            String strLJIL = null;
            if (roomOwnerId != null) {
                LL.getClass();
                IMContactApi.LIZ.getClass();
                IMUser iMUserLJ = C069P.LIZ().LJ().LJ(roomOwnerId, null);
                if (iMUserLJ != null) {
                    strLJIL = C069P.LIZ().LIZ().LJIL(iMUserLJ);
                }
            }
            if (!Intrinsics.LJFF(strLJIL, "2")) {
                return 0;
            }
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01b8  */
    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r22) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z9P.LIZIZ(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage):void");
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        if (C1585030rLh.LJIJI("NOTIFICATION") && C1618630sDt.LIZIZ.isShowing()) {
            return true;
        }
        C876900Yae c876900Yae = C876900Yae.LIZ;
        if (C876900Yae.LIZ() == 1) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        boolean zLJIILIIL;
        if (LJIILLIIL(innerPushMessage) == null && LJIILL(innerPushMessage) == null) {
            zLJIILIIL = true;
        } else {
            zLJIILIIL = LJIILIIL(innerPushMessage);
            if (zLJIILIIL) {
            }
            return zLJIILIIL;
        }
        if (C1908480zlO.LIZIZ.LJIIJJI()) {
            InterfaceC539120LCk interfaceC539120LCk = LLILLJJLI;
            if (interfaceC539120LCk != null) {
                C539110LCj.LIZIZ(interfaceC539120LCk, innerPushMessage, new int[]{1, 2, 3}, true, 4);
            }
            innerPushMessage.setDMPushReusedContainerShowed(true);
        }
        return zLJIILIIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bc A[PHI: r9
      0x01bc: PHI (r9v3 boolean) = (r9v1 boolean), (r9v4 boolean), (r9v4 boolean) binds: [B:52:0x00bd, B:58:0x00cb, B:60:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJ(X.C879180YeK r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z9P.LJJ(X.0YeK, boolean):void");
    }

    public static void LJJI(C879180YeK c879180YeK, boolean z) {
        InterfaceC539120LCk interfaceC539120LCk = LLILLJJLI;
        if (interfaceC539120LCk != null) {
            interfaceC539120LCk.LIZIZ("DM push click", new AwS132S0110000_14(c879180YeK, z, 8), true);
            return;
        }
        LL.getClass();
        LJJ(c879180YeK, z);
        InterfaceC539120LCk interfaceC539120LCk2 = LLILLJJLI;
        if (interfaceC539120LCk2 == null) {
            return;
        }
        interfaceC539120LCk2.LIZIZ("DM push click", null, true);
    }

    public static final void LJJII(int i, InnerPushMessage innerPushMessage) {
        InnerPushUITemplate uiTemplate;
        Activity activityLIZIZ;
        String string;
        String string2;
        AbstractC1387200mCc abstractC1387200mCcLJ;
        if (innerPushMessage != null && (uiTemplate = innerPushMessage.getUiTemplate()) != null) {
            uiTemplate.setRightType(3);
            LL.getClass();
            try {
                abstractC1387200mCcLJ = C1906580ziK.LJ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (abstractC1387200mCcLJ != null) {
                activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
            } else {
                activityLIZIZ = null;
            }
            String str = "";
            if (activityLIZIZ == null || (string = activityLIZIZ.getString(2131830941)) == null) {
                string = "";
            }
            uiTemplate.setRightBtnText(string);
            uiTemplate.setRightImageUrl(null);
            uiTemplate.setRightImageResId(0);
            uiTemplate.setRightImageDrawable(null);
            uiTemplate.setRightImageHeight(0);
            uiTemplate.setRightImageWidth(0);
            uiTemplate.setRightImageRadius(0);
            uiTemplate.setGlobalSchemaUrl(uiTemplate.rightSchemaUrl);
            try {
                AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ2 != null) {
                    Activity activityLIZIZ2 = abstractC1387200mCcLJ2.LIZIZ();
                    if (activityLIZIZ2 != null && (string2 = activityLIZIZ2.getString(i)) != null) {
                        str = string2;
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            uiTemplate.setContent(str);
            LLIZ = true;
            InterfaceC539120LCk interfaceC539120LCk = LLILLJJLI;
            if (interfaceC539120LCk != null) {
                C539110LCj.LIZIZ(interfaceC539120LCk, innerPushMessage, new int[]{3, 2}, false, 8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    @Override // X.InterfaceC19330810jy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(int r36, com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r37) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z9P.LIZ(int, com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage):boolean");
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        LLILLJJLI = c20663515tR;
        if (innerPushMessage == null || !LJIILJJIL().LJJI().LJIJJ(innerPushMessage)) {
            return null;
        }
        C0Z9K c0z9kLJJI = LJIILJJIL().LJJI();
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("enter_from", "inner_push");
        pairArr[1] = new Pair("enter_method", EnumC1908370zlD.CELL.getValue());
        String label = innerPushMessage.getLabel();
        if (label == null) {
            label = "";
        }
        pairArr[2] = new Pair("push_label", label);
        pairArr[3] = new Pair("light_interaction_enter_from", ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJJLIIIJJI());
        pairArr[4] = new Pair("light_interaction_enter_method", EnumC1908380zlE.INNER_PUSH.getValue());
        return c0z9kLJJI.LJIIJJI(innerPushMessage, null, true, C2097608Jq.LJIIIIZZ(pairArr), new ACListenerS149S0100000_14(innerPushMessage, 83), new AwS450S0200000_14(c20663515tR, innerPushMessage, 20));
    }

    @Override // X.C1619110sEf, X.InterfaceC20643015q8
    public final void LJIIJ(InnerPushMessage innerPushMessage, boolean z, String str) {
        String str2;
        int i;
        C879380Yee c879380Yee;
        String str3;
        C879380Yee c879380Yee2;
        String str4;
        C879180YeK c879180YeKLJIJ = LJIJ(innerPushMessage);
        ShareLiveContent shareLiveContentLJIILLIIL = LJIILLIIL(innerPushMessage);
        String str5 = "";
        if (shareLiveContentLJIILLIIL != null) {
            InterfaceC2183451Acp interfaceC2183451AcpX3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3();
            String roomOwnerId = shareLiveContentLJIILLIIL.getRoomOwnerId();
            if (roomOwnerId == null) {
                roomOwnerId = "";
            }
            String roomId = shareLiveContentLJIILLIIL.getRoomId();
            if (roomId == null) {
                roomId = "";
            }
            if (str == null) {
                if (z) {
                    str4 = "draw";
                } else {
                    str4 = "others";
                }
            } else {
                str4 = str;
            }
            LL.getClass();
            interfaceC2183451AcpX3.rh(LJJIII(innerPushMessage), roomOwnerId, roomId, str4);
        }
        ShareLiveContent shareLiveContentLJIILL = LJIILL(innerPushMessage);
        if (shareLiveContentLJIILL != null) {
            InterfaceC2183451Acp interfaceC2183451AcpX32 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3();
            String roomOwnerId2 = shareLiveContentLJIILL.getRoomOwnerId();
            if (roomOwnerId2 == null) {
                roomOwnerId2 = "";
            }
            String roomId2 = shareLiveContentLJIILL.getRoomId();
            if (roomId2 == null) {
                roomId2 = "";
            }
            if (str == null) {
                if (z) {
                    str = "draw";
                } else {
                    str = "others";
                }
            }
            LL.getClass();
            interfaceC2183451AcpX32.rh(LJJIII(null), roomOwnerId2, roomId2, str);
        }
        C0I0B.LJFF.LIZIZ();
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("enter_from", LJIIZILJ().LJJLIIIJJI());
        if (z) {
            str2 = "slide_up";
        } else {
            str2 = "auto";
        }
        pairArr[1] = new Pair("action_type", str2);
        if (c879180YeKLJIJ != null && (c879380Yee2 = c879180YeKLJIJ.LJIIIZ) != null) {
            i = c879380Yee2.LIZ;
        } else {
            i = -1;
        }
        pairArr[2] = new Pair("chat_cnt", String.valueOf(i));
        if (c879180YeKLJIJ != null && (c879380Yee = c879180YeKLJIJ.LJIIIZ) != null && (str3 = c879380Yee.LIZIZ) != null) {
            str5 = str3;
        }
        pairArr[3] = new Pair("from_user_id", str5);
        C20684815ws.LJIILLIIL("close_message_inner_push", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static void LJIJJ(ShareLiveContent shareLiveContent, int i, C869590Y9l c869590Y9l, InnerPushMessage innerPushMessage) {
        String str;
        String str2;
        int i2;
        boolean z;
        Object c098200Yq;
        if (Intrinsics.LJFF(shareLiveContent.getShareLiveIntent(), "multi_guest_invite_guest_invite_friend")) {
            str = "guest";
        } else if (Intrinsics.LJFF(shareLiveContent.getShareLiveIntent(), "multi_guest_invite_admin_invite")) {
            str = "moderator";
        } else {
            str = "anchor";
        }
        InterfaceC2183451Acp interfaceC2183451AcpX3 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).X3();
        String roomOwnerId = shareLiveContent.getRoomOwnerId();
        String str3 = "";
        if (roomOwnerId == null) {
            roomOwnerId = "";
        }
        String roomId = shareLiveContent.getRoomId();
        if (roomId != null) {
            str3 = roomId;
        }
        int i3 = 3;
        if (i == 3) {
            str2 = "link_accept";
        } else {
            str2 = "push";
        }
        interfaceC2183451AcpX3.kn(LJJIII(innerPushMessage), roomOwnerId, str3, str2, str, C0IXU.LIZ(shareLiveContent.getShareLiveIntent()), null, null);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("share_user_id", String.valueOf(c869590Y9l.getSender()), bundle);
        C786410Ut5.LJJJI("share_live_intent", shareLiveContent.getShareLiveIntent(), bundle);
        C786410Ut5.LJJJI("shared_enter_from", shareLiveContent.getSharedEnterFrom(), bundle);
        C786410Ut5.LJJJI("share_live_trace_id", shareLiveContent.getShareLiveTraceId(), bundle);
        C786410Ut5.LJJJI("mg_distribution_type", str, bundle);
        int i4 = 2;
        if (i == 3) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        bundle.putInt("accept_multi_guest_invite", i2);
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        String shareLiveIntent = shareLiveContent.getShareLiveIntent();
        if (z) {
            if (Intrinsics.LJFF(shareLiveIntent, "multi_guest_invite_admin_invite")) {
                i4 = 5;
            } else if (Intrinsics.LJFF(shareLiveIntent, "multi_guest_invite_guest_invite_friend")) {
                i4 = 8;
            }
        } else if (Intrinsics.LJFF(shareLiveIntent, "multi_guest_invite_admin_invite")) {
            i4 = 4;
        } else if (Intrinsics.LJFF(shareLiveIntent, "multi_guest_invite_guest_invite_friend")) {
            i4 = 7;
        } else {
            i4 = 1;
        }
        bundle.putInt("mg_enter_type", i4);
        bundle.putLong("mg_from_source_user_id", c869590Y9l.getSender());
        if (i == 3) {
            i3 = 4;
        }
        bundle.putInt("shared_invitee_enter_source", i3);
        C786410Ut5.LJJJI("enter_from_merge", "inner_push", bundle);
        C786410Ut5.LJJJI("enter_method", "inner_push", bundle);
        C786410Ut5.LJJJI("gd_label", "mg_invite_friend_link", bundle);
        User user = new User();
        user.setUid(shareLiveContent.getRoomOwnerId());
        user.setSecUid(shareLiveContent.getRoomSecOwnerId());
        String roomId2 = shareLiveContent.getRoomId();
        if (roomId2 != null) {
            try {
                c098200Yq = Long.valueOf(CastLongProtector.parseLong(roomId2));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                user.roomId = ((Number) c098200Yq).longValue();
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).z5().LIZJ(C20642515q3.LIZ(), user, null, bundle);
    }
}
