package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Be8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209741Be8 implements InterfaceC2194031Att {
    public final C2189301AmG LIZ;
    public final C2209911BeP LIZIZ;
    public volatile C2209751Be9 LIZJ;

    @Override // X.InterfaceC2194031Att
    public final boolean LIZIZ() {
        return !(!((ArrayList) this.LIZ.LJ).isEmpty());
    }

    public C2209741Be8(final C2209911BeP c2209911BeP, final C2189301AmG c2189301AmG) {
        this.LIZIZ = c2209911BeP;
        this.LIZ = c2189301AmG;
        if (!C2210111Bej.LIZIZ()) {
            C2210111Bej.LIZJ("sampling_config", new InterfaceC800590Var() { // from class: X.1Be7
                @Override // X.InterfaceC800590Var
                public final Object LIZ() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("appId", c2209911BeP.LLILLL.LJIIIZ);
                        jSONObject.put("config", c2189301AmG.LIZJ);
                        return jSONObject;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        return jSONObject;
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC2194031Att
    public final boolean LIZ(EnumC2192221Aqy enumC2192221Aqy, String str, String str2, JSONObject jSONObject) {
        C2209751Be9 c2209751Be9;
        Map<String, List<Map<String, Object>>> map;
        JSONObject jSONObject2;
        if (!EnumC2192221Aqy.event_v3.equals(enumC2192221Aqy) && !EnumC2192221Aqy.log_data.equals(enumC2192221Aqy)) {
            return false;
        }
        C2189301AmG c2189301AmG = this.LIZ;
        if (this.LIZJ != null) {
            c2209751Be9 = this.LIZJ;
        } else {
            this.LIZJ = new C2209751Be9(this);
            c2209751Be9 = this.LIZJ;
        }
        for (AbstractC2189221Am8 abstractC2189221Am8 : (ArrayList) c2189301AmG.LJ) {
            abstractC2189221Am8.getClass();
            if (!TextUtils.isEmpty(str)) {
                Set<String> set = abstractC2189221Am8.LIZIZ;
                if (set == null || !set.contains(str)) {
                    if (!TextUtils.isEmpty(str2) || jSONObject != null) {
                        Map<String, List<Set<String>>> map2 = abstractC2189221Am8.LIZJ;
                        if ((map2 != null && map2.containsKey(str)) || ((map = abstractC2189221Am8.LIZLLL) != null && map.containsKey(str))) {
                            if (jSONObject != null) {
                                jSONObject2 = jSONObject;
                            } else {
                                try {
                                    jSONObject2 = new JSONObject(str2);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                            if (abstractC2189221Am8.LIZIZ(str, jSONObject2)) {
                            }
                        }
                    }
                }
                return abstractC2189221Am8.LIZJ(c2209751Be9);
            }
        }
        return false;
    }
}
