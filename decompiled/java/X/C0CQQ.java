package X;

import com.ss.android.ugc.aweme.search.lynx.core.config.PreLayoutSchemaConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0CQQ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CQQ {
    public static final C0CQQ LIZ = new C0CQQ();
    public static final PreLayoutSchemaConfig LIZIZ = new PreLayoutSchemaConfig();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(1800));

    public static final List<String> LIZ(Map<String, String> map) {
        List listLLIIII;
        String lowerCase;
        if (map == null) {
            listLLIIII = C13BV.INSTANCE;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String strLIZ = C2222691Bz1.LIZ();
                Locale locale = Locale.ROOT;
                String lowerCase2 = strLIZ.toLowerCase(locale);
                String str = map.get(key);
                if (str != null && (lowerCase = str.toLowerCase(locale)) != null && (a0.LJJIIZI(lowerCase, "PRELAYOUT_IN_ALL_REGION".toLowerCase(locale), false) || a0.LJJIIZI(lowerCase, lowerCase2, false))) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            listLLIIII = C13LP.LLIIII(linkedHashMap.keySet());
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLLIIII) {
            C0CQR.LIZ.getClass();
            Object obj2 = ((Map) C0CQR.LIZJ.getValue()).get(obj);
            if (obj2 != null) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
