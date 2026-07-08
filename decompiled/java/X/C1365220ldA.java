package X;

import android.os.Bundle;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.IShareMessageToastHelper;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.template.card.AwemeCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ldA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365220ldA {
    public static final C1365220ldA LIZ = new C1365220ldA();

    public static Map LJFF(SharePackage sharePackage) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Bundle bundle = sharePackage.extras;
        if (bundle != null) {
            String string = bundle.getString("video_sticker_status");
            if (string != null) {
                linkedHashMap.put("video_sticker_status", string);
            }
            String string2 = bundle.getString("from_group_id");
            if (string2 != null) {
                linkedHashMap.put("from_group_id", string2);
            }
            String string3 = bundle.getString("author_id");
            if (string3 != null) {
                linkedHashMap.put("author_id", string3);
            }
            String string4 = bundle.getString("story_music_with_mute");
            if (string4 != null) {
                linkedHashMap.put("story_music_with_mute", string4);
            }
            String string5 = bundle.getString("story_style_version");
            if (string5 != null) {
                linkedHashMap.put("story_style_version", string5);
            }
            String string6 = bundle.getString("story_type");
            if (string6 != null) {
                linkedHashMap.put("story_type", string6);
            }
            String string7 = bundle.getString("source");
            if (string7 != null) {
                linkedHashMap.put("source", string7);
            }
            String string8 = bundle.getString("prop_id");
            if (string8 != null) {
                linkedHashMap.put("prop_id", string8);
            }
            String string9 = bundle.getString("video_relation_tag");
            if (string9 != null) {
                linkedHashMap.put("video_relation_tag", string9);
            }
            String string10 = bundle.getString("enter_method");
            if (string10 != null) {
                if (Intrinsics.LJFF(string10, "share_panel")) {
                    string10 = "icon";
                }
            } else {
                string10 = "";
            }
            String string11 = bundle.getString("comment_id");
            if (string11 != null) {
                linkedHashMap.put("comment_id", string11);
            }
            String string12 = bundle.getString("comment_category");
            if (string12 != null) {
                linkedHashMap.put("comment_category", string12);
            }
            String string13 = bundle.getString("comment_message_type");
            if (string13 != null) {
                linkedHashMap.put("comment_message_type", string13);
            }
            String string14 = bundle.getString("audio_duration");
            if (string14 != null) {
                linkedHashMap.put("audio_duration", string14);
            }
            String string15 = bundle.getString("audio_volume");
            if (string15 != null) {
                linkedHashMap.put("audio_volume", string15);
            }
            String string16 = bundle.getString("audio_ori_loudness");
            if (string16 != null) {
                linkedHashMap.put("audio_ori_loudness", string16);
            }
            String string17 = bundle.getString("audio_ori_peak_loudness");
            if (string17 != null) {
                linkedHashMap.put("audio_ori_peak_loudness", string17);
            }
            String string18 = bundle.getString("comment_follow_status_to_user");
            if (string18 != null) {
                linkedHashMap.put("comment_follow_status_to_user", string18);
            }
            String string19 = bundle.getString("enter_type");
            if (string19 != null) {
                linkedHashMap.put("enter_type", string19);
            }
            String string20 = bundle.getString("share_repost_type");
            if (string20 != null) {
                linkedHashMap.put("share_repost_type", string20);
            }
            String string21 = bundle.getString("repost_type");
            if (string21 != null) {
                linkedHashMap.put("repost_type", string21);
            }
            LIZ.getClass();
            LIZ(bundle, linkedHashMap);
            linkedHashMap.put("enter_method", string10);
            String string22 = bundle.getString("panel_source");
            if (string22 != null) {
                linkedHashMap.put("panel_source", string22);
            }
            String string23 = bundle.getString("relation_tag");
            if (string23 != null) {
                linkedHashMap.put("relation_tag", string23);
            }
            String string24 = bundle.getString("school_content_type");
            if (string24 != null) {
                linkedHashMap.put("school_content_type", string24);
            }
            String string25 = bundle.getString("school_consumer_type");
            if (string25 != null) {
                linkedHashMap.put("school_consumer_type", string25);
            }
            LIZIZ(bundle, linkedHashMap);
        }
        return linkedHashMap;
    }

    public static void LIZ(Bundle bundle, Map map) {
        if (map != null) {
            map.put("forward_limit_label_category", String.valueOf(bundle.getInt("forward_limit_label_category", 0)));
        }
    }

    public static void LIZIZ(Bundle bundle, Map map) {
        String string;
        String string2;
        IAwemeService iAwemeService;
        Aweme awemeLLILZ;
        User author;
        if (bundle != null && (string = bundle.getString("friends_v3_track_scene")) != null && string.length() > 0 && 1 != 0) {
            map.put("friends_tab_version", "v3.0");
            map.put("is_detail_page", C1360320lVG.LIZLLL(Boolean.valueOf(C1360320lVG.LIZJ(string))));
            map.put("enter_position", "feed");
            String string3 = bundle.getString("story_collection_id");
            if (string3 != null && string3.length() > 0) {
                map.put("from_story_collection_id", string3);
            }
            CharSequence charSequence = (CharSequence) map.get("follow_status_relation");
            if ((charSequence == null || charSequence.length() == 0) && (string2 = bundle.getString("aid")) != null && string2.length() > 0 && (iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null)) != null && (awemeLLILZ = iAwemeService.LLILZ(string2)) != null && (author = awemeLLILZ.getAuthor()) != null) {
                map.put("follow_status_relation", String.valueOf(author.getFollowStatusRelation()));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(int r5, kotlin.jvm.functions.Function0 r6) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1365220ldA.LIZLLL(int, kotlin.jvm.functions.Function0):void");
    }

    public static List LJ(List list, Map map) {
        if (map.isEmpty()) {
            return Collections.singletonList(new Pair(list, null));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            String strLIZIZ = C1529905yr.LIZIZ((IMContact) obj);
            if (strLIZIZ != null && map.containsKey(strLIZIZ)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list2 = (List) pair.getFirst();
        List list3 = (List) pair.getSecond();
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        if (!list3.isEmpty()) {
            c13dvLIZIZ.add(new Pair(list3, null));
        }
        if (!list2.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : list2) {
                Object obj3 = map.get(C1529905yr.LIZIZ((IMContact) obj2));
                Object arrayList3 = linkedHashMap.get(obj3);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap.put(obj3, arrayList3);
                }
                ((List) arrayList3).add(obj2);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                c13dvLIZIZ.add(new Pair(entry.getValue(), entry.getKey()));
            }
        }
        return C1697820uHc.LIZ(c13dvLIZIZ);
    }

    public static void LJIIL(SharePackage sharePackage, List list) {
        String string = sharePackage.extras.getString("aid");
        if (string == null) {
            return;
        }
        Aweme awemeLLILZ = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILZ(string);
        IInternalShareApi.LIZ.getClass();
        C1370970lmR.LIZ().LIZIZ().LJJIJLIJ(list.size(), awemeLLILZ);
    }

    public static void LIZJ(SharePackage sharePackage, HashMap map, String str) {
        Object obj;
        boolean z = sharePackage.extras.getBoolean("is_share_live", false);
        String str2 = "1";
        if (z) {
            map.put("is_picture_share", "2");
            if (str != null && str.length() > 0) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_with_message", obj);
        }
        if (sharePackage.extras.getBoolean("key_screenshot_share", false)) {
            if (!z) {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_picture_share", str2);
            map.put("panel_source", "shot_in_app");
        }
    }

    public static void LJI(BaseTemplate baseTemplate, String str, List list) {
        if (baseTemplate instanceof DynamicCardTemplate) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof IMUser) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String uid = ((BaseContact) it2.next()).getUid();
                if (C123100dR.LIZ(uid) && uid != null) {
                    arrayList2.add(uid);
                }
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof IMConversation) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                String conversationId = ((IMConversation) it3.next()).getConversationId();
                if (C123100dR.LIZ(conversationId) && conversationId != null) {
                    arrayList4.add(conversationId);
                }
            }
            String strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList4, ",", null, null, 0, null, null, 62);
            long serverTimeMills = NetworkUtils.getServerTimeMills();
            new C1061730djf();
            C1548820qPI.LIZIZ(new C397901gf(serverTimeMills, C1061730djf.LIZLLL(C2097608Jq.LJIIJ(new Pair("msg_scene", str), new Pair("msg_type", Integer.valueOf(((DynamicCardTemplate) baseTemplate).getMessageType())), new Pair("uids", strLJJLIIIJ), new Pair("group_ids", strLJJLIIIJ2))), "ShareMessageEvent"));
        }
    }

    public static void LJIIJJI(SendMessageTemplateTask sendMessageTemplateTask, SharePackage sharePackage, Map map) {
        UrlModel urlModel;
        List<String> urlList;
        Object objLJJJLL;
        if (sendMessageTemplateTask.template instanceof AwemeCardTemplate) {
            Serializable serializable = sharePackage.extras.getSerializable("video_cover");
            if ((serializable instanceof UrlModel) && (urlModel = (UrlModel) serializable) != null && (urlList = urlModel.getUrlList()) != null && (objLJJJLL = C13LP.LJJJLL(urlList)) != null) {
                map.put("video_cover", objLJJJLL);
            }
        }
    }

    public static void LJIIIZ(SharePackage sharePackage, SendMessageEventParcel sendMessageEventParcel, List list, Integer num) {
        int size;
        boolean z;
        IShareMessageToastHelper iShareMessageToastHelperLIZ;
        int size2;
        String str;
        boolean z2 = sharePackage.extras.getBoolean("cancel_story_share_toast", false);
        boolean z3 = sharePackage.extras.getBoolean("show_tips_until_cancel", false);
        if (!z2 && !z3) {
            IShareMessageToastHelper.LIZ.getClass();
            IShareMessageToastHelper iShareMessageToastHelperLIZ2 = C913340ZsK.LIZ();
            if (iShareMessageToastHelperLIZ2 != null && iShareMessageToastHelperLIZ2.xs(sharePackage.itemType) && (iShareMessageToastHelperLIZ = C913340ZsK.LIZ()) != null) {
                String str2 = sharePackage.itemType;
                String str3 = sendMessageEventParcel.enterFrom;
                String string = sharePackage.extras.getString("enter_method");
                if (string == null) {
                    string = "";
                }
                String string2 = sharePackage.extras.getString("aid");
                boolean z4 = sharePackage.extras.getBoolean("is_new_group", false);
                boolean z5 = sharePackage.extras.getBoolean("is_create_group_and_share", false);
                if (num != null) {
                    size2 = num.intValue();
                } else {
                    size2 = list.size();
                }
                int size3 = size2 - list.size();
                String strLIZ = C1766306vt.LIZ(list);
                String string3 = sharePackage.extras.getString("panel_source");
                boolean z6 = sharePackage.extras.getBoolean("force_not_inbox", false);
                SendMessageTemplateTask sendMessageTemplateTask = sharePackage.sendMessageTemplateTask;
                if (sendMessageTemplateTask != null) {
                    str = sendMessageTemplateTask.scene;
                } else {
                    str = null;
                }
                C1365810le7 c1365810le7 = new C1365810le7(list, str2, str3, string, string2, z4, z5, size3, strLIZ, null, str, string3, z6, false, 8704);
                C1365220ldA c1365220ldA = LIZ;
                String str4 = sharePackage.itemType;
                AwS422S0200000_21 awS422S0200000_21 = new AwS422S0200000_21(iShareMessageToastHelperLIZ, c1365810le7, 98);
                c1365220ldA.getClass();
                if (Intrinsics.LJFF(str4, "imagine_studio")) {
                    C0CNO.LIZLLL(0L, new AwS565S0100000_21(awS422S0200000_21, (Function0<Unit>) 1373));
                    return;
                } else {
                    awS422S0200000_21.invoke();
                    return;
                }
            }
        }
        String string4 = sharePackage.extras.getString("current_conv_id");
        if (list.size() == 1 && string4 != null) {
            IMContact iMContact = (IMContact) C13LP.LJJJJZI(list);
            if (iMContact instanceof IMConversation) {
                if (Intrinsics.LJFF(string4, ((IMConversation) iMContact).getConversationId())) {
                    return;
                }
            } else if ((iMContact instanceof IMUser) && Intrinsics.LJFF(string4, C0YNP.LJ(iMContact.getUid()))) {
                return;
            }
        }
        if (num != null) {
            size = num.intValue();
        } else {
            size = list.size();
        }
        IMContact iMContact2 = (IMContact) C13LP.LJJJLL(list);
        if (size > 1) {
            z = true;
        } else {
            z = false;
        }
        C1365870leD c1365870leD = new C1365870leD(list, iMContact2, size, z, sharePackage.itemType, sendMessageEventParcel.enterFrom, sharePackage.extras.getString("enter_method"), sharePackage.extras.getString("aid"), null, sharePackage.extras.getBoolean("is_new_group", false), sharePackage.extras.getBoolean("is_create_group_and_share", false), z2);
        c1365870leD.LJIIL = z3;
        c1365870leD.LJIIJJI = sharePackage.extras.getInt("context_id", 0);
        C1440005kM.LIZ(c1365870leD);
    }

    public static void LJIIJ(SharePackage sharePackage, SendMessageEventParcel sendMessageEventParcel, List list, Integer num) {
        int size;
        IShareMessageToastHelper.LIZ.getClass();
        IShareMessageToastHelper iShareMessageToastHelperLIZ = C913340ZsK.LIZ();
        if (iShareMessageToastHelperLIZ != null) {
            String str = sharePackage.itemType;
            String str2 = sendMessageEventParcel.enterFrom;
            String string = sharePackage.extras.getString("enter_method");
            String str3 = "";
            if (string == null) {
                string = "";
            }
            String string2 = sharePackage.extras.getString("aid");
            boolean z = sharePackage.extras.getBoolean("is_new_group", false);
            boolean z2 = sharePackage.extras.getBoolean("is_create_group_and_share", false);
            if (num != null) {
                size = num.intValue();
            } else {
                size = list.size();
            }
            int size2 = size - list.size();
            String strLIZ = C1766306vt.LIZ(list);
            String string3 = sharePackage.extras.getString("streak_panel_scene");
            if (string3 != null) {
                str3 = string3;
            }
            C1365810le7 c1365810le7 = new C1365810le7(list, str, str2, string, string2, z, z2, size2, strLIZ, str3, null, null, false, false, 15360);
            C1365220ldA c1365220ldA = LIZ;
            String str4 = sharePackage.itemType;
            AwS422S0200000_21 awS422S0200000_21 = new AwS422S0200000_21(iShareMessageToastHelperLIZ, c1365810le7, 99);
            c1365220ldA.getClass();
            if (Intrinsics.LJFF(str4, "imagine_studio")) {
                C0CNO.LIZLLL(0L, new AwS565S0100000_21(awS422S0200000_21, (Function0<Unit>) 1373));
            } else {
                awS422S0200000_21.invoke();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0238  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(final com.ss.android.ugc.aweme.sharer.model.SharePackage r29, final java.lang.String r30, final java.util.List r31, final X.InterfaceC1362600lYw r32, com.ss.android.ugc.aweme.im.message.content.BaseContent r33, java.util.Map r34, java.util.Map r35, boolean r36, java.lang.Integer r37, java.util.Map r38) {
        /*
            Method dump skipped, instruction units count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1365220ldA.LJII(com.ss.android.ugc.aweme.sharer.model.SharePackage, java.lang.String, java.util.List, X.0lYw, com.ss.android.ugc.aweme.im.message.content.BaseContent, java.util.Map, java.util.Map, boolean, java.lang.Integer, java.util.Map):void");
    }
}
