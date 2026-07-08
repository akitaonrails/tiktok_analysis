package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.spark.schema.model.SparkSchemaParam;
import com.lynx.tasm.TemplateData;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

/* JADX INFO: renamed from: X.0qPB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1548750qPB {
    public static final C1548750qPB LIZ = new C1548750qPB();
    public static final ConcurrentHashMap<String, ConcurrentSkipListSet<String>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C1548770qPD> LIZJ = new ConcurrentHashMap<>();

    public static void LIZIZ(Context context, C1548730qP9 c1548730qP9) {
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        SparkContext sparkContextLIZ = c1548730qP9.LIZ(C2097608Jq.LJ(), false);
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContextLIZ).LIZIZ();
    }

    public static void LIZJ(C1548750qPB c1548750qPB, String str, String str2) {
        c1548750qPB.getClass();
        ConcurrentHashMap<String, ConcurrentSkipListSet<String>> concurrentHashMap = LIZIZ;
        ConcurrentSkipListSet<String> concurrentSkipListSet = concurrentHashMap.get(str2);
        if (concurrentSkipListSet == null) {
            concurrentSkipListSet = new ConcurrentSkipListSet<>();
        }
        concurrentSkipListSet.add(str);
        concurrentHashMap.put(str2, concurrentSkipListSet);
        C1537060q6K.LJIIJJI(C1529590puH.LIZ, str, str2, null, null, false, null, 32);
    }

    public static SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZ(C1548750qPB c1548750qPB, Context context, String str, String str2, TemplateData templateData, C099G c099g, Map map, Map map2, C21525119Lt c21525119Lt, int i) {
        SparkSchemaParam sparkSchemaParamLJJJI = null;
        if ((i & 8) != 0) {
            templateData = null;
        }
        if ((i & 16) != 0) {
            c099g = null;
        }
        if ((i & 32) != 0) {
            map = null;
        }
        if ((i & 64) != 0) {
            map2 = C2097608Jq.LJ();
        }
        if ((i & 128) != 0) {
            c21525119Lt = null;
        }
        c1548750qPB.getClass();
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        Object objLIZ = (InterfaceC1105930esx) C1537060q6K.LIZLLL(context, str2, str, null, null);
        C1548770qPD c1548770qPD = LIZJ.get(str);
        if (c1548770qPD == null) {
            c1548770qPD = new C1548770qPD();
        }
        if (objLIZ == null || !(objLIZ instanceof SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB)) {
            c1548770qPD.LJIIL = false;
            c1548770qPD.LJIIJJI = str2;
            if (templateData != null) {
                c1548770qPD.LIZ = templateData;
            }
            if (map != null) {
                c1548770qPD.LIZJ.putAll((Map<? extends String, ? extends Object>) map);
            }
            if (c099g != null) {
                c1548770qPD.LIZIZ = c099g;
            }
            if (c21525119Lt != null) {
                c1548770qPD.LJIIIIZZ = c21525119Lt;
            }
            SparkContext sparkContextLIZ = c1548770qPD.LIZ(map2, false);
            C1541950qED.LIZJ.getClass();
            objLIZ = new C1541950qED(context, sparkContextLIZ).LIZ(false);
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = (SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB) objLIZ;
        SparkContext sparkContext = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext();
        if (sparkContext != null) {
            C1529880puk c1529880puk = SparkContext.Companion;
            sparkSchemaParamLJJJI = sparkContext.LJJJI(-1);
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJIJIIJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext(), sparkSchemaParamLJJJI);
        return sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
    }
}
