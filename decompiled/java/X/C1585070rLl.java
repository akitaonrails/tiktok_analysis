package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.experiment.BottomTab;
import com.ss.android.ugc.aweme.experiment.Candidate;
import com.ss.android.ugc.aweme.experiment.Entrance;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import com.ss.android.ugc.aweme.experiment.TopTabItem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.spi.IHomePageService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0rLl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1585070rLl {
    public static Pair<? extends List<? extends InterfaceC1570900qyu>, ? extends List<? extends InterfaceC1570900qyu>> LIZLLL;
    public static Boolean LJI;
    public static final C1585070rLl LIZ = new C1585070rLl();
    public static final CopyOnWriteArrayList<InterfaceC1583870rJp> LIZIZ = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<InterfaceC1583870rJp> LIZJ = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<String> LJ = new CopyOnWriteArrayList<>();
    public static final CopyOnWriteArrayList<String> LJFF = new CopyOnWriteArrayList<>();

    public static boolean LIZ(BottomTab bottomTab) {
        if (bottomTab == null) {
            return false;
        }
        IHomePageService iHomePageService = (IHomePageService) ServiceManager.get().getService(IHomePageService.class);
        Map<String, Boolean> map = bottomTab.filterRules;
        if (map != null) {
            Iterator<Map.Entry<String, Boolean>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                if (!iHomePageService.LIZIZ(it2.next().getKey())) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean LIZIZ(TopTabItem topTabItem) {
        if (topTabItem == null) {
            return false;
        }
        IHomePageService iHomePageService = (IHomePageService) ServiceManager.get().getService(IHomePageService.class);
        Map<String, Boolean> map = topTabItem.filterRules;
        if (map != null) {
            Iterator<Map.Entry<String, Boolean>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                if (!iHomePageService.LIZIZ(it2.next().getKey())) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static InterfaceC1583870rJp LIZJ(String str) {
        InterfaceC1583870rJp next;
        Iterator<InterfaceC1583870rJp> it2 = LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.tag(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public static boolean LJ(EnumC1584360rKc enumC1584360rKc) {
        List<Candidate> list;
        List<Candidate> list2;
        C0CXN.LIZ.getClass();
        TabConfig tabConfigLIZJ = C0CXN.LIZJ();
        if (!Intrinsics.LJFF(tabConfigLIZJ.isJsonIllegal, Boolean.TRUE)) {
            Entrance entrance = tabConfigLIZJ.leftEntrance;
            if (entrance != null && (list2 = entrance.candidates) != null) {
                for (Candidate candidate : list2) {
                    if (Intrinsics.LJFF(candidate.entranceKey, enumC1584360rKc.getKey()) || Intrinsics.LJFF(candidate.itemKey, enumC1584360rKc.getKey())) {
                        return true;
                    }
                }
            }
            Entrance entrance2 = tabConfigLIZJ.rightEntrance;
            if (entrance2 != null && (list = entrance2.candidates) != null) {
                for (Candidate candidate2 : list) {
                    if (Intrinsics.LJFF(candidate2.entranceKey, enumC1584360rKc.getKey()) || Intrinsics.LJFF(candidate2.itemKey, enumC1584360rKc.getKey())) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        for (Map.Entry<String, List<String>> entry : C1584300rKW.LIZJ.entrySet()) {
            if (Intrinsics.LJFF(entry.getKey(), enumC1584360rKc.getKey())) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<T> it2 = entry.getValue().iterator();
                while (it2.hasNext()) {
                    linkedHashMap.put(it2.next(), Boolean.TRUE);
                }
                new Candidate(entry.getKey(), null, linkedHashMap, null);
                return true;
            }
        }
        for (EnumC1584360rKc enumC1584360rKc2 : C1584300rKW.LIZIZ) {
            if (Intrinsics.LJFF(enumC1584360rKc2.getKey(), enumC1584360rKc.getKey())) {
                new Candidate(enumC1584360rKc2.getKey(), null, null, null);
                return true;
            }
        }
        return false;
    }

    public static boolean LJII(EnumC1584360rKc enumC1584360rKc) {
        String key;
        InterfaceC1583870rJp next;
        String key2;
        CopyOnWriteArrayList<InterfaceC1583870rJp> copyOnWriteArrayList = LIZJ;
        if (!(!copyOnWriteArrayList.isEmpty())) {
            return false;
        }
        Iterator<InterfaceC1583870rJp> it2 = copyOnWriteArrayList.iterator();
        do {
            key = null;
            if (it2.hasNext()) {
                next = it2.next();
                key2 = enumC1584360rKc.getKey();
                C1584320rKY c1584320rKY = C1584320rKY.LIZ;
                String strTag = next.tag();
                c1584320rKY.getClass();
                EnumC1584360rKc enumC1584360rKcLJIIIIZZ = C1584320rKY.LJIIIIZZ(strTag);
                if (enumC1584360rKcLJIIIIZZ != null) {
                    key = enumC1584360rKcLJIIIIZZ.getKey();
                }
            } else {
                return false;
            }
        } while (!TextUtils.equals(key2, key));
        if (next != null) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJJI(EnumC1584360rKc enumC1584360rKc) {
        String key;
        InterfaceC1583870rJp next;
        String key2;
        CopyOnWriteArrayList<InterfaceC1583870rJp> copyOnWriteArrayList = LIZIZ;
        if (!(!copyOnWriteArrayList.isEmpty())) {
            return false;
        }
        Iterator<InterfaceC1583870rJp> it2 = copyOnWriteArrayList.iterator();
        do {
            key = null;
            if (it2.hasNext()) {
                next = it2.next();
                key2 = enumC1584360rKc.getKey();
                C1584320rKY c1584320rKY = C1584320rKY.LIZ;
                String strTag = next.tag();
                c1584320rKY.getClass();
                EnumC1584360rKc enumC1584360rKcLJIIIIZZ = C1584320rKY.LJIIIIZZ(strTag);
                if (enumC1584360rKcLJIIIIZZ != null) {
                    key = enumC1584360rKcLJIIIIZZ.getKey();
                }
            } else {
                return false;
            }
        } while (!TextUtils.equals(key2, key));
        if (next != null) {
            return true;
        }
        return false;
    }

    public static void LJIIL(String str) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        StringBuilder sb = new StringBuilder(str);
        sb.append("\n");
        int length = stackTrace.length;
        if (length > 12) {
            length = 12;
        }
        for (int i = 0; i < length; i++) {
            sb.append(stackTrace[i].getClassName());
            sb.append(e3.d);
            sb.append(stackTrace[i].getMethodName());
            sb.append(" ");
            sb.append(stackTrace[i].getLineNumber());
            sb.append("\n");
        }
        C2344809Gs.LIZLLL(3, "FCPTabManager", sb.toString());
    }

    public static boolean LIZLLL(C1585070rLl c1585070rLl, EnumC1584360rKc enumC1584360rKc) {
        c1585070rLl.getClass();
        if (C1564470qoX.LIZ()) {
            if (Intrinsics.LJFF(LJI, Boolean.TRUE)) {
                CopyOnWriteArrayList<String> copyOnWriteArrayList = LJFF;
                if (!copyOnWriteArrayList.isEmpty()) {
                    return copyOnWriteArrayList.contains(enumC1584360rKc.getKey());
                }
                C1AF0.LIZJ("hitBottomExp after move backup, result is null");
            } else if ((LJI == null || LIZJ.isEmpty()) && enumC1584360rKc == EnumC1584360rKc.FRIENDS) {
                LJIIL("hitBottom Friends before move backup:");
                C1AF0.LIZJ("hitBottom Friends before tab result calculated");
            }
        }
        C0CXN.LIZ.getClass();
        if (C0CXN.LIZIZ(enumC1584360rKc) != null) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(EnumC1584360rKc enumC1584360rKc, EnumC308700C8e enumC308700C8e) {
        if (C1564470qoX.LIZ()) {
            if (Intrinsics.LJFF(LJI, Boolean.TRUE)) {
                CopyOnWriteArrayList<String> copyOnWriteArrayList = LJ;
                if (!copyOnWriteArrayList.isEmpty()) {
                    return copyOnWriteArrayList.contains(enumC1584360rKc.getKey());
                }
                C1AF0.LIZJ("hitTopExp after move backup, result is null");
            } else if ((LJI == null || LIZIZ.isEmpty()) && enumC1584360rKc == EnumC1584360rKc.FRIENDS && enumC308700C8e == null) {
                LJIIL("hitTop Friends before tab result calculated");
                C1AF0.LIZJ("hitTop Friends before tab result calculated");
            }
        }
        C0CXN.LIZ.getClass();
        if (C0CXN.LIZLLL(enumC1584360rKc) != null) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIIZZ(EnumC1584360rKc enumC1584360rKc, EnumC308700C8e enumC308700C8e) {
        EnumC1584360rKc enumC1584360rKc2;
        if (C1564470qoX.LIZ()) {
            if (Intrinsics.LJFF(LJI, Boolean.TRUE) && enumC1584360rKc == (enumC1584360rKc2 = EnumC1584360rKc.FRIENDS)) {
                if (!LJFF.contains(enumC1584360rKc2.getKey())) {
                    return false;
                }
                C0CXN.LIZ.getClass();
                TopTabItem topTabItemLIZLLL = C0CXN.LIZLLL(enumC1584360rKc);
                if (topTabItemLIZLLL != null) {
                    LIZ.getClass();
                    return LIZIZ(topTabItemLIZLLL);
                }
                BottomTab bottomTabLIZIZ = C0CXN.LIZIZ(enumC1584360rKc);
                if (bottomTabLIZIZ != null) {
                    LIZ.getClass();
                    return LIZ(bottomTabLIZIZ);
                }
            } else if (LJI == null && enumC1584360rKc == EnumC1584360rKc.FRIENDS && enumC308700C8e == null) {
                LJIIL("isMetBottomTabShowCondition Friends before move backup:");
                C1AF0.LIZJ("isMetBottomTabShowCondition Friends before tab result calculated");
            }
        }
        if (LJII(enumC1584360rKc)) {
            return true;
        }
        C0CXN.LIZ.getClass();
        return LIZ(C0CXN.LIZIZ(enumC1584360rKc));
    }

    public static boolean LJIIIZ(EnumC1584360rKc enumC1584360rKc, EnumC308700C8e enumC308700C8e) {
        EnumC1584360rKc enumC1584360rKc2;
        if (C1564470qoX.LIZ()) {
            if (Intrinsics.LJFF(LJI, Boolean.TRUE) && (enumC1584360rKc2 = EnumC1584360rKc.FRIENDS) == enumC1584360rKc) {
                if (!LJ.contains(enumC1584360rKc2.getKey())) {
                    return false;
                }
                C0CXN.LIZ.getClass();
                TopTabItem topTabItemLIZLLL = C0CXN.LIZLLL(enumC1584360rKc);
                if (topTabItemLIZLLL != null) {
                    LIZ.getClass();
                    return LIZIZ(topTabItemLIZLLL);
                }
            } else if (LJI == null && enumC1584360rKc == EnumC1584360rKc.FRIENDS && enumC308700C8e == null) {
                LJIIL("isMetTopTabShowCondition Friends before move backup:");
                C1AF0.LIZJ("isMetTopTabShowCondition Friends before tab result calculated");
            }
        }
        if (LJIIJJI(enumC1584360rKc)) {
            return true;
        }
        C0CXN.LIZ.getClass();
        return LIZIZ(C0CXN.LIZLLL(enumC1584360rKc));
    }
}
