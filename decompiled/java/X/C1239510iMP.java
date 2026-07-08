package X;

import android.content.Context;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService;
import com.ss.android.ugc.aweme.publicgroup.data.PopupDisplayMeta;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerGroupInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0iMP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239510iMP {
    public static final C1239510iMP LIZ = new C1239510iMP();

    public static void LIZ(Context context, DMGroupChatStickerModel dMGroupChatStickerModel, final C705930RmZ c705930RmZ, final Function1 function1) {
        String etGroupType;
        Integer groupStatus;
        int value;
        String str;
        Long conversationShortId;
        String string;
        C0R60 c0r60;
        Integer groupStatus2;
        String groupOwnerAccountType;
        if (dMGroupChatStickerModel.isNotEmptyModel()) {
            String str2 = dMGroupChatStickerModel.getEventTracking().get("source_enter_method");
            Pair[] pairArr = new Pair[1];
            DMGroupChatStickerGroupInfo groupInfo = dMGroupChatStickerModel.getGroupInfo();
            String str3 = "";
            if (groupInfo == null || (etGroupType = groupInfo.getEtGroupType()) == null) {
                etGroupType = "";
            }
            pairArr[0] = new Pair("a:et_group_type", etGroupType);
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            DMGroupChatStickerGroupInfo groupInfo2 = dMGroupChatStickerModel.getGroupInfo();
            if (groupInfo2 != null && (groupOwnerAccountType = groupInfo2.getGroupOwnerAccountType()) != null) {
                mapLJIIJ.put("group_owner_account_type", groupOwnerAccountType);
            }
            mapLJIIJ.put("invite_event", "publish");
            mapLJIIJ.put("invite_enter_from", "chat");
            if (str2 != null && str2.length() != 0) {
                mapLJIIJ.put("invite_enter_method", str2);
            }
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C455460HtY(c705930RmZ, null), 3);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onClickGroupChatSticker, groupStatus: ");
            DMGroupChatStickerGroupInfo groupInfo3 = dMGroupChatStickerModel.getGroupInfo();
            if (groupInfo3 != null) {
                groupStatus = groupInfo3.getGroupStatus();
            } else {
                groupStatus = null;
            }
            sbLIZ.append(groupStatus);
            C2188811AlT.LIZIZ(sbLIZ);
            C1229970i71 c1229970i71 = EnumC1229960i70.Companion;
            DMGroupChatStickerGroupInfo groupInfo4 = dMGroupChatStickerModel.getGroupInfo();
            if (groupInfo4 != null && (groupStatus2 = groupInfo4.getGroupStatus()) != null) {
                value = groupStatus2.intValue();
            } else {
                value = EnumC1229960i70.UNKNOWN.getValue();
            }
            c1229970i71.getClass();
            EnumC1229960i70 enumC1229960i70LIZ = C1229970i71.LIZ(value);
            C1231470i9R c1231470i9RLIZIZ = C1618506Vj.LIZIZ(IMGroupChatApi.LIZIZ, "ci", "story_sticker");
            EnumC1230500i7s enumC1230500i7s = EnumC1230500i7s.JOIN_CLICK_STORY_STICKER;
            if (c705930RmZ == null || (c0r60 = c705930RmZ.LJIIZILJ) == null || (str = c0r60.LIZ) == null) {
                str = "";
            }
            boolean z = false;
            C1229500i6G c1229500i6G = new C1229500i6G(2, 0, 112, str, "click_sticker", (String) null, false);
            DMGroupChatStickerGroupInfo groupInfo5 = dMGroupChatStickerModel.getGroupInfo();
            if (groupInfo5 != null && (conversationShortId = groupInfo5.getConversationShortId()) != null && (string = conversationShortId.toString()) != null) {
                str3 = string;
            }
            if (enumC1229960i70LIZ != EnumC1229960i70.REQUEST_PENDING_APPROVAL) {
                z = true;
            }
            c1231470i9RLIZIZ.LIZIZ(context, new C1230080i7C(enumC1230500i7s, enumC1229960i70LIZ, c1229500i6G, str3, mapLJIIJ, false, null, z, new InterfaceC1229620i6S() { // from class: X.0OeR
                @Override // X.InterfaceC1229620i6S
                public final void LIZ(C0YMW c0ymw) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onJoinFailed, error:");
                    sbLIZ2.append(c0ymw);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1239510iMP c1239510iMP = C1239510iMP.LIZ;
                    C705930RmZ c705930RmZ2 = c705930RmZ;
                    c1239510iMP.getClass();
                    C1DFH c1dfh2 = C0PEM.LIZ;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C455450HtX(c705930RmZ2, null), 3);
                }

                @Override // X.InterfaceC1229620i6S
                public final void LIZIZ(String str4) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onJoinSuccess, convId: ");
                    sbLIZ2.append(str4);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1239510iMP c1239510iMP = C1239510iMP.LIZ;
                    final C705930RmZ c705930RmZ2 = c705930RmZ;
                    c1239510iMP.getClass();
                    IIMChatRoomOpenService iIMChatRoomOpenService = (IIMChatRoomOpenService) PluggableExtentionKt.pluggableSpi$default(IIMChatRoomOpenService.class, false, false, false, 14, null);
                    if (iIMChatRoomOpenService != null) {
                        iIMChatRoomOpenService.LIZLLL(new InterfaceC624460OeS() { // from class: X.0OeQ
                            @Override // X.InterfaceC624460OeS
                            public void onEvent(C624430OeP c624430OeP) {
                                if (c624430OeP.LIZ == 2) {
                                    C1239510iMP c1239510iMP2 = C1239510iMP.LIZ;
                                    C705930RmZ c705930RmZ3 = c705930RmZ2;
                                    c1239510iMP2.getClass();
                                    C1DFH c1dfh2 = C0PEM.LIZ;
                                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C455450HtX(c705930RmZ3, null), 3);
                                    IIMChatRoomOpenService iIMChatRoomOpenService2 = (IIMChatRoomOpenService) PluggableExtentionKt.pluggableSpi$default(IIMChatRoomOpenService.class, false, false, false, 14, null);
                                    if (iIMChatRoomOpenService2 != null) {
                                        iIMChatRoomOpenService2.LJ(this);
                                    }
                                }
                            }
                        });
                    }
                }

                public final void LIZLLL(EnumC1229960i70 enumC1229960i70) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onUpdateStatus, status: ");
                    sbLIZ2.append(enumC1229960i70.getValue());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    Function1<EnumC1229960i70, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(enumC1229960i70);
                    }
                }

                @Override // X.InterfaceC1229620i6S
                public final void LIZJ(EnumC1229960i70 enumC1229960i70, PopupDisplayMeta popupDisplayMeta) {
                    LIZLLL(enumC1229960i70);
                }
            }, 64), null);
        }
        C1239520iMQ.LIZ("group_chat_sticker_click", dMGroupChatStickerModel, c705930RmZ);
    }
}
