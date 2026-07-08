package X;

import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletNewSDKMonitorEnabled;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletOldSDKMonitorEnabled;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0x8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1807660x8m {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(int i, String str, Map map) {
        C1CC3 c1cc3;
        if (LiveWalletOldSDKMonitorEnabled.INSTANCE.getValue()) {
            C1CC2.LJII(i, str, map);
        }
        if (LiveWalletNewSDKMonitorEnabled.INSTANCE.getValue() && (c1cc3 = C1CC2.LIZ) != null) {
            c1cc3.LJJ(i, str, map);
        }
    }

    public static void LIZIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (LiveWalletOldSDKMonitorEnabled.INSTANCE.getValue()) {
            C1CC2.LJ(str, jSONObject, jSONObject2, jSONObject3);
        }
        if (LiveWalletNewSDKMonitorEnabled.INSTANCE.getValue()) {
            C1CC2.LJIILLIIL("wallet", str, jSONObject, jSONObject2, jSONObject3);
        }
    }

    public static void LIZLLL(int i, String str, Map map, long j) {
        C1CC3 c1cc3;
        if (LiveWalletOldSDKMonitorEnabled.INSTANCE.getValue()) {
            C1CC2.LJIIJJI(i, str, map, j);
        }
        if (LiveWalletNewSDKMonitorEnabled.INSTANCE.getValue() && (c1cc3 = C1CC2.LIZ) != null) {
            c1cc3.LJIIZILJ(j, map, i, str);
        }
    }

    public static void LIZ(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (LiveWalletOldSDKMonitorEnabled.INSTANCE.getValue()) {
            C1CC2.LIZJ(str, jSONObject, jSONObject2, jSONObject3);
        }
        if (LiveWalletNewSDKMonitorEnabled.INSTANCE.getValue()) {
            JSONObject jSONObject4 = new JSONObject();
            C1520640pfq.LIZ(jSONObject4, jSONObject);
            JSONObject jSONObject5 = new JSONObject();
            C1520640pfq.LIZ(jSONObject5, jSONObject2);
            JSONObject jSONObject6 = new JSONObject();
            C1520640pfq.LIZ(jSONObject6, jSONObject3);
            C1CC2.LJIILLIIL(str2, str, jSONObject4, jSONObject5, jSONObject6);
        }
    }
}
