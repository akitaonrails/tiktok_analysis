package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialConnect;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.data.SocialEntranceData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS53S0500000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0idT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1250090idT {
    public static final C1250090idT LIZ = new C1250090idT();

    public static String LIZIZ(Context context, String str) {
        if (!Intrinsics.LJFF(str, "lemon8") || context == null) {
            return null;
        }
        if (C817410W4t.LIZIZ(context) && C817410W4t.LIZJ(context)) {
            return "jump";
        }
        return "in_app_viewer";
    }

    public static Map LIZJ(SocialEntranceData socialEntranceData, User user) {
        SocialConnect socialConnect;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (socialEntranceData != null && (socialConnect = socialEntranceData.getSocialConnect()) != null) {
            String youtubeChannelId = socialConnect.getYoutubeChannelId();
            if (youtubeChannelId != null && youtubeChannelId.length() != 0) {
                linkedHashMap.put(2, new C1242830iRl(socialConnect.getYoutubeChannelId(), socialConnect.getYoutubeChannelTitle()));
            }
            String insId = socialConnect.getInsId();
            if (insId != null && insId.length() != 0) {
                linkedHashMap.put(1, new C1242830iRl(socialConnect.getInsId(), socialConnect.getInsId()));
            }
            String lemon8OpenId = socialConnect.getLemon8OpenId();
            if (lemon8OpenId != null && lemon8OpenId.length() != 0 && user != null && ((user.getLemon8AccountType() == 1 && user.getLemon8ProfileSettings() == 1) || user.getLemon8AccountType() == 0)) {
                linkedHashMap.put(4, new C1242830iRl(socialConnect.getLemon8OpenId(), socialConnect.getLemon8UserName()));
            }
        }
        return linkedHashMap;
    }

    public static void LJ(Context context, C1250110idV c1250110idV, String str) {
        if (!Intrinsics.LJFF(c1250110idV.LIZ, "personal_homepage") && !Intrinsics.LJFF(c1250110idV.LIZ, "others_homepage")) {
            C1253930ijf c1253930ijf = C1253930ijf.LIZ;
            String str2 = c1250110idV.LIZ;
            String str3 = c1250110idV.LIZIZ;
            String str4 = c1250110idV.LIZJ;
            String strLIZIZ = LIZIZ(context, str);
            c1253930ijf.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            c2344009Gk.LJIIIIZZ("to_user_id", str3);
            c2344009Gk.LJIIIIZZ("group_id", str4);
            c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str);
            int i = 1;
            if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().LIZ() == 1) {
                i = 3;
            }
            c2344009Gk.LIZJ(i, "pad_interface_orientation");
            if (strLIZIZ != null) {
                c2344009Gk.LJFF("result", strLIZIZ);
            }
            C20684815ws.LJIILLIIL("profile_info_click", c2344009Gk.LIZ);
            return;
        }
        C1253930ijf.LJJIII(C1253930ijf.LIZ, c1250110idV.LIZ, c1250110idV.LIZIZ, c1250110idV.LIZJ, str, c1250110idV.LJ, LIZIZ(context, str), null, 64);
    }

    public static void LJFF(User user, int i, C1250110idV c1250110idV) {
        String uid;
        String str;
        String str2;
        C1253930ijf c1253930ijf = C1253930ijf.LIZ;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        if (((AbstractC848400XPy) iAccountUserServiceLJFF).LIZJ(uid)) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        String str3 = "";
        int followStatus = 3;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str2 = "";
                    } else {
                        str2 = "lemon8";
                    }
                } else {
                    str2 = "twitter";
                }
            } else {
                str2 = "youtube";
            }
        } else {
            str2 = "instagram";
        }
        String str4 = c1250110idV.LIZLLL;
        if (user == null) {
            followStatus = -1;
        } else {
            if (user.getFollowStatus() != 0 || user.getFollowerStatus() != 1) {
                followStatus = user.getFollowStatus();
            }
            String uid2 = user.getUid();
            if (uid2 != null) {
                str3 = uid2;
            }
        }
        String str5 = c1250110idV.LIZJ;
        c1253930ijf.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("platform", str2);
        c2344009Gk.LJIIIIZZ("previous_page", str4);
        c2344009Gk.LIZJ(followStatus, "follow_status");
        c2344009Gk.LJIIIIZZ("to_user_id", str3);
        c2344009Gk.LJIIIIZZ("group_id", str5);
        C20684815ws.LJIILLIIL("click_social_account", c2344009Gk.LIZ);
    }

    public static List LIZ(Context context, User user, C1250110idV c1250110idV, Map map) {
        String str;
        String str2;
        String str3;
        ArrayList arrayList = new ArrayList();
        if (user != null && context != null && !map.isEmpty()) {
            C1250100idU c1250100idU = new C1250100idU(user, map);
            String str4 = "";
            if (map.containsKey(4)) {
                Object[] objArr = new Object[1];
                C1242830iRl c1242830iRl = (C1242830iRl) map.get(4);
                if (c1242830iRl == null || (str3 = c1242830iRl.LIZIZ) == null) {
                    str3 = "";
                }
                objArr[0] = str3;
                arrayList.add(LIZLLL(context, c1250100idU, user, new C1250120idW(4, C786410Ut5.j4("Lemon8: %s", Arrays.copyOf(objArr, 1)), R.raw.icon_lemon8_smile), c1250110idV));
            }
            if (map.containsKey(1)) {
                String strLIZJ = C1216270hkv.LIZJ(2131837667);
                Object[] objArr2 = new Object[1];
                C1242830iRl c1242830iRl2 = (C1242830iRl) map.get(1);
                if (c1242830iRl2 == null || (str2 = c1242830iRl2.LIZIZ) == null) {
                    str2 = "";
                }
                objArr2[0] = str2;
                arrayList.add(LIZLLL(context, c1250100idU, user, new C1250120idW(1, C786410Ut5.j4(strLIZJ, Arrays.copyOf(objArr2, 1)), R.raw.icon_instagram), c1250110idV));
            }
            if (map.containsKey(2)) {
                String strLIZJ2 = C1216270hkv.LIZJ(2131837668);
                Object[] objArr3 = new Object[1];
                C1242830iRl c1242830iRl3 = (C1242830iRl) map.get(2);
                if (c1242830iRl3 != null && (str = c1242830iRl3.LIZIZ) != null) {
                    str4 = str;
                }
                objArr3[0] = str4;
                arrayList.add(LIZLLL(context, c1250100idU, user, new C1250120idW(2, C786410Ut5.j4(strLIZJ2, Arrays.copyOf(objArr3, 1)), R.raw.icon_youtube), c1250110idV));
            }
        }
        return arrayList;
    }

    public static void LJI(Context context, User user, C1250110idV c1250110idV, Map map) {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        int size = map.size();
        if (size == 1) {
            int iIntValue = ((Number) C13LP.LJJJJZ(map.keySet())).intValue();
            LJFF(user, iIntValue, c1250110idV);
            C1250100idU c1250100idU = new C1250100idU(user, map);
            if (context != null) {
                if (C300130Bpb.LIZ()) {
                    C1257420ipI.LIZIZ.startThirdSocialActivity(context, c1250100idU, iIntValue, true);
                    return;
                } else {
                    C1257420ipI.LIZIZ.startThirdSocialActivity(context, c1250100idU, iIntValue, false);
                    return;
                }
            }
            return;
        }
        if (size > 1) {
            LJ(context, c1250110idV, "social_button");
            List listLIZ = LIZ(context, user, c1250110idV, map);
            Activity activityLJFF = C2214201BlK.LJFF();
            if (activityLJFF != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLJFF)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                C1390850mIV c1390850mIV = new C1390850mIV();
                c1390850mIV.LJFF(listLIZ);
                c1390850mIV.LIZJ().show(supportFragmentManager, "third social");
            }
        }
    }

    public static C1247530iZL LIZLLL(Context context, C1250100idU c1250100idU, User user, C1250120idW c1250120idW, C1250110idV c1250110idV) {
        C1247530iZL c1247530iZL = new C1247530iZL();
        c1247530iZL.LIZJ(c1250120idW.LIZJ);
        c1247530iZL.LIZ = c1250120idW.LIZIZ;
        c1247530iZL.LIZ(new AwS53S0500000_19(context, c1250100idU, user, c1250120idW, c1250110idV, 1));
        return c1247530iZL;
    }
}
