package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ssx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735370Ssx {
    public static int LIZ(Aweme aweme) {
        if (aweme == null || aweme.getPhotoModeImageInfo() == null || aweme.getPhotoModeImageInfo().getTitle() == null || aweme.getPhotoModeImageInfo().getTitle().isEmpty()) {
            return 0;
        }
        return 1;
    }

    public static String LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return C786410Ut5.J3(new JSONObject().put("impr_id", str));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
            return "";
        }
    }

    public static String LIZJ(Aweme aweme) {
        if (aweme != null) {
            return aweme.getAid();
        }
        return "";
    }

    public static String LIZLLL(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return "";
        }
        return aweme.getAuthor().getUid();
    }

    public static String LJ(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (AwemeExtKt.isImage(aweme)) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static String LJFF(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (AwemeExtKt.isImage(aweme)) {
            return "photo";
        }
        if (AwemeSaaSExtKt.isLive(aweme)) {
            return "live";
        }
        return "video";
    }

    public static String LJI(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getDistributeType() == 1) {
            return "short";
        }
        if (aweme.getDistributeType() == 2) {
            return "long_direct";
        }
        if (aweme.getDistributeType() != 3) {
            return "";
        }
        return "long_with_short";
    }

    public static String LJII(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (AwemeSaaSExtKt.isForwardAweme(aweme)) {
            return AwemeExtKt.getAuthorUid(aweme);
        }
        if (!TextUtils.isEmpty(AwemeExtKt.getRepostFromUserId(aweme))) {
            return AwemeExtKt.getRepostFromUserId(aweme);
        }
        return AwemeExtKt.getAuthorUid(aweme);
    }

    public static String LJIIIIZZ(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (!AwemeSaaSExtKt.isForwardAweme(aweme) && TextUtils.isEmpty(AwemeExtKt.getRepostFromUserId(aweme))) {
            return "item";
        }
        return "repost";
    }

    public static String LJIIJ(Aweme aweme) {
        if (!C0XQ7.LJFF().isLogin() || aweme == null || aweme.getAuthor() == null || C10EU.LJIILLIIL(aweme.getAuthor())) {
            return "";
        }
        return String.valueOf(AwemeExtKt.getFollowStatus(aweme));
    }

    public static String LJIIJJI(String str) {
        return C584850Mwl.LIZ.LIZIZ(LJIJI(0, str));
    }

    public static Long LJIIL(Aweme aweme) {
        long id = 0;
        if (aweme == null) {
            return 0L;
        }
        if (aweme.getAwemeType() == 13 && (aweme = aweme.getForwardItem()) == null) {
            return 0L;
        }
        if (aweme.getMusic() != null) {
            id = aweme.getMusic().getId();
        }
        return Long.valueOf(id);
    }

    public static String LJIILIIL(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if ((aweme.getAwemeType() == 13 && (aweme = aweme.getForwardItem()) == null) || aweme.getMusic() == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(aweme.getMusic().getId());
        sbLIZ.append("");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static int LJIILL(Aweme aweme) {
        if (aweme != null && aweme.getPhotoModeImageInfo() != null && aweme.getPhotoModeImageInfo().getImageList() != null) {
            return aweme.getPhotoModeImageInfo().getImageList().size();
        }
        return 0;
    }

    public static String LJIILLIIL(Aweme aweme) {
        if (C727520SgI.LJFF(aweme)) {
            return "";
        }
        return C727520SgI.LIZLLL(aweme);
    }

    public static String LJIJJ(Aweme aweme) {
        if (aweme == null || aweme.getRequestId() == null) {
            return "";
        }
        return aweme.getRequestId();
    }

    public static String LJIJJLI(User user) {
        if (user == null) {
            return "";
        }
        if (user.getFollowStatus() == 2) {
            return "2";
        }
        if (user.getFollowStatus() == 1) {
            return "1";
        }
        if (user.getFollowerStatus() == 1) {
            return "3";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static String LJIL(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getStickerEntranceInfo() != null && !TextUtils.isEmpty(aweme.getStickerEntranceInfo().id)) {
            return aweme.getStickerEntranceInfo().id;
        }
        if (aweme.getAnchorInfo() == null || aweme.getAnchorInfo().getType().intValue() != 1002 || TextUtils.isEmpty(aweme.getAnchorInfo().getId())) {
            return "";
        }
        return aweme.getAnchorInfo().getId();
    }

    public static int LJJ(Aweme aweme) {
        if (aweme == null) {
            return 0;
        }
        if (aweme.getAwemeType() != 160) {
            if (aweme.getAwemeType() != 40 || aweme.getStoryType() != 2) {
                return 0;
            }
            return 1;
        }
        return 1;
    }

    public static HashMap<String, String> LJJI(Aweme aweme) {
        int length;
        int length2;
        HashMap<String, String> map = new HashMap<>();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        int length3 = 0;
        if (aweme != null && aweme.getPhotoModeImageInfo() != null && !TextUtils.isEmpty(aweme.getPhotoModeImageInfo().getTitle())) {
            length = aweme.getPhotoModeImageInfo().getTitle().length();
        } else {
            length = 0;
        }
        sbLIZ.append(length);
        sbLIZ.append("");
        map.put("title_length", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        if (aweme != null && !TextUtils.isEmpty(aweme.getDesc())) {
            length2 = aweme.getDesc().length();
        } else {
            length2 = 0;
        }
        sbLIZ2.append(length2);
        sbLIZ2.append("");
        map.put("description_length", C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        if (aweme != null && !TextUtils.isEmpty(aweme.getDesc())) {
            length3 = C0SUV.LIZ(aweme.getDesc()).length();
        }
        sbLIZ3.append(length3);
        sbLIZ3.append("");
        map.put("no_hashtag_description_length", C2188811AlT.LIZIZ(sbLIZ3));
        return map;
    }

    public static String LJJIFFI(User user) {
        if (user == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        if (user.getFollowerCount() >= 1000) {
            arrayList.add("creator");
        }
        if (user.getAccountType() == 3) {
            arrayList.add("ttba");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append((String) ListProtector.get(arrayList, i));
            if (i != arrayList.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static String LJJII(Aweme aweme) {
        if (aweme != null) {
            return AwemeExtKt.getAuthorUid(aweme);
        }
        return "";
    }

    public static boolean LJJIII(Aweme aweme) {
        if (aweme != null && aweme.getPhotoModeTextInfo() != null) {
            return aweme.getPhotoModeTextInfo().isComment2Post();
        }
        return false;
    }

    public static boolean LJJIIJ(Aweme aweme) {
        if (aweme != null && aweme.getPhotoModeTextInfo() != null) {
            return aweme.getPhotoModeTextInfo().isConvertedText();
        }
        return false;
    }

    public static boolean LJJIIJZLJL(Aweme aweme) {
        Video video = aweme.getVideo();
        if (video == null || video.getFakeLandscapeInfo() == null) {
            return false;
        }
        if (!video.getFakeLandscapeInfo().isValid()) {
            return false;
        }
        float fFloor = (float) (Math.floor(video.getWidth() * (r5.getRight() - r5.getLeft())) / Math.floor(video.getHeight() * (r5.getBottom() - r5.getTop())));
        float f = C0SXH.LIZ;
        if (fFloor < C0SXH.LIZ) {
            return false;
        }
        return true;
    }

    public static boolean LJJIIZ(String str) {
        return TextUtils.equals("challenge", str);
    }

    public static boolean LJJIIZI(String str) {
        return TextUtils.equals("homepage_familiar", str);
    }

    public static boolean LJJIJ(String str) {
        return TextUtils.equals("homepage_follow", str);
    }

    public static boolean LJJIJIIJI(String str) {
        return TextUtils.equals("single_song", str);
    }

    public static boolean LJJIJIIJIL(String str) {
        return TextUtils.equals("homepage_nearby", str);
    }

    public static boolean LJJIJIL(Aweme aweme) {
        float f = C2509009sO.LIZ;
        float f2 = C2509009sO.LIZ;
        if (f2 != 1.0f) {
            if (aweme != null && aweme.getVideo() != null && (aweme.getVideo().getWidth() * 1.0f) / aweme.getVideo().getHeight() >= f2) {
                return true;
            }
            return false;
        }
        if (aweme != null && aweme.getVideo() != null && aweme.getVideo().getWidth() > aweme.getVideo().getHeight()) {
            return true;
        }
        return false;
    }

    public static boolean LJJIJL(String str) {
        if (!"homepage_hot".equals(str) && !"homepage_follow".equals(str) && !"rec_follow".equals(str) && !"homepage_fresh".equals(str) && !"general_search".equals(str) && !"search_result".equals(str) && !"search_sug".equals(str) && !"homepage_channel".equals(str) && !"others_homepage".equals(str) && !"find_friends".equals(str) && !"challenge".equalsIgnoreCase(str) && !"hot_search_video_board".equals(str) && !"homepage_country".equals(str) && !"homepage_friends".equals(str) && !"personal_homepage".equals(str) && !"playlist".equals(str) && !"homepage_fresh_feed".equalsIgnoreCase(str) && !"like_list".equals(str) && !"homepage_familiar".equals(str) && !"homepage_explore".equals(str) && !TextUtils.equals("discovery_category", str) && !"homepage_nearby".equals(str) && !"compilation_detail".equals(str) && !"collection_video".equals(str) && !"single_song".equals(str) && !"chat".equals(str) && !"group_chat".equals(str) && !"creator_inspiration_feed".equals(str) && !"homepage_playmode_top".equals(str) && !"homepage_playmode_new".equals(str) && !"homepage_playmode_moodboost".equals(str) && !"playlist".equals(str) && !"homepage_series".equals(str) && !"homepage_nearby".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean LJJIJLIJ(Aweme aweme) {
        AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
        if (aweme != null && TextUtils.equals(AwemeExtKt.getAuthorUid(aweme), accountUserServiceLJIIJ.getCurUserId())) {
            return true;
        }
        return false;
    }

    public static boolean LJJIL(Aweme aweme) {
        if (aweme != null && aweme.getPhotoModeTextInfo() != null) {
            return aweme.getPhotoModeTextInfo().isText2Image();
        }
        return false;
    }

    public static JSONObject LJJIZ(Map<String, Object> map) {
        Object objLIZIZ;
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            HashMap map2 = (HashMap) map;
            for (String str : map2.keySet()) {
                try {
                    Object obj = map2.get(str);
                    if (TextUtils.equals("log_pb", str)) {
                        if (obj instanceof String) {
                            String str2 = (String) obj;
                            try {
                                objLIZIZ = new JSONObject(str2);
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                                objLIZIZ = C584850Mwl.LIZ.LIZIZ(str2);
                            }
                            jSONObject.put(str, objLIZIZ);
                        }
                    } else {
                        jSONObject.put(str, obj);
                    }
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2344809Gs.LJI(e2);
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject LJJJ(Map<String, String> map) {
        Object objLIZIZ;
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            HashMap map2 = (HashMap) map;
            for (String str : map2.keySet()) {
                try {
                    String str2 = (String) map2.get(str);
                    if (TextUtils.equals("log_pb", str)) {
                        try {
                            objLIZIZ = new JSONObject(str2);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            objLIZIZ = C584850Mwl.LIZ.LIZIZ(str2);
                        }
                        jSONObject.put(str, objLIZIZ);
                    } else {
                        jSONObject.put(str, str2);
                    }
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2344809Gs.LJI(e2);
                }
            }
        }
        return jSONObject;
    }

    public static String LJIIIZ(Aweme aweme, String str) {
        if (aweme != null && aweme.getLogPbBean() != null && !TextUtils.isEmpty(aweme.getLogPbBean().getImprId())) {
            return aweme.getLogPbBean().getImprId();
        }
        return str;
    }

    public static String LJIILJJIL(int i, Aweme aweme) {
        JSONObject jSONObjectLIZJ = ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).LIZJ(i, aweme);
        if (jSONObjectLIZJ != null) {
            return jSONObjectLIZJ.optString("order");
        }
        return "";
    }

    public static String LJIJ(int i, Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        String strLJIJI = LJIJI(i, aweme.getAid());
        if (strLJIJI != null && !strLJIJI.isEmpty()) {
            return strLJIJI;
        }
        if (aweme.getRequestId() == null) {
            return "";
        }
        return aweme.getRequestId();
    }

    public static String LJIJI(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(i);
        return ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).LIZLLL(C2188811AlT.LIZIZ(sbLIZ)).LIZ;
    }
}
