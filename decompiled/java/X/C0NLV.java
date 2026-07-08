package X;

import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.IconConfig;
import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo;
import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabIconViewConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NLV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NLV {
    public static final Map<String, EnumC592410NLj> LIZ = new LinkedHashMap();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(547));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(546));

    public static final List<String> LIZ(TabIconViewConfig tabIconViewConfig) {
        IconConfig iconConfig = tabIconViewConfig.iconConfig;
        if (iconConfig != null) {
            return C13LP.LJJJJLI(C13LQ.LJLIIL(new String[]{iconConfig.iconUnSelectDarkUrl, iconConfig.iconUnSelectLightUrl, iconConfig.iconSelectDarkUrl, iconConfig.iconSelectLightUrl}));
        }
        return null;
    }

    public static final TabIconViewConfig LIZIZ(TabDynamicIconInfo tabDynamicIconInfo) {
        EnumC592410NLj enumC592410NLjLIZJ = LIZJ(tabDynamicIconInfo.tabKey);
        if (enumC592410NLjLIZJ == null) {
            return null;
        }
        if (enumC592410NLjLIZJ == EnumC592410NLj.TOP) {
            return tabDynamicIconInfo.topTabIconConfig;
        }
        if (enumC592410NLjLIZJ != EnumC592410NLj.BOTTOM) {
            return null;
        }
        return tabDynamicIconInfo.bottomTabIconConfig;
    }

    public static final EnumC592410NLj LIZJ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        EnumC592410NLj enumC592410NLj = (EnumC592410NLj) ((LinkedHashMap) LIZ).get(str);
        if (enumC592410NLj != null) {
            return enumC592410NLj;
        }
        for (EnumC1584360rKc enumC1584360rKc : EnumC1584360rKc.values()) {
            if (Intrinsics.LJFF(enumC1584360rKc.getKey(), str)) {
                C1585070rLl.LIZ.getClass();
                if (C1585070rLl.LJIIIIZZ(enumC1584360rKc, null)) {
                    Map<String, EnumC592410NLj> map = LIZ;
                    EnumC592410NLj enumC592410NLj2 = EnumC592410NLj.BOTTOM;
                    map.put(str, enumC592410NLj2);
                    return enumC592410NLj2;
                }
                if (!C1585070rLl.LJIIIZ(enumC1584360rKc, null)) {
                    return null;
                }
                Map<String, EnumC592410NLj> map2 = LIZ;
                EnumC592410NLj enumC592410NLj3 = EnumC592410NLj.TOP;
                map2.put(str, enumC592410NLj3);
                return enumC592410NLj3;
            }
        }
        return null;
    }

    public static final boolean LIZLLL(TabIconViewConfig tabIconViewConfig, C0NKZ c0nkz) {
        List<String> listLIZ = LIZ(tabIconViewConfig);
        if (listLIZ != null) {
            if (!listLIZ.isEmpty()) {
                Iterator<String> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    if (!c0nkz.LIZLLL(it2.next())) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static final void LJ(TabIconViewConfig tabIconViewConfig, C0NKZ c0nkz) {
        List<String> listLIZ = LIZ(tabIconViewConfig);
        if (listLIZ != null) {
            Iterator<String> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                c0nkz.LIZ(it2.next());
            }
        }
    }
}
