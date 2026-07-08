package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.aweme.commerce.CommercialVideoInfo;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.model.IAdAwemeService;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.VideoPlaybackConfig;
import com.ss.android.ugc.aweme.feed.model.AutoPullUpConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.PlayableData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009740cNo {
    public static final boolean LIZIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.components) != null && map.containsKey(EnumC1008920cMU.SUPPLEMENTAL_INFO.getType())) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(Aweme aweme) {
        Map<String, AnoleComponentModel> map;
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (anoleModel = awemeRawAd.getAnoleModel()) != null) {
            map = anoleModel.components;
        } else {
            map = null;
        }
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme) || map == null || !(!map.isEmpty())) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        VideoPlaybackConfig videoPlaybackConfig;
        Integer num;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (videoPlaybackConfig = awemeRawAd.getVideoPlaybackConfig()) != null && (num = videoPlaybackConfig.adSpeedUpEnable) != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }

    public static final CommercialVideoInfo LJ(Aweme aweme) {
        try {
            Gson gson = C7740030o.LIZ().getGson();
            String commercialVideoInfo = aweme.getCommercialVideoInfo();
            if (commercialVideoInfo == null) {
                commercialVideoInfo = null;
            }
            return (CommercialVideoInfo) GsonProtectorUtils.fromJson(gson, commercialVideoInfo, CommercialVideoInfo.class);
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return null;
        }
    }

    public static final float LJFF(Aweme aweme) {
        AutoPullUpConfig autoPullUpConfigLIZIZ;
        Float embeddedSheetInitialRatio;
        IAdAwemeService iAdAwemeService = (IAdAwemeService) PluggableExtentionKt.pluggableSpi$default(IAdAwemeService.class, false, false, false, 14, null);
        if (iAdAwemeService != null && (autoPullUpConfigLIZIZ = iAdAwemeService.LIZIZ(aweme.getAwemeRawAd())) != null && (embeddedSheetInitialRatio = autoPullUpConfigLIZIZ.getEmbeddedSheetInitialRatio()) != null) {
            return embeddedSheetInitialRatio.floatValue();
        }
        return 0.6f;
    }

    public static final int LJI(Aweme aweme) {
        if (LJIIL(aweme)) {
            return 4;
        }
        return 1;
    }

    public static final boolean LJII(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getAdLive() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIIZZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.components) != null && map.containsKey(EnumC1008920cMU.LYNX_END_LAYER.getType())) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIZ(Aweme aweme) {
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        AnoleModel anoleModel2;
        Map<String, AnoleComponentModel> map2;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (anoleModel2 = awemeRawAd.getAnoleModel()) != null && (map2 = anoleModel2.components) != null && map2.containsKey(EnumC1008920cMU.PROGRESS_BAR.getType())) {
                return true;
            }
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null && (anoleModel = awemeRawAd2.getAnoleModel()) != null && (map = anoleModel.components) != null && map.containsKey(EnumC1008920cMU.MULTI_PROGRESS_BAR.getType())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIIJ(Aweme aweme) {
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        Collection<AnoleComponentModel> collectionValues;
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        if (LJIIJJI(aweme)) {
            return true;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.components) != null && (collectionValues = map.values()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                if (Intrinsics.LJFF(((AnoleComponentModel) obj).type, EnumC1008920cMU.NATIVE_END_LAYER.getType())) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Map<String, ? extends Object> map2 = ((AnoleComponentModel) it2.next()).data;
                if (map2 != null && Intrinsics.LJFF(map2.get("show_type"), Double.valueOf(1.0d))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LJIIJJI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        Collection<AnoleComponentModel> collectionValues;
        if (aweme != null && aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.components) != null && (collectionValues = map.values()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                if (Intrinsics.LJFF(((AnoleComponentModel) obj).type, EnumC1008920cMU.LYNX_END_LAYER.getType())) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Map<String, ? extends Object> map2 = ((AnoleComponentModel) it2.next()).data;
                if (map2 != null && Intrinsics.LJFF(map2.get("style"), Double.valueOf(1.0d))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LJIIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        Integer carouselFormatType;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && (carouselFormatType = photoCarouselInfo.getCarouselFormatType()) != null && carouselFormatType.intValue() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILIIL(Aweme aweme) {
        String str;
        PlayableData playableData;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && (playableData = awemeRawAd.getPlayableData()) != null) {
                str = playableData.playableUrl;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LIZ(Aweme aweme, EnumC1008920cMU enumC1008920cMU) {
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.components) != null && map.containsKey(enumC1008920cMU.getType())) {
            return true;
        }
        return false;
    }
}
