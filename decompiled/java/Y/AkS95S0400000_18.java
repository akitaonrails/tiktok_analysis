package Y;

import X.InterfaceC1487280oo2;
import com.bytedance.i18n.location.api.LocationData;
import com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.api.PoiSearchApi;
import com.ss.android.ugc.aweme.poi.videopublish.preload.PoiPublishRecommendPreloader;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AkS95S0400000_18 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS95S0400000_18 akS95S0400000_18, Object obj) {
        LocationData locationData = (LocationData) obj;
        return ((PoiPublishRecommendPreloader) akS95S0400000_18.l0).sendRequest((PoiMobParam) akS95S0400000_18.l1, (ArrayList) akS95S0400000_18.l2, (Function1) akS95S0400000_18.l3, true, new Pair<>(Double.valueOf(locationData.latitude), Double.valueOf(locationData.longitude)));
    }

    public static final Object apply$1(AkS95S0400000_18 akS95S0400000_18, Object obj) {
        PoiPublishRecommendPreloader poiPublishRecommendPreloader = (PoiPublishRecommendPreloader) akS95S0400000_18.l0;
        PoiMobParam poiMobParam = (PoiMobParam) akS95S0400000_18.l1;
        ArrayList<MediaLocationMetaDataModel> arrayList = (ArrayList) akS95S0400000_18.l2;
        Function1<? super Class<PoiSearchApi>, ? extends PoiSearchApi> function1 = (Function1) akS95S0400000_18.l3;
        Double dValueOf = Double.valueOf(0.0d);
        return poiPublishRecommendPreloader.sendRequest(poiMobParam, arrayList, function1, true, new Pair<>(dValueOf, dValueOf));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AkS95S0400000_18(PoiPublishRecommendPreloader poiPublishRecommendPreloader, PoiPublishRecommendPreloader poiPublishRecommendPreloader2, PoiMobParam poiMobParam, ArrayList<MediaLocationMetaDataModel> arrayList, Function1<? super Class<PoiSearchApi>, ? extends PoiSearchApi> function1) {
        this.$t = function1;
        this.l0 = poiPublishRecommendPreloader;
        this.l1 = poiPublishRecommendPreloader2;
        this.l2 = poiMobParam;
        this.l3 = arrayList;
    }
}
