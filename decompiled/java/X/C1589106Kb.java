package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.pumbaa.hybrid.governance.router.settings.IsolatedWebPagesModel;
import java.util.Map;

/* JADX INFO: renamed from: X.06Kb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1589106Kb {
    public static final IsolatedWebPagesModel LIZ = new IsolatedWebPagesModel(C2097608Jq.LJ());

    public static final IsolatedWebPagesModel LIZIZ() {
        IsolatedWebPagesModel isolatedWebPagesModel = (IsolatedWebPagesModel) C821960WMg.LIZ(IsolatedWebPagesModel.class, "isolated_web_pages", LIZ);
        return isolatedWebPagesModel == null ? new IsolatedWebPagesModel(C2097608Jq.LJ()) : isolatedWebPagesModel;
    }

    public static final Integer LIZ(Uri uri) {
        Integer numValueOf;
        Map<String, String> map = LIZIZ().pages;
        String str = map.get(uri.getHost());
        if (str != null && (numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str))) != null) {
            return numValueOf;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(uri.getHost());
        sbLIZ.append(uri.getPath());
        String str2 = map.get(C2188811AlT.LIZIZ(sbLIZ));
        if (str2 == null) {
            return null;
        }
        return Integer.valueOf(CastIntegerProtector.parseInt(str2));
    }
}
