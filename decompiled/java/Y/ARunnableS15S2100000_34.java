package Y;

import X.C0W7Q;
import X.C1BJK;
import X.C1BJL;
import X.C1BJM;
import X.C1BJQ;
import X.C1C7U;
import X.C2202961BJu;
import X.C786410Ut5;
import X.C810670Vr7;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.FacebookSdk;
import com.tiktok.strategycenter.gecko.TTMGeckoDelegateManager;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class ARunnableS15S2100000_34 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    public static final void run$0(ARunnableS15S2100000_34 aRunnableS15S2100000_34) {
        TTMGeckoDelegateManager.lambda$semisugar$nativeDownloadGeckoResources$lambda$0$0(aRunnableS15S2100000_34.s0, aRunnableS15S2100000_34.s1, (Map) aRunnableS15S2100000_34.l2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$1(ARunnableS15S2100000_34 aRunnableS15S2100000_34) {
        String str = aRunnableS15S2100000_34.s0;
        Context context = (Context) aRunnableS15S2100000_34.l2;
        String str2 = aRunnableS15S2100000_34.s1;
        C1C7U.LIZ("FetchedAppGateKeepersManager@8d8d.loadAppGateKeepersAsync$1L");
        C1BJM.LIZ.getClass();
        JSONObject jSONObjectLIZ = C1BJM.LIZ();
        if (jSONObjectLIZ.length() != 0) {
            C1BJM.LIZJ(str, jSONObjectLIZ);
            C810670Vr7.LIZJ(context, 0, "com.facebook.internal.preferences.APP_GATEKEEPERS").edit().putString(str2, C786410Ut5.J3(jSONObjectLIZ)).apply();
            C1BJM.LJ = Long.valueOf(System.currentTimeMillis());
        }
        C1BJM.LIZLLL();
        C1BJM.LIZIZ.set(false);
        C1C7U.LIZIZ("FetchedAppGateKeepersManager@8d8d.loadAppGateKeepersAsync$1L");
    }

    public static final void run$2(ARunnableS15S2100000_34 aRunnableS15S2100000_34) {
        C1BJQ c1bjq;
        Context context = (Context) aRunnableS15S2100000_34.l2;
        String str = aRunnableS15S2100000_34.s0;
        String str2 = aRunnableS15S2100000_34.s1;
        C1C7U.LIZ("FetchedAppSettingsManager@bf4f.loadAppSettingsAsync$1L");
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "com.facebook.internal.preferences.APP_SETTINGS");
        C1BJK c1bjkLIZLLL = null;
        String string = sharedPreferencesLIZJ.getString(str, null);
        if (!C0W7Q.LJIILL(string)) {
            if (string != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    C1BJL.LIZ.getClass();
                    c1bjkLIZLLL = C1BJL.LIZLLL(str2, jSONObject);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
        }
        C1BJL c1bjl = C1BJL.LIZ;
        c1bjl.getClass();
        JSONObject jSONObjectLIZ = C1BJL.LIZ();
        C1BJL.LIZLLL(str2, jSONObjectLIZ);
        sharedPreferencesLIZJ.edit().putString(str, C786410Ut5.J3(jSONObjectLIZ)).apply();
        if (c1bjkLIZLLL != null) {
            String str3 = c1bjkLIZLLL.LJI;
            if (!C1BJL.LJFF && str3 != null && str3.length() > 0) {
                C1BJL.LJFF = true;
            }
        }
        C1BJM.LIZ.getClass();
        JSONObject jSONObjectLIZ2 = C1BJM.LIZ();
        C810670Vr7.LIZJ(FacebookSdk.LIZJ(), 0, "com.facebook.internal.preferences.APP_GATEKEEPERS").edit().putString(C786410Ut5.j4("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str2}, 1)), C786410Ut5.J3(jSONObjectLIZ2)).apply();
        C1BJM.LIZJ(str2, jSONObjectLIZ2);
        int i = C2202961BJu.LIZ;
        AtomicReference<C1BJQ> atomicReference = C1BJL.LIZLLL;
        if (((ConcurrentHashMap) C1BJL.LIZJ).containsKey(str2)) {
            c1bjq = C1BJQ.SUCCESS;
        } else {
            c1bjq = C1BJQ.ERROR;
        }
        atomicReference.set(c1bjq);
        c1bjl.LJFF();
        C1C7U.LIZIZ("FetchedAppSettingsManager@bf4f.loadAppSettingsAsync$1L");
    }

    public ARunnableS15S2100000_34(Context context, String str, String str2, int i) {
        this.$t = i;
        if (1 - i != 0) {
            this.l2 = context;
            this.s0 = str;
            this.s1 = str2;
        } else {
            this.s0 = str;
            this.l2 = context;
            this.s1 = str2;
        }
    }

    public ARunnableS15S2100000_34(String str, String str2, Map map, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = map;
    }
}
