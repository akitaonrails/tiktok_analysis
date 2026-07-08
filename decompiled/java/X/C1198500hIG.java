package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.MediaLocationMetaDataModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiMobParam;
import com.ss.android.ugc.aweme.poi.experiment.PoiExpandScopeMetaDataExp;
import com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishModel;
import com.ss.android.ugc.aweme.poi.videopublish.preload.PoiPublishRecommendPreloader;
import com.ss.android.ugc.aweme.poi.videopublish.videounderstand.api.IPoiRecommendService;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.services.publish.MobParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS17S2000000_18;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS69S1000000_18;

/* JADX INFO: renamed from: X.0hIG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1198500hIG implements IPoiVideoPublishService {
    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final boolean enableReadLocationMetaData() {
        PoiExpandScopeMetaDataExp.LIZ.getClass();
        return PoiExpandScopeMetaDataExp.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final boolean hitDraftPreloadPoiRecommendExp() {
        IPoiService iPoiService = (IPoiService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
        if (iPoiService == null || !iPoiService.enable()) {
            return false;
        }
        return ((Boolean) C0AQ5.LIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final boolean hitPreloadPoiRecommendExp() {
        IPoiService iPoiService = (IPoiService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
        return iPoiService != null && iPoiService.enable() && ((Number) C262320APu.LIZ.getValue()).intValue() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.poi.PoiData LIZLLL(com.ss.android.ugc.aweme.poi.videopublish.PoiPublishModel r43) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1198500hIG.LIZLLL(com.ss.android.ugc.aweme.poi.videopublish.PoiPublishModel):com.ss.android.ugc.aweme.poi.PoiData");
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final PoiData getPoiData(Function1<? super Class<? extends Object>, ? extends Object> function1) {
        PoiPublishModel poiPublishModel;
        Object objInvoke = function1.invoke(PoiPublishModel.class);
        if (!(objInvoke instanceof PoiPublishModel) || (poiPublishModel = (PoiPublishModel) objInvoke) == null) {
            return null;
        }
        return LIZLLL(poiPublishModel);
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final Pair<PoiData, PoiMobParam> getPoiDataAndMobParams(Function1<? super Class<? extends Object>, ? extends Object> function1) {
        PoiPublishModel poiPublishModel;
        Object objInvoke = function1.invoke(PoiPublishModel.class);
        if ((objInvoke instanceof PoiPublishModel) && (poiPublishModel = (PoiPublishModel) objInvoke) != null) {
            PoiData poiDataLIZLLL = LIZLLL(poiPublishModel);
            if (poiDataLIZLLL != null) {
                poiDataLIZLLL.toString();
            }
            return new Pair<>(LIZLLL(poiPublishModel), poiPublishModel.poiMobParams);
        }
        return new Pair<>(null, null);
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final void trackReadMetaDataDuration(long j) {
        C1198900hIu c1198900hIu = C1198900hIu.LIZ;
        c1198900hIu.getClass();
        c1198900hIu.LIZJ("read_meta_data_duration_v2", new AwS69S1000000_18(String.valueOf(System.currentTimeMillis() - j), 6));
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final void trackReadMetaDataSuccessRate(boolean z) {
        C1198900hIu c1198900hIu = C1198900hIu.LIZ;
        c1198900hIu.getClass();
        c1198900hIu.LIZJ("read_meta_data_success_rate", new AwS32S0010000_18(z, 8));
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final Map<String, Object> preloadPoiRecommend(MobParam mobParam, List<MediaLocationMetaDataModel> list) {
        boolean z;
        ArrayList arrayList;
        PoiMobParam poiMobParam = new PoiMobParam(null, null, null, null, mobParam.enterFrom, null, null, "", false, 0, C2046507zz.LIZ(mobParam), null, null, null);
        C20152913tH.LIZLLL.getClass();
        C20152113t9 c20152113t9LIZIZ = C20153113tJ.LIZIZ();
        if (c20152113t9LIZIZ != null) {
            z = true;
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "poi_mob_param", poiMobParam);
            if (list instanceof ArrayList) {
                arrayList = (ArrayList) list;
            } else {
                arrayList = null;
            }
            C786410Ut5.LJJIL(bundle, "metadata", arrayList);
            c20152113t9LIZIZ.LIZLLL(bundle, PoiPublishRecommendPreloader.class);
        } else {
            z = false;
        }
        return C2097608Jq.LJIIIIZZ(new Pair("is_hit_preload", Boolean.valueOf(z)), new Pair("is_location_allow", Boolean.valueOf(C1199950hKb.LIZ().LIZJ())), new Pair("scenario", "RECOMMEND"));
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final void startExtractFrame(String str, String str2) {
        C1173100gdI c1173100gdI = C1173100gdI.LIZ;
        c1173100gdI.getClass();
        if (C289320BVq.LIZ()) {
            c1173100gdI.LIZJ("start_frame_extraction", new AwS17S2000000_18(str, str2, 1));
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.videopublish.IPoiVideoPublishService
    public final void requestVideoUnderstand(String str, Long l, String str2, String str3) {
        ((IPoiRecommendService) ServiceManager.get().getService(IPoiRecommendService.class)).requestVideoUnderstand(str, l, str2, str3);
    }
}
