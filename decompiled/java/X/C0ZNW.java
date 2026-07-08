package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.FallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.IconTypeComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMMediaThumbnailBridgeApi;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AddToFavorites;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ErrorIcon;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ForwardOrReply;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.LoadingIcon;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.MessageLeftIconState;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.NoButton;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.OpenGreetingCard;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.QuickLiveReact;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ReplyToSticker;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.VoiceTranscribeIcon;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.VoiceTranscribeText;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZNW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZNW {
    public static final C0IB0 LIZ(C0IB0 c0ib0) {
        return C0IB0.LIZ(c0ib0, C0ZOV.LIZ(c0ib0.LIZIZ, C898860ZOa.LIZ(c0ib0.LIZIZ.LIZJ, false, false, 6)), null, 5);
    }

    public static final C0IB0 LIZIZ(C0IB0 c0ib0, InterfaceC898720ZNm interfaceC898720ZNm) {
        C461020I6a<? extends Object> c461020I6a = c0ib0.LIZJ.get(C462510IBt.LIZ);
        if (c461020I6a == null || !c461020I6a.LIZIZ) {
            return c0ib0;
        }
        T t = c461020I6a.LIZ;
        if ((t instanceof MessageLeftIconState) && t != 0) {
            MessageLeftIconState messageLeftIconState = ErrorIcon.INSTANCE;
            if (Intrinsics.LJFF(t, messageLeftIconState)) {
                if (interfaceC898720ZNm instanceof C898600ZNa) {
                    messageLeftIconState = NoButton.INSTANCE;
                }
            } else {
                messageLeftIconState = LoadingIcon.INSTANCE;
                if (!Intrinsics.LJFF(t, messageLeftIconState)) {
                    messageLeftIconState = NoButton.INSTANCE;
                    if (!Intrinsics.LJFF(t, messageLeftIconState) && !Intrinsics.LJFF(t, ForwardOrReply.INSTANCE) && !Intrinsics.LJFF(t, ReplyToSticker.INSTANCE) && !Intrinsics.LJFF(t, QuickLiveReact.INSTANCE) && !Intrinsics.LJFF(t, VoiceTranscribeText.INSTANCE) && !Intrinsics.LJFF(t, VoiceTranscribeIcon.INSTANCE) && !Intrinsics.LJFF(t, OpenGreetingCard.INSTANCE) && !Intrinsics.LJFF(t, AddToFavorites.INSTANCE)) {
                        throw new C1954807lC();
                    }
                }
            }
            return C0IB1.LIZIZ(c0ib0, messageLeftIconState, true);
        }
        return c0ib0;
    }

    public static final void LIZJ(SessionInfo sessionInfo, C0ZNK c0znk) {
        String strLJ;
        String strLIZIZ;
        String scene;
        int iHashCode;
        IconTypeComponent iconTypeComponent;
        FallbackInfoComponent fallbackInfoComponent;
        ImageComponent imageComponent;
        String strLJ2;
        if (sessionInfo == null) {
            return;
        }
        InterfaceC898720ZNm reason = c0znk.getReason();
        C0ZNN c0znn = C0ZNN.LIZ;
        String str = "";
        if (!Intrinsics.LJFF(reason, c0znn) && !Intrinsics.LJFF(reason, C0ZNR.LIZ)) {
            if (reason instanceof C0ZN0) {
                C898590ZMz c898590ZMz = C898590ZMz.LIZ;
                C869590Y9l c869590Y9l = c0znk.LLILII().LIZ.LIZ;
                C0ZN0 c0zn0 = (C0ZN0) reason;
                String awemeId = c0zn0.getAwemeId();
                String authorId = c0zn0.getAuthorId();
                long sender = c0znk.LLILII().LIZ.LIZ.getSender();
                c898590ZMz.getClass();
                C898590ZMz.LIZIZ(sessionInfo, c869590Y9l, awemeId, authorId, sender, c0zn0, "show");
            } else if (reason instanceof C0ZNU) {
                if (C1693106k5.LIZJ()) {
                    C869590Y9l c869590Y9l2 = c0znk.LLILII().LIZ.LIZ;
                    IMMediaThumbnailBridgeApi.LIZ.getClass();
                    IMMediaThumbnailBridgeApi iMMediaThumbnailBridgeApiLIZ = C0ZN8.LIZ();
                    if (iMMediaThumbnailBridgeApiLIZ == null || (strLJ2 = iMMediaThumbnailBridgeApiLIZ.LJ(c0znk.LLILII().LIZ.LIZ)) == null) {
                        strLJ2 = "";
                    }
                    C891990Yyz.LIZLLL(c869590Y9l2, sessionInfo, strLJ2);
                }
            } else if (reason instanceof C0ZNZ) {
                C869590Y9l c869590Y9l3 = c0znk.LLILII().LIZ.LIZ;
                int i = C0ZDX.LIZJ;
                if (2000 == c869590Y9l3.getMsgType() && (scene = c869590Y9l3.getScene()) != null && ((iHashCode = scene.hashCode()) == 305524883 ? scene.equals("minis_share_card") : iHashCode == 1961480820 ? scene.equals("minis_episodes_share_card") : !(iHashCode != 2020784794 || !scene.equals("minis_game_share_card")))) {
                    IconTypeComponent iconTypeComponent2 = IconTypeComponent.MODERATION;
                    DynamicCardTemplate dynamicCardTemplate = (DynamicCardTemplate) C0Z2Z.LIZ(c869590Y9l3, DynamicCardTemplate.class);
                    if (dynamicCardTemplate != null && (fallbackInfoComponent = dynamicCardTemplate.fallbackInfo) != null && (imageComponent = fallbackInfoComponent.imageComponent) != null) {
                        iconTypeComponent = imageComponent.iconType;
                    } else {
                        iconTypeComponent = null;
                    }
                    if (iconTypeComponent2.equals(iconTypeComponent)) {
                        C898590ZMz c898590ZMz2 = C898590ZMz.LIZ;
                        C0ZNZ c0znz = (C0ZNZ) reason;
                        Map<String, String> map = c0znz.LIZJ;
                        String str2 = c0znz.LIZ;
                        c898590ZMz2.getClass();
                        if (map != null && !map.isEmpty() && str2 != null) {
                            C0I0B.LJFF.LIZIZ();
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            String str3 = map.get("minis_id");
                            if (str3 == null) {
                                str3 = "";
                            }
                            linkedHashMap.put("minis_id", str3);
                            String str4 = map.get("minis_type");
                            if (str4 == null) {
                                str4 = "";
                            }
                            linkedHashMap.put("minis_type", str4);
                            String str5 = map.get("collection_id");
                            if (str5 == null) {
                                str5 = "";
                            }
                            linkedHashMap.put("collection_id", str5);
                            String str6 = map.get("abnormal_reason");
                            if (str6 == null) {
                                str6 = "";
                            }
                            linkedHashMap.put("abnormal_reason", str6);
                            C20684815ws.LJIILLIIL("dm_dynamic_card_abnormal_msg_show", linkedHashMap);
                        }
                    }
                }
            }
        } else {
            C869590Y9l c869590Y9l4 = c0znk.LLILII().LIZ.LIZ;
            IMMediaThumbnailBridgeApi.LIZ.getClass();
            IMMediaThumbnailBridgeApi iMMediaThumbnailBridgeApiLIZ2 = C0ZN8.LIZ();
            if (iMMediaThumbnailBridgeApiLIZ2 == null || (strLJ = iMMediaThumbnailBridgeApiLIZ2.LJ(c0znk.LLILII().LIZ.LIZ)) == null) {
                strLJ = "";
            }
            C891990Yyz.LIZLLL(c869590Y9l4, sessionInfo, strLJ);
        }
        C898590ZMz c898590ZMz3 = C898590ZMz.LIZ;
        String enterFromForMob = sessionInfo.getEnterFromForMob();
        String enterMethod = sessionInfo.getEnterMethod();
        int chatType = sessionInfo.getChatType();
        long sender2 = c0znk.LLILII().LIZ.LIZ.getSender();
        int msgType = c0znk.LLILII().LIZ.LIZ.getMsgType();
        InterfaceC898720ZNm reason2 = c0znk.getReason();
        final InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c898590ZMz3.getClass();
        final C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", enterFromForMob);
        c830490Whz.put("enter_method", enterMethod);
        c830490Whz.put("chat_type", C1677606ha.LIZ(chatType));
        if (reason2 instanceof C0ZNI) {
            strLIZIZ = "dm_camera_expired";
        } else if (Intrinsics.LJFF(reason2, C0ZNU.LIZ)) {
            strLIZIZ = "nude_filter";
        } else if (reason2 instanceof C0ZNF) {
            strLIZIZ = "dm_camera_unavailable";
        } else if (reason2 instanceof C0ZNH) {
            strLIZIZ = "dm_camera_unavailable_group_banned";
        } else if (reason2 instanceof C0ZNJ) {
            strLIZIZ = "hide_camera_msg_in_group";
        } else if (Intrinsics.LJFF(reason2, c0znn)) {
            strLIZIZ = "sensitive_keyword";
        } else if (Intrinsics.LJFF(reason2, C0ZNR.LIZ)) {
            strLIZIZ = "negativity_filter";
        } else if (Intrinsics.LJFF(reason2, C0ZNQ.LIZ)) {
            strLIZIZ = "dm_camera_unavailable_no_reason";
        } else if (reason2 instanceof C0ZNG) {
            strLIZIZ = "comment_unavailable";
        } else if (Intrinsics.LJFF(reason2, C0ZNS.LIZ)) {
            strLIZIZ = "sticker";
        } else if (Intrinsics.LJFF(reason2, C898690ZNj.LIZ)) {
            strLIZIZ = "unsupported";
        } else if (reason2 instanceof C0ZN3) {
            strLIZIZ = "comment";
        } else if (reason2 instanceof C0ZN2) {
            strLIZIZ = "comment_no_user";
        } else if (reason2 instanceof C0ZN4) {
            strLIZIZ = "aweme_card_friends_only";
        } else if (reason2 instanceof C0ZN5) {
            strLIZIZ = "aweme_card_post_unavailable";
        } else if (reason2 instanceof C0ZND) {
            strLIZIZ = "aweme_card_story_expired";
        } else if (reason2 instanceof C0ZNE) {
            strLIZIZ = "aweme_card_story_unavailable";
        } else if (reason2 instanceof C0ZN1) {
            strLIZIZ = "aweme_card_no_user";
        } else if (Intrinsics.LJFF(reason2, C0ZNM.LIZ)) {
            strLIZIZ = "violation";
        } else if (Intrinsics.LJFF(reason2, C0ZNO.LIZ)) {
            strLIZIZ = "geoblock";
        } else if (reason2 instanceof C0ZNA) {
            strLIZIZ = "voice_message_receiver_expired";
        } else if (Intrinsics.LJFF(reason2, C898700ZNk.LIZ)) {
            strLIZIZ = "voice_message_sender_expired";
        } else if (Intrinsics.LJFF(reason2, C898710ZNl.LIZ)) {
            strLIZIZ = "voice_message_sensitive";
        } else if (reason2 instanceof C0ZNZ) {
            strLIZIZ = ((C0ZNZ) reason2).LIZIZ;
            if (strLIZIZ == null) {
                strLIZIZ = "dynamic_card_unavailable";
            }
        } else if (reason2 instanceof C0ZNB) {
            strLIZIZ = "";
        } else if (reason2 instanceof C0ZNL) {
            strLIZIZ = ((C0ZNL) reason2).LIZIZ();
        } else if (reason2 instanceof C898600ZNa) {
            strLIZIZ = ((C898600ZNa) reason2).LIZIZ;
        } else if (reason2 instanceof C0ZNC) {
            strLIZIZ = ((C0ZNC) reason2).LIZIZ;
            if (strLIZIZ == null) {
                strLIZIZ = "business_card_unavailable";
            }
        } else if (Intrinsics.LJFF(reason2, C0ZNP.LIZ)) {
            strLIZIZ = "lite_legacy_aweme_loading";
        } else {
            throw new C1954807lC();
        }
        c830490Whz.put("unavailable_reason", strLIZIZ);
        c830490Whz.put("message_type", String.valueOf(msgType));
        IMContactApi.LIZ.getClass();
        IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(String.valueOf(sender2), null, "im_local_db");
        IIMContactUtilService.LIZ.getClass();
        IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
        if (iIMContactUtilServiceLIZ != null && iIMContactUtilServiceLIZ.LJIIIZ(iMUserLJIIL)) {
            c830490Whz.put("follow_type", str);
        } else {
            if (iMUserLJIIL != null && iMUserLJIIL.getFollowStatus() == 2) {
                str = "muf";
            } else if (C1336205Ku.LIZ(false).getImMafService().LIZJ(String.valueOf(sender2))) {
                str = "maf";
            }
            c830490Whz.put("follow_type", str);
        }
        if (chatType == 3) {
            c830490Whz.put("relation_tag", "null");
            C20684815ws.LJIILLIIL("unavailable_card_show", c830490Whz);
        } else {
            C069P.LIZ().LJ().LIZJ(new InterfaceC1480505qt() { // from class: X.05uE
                @Override // X.InterfaceC1480505qt
                public final void LIZ(Throwable th) {
                }

                @Override // X.InterfaceC1480505qt
                public final void LIZJ() {
                }

                @Override // X.InterfaceC1480505qt
                public final void LIZIZ(IMUser iMUser) {
                    c830490Whz.put("relation_tag", String.valueOf(iMUser.getFollowStatus()));
                    interfaceC1493505szLIZIZ.sendEvent("unavailable_card_show", c830490Whz);
                }
            }, String.valueOf(sender2), null, "im_chat_unavailable_card", false);
        }
    }
}
