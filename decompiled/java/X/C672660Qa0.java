package X;

import android.app.Activity;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qa0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672660Qa0 {
    public static final C672660Qa0 LIZ = new C672660Qa0();

    public static String LIZLLL() {
        Activity activityLIZ = C2421209eE.LIZ();
        if (activityLIZ == null || !(activityLIZ instanceof C19EG)) {
            return null;
        }
        String str = ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).hitTopTabExpExperiment() ? "Shop" : "SHOP_MALL";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("homepage_");
        C1584320rKY.LIZ.getClass();
        sbLIZ.append((String) C1584320rKY.LIZIZ((C19EG) activityLIZ, str).getFirst());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ(C0QER c0qer) {
        String string;
        Object objObtainEcLogData = c0qer.obtainEcLogData("search_entrance");
        if (objObtainEcLogData == null || (string = objObtainEcLogData.toString()) == null) {
            return c0qer.getEnterSearchFrom();
        }
        return string;
    }

    public static String LIZ(Uri uri, String str) {
        Object c098200Yq;
        String strLIZ = C416901jj.LIZ(uri, "extra_business_params");
        String strOptString = null;
        if (strLIZ != null) {
            try {
                strOptString = new JSONObject(strLIZ).optString("mall_extra_info");
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LJ(thM5exceptionOrNullimpl);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        return LIZIZ(str, strOptString);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C672660Qa0.LIZIZ(java.lang.String, java.lang.String):java.lang.String");
    }
}
