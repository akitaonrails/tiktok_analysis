package X;

import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;

/* JADX INFO: renamed from: X.0hH4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1197760hH4 {
    public static final C1197760hH4 LIZ = new C1197760hH4();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C300200Bpi());

    public static boolean LIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static boolean LIZIZ(Context context) {
        ILocationBaseServiceForMT iLocationBaseServiceForMT;
        if (context == null || !LIZ() || (iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null)) == null || !iLocationBaseServiceForMT.LJJIIJZLJL(context)) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(Context context, TokenCert tokenCert) {
        if (!LIZIZ(context)) {
            return false;
        }
        C1207340hWW.LIZ.getClass();
        if (!C1207340hWW.LJIIJ(tokenCert)) {
            return false;
        }
        return true;
    }
}
