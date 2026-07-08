package X;

import android.os.Bundle;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import com.ss.android.ugc.aweme.affinity.service.ISocialAffinityService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.service.service.IEcommerceLogUtil;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lcC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1364620lcC {
    public static final C1364620lcC LIZ = new C1364620lcC();
    public static int LIZIZ = 1;
    public static long LIZJ;
    public static int LIZLLL;
    public static int LJ;
    public static int LJFF;
    public static int LJI;
    public static boolean LJII;

    public static void LJI(C1364620lcC c1364620lcC) {
        C0I0B.LJFF.LIZIZ();
        c1364620lcC.getClass();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("action_type", "click_more");
        C20684815ws.LJIILLIIL("ai_avatar_save_finish_page", c830490Whz);
    }

    public static void LJII(C1364620lcC c1364620lcC) {
        C0I0B.LJFF.LIZIZ();
        c1364620lcC.getClass();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("action_type", "share_to_story");
        C20684815ws.LJIILLIIL("ai_avatar_save_finish_page", c830490Whz);
    }

    public static String LJJI(C1368220li0 c1368220li0) {
        Object obj;
        Map<String, Object> eventTracking = c1368220li0.LIZ.getEventTracking();
        if (eventTracking != null) {
            obj = eventTracking.get("search_source");
        } else {
            obj = null;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        return (String) obj;
    }

    public static void LIZ(C830490Whz c830490Whz, IMContact iMContact) {
        String strLIZJ = C1336205Ku.LIZ(false).getImUserService().LIZJ(iMContact);
        if (strLIZJ == null) {
            strLIZJ = "";
        }
        c830490Whz.put("conversation_id", strLIZJ);
        if (iMContact instanceof IMUser) {
            c830490Whz.put("to_user_id", iMContact.getUid());
            c830490Whz.put("chat_type", "private");
        } else {
            if (!(iMContact instanceof IMConversation)) {
                return;
            }
            c830490Whz.put("chat_type", "group");
        }
    }

    public static void LIZIZ(C1364620lcC c1364620lcC, String str) {
        C0I0B.LJFF.LIZIZ();
        c1364620lcC.getClass();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "share");
        c830490Whz.put("action", str);
        C20684815ws.LJIILLIIL("create_group_intermediate_button", c830490Whz);
    }

    public static String LIZJ(IMContact iMContact, String str) {
        String shareRelationType;
        boolean z;
        String str2;
        String shareRelationType2;
        if (iMContact != null) {
            shareRelationType = iMContact.getShareRelationType();
        } else {
            shareRelationType = null;
        }
        if (shareRelationType != null && shareRelationType.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str3 = "";
        if (!z) {
            if (iMContact == null || (shareRelationType2 = iMContact.getShareRelationType()) == null) {
                return "";
            }
            return shareRelationType2;
        }
        if (iMContact == null) {
            return "";
        }
        if (iMContact instanceof IMUser) {
            IMUser iMUser = (IMUser) iMContact;
            String uid = iMUser.getUid();
            if (uid == null) {
                uid = "";
            }
            if (Intrinsics.LJFF(iMUser.getUid(), str)) {
                if ((iMContact instanceof MAFIMUser) || (iMUser.getFollowStatus() != 2 && C123100dR.LIZ(iMUser.getRecType()))) {
                    return "creator/maf";
                }
                return "creator";
            }
            if (iMUser.getFollowStatus() == 2) {
                str3 = "muf";
            } else if (iMContact instanceof MAFIMUser) {
                str3 = "maf";
            }
            str2 = str3;
            str3 = uid;
        } else if (!(iMContact instanceof IMConversation)) {
            str2 = "";
        } else {
            String conversationId = ((IMConversation) iMContact).getConversationId();
            if (conversationId == null) {
                conversationId = "";
            }
            str2 = "";
            str3 = conversationId;
        }
        if (iMContact.getType() == 1) {
            IMSharePanelApi.LIZ.getClass();
            return C1599690rjL.LIZ().LIZIZ().LJ(str3);
        }
        return str2;
    }

    public static void LJFF(C1364620lcC c1364620lcC, IMContact iMContact) {
        C0I0B.LJFF.LIZIZ();
        c1364620lcC.getClass();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("action_type", "click_share_head");
        LIZ.getClass();
        LIZ(c830490Whz, iMContact);
        C20684815ws.LJIILLIIL("ai_avatar_save_finish_page", c830490Whz);
    }

    public static void LJIJ(SharePackage sharePackage, InterfaceC1493105sv interfaceC1493105sv) {
        Integer numValueOf;
        List<PhotoModeImageUrlModel> imageList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = "";
        linkedHashMap.put("user_type", sharePackage.extras.getString("user_type", ""));
        linkedHashMap.put("request_page", sharePackage.extras.getString("request_page", ""));
        Aweme aweme = C651920Phe.LIZ;
        if (aweme != null) {
            linkedHashMap.put("aweme_type", String.valueOf(aweme.getAwemeType()));
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                numValueOf = Integer.valueOf(imageList.size());
            } else {
                numValueOf = null;
            }
            linkedHashMap.put("pic_cnt", String.valueOf(numValueOf));
        }
        String string = sharePackage.extras.getString("panel_source");
        if (string == null) {
            string = "";
        }
        if (C123100dR.LIZ(string)) {
            linkedHashMap.put("panel_source", string);
        }
        String string2 = sharePackage.extras.getString("aid");
        if (string2 == null) {
            string2 = "";
        }
        linkedHashMap.put("group_id", string2);
        String string3 = sharePackage.extras.getString("enter_from");
        if (string3 != null) {
            str = string3;
        }
        linkedHashMap.put("enter_from", str);
        interfaceC1493105sv.sendEvent("im_share_head_show", linkedHashMap);
        if (C504670Jqj.LIZ(sharePackage.itemType, "product")) {
            ((IEcommerceLogUtil) ServiceManager.get().getService(IEcommerceLogUtil.class)).LIZJ(sharePackage);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1 A[PHI: r10
      0x00b1: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v5 java.lang.String) binds: [B:39:0x00ad, B:11:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(int r11, com.ss.android.ugc.aweme.sharer.model.SharePackage r12, java.lang.String r13) {
        /*
            java.lang.String r9 = "enter_from"
            r2 = 0
            if (r12 == 0) goto Lac
            android.os.Bundle r1 = r12.extras
            if (r1 == 0) goto La2
            java.lang.String r0 = "event_type"
            java.lang.String r10 = r1.getString(r0)
            if (r10 == 0) goto La2
            boolean r0 = X.C123100dR.LIZ(r10)
            if (r0 == 0) goto La2
        L17:
            android.os.Bundle r1 = r12.extras
            if (r1 == 0) goto Lb1
            java.lang.String r0 = "aid"
            java.lang.String r8 = r1.getString(r0)
        L21:
            java.lang.String r7 = "panel_source"
            if (r12 == 0) goto La0
            android.os.Bundle r0 = r12.extras
            if (r0 == 0) goto La0
            java.lang.String r6 = r0.getString(r7)
        L2d:
            if (r12 == 0) goto L31
            java.lang.String r2 = r12.itemType
        L31:
            java.lang.String r5 = X.C1367440lgk.LIZ(r2)
            java.lang.String r0 = "show"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r13, r0)
            if (r0 == 0) goto L95
            java.lang.String r3 = "ttsocial_share_shortcut_btn_show"
        L3f:
            X.0I0B r0 = X.C0I0B.LJFF
            r0.LIZIZ()
            r0 = 6
            kotlin.Pair[] r4 = new kotlin.Pair[r0]
            java.lang.String r2 = ""
            if (r10 != 0) goto L4c
            r10 = r2
        L4c:
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r9, r10)
            r0 = 0
            r4[r0] = r1
            if (r8 != 0) goto L57
            r8 = r2
        L57:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "group_id"
            r1.<init>(r0, r8)
            r0 = 1
            r4[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r7, r6)
            r0 = 2
            r4[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "content_type"
            r1.<init>(r0, r5)
            r0 = 3
            r4[r0] = r1
            java.lang.String r2 = java.lang.String.valueOf(r11)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "member_count"
            r1.<init>(r0, r2)
            r0 = 4
            r4[r0] = r1
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "rank_num"
            java.lang.String r0 = "0"
            r2.<init>(r1, r0)
            r0 = 5
            r4[r0] = r2
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r4)
            X.C20684815ws.LJIILLIIL(r3, r0)
        L94:
            return
        L95:
            java.lang.String r0 = "click"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r13, r0)
            if (r0 == 0) goto L94
            java.lang.String r3 = "ttsocial_share_shortcut_btn_click"
            goto L3f
        La0:
            r6 = r2
            goto L2d
        La2:
            android.os.Bundle r0 = r12.extras
            if (r0 == 0) goto Lac
            java.lang.String r10 = r0.getString(r9)
            goto L17
        Lac:
            r10 = r2
            if (r12 == 0) goto Lb1
            goto L17
        Lb1:
            r8 = r2
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1364620lcC.LJ(int, com.ss.android.ugc.aweme.sharer.model.SharePackage, java.lang.String):void");
    }

    public static void LJIILLIIL(SharePackage sharePackage, IMContact iMContact, InterfaceC1493105sv interfaceC1493105sv) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (Intrinsics.LJFF(sharePackage.itemType, "comment")) {
            linkedHashMap.put("enter_from", "comment_panel");
            String str2 = "";
            if (iMContact instanceof IMUser) {
                String uid = iMContact.getUid();
                if (uid != null) {
                    str2 = uid;
                }
                str = "private";
            } else if (iMContact instanceof IMConversation) {
                str = "group";
            } else {
                str = "other";
                str2 = "unknow";
            }
            linkedHashMap.put("chat_type", str);
            linkedHashMap.put("to_user_id", str2);
            interfaceC1493105sv.sendEvent("share_head_click", linkedHashMap);
        }
    }

    public static void LJIIL(String str, String str2, String str3, InterfaceC1493105sv interfaceC1493105sv) {
        interfaceC1493105sv.sendEvent("rec_friends_on_share_panel", C2097608Jq.LJIIIIZZ(new Pair("panel_style", str), new Pair("action_type", str2), new Pair("to_user_id", str3)));
    }

    public static void LJIILL(long j, InterfaceC1493105sv interfaceC1493105sv, String str, String str2) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("duration", String.valueOf(j));
        c830490Whz.put("enter_from", str);
        c830490Whz.put("enter_method", str2);
        c830490Whz.put("is_first_open_after_launch", String.valueOf(LIZIZ));
        interfaceC1493105sv.sendEvent("share_head_show_performance", c830490Whz);
        LIZIZ = 0;
    }

    public static void LJIJJLI(C1364620lcC c1364620lcC, String str, String str2, String str3) {
        C0I0B.LJFF.LIZIZ();
        c1364620lcC.getClass();
        Pair[] pairArr = new Pair[3];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("group_id", str2);
        pairArr[2] = new Pair("panel_source", str3);
        C20684815ws.LJIILLIIL("tikbot_share_video", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static void LJJ(SharePackage sharePackage, BaseContent baseContent, int i, InterfaceC1493105sv interfaceC1493105sv) {
        String str;
        String strLIZIZ = C1367440lgk.LIZIZ(sharePackage.itemType);
        if (strLIZIZ.length() == 0) {
            return;
        }
        if (baseContent == null) {
            str = "share";
        } else {
            str = "forward";
        }
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("message_category", strLIZIZ);
        c830490Whz.put("contact_number", String.valueOf(i));
        c830490Whz.put("action_type", str);
        c830490Whz.put("enter_method", sharePackage.extras.getString("enter_method", ""));
        String string = sharePackage.extras.getString("tab_name", "");
        if (string.length() > 0) {
            c830490Whz.put("tab_name", string);
        }
        int i2 = sharePackage.extras.getInt("aweme_type");
        if (i2 != 501 && i2 != 502) {
            c830490Whz.put("enter_from", sharePackage.extras.getString("enter_from", ""));
        } else {
            c830490Whz.put("enter_from", "detail_page_share_panel");
            if (Intrinsics.LJFF(sharePackage.extras.getString("enter_method", ""), "share_panel")) {
                c830490Whz.put("enter_method", "detail_page_share_panel");
            }
        }
        interfaceC1493105sv.sendEvent("multi_send_message", c830490Whz);
    }

    public static void LJIIJ(SharePackage sharePackage, int i, String str, Map map, InterfaceC1493105sv interfaceC1493105sv) {
        String string;
        Bundle bundle;
        String string2;
        Bundle bundle2;
        C830490Whz c830490Whz = new C830490Whz();
        String str2 = "";
        if (sharePackage == null || (bundle2 = sharePackage.extras) == null || (string = bundle2.getString("enter_from")) == null) {
            string = "";
        }
        c830490Whz.put("enter_from", string);
        if (sharePackage != null && (bundle = sharePackage.extras) != null && (string2 = bundle.getString("panel_style")) != null) {
            str2 = string2;
        }
        c830490Whz.put("panel_style", str2);
        c830490Whz.put("show_cnt", String.valueOf(i));
        c830490Whz.put("is_ai_generated", str);
        c830490Whz.putAll(map);
        interfaceC1493105sv.sendEvent("share_emoji_show", c830490Whz);
    }

    public static void LJIL(C1364620lcC c1364620lcC, String str, String str2, String str3, String str4) {
        C0I0B.LJFF.LIZIZ();
        c1364620lcC.getClass();
        Pair[] pairArr = new Pair[4];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("group_id", str2);
        if (str4 == null) {
            str4 = "";
        }
        pairArr[2] = new Pair("panel_source", str4);
        pairArr[3] = new Pair("share_relation_type", str3);
        C20684815ws.LJIILLIIL("tikbot_share_head_show", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static void LJIIIIZZ(SharePackage sharePackage, int i, String str, boolean z, Map map, InterfaceC1493105sv interfaceC1493105sv) {
        String string;
        Bundle bundle;
        String string2;
        Bundle bundle2;
        C830490Whz c830490Whz = new C830490Whz();
        String str2 = "";
        if (sharePackage == null || (bundle2 = sharePackage.extras) == null || (string = bundle2.getString("enter_from")) == null) {
            string = "";
        }
        c830490Whz.put("enter_from", string);
        if (sharePackage != null && (bundle = sharePackage.extras) != null && (string2 = bundle.getString("panel_style")) != null) {
            str2 = string2;
        }
        c830490Whz.put("panel_style", str2);
        c830490Whz.put("rank_num", String.valueOf(i + 1));
        if (z) {
            c830490Whz.put("is_ai_generated", "1");
            c830490Whz.put("ai_generated_reply", str);
        } else {
            c830490Whz.put("is_ai_generated", CardStruct.IStatusCode.DEFAULT);
            c830490Whz.put("emoji_id", str);
        }
        c830490Whz.putAll(map);
        interfaceC1493105sv.sendEvent("share_emoji_click", c830490Whz);
    }

    public static void LJIJJ(IMContact iMContact, int i, int i2, String str, String str2, String str3, String str4) {
        String strLJJI;
        Object obj;
        int i3;
        Object obj2;
        Object obj3;
        Object obj4;
        C0I0B.LJFF.LIZIZ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("session_impr_id", i2);
        jSONObject.put("session_id", str);
        jSONObject.put("enter_from", str4);
        jSONObject.put("enter_method", "click");
        jSONObject.put(Scene.SCENE_SERVICE, "share_panel");
        jSONObject.put("search_keyword", str2);
        jSONObject.put("rank", i);
        Iterator<T> it2 = iMContact.getAllMatchMetaCopy().values().iterator();
        while (true) {
            if (it2.hasNext()) {
                C1368220li0 c1368220li0 = (C1368220li0) it2.next();
                LIZ.getClass();
                strLJJI = LJJI(c1368220li0);
                if (strLJJI != null) {
                    break;
                }
            } else {
                strLJJI = null;
                break;
            }
        }
        if (strLJJI != null) {
            jSONObject.put("search_source", strLJJI);
        }
        Object obj5 = "";
        if (iMContact instanceof IMUser) {
            IMUser iMUser = (IMUser) iMContact;
            int i4 = C1369380ljs.LIZ[iMUser.getRelationship().ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 5) {
                            if (i4 != 6) {
                                i3 = 0;
                            } else {
                                i3 = 4;
                            }
                        } else {
                            i3 = 3;
                        }
                    } else {
                        i3 = 2;
                    }
                } else {
                    i3 = 1;
                }
            } else {
                i3 = 5;
            }
            jSONObject.put("relation", i3);
            jSONObject.put("follow_status", iMUser.getFollowStatus());
            jSONObject.put("follower_status", iMUser.getFollowerStatus());
            Map<Integer, C1368220li0> allMatchMetaCopy = iMContact.getAllMatchMetaCopy();
            C1368220li0 c1368220li02 = allMatchMetaCopy.get(1);
            if (c1368220li02 != null) {
                jSONObject.put("client_match_dimension_primary", 1);
                LIZ.getClass();
                String strLJJI2 = LJJI(c1368220li02);
                if (strLJJI2 != null) {
                    jSONObject.put("search_source", strLJJI2);
                }
                Map<String, Object> eventTracking = c1368220li02.LIZ.getEventTracking();
                if (eventTracking != null) {
                    obj4 = eventTracking.get("match_type");
                } else {
                    obj4 = null;
                }
                if (!(obj4 instanceof String) || obj4 == null) {
                    obj4 = "";
                }
                C1369340ljo c1369340ljo = c1368220li02.LIZLLL;
                double d = c1369340ljo.LIZ;
                String strLJJLIIIJ = C13LP.LJJLIIIJ(c1369340ljo.LIZIZ, ";", null, null, 0, null, AFwS259S0000000_21.get$arr$(173), 30);
                String str5 = c1368220li02.LIZJ;
                jSONObject.put("client_match_type_primary", obj4);
                jSONObject.put("client_match_score_primary", d);
                jSONObject.put("client_match_ranges_primary", strLJJLIIIJ);
                jSONObject.put("matched_source_text_primary", str5);
            }
            C1368220li0 c1368220li03 = allMatchMetaCopy.get(2);
            if (c1368220li03 != null) {
                jSONObject.put("client_match_score_secondary", c1368220li03.LIZLLL.LIZ);
                jSONObject.put("client_match_dimension_secondary", 2);
                LIZ.getClass();
                String strLJJI3 = LJJI(c1368220li03);
                if (strLJJI3 != null) {
                    jSONObject.put("search_source", strLJJI3);
                }
                Map<String, Object> eventTracking2 = c1368220li03.LIZ.getEventTracking();
                if (eventTracking2 != null) {
                    obj3 = eventTracking2.get("match_type");
                } else {
                    obj3 = null;
                }
                if (!(obj3 instanceof String) || obj3 == null) {
                    obj3 = "";
                }
                C1369340ljo c1369340ljo2 = c1368220li03.LIZLLL;
                double d2 = c1369340ljo2.LIZ;
                String strLJJLIIIJ2 = C13LP.LJJLIIIJ(c1369340ljo2.LIZIZ, ";", null, null, 0, null, AFwS259S0000000_21.get$arr$(174), 30);
                String str6 = c1368220li03.LIZJ;
                jSONObject.put("client_match_type_secondary", obj3);
                jSONObject.put("client_match_score_secondary", d2);
                jSONObject.put("client_match_ranges_secondary", strLJJLIIIJ2);
                jSONObject.put("matched_source_text_secondary", str6);
            }
            C1368220li0 c1368220li04 = allMatchMetaCopy.get(0);
            if (c1368220li04 != null) {
                jSONObject.put("client_match_score_primary", c1368220li04.LIZLLL.LIZ);
                jSONObject.put("client_match_dimension_primary", 0);
                LIZ.getClass();
                String strLJJI4 = LJJI(c1368220li04);
                if (strLJJI4 != null) {
                    jSONObject.put("search_source", strLJJI4);
                }
                Map<String, Object> eventTracking3 = c1368220li04.LIZ.getEventTracking();
                if (eventTracking3 != null) {
                    obj2 = eventTracking3.get("match_type");
                } else {
                    obj2 = null;
                }
                if ((obj2 instanceof String) && obj2 != null) {
                    obj5 = obj2;
                }
                C1369340ljo c1369340ljo3 = c1368220li04.LIZLLL;
                double d3 = c1369340ljo3.LIZ;
                String strLJJLIIIJ3 = C13LP.LJJLIIIJ(c1369340ljo3.LIZIZ, ";", null, null, 0, null, AFwS259S0000000_21.get$arr$(175), 30);
                String str7 = c1368220li04.LIZJ;
                jSONObject.put("client_match_type_primary", obj5);
                jSONObject.put("client_match_score_primary", d3);
                jSONObject.put("client_match_ranges_primary", strLJJLIIIJ3);
                jSONObject.put("matched_source_text_primary", str7);
            }
        } else if (iMContact instanceof IMConversation) {
            jSONObject.put("relation", 6);
            jSONObject.put("follow_status", -1);
            jSONObject.put("follower_status", -1);
            C1368220li0 c1368220li05 = iMContact.getAllMatchMetaCopy().get(3);
            if (c1368220li05 != null) {
                jSONObject.put("client_match_dimension_primary", 3);
                LIZ.getClass();
                String strLJJI5 = LJJI(c1368220li05);
                if (strLJJI5 != null) {
                    jSONObject.put("search_source", strLJJI5);
                }
                Map<String, Object> eventTracking4 = c1368220li05.LIZ.getEventTracking();
                if (eventTracking4 != null) {
                    obj = eventTracking4.get("match_type");
                } else {
                    obj = null;
                }
                if ((obj instanceof String) && obj != null) {
                    obj5 = obj;
                }
                C1369340ljo c1369340ljo4 = c1368220li05.LIZLLL;
                double d4 = c1369340ljo4.LIZ;
                String strLJJLIIIJ4 = C13LP.LJJLIIIJ(c1369340ljo4.LIZIZ, ";", null, null, 0, null, AFwS259S0000000_21.get$arr$(176), 30);
                String str8 = c1368220li05.LIZJ;
                jSONObject.put("client_match_type_primary", obj5);
                jSONObject.put("client_match_score_primary", d4);
                jSONObject.put("client_match_ranges_primary", strLJJLIIIJ4);
                jSONObject.put("matched_source_text_primary", str8);
            }
        } else {
            jSONObject.put("relation", 0);
            jSONObject.put("follow_status", -1);
            jSONObject.put("follower_status", -1);
        }
        C20684815ws.LJIJ(str3, jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIILIIL(IMContact iMContact, int i, String str, SharePackage sharePackage, boolean z, String str2, InterfaceC1493105sv interfaceC1493105sv, Map<String, String> map) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        Bundle bundle;
        String str3;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        Bundle bundle2;
        Integer numValueOf;
        String str4;
        StoryHighlightCollection storyHighlightCollection;
        List<PhotoModeImageUrlModel> imageList;
        Bundle bundle3;
        String string15;
        Bundle bundle4;
        Bundle bundle5;
        Bundle bundle6;
        Map<String, SocialAffinityItem> mapLIZIZ;
        SocialAffinityItem socialAffinityItem;
        Bundle bundle7;
        String str5;
        String string16;
        Bundle bundle8;
        Object[] objArr;
        Object[] objArr2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        boolean z2 = iMContact instanceof IMUser;
        String str6 = "";
        String str7 = CardStruct.IStatusCode.DEFAULT;
        String string17 = null;
        if (z2) {
            linkedHashMap.put("chat_type", "private");
            IMUser iMUser = (IMUser) iMContact;
            linkedHashMap.put("relation_tag", String.valueOf(iMUser.getFollowStatus()));
            linkedHashMap.put("rec_type", iMUser.getRecType());
            linkedHashMap.put("to_user_id", iMContact.getUid());
            IMUser iMUser2 = (IMUser) iMContact;
            if (iMUser2.getFriendRecType() != 1) {
                str5 = "";
            } else {
                str5 = "share_link_match";
            }
            linkedHashMap.put("rec_reason", str5);
            if (Intrinsics.LJFF(iMContact.getUid(), str2)) {
                if (iMContact.isAtLastInSharePanel()) {
                    objArr2 = "1";
                } else {
                    objArr2 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_chat_list_bottom", objArr2);
            }
            if (C896370ZEl.LIZ()) {
                if (iMUser2.isActive()) {
                    objArr = "1";
                } else {
                    objArr = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_active", objArr);
            }
            if (sharePackage != null && (bundle8 = sharePackage.extras) != null) {
                string16 = bundle8.getString("author_id");
            } else {
                string16 = null;
            }
            String strLIZJ = LIZJ(iMContact, string16);
            iMContact.setShareRelationType(strLIZJ);
            linkedHashMap.put("share_relation_type", strLIZJ);
        } else if (iMContact instanceof IMConversation) {
            linkedHashMap.put("chat_type", "group");
            IMConversation iMConversation = (IMConversation) iMContact;
            linkedHashMap.put("to_user_id", iMConversation.getConversationId());
            linkedHashMap.put("group_type", C1229100i5c.LJI(iMConversation.getConversationId()));
            String strLIZJ2 = LIZJ(iMContact, "");
            iMContact.setShareRelationType(strLIZJ2);
            linkedHashMap.put("share_relation_type", strLIZJ2);
        } else if (iMContact instanceof C1363200lZu) {
            linkedHashMap.put("group_button_type", "recommended");
        } else if (iMContact instanceof C1363150lZp) {
            linkedHashMap.put("group_button_type", "more");
        }
        linkedHashMap.put("rank_index", String.valueOf(i));
        if (sharePackage != null && (bundle7 = sharePackage.extras) != null) {
            linkedHashMap.put("rank_num", String.valueOf(bundle7.getInt("rank_num")));
        }
        linkedHashMap.put("show_type", str);
        linkedHashMap.put("is_recent_contact", String.valueOf(iMContact.isRecentContact()));
        linkedHashMap.put("is_chat_list_top5", String.valueOf(iMContact.isRecentTop5Contact()));
        ISocialAffinityService iSocialAffinityService = (ISocialAffinityService) PluggableExtentionKt.pluggableSpi$default(ISocialAffinityService.class, false, false, false, 14, null);
        if (iSocialAffinityService != null && (mapLIZIZ = iSocialAffinityService.LIZIZ("default")) != null && (socialAffinityItem = mapLIZIZ.get(iMContact.getUid())) != null) {
            string = Double.valueOf(socialAffinityItem.score).toString();
        } else {
            string = null;
        }
        linkedHashMap.put("affinity_score", string);
        C0HWW c0hww = C0HWW.LIZ;
        boolean z3 = iMContact.getInfo().LJFF;
        c0hww.getClass();
        linkedHashMap.put("is_aggregation_chat", String.valueOf(z3 ? 1 : 0));
        String str8 = iMContact.getInfo().LJI;
        if (str8 != null && str8.length() != 0) {
            linkedHashMap.put("client_resort_type", iMContact.getInfo().LJI);
        }
        if (z) {
            str7 = "1";
        }
        linkedHashMap.put("is_in_group", str7);
        if (sharePackage != null && (bundle6 = sharePackage.extras) != null) {
            string2 = bundle6.getString("enter_from");
        } else {
            string2 = null;
        }
        if (sharePackage != null && (bundle5 = sharePackage.extras) != null) {
            string3 = bundle5.getString("enter_method");
        } else {
            string3 = null;
        }
        if (sharePackage != null && (bundle4 = sharePackage.extras) != null) {
            string4 = bundle4.getString("panel_source");
        } else {
            string4 = null;
        }
        if (C123100dR.LIZ(string4)) {
            linkedHashMap.put("panel_source", string4);
        }
        if (sharePackage != null && (bundle3 = sharePackage.extras) != null && (string15 = bundle3.getString("position")) != null) {
            linkedHashMap.put("position", string15);
        }
        if (string2 != null && string2.length() != 0) {
            linkedHashMap.put("enter_from", string2);
        }
        if (string3 != null && string3.length() != 0) {
            linkedHashMap.put("enter_method", string3);
        }
        Aweme aweme = C651920Phe.LIZ;
        if (aweme != null) {
            linkedHashMap.put("aweme_type", String.valueOf(aweme.getAwemeType()));
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                numValueOf = Integer.valueOf(imageList.size());
            } else {
                numValueOf = null;
            }
            linkedHashMap.put("pic_cnt", String.valueOf(numValueOf));
            StoryHighlightInfo storyHighlightInfo = aweme.storyHighlightInfo;
            if (storyHighlightInfo != null && storyHighlightInfo.containerCollectionInfo != null) {
                if (storyHighlightInfo != null && (storyHighlightCollection = storyHighlightInfo.containerCollectionInfo) != null) {
                    str4 = storyHighlightCollection.collectionId;
                } else {
                    str4 = null;
                }
                linkedHashMap.put("story_highlight_id", str4);
            }
        }
        if (sharePackage != null && (bundle2 = sharePackage.extras) != null) {
            string5 = bundle2.getString("is_private_profile");
        } else {
            string5 = null;
        }
        if (!C504670Jqj.LIZIZ(string5)) {
            linkedHashMap.put("is_private_profile", string5);
        }
        if (sharePackage != null) {
            linkedHashMap.put("resource_type", sharePackage.itemType);
            linkedHashMap.put("resource_id", sharePackage.identifier);
            String string18 = sharePackage.extras.getString("aid");
            if (string18 != null) {
                str6 = string18;
            }
            linkedHashMap.put("group_id", str6);
            linkedHashMap.put("author_follow_status", String.valueOf(sharePackage.extras.getInt("follow_status", 0)));
            linkedHashMap.put("content_type", C1367440lgk.LIZ(sharePackage.itemType));
            String string19 = sharePackage.extras.getString("resource_type");
            if (string19 == null) {
                string19 = sharePackage.itemType;
            }
            if (Intrinsics.LJFF(sharePackage.itemType, "sticker")) {
                linkedHashMap.put("resource_type", string19);
            }
            String string20 = sharePackage.extras.getString("page_name");
            if (string20 != null && string20.length() > 0) {
                linkedHashMap.put("page_name", string20);
            }
            bundle = sharePackage.extras;
        } else {
            bundle = null;
        }
        C1364630lcD.LIZJ(bundle, linkedHashMap);
        linkedHashMap.put("ohr_hand", String.valueOf(C590120NCo.LIZ()));
        if (sharePackage != null) {
            str3 = sharePackage.itemType;
        } else {
            str3 = null;
        }
        if (Intrinsics.LJFF(str3, "minis")) {
            Bundle bundle9 = sharePackage.extras;
            if (bundle9 != null) {
                string6 = bundle9.getString("enter_from");
            } else {
                string6 = null;
            }
            if (C703302op.LIZ(string6)) {
                linkedHashMap.put("enter_from", string6);
            }
            if (bundle9 != null) {
                string7 = bundle9.getString("enter_method");
            } else {
                string7 = null;
            }
            if (C703302op.LIZ(string7)) {
                linkedHashMap.put("enter_method", string7);
            }
            if (bundle9 != null) {
                string8 = bundle9.getString("minis_id");
            } else {
                string8 = null;
            }
            if (C703302op.LIZ(string8)) {
                linkedHashMap.put("minis_id", string8);
            }
            if (bundle9 != null) {
                string9 = bundle9.getString("minis_type");
            } else {
                string9 = null;
            }
            if (C703302op.LIZ(string9)) {
                linkedHashMap.put("minis_type", string9);
            }
            if (bundle9 != null) {
                string10 = bundle9.getString("minis_enter_from");
            } else {
                string10 = null;
            }
            if (C703302op.LIZ(string10)) {
                linkedHashMap.put("minis_enter_from", string10);
            }
            if (bundle9 != null) {
                string11 = bundle9.getString("minis_enter_method");
            } else {
                string11 = null;
            }
            if (C703302op.LIZ(string11)) {
                linkedHashMap.put("minis_enter_method", string11);
            }
            if (bundle9 != null) {
                string12 = bundle9.getString("minis_content_type");
            } else {
                string12 = null;
            }
            if (C703302op.LIZ(string12)) {
                linkedHashMap.put("minis_content_type", string12);
            }
            if (bundle9 != null) {
                string13 = bundle9.getString("minis_entrance_video_id");
            } else {
                string13 = null;
            }
            if (C703302op.LIZ(string13)) {
                linkedHashMap.put("minis_entrance_video_id", string13);
            }
            if (bundle9 != null) {
                string14 = bundle9.getString("minis_click_id");
            } else {
                string14 = null;
            }
            if (C703302op.LIZ(string14)) {
                linkedHashMap.put("minis_click_id", string14);
            }
            if (bundle9 != null) {
                string17 = bundle9.getString("minis_ttoclid");
            }
            if (C703302op.LIZ(string17)) {
                linkedHashMap.put("minis_ttoclid", string17);
            }
        }
        interfaceC1493105sv.sendEvent("share_head_show", linkedHashMap);
        if (sharePackage != null && C504670Jqj.LIZ(sharePackage.itemType, "product")) {
            ((IEcommerceLogUtil) ServiceManager.get().getService(IEcommerceLogUtil.class)).LJ(i, iMContact, sharePackage);
        }
        if (C296750Bk9.LIZ() && !LJII) {
            LJII = true;
            LIZJ = System.currentTimeMillis();
            LIZLLL = 0;
            LJ = 0;
            LJFF = 0;
            LJI = 0;
        }
    }
}
