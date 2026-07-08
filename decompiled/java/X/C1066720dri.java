package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.router.monitor.RouterPageMonitor;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0dri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066720dri {
    public static void LIZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgYo3LkgZ9PqdFjDuyRevYAcQHYPnWSA==", null));
    }

    public static final void LIZIZ(Context context, int i, String str) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("https://twitter.com/intent/user?user_id=");
                    sbLIZ.append(str);
                    LIZLLL(context, 402665474, C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("https://www.youtube.com/channel/");
            sbLIZ2.append(str);
            LIZLLL(context, 402665475, C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("https://instagram.com/_u/");
        sbLIZ3.append(str);
        LIZLLL(context, 402665473, C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static final void LIZJ(Context context, int i, String str) {
        final ThirdPartyBizCert thirdPartyBizCert = new ThirdPartyBizCert(i);
        new C828330WeV(thirdPartyBizCert).LIZIZ(context, str, new InterfaceC828360WeY() { // from class: X.0drj
            @Override // X.InterfaceC828360WeY
            public final void LIZ(Context context2, String str2) {
                SparkThirdContext sparkThirdContext = new SparkThirdContext();
                sparkThirdContext.bizCert = thirdPartyBizCert;
                sparkThirdContext.url = str2;
                C1554300qY8.LIZIZ(context2, sparkThirdContext);
            }
        }, null);
    }

    public static final void LIZLLL(Context context, int i, String str) {
        if (C300130Bpb.LIZ()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("owner_id", "");
            linkedHashMap.put("enter_from", "biolink_profile_page");
            linkedHashMap.put("report_type", "bio_link");
            SparkThirdContext sparkThirdContext = new SparkThirdContext();
            sparkThirdContext.bizCert = new ThirdPartyBizCert(i);
            sparkThirdContext.url = str;
            C1066700drg c1066700drg = C1066700drg.LIZ;
            C1066710drh c1066710drh = new C1066710drh(str);
            c1066700drg.getClass();
            sparkThirdContext.actions = C1066700drg.LIZLLL(context, c1066710drh, linkedHashMap);
            sparkThirdContext.disableOpenInSystem = true;
            C1554300qY8.LIZIZ(context, sparkThirdContext);
            return;
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(str);
        sparkContext.bizCert = new ThirdPartyBizCert(i);
        sparkContext.LJJL("need_report", true);
        sparkContext.LJJJZ("title", context.getString(2131848751));
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
    }
}
