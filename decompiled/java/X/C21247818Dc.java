package X;

import com.bytedance.android.bcm.impl.model.BcmPageInfo;
import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18Dc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21247818Dc {
    public static C21247918Dd LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            C21247918Dd c21247918Dd = new C21247918Dd();
            BcmPageInfo bcmPageInfoLIZ = PageInfoStack.Companion.LIZ().LIZ();
            bcmPageInfoLIZ.parse(jSONObject.optString("pageInfo"));
            c21247918Dd.LIZIZ = bcmPageInfoLIZ;
            c21247918Dd.LIZJ = EnumC21248118Df.NOT_SURE;
            c21247918Dd.LIZLLL = jSONObject.optBoolean("sentEvent");
            return c21247918Dd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
