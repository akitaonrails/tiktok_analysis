package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonKey;
import com.ss.android.ugc.aweme.feed.model.banner.BannerCommonStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardButtonContainerStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentKey;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardElementKey;
import com.ss.android.ugc.aweme.feed.model.banner.StandardElementStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardInfoBarContainerStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagContainerStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagKey;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagStruct;
import com.ss.android.ugc.aweme.feed.model.metainfo.MetaInfoCommonStruct;
import com.ss.android.ugc.aweme.feed.model.metainfo.MetaInfoContainerStruct;
import com.ss.android.ugc.aweme.feed.model.metainfo.MetaInfoKey;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.02pA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C705402pA {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZIZ(Aweme aweme) {
        List<StandardElementStruct> list;
        String str;
        List<StandardComponentStruct> list2;
        String str2;
        List<MetaInfoCommonStruct> list3;
        String str3;
        String str4;
        if (aweme == null) {
            return new Pair("", 0);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (it2.hasNext()) {
                String componentKey = it2.next().getComponentKey();
                if (componentKey != null) {
                    LIZ(linkedHashSet, componentKey);
                }
            }
        }
        List<BannerCommonStruct> banners = aweme.getBanners();
        if (banners != null) {
            Iterator<BannerCommonStruct> it3 = banners.iterator();
            while (it3.hasNext()) {
                BannerCommonKey bannerCommonKey = it3.next().bannerKey;
                if (bannerCommonKey != null) {
                    str4 = bannerCommonKey.componentKey;
                } else {
                    str4 = null;
                }
                LIZ(linkedHashSet, str4);
            }
        }
        StandardComponentInfo standardComponentInfo = aweme.getStandardComponentInfo();
        if (standardComponentInfo != null) {
            MetaInfoContainerStruct metaInfoContainerStruct = standardComponentInfo.metaInfoContainer;
            if (metaInfoContainerStruct != null && (list3 = metaInfoContainerStruct.metaInfos) != null) {
                Iterator<MetaInfoCommonStruct> it4 = list3.iterator();
                while (it4.hasNext()) {
                    MetaInfoKey metaInfoKey = it4.next().key;
                    if (metaInfoKey != null) {
                        str3 = metaInfoKey.componentKey;
                    } else {
                        str3 = null;
                    }
                    LIZ(linkedHashSet, str3);
                }
            }
            StandardButtonContainerStruct standardButtonContainerStruct = standardComponentInfo.buttonContainer;
            if (standardButtonContainerStruct != null && (list2 = standardButtonContainerStruct.buttons) != null) {
                Iterator<StandardComponentStruct> it5 = list2.iterator();
                while (it5.hasNext()) {
                    StandardComponentKey standardComponentKey = it5.next().key;
                    if (standardComponentKey != null) {
                        str2 = standardComponentKey.componentKey;
                    } else {
                        str2 = null;
                    }
                    LIZ(linkedHashSet, str2);
                }
            }
            LIZJ(standardComponentInfo.highTag, linkedHashSet);
            LIZJ(standardComponentInfo.bottomTag, linkedHashSet);
            LIZJ(standardComponentInfo.metaTag, linkedHashSet);
            StandardInfoBarContainerStruct standardInfoBarContainerStruct = standardComponentInfo.infoBarContainer;
            if (standardInfoBarContainerStruct != null && (list = standardInfoBarContainerStruct.elements) != null) {
                Iterator<StandardElementStruct> it6 = list.iterator();
                while (it6.hasNext()) {
                    StandardElementKey standardElementKey = it6.next().key;
                    if (standardElementKey != null) {
                        str = standardElementKey.componentKey;
                    } else {
                        str = null;
                    }
                    LIZ(linkedHashSet, str);
                }
            }
        }
        return new Pair(C13LP.LJJLIIIJ(linkedHashSet, ",", null, null, 0, null, null, 62), Integer.valueOf(linkedHashSet.size()));
    }

    public static void LIZ(LinkedHashSet linkedHashSet, String str) {
        if (str != null && str.length() != 0) {
            linkedHashSet.add(str);
        }
    }

    public static void LIZJ(StandardTagContainerStruct standardTagContainerStruct, LinkedHashSet linkedHashSet) {
        List<StandardTagStruct> list;
        String str;
        if (standardTagContainerStruct != null && (list = standardTagContainerStruct.tags) != null) {
            Iterator<StandardTagStruct> it2 = list.iterator();
            while (it2.hasNext()) {
                StandardTagKey standardTagKey = it2.next().key;
                if (standardTagKey != null) {
                    str = standardTagKey.componentKey;
                } else {
                    str = null;
                }
                LIZ(linkedHashSet, str);
            }
        }
    }
}
