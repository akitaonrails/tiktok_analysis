package X;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.multiapp.IFeedExService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IPaidContentFeedSeries;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0Rpb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C707810Rpb {
    public static final C707810Rpb LIZ = new C707810Rpb();
    public static final Map<String, Function0<C13IQ<? extends ReusedUISlotAssem<?>>>> LIZIZ = new LinkedHashMap();

    static {
        InterfaceC1659430tHh interfaceC1659430tHhLIZLLL;
        AFwS194S0000000_8 aFwS194S0000000_8LJIIIZ;
        Function0<C13IQ<? extends ReusedUISlotAssem<?>>> function0LJIIIZ;
        Function0<C13IQ<? extends ReusedUISlotAssem<?>>> function0LJJIJ;
        LIZ("bottom_button_user_suggestion", C707790RpZ.LIZ);
        C1367960lha.LIZ.getClass();
        Function0<C13IQ<? extends ReusedUISlotAssem<?>>> poiTagProvider = C1367960lha.LIZ().getPoiTagProvider();
        if (poiTagProvider != null) {
            LIZ("high_tag_poi_check_in", poiTagProvider);
            LIZ("meta_tag_poi_check_in", poiTagProvider);
        }
        IFeedExService iFeedExService = (IFeedExService) PluggableExtentionKt.pluggableSpi$default(IFeedExService.class, false, false, false, 14, null);
        if (iFeedExService != null && (function0LJJIJ = iFeedExService.LJJIJ()) != null) {
            LIZ("bottom_button_inspiration_idea", function0LJJIJ);
        }
        IPaidContentFeedSeries iPaidContentFeedSeries = (IPaidContentFeedSeries) PluggableExtentionKt.pluggableSpi$default(IPaidContentFeedSeries.class, false, false, false, 14, null);
        if (iPaidContentFeedSeries != null && (function0LJIIIZ = iPaidContentFeedSeries.LJIIIZ()) != null) {
            LIZ("bottom_button_drama", function0LJIIIZ);
        }
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ == null || (interfaceC1659430tHhLIZLLL = iAITheaterFeatureServiceLIZ.LIZLLL()) == null || (aFwS194S0000000_8LJIIIZ = interfaceC1659430tHhLIZLLL.LJIIIZ()) == null) {
            return;
        }
        LIZ("high_tag_recast", aFwS194S0000000_8LJIIIZ);
    }

    public static void LIZ(String str, Function0 function0) {
        LIZIZ.put(str, function0);
    }
}
