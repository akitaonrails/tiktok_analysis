package X;

import com.bytedance.android.starship.solaria.profile.StarshipSolariaProfile;
import com.bytedance.android.starship.solaria.profile.repository.SolariaProfileModel;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0epA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103580epA extends C09AY implements Function1<SolariaProfileModel, Unit> {
    public final /* synthetic */ StarshipSolariaProfile LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1103580epA(StarshipSolariaProfile starshipSolariaProfile) {
        super(1);
        this.LL = starshipSolariaProfile;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SolariaProfileModel solariaProfileModel) {
        final int size;
        SolariaProfileModel solariaProfileModel2 = solariaProfileModel;
        this.LL.LIZLLL = null;
        this.LL.LIZIZ = solariaProfileModel2;
        if (solariaProfileModel2 != null) {
            final StarshipSolariaProfile starshipSolariaProfile = this.LL;
            C786410Ut5.LJJZZIII(C799570VYd.LIZJ(), new Runnable() { // from class: X.0epF
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("StarshipSolariaProfile@cc7d.initStarshipSolariaProfile$1$1$1");
                    try {
                        Iterator it2 = ((CopyOnWriteArrayList) starshipSolariaProfile.LIZ).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC1103750epR) it2.next()).LIZ();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("StarshipSolariaProfile@cc7d.initStarshipSolariaProfile$1$1$1");
                }
            });
            if (((Boolean) C1103670epJ.LIZIZ.getValue()).booleanValue()) {
                C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.0epB
                    public static void LIZ() {
                        Map<String, HashSet<String>> flatGroup$solaria_release;
                        String strJ3;
                        try {
                            JSONObject jSONObject = (JSONObject) C1103670epJ.LIZJ.getValue();
                            if (jSONObject == null) {
                                return;
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("date", jSONObject.opt("date"));
                            jSONObject2.put("is_new_sdk", jSONObject.opt("is_new_sdk"));
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("profile_usage");
                            if (jSONObjectOptJSONObject != null && (strJ3 = C786410Ut5.J3(jSONObjectOptJSONObject)) != null) {
                                jSONObject2.put("profile_usage", strJ3);
                            }
                            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("profile_group_usage");
                            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() != 0) {
                                JSONObject jSONObject3 = new JSONObject();
                                C1097900eg0.LIZ.getClass();
                                SolariaProfileModel solariaProfileModel3 = (SolariaProfileModel) C1097900eg0.LIZLLL.getValue();
                                if (solariaProfileModel3 != null && (flatGroup$solaria_release = solariaProfileModel3.getFlatGroup$solaria_release()) != null) {
                                    for (Map.Entry<String, HashSet<String>> entry : flatGroup$solaria_release.entrySet()) {
                                        Object objOpt = jSONObjectOptJSONObject2.opt(entry.getKey());
                                        if (objOpt == null) {
                                            objOpt = 0;
                                        }
                                        jSONObject3.put(entry.getKey(), new JSONObject().put("usage", objOpt));
                                    }
                                }
                                jSONObject2.put("profile_group_usage", C786410Ut5.J3(jSONObject3));
                            }
                            C20684815ws.LJIJ("starship_solaria_profile_usage_event", jSONObject2);
                            ((Keva) C1103670epJ.LIZ.getValue()).erase("profile_usage");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            ((Keva) C1103670epJ.LIZ.getValue()).erase("profile_usage");
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ProfileUsageHandler@fe79.uploadUsageEvent$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ProfileUsageHandler@fe79.uploadUsageEvent$1");
                    }
                });
            }
            Map<String, String> map = solariaProfileModel2.profileDataMap;
            if (map != null) {
                size = map.size();
            } else {
                size = 0;
            }
            final Boolean boolIsNewStruck$solaria_release = solariaProfileModel2.isNewStruck$solaria_release();
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new Runnable() { // from class: X.0epC
                public final void LIZ() throws JSONException {
                    JSONObject jSONObjectOptJSONObject;
                    JSONObject jSONObject = (JSONObject) C1103670epJ.LIZJ.getValue();
                    String str = "";
                    int i = 0;
                    if (jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("profile_usage")) != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        int i2 = 0;
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            int iOptInt = jSONObjectOptJSONObject.optInt(next);
                            i += iOptInt;
                            if (iOptInt > i2) {
                                str = next;
                                i2 = iOptInt;
                            }
                        }
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    Boolean bool = boolIsNewStruck$solaria_release;
                    int i3 = size;
                    jSONObject2.put("is_new_sdk", C1103790epV.LIZ());
                    jSONObject2.put("count", i);
                    jSONObject2.put("top_1", str);
                    if (bool != null) {
                        jSONObject2.put("new_struct", bool.booleanValue() ? 1 : 0);
                    }
                    Set<String> set = C1103670epJ.LJII;
                    if (set != null) {
                        jSONObject2.put("unowned", new JSONArray((Collection) set).toString());
                    }
                    jSONObject2.put("profile_cnt", i3);
                    C20684815ws.LJIJ("starship_solaria_profile_usage_count_event", jSONObject2);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ProfileUsageHandler@fe79.uploadUsageCountEvent$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ProfileUsageHandler@fe79.uploadUsageCountEvent$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
