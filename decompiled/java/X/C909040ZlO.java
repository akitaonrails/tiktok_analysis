package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ActionBarButtonStrategyConf;
import com.ss.android.ugc.aweme.im.strategy.resourceload.IDMResourceLoadService;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0ZlO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C909040ZlO {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(585));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(584));

    public static Set LIZ(ActionBarButtonStrategyConf actionBarButtonStrategyConf) {
        InterfaceC1664506fT interfaceC1664506fTLIZJ;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C06TB c06tb = C06TB.ANIMATED_STICKER;
        C06TB c06tb2 = C06TB.STATIC_STICKER;
        C06TB c06tb3 = C06TB.STABLE_STICKER;
        String str = actionBarButtonStrategyConf.animateUrl;
        if (str != null) {
            linkedHashSet.add(new Pair(str, c06tb));
        }
        String str2 = actionBarButtonStrategyConf.staticUrl;
        if (str2 != null) {
            linkedHashSet.add(new Pair(str2, c06tb2));
        }
        String str3 = actionBarButtonStrategyConf.icon;
        if (str3 != null) {
            linkedHashSet.add(new Pair(str3, c06tb3));
        }
        String str4 = actionBarButtonStrategyConf.iconDark;
        if (str4 != null) {
            linkedHashSet.add(new Pair(str4, c06tb3));
        }
        IDMResourceLoadService iDMResourceLoadService = (IDMResourceLoadService) PluggableExtentionKt.pluggableSpiForReal(IDMResourceLoadService.class);
        if (iDMResourceLoadService != null && (interfaceC1664506fTLIZJ = iDMResourceLoadService.LIZJ(C0Z3V.DIMENSION_UID, true)) != null) {
            interfaceC1664506fTLIZJ.LJI("action_bar_image_preload", actionBarButtonStrategyConf.animateUrl);
            interfaceC1664506fTLIZJ.LJI("action_bar_image_preload", actionBarButtonStrategyConf.staticUrl);
            interfaceC1664506fTLIZJ.LJI("action_bar_image_preload", actionBarButtonStrategyConf.icon);
            interfaceC1664506fTLIZJ.LJI("action_bar_image_preload", actionBarButtonStrategyConf.iconDark);
        }
        return linkedHashSet;
    }
}
