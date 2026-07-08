package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.10Pp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19241910Pp {
    public static final C19241910Pp LIZ = new C19241910Pp();

    public static C0TA0 LIZ() {
        List<C0TA0> currentPluginList;
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        C0TA0 c0ta0 = null;
        if (iPluginService == null || (currentPluginList = iPluginService.getCurrentPluginList()) == null) {
            return null;
        }
        Iterator<C0TA0> it2 = currentPluginList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C0TA0 next = it2.next();
            if (next.getType() == EnumC19241510Pl.FOLLOW_TRENDING_CREATORS) {
                c0ta0 = next;
                break;
            }
        }
        return c0ta0;
    }

    public static boolean LIZIZ() {
        IPluginService.PluginDataWrapper value;
        IPluginService.TrendingCreatorsData trendingCreatorsData;
        Boolean bool;
        C0TA0 c0ta0LIZ = LIZ();
        if (c0ta0LIZ == null || (value = c0ta0LIZ.getValue()) == null || (trendingCreatorsData = value.trendingCreatorsData) == null || (bool = trendingCreatorsData.useServerOrder) == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
