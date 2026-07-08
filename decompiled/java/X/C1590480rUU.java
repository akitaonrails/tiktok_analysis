package X;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0rUU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1590480rUU {
    public static final C1590480rUU LIZ = new C1590480rUU();
    public static final Keva LIZIZ = Keva.getRepo("event_hot_area");
    public static final int LIZJ;
    public static final int LIZLLL;
    public static int LJ;
    public static int LJFF;
    public static JSONObject LJI;

    static {
        C844470XAv.LIZ.getClass();
        LIZJ = C12ES.LJIIJ(C844470XAv.LIZ());
        LIZLLL = C12ES.LJIIIIZZ(C844470XAv.LIZ());
    }

    public static final boolean LIZ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "event_hot_area_hit_full_rate", true, false) || C20684815ws.LJI("event_hot_area");
    }

    public static boolean LIZIZ() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static void LIZJ(final Aweme aweme, final String str, final JSONObject jSONObject) {
        Runnable runnable = new Runnable() { // from class: X.0rUT
            public final void LIZ() {
                JSONObject jSONObject2;
                String authorUid;
                String groupId;
                try {
                    if (!C1590580rUe.LIZ() || (jSONObject2 = jSONObject) == null) {
                        return;
                    }
                    int iDoubleValue = jSONObject2.has("downX") ? (int) ((Double) jSONObject.get("downX")).doubleValue() : 0;
                    int iDoubleValue2 = jSONObject.has("downY") ? (int) ((Double) jSONObject.get("downY")).doubleValue() : 0;
                    int iDoubleValue3 = jSONObject.has("upX") ? (int) ((Double) jSONObject.get("upX")).doubleValue() : 0;
                    int iDoubleValue4 = jSONObject.has("downY") ? (int) ((Double) jSONObject.get("upY")).doubleValue() : 0;
                    if (iDoubleValue == 0 && iDoubleValue2 == 0 && iDoubleValue3 == 0 && iDoubleValue4 == 0) {
                        return;
                    }
                    C1590480rUU.LIZ.getClass();
                    int i = C1590480rUU.LIZJ;
                    int i2 = iDoubleValue > i / 2 ? 2 : 1;
                    int i3 = iDoubleValue3 <= i / 2 ? 1 : 2;
                    boolean z = i2 == i3;
                    if (C1590480rUU.LIZ()) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("type", "scroll_feed");
                        c2344009Gk.LIZJ((iDoubleValue * 100) / i, "x");
                        int i4 = C1590480rUU.LIZLLL;
                        c2344009Gk.LIZJ((iDoubleValue2 * 100) / i4, "y");
                        c2344009Gk.LIZJ(((iDoubleValue3 - iDoubleValue) * 100) / i, "dx");
                        c2344009Gk.LIZJ(((iDoubleValue4 - iDoubleValue2) * 100) / i4, "dy");
                        if (!z) {
                            i3 = 0;
                        }
                        c2344009Gk.LIZJ(i3, "side");
                        c2344009Gk.LIZJ(C1590480rUU.LIZIZ() ? 1 : 0, "rtl");
                        String str2 = str;
                        String str3 = "";
                        if (str2 == null) {
                            str2 = "";
                        }
                        c2344009Gk.LJIIIIZZ("enter_from", str2);
                        Aweme aweme2 = aweme;
                        c2344009Gk.LJ(aweme2 != null ? Integer.valueOf(aweme2.getAwemeType()) : "", "aweme_type");
                        Aweme aweme3 = aweme;
                        if (aweme3 == null || (authorUid = AwemeExtKt.getAuthorUid(aweme3)) == null) {
                            authorUid = "";
                        }
                        c2344009Gk.LJIIIIZZ("author_id", authorUid);
                        Aweme aweme4 = aweme;
                        if (aweme4 != null && (groupId = aweme4.getGroupId()) != null) {
                            str3 = groupId;
                        }
                        c2344009Gk.LJIIIIZZ("group_id", str3);
                        Aweme aweme5 = aweme;
                        c2344009Gk.LIZJ((aweme5 == null || !aweme5.isAd()) ? 0 : 1, "is_ads");
                        C20684815ws.LJIILLIIL("event_hot_area", c2344009Gk.LIZ);
                    }
                    Keva keva = C1590480rUU.LIZIZ;
                    keva.storeInt("scroll_feed", keva.getInt("scroll_feed", 0) + 1);
                    keva.storeLong("scroll_feed_time", System.currentTimeMillis());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2276411E8h.LIZIZ.LIZIZ("common_feed", e);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("EventHotAreaMonitor@1879.mobFeedPageSelected$runnable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("EventHotAreaMonitor@1879.mobFeedPageSelected$runnable$1");
            }
        };
        if (((Boolean) C0NCO.LIZ.getValue()).booleanValue()) {
            C823050WQl.LIZIZ().execute(runnable);
        } else {
            runnable.run();
        }
    }

    public static void LJ(View view, String str, String str2) {
        if (C1590580rUe.LIZ() && (view instanceof C708910RrN)) {
            Rect rect = new Rect();
            C708910RrN c708910RrN = (C708910RrN) view;
            c708910RrN.getGlobalVisibleRect(rect);
            float[] lastTouchDownXY = c708910RrN.getLastTouchDownXY();
            if (str != null && ((Intrinsics.LJFF("homepage_hot", str) || Intrinsics.LJFF("homepage_follow", str)) && lastTouchDownXY.length == 2)) {
                int i = rect.left;
                int i2 = rect.right;
                int i3 = rect.top;
                int i4 = rect.bottom;
                int i5 = i2 - i;
                int i6 = i4 - i3;
                if (i5 != 0 && i6 != 0) {
                    float f = lastTouchDownXY[0];
                    float f2 = i;
                    if (f >= f2 && f <= i2) {
                        float f3 = lastTouchDownXY[1];
                        float f4 = i3;
                        if (f3 >= f4 && f3 <= i4) {
                            if (LIZ()) {
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LJIIIIZZ("type", str2);
                                float f5 = lastTouchDownXY[0] - f2;
                                float f6 = 100;
                                c2344009Gk.LIZIZ((f5 * f6) / i5, "x");
                                c2344009Gk.LIZIZ(((lastTouchDownXY[1] - f4) * f6) / i6, "y");
                                c2344009Gk.LIZJ(LIZIZ() ? 1 : 0, "rtl");
                                C20684815ws.LJIILLIIL("widget_event_hot_area", c2344009Gk.LIZ);
                            }
                            Keva keva = LIZIZ;
                            keva.storeInt("widget_event_hot_area", keva.getInt("widget_event_hot_area", 0) + 1);
                            keva.storeLong("widget_event_hot_area_time", System.currentTimeMillis());
                        }
                    }
                }
            }
            float[] fArr = c708910RrN.LLILLL;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
        }
    }

    public static void LIZLLL(Float f, Float f2, Aweme aweme, String str) {
        int i;
        Object objValueOf;
        String authorUid;
        int i2;
        String groupId;
        if (C1590580rUe.LIZ() && f != null && f2 != null) {
            float fFloatValue = f.floatValue();
            int i3 = LIZJ;
            if (fFloatValue > i3 / 2) {
                i = 2;
            } else {
                i = 1;
            }
            if (LIZ()) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("type", "pause_play");
                float f3 = 100;
                c2344009Gk.LIZIZ((f.floatValue() * f3) / i3, "x");
                c2344009Gk.LIZIZ((f2.floatValue() * f3) / LIZLLL, "y");
                c2344009Gk.LIZJ(i, "side");
                c2344009Gk.LIZJ(LIZIZ() ? 1 : 0, "rtl");
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                c2344009Gk.LJIIIIZZ("enter_from", str);
                if (aweme == null) {
                    objValueOf = "";
                } else {
                    objValueOf = Integer.valueOf(aweme.getAwemeType());
                }
                c2344009Gk.LJ(objValueOf, "aweme_type");
                if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
                    authorUid = "";
                }
                c2344009Gk.LJIIIIZZ("author_id", authorUid);
                if (aweme != null && (groupId = aweme.getGroupId()) != null) {
                    str2 = groupId;
                }
                c2344009Gk.LJIIIIZZ("group_id", str2);
                if (aweme != null && aweme.isAd() && aweme.getAwemeType() == 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                c2344009Gk.LIZJ(i2, "is_ads");
                C20684815ws.LJIILLIIL("event_hot_area", c2344009Gk.LIZ);
            }
            Keva keva = LIZIZ;
            keva.storeInt("pause_play", keva.getInt("pause_play", 0) + 1);
            keva.storeLong("pause_play_time", System.currentTimeMillis());
        }
    }
}
