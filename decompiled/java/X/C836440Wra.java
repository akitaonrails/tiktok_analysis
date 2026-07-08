package X;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import kotlin.jvm.internal.AwS79S1300000_13;

/* JADX INFO: renamed from: X.0Wra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C836440Wra {
    public static final C836440Wra LIZ = new C836440Wra();

    public static final void LJ(String str) {
        LIZ("Login", null, null);
        LIZIZ("login", "product", str, new C20144713rx(939524356));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void LIZJ(String str, String str2) {
        if (str != null) {
            int i = 0;
            switch (str.hashCode()) {
                case -2090153577:
                    if (str.equals("mus_af_follow")) {
                        LIZ("Subscribe", "product", str2);
                    }
                    break;
                case -1617792023:
                    if (str.equals("video_view")) {
                        LIZIZ("Video_content", "product", str2, new C20144713rx(939524353));
                        LIZ("fb_mobile_content_view", "product", str2);
                    }
                    break;
                case -1101213402:
                    if (str.equals("collect_video")) {
                        LIZ("fb_mobile_add_to_wishlist", "product", str2);
                    }
                    break;
                case 70775934:
                    if (str.equals("start_upload")) {
                        LIZ("fb_mobile_initiated_checkout", null, null);
                    }
                    break;
                case 109413407:
                    if (str.equals("shoot")) {
                        LIZ("fb_mobile_add_payment_info", null, null);
                    }
                    break;
                case 1263148345:
                    if (str.equals("mus_af_comment")) {
                        LIZ("fb_mobile_rate", "product", str2);
                    }
                    break;
                case 2026292779:
                    if (str.equals("mus_af_like_video_1") && C836460Wrc.LIZ().getBoolean("is_first_like_success", true)) {
                        C836460Wrc.LIZ().edit().putBoolean("is_first_like_success", false).apply();
                        break;
                    }
                    break;
                case 2026292783:
                    if (str.equals("mus_af_like_video_5")) {
                        int i2 = C836460Wrc.LIZ().getInt("like_success_count", 0) + 1;
                        if (i2 != 5) {
                            i = i2;
                        }
                        C836460Wrc.LIZ().edit().putInt("like_success_count", i).apply();
                    }
                    break;
            }
        }
    }

    public static final void LJFF(C20144713rx c20144713rx, String str) {
        C844470XAv.LIZ.getClass();
        C820380WGe.LIZ(C844470XAv.LIZ(), c20144713rx, str, null);
    }

    public static final void LJI(C20144713rx c20144713rx, String str) {
        C844470XAv.LIZ.getClass();
        C820380WGe.LIZ(C844470XAv.LIZ(), c20144713rx, str, null);
    }

    public static void LIZ(String str, String str2, String str3) {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str2)) {
            C786410Ut5.LJJJI("fb_content_type", str2, bundle);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (TextUtils.equals(str, "fb_mobile_search")) {
                C786410Ut5.LJJJI("fb_search_string", str3, bundle);
            } else {
                C786410Ut5.LJJJI("fb_content_id", str3, bundle);
            }
        }
    }

    public static final void LIZLLL(String str, Map map, C20144713rx c20144713rx) {
        C844470XAv.LIZ.getClass();
        C820380WGe.LIZ(C844470XAv.LIZ(), c20144713rx, str, map);
    }

    public static void LIZIZ(String str, String str2, String str3, C20144713rx c20144713rx) {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str2)) {
            C786410Ut5.LJJJI("content_type", str2, bundle);
        }
        if (!TextUtils.isEmpty(str3)) {
            if (TextUtils.equals(str, "search")) {
                C786410Ut5.LJJJI("search_term", str3, bundle);
            } else {
                C786410Ut5.LJJJI("item_id", str3, bundle);
            }
        }
        C0WG6 c0wg6 = C0WG5.LIZIZ;
        C844470XAv.LIZ.getClass();
        C837720Wte.LIZ("Firebase", "logEvent", c20144713rx, new AwS79S1300000_13(str, bundle, c20144713rx, c0wg6.LIZ(C844470XAv.LIZ()), 1));
    }
}
