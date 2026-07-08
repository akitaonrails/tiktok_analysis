package X;

import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C747850TVf extends C09AY implements Function0<SharedPreferences> {
    public C747850TVf() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        Map<String, Long> linkedHashMap;
        C1251170ifD.LIZ.getClass();
        C844470XAv.LIZ.getClass();
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "sp_stay_home_guide_cache");
        if (sharedPreferencesLIZJ != null) {
            try {
                linkedHashMap = (Map) new Gson().LJIIIIZZ(sharedPreferencesLIZJ.getString("sp_stay_home_cache_video_id", ""), (Type) C1251170ifD.LIZJ.getValue());
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                linkedHashMap = new LinkedHashMap<>();
            }
            C1251170ifD.LIZIZ = linkedHashMap;
        }
        return sharedPreferencesLIZJ;
    }
}
