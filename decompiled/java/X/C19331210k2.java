package X;

import android.content.ComponentCallbacks2;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10k2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19331210k2 {
    public static final C19331210k2 LIZ = new C19331210k2();

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.feed.model.Aweme LIZIZ() {
        /*
            java.lang.String r3 = X.C2211631BhB.LJII()
            android.app.Activity r2 = X.C2214201BlK.LJFF()
            if (r2 == 0) goto L3d
            if (r3 == 0) goto L3d
            java.lang.String r0 = "b2878"
            r1 = 0
            boolean r0 = kotlin.text.a0.LJJIIZI(r3, r0, r1)
            if (r0 == 0) goto L22
            android.content.Intent r1 = r2.getIntent()
            if (r1 == 0) goto L3d
            java.lang.String r0 = "id"
            java.lang.String r2 = r1.getStringExtra(r0)     // Catch: java.lang.Exception -> L39
            goto L3e
        L22:
            java.lang.String r0 = "b2001"
            boolean r0 = kotlin.text.a0.LJJIIZI(r3, r0, r1)
            if (r0 == 0) goto L3d
            X.19EG r2 = (X.C19EG) r2
            com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel r0 = X.C680080Qly.LIZIZ(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LLJILJILJ
            if (r0 == 0) goto L3d
            java.lang.String r2 = r0.getAid()
            goto L3e
        L39:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3d:
            r2 = 0
        L3e:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r0 = com.ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LLILZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19331210k2.LIZIZ():com.ss.android.ugc.aweme.feed.model.Aweme");
    }

    public static String LIZLLL() {
        InterfaceC1603190roz interfaceC1603190roz;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        Object obj = abstractC1387200mCcLIZIZ != null ? abstractC1387200mCcLIZIZ.LIZ : null;
        if ((obj instanceof InterfaceC1603190roz) && (interfaceC1603190roz = (InterfaceC1603190roz) obj) != null) {
            return interfaceC1603190roz.getEnterFrom();
        }
        ComponentCallbacks2 componentCallbacks2LJFF = C2214201BlK.LJFF();
        if (componentCallbacks2LJFF instanceof InterfaceC1603190roz) {
            return ((InterfaceC1603190roz) componentCallbacks2LJFF).getEnterFrom();
        }
        if (C1835007Gq.LIZ() && (componentCallbacks2LJFF instanceof C199Y)) {
            InterfaceC214902198i interfaceC214902198iLJIILLIIL = SAFExtensionKt.LJIILLIIL((C19EG) componentCallbacks2LJFF);
            if (interfaceC214902198iLJIILLIIL instanceof InterfaceC1581830rGX) {
                return ((InterfaceC1581830rGX) interfaceC214902198iLJIILLIIL).getPageName();
            }
        }
        if (componentCallbacks2LJFF instanceof InterfaceC1581830rGX) {
            return ((InterfaceC1581830rGX) componentCallbacks2LJFF).getPageName();
        }
        if (!(componentCallbacks2LJFF instanceof ActivityC21503719Dn)) {
            return "";
        }
        C128Y powerAttachRootFragment = ((ActivityC21503719Dn) componentCallbacks2LJFF).getPowerAttachRootFragment();
        return powerAttachRootFragment instanceof InterfaceC1581830rGX ? ((InterfaceC1581830rGX) powerAttachRootFragment).getPageName() : "";
    }

    public static String LIZ(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "is_success");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            return "";
        }
        if (Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, CardStruct.IStatusCode.DEFAULT)) {
            return "click_push_i_to_v_success";
        }
        return "click_push_i_to_v_fail";
    }

    public static String LIZJ(InnerPushMessage innerPushMessage) {
        int type = innerPushMessage.getType();
        if (type != 32 && type != 1004) {
            if (type != 1012 && type != 2452) {
                if (type == 2515) {
                    return "Creation";
                }
                switch (type) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case BdTuring.TYPE_ECAF /* 9 */:
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        return "Social";
                    default:
                        switch (type) {
                            case 22:
                            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                return "Live";
                            case 23:
                                return "UG";
                            case 25:
                            case 26:
                                return "Social";
                            case 27:
                                return "DM";
                            default:
                                switch (type) {
                                    case 100:
                                        return "Monetization";
                                    case 101:
                                        return "PnS";
                                    case 102:
                                        return "Live";
                                    default:
                                        switch (type) {
                                            case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                                            case 1002:
                                                return "Creator_tool";
                                            case 1001:
                                                return "Product";
                                            default:
                                                return "";
                                        }
                                }
                        }
                }
            }
            return "Social";
        }
        return "DM";
    }

    public static String LJ(InnerPushMessage innerPushMessage) {
        if (innerPushMessage.getType() != 21 && innerPushMessage.getFrom() == EnumC19331110k1.FROM_LOCAL) {
            String label = innerPushMessage.getLabel();
            if (label == null) {
                return "";
            }
            return label;
        }
        int type = innerPushMessage.getType();
        if (type != 21) {
            if (type != 22) {
                if (type != 24) {
                    if (type != 25) {
                        if (type != 27) {
                            if (type != 32) {
                                switch (type) {
                                    case 1:
                                        return "SOCIAL_INAPP_PUSH_LIKE_VIDEO";
                                    case 2:
                                        return "SOCIAL_INAPP_PUSH_LIKE_STORY";
                                    case 3:
                                        return "SOCIAL_INAPP_PUSH_COMMENT";
                                    case 4:
                                        return "SOCIAL_INAPP_PUSH_COMMENT_REPLY";
                                    case 5:
                                        return "SOCIAL_INAPP_PUSH_MENTION_IN_VIDEO";
                                    case 6:
                                        return "SOCIAL_INAPP_PUSH_MENTION_IN_COMMENT";
                                    case 7:
                                        return "SOCIAL_INAPP_PUSH_DUET_WITH_ME";
                                    case 8:
                                        return "SOCIAL_INAPP_PUSH_FOLLOW_USER";
                                    case BdTuring.TYPE_ECAF /* 9 */:
                                        return "SOCIAL_INAPP_PUSH_FOLLOW_REQUEST";
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                        return "SOCIAL_INAPP_PUSH_FOLLOW_ACCEPT_REQUEST";
                                    default:
                                        return "";
                                }
                            }
                            return "dm_permissions_receiver_open";
                        }
                        return "inner_im_active_status";
                    }
                    return "now_post";
                }
                return "live_encourage";
            }
            return "live";
        }
        return "click_push_im";
    }

    public static String LJI(InnerPushMessage innerPushMessage) {
        boolean z;
        InnerPushUITemplate uiTemplate;
        String str;
        String str2;
        String str3;
        if (innerPushMessage != null && innerPushMessage.getType() == 108) {
            z = true;
        } else {
            z = false;
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        if (z) {
            InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
            if (uiTemplate2 == null || (str3 = uiTemplate2.globalSchemaUrl) == null) {
                return "";
            }
            LIZ.getClass();
            return LIZ(str3);
        }
        if (innerPushMessage != null) {
            String label = innerPushMessage.getLabel();
            if (label != null && label.length() > 0) {
                return label;
            }
            Integer numValueOf = Integer.valueOf(innerPushMessage.getType());
            if (numValueOf != null) {
                if (numValueOf.intValue() != 1 && numValueOf.intValue() != 2) {
                    if (numValueOf.intValue() == 3) {
                        return "click_push_comment";
                    }
                    if (numValueOf.intValue() == 4) {
                        return "click_push_replycomment";
                    }
                    if (numValueOf.intValue() == 6) {
                        return "click_push_commentat";
                    }
                    if (numValueOf.intValue() == 5) {
                        return "click_push_videoat";
                    }
                    if (numValueOf.intValue() == 8) {
                        return "click_push_follow";
                    }
                    if (numValueOf.intValue() == 9) {
                        return "click_push_follow_request";
                    }
                    if (numValueOf.intValue() == 10) {
                        return "click_push_follow_approve";
                    }
                    if (numValueOf.intValue() == 7) {
                        return "click_push_duet";
                    }
                    if (numValueOf.intValue() == 2452) {
                        return "social_avatar_alive_complete";
                    }
                    if (numValueOf.intValue() == 22) {
                        InnerPushUITemplate uiTemplate3 = innerPushMessage.getUiTemplate();
                        if (uiTemplate3 != null && (str2 = uiTemplate3.globalSchemaUrl) != null) {
                            LIZ.getClass();
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str2), "gd_label");
                            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                                return "unknown";
                            }
                        }
                    } else if (numValueOf.intValue() == 108 && (uiTemplate = innerPushMessage.getUiTemplate()) != null && (str = uiTemplate.globalSchemaUrl) != null) {
                        LIZ.getClass();
                        return LIZ(str);
                    }
                } else {
                    return "click_push_digg";
                }
            }
        }
        return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
    }

    public static void LJIIJJI(InnerPushMessage innerPushMessage) {
        Object c098200Yq;
        String value;
        List<User> list;
        ILiveOuterService iLiveOuterService;
        User user;
        List<User> list2;
        try {
            JSONObject jSONObject = new JSONObject();
            if (innerPushMessage.getRid() > 0) {
                jSONObject.put("rule_id", String.valueOf(innerPushMessage.getRid()));
            }
            EnumC19331110k1 enumC19331110k1 = innerPushMessage.getTracker().LIZ;
            String uid = null;
            if (enumC19331110k1 != null) {
                value = enumC19331110k1.getValue();
            } else {
                value = null;
            }
            jSONObject.put("push_from", value);
            jSONObject.put("push_type", innerPushMessage.getType());
            jSONObject.put("push_id", String.valueOf(innerPushMessage.getId()));
            LIZ.getClass();
            jSONObject.put("push_label", LJI(innerPushMessage));
            jSONObject.put("business_tag", LIZJ(innerPushMessage));
            InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
            if (uiTemplate != null) {
                list = uiTemplate.fromUsers;
            } else {
                list = null;
            }
            if (list != null && !list.isEmpty()) {
                InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
                if (uiTemplate2 != null && (list2 = uiTemplate2.fromUsers) != null) {
                    user = list2.get(0);
                } else {
                    user = null;
                }
                if (user != null) {
                    uid = user.getUid();
                }
                jSONObject.put("from_user_id", uid);
            }
            String mobEventJsonStr = innerPushMessage.getMobEventJsonStr();
            if (mobEventJsonStr != null) {
                LJFF(mobEventJsonStr, jSONObject);
            }
            if (!jSONObject.has("item_type")) {
                jSONObject.put("item_type", LJ(innerPushMessage));
            }
            if (innerPushMessage.getType() == 30) {
                C19329910jp.LIZ.getClass();
                if (C19329910jp.LIZ() && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null) {
                    iLiveOuterService.d3(0, jSONObject);
                }
            }
            C20684815ws.LJIJ("inner_push_receive", jSONObject);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C19331210k2 c19331210k2 = LIZ;
            EnumC19355710nz enumC19355710nz = EnumC19355710nz.MOB_RECEIVE;
            String message = thM5exceptionOrNullimpl.getMessage();
            c19331210k2.getClass();
            LJIIIZ(innerPushMessage, enumC19355710nz, message);
        }
    }

    public static void LJIIL(InnerPushMessage innerPushMessage) {
        Object c098200Yq;
        String authorUid;
        String groupId;
        String value;
        String str;
        List<User> list;
        ILiveOuterService iLiveOuterService;
        User user;
        List<User> list2;
        try {
            JSONObject jSONObject = new JSONObject();
            LIZ.getClass();
            Aweme awemeLIZIZ = LIZIZ();
            jSONObject.put("enter_from", LIZLLL());
            String uid = null;
            if (awemeLIZIZ != null) {
                authorUid = AwemeExtKt.getAuthorUid(awemeLIZIZ);
            } else {
                authorUid = null;
            }
            jSONObject.put("author_id", authorUid);
            if (awemeLIZIZ != null) {
                groupId = awemeLIZIZ.getGroupId();
            } else {
                groupId = null;
            }
            jSONObject.put("group_id", groupId);
            jSONObject.put("push_label", LJI(innerPushMessage));
            EnumC19331110k1 enumC19331110k1 = innerPushMessage.getTracker().LIZ;
            if (enumC19331110k1 != null) {
                value = enumC19331110k1.getValue();
            } else {
                value = null;
            }
            jSONObject.put("push_from", value);
            jSONObject.put("business_tag", LIZJ(innerPushMessage));
            if (innerPushMessage.getRid() > 0) {
                jSONObject.put("rule_id", String.valueOf(innerPushMessage.getRid()));
            }
            jSONObject.put("receive_interval", innerPushMessage.getTracker().LJIJJ);
            jSONObject.put("show_interval", innerPushMessage.getTracker().LJIJJLI);
            if (innerPushMessage.getType() == 1004) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_recommended_chat", str);
            if (C19331310k3.LJIIJJI(innerPushMessage)) {
                jSONObject.put("if_nudge", "1");
            }
            InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
            if (uiTemplate != null) {
                list = uiTemplate.fromUsers;
            } else {
                list = null;
            }
            if (list != null && !list.isEmpty()) {
                InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
                if (uiTemplate2 != null && (list2 = uiTemplate2.fromUsers) != null) {
                    user = list2.get(0);
                } else {
                    user = null;
                }
                if (user != null) {
                    uid = user.getUid();
                }
                jSONObject.put("from_user_id", uid);
            }
            String mobEventJsonStr = innerPushMessage.getMobEventJsonStr();
            if (mobEventJsonStr != null) {
                LJFF(mobEventJsonStr, jSONObject);
            }
            if (!jSONObject.has("item_type")) {
                jSONObject.put("item_type", LJ(innerPushMessage));
            }
            if (innerPushMessage.getType() == 30) {
                C19329910jp.LIZ.getClass();
                if (C19329910jp.LIZ() && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null) {
                    iLiveOuterService.d3(1, jSONObject);
                }
            }
            jSONObject.put("nvv", C1481060oe0.LIZLLL);
            C20684815ws.LJIJ("inner_push_show", jSONObject);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C19331210k2 c19331210k2 = LIZ;
            EnumC19355710nz enumC19355710nz = EnumC19355710nz.MOB_SHOW;
            String message = thM5exceptionOrNullimpl.getMessage();
            c19331210k2.getClass();
            LJIIIZ(innerPushMessage, enumC19355710nz, message);
        }
    }

    public static void LJFF(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObject2.optString(next));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJII(InnerPushMessage innerPushMessage, boolean z) {
        Object c098200Yq;
        String aid;
        String groupId;
        String value;
        String str;
        String str2;
        String str3;
        ILiveOuterService iLiveOuterService;
        List<User> list;
        User user;
        List<User> list2;
        if (C13LQ.LJJIJ(innerPushMessage.getType(), C0ZF5.LIZIZ) >= 0 && innerPushMessage.getClickHasTracked()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            LIZ.getClass();
            Aweme awemeLIZIZ = LIZIZ();
            jSONObject.put("enter_from", LIZLLL());
            String uid = null;
            if (awemeLIZIZ != null) {
                aid = awemeLIZIZ.getAid();
            } else {
                aid = null;
            }
            jSONObject.put("author_id", aid);
            if (awemeLIZIZ != null) {
                groupId = awemeLIZIZ.getGroupId();
            } else {
                groupId = null;
            }
            jSONObject.put("group_id", groupId);
            jSONObject.put("push_label", LJI(innerPushMessage));
            jSONObject.put("business_tag", LIZJ(innerPushMessage));
            EnumC19331110k1 enumC19331110k1 = innerPushMessage.getTracker().LIZ;
            if (enumC19331110k1 != null) {
                value = enumC19331110k1.getValue();
            } else {
                value = null;
            }
            jSONObject.put("push_from", value);
            if (innerPushMessage.getRid() > 0) {
                jSONObject.put("rule_id", String.valueOf(innerPushMessage.getRid()));
            }
            jSONObject.put("receive_interval", innerPushMessage.getTracker().LJIJJ);
            jSONObject.put("show_interval", innerPushMessage.getTracker().LJIJJLI);
            if (innerPushMessage.getType() == 1004) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_recommended_chat", str);
            if (z) {
                str2 = "slide_up";
            } else {
                str2 = "auto";
            }
            jSONObject.put("action_type", str2);
            if (C729510SjV.LJJIJIL(awemeLIZIZ)) {
                str3 = "story";
            } else {
                str3 = "post";
            }
            jSONObject.put("story_type", str3);
            if (C19331310k3.LJIIJJI(innerPushMessage) || innerPushMessage.getTracker().LIZIZ) {
                jSONObject.put("if_nudge", "1");
            }
            InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
            if (uiTemplate != null && (list = uiTemplate.fromUsers) != null && !list.isEmpty()) {
                InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
                if (uiTemplate2 != null && (list2 = uiTemplate2.fromUsers) != null) {
                    user = list2.get(0);
                } else {
                    user = null;
                }
                if (user != null) {
                    uid = user.getUid();
                }
                jSONObject.put("from_user_id", uid);
            }
            String mobEventJsonStr = innerPushMessage.getMobEventJsonStr();
            if (mobEventJsonStr != null) {
                LJFF(mobEventJsonStr, jSONObject);
            }
            if (!jSONObject.has("item_type")) {
                jSONObject.put("item_type", LJ(innerPushMessage));
            }
            if (innerPushMessage.getType() == 30) {
                C19329910jp.LIZ.getClass();
                if (C19329910jp.LIZ() && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null) {
                    iLiveOuterService.d3(3, jSONObject);
                }
            }
            jSONObject.put("nvv", C1481060oe0.LIZLLL);
            C20684815ws.LJIJ("inner_push_disappear", jSONObject);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C19331210k2 c19331210k2 = LIZ;
            EnumC19355710nz enumC19355710nz = EnumC19355710nz.MOB_DISMISS;
            String message = thM5exceptionOrNullimpl.getMessage();
            c19331210k2.getClass();
            LJIIIZ(innerPushMessage, enumC19355710nz, message);
        }
    }

    public static void LJIIIIZZ(InnerPushMessage innerPushMessage, EnumC19330310jt enumC19330310jt) {
        String value;
        try {
            JSONObject jSONObject = new JSONObject();
            if (innerPushMessage.getRid() > 0) {
                jSONObject.put("rule_id", String.valueOf(innerPushMessage.getRid()));
            }
            EnumC19331110k1 enumC19331110k1 = innerPushMessage.getTracker().LIZ;
            if (enumC19331110k1 != null) {
                value = enumC19331110k1.getValue();
            } else {
                value = null;
            }
            jSONObject.put("push_from", value);
            jSONObject.put("push_type", innerPushMessage.getType());
            jSONObject.put("push_id", String.valueOf(innerPushMessage.getId()));
            LIZ.getClass();
            jSONObject.put("push_label", LJI(innerPushMessage));
            jSONObject.put("business_tag", LIZJ(innerPushMessage));
            jSONObject.put("drop_reason", innerPushMessage.getTracker().LJJJJLI);
            String mobEventJsonStr = innerPushMessage.getMobEventJsonStr();
            if (mobEventJsonStr != null) {
                LJFF(mobEventJsonStr, jSONObject);
            }
            if (!jSONObject.has("item_type")) {
                jSONObject.put("item_type", LJ(innerPushMessage));
            }
            jSONObject.put("drop_status", enumC19330310jt.getValue());
            C20684815ws.LJIJ("inner_push_drop", jSONObject);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJIILIIL(InnerPushMessage innerPushMessage, EnumC19330310jt enumC19330310jt) {
        Object c098200Yq;
        int i;
        int i2;
        String str;
        String str2;
        List<String> list;
        JSONObject jSONObject = new JSONObject();
        if (innerPushMessage != null) {
            try {
                jSONObject.put("push_id", String.valueOf(innerPushMessage.getId()));
                if (innerPushMessage.getRid() > 0) {
                    jSONObject.put("rule_id", String.valueOf(innerPushMessage.getRid()));
                }
                jSONObject.put("push_type", innerPushMessage.getType());
                EnumC19331110k1 enumC19331110k1 = innerPushMessage.getTracker().LIZ;
                String value = null;
                if (enumC19331110k1 != null) {
                    value = enumC19331110k1.getValue();
                }
                jSONObject.put("push_from", value);
                LIZ.getClass();
                jSONObject.put("push_label", LJI(innerPushMessage));
                jSONObject.put("business_tag", LIZJ(innerPushMessage));
                jSONObject.put("receive_interval", innerPushMessage.getTracker().LJIJJ);
                jSONObject.put("show_interval", innerPushMessage.getTracker().LJIJJLI);
                jSONObject.put("client_interval", innerPushMessage.getTracker().LJIL);
                jSONObject.put("queue_interval", innerPushMessage.getTracker().LJJI);
                jSONObject.put("has_waited", innerPushMessage.getHasAvoidanceWaited());
                jSONObject.put("display_duration", innerPushMessage.getTracker().LIZLLL);
                jSONObject.put("preloaded", innerPushMessage.getTracker().LJ);
                jSONObject.put("preloaded_loop_times", innerPushMessage.getTracker().LJJJJIZL);
                jSONObject.put("preload_api_duration", innerPushMessage.getTracker().LJI);
                jSONObject.put("preloaded_xml", innerPushMessage.getTracker().LJJJJJL);
                jSONObject.put("preloaded_pic", innerPushMessage.getTracker().LJJJJL);
                jSONObject.put("preloaded_xml_loop_times", innerPushMessage.getTracker().LJJJJJ);
                jSONObject.put("block_background_duration", innerPushMessage.getTracker().LJJIJIL);
                jSONObject.put("block_live_duration", innerPushMessage.getTracker().LJJIJL);
                jSONObject.put("block_shooting_duration", innerPushMessage.getTracker().LJJIJLIJ);
                jSONObject.put("block_album_duration", innerPushMessage.getTracker().LJJIL);
                jSONObject.put("block_keyboard_duration", innerPushMessage.getTracker().LJJIZ);
                jSONObject.put("block_commercead_duration", innerPushMessage.getTracker().LJJJ);
                jSONObject.put("block_popup_duration", innerPushMessage.getTracker().LJJJI);
                jSONObject.put("block_external_handler_duration", innerPushMessage.getTracker().LJJJJ);
                jSONObject.put("block_by_orientation", innerPushMessage.getTracker().LJJJJI);
                jSONObject.put("block_connect_now_duration", innerPushMessage.getTracker().LJJJIL);
                jSONObject.put("avatar_duration", innerPushMessage.getTracker().LJII);
                jSONObject.put("avatar_label_duration", innerPushMessage.getTracker().LJIIIIZZ);
                jSONObject.put("right_image_duration", innerPushMessage.getTracker().LJIIIZ);
                InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
                int i3 = 0;
                if (uiTemplate != null && (list = uiTemplate.avatarUrls) != null && (!list.isEmpty())) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put("has_avatar", i);
                InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
                if (uiTemplate2 != null && (str2 = uiTemplate2.avatarRightLabelUrl) != null && str2.length() != 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                jSONObject.put("has_avatar_label", i2);
                InnerPushUITemplate uiTemplate3 = innerPushMessage.getUiTemplate();
                if (uiTemplate3 == null || (str = uiTemplate3.rightImageUrl) == null || str.length() == 0) {
                    i3 = 1;
                }
                jSONObject.put("has_right_image", i3 ^ 1);
                jSONObject.put("avatar_load_status", innerPushMessage.getTracker().LJIILIIL);
                jSONObject.put("avatar_label_load_status", innerPushMessage.getTracker().LJIILJJIL);
                jSONObject.put("right_image_load_status", innerPushMessage.getTracker().LJIILL);
                jSONObject.put("avatar_image_from", innerPushMessage.getTracker().LJIIJ);
                jSONObject.put("avatar_label_from", innerPushMessage.getTracker().LJIIJJI);
                jSONObject.put("right_image_from", innerPushMessage.getTracker().LJIIL);
                jSONObject.put("avatar_image_size", innerPushMessage.getTracker().LJIILLIIL);
                jSONObject.put("avatar_label_size", innerPushMessage.getTracker().LJIIZILJ);
                c098200Yq = jSONObject.put("right_image_size", innerPushMessage.getTracker().LJIJ);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, enumC19330310jt.getValue());
        C20684815ws.LJIJ("inner_push_tracker", jSONObject);
    }

    public static void LJIIIZ(InnerPushMessage innerPushMessage, EnumC19355710nz enumC19355710nz, String str) {
        String value;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobInnerPushErrorMsg msg:");
        sbLIZ.append(innerPushMessage);
        sbLIZ.append(" scene:");
        sbLIZ.append(enumC19355710nz);
        sbLIZ.append(" error:");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        C19290510dT.LIZIZ("inner_push", C2188811AlT.LIZIZ(sbLIZ));
        JSONObject jSONObject = new JSONObject();
        if (innerPushMessage != null) {
            jSONObject.put("push_id", innerPushMessage.getId());
            if (innerPushMessage.getRid() > 0) {
                jSONObject.put("rule_id", String.valueOf(innerPushMessage.getRid()));
            }
            jSONObject.put("push_type", innerPushMessage.getType());
            EnumC19331110k1 enumC19331110k1 = innerPushMessage.getTracker().LIZ;
            if (enumC19331110k1 != null) {
                value = enumC19331110k1.getValue();
            } else {
                value = null;
            }
            jSONObject.put("push_from", value);
        }
        jSONObject.put(Scene.SCENE_SERVICE, enumC19355710nz.getValue());
        jSONObject.put("error_msg", str);
        C20684815ws.LJIJ("inner_push_error", jSONObject);
    }

    public static void LJIILJJIL(int i, InnerPushMessage innerPushMessage, String str) {
        Object c098200Yq;
        String aid;
        String groupId;
        Object obj;
        String value;
        String str2;
        ILiveOuterService iLiveOuterService;
        List<User> list;
        User user;
        List<User> list2;
        if (C13LQ.LJJIJ(innerPushMessage.getType(), C0ZF5.LIZIZ) >= 0 && innerPushMessage.getClickHasTracked()) {
            return;
        }
        innerPushMessage.setClickHasTracked(true);
        try {
            JSONObject jSONObject = new JSONObject();
            LIZ.getClass();
            Aweme awemeLIZIZ = LIZIZ();
            jSONObject.put("enter_from", LIZLLL());
            String uid = null;
            if (awemeLIZIZ != null) {
                aid = awemeLIZIZ.getAid();
            } else {
                aid = null;
            }
            jSONObject.put("author_id", aid);
            if (awemeLIZIZ != null) {
                groupId = awemeLIZIZ.getGroupId();
            } else {
                groupId = null;
            }
            jSONObject.put("group_id", groupId);
            jSONObject.put("push_label", LJI(innerPushMessage));
            jSONObject.put("business_tag", LIZJ(innerPushMessage));
            jSONObject.put("action_type", str);
            String str3 = "1";
            if (innerPushMessage.getType() == 1004) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject.put("is_recommended_chat", obj);
            if (innerPushMessage.getRid() > 0) {
                jSONObject.put("rule_id", String.valueOf(innerPushMessage.getRid()));
            }
            EnumC19331110k1 enumC19331110k1 = innerPushMessage.getTracker().LIZ;
            if (enumC19331110k1 != null) {
                value = enumC19331110k1.getValue();
            } else {
                value = null;
            }
            jSONObject.put("push_from", value);
            jSONObject.put("receive_interval", innerPushMessage.getTracker().LJIJJ);
            jSONObject.put("show_interval", innerPushMessage.getTracker().LJIJJLI);
            if (!innerPushMessage.getTracker().LIZIZ || !C19331310k3.LJIIJJI(innerPushMessage)) {
                if (innerPushMessage.getTracker().LIZIZ) {
                    str3 = "2";
                } else {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
            }
            jSONObject.put("if_nudge", str3);
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                str2 = "global";
                            } else {
                                str2 = "bottom";
                            }
                        } else {
                            str2 = "top";
                        }
                    } else {
                        str2 = "right";
                    }
                } else {
                    str2 = "middle";
                }
            } else {
                str2 = "left";
            }
            jSONObject.put("click_area", str2);
            InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
            if (uiTemplate != null && (list = uiTemplate.fromUsers) != null && !list.isEmpty()) {
                InnerPushUITemplate uiTemplate2 = innerPushMessage.getUiTemplate();
                if (uiTemplate2 != null && (list2 = uiTemplate2.fromUsers) != null) {
                    user = list2.get(0);
                } else {
                    user = null;
                }
                if (user != null) {
                    uid = user.getUid();
                }
                jSONObject.put("from_user_id", uid);
            }
            String mobEventJsonStr = innerPushMessage.getMobEventJsonStr();
            if (mobEventJsonStr != null) {
                LJFF(mobEventJsonStr, jSONObject);
            }
            if (!jSONObject.has("item_type")) {
                jSONObject.put("item_type", LJ(innerPushMessage));
            }
            if (innerPushMessage.getType() == 30) {
                C19329910jp.LIZ.getClass();
                if (C19329910jp.LIZ() && (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) != null) {
                    iLiveOuterService.d3(2, jSONObject);
                }
            }
            jSONObject.put("nvv", C1481060oe0.LIZLLL);
            C20684815ws.LJIJ("inner_push_click", jSONObject);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C19331210k2 c19331210k2 = LIZ;
            EnumC19355710nz enumC19355710nz = EnumC19355710nz.MOB_CLICK;
            String message = thM5exceptionOrNullimpl.getMessage();
            c19331210k2.getClass();
            LJIIIZ(innerPushMessage, enumC19355710nz, message);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(int r6, X.EnumC20643215qA r7, java.lang.String r8, long r9, java.lang.Throwable r11, java.lang.String r12, com.ss.android.ugc.aweme.innerpush.model.GetMessageListResponse r13) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19331210k2.LJIIJ(int, X.15qA, java.lang.String, long, java.lang.Throwable, java.lang.String, com.ss.android.ugc.aweme.innerpush.model.GetMessageListResponse):void");
    }
}
