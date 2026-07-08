package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.DeadSystemException;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.FakeLandscapeInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SXF, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SXF {
    public static final List<Integer> LJIILL(Aweme aweme) {
        if (LJJI(aweme)) {
            return C1697810uHb.LJIIJJI(1, 2, 3, 4);
        }
        C713300RyS.LIZ.getClass();
        return C713300RyS.LIZIZ;
    }

    public static final int LJIILLIIL(Activity activity) {
        if (activity == null) {
            return 0;
        }
        try {
            if (activity.getRequestedOrientation() != activity.getResources().getConfiguration().orientation) {
                C0IKF.LIZ.getClass();
                C465320IMo.LIZ();
                Rect rectLIZ = C19738212Km.LIZ(activity).LIZ();
                int[] iArr = {rectLIZ.width(), rectLIZ.height()};
                if (activity.getRequestedOrientation() == 2) {
                    return iArr[1];
                }
                return iArr[0];
            }
        } catch (DeadSystemException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C1389340mG4.LIZJ(activity, null).LIZIZ;
    }

    public static final int LJIIZILJ(Activity activity) {
        int iN3;
        if (activity == null) {
            return 0;
        }
        if (activity.getRequestedOrientation() != activity.getResources().getConfiguration().orientation) {
            try {
                if (activity.getRequestedOrientation() == 2) {
                    iN3 = C786410Ut5.n3(activity.getResources(), "status_bar_height_landscape", "dimen", "android");
                } else {
                    iN3 = C786410Ut5.n3(activity.getResources(), "status_bar_height_portrait", "dimen", "android");
                }
                if (iN3 > 0) {
                    int dimensionPixelSize = activity.getResources().getDimensionPixelSize(iN3);
                    if (dimensionPixelSize > 0) {
                        return dimensionPixelSize;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return C497820Jfg.LIZJ(activity);
    }

    public static final boolean LJIJ(Aweme aweme) {
        if (C726220SeC.LIZIZ.LIZIZ(aweme) && LJIJI(aweme, true, true)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJJ(Aweme aweme) {
        return C726220SeC.LIZIZ.LIZJ(aweme);
    }

    public static final boolean LJIL(Context context) {
        Activity activityLIZ;
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null || !C726220SeC.LIZIZ.LIZ(activityLIZ)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJ(Aweme aweme) {
        String aid;
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "landscape_override_exp", "", true);
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(strLJJ, aid)) {
            C726220SeC c726220SeC = C726220SeC.LIZIZ;
            if (!c726220SeC.LIZJ(aweme) && (!c726220SeC.LIZIZ(aweme) || !LJIJI(aweme, true, true))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean LJJI(Aweme aweme) {
        if (aweme == null || !C10EU.LJIIZILJ(AwemeExtKt.getAuthorUid(aweme)) || C0C64.LJIILLIIL().LJIJ(31744, 0, "upload_landscape_post_opt_in_consumer", true) != 1) {
            return false;
        }
        return true;
    }

    public static final int LJJIIJ(Aweme aweme) {
        HashMap<String, String> mobParams;
        String str;
        if (aweme != null && (mobParams = aweme.getMobParams()) != null && mobParams.containsKey("landscape_type")) {
            HashMap<String, String> mobParams2 = aweme.getMobParams();
            if (mobParams2 == null || (str = mobParams2.get("landscape_type")) == null) {
                return 0;
            }
            return CastIntegerProtector.parseInt(str);
        }
        if (LJIJI(aweme, false, true)) {
            return 2;
        }
        if (LJIJJ(aweme)) {
            return 1;
        }
        return 0;
    }

    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final void LIZIZ(C2344009Gk c2344009Gk, C2189821An6 c2189821An6) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        HashMap<String, String> logExtra;
        HashMap<String, String> logExtra2;
        HashMap<String, String> logExtra3;
        HashMap<String, String> logExtra4;
        HashMap<String, String> logExtra5;
        HashMap<String, String> logExtra6;
        HashMap<String, String> logExtra7;
        if (C713290RyR.LIZ) {
            String str7 = null;
            if (c2189821An6 != null && (logExtra7 = c2189821An6.getLogExtra()) != null) {
                str = logExtra7.get("xy_orientation");
            } else {
                str = null;
            }
            c2344009Gk.LJFF("rotate_angle_xy", str);
            if (c2189821An6 != null && (logExtra6 = c2189821An6.getLogExtra()) != null) {
                str2 = logExtra6.get("z_orientation");
            } else {
                str2 = null;
            }
            c2344009Gk.LJFF("rotate_angle_z", str2);
            if (c2189821An6 != null && (logExtra5 = c2189821An6.getLogExtra()) != null) {
                str3 = logExtra5.get("landscape_enter_method");
            } else {
                str3 = null;
            }
            c2344009Gk.LJFF("landscape_enter_method", str3);
            if (c2189821An6 != null && (logExtra4 = c2189821An6.getLogExtra()) != null) {
                str4 = logExtra4.get("set_method");
            } else {
                str4 = null;
            }
            c2344009Gk.LJFF("set_method", str4);
            if (c2189821An6 != null && (logExtra3 = c2189821An6.getLogExtra()) != null) {
                str5 = logExtra3.get("default_app_rotate_status");
            } else {
                str5 = null;
            }
            c2344009Gk.LJFF("default_app_rotate_status", str5);
            if (c2189821An6 != null && (logExtra2 = c2189821An6.getLogExtra()) != null) {
                str6 = logExtra2.get("phone_rotate_status");
            } else {
                str6 = null;
            }
            c2344009Gk.LJFF("phone_rotate_status", str6);
            if (c2189821An6 != null && (logExtra = c2189821An6.getLogExtra()) != null) {
                str7 = logExtra.get("app_rotate_status");
            }
            c2344009Gk.LJFF("app_rotate_status", str7);
        }
    }

    public static final void LJIIL(C2344009Gk c2344009Gk, Aweme aweme) {
        Video video;
        int width;
        int height;
        HashMap<String, String> mobParams;
        String str;
        Integer numLJIIJJI;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        int iIntValue = 0;
        if (video != null) {
            width = video.getWidth();
        } else {
            width = 0;
        }
        int iAbs = Math.abs(width);
        if (video != null) {
            height = video.getHeight();
        } else {
            height = 0;
        }
        int iAbs2 = Math.abs(height);
        c2344009Gk.LIZJ(iAbs, "video_play_width");
        c2344009Gk.LIZJ(iAbs2, "video_play_height");
        c2344009Gk.LIZJ(LJJIIJ(aweme), "landscape_type");
        if (aweme != null && (mobParams = aweme.getMobParams()) != null && mobParams.containsKey("black_level")) {
            HashMap<String, String> mobParams2 = aweme.getMobParams();
            if (mobParams2 != null && (str = mobParams2.get("black_level")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
                iIntValue = numLJIIJJI.intValue();
            }
            c2344009Gk.LIZJ(iIntValue, "black_level");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJIJJLI(com.ss.android.ugc.aweme.feed.model.Aweme r4, android.content.Context r5) {
        /*
            r3 = 0
            if (r5 == 0) goto L28
            android.app.Activity r2 = X.C1388190mED.LIZ(r5)
            if (r2 == 0) goto L28
        L9:
            boolean r0 = r2 instanceof X.C0SZF
            if (r0 == 0) goto L35
            X.0SZF r2 = (X.C0SZF) r2
            if (r2 == 0) goto L35
            if (r4 == 0) goto L26
            java.lang.String r1 = r4.getAid()
        L17:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.LJJZZI()
            if (r0 == 0) goto L21
            java.lang.String r3 = r0.getAid()
        L21:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            return r0
        L26:
            r1 = r3
            goto L17
        L28:
            X.0mCc r0 = X.C1906580ziK.LJ()
            if (r0 == 0) goto L33
            android.app.Activity r2 = r0.LIZIZ()
            goto L9
        L33:
            r2 = r3
            goto L9
        L35:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SXF.LJIJJLI(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context):int");
    }

    public static final int LJJIII(Context context, Aweme aweme) {
        Activity activityLIZ;
        HashMap<String, String> mobParams;
        String str;
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null || !C726220SeC.LIZIZ.LIZ(activityLIZ)) {
            return 0;
        }
        if (aweme != null && (mobParams = aweme.getMobParams()) != null && mobParams.containsKey("is_landscape_screen")) {
            HashMap<String, String> mobParams2 = aweme.getMobParams();
            if (mobParams2 == null || (str = mobParams2.get("is_landscape_screen")) == null) {
                return 0;
            }
            return CastIntegerProtector.parseInt(str);
        }
        if (LJIJI(aweme, false, true)) {
            return 2;
        }
        if (!LJIJJ(aweme)) {
            return 0;
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    public static final void LJ(C2344009Gk c2344009Gk, Aweme aweme, String str) {
        String strLJJIFFI;
        Integer numValueOf;
        HashMap<String, String> mobParams;
        ?? LJFF;
        C0SZF c0szf;
        String aid;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null && LJIL(topActivity)) {
            Activity activityLIZIZ = null;
            String str2 = null;
            if (str != null) {
                strLJJIFFI = LJJIFFI(null, Boolean.FALSE, str);
            } else {
                strLJJIFFI = null;
            }
            c2344009Gk.LJFF("enter_from", strLJJIFFI);
            c2344009Gk.LJFF("landscape_previous_page", str);
            if (aweme != null) {
                ComponentCallbacks2 topActivity2 = ActivityStack.getTopActivity();
                if ((topActivity2 instanceof C0SZF) && (c0szf = (C0SZF) topActivity2) != null) {
                    String aid2 = aweme.getAid();
                    Aweme awemeLJJZZI = c0szf.LJJZZI();
                    if (awemeLJJZZI != null) {
                        aid = awemeLJJZZI.getAid();
                    } else {
                        aid = null;
                    }
                    LJFF = Intrinsics.LJFF(aid2, aid);
                } else {
                    LJFF = 0;
                }
                numValueOf = Integer.valueOf((int) LJFF);
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJ(numValueOf, "is_landscape_enter_group");
            c2344009Gk.LJFF("landscape_session_id", String.valueOf(ActivityStack.getTopActivity().hashCode()));
            if (aweme != null && (mobParams = aweme.getMobParams()) != null && mobParams.containsKey("is_landscape_screen")) {
                HashMap<String, String> mobParams2 = aweme.getMobParams();
                if (mobParams2 != null) {
                    str2 = mobParams2.get("is_landscape_screen");
                }
                c2344009Gk.LJFF("is_landscape_screen", str2);
                return;
            }
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null) {
                activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
            }
            c2344009Gk.LIZJ(LJJIII(activityLIZIZ, aweme), "is_landscape_screen");
        }
    }

    public static final void LJIILIIL(AbstractC1386130mAt abstractC1386130mAt, Aweme aweme, Context context) {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (((abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && LJIL(activityLIZIZ)) || (context != null && LJIL(context))) && aweme != null) {
            Map<String, String> map = abstractC1386130mAt.LJIILIIL;
            String requestId = aweme.getRequestId();
            if (requestId == null) {
                requestId = "";
            }
            ((ConcurrentHashMap) map).put("request_id", requestId);
            ((ConcurrentHashMap) abstractC1386130mAt.LJIILIIL).put("log_pb", aweme.getLogPbString());
        }
    }

    public static final void LJIILJJIL(C2344009Gk c2344009Gk, Aweme aweme, Context context) {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        Activity activityLIZIZ;
        String requestId;
        if ((context != null && LJIL(context)) || ((abstractC1387200mCcLJ = C1906580ziK.LJ()) != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && LJIL(activityLIZIZ))) {
            String logPbString = null;
            if (aweme != null) {
                requestId = aweme.getRequestId();
            } else {
                requestId = null;
            }
            c2344009Gk.LJFF("request_id", requestId);
            if (aweme != null) {
                logPbString = aweme.getLogPbString();
            }
            c2344009Gk.LJFF("log_pb", logPbString);
        }
    }

    public static final boolean LJIJI(Aweme aweme, boolean z, boolean z2) {
        float f;
        Video video;
        FakeLandscapeInfo fakeLandscapeInfo;
        if (aweme == null || LJIJJ(aweme)) {
            return false;
        }
        C713300RyS.LIZ.getClass();
        if (C713300RyS.LIZIZ.isEmpty()) {
            return false;
        }
        List<Integer> listLJIILL = LJIILL(aweme);
        if (LJJI(aweme)) {
            f = 1.0f;
        } else {
            float f2 = C0SXH.LIZ;
            f = C0SXH.LIZ;
        }
        if (aweme.getCreateTime() >= 1690992000 && (video = aweme.getVideo()) != null && (fakeLandscapeInfo = video.getFakeLandscapeInfo()) != null && fakeLandscapeInfo.isValid()) {
            if (z2) {
                if (!(listLJIILL instanceof Collection) || !listLJIILL.isEmpty()) {
                    Iterator<Integer> it2 = listLJIILL.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().intValue() == aweme.getVideo().getFakeLandscapeInfo().getFakeLandscapeVideoType()) {
                        }
                    }
                }
            }
            if (z && ((float) Math.floor(aweme.getVideo().getWidth() * (aweme.getVideo().getFakeLandscapeInfo().getRight() - aweme.getVideo().getFakeLandscapeInfo().getLeft()))) / ((float) Math.floor(aweme.getVideo().getHeight() * (aweme.getVideo().getFakeLandscapeInfo().getBottom() - aweme.getVideo().getFakeLandscapeInfo().getTop()))) < f) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final String LJJIFFI(Context context, Boolean bool, String str) {
        Activity topActivity;
        boolean z = C0SUD.LIZ;
        if (C0SUD.LIZ) {
            if (Intrinsics.LJFF(str, "homepage_hot") || Intrinsics.LJFF(str, "others_homepage") || Intrinsics.LJFF(str, "personal_homepage")) {
                Activity activityLIZ = C06MM.LIZ(context);
                if ((activityLIZ != null && LJIL(activityLIZ)) || (((topActivity = ActivityStack.getTopActivity()) != null && LJIL(topActivity)) || Intrinsics.LJFF(bool, Boolean.TRUE))) {
                    return "landscape_mode";
                }
                return str;
            }
            return str;
        }
        return str;
    }

    public static final void LIZJ(AbstractC1386130mAt abstractC1386130mAt, String str, Aweme aweme, Context context) {
        String strLJJIFFI;
        String strLJJIFFI2;
        Activity activityLIZIZ;
        HashMap<String, String> mobParams;
        Activity topActivity = ActivityStack.getTopActivity();
        int iLJJIII = 0;
        if ((topActivity != null && LJIL(topActivity)) || (context != null && LJIL(context))) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = null;
            if (str != null) {
                strLJJIFFI = LJJIFFI(context, Boolean.FALSE, str);
            } else {
                strLJJIFFI = null;
            }
            linkedHashMap.put("enter_from", strLJJIFFI);
            abstractC1386130mAt.LIZIZ(linkedHashMap);
            if (str != null) {
                strLJJIFFI2 = LJJIFFI(context, Boolean.FALSE, str);
            } else {
                strLJJIFFI2 = null;
            }
            abstractC1386130mAt.LJ("enter_from", strLJJIFFI2);
            abstractC1386130mAt.LJ("landscape_previous_page", str);
            if (aweme != null && (mobParams = aweme.getMobParams()) != null && mobParams.containsKey("is_landscape_screen")) {
                HashMap<String, String> mobParams2 = aweme.getMobParams();
                if (mobParams2 != null) {
                    str2 = mobParams2.get("is_landscape_screen");
                }
                abstractC1386130mAt.LJ("is_landscape_screen", str2);
            } else {
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                    iLJJIII = LJJIII(activityLIZIZ, aweme);
                }
                abstractC1386130mAt.LIZLLL(iLJJIII, "is_landscape_screen");
            }
            abstractC1386130mAt.LIZLLL(LJIJJLI(aweme, context), "is_landscape_enter_group");
            abstractC1386130mAt.LJ("landscape_session_id", String.valueOf(ActivityStack.getTopActivity().hashCode()));
        }
    }

    public static final void LIZLLL(AbstractC1386130mAt abstractC1386130mAt, C2189821An6 c2189821An6, Aweme aweme, Context context) {
        String strLJJIFFI;
        String str;
        String str2;
        String str3;
        HashMap<String, String> mobParams;
        int iLJIJJLI = 0;
        if (context != null && LJIL(context)) {
            String eventType = c2189821An6.getEventType();
            String str4 = null;
            if (eventType != null) {
                strLJJIFFI = LJJIFFI(null, Boolean.FALSE, eventType);
            } else {
                strLJJIFFI = null;
            }
            abstractC1386130mAt.LJ("enter_from", strLJJIFFI);
            abstractC1386130mAt.LJ("landscape_previous_page", c2189821An6.getEventType());
            if (aweme != null && (mobParams = aweme.getMobParams()) != null && mobParams.containsKey("is_landscape_screen")) {
                HashMap<String, String> mobParams2 = aweme.getMobParams();
                if (mobParams2 != null) {
                    str4 = mobParams2.get("is_landscape_screen");
                }
                abstractC1386130mAt.LJ("is_landscape_screen", str4);
            } else {
                abstractC1386130mAt.LIZLLL(LJJIII(context, aweme), "is_landscape_screen");
            }
            HashMap<String, String> logExtra = c2189821An6.getLogExtra();
            String str5 = "";
            if (logExtra == null || (str = logExtra.get("enter_group_id")) == null) {
                str = "";
            }
            abstractC1386130mAt.LJ("enter_group_id", str);
            HashMap<String, String> logExtra2 = c2189821An6.getLogExtra();
            if (logExtra2 == null || (str2 = logExtra2.get("enter_author_id")) == null) {
                str2 = "";
            }
            abstractC1386130mAt.LJ("enter_author_id", str2);
            HashMap<String, String> logExtra3 = c2189821An6.getLogExtra();
            if (logExtra3 != null && (str3 = logExtra3.get("landscape_session_id")) != null) {
                str5 = str3;
            }
            abstractC1386130mAt.LJ("landscape_session_id", str5);
            if (aweme != null) {
                iLJIJJLI = LJIJJLI(aweme, context);
            }
            abstractC1386130mAt.LIZLLL(iLJIJJLI, "is_landscape_enter_group");
        }
    }

    public static final void LJIIIIZZ(AbstractC1386130mAt abstractC1386130mAt, Aweme aweme, Context context, boolean z) {
        String str;
        HashMap<String, String> mobParams;
        Activity activityLIZIZ;
        if (C305460ByC.LIZ) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if ((abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && LJIL(activityLIZIZ)) || (context != null && LJIL(context))) {
                String logPbString = null;
                if (aweme != null && (mobParams = aweme.getMobParams()) != null) {
                    str = mobParams.get("landscape_screen_item_soure");
                } else {
                    str = null;
                }
                abstractC1386130mAt.LJ("landscape_screen_item_soure", str);
                abstractC1386130mAt.LJ("creator_panel_enter_group_id", C0SUC.LIZ(context).getLogExtra().get("creator_panel_enter_group_id"));
                if (z) {
                    if (aweme != null) {
                        logPbString = aweme.getLogPbString();
                    }
                    abstractC1386130mAt.LJ("log_pb", logPbString);
                }
            }
        }
    }

    public static final void LJFF(C2344009Gk c2344009Gk, C2189821An6 c2189821An6, Aweme aweme, Context context, boolean z) {
        String strLJJIFFI;
        String eventType;
        String str;
        String str2;
        HashMap<String, String> logExtra;
        String str3;
        String str4;
        String str5;
        HashMap<String, String> logExtra2;
        HashMap<String, String> logExtra3;
        HashMap<String, String> mobParams;
        String str6;
        String eventType2;
        if (context != null && LJIL(context)) {
            Integer numValueOf = null;
            if (c2189821An6 != null && (eventType2 = c2189821An6.getEventType()) != null) {
                strLJJIFFI = LJJIFFI(context, Boolean.FALSE, eventType2);
            } else {
                strLJJIFFI = null;
            }
            c2344009Gk.LJFF("enter_from", strLJJIFFI);
            if (c2189821An6 != null) {
                eventType = c2189821An6.getEventType();
            } else {
                eventType = null;
            }
            c2344009Gk.LJFF("landscape_previous_page", eventType);
            if (aweme != null && (mobParams = aweme.getMobParams()) != null && mobParams.containsKey("is_landscape_screen")) {
                HashMap<String, String> mobParams2 = aweme.getMobParams();
                if (mobParams2 != null) {
                    str6 = mobParams2.get("is_landscape_screen");
                } else {
                    str6 = null;
                }
                c2344009Gk.LJFF("is_landscape_screen", str6);
            } else {
                c2344009Gk.LIZJ(LJJIII(context, aweme), "is_landscape_screen");
            }
            String str7 = "";
            if (c2189821An6 == null || (logExtra3 = c2189821An6.getLogExtra()) == null || (str = logExtra3.get("enter_group_id")) == null) {
                str = "";
            }
            c2344009Gk.LJFF("enter_group_id", str);
            if (c2189821An6 == null || (logExtra2 = c2189821An6.getLogExtra()) == null || (str2 = logExtra2.get("enter_author_id")) == null) {
                str2 = "";
            }
            c2344009Gk.LJFF("enter_author_id", str2);
            if (z && c2189821An6 != null) {
                HashMap<String, String> logExtra4 = c2189821An6.getLogExtra();
                if (logExtra4 != null && (str5 = logExtra4.get("exit_group_id")) != null && C123100dR.LIZ(str5)) {
                    c2344009Gk.LJFF("exit_group_id", str5);
                }
                HashMap<String, String> logExtra5 = c2189821An6.getLogExtra();
                if (logExtra5 != null && (str4 = logExtra5.get("exit_author_id")) != null && C123100dR.LIZ(str4)) {
                    c2344009Gk.LJFF("exit_author_id", str4);
                }
            }
            if (c2189821An6 != null && (logExtra = c2189821An6.getLogExtra()) != null && (str3 = logExtra.get("landscape_session_id")) != null) {
                str7 = str3;
            }
            c2344009Gk.LJFF("landscape_session_id", str7);
            if (aweme != null) {
                numValueOf = Integer.valueOf(LJIJJLI(aweme, context));
            }
            c2344009Gk.LJ(numValueOf, "is_landscape_enter_group");
        }
    }

    public static final void LJIIIZ(C2344009Gk c2344009Gk, Aweme aweme, Context context, C2189821An6 c2189821An6, Boolean bool) {
        String str;
        HashMap<String, String> mobParams;
        Activity activityLIZIZ;
        if (C305460ByC.LIZ) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if ((abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && LJIL(activityLIZIZ)) || ((context != null && LJIL(context)) || Intrinsics.LJFF(bool, Boolean.TRUE))) {
                if (aweme != null && (mobParams = aweme.getMobParams()) != null) {
                    str = mobParams.get("landscape_screen_item_soure");
                } else {
                    str = null;
                }
                c2344009Gk.LJFF("landscape_screen_item_soure", str);
                if (c2189821An6 == null) {
                    c2189821An6 = C0SUC.LIZ(context);
                }
                c2344009Gk.LJFF("creator_panel_enter_group_id", c2189821An6.getLogExtra().get("creator_panel_enter_group_id"));
            }
        }
    }

    public static void LJII(C2344009Gk c2344009Gk, String str, Aweme aweme, Context context, Boolean bool, int i, int i2) {
        String strLJJIFFI;
        Integer numValueOf;
        Integer numValueOf2;
        Activity activityLIZ;
        String str2 = null;
        if ((i2 & 4) != 0) {
            context = null;
        }
        if ((i2 & 8) != 0) {
            bool = Boolean.FALSE;
        }
        int i3 = 0;
        if ((i2 & 16) != 0) {
            i = 0;
        }
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2) || (context != null && (activityLIZ = C06MM.LIZ(context)) != null && LJIL(activityLIZ))) {
            if (str != null) {
                strLJJIFFI = LJJIFFI(context, bool, str);
            } else {
                strLJJIFFI = null;
            }
            c2344009Gk.LJFF("enter_from", strLJJIFFI);
            c2344009Gk.LJFF("landscape_previous_page", str);
            if (context != null) {
                if (aweme != null) {
                    i = LJIJJLI(aweme, context);
                    numValueOf = Integer.valueOf(i);
                } else {
                    numValueOf = null;
                }
            } else {
                numValueOf = Integer.valueOf(i);
            }
            c2344009Gk.LJ(numValueOf, "is_landscape_enter_group");
            Activity activityLIZ2 = C06MM.LIZ(context);
            if (activityLIZ2 != null) {
                numValueOf2 = Integer.valueOf(activityLIZ2.hashCode());
            } else {
                numValueOf2 = null;
            }
            c2344009Gk.LJFF("landscape_session_id", String.valueOf(numValueOf2));
            if (aweme != null) {
                HashMap<String, String> mobParams = aweme.getMobParams();
                if (mobParams != null && mobParams.containsKey("is_landscape_screen")) {
                    HashMap<String, String> mobParams2 = aweme.getMobParams();
                    if (mobParams2 != null) {
                        str2 = mobParams2.get("is_landscape_screen");
                    }
                    c2344009Gk.LJFF("is_landscape_screen", str2);
                    return;
                }
                if (Intrinsics.LJFF(bool, bool2)) {
                    if (LJIJI(aweme, false, true)) {
                        i3 = 2;
                    } else if (LJIJJ(aweme)) {
                        i3 = 1;
                    }
                }
            }
            c2344009Gk.LIZJ(i3, "is_landscape_screen");
        }
    }
}
