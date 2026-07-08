package X;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rKT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584270rKT {
    public static final Map<Integer, Set<EnumC1584360rKc>> LIZ;
    public static final Map<Integer, Map<String, List<String>>> LIZIZ;
    public static final List<String> LIZJ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(0, C093Y.LJ(EnumC1584360rKc.HOME));
        linkedHashMap.put(1, C093Y.LJ(EnumC1584360rKc.COIN, EnumC1584360rKc.MALL, EnumC1584360rKc.FOLLOWING, EnumC1584360rKc.NEARBY, EnumC1584360rKc.EXPLORE, EnumC1584360rKc.FRIENDS, EnumC1584360rKc.DISCOVER));
        linkedHashMap.put(2, C093Y.LJ(EnumC1584360rKc.SHOOT));
        linkedHashMap.put(3, C093Y.LJ(EnumC1584360rKc.INBOX));
        linkedHashMap.put(4, C093Y.LJ(EnumC1584360rKc.PROFILE));
        LIZ = linkedHashMap;
        LIZIZ = C343770Ddn.LIZIZ.LJFF(AFwS213S0000000_24.get$arr$(450));
        LIZJ = Arrays.asList("SHOP_MALL", "Nearby", "homepage_explore", "FRIENDS_TAB", "DISCOVER");
    }
}
