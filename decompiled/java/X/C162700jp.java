package X;

import com.ss.android.ugc.aweme.feed.ab.FeedResponseFilterRoutingConfig;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00jp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C162700jp {
    public static final FeedResponseFilterRoutingConfig LIZ = new FeedResponseFilterRoutingConfig(false, 0, null, 7, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(393));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(394));

    public static int LIZ(String str) {
        C01GW c01gw = LIZIZ;
        if (!((FeedResponseFilterRoutingConfig) c01gw.getValue()).enable) {
            return 1;
        }
        Integer num = (Integer) ((LinkedHashMap) LIZJ.getValue()).get(a0.LJLIIIL(str).toString().toLowerCase(Locale.ROOT));
        if (num != null) {
            return num.intValue();
        }
        if (((FeedResponseFilterRoutingConfig) c01gw.getValue()).defaultRoute == 1) {
            return 1;
        }
        return 0;
    }

    public static final boolean LIZIZ(String str) {
        if (LIZ(str) == 1) {
            return true;
        }
        return false;
    }
}
