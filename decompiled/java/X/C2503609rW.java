package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09rW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2503609rW {
    public static final String LIZ;

    static {
        String strLJJ = "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fucenter_web%2Faccount_lookup_tool%3Fscene%3D4&use_spark=1&keyboard_adjust=2&hide_nav_bar=1&append_common_params=1&disable_ttnet_proxy=0";
        try {
            strLJJ = C0C64.LJIILLIIL().LJJ(31744, "account_lookup_schema", "aweme://webview?url=https%3A%2F%2Finapp.tiktokv.com%2Fucenter_web%2Faccount_lookup_tool%3Fscene%3D4&use_spark=1&keyboard_adjust=2&hide_nav_bar=1&append_common_params=1&disable_ttnet_proxy=0", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZ = strLJJ;
    }
}
