package X;

import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.IconInOutConfig;
import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.IconTimeConfig;
import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0NLU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NLU {
    public final CopyOnWriteArrayList<InterfaceC592390NLh> LIZ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<InterfaceC592390NLh> LIZIZ = new CopyOnWriteArrayList<>();
    public final C054G LIZJ = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
    public final ConcurrentHashMap<String, C09AE> LIZLLL = new ConcurrentHashMap<>();

    public static IconTimeConfig LIZ(TabDynamicIconInfo tabDynamicIconInfo) {
        IconInOutConfig iconInOutConfig;
        long jLIZ = C1586060rNM.LIZ();
        List<IconTimeConfig> list = tabDynamicIconInfo.timeConfigList;
        if (list != null) {
            for (IconTimeConfig iconTimeConfig : list) {
                IconInOutConfig iconInOutConfig2 = iconTimeConfig.endConfig;
                if (iconInOutConfig2 != null && iconInOutConfig2.time != null && (iconInOutConfig = iconTimeConfig.startConfig) != null && iconInOutConfig.time != null) {
                    Long l = iconInOutConfig.time;
                    if (jLIZ < iconInOutConfig2.time.longValue() && l.longValue() <= jLIZ) {
                        return iconTimeConfig;
                    }
                }
            }
        }
        return null;
    }

    public static boolean LIZIZ(TabDynamicIconInfo tabDynamicIconInfo) {
        long jLIZ = C1586060rNM.LIZ();
        List<IconTimeConfig> list = tabDynamicIconInfo.timeConfigList;
        if (list == null || list.isEmpty()) {
            return true;
        }
        List<IconTimeConfig> list2 = tabDynamicIconInfo.timeConfigList;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<IconTimeConfig> it2 = list2.iterator();
            while (it2.hasNext()) {
                IconInOutConfig iconInOutConfig = it2.next().endConfig;
                if (iconInOutConfig == null || iconInOutConfig.time == null || jLIZ < iconInOutConfig.time.longValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final Object LIZJ(C592330NLb c592330NLb, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        C0NLS c0nls = C0NLS.LIZ;
        EnumC592410NLj enumC592410NLj = c592330NLb.LIZLLL;
        String str = c592330NLb.LIZJ;
        String str2 = c592330NLb.LIZ;
        c0nls.getClass();
        C20684815ws.LJIILLIIL("icon_hide", C2097608Jq.LJIIIIZZ(new Pair("icon_id", str), new Pair("tab_key", str2), new Pair("tab_position", enumC592410NLj.name().toLowerCase(Locale.getDefault())), new Pair("timestamp", String.valueOf(System.currentTimeMillis()))));
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C0NLW(c592330NLb, this, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }
}
