package X;

import Y.ACListenerS147S0100000_12;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0ifD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251170ifD {
    public static List<String> LJ;
    public static Long LJFF;
    public static Long LJI;
    public static C0T0J LJIIIIZZ;
    public static final C1251170ifD LIZ = new C1251170ifD();
    public static Map<String, Long> LIZIZ = new LinkedHashMap();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1122704aH());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C747850TVf());
    public static final BPEAHandler LJII = new BPEAHandler(Looper.getMainLooper());
    public static final C0T0I LJIIIZ = C0T0I.LL;

    public static SharedPreferences LIZIZ() {
        return (SharedPreferences) LIZLLL.getValue();
    }

    public static void LIZ(String str) {
        if (LIZIZ.containsKey(str)) {
            return;
        }
        if (LIZIZ.size() >= 20) {
            LIZIZ.entrySet().remove(C13LP.LJJJJZ(LIZIZ.entrySet()));
        }
        LIZIZ.put(str, Long.valueOf(System.currentTimeMillis()));
        LIZIZ().edit().putString("sp_stay_home_cache_video_id", GsonProtectorUtils.toJson(new Gson(), LIZIZ, (Type) LIZJ.getValue())).apply();
    }

    public static boolean LIZLLL(Aweme aweme) {
        boolean zIsSecret;
        C735280Sso.LIZ.getClass();
        if (!C735280Sso.LJFF(aweme) && !C735280Sso.LIZJ(aweme)) {
            if (aweme != null) {
                AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme);
                if (statusSafety == null || !statusSafety.isProhibited()) {
                    if (aweme.getAuthor() != null) {
                        C0XQ7.LJ();
                        if (C0XQ7.LIZ.LJIIJ().LIZJ(aweme.getAuthor().getUid()) && ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser() != null) {
                            zIsSecret = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isSecret();
                        } else {
                            zIsSecret = aweme.getAuthor().isSecret();
                        }
                        if (zIsSecret) {
                            return false;
                        }
                    }
                }
            }
            if (!LJIIIZ(aweme) || C0C64.LJIILLIIL().LJIJ(31744, 0, "stay_home_share_guide", true) == 0) {
                return true;
            }
            if (aweme != null && aweme.getAid() != null) {
                Long l = LIZIZ.get(aweme.getAid());
                if (l != null) {
                    l.longValue();
                    if (System.currentTimeMillis() - l.longValue() > 86400000) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public static boolean LJ(Aweme aweme) {
        if (aweme == null || TextUtils.isEmpty(aweme.getAid()) || LIZIZ.containsKey(aweme.getAid())) {
            return false;
        }
        int iLIZ = C1387310mCn.LIZ(System.currentTimeMillis());
        if (LIZIZ().getInt("sp_modified_button_date", -1) != iLIZ) {
            LIZIZ().edit().putInt("sp_modified_button_date", iLIZ).apply();
            LIZIZ().edit().putInt("sp_modified_button_count", 0).apply();
        } else {
            LIZIZ().edit().putInt("sp_modified_button_count", LIZIZ().getInt("sp_modified_button_count", 0) + 1).apply();
        }
        if (LIZIZ().getInt("sp_modified_button_count", 0) < 7) {
            if (aweme.getAid() != null) {
                LIZ(aweme.getAid());
            }
            return true;
        }
        return false;
    }

    public static boolean LJII(Aweme aweme) {
        int iLIZ;
        if (aweme == null || TextUtils.isEmpty(aweme.getAid()) || LIZIZ.containsKey(aweme.getAid()) || LIZIZ().getInt("sp_toast_guide_date", -1) == (iLIZ = C1387310mCn.LIZ(System.currentTimeMillis()))) {
            return false;
        }
        LIZIZ().edit().putInt("sp_toast_guide_date", iLIZ).apply();
        if (aweme.getAid() != null) {
            LIZ(aweme.getAid());
            return true;
        }
        return true;
    }

    public static boolean LJIIIZ(Aweme aweme) {
        List<TextExtraStruct> textExtra;
        String cid;
        List<String> listLIZJ;
        if (aweme != null && (textExtra = aweme.getTextExtra()) != null && textExtra.size() > 0) {
            if (LJ == null) {
                String strLIZIZ = C1238740iLA.LIZJ("user_growth").LIZIZ("stay_home_ids", "");
                if (!TextUtils.isEmpty(strLIZIZ)) {
                    try {
                        listLIZJ = JsonParseUtils.LIZJ(String.class, strLIZIZ);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (listLIZJ == null) {
                        listLIZJ = new ArrayList<>();
                    }
                    LJ = listLIZJ;
                } else {
                    listLIZJ = new ArrayList<>();
                    LJ = listLIZJ;
                }
            }
            List<String> list = LJ;
            if (list != null && list.size() > 0) {
                for (TextExtraStruct textExtraStruct : textExtra) {
                    for (String str : list) {
                        if (textExtraStruct != null && (cid = textExtraStruct.getCid()) != null && cid.equals(str)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean LJI(Aweme aweme, String str, boolean z) {
        if (aweme != null && str != null && !C729510SjV.LJJIJIL(aweme) && !C733510Spx.LIZ.LIZ.contains(str) && !z) {
            return true;
        }
        return false;
    }

    public static C0P0T LJIIIIZZ(Activity activity, View view, C09JN c09jn) {
        if (C1209960hak.LIZ(activity)) {
            return null;
        }
        C450720Hlu c450720Hlu = new C450720Hlu(activity);
        c450720Hlu.LJIIJ(2131858165);
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZIZ = view;
        c1391600mJi.LJIJJ = false;
        c1391600mJi.LJII = -1001L;
        c1391600mJi.LIZLLL = EnumC1235690iGF.START;
        c450720Hlu.LJIIIZ(true, new ACListenerS147S0100000_12(c09jn, 388));
        c450720Hlu.LIZJ(new AwS591S0100000_12(c09jn, (C09JN<Boolean>) 1009));
        C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
        c0p0tLIZIZ.show();
        return c0p0tLIZIZ;
    }

    public static boolean LJFF(Aweme aweme, boolean z, int i, String str) {
        if (aweme == null || str == null) {
            return false;
        }
        if (i == 1) {
            ShareInfo shareInfo = aweme.getShareInfo();
            if (shareInfo == null || shareInfo.getShareButtonDisplayMode() != 1) {
                return false;
            }
        } else if (i < 2) {
            return false;
        }
        if (!LJI(aweme, str, z)) {
            return false;
        }
        return true;
    }

    public static void LIZJ(String str, String str2, String str3, Aweme aweme, VideoShareViewModel videoShareViewModel) {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        String str4;
        if (videoShareViewModel != null) {
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = str3;
            }
            videoShareViewModel.LLILZ = str4;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("group_id", C735370Ssx.LIZJ(aweme));
        c2344009Gk.LJIIIIZZ("author_id", C735370Ssx.LIZLLL(aweme));
        c2344009Gk.LJIIIIZZ("highlight_cause", str2);
        c2344009Gk.LJFF("show_content", str3);
        if (aweme != null && aweme.getAwemeType() == 150) {
            c2344009Gk.LIZJ(150, "aweme_type");
            if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                c2344009Gk.LIZJ(imageList.size(), "pic_cnt");
            }
        }
        C20684815ws.LJIILLIIL("share_highlight", c2344009Gk.LIZ);
    }
}
