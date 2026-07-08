package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0dka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1062300dka {
    public static final ConcurrentHashMap<Class<AbstractC1061750djh>, AbstractC1061750djh> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C1062310dkb> LIZIZ = new ConcurrentHashMap<>();

    public static AbstractC1061750djh LIZJ(Class cls) {
        ConcurrentHashMap<Class<AbstractC1061750djh>, AbstractC1061750djh> concurrentHashMap = LIZ;
        AbstractC1061750djh abstractC1061750djh = concurrentHashMap.get(cls);
        if (abstractC1061750djh == null) {
            try {
                AbstractC1061750djh abstractC1061750djh2 = (AbstractC1061750djh) cls.newInstance();
                concurrentHashMap.put(cls, abstractC1061750djh2);
                return abstractC1061750djh2;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return abstractC1061750djh;
    }

    public static Map LIZIZ(EnumC1059790dgX enumC1059790dgX, String str) {
        C1062310dkb c1062310dkb;
        ConcurrentHashMap<String, C1062310dkb> concurrentHashMap = LIZIZ;
        if (concurrentHashMap.get(str) == null || (c1062310dkb = concurrentHashMap.get(str)) == null || enumC1059790dgX == EnumC1059790dgX.NONE) {
            return null;
        }
        return c1062310dkb.LIZ.get(enumC1059790dgX);
    }

    public static void LJ(String str, Class cls) {
        EnumC1059790dgX enumC1059790dgX = EnumC1059790dgX.ALL;
        if (cls != null) {
            ConcurrentHashMap<String, C1062310dkb> concurrentHashMap = LIZIZ;
            if (concurrentHashMap.get(LivePreviewCTASmartDisplayManager.DEFAULT) == null) {
                concurrentHashMap.put(LivePreviewCTASmartDisplayManager.DEFAULT, new C1062310dkb());
            }
            C1062310dkb c1062310dkb = concurrentHashMap.get(LivePreviewCTASmartDisplayManager.DEFAULT);
            if (c1062310dkb != null) {
                for (Object obj : C1697810uHb.LJIIJJI(enumC1059790dgX, EnumC1059790dgX.WEB, EnumC1059790dgX.LYNX, EnumC1059790dgX.RN)) {
                    ConcurrentHashMap<String, Class<? extends InterfaceC1063690dmp>> concurrentHashMap2 = c1062310dkb.LIZ.get(obj);
                    if (concurrentHashMap2 == null) {
                        concurrentHashMap2 = new ConcurrentHashMap<>();
                    }
                    concurrentHashMap2.put(str, cls);
                    c1062310dkb.LIZ.put((EnumC1059790dgX) obj, concurrentHashMap2);
                }
            }
        }
    }

    public static Class LIZ(EnumC1059790dgX enumC1059790dgX, String str, String str2) {
        C1062310dkb c1062310dkb;
        ConcurrentHashMap<String, Class<? extends InterfaceC1063690dmp>> concurrentHashMap;
        ConcurrentHashMap<String, C1062310dkb> concurrentHashMap2 = LIZIZ;
        if (concurrentHashMap2.get(str2) == null || (c1062310dkb = concurrentHashMap2.get(str2)) == null || enumC1059790dgX == EnumC1059790dgX.NONE || (concurrentHashMap = c1062310dkb.LIZ.get(enumC1059790dgX)) == null) {
            return null;
        }
        return concurrentHashMap.get(str);
    }

    public static void LIZLLL(Class cls, EnumC1059790dgX enumC1059790dgX, String str, int i) {
        List listSingletonList;
        String str2;
        ConcurrentHashMap<Class<? extends InterfaceC1063690dmp>, String> concurrentHashMap;
        if ((i & 2) != 0) {
            enumC1059790dgX = EnumC1059790dgX.ALL;
        }
        if ((i & 4) != 0) {
            str = LivePreviewCTASmartDisplayManager.DEFAULT;
        }
        if (cls != null) {
            ConcurrentHashMap<String, C1062310dkb> concurrentHashMap2 = LIZIZ;
            if (concurrentHashMap2.get(str) == null) {
                concurrentHashMap2.put(str, new C1062310dkb());
            }
            C1062310dkb c1062310dkb = concurrentHashMap2.get(str);
            if (c1062310dkb != null) {
                EnumC1059790dgX enumC1059790dgX2 = EnumC1059790dgX.ALL;
                if (enumC1059790dgX == enumC1059790dgX2) {
                    listSingletonList = C1697810uHb.LJIIJJI(enumC1059790dgX2, EnumC1059790dgX.WEB, EnumC1059790dgX.LYNX, EnumC1059790dgX.RN);
                } else {
                    listSingletonList = Collections.singletonList(enumC1059790dgX);
                }
                for (Object obj : listSingletonList) {
                    ConcurrentHashMap<String, Class<? extends InterfaceC1063690dmp>> concurrentHashMap3 = c1062310dkb.LIZ.get(obj);
                    if (concurrentHashMap3 == null) {
                        concurrentHashMap3 = new ConcurrentHashMap<>();
                    }
                    try {
                        concurrentHashMap = C1062320dkc.LIZ;
                        str2 = concurrentHashMap.get(cls);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (str2 == null) {
                        concurrentHashMap.put(cls, ((InterfaceC1063690dmp) cls.newInstance()).getName());
                        str2 = concurrentHashMap.get(cls);
                        if (str2 == null) {
                            str2 = "";
                        }
                    }
                    concurrentHashMap3.put(str2, cls);
                    c1062310dkb.LIZ.put((EnumC1059790dgX) obj, concurrentHashMap3);
                }
            }
        }
    }
}
