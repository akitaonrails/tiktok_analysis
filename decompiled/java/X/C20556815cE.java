package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.solaria.SolariaProfile;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15cE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20556815cE {
    public static Float LIZ;

    public static C20558915cZ LIZIZ(Aweme aweme) {
        String str;
        SolariaProfile solariaProfile = aweme.getSolariaProfile();
        if (solariaProfile != null && (str = solariaProfile.profile) != null) {
            try {
                String strOptString = new JSONObject(str).optString("union_high_value_text_rect");
                if (strOptString == null || strOptString.length() == 0) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(strOptString);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("utr");
                if (jSONObjectOptJSONObject == null) {
                    return new C20558915cZ();
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("lt");
                if (jSONObjectOptJSONObject2 == null) {
                    return new C20558915cZ();
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("rd");
                if (jSONObjectOptJSONObject3 == null) {
                    return new C20558915cZ();
                }
                C20558915cZ c20558915cZ = new C20558915cZ();
                c20558915cZ.LIZ = jSONObject.optInt("w");
                c20558915cZ.LIZIZ = jSONObject.optInt("h");
                c20558915cZ.LIZJ = jSONObjectOptJSONObject2.optInt("x", -1);
                c20558915cZ.LIZLLL = jSONObjectOptJSONObject2.optInt("y", -1);
                c20558915cZ.LJ = jSONObjectOptJSONObject3.optInt("x", -1);
                c20558915cZ.LJFF = jSONObjectOptJSONObject3.optInt("y", -1);
                return c20558915cZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public static float LIZ(int i, int i2, Context context, Aweme aweme) {
        float fFloatValue = 0.0f;
        if (aweme != null && aweme.getVideo() != null && C277030AtR.LIZIZ) {
            if (LIZ == null) {
                LIZ = Float.valueOf(C497820Jfg.LIZJ(context));
            }
            C20558915cZ c20558915cZLIZIZ = LIZIZ(aweme);
            if (c20558915cZLIZIZ != null) {
                int height = (int) (i * (aweme.getVideo().getHeight() / aweme.getVideo().getWidth()));
                Float f = LIZ;
                if (f != null) {
                    fFloatValue = f.floatValue();
                }
                return C20557215cI.LIZ(c20558915cZLIZIZ, i2, height, fFloatValue) / i2;
            }
        }
        return 0.0f;
    }

    public static boolean LIZJ(Aweme aweme, int i, int i2, int i3, int i4, Context context) {
        EnumC584530MwF enumC584530MwFLIZ;
        float fFloatValue;
        VideoUrlModel playAddr;
        if (aweme != null && aweme.getVideo() != null && context != null) {
            int width = aweme.getVideo().getWidth();
            int height = aweme.getVideo().getHeight();
            Video video = aweme.getVideo();
            if ((video == null || video.getFakeLandscapeInfo() == null) && !aweme.isAd() && !AwemeExtKt.isPhotoMode(aweme) && (enumC584530MwFLIZ = C584070MvV.LIZ()) == EnumC584530MwF.DYNAMIC_BLUR) {
                Video video2 = aweme.getVideo();
                if (video2 != null && (playAddr = video2.getPlayAddr()) != null && playAddr.isHaveHdr()) {
                    return false;
                }
                if (C277030AtR.LIZIZ) {
                    VideoAdaptionParams videoAdaptionParams = new VideoAdaptionParams(i3, i4, width, height, null, true, ((Number) C0A0P.LIZ.getValue()).floatValue(), LIZIZ(aweme), enumC584530MwFLIZ, C444960Hcc.LIZIZ(), aweme.getAid(), false);
                    if (LIZ == null) {
                        LIZ = Float.valueOf(C497820Jfg.LIZJ(context));
                    }
                    Float f = LIZ;
                    if (f != null) {
                        fFloatValue = f.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    if (C20557215cI.LIZIZ(videoAdaptionParams, i3, i4, fFloatValue) || !C20557215cI.LIZLLL(videoAdaptionParams, i, i2, i3, i4)) {
                        return false;
                    }
                    return true;
                }
                return C20557215cI.LIZLLL(new VideoAdaptionParams(i3, i4, width, height, null, false, ((Number) C0A0P.LIZ.getValue()).floatValue(), null, enumC584530MwFLIZ, C444960Hcc.LIZIZ(), aweme.getAid(), false), i, i2, i3, i4);
            }
        }
        return false;
    }
}
