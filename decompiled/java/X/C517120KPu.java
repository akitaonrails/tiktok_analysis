package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubCapsuleNotFilterSceneSetting;
import com.bytedance.android.livesdk.livesetting.subscription.SubscribeGoalsLynxUrlSetting;
import com.bytedance.android.livesdk.model.message.CapsuleBizParams;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsAnchorPinPerk;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import webcast.api.sub.SubPinRequest;
import webcast.api.sub.SubPinResponse;

/* JADX INFO: renamed from: X.0KPu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517120KPu implements InterfaceC1112400f3O {
    @Override // X.InterfaceC1112400f3O
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LIZIZ(CapsuleMessage capsuleMessage, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJII(C1112330f3H c1112330f3H, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIJJI(C1112330f3H c1112330f3H) {
        return false;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJIIZILJ() {
        return 0;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIJ(C1112330f3H c1112330f3H, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIL(C1112330f3H c1112330f3H) {
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIFFI(C1112330f3H c1112330f3H, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJJIIZI(CapsuleMessage capsuleMessage) {
        return -1;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIJIIJI() {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJJIJL(CapsuleMessage capsuleMessage) {
        return -1;
    }

    @Override // X.InterfaceC1112400f3O
    public final LiveCapsuleStyleItemConfig LJI() {
        return C952230at3.LIZ();
    }

    public static EnumC517130KPv LIZJ(C1112330f3H c1112330f3H) {
        EnumC517130KPv enumC517130KPv;
        if (!Intrinsics.LJFF("notice_viewer_new_goal", ((CapsuleMessage) c1112330f3H.LJIL).scene) && !Intrinsics.LJFF("notice_anchor_reset_goal", ((CapsuleMessage) c1112330f3H.LJIL).scene)) {
            if (Intrinsics.LJFF("sub_anchor_pin_perk", ((CapsuleMessage) c1112330f3H.LJIL).scene)) {
                return EnumC517130KPv.PIN;
            }
            C0KQ1 c0kq1 = c1112330f3H.LJJIIJZLJL;
            if (c0kq1 != null && (enumC517130KPv = c0kq1.LIZ) != null) {
                return enumC517130KPv;
            }
            return EnumC517130KPv.SUBSCRIBE;
        }
        return EnumC517130KPv.SUPPORT;
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIIIZZ(C1112330f3H c1112330f3H) {
        return C952230at3.LIZJ();
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIIZ(C1112330f3H c1112330f3H) throws JSONException {
        String str;
        String string;
        String string2;
        boolean z;
        String str2;
        long j;
        Room roomLJJLIIIIJ;
        User owner;
        String secUid;
        CapsuleBizParamsAnchorPinPerk capsuleBizParamsAnchorPinPerk;
        CapsuleBizParamsAnchorPinPerk capsuleBizParamsAnchorPinPerk2;
        CapsuleBizParamsAnchorPinPerk capsuleBizParamsAnchorPinPerk3;
        CapsuleBizParamsAnchorPinPerk capsuleBizParamsAnchorPinPerk4;
        String str3;
        CapsuleBizParamsAnchorPinPerk capsuleBizParamsAnchorPinPerk5;
        Integer num;
        C1109770ez9 c1109770ez9LLIIIILZ = c1112330f3H.LLIIIILZ();
        String str4 = "sub_capsule";
        C510380Jzw.LJIJJ("sub_capsule");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AnonymousClass0101 anonymousClass0101LIZ = null;
        Boolean boolValueOf = null;
        if (c1112330f3H.LJIL.isLocalInsertMsg) {
            linkedHashMap.put("extra_dict", null);
        }
        Room room = c1109770ez9LLIIIILZ.LJII;
        if (room != null) {
            if (!Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "unaccess_after_update") && !Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "unfinished_on_boarding")) {
                if (C500260Jjc.LJJIIZ(((CapsuleMessage) c1112330f3H.LJIL).schema)) {
                    if (LIZJ(c1112330f3H) == EnumC517130KPv.SUPPORT) {
                        str4 = "sub_goal_capsule";
                    }
                    CapsuleMessage capsuleMessage = (CapsuleMessage) c1112330f3H.LJIL;
                    String str5 = capsuleMessage.schema;
                    if (!Intrinsics.LJFF(capsuleMessage.scene, "sub_gift_tiktok2user_notice") && !Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "sub_gift_tiktok2anchor_notice") && !Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "sub_gift_anchor_remaining_present_notice")) {
                        Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "live_sub_only_use_music");
                    } else {
                        str4 = "sub_gift_capsule";
                    }
                    if (str5 != null) {
                        C0K8F c0k8f = C0K8F.LIZ;
                        Context context = c1109770ez9LLIIIILZ.LIZ;
                        c0k8f.getClass();
                        C0K8F.LJI(context, room, str5, str4);
                    }
                } else {
                    int i = 0;
                    if (LIZJ(c1112330f3H) == EnumC517130KPv.SUBSCRIBE) {
                        SubscribeInfo subscribeInfo = room.getOwner().getSubscribeInfo();
                        if (subscribeInfo != null) {
                            boolValueOf = Boolean.valueOf(subscribeInfo.isSubscribed());
                        }
                        if (!C500260Jjc.LJJJI(boolValueOf)) {
                            C494790Jan c494790JanW2 = ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
                            Context contextLJII = C497740JfY.LJII();
                            DataChannel dataChannel = c1109770ez9LLIIIILZ.LJIIIZ;
                            if (dataChannel != null && (num = (Integer) dataChannel.gg0(C0TZI.class)) != null && num.intValue() > 0) {
                                str4 = "activity_anchor_list";
                            }
                            c494790JanW2.LIZJ(contextLJII, room, str4, linkedHashMap, null, null, 0L, true, 0L, 0L, AFwS193S0000000_7.get$arr$(287), AFwS193S0000000_7.get$arr$(288), "");
                            return true;
                        }
                        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
                        C494790Jan.LJIIJJI(C497740JfY.LJII(), room, "sub_capsule", linkedHashMap);
                        return true;
                    }
                    if (LIZJ(c1112330f3H) == EnumC517130KPv.EXTEND) {
                        ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
                        C494790Jan.LJIIJJI(C497740JfY.LJII(), room, "sub_capsule", linkedHashMap);
                        return true;
                    }
                    if (LIZJ(c1112330f3H) == EnumC517130KPv.SUPPORT) {
                        C0K8F c0k8f2 = C0K8F.LIZ;
                        Context contextLJII2 = C497740JfY.LJII();
                        String user_detail_popup = SubscribeGoalsLynxUrlSetting.INSTANCE.getUser_detail_popup();
                        c0k8f2.getClass();
                        C0K8F.LJI(contextLJII2, room, user_detail_popup, "sub_goal_capsule");
                        return true;
                    }
                    if (LIZJ(c1112330f3H) == EnumC517130KPv.MUSIC) {
                        return false;
                    }
                    if (LIZJ(c1112330f3H) == EnumC517130KPv.PIN) {
                        User owner2 = room.getOwner();
                        String str6 = "";
                        if (owner2 == null || (string = Long.valueOf(owner2.getId()).toString()) == null) {
                            string = "";
                        }
                        CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                        if (capsuleBizParams == null || (capsuleBizParamsAnchorPinPerk5 = capsuleBizParams.anchorPinPerk) == null || (string2 = Long.valueOf(capsuleBizParamsAnchorPinPerk5.pinId).toString()) == null) {
                            string2 = "";
                        }
                        CapsuleBizParams capsuleBizParams2 = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                        if (capsuleBizParams2 != null && (capsuleBizParamsAnchorPinPerk4 = capsuleBizParams2.anchorPinPerk) != null && (str3 = capsuleBizParamsAnchorPinPerk4.templateId) != null && str3.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        CapsuleBizParams capsuleBizParams3 = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                        if (capsuleBizParams3 == null || (capsuleBizParamsAnchorPinPerk3 = capsuleBizParams3.anchorPinPerk) == null || (str2 = capsuleBizParamsAnchorPinPerk3.templateId) == null) {
                            str2 = "";
                        }
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_subscription_pincard_guidance_click");
                        c474500IjALIZ.LJIL();
                        c474500IjALIZ.LJJII(string, "anchor_id");
                        c474500IjALIZ.LJJII("anchor", "user_type");
                        c474500IjALIZ.LJJII(string2, "perk_id");
                        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_template");
                        c474500IjALIZ.LJJII(str2, "template_id");
                        c474500IjALIZ.LIZ();
                        DataChannel dataChannel2 = c1112330f3H.LLIIIILZ().LJIIIZ;
                        if (dataChannel2 != null) {
                            C2660011e c2660011e = (C2660011e) dataChannel2.gg0(C770500UKi.class);
                            if (c2660011e != null) {
                                anonymousClass0101LIZ = c2660011e.LIZ(InterfaceC509740Jyu.class);
                            }
                            InterfaceC509740Jyu interfaceC509740Jyu = (InterfaceC509740Jyu) anonymousClass0101LIZ;
                            if (interfaceC509740Jyu != null) {
                                SubPinRequest subPinRequest = new SubPinRequest();
                                subPinRequest.roomId = c1112330f3H.LLIIIILZ().LJIIZILJ;
                                CapsuleBizParams capsuleBizParams4 = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                                if (capsuleBizParams4 != null && (capsuleBizParamsAnchorPinPerk2 = capsuleBizParams4.anchorPinPerk) != null) {
                                    j = capsuleBizParamsAnchorPinPerk2.pinId;
                                } else {
                                    j = 0;
                                }
                                subPinRequest.pinId = j;
                                if (capsuleBizParams4 != null && (capsuleBizParamsAnchorPinPerk = capsuleBizParams4.anchorPinPerk) != null) {
                                    i = capsuleBizParamsAnchorPinPerk.pinCardType;
                                }
                                subPinRequest.type = i;
                                DataChannel dataChannel3 = c1112330f3H.LLIIIILZ().LJIIIZ;
                                if (dataChannel3 != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel3)) != null && (owner = roomLJJLIIIIJ.getOwner()) != null && (secUid = owner.getSecUid()) != null) {
                                    str6 = secUid;
                                }
                                subPinRequest.secAnchorId = str6;
                                C512750K8z<SubPinResponse> c512750K8z = new C512750K8z<>();
                                c512750K8z.LIZ = new C517160KPy();
                                c512750K8z.LIZIZ = new C517170KPz();
                                interfaceC509740Jyu.LIZLLL(subPinRequest, c512750K8z);
                                return true;
                            }
                        }
                    }
                }
            } else {
                ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
                Context contextLJII3 = C497740JfY.LJII();
                if (Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "unaccess_after_update")) {
                    str = "sub_new_benefit_capsule";
                } else {
                    str = "sub_benefit_capsule";
                }
                C494790Jan.LJIIJJI(contextLJII3, room, str, null);
                return true;
            }
        }
        return true;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIIJ(C1112330f3H c1112330f3H) {
        String string;
        String string2;
        boolean z;
        CapsuleBizParamsAnchorPinPerk capsuleBizParamsAnchorPinPerk;
        String str;
        CapsuleBizParamsAnchorPinPerk capsuleBizParamsAnchorPinPerk2;
        String str2;
        CapsuleBizParamsAnchorPinPerk capsuleBizParamsAnchorPinPerk3;
        User owner;
        Object objValueOf;
        C510380Jzw.LJIJJLI("sub_capsule");
        if (Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "live_sub_only_use_music")) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_only_live_music_guide_capsule_show");
            c474500IjALIZ.LJIL();
            Room room = c1112330f3H.LLIIIILZ().LJII;
            Object objValueOf2 = null;
            if (room != null) {
                objValueOf = Long.valueOf(room.getOwnerUserId());
            } else {
                objValueOf = null;
            }
            c474500IjALIZ.LJJII(objValueOf, "anchor_id");
            Room room2 = c1112330f3H.LLIIIILZ().LJII;
            if (room2 != null) {
                objValueOf2 = Long.valueOf(room2.getId());
            }
            c474500IjALIZ.LJJII(objValueOf2, "room_id");
            c474500IjALIZ.LIZ();
            return;
        }
        if (!Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "sub_anchor_pin_perk")) {
            return;
        }
        Room room3 = c1112330f3H.LLIIIILZ().LJII;
        String str3 = "";
        if (room3 == null || (owner = room3.getOwner()) == null || (string = Long.valueOf(owner.getId()).toString()) == null) {
            string = "";
        }
        CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
        if (capsuleBizParams == null || (capsuleBizParamsAnchorPinPerk3 = capsuleBizParams.anchorPinPerk) == null || (string2 = Long.valueOf(capsuleBizParamsAnchorPinPerk3.pinId).toString()) == null) {
            string2 = "";
        }
        CapsuleBizParams capsuleBizParams2 = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
        if (capsuleBizParams2 != null && (capsuleBizParamsAnchorPinPerk2 = capsuleBizParams2.anchorPinPerk) != null && (str2 = capsuleBizParamsAnchorPinPerk2.templateId) != null && str2.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        CapsuleBizParams capsuleBizParams3 = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
        if (capsuleBizParams3 != null && (capsuleBizParamsAnchorPinPerk = capsuleBizParams3.anchorPinPerk) != null && (str = capsuleBizParamsAnchorPinPerk.templateId) != null) {
            str3 = str;
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_anchor_subscription_pincard_guidance_show");
        c474500IjALIZ2.LJIL();
        c474500IjALIZ2.LJJII(string, "anchor_id");
        c474500IjALIZ2.LJJII("anchor", "user_type");
        c474500IjALIZ2.LJJII(string2, "perk_id");
        c474500IjALIZ2.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_template");
        c474500IjALIZ2.LJJII(str3, "template_id");
        c474500IjALIZ2.LIZ();
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJJIIZ(C1112330f3H c1112330f3H) {
        return C952230at3.LIZIZ(c1112330f3H);
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJJIJIL(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage) {
        if (!C1114740f7A.LIZ(c1109770ez9.LJI)) {
            return true;
        }
        if (C500260Jjc.LJJIFFI(Boolean.valueOf(c1109770ez9.LJI))) {
            String str = capsuleMessage.scene;
            for (String str2 : LiveSubCapsuleNotFilterSceneSetting.getValue()) {
                if (!str2.equals(str)) {
                }
            }
            return true;
        }
        return false;
    }
}
