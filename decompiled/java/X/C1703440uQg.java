package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.changeregion.sdk.model.Country;
import java.net.URLEncoder;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0uQg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1703440uQg extends AbstractC1703430uQf {
    public static final C1703440uQg LIZIZ = new C1703440uQg();
    public static final String LIZJ = "new_user";

    @Override // X.AbstractC1703340uQW
    public final String LIZJ() {
        return LIZJ;
    }

    @Override // X.AbstractC1703430uQf, X.AbstractC1703340uQW
    public final void LIZIZ(Context context) {
        String str;
        Object c098200Yq;
        Country country;
        String str2;
        if (!((Boolean) C1203604nK.LIZ.getValue()).booleanValue()) {
            super.LIZIZ(context);
            return;
        }
        C1703420uQe c1703420uQe = (C1703420uQe) this.LIZ.getValue();
        if (c1703420uQe != null && (str = c1703420uQe.LIZLLL) != null) {
            C1703440uQg c1703440uQg = LIZIZ;
            try {
                C1703420uQe c1703420uQe2 = (C1703420uQe) c1703440uQg.LIZ.getValue();
                String str3 = null;
                if (c1703420uQe2 == null || (country = c1703420uQe2.LIZJ) == null) {
                    C1703420uQe c1703420uQe3 = (C1703420uQe) c1703440uQg.LIZ.getValue();
                    if (c1703420uQe3 != null) {
                        country = c1703420uQe3.LIZIZ;
                    } else {
                        country = null;
                    }
                }
                Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
                if (country != null) {
                    str2 = country.code;
                } else {
                    str2 = null;
                }
                Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("reg_store_region", str2);
                if (country != null) {
                    str3 = country.name;
                }
                String strEncode = URLEncoder.encode(builderAppendQueryParameter.appendQueryParameter("signup_localized_country", str3).toString(), "UTF-8");
                InterfaceC1703650uR1 interfaceC1703650uR1LJ = C100C.LIZ.LJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://webview?url=");
                sbLIZ.append(strEncode);
                interfaceC1703650uR1LJ.LIZ(context, C2188811AlT.LIZIZ(sbLIZ), null, null, null);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
    }
}
