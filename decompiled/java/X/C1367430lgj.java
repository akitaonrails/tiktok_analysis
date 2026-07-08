package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import com.ss.android.ugc.aweme.affinity.service.ISocialAffinityService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lgj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1367430lgj {
    public static final C1367430lgj LIZ = new C1367430lgj();

    public static String LIZJ(IMContact iMContact) {
        if (iMContact instanceof IMUser) {
            return "private";
        }
        if (iMContact instanceof IMConversation) {
            IMConversation iMConversation = (IMConversation) iMContact;
            if (iMConversation.getConversationType() == 1) {
                return "private";
            }
            if (iMConversation.getConversationType() == 2) {
                return "group";
            }
            return "";
        }
        if (iMContact instanceof C1363190lZt) {
            return "bulletin_board";
        }
        return "";
    }

    public static void LIZ(IMContact iMContact, C830490Whz c830490Whz) {
        String str;
        long jLongValue;
        Long lLJIILIIL;
        if (iMContact == null) {
            c830490Whz.put("to_user_id", "null");
            c830490Whz.put("conversation_id", "null");
            return;
        }
        if (iMContact instanceof IMUser) {
            c830490Whz.put("to_user_id", iMContact.getUid());
            String uid = iMContact.getUid();
            if (uid != null && (lLJIILIIL = C2095008Iq.LJIILIIL(uid)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            c830490Whz.put("conversation_id", C0YNP.LIZLLL(Long.valueOf(jLongValue)));
            return;
        }
        if (iMContact instanceof IMConversation) {
            c830490Whz.put("conversation_id", ((IMConversation) iMContact).getConversationId());
            c830490Whz.put("to_user_id", "null");
        } else {
            if (!(iMContact instanceof C1363190lZt)) {
                return;
            }
            C1362500lYm bbDetailInfo = ((C1363190lZt) iMContact).getBbDetailInfo();
            if (bbDetailInfo != null) {
                str = bbDetailInfo.LIZ;
            } else {
                str = null;
            }
            c830490Whz.put("to_user_id", String.valueOf(str));
            c830490Whz.put("conversation_id", "null");
        }
    }

    public static String LIZIZ(long j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(j);
        return C2084808Es.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJIIIIZZ(SharePackage sharePackage, String str) {
        LJFF(this, "show", sharePackage, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(X.C1367430lgj r5, java.lang.String r6, com.ss.android.ugc.aweme.sharer.model.SharePackage r7, java.lang.String r8) {
        /*
            X.0I0B r0 = X.C0I0B.LJFF
            r0.LIZIZ()
            r5.getClass()
            X.0Whz r3 = new X.0Whz
            r3.<init>()
            r4 = 0
            java.lang.String r1 = "enter_from"
            if (r7 == 0) goto L97
            android.os.Bundle r0 = r7.extras
            if (r0 == 0) goto L97
            java.lang.String r0 = r0.getString(r1)
        L1a:
            r3.put(r1, r0)
            java.lang.String r5 = "enter_method"
            java.lang.String r1 = "panel_source"
            if (r7 == 0) goto L95
            android.os.Bundle r0 = r7.extras
            if (r0 == 0) goto L2d
            java.lang.String r0 = r0.getString(r1, r4)
            if (r0 != 0) goto L35
        L2d:
            android.os.Bundle r0 = r7.extras
            if (r0 == 0) goto L95
            java.lang.String r0 = r0.getString(r5)
        L35:
            r3.put(r1, r0)
            java.lang.String r2 = "rank_num"
            if (r7 == 0) goto L93
            android.os.Bundle r0 = r7.extras
            if (r0 == 0) goto L93
            int r0 = r0.getInt(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L48:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.put(r2, r0)
            java.lang.String r1 = "button_type"
            if (r7 == 0) goto L91
            android.os.Bundle r0 = r7.extras
            if (r0 == 0) goto L91
            java.lang.String r0 = r0.getString(r1)
        L5b:
            r3.put(r1, r0)
            java.lang.String r0 = "action_type"
            r3.put(r0, r6)
            if (r7 == 0) goto L8f
            java.lang.String r0 = r7.itemType
        L67:
            java.lang.String r1 = X.C1367440lgk.LIZ(r0)
            java.lang.String r0 = "content_type"
            r3.put(r0, r1)
            if (r8 == 0) goto L82
            r3.put(r5, r8)
            java.lang.String r0 = "from_nav_bar"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 == 0) goto L82
            java.lang.String r0 = "-1"
            r3.put(r2, r0)
        L82:
            if (r7 == 0) goto L86
            android.os.Bundle r4 = r7.extras
        L86:
            X.C1364630lcD.LIZJ(r4, r3)
            java.lang.String r0 = "share_friend_search"
            X.C20684815ws.LJIILLIIL(r0, r3)
            return
        L8f:
            r0 = r4
            goto L67
        L91:
            r0 = r4
            goto L5b
        L93:
            r0 = r4
            goto L48
        L95:
            r0 = r4
            goto L35
        L97:
            r0 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1367430lgj.LJFF(X.0lgj, java.lang.String, com.ss.android.ugc.aweme.sharer.model.SharePackage, java.lang.String):void");
    }

    public static void LJIIIZ(C1367430lgj c1367430lgj, SharePackage sharePackage, IMContact iMContact, boolean z) {
        String str;
        Double dValueOf;
        Map<String, SocialAffinityItem> mapLIZIZ;
        SocialAffinityItem socialAffinityItem;
        C0I0B.LJFF.LIZIZ();
        c1367430lgj.getClass();
        String conversationId = "";
        if (sharePackage != null && iMContact != null) {
            JSONObject jSONObject = new JSONObject();
            Bundle bundle = sharePackage.extras;
            try {
                jSONObject.put("enter_from", bundle.getString("enter_from", ""));
                jSONObject.put("group_id", bundle.getString("item_id_string"));
                if (bundle.containsKey("rank_num")) {
                    jSONObject.put("rank_num", bundle.getInt("rank_num"));
                }
                if (iMContact instanceof IMUser) {
                    conversationId = iMContact.getUid();
                } else if (iMContact instanceof IMConversation) {
                    conversationId = ((IMConversation) iMContact).getConversationId();
                }
                jSONObject.put("to_user_id", conversationId);
                String string = bundle.getString("panel_source");
                if (string != null && string.length() != 0) {
                    jSONObject.put("panel_source", string);
                }
                if (z) {
                    str = "chat_merge";
                } else {
                    str = "chat_head";
                }
                jSONObject.put("platform", str);
                jSONObject.put("chat_type", LIZJ(iMContact));
                String string2 = bundle.getString("position");
                if (string2 != null) {
                    jSONObject.put("position", string2);
                }
                String string3 = bundle.getString("enter_method");
                if (string3 != null) {
                    jSONObject.put("enter_method", string3);
                }
                jSONObject.put("content_type", C1367440lgk.LIZ(sharePackage.itemType));
                ISocialAffinityService iSocialAffinityService = (ISocialAffinityService) PluggableExtentionKt.pluggableSpi$default(ISocialAffinityService.class, false, false, false, 14, null);
                if (iSocialAffinityService != null && (mapLIZIZ = iSocialAffinityService.LIZIZ("default")) != null && (socialAffinityItem = mapLIZIZ.get(iMContact.getUid())) != null) {
                    dValueOf = Double.valueOf(socialAffinityItem.score);
                } else {
                    dValueOf = null;
                }
                jSONObject.put("affinity_score", dValueOf);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            C20684815ws.LJIJ("share_head_unclick_total", jSONObject);
        }
    }

    public static void LJI(String str, SharePackage sharePackage, IMContact iMContact, boolean z, long j, InterfaceC1493105sv interfaceC1493105sv) {
        String str2;
        Object objValueOf;
        String str3;
        C830490Whz c830490Whz = new C830490Whz();
        LIZ(iMContact, c830490Whz);
        c830490Whz.put("live_event_id", sharePackage.extras.getString("live_event_id"));
        c830490Whz.put("author_id", sharePackage.extras.getString("live_event_author_id"));
        c830490Whz.put("anchor_id", sharePackage.extras.getString("live_event_author_id"));
        Bundle bundle = sharePackage.extras;
        String str4 = CardStruct.IStatusCode.DEFAULT;
        String string = bundle.getString("live_event_is_anchor", CardStruct.IStatusCode.DEFAULT);
        c830490Whz.put("is_anchor", string);
        c830490Whz.put("chat_type", LIZJ(iMContact));
        if (z) {
            str2 = "chat_merge";
        } else {
            str2 = "chat_head";
        }
        c830490Whz.put("platform", str2);
        c830490Whz.put("enter_from", sharePackage.extras.getString("enter_from", ""));
        c830490Whz.put("event_page", sharePackage.extras.getString("enter_from", ""));
        if (!sharePackage.extras.getBoolean("is_paid_event", false)) {
            str4 = "1";
        }
        c830490Whz.put("is_free", str4);
        c830490Whz.put("live_event_status", sharePackage.extras.getString("live_event_status", ""));
        c830490Whz.put("live_event_type", sharePackage.extras.getString("live_event_type", ""));
        if (iMContact == null) {
            objValueOf = "";
        } else {
            objValueOf = Integer.valueOf(iMContact.displayPosition);
        }
        c830490Whz.put("rank_num", objValueOf.toString());
        if (iMContact == null) {
            c830490Whz.put("follow_status", "null");
        } else if (iMContact instanceof IMUser) {
            c830490Whz.put("follow_status", String.valueOf(((IMUser) iMContact).getFollowStatus()));
        }
        c830490Whz.put("business_type", sharePackage.extras.getString("business_type", ""));
        c830490Whz.put("has_registered", sharePackage.extras.getString("has_registered", ""));
        if (Intrinsics.LJFF(string, "1")) {
            str3 = "livesdk_live_event_anchor_share_confirm";
        } else {
            str3 = "livesdk_live_event_user_share_confirm";
        }
        c830490Whz.put("bind_id", LIZIZ(j, str3));
        interfaceC1493105sv.sendEvent(str, c830490Whz);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0617  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(com.ss.android.ugc.aweme.sharer.model.SharePackage r32, com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r33, boolean r34, java.lang.String r35, long r36, X.InterfaceC1493105sv r38, X.InterfaceC882700Yk0 r39) {
        /*
            Method dump skipped, instruction units count: 1690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1367430lgj.LIZLLL(com.ss.android.ugc.aweme.sharer.model.SharePackage, com.ss.android.ugc.aweme.im.contacts.api.model.IMContact, boolean, java.lang.String, long, X.05sv, X.0Yk0):void");
    }
}
