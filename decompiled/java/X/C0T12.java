package X;

import Y.ACallableS2S3400000_21;
import android.util.LruCache;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0T12, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T12 {
    public static final LruCache<String, C739660Szs> LIZ = new LruCache<>(10);

    public static void LIZIZ(Aweme aweme, String str) {
        if (aweme != null) {
            IAutoAScrollAbility iAutoAScrollAbility = C1386360mBG.LIZ;
            if (Intrinsics.LJFF(str, "homepage_hot")) {
                String aid = aweme.getAid();
                LruCache<String, C739660Szs> lruCache = LIZ;
                C739660Szs c739660Szs = lruCache.get(aid);
                if (c739660Szs != null) {
                    c739660Szs.LIZ = true;
                } else {
                    lruCache.put(aid, new C739660Szs(true, false));
                }
            }
        }
    }

    public static void LIZ(Aweme aweme, JSONObject jSONObject, C2189821An6 c2189821An6, String str, C19EG c19eg) {
        String str2;
        int pageType = c2189821An6.getPageType();
        if (pageType != 0) {
            if (pageType != 1) {
                if (pageType != 7) {
                    if (pageType != 9) {
                        if (pageType != 33) {
                            if (pageType != 45) {
                                if (pageType != 2000) {
                                    return;
                                } else {
                                    str2 = "others_homepage";
                                }
                            } else {
                                str2 = "homepage_series";
                            }
                        } else {
                            str2 = "homepage_popular";
                        }
                    } else {
                        str2 = "search";
                    }
                } else {
                    str2 = "homepage_nearby";
                }
            } else {
                str2 = "homepage_follow";
            }
        } else {
            str2 = "homepage_hot";
        }
        C15O7.LIZIZ(new ACallableS2S3400000_21(jSONObject, aweme, str, c2189821An6, str2, aweme.getAid(), c19eg, 1), C20684815ws.LJFF(), null);
    }
}
