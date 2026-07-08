package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0w7D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1768250w7D {
    public static final C1768250w7D LIZ = new C1768250w7D();

    public static void LIZ(Uri uri, boolean z, String str, boolean z2) {
        int i;
        int i2;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            String string = uri.toString();
            String strLIZLLL = AnonymousClass0185.LIZLLL(uri);
            String strLJ = AnonymousClass0185.LJ(uri, "previous_page");
            String strLJ2 = AnonymousClass0185.LJ(uri, "deeplink_type");
            String strLJ3 = AnonymousClass0185.LJ(uri, "top_product_ids");
            if (a0.LJJJIL(strLJ3)) {
                strLJ3 = AnonymousClass0185.LJ(uri, "product_id_list");
            }
            String strLJ4 = AnonymousClass0185.LJ(uri, "creative_id");
            String strLJ5 = AnonymousClass0185.LJ(uri, "campaign_id");
            String strLJ6 = AnonymousClass0185.LJ(uri, "ttclid");
            boolean zBooleanValue = C1514430pVp.LIZLLL().booleanValue();
            if (z2) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            C1768000w6o c1768000w6o = C1768000w6o.LIZ;
            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("is_success", Integer.valueOf(i)), new Pair("error_info", str), new Pair("schema", string), new Pair("url", strLIZLLL), new Pair("previous_page", strLJ), new Pair("deeplink_type", strLJ2), new Pair("top_product_ids", strLJ3), new Pair("creative_id", strLJ4), new Pair("campaign_id", strLJ5), new Pair("ttclid", strLJ6), new Pair("is_first_launch", Integer.valueOf(zBooleanValue ? 1 : 0)), new Pair("is_cold_launch", Integer.valueOf(i2)));
            c1768000w6o.getClass();
            C1768000w6o.LIZIZ("rd_tiktokec_mall_lynx_route", mapLJIIJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
