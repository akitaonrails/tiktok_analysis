package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mHs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390460mHs {
    public static final C1390460mHs LIZ = new C1390460mHs();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(11));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(10));

    public static String LIZIZ() {
        EnumC325100Com networkStatus;
        int i;
        INetworkStateService iNetworkStateService = (INetworkStateService) LIZIZ.getValue();
        return (iNetworkStateService == null || (networkStatus = iNetworkStateService.getNetworkStatus()) == null || (i = C325370CpD.LIZ[networkStatus.ordinal()]) == 1 || i == 2) ? "no_net" : i != 3 ? i == 4 ? "strong_net" : "no_net" : "weak_net";
    }

    public static JSONObject LIZ(C1390470mHt c1390470mHt, C1749280vcc c1749280vcc) throws JSONException {
        String localClassName;
        String str;
        String name;
        String tag;
        JSONObject jSONObject = new JSONObject();
        Activity activityLIZ = C0FNT.LIZ(c1749280vcc.getContext());
        String str2 = "";
        if (activityLIZ == null || (localClassName = activityLIZ.getLocalClassName()) == null) {
            localClassName = "";
        }
        jSONObject.put("page_key", localClassName);
        if (Intrinsics.LJFF(c1390470mHt.LJ, C1390480mHu.LIZ)) {
            str = "loading";
        } else {
            str = "error";
        }
        jSONObject.put("status_tag", str);
        LIZ.getClass();
        jSONObject.put("network_status", LIZIZ());
        jSONObject.put("view_title", c1390470mHt.LIZ.toString());
        jSONObject.put("view_message", c1390470mHt.LIZIZ.toString());
        jSONObject.put("view_button", c1390470mHt.LIZJ.toString());
        jSONObject.put("view_button_is_loading", String.valueOf(c1390470mHt.LIZLLL));
        Fragment fragmentLIZ = C946803n0.LIZ(c1749280vcc);
        if (fragmentLIZ == null) {
            name = "";
        } else {
            name = fragmentLIZ.getClass().getName();
        }
        jSONObject.put("host_fragment", name);
        if (fragmentLIZ != null && (tag = fragmentLIZ.getTag()) != null) {
            str2 = tag;
        }
        jSONObject.put("fragment_tag", str2);
        return jSONObject;
    }
}
