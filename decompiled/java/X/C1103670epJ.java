package X;

import android.app.Activity;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0epJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103670epJ {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1103730epP());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1095704Qh());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1103680epK());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1103700epM());
    public static final C01GW LJ = C452501pT.LIZIZ(new C1103690epL());
    public static final C01GW LJFF = C452501pT.LIZIZ(new C1103640epG());
    public static volatile boolean LJI;
    public static Set<String> LJII;

    static {
        C1BWL.LIZ().registerActivityLifecycleCallbacks(new C1103740epQ() { // from class: X.0epI
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                C01GW c01gw = C1103670epJ.LIZ;
                if (C1103670epJ.LJI) {
                    C1103670epJ.LJI = false;
                    try {
                        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.0epH
                            public static void LIZ() throws JSONException {
                                JSONObject jSONObjectOptJSONObject = ((JSONObject) C1103670epJ.LJFF.getValue()).optJSONObject("profile_usage");
                                if (jSONObjectOptJSONObject != null) {
                                    for (Map.Entry entry : ((ConcurrentHashMap) C1103670epJ.LIZLLL.getValue()).entrySet()) {
                                        jSONObjectOptJSONObject.put((String) entry.getKey(), ((AtomicInteger) entry.getValue()).intValue());
                                    }
                                }
                                JSONObject jSONObjectOptJSONObject2 = ((JSONObject) C1103670epJ.LJFF.getValue()).optJSONObject("profile_group_usage");
                                if (jSONObjectOptJSONObject2 != null) {
                                    for (Map.Entry entry2 : ((ConcurrentHashMap) C1103670epJ.LJ.getValue()).entrySet()) {
                                        jSONObjectOptJSONObject2.put((String) entry2.getKey(), ((AtomicInteger) entry2.getValue()).intValue());
                                    }
                                }
                                ((Keva) C1103670epJ.LIZ.getValue()).storeString("profile_usage", C786410Ut5.J3((JSONObject) C1103670epJ.LJFF.getValue()));
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("ProfileUsageHandler@fe79.save$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("ProfileUsageHandler@fe79.save$1");
                            }
                        });
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        });
    }
}
