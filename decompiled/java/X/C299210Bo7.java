package X;

import com.ss.android.ugc.aweme.api.IGetApps;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;

/* JADX INFO: renamed from: X.0Bo7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C299210Bo7 {
    public static final C299210Bo7 LIZ = new C299210Bo7();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C299200Bo6());

    public static boolean LIZJ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static boolean LIZ(Aweme aweme, boolean z) {
        if (z) {
            return false;
        }
        if (((List) C299230Bo9.LIZIZ.getValue()).contains(C161N.LIZIZ.LJJJJLL())) {
            return false;
        }
        if (aweme == null) {
            return LIZJ();
        }
        if (aweme.isAd()) {
            IGetApps iGetApps = (IGetApps) PluggableExtentionKt.pluggableSpi$default(IGetApps.class, false, false, false, 14, null);
            if ((iGetApps != null && iGetApps.LIZJ(aweme)) || !LIZJ() || !((Boolean) C265520Aas.LIZ.getValue()).booleanValue()) {
                return false;
            }
        } else if (AwemeExtKt.isPhotoMode(aweme)) {
            if (!LIZJ() || !((Boolean) C265530Aat.LIZ.getValue()).booleanValue()) {
                return false;
            }
        } else {
            return LIZJ();
        }
        return true;
    }
}
