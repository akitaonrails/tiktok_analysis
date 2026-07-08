package X;

import android.os.Handler;
import android.view.View;
import com.bytedance.android.btm.impl.setting.SchemaPatternRuleModel;
import com.bytedance.android.btm.impl.setting.SchemaRulesModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.18EU, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18EU implements InterfaceC1549050qPf {
    public static boolean LIZJ;
    public static final C18EU LIZ = new C18EU();
    public static final Object LIZIZ = new Object();
    public static int LIZLLL = 20;
    public static final ConcurrentHashMap<String, List<String>> LJ = new ConcurrentHashMap<>();
    public static final C01GW LJFF = C452501pT.LIZIZ(new C0CGW());
    public static final Map<String, Regex> LJI = Collections.synchronizedMap(new LinkedHashMap<String, Regex>() { // from class: X.0jbE
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<String, Regex>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<String, Regex>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<String> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<Regex> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<String> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<Regex> values() {
            return getValues();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof Regex)) {
                return false;
            }
            return containsValue((Regex) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Regex> entry) {
            if (size() >= 2000) {
                C18CE.LIZ.LJFF(1040, "pattern2RegexMap oversize 2000", null, null, false);
                return true;
            }
            return false;
        }

        public /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public /* bridge */ boolean containsValue(Regex regex) {
            return super.containsValue((Object) regex);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Regex get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Regex remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        public /* bridge */ Regex get(String str) {
            return (Regex) super.get((Object) str);
        }

        public /* bridge */ Regex remove(String str) {
            return (Regex) super.remove((Object) str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return getOrDefault((String) obj, (Regex) obj2);
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (!(obj instanceof String) || !(obj2 instanceof Regex)) {
                return false;
            }
            return remove((String) obj, (Regex) obj2);
        }

        public final /* bridge */ Regex getOrDefault(Object obj, Regex regex) {
            if (!(obj instanceof String)) {
                return regex;
            }
            return getOrDefault((String) obj, regex);
        }

        public /* bridge */ boolean remove(String str, Regex regex) {
            return super.remove((Object) str, (Object) regex);
        }

        public /* bridge */ Regex getOrDefault(String str, Regex regex) {
            return (Regex) super.getOrDefault((Object) str, regex);
        }
    });
    public static final Map<String, String> LJII = Collections.synchronizedMap(new LinkedHashMap<String, String>() { // from class: X.0jbC
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<String, String>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<String, String>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<String> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<String> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<String> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<String> values() {
            return getValues();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsKey((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return containsValue((String) obj);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, String> entry) {
            if (size() >= 200) {
                C18CE.LIZ.LJFF(1040, "schema2PageBtmCache oversize 200", null, null, false);
                return true;
            }
            return false;
        }

        public /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        public /* bridge */ boolean containsValue(String str) {
            return super.containsValue((Object) str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ String get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return get((String) obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ String remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return remove((String) obj);
        }

        public /* bridge */ String get(String str) {
            return (String) super.get((Object) str);
        }

        public /* bridge */ String remove(String str) {
            return (String) super.remove((Object) str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
            if (!(obj instanceof String)) {
                return obj2;
            }
            return getOrDefault((String) obj, (String) obj2);
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (!(obj instanceof String) || !(obj2 instanceof String)) {
                return false;
            }
            return remove((String) obj, (String) obj2);
        }

        public final /* bridge */ String getOrDefault(Object obj, String str) {
            if (!(obj instanceof String)) {
                return str;
            }
            return getOrDefault((String) obj, str);
        }

        public /* bridge */ boolean remove(String str, String str2) {
            return super.remove((Object) str, (Object) str2);
        }

        public /* bridge */ String getOrDefault(String str, String str2) {
            return (String) super.getOrDefault((Object) str, str2);
        }
    });
    public static final C1287130jbD LJIIIIZZ = new C1287130jbD();
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(new C18H9());

    public static void LIZIZ(SchemaRulesModel schemaRulesModel) {
        C18CK.LJIIL("SchemaUtils_build", new C18H7());
        if (schemaRulesModel.LIZ().isEmpty()) {
            return;
        }
        LJ.clear();
        for (SchemaPatternRuleModel schemaPatternRuleModel : schemaRulesModel.LIZ()) {
            if (schemaPatternRuleModel.LIZ().length() != 0 && !schemaPatternRuleModel.LIZIZ().isEmpty()) {
                LJ.put(schemaPatternRuleModel.LIZ(), schemaPatternRuleModel.LIZIZ());
            }
        }
        C18CK.LJIIL("SchemaUtils_build", new C18H8());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final String LIZJ(String str, String str2) {
        boolean z;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = str2;
        if (!LIZJ) {
            synchronized (this) {
                if (!LIZJ) {
                    C18IP c18ip = C18IP.LIZ;
                    c18ip.getClass();
                    if (((InterfaceC21259418Ho) C18IP.LJIIIIZZ.getValue(c18ip, C18IP.LIZIZ[5])) == null) {
                        C18CK.LJIIL("SchemaUtils_init", new C21260018Hu());
                    } else {
                        C18CK.LJIIL("SchemaUtils_init", new C21260118Hv());
                        LJII.clear();
                        LJIIIIZZ.clear();
                        LJI.clear();
                        LJ.clear();
                        if (C18ET.LIZ) {
                            if (LIZLLL > 0) {
                                C18ET.LIZ();
                                LIZLLL--;
                            } else {
                                C18CK.LJIIL("SchemaUtils_init", new C21260218Hw());
                            }
                        }
                        if (!C18ET.LIZ) {
                            LIZJ = true;
                            SchemaRulesModel schemaRulesModel = C18ET.LIZIZ;
                            LIZIZ(schemaRulesModel);
                            C18CK.LJIIL("SchemaUtils_init", new C1287180jbI(schemaRulesModel));
                        } else {
                            C18CK.LJIIL("SchemaUtils_init", new C21260318Hx());
                        }
                    }
                }
            }
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = LJ;
        if (concurrentHashMap.size() == 0) {
            return (String) c259800zU.element;
        }
        if (LJIIIIZZ.containsKey((Object) str)) {
            return (String) c259800zU.element;
        }
        Map<String, String> map = LJII;
        if (map.containsKey(str)) {
            String str3 = map.get(str);
            if (str3 == null) {
                return "";
            }
            return str3;
        }
        C118300cf c118300cf = new C118300cf();
        for (Map.Entry<String, List<String>> entry : concurrentHashMap.entrySet()) {
            Iterator<String> it2 = entry.getValue().iterator();
            while (true) {
                if (it2.hasNext()) {
                    String next = it2.next();
                    Map<String, Regex> map2 = LJI;
                    Regex regex = map2.get(next);
                    if (regex == null) {
                        try {
                            Regex regex2 = new Regex(next);
                            map2.put(next, regex2);
                            regex = regex2;
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    if (regex != null && regex.matches(str)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                c259800zU.element = entry.getKey();
                c118300cf.element++;
                if (!C18IP.LIZ.LIZLLL()) {
                    break;
                }
            }
        }
        int i = c118300cf.element;
        if (i != 0) {
            if (i != 1) {
                C18CK.LJIIL("SchemaUtils_getPageBtmWithSchema", new C0CGV(str, c118300cf, c259800zU));
            } else {
                LJII.put(str, (String) c259800zU.element);
            }
        } else {
            LJIIIIZZ.put(str, LIZIZ);
        }
        return (String) c259800zU.element;
    }

    @Override // X.InterfaceC1549050qPf
    public final void LIZ(final String str, final View view, String str2, final String str3, EnumC1549040qPe enumC1549040qPe) {
        String name = view.getClass().getName();
        if (!C18CS.LIZ.LIZJ().LJII()) {
            return;
        }
        C18CK.LJIIL("SchemaUtils_registerHybridContainerSchemaPageAsync", new C18G4(str, name, str2));
        LIZLLL(view, enumC1549040qPe, new C18IG() { // from class: X.18Fh
            @Override // X.C18IG
            public final void LIZ(String str4) {
                if (C18EU.LJ("getHybridContainerPageBtmBy", str4, "View", str, "", view)) {
                    String str5 = C18E6.LIZ;
                    C18E6.LIZIZ(view, str4, str3);
                }
            }
        }, str, str2);
    }

    public final synchronized void LIZLLL(final View view, final EnumC1549040qPe enumC1549040qPe, final C18IG c18ig, final String str, final String str2) {
        if (!C18CS.LIZ.LIZJ().LJII()) {
            c18ig.LIZ(str2);
            return;
        }
        C18GU c18gu = C18GU.LIZ;
        Runnable runnable = new Runnable() { // from class: X.18EQ
            @Override // java.lang.Runnable
            public final void run() {
                String strDecode;
                String str3;
                String str4 = str;
                String str5 = str2;
                EnumC1549040qPe enumC1549040qPe2 = enumC1549040qPe;
                View view2 = view;
                final C18IG c18ig2 = c18ig;
                C1C7U.LIZ("SchemaUtils@621b.getPageBtmWithSchemaAsync$1L");
                try {
                    if (Intrinsics.LJFF(str4, "")) {
                        str3 = str4;
                    } else {
                        try {
                            strDecode = URLDecoder.decode(str4, "utf-8");
                            str3 = str4;
                            int i = 1;
                            while (!Intrinsics.LJFF(str3, strDecode) && i < 5) {
                                try {
                                    try {
                                        i++;
                                        str3 = strDecode;
                                        strDecode = URLDecoder.decode(strDecode, "utf-8");
                                    } catch (Throwable th) {
                                        th = th;
                                        TryCatchGuardChecker.doCheck(th);
                                        C189200o6.m2constructorimpl(new C098200Yq(th));
                                        str3 = strDecode;
                                        final String strLIZJ = C18EU.LIZ.LIZJ(str3, str5);
                                        C786410Ut5.LJJZZIII((Handler) C18EU.LJFF.getValue(), new Runnable() { // from class: X.18Ga
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C18IG c18ig3 = c18ig2;
                                                String str6 = strLIZJ;
                                                C1C7U.LIZ("SchemaUtils@621b.getPageBtmWithSchemaAsync$lambda$2$1L");
                                                c18ig3.LIZ(str6);
                                                C1C7U.LIZIZ("SchemaUtils@621b.getPageBtmWithSchemaAsync$lambda$2$1L");
                                            }
                                        });
                                        if (C18CS.LIZ.LIZJ().LJIILJJIL() == 1) {
                                            C18E8 c18e8 = C18E8.LL;
                                            C18E8.LIZJ(view2, str4);
                                        }
                                        C189200o6.m2constructorimpl(Unit.LIZ);
                                        C1C7U.LIZIZ("SchemaUtils@621b.getPageBtmWithSchemaAsync$1L");
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    strDecode = str3;
                                }
                            }
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th3) {
                            th = th3;
                            strDecode = str4;
                        }
                    }
                    final String strLIZJ2 = C18EU.LIZ.LIZJ(str3, str5);
                    C786410Ut5.LJJZZIII((Handler) C18EU.LJFF.getValue(), new Runnable() { // from class: X.18Ga
                        @Override // java.lang.Runnable
                        public final void run() {
                            C18IG c18ig3 = c18ig2;
                            String str6 = strLIZJ2;
                            C1C7U.LIZ("SchemaUtils@621b.getPageBtmWithSchemaAsync$lambda$2$1L");
                            c18ig3.LIZ(str6);
                            C1C7U.LIZIZ("SchemaUtils@621b.getPageBtmWithSchemaAsync$lambda$2$1L");
                        }
                    });
                    if (C18CS.LIZ.LIZJ().LJIILJJIL() == 1 && (enumC1549040qPe2 == EnumC1549040qPe.Activity || enumC1549040qPe2 == EnumC1549040qPe.DialogFragment)) {
                        C18E8 c18e82 = C18E8.LL;
                        C18E8.LIZJ(view2, str4);
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    C189200o6.m2constructorimpl(new C098200Yq(th4));
                }
                C1C7U.LIZIZ("SchemaUtils@621b.getPageBtmWithSchemaAsync$1L");
            }
        };
        c18gu.getClass();
        C18GU.LJ(runnable);
    }

    public static boolean LJ(String str, String str2, String str3, String str4, String str5, Object obj) {
        boolean z;
        String name = obj.getClass().getName();
        if (str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C18CK.LJIIL("BTMSDK_schema_ISchemaCallback_call", new C05NY(str, str3, str5, str4, name));
            return false;
        }
        C18CK.LJIIL("BTMSDK_schema_ISchemaCallback_call", new C1939207ig(str, str3, str5, str4, str2, name));
        return true;
    }
}
