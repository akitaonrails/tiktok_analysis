package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.push.api.IMPushApi;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.socialgame.api.experiment.EmojiGameItemConfig;
import com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo;
import com.ss.android.ugc.aweme.socialgame.api.model.StickerMatchStruct;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06lU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1701806lU {
    public static final C1701806lU LIZ = new C1701806lU();
    public static boolean LIZIZ;

    public static String LIZ(String str, String str2) {
        EmojiGameItemConfig emojiGameItemConfigLIZIZ;
        try {
            Uri uri = UriProtector.parse(str);
            if (Intrinsics.LJFF(uri.getScheme(), "aweme") && Intrinsics.LJFF(uri.getHost(), "social_game")) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "game_path");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "game_info");
                    C1227904rF.LIZ.getClass();
                    EmojiGameInfo emojiGameInfo = (EmojiGameInfo) C1227904rF.LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, EmojiGameInfo.class);
                    if (emojiGameInfo != null && (emojiGameItemConfigLIZIZ = LIZIZ(emojiGameInfo, str2)) != null) {
                        String str3 = emojiGameItemConfigLIZIZ.path;
                        if (str3 == null) {
                            return "";
                        }
                        return str3;
                    }
                    return "";
                }
                return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01f8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.socialgame.api.experiment.EmojiGameItemConfig LIZIZ(com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1701806lU.LIZIZ(com.ss.android.ugc.aweme.socialgame.api.model.EmojiGameInfo, java.lang.String):com.ss.android.ugc.aweme.socialgame.api.experiment.EmojiGameItemConfig");
    }

    public static String LIZLLL(String str, EmojiGameItemConfig emojiGameItemConfig) throws UnsupportedEncodingException {
        String str2;
        String strJ4;
        String str3 = C1505505uv.LIZ().baseUrl;
        String str4 = null;
        if (str3 == null) {
            return null;
        }
        String strEncode = URLEncoder.encode(str3, "UTF-8");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://webview?url=");
        sbLIZ.append(strEncode);
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sb = new StringBuilder();
        if (C1702106lX.LIZ != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("?gecko_channel=");
            if (emojiGameItemConfig == null || (str2 = emojiGameItemConfig.channel) == null) {
                str2 = "tiktok_game_projects";
            }
            sbLIZ2.append(str2);
            sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            if (emojiGameItemConfig != null && emojiGameItemConfig.channel != null) {
                strJ4 = "html/index.html";
            } else {
                Object[] objArr = new Object[1];
                if (emojiGameItemConfig != null) {
                    str4 = emojiGameItemConfig.path;
                }
                objArr[0] = str4;
                strJ4 = C786410Ut5.j4("html/%s.html", Arrays.copyOf(objArr, 1));
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("&gecko_bundle=");
            sbLIZ3.append(strJ4);
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
            String strEncode2 = URLEncoder.encode(sb.toString(), "UTF-8");
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append(strEncode2);
            return C2188811AlT.LIZIZ(sbLIZ4);
        }
        return strLIZIZ;
    }

    public static void LIZJ(Context context, String str, EmojiGameInfo emojiGameInfo, SessionInfo sessionInfo, final Map map, final EmojiGameItemConfig emojiGameItemConfig) {
        boolean z;
        String strLJJ;
        Object objLJJJLZIJ;
        Object objLJJJLZIJ2;
        String nickname;
        String uid;
        String appLanguage;
        String str2;
        String displayName;
        Integer num;
        String string;
        Map<String, String> map2;
        Map<String, String> map3;
        Integer num2;
        UrlModel avatarThumb;
        List<String> urlList;
        IMContact iMContactLJII;
        UrlModel displayAvatar;
        List<String> urlList2;
        StickerMatchStruct stickerMatchStruct;
        String str3 = "";
        int iIntValue = 0;
        String strLJJ2 = C0C64.LJIILLIIL().LJJ(31744, "emoji_game_url_debug", "", false);
        if (strLJJ2 != null && strLJJ2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || (strLJJ = C0C64.LJIILLIIL().LJJ(31744, "emoji_game_url_debug", "", false)) == null) {
            strLJJ = str;
        }
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(strLJJ);
        sparkContext.usePreload = true;
        Integer num3 = emojiGameInfo.emojiType;
        if (num3 != null) {
            if (num3.intValue() == 0) {
                String str4 = emojiGameInfo.emoji;
                if (str4 != null) {
                    String strLIZJ = C13WF.LIZJ(str4);
                    if (strLIZJ == null) {
                        strLIZJ = "";
                    }
                    sparkContext.LJJLIIIJ(strLIZJ, "emoji_text");
                }
            } else if (num3.intValue() == 1 && (stickerMatchStruct = emojiGameInfo.stickerStruct) != null) {
                String str5 = stickerMatchStruct.stickerUrl;
                if (str5 == null) {
                    str5 = "";
                }
                sparkContext.LJJLIIIJ(str5, "sticker_url");
            }
        }
        LIZ.getClass();
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(sessionInfo.getConversationId());
        if (c0y8tLIZ == null) {
            objLJJJLZIJ = "";
        } else if (sessionInfo.isSingleChat()) {
            IIMContactUtilService.LIZ.getClass();
            IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
            if (iIMContactUtilServiceLIZ != null) {
                iMContactLJII = iIMContactUtilServiceLIZ.LJI(c0y8tLIZ);
                if (iMContactLJII != null || (displayAvatar = iMContactLJII.getDisplayAvatar()) == null || (urlList2 = displayAvatar.getUrlList()) == null || (objLJJJLZIJ = C13LP.LJJJLZIJ(0, urlList2)) == null) {
                }
            }
            objLJJJLZIJ = "";
        } else {
            if (sessionInfo.isGroupChat()) {
                IIMContactUtilService.LIZ.getClass();
                IIMContactUtilService iIMContactUtilServiceLIZ2 = C913380ZsO.LIZ();
                if (iIMContactUtilServiceLIZ2 != null) {
                    iMContactLJII = iIMContactUtilServiceLIZ2.LJII(c0y8tLIZ);
                    if (iMContactLJII != null) {
                    }
                }
            }
            objLJJJLZIJ = "";
        }
        sparkContext.LJJLIIIJ(objLJJJLZIJ, "chat_avatar");
        User userLIZLLL = C461720I8s.LIZLLL();
        if (userLIZLLL == null || (avatarThumb = userLIZLLL.getAvatarThumb()) == null || (urlList = avatarThumb.getUrlList()) == null || (objLJJJLZIJ2 = C13LP.LJJJLZIJ(0, urlList)) == null) {
            objLJJJLZIJ2 = "";
        }
        sparkContext.LJJLIIIJ(objLJJJLZIJ2, "current_user_avatar");
        User userLIZLLL2 = C461720I8s.LIZLLL();
        if (userLIZLLL2 == null || (nickname = userLIZLLL2.getNickname()) == null) {
            nickname = "";
        }
        sparkContext.LJJLIIIJ(nickname, "current_user_name");
        User userLIZLLL3 = C461720I8s.LIZLLL();
        if (userLIZLLL3 == null || (uid = userLIZLLL3.getUid()) == null) {
            uid = "";
        }
        sparkContext.LJJLIIIJ(uid, "current_user_id");
        sparkContext.LJJLIIIJ(sessionInfo.getConversationId(), "conversation_id");
        ILanguageService iLanguageService = (ILanguageService) PluggableExtentionKt.pluggableSpi$default(ILanguageService.class, false, false, false, 14, null);
        if (iLanguageService == null || (appLanguage = iLanguageService.getAppLanguage()) == null) {
            appLanguage = "en";
        }
        sparkContext.LJJLIIIJ(appLanguage, "app_locale");
        sparkContext.LJJLIIIJ(String.valueOf(System.currentTimeMillis()), "click_entrance_timestamp");
        if (emojiGameItemConfig != null && (num2 = emojiGameItemConfig.id) != null) {
            iIntValue = num2.intValue();
        }
        sparkContext.LJJLIIIJ(Boolean.valueOf(!C1702006lW.LIZIZ(iIntValue)), "is_first_play");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.putAll(C1687906jF.LIZ(sessionInfo));
        sparkContext.LJJLIIIJ(linkedHashMap, "mob_params");
        if (sessionInfo.isSingleChat()) {
            str2 = "private";
        } else if (!sessionInfo.isGroupChat()) {
            str2 = "";
        } else {
            str2 = "group";
        }
        sparkContext.LJJLIIIJ(str2, "chat_type");
        IMUser singleChatFromUser = sessionInfo.getSingleChatFromUser();
        if (singleChatFromUser == null || (displayName = singleChatFromUser.getDisplayName()) == null) {
            displayName = "";
        }
        sparkContext.LJJLIIIJ(displayName, "chat_name");
        if (emojiGameItemConfig != null && (map3 = emojiGameItemConfig.config) != null) {
            for (Map.Entry<String, String> entry : map3.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    sparkContext.LJJLIIIJ(value, key);
                }
            }
        }
        sparkContext.LJJJZ("hide_nav_bar", "1");
        sparkContext.LJJJZ("disable_swipe", "1");
        sparkContext.LJJJZ("trans_status_bar", "1");
        if (emojiGameItemConfig != null && (map2 = emojiGameItemConfig.customQueryParams) != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                String key2 = entry2.getKey();
                String value2 = entry2.getValue();
                if (key2 == null || value2 == null) {
                    return;
                } else {
                    sparkContext.LJJJZ(key2, value2);
                }
            }
        }
        sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.06lV
            @Override // X.AbstractC1542100qES
            public final void LJLJLLL(SparkContext sparkContext2) {
                int iIntValue2;
                Integer num4;
                Integer num5;
                C1701806lU.LIZ.getClass();
                C1701806lU.LIZIZ = true;
                if (C1701706lT.LIZ) {
                    IMPushApi.LIZ.getClass();
                    C817570W5j.LIZ().LIZLLL().LIZLLL(1, "social_emoji_game", "social_emoji_game", true);
                }
                EmojiGameItemConfig emojiGameItemConfig2 = emojiGameItemConfig;
                int iIntValue3 = 0;
                if (emojiGameItemConfig2 != null && (num5 = emojiGameItemConfig2.id) != null) {
                    iIntValue2 = num5.intValue();
                } else {
                    iIntValue2 = 0;
                }
                if (!C1702006lW.LIZIZ(iIntValue2)) {
                    EmojiGameItemConfig emojiGameItemConfig3 = emojiGameItemConfig;
                    if (emojiGameItemConfig3 != null && (num4 = emojiGameItemConfig3.id) != null) {
                        iIntValue3 = num4.intValue();
                    }
                    Keva kevaLIZ = C1702006lW.LIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("has_played");
                    sbLIZ.append(iIntValue3);
                    kevaLIZ.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
                }
            }

            @Override // X.AbstractC1542100qES
            public final void LJLL(SparkContext sparkContext2) {
                C1701806lU.LIZ.getClass();
                C1701806lU.LIZIZ = false;
                if (C1701706lT.LIZ) {
                    IMPushApi.LIZ.getClass();
                    C817570W5j.LIZ().LIZLLL().LIZLLL(0, "social_emoji_game", "social_emoji_game", false);
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str6, String str7) {
                String string2;
                Integer num4;
                Map<String, String> map4 = map;
                EmojiGameItemConfig emojiGameItemConfig2 = emojiGameItemConfig;
                String str8 = "";
                if (emojiGameItemConfig2 == null || (num4 = emojiGameItemConfig2.id) == null || (string2 = num4.toString()) == null) {
                    string2 = "";
                }
                if (str7 == null) {
                    str7 = "";
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJFF("game_id", string2);
                String str9 = map4.get("enter_method");
                if (str9 != null) {
                    str8 = str9;
                }
                c2344009Gk.LJFF("enter_method", str8);
                c2344009Gk.LJFF("error_reason", str7);
                c2344009Gk.LIZJ(C1702006lW.LIZIZ(CastIntegerProtector.parseInt(string2)) ? 1 : 0, "is_existing_player");
                C20684815ws.LJIILLIIL("social_game_load_failed", c2344009Gk.LIZ);
            }
        });
        if (emojiGameItemConfig != null && (num = emojiGameItemConfig.id) != null && (string = num.toString()) != null) {
            str3 = string;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("game_id", str3);
        c2344009Gk.LJII(C1687906jF.LIZ(sessionInfo));
        c2344009Gk.LJII(map);
        C20684815ws.LJIILLIIL("ttsocial_chat_emoji_game_click", c2344009Gk.LIZ);
        C1541950qED.LIZJ.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
    }
}
