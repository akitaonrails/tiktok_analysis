package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.experiment.TiktokPoiLynxSettings;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hBB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194110hBB {
    public static final C1194110hBB LIZ = new C1194110hBB();
    public static String LIZIZ = "";

    public static void LIZ(final Context context, String str) {
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        String strLIZIZ = TiktokPoiLynxSettings.LIZIZ("poi_creator_center");
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        sparkContext.LJJLIIJ(strLIZIZ);
        sparkContext.LJJJLIIL(new InterfaceC1542790qFZ() { // from class: X.0hBC
            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC1542790qFZ
            public final C1725480v0E LJJJJI() {
                return !C444960Hcc.LIZJ(context) ? new C1725480v0E(R.anim.g6, R.anim.ed) : new C1725480v0E(R.anim.g5, R.anim.ed);
            }

            @Override // X.InterfaceC1542790qFZ
            public final C1725480v0E LJJLI() {
                return !C444960Hcc.LIZJ(context) ? new C1725480v0E(0, R.anim.g8) : new C1725480v0E(0, R.anim.g7);
            }
        });
        C1548420qOe.LIZIZ(sparkContext, "system_is_precise", Boolean.valueOf(iLocationBaseServiceForMT.LJ(context)));
        C1548420qOe.LIZIZ(sparkContext, "inapp_is_precise", Boolean.valueOf(iLocationBaseServiceForMT.LJJIJ()));
        C1548420qOe.LIZIZ(sparkContext, "enter_from", str);
        C1548420qOe.LIZIZ(sparkContext, "enc_data", LIZIZ);
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
    }
}
