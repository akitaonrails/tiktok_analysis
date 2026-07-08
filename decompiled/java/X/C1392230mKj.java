package X;

import com.bytedance.hybrid.spark.page.SparkActivity;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mKj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392230mKj {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C1392240mKk c1392240mKk, AbstractC1387200mCc abstractC1387200mCc) {
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("client_key", c1392240mKk.LIZ), new Pair("name", c1392240mKk.LIZIZ), new Pair("path", c1392240mKk.LIZLLL), new Pair("link_description", c1392240mKk.LIZJ), new Pair("source", "post_by_mobile"));
        C1440005kM.LIZ(new C1799610wvn(new AnchorTransData(EnumC1430380nKG.MINIS_ANCHOR.getTYPE(), "", String.valueOf(mapLJIIIIZZ.get("name")), "", 4, "", null, true, String.valueOf(mapLJIIIIZZ.get("path")), "", Long.MAX_VALUE, "", "MINIS", true, null, C786410Ut5.J3(new JSONObject(mapLJIIIIZZ)), null, null, 0, -1, null, null)));
        AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
        int length = abstractC1387200mCcArrLJII.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            AbstractC1387200mCc abstractC1387200mCc2 = abstractC1387200mCcArrLJII[length];
            if ((abstractC1387200mCc2.LIZIZ() instanceof SparkActivity) && Intrinsics.LJFF(abstractC1387200mCc2, abstractC1387200mCc)) {
                abstractC1387200mCc2.LIZ();
                return;
            } else if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
