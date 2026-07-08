package X;

import Y.AfS45S1200000_19;
import android.app.Activity;
import android.content.Context;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS135S1200000_19;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0iXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246630iXt {
    public static void LIZIZ(Context context, SharePackage sharePackage, String str, Aweme aweme) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("oversize_cause", "100M");
            C20684815ws.LJIJ("share_snapchat_oversized", jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1233040iBy c1233040iBy = new C1233040iBy(context);
        c1233040iBy.LIZIZ(2131828998);
        c1233040iBy.LIZLLL();
        C786410Ut5.LJJJI("share_form", "url_form", sharePackage.extras);
        C1370320llO.LIZLLL(context, sharePackage, new C1375970luV(aweme, str, CertProviderManagerKt.findCert("bpea-98", 1476399115)));
    }

    public static void LIZ(Context context, SharePackage sharePackage, InterfaceC1369790lkX interfaceC1369790lkX, String str, Aweme aweme, Function2 function2) {
        C1373440lqQ c1373440lqQ = C1373440lqQ.LIZ;
        String str2 = sharePackage.itemType;
        String str3 = sharePackage.description;
        c1373440lqQ.getClass();
        String strLIZ = C1373440lqQ.LIZ(interfaceC1369790lkX, str2, str3);
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists() && c0vsj.length() <= 104857600) {
            C1374720lsU.LJ(sharePackage.url, sharePackage.itemType, interfaceC1369790lkX.key(), sharePackage, 4).LJIJJ(C11S5.LIZ()).LJIILIIL(C1701940uOG.LIZIZ()).LJIILLIIL(new AfS45S1200000_19(function2, str, sharePackage, 1));
            return;
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            C726220SeC c726220SeC = C726220SeC.LIZIZ;
            if (c726220SeC.LIZ(activityLIZ)) {
                Activity activityLJFF = C2214201BlK.LJFF();
                if (activityLJFF != null && !c726220SeC.LIZ(activityLJFF)) {
                    LIZIZ(activityLJFF, sharePackage, strLIZ, aweme);
                    return;
                } else {
                    C0TBO.LIZ(new AwS135S1200000_19(sharePackage, strLIZ, aweme, 1));
                    return;
                }
            }
        }
        LIZIZ(context, sharePackage, strLIZ, aweme);
    }
}
