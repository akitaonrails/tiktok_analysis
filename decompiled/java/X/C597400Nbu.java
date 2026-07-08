package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.brandzone.data.BrandZoneCard;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Nbu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C597400Nbu extends C09AY implements Function2<SearchMixFeed, String, Boolean> {
    public C597400Nbu() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(SearchMixFeed searchMixFeed, String str) {
        LinkedHashMap<String, List<Aweme>> dynamicAwemeMaps;
        BrandZoneCard brandZoneCard;
        LinkedHashMap<String, List<Aweme>> dynamicAwemeMaps2;
        Collection<List<Aweme>> collectionValues;
        SearchMixFeed searchMixFeed2 = searchMixFeed;
        BrandZoneCard brandZoneCard2 = searchMixFeed2.brandZoneCard;
        boolean z = false;
        if (brandZoneCard2 != null && (dynamicAwemeMaps = brandZoneCard2.getDynamicAwemeMaps()) != null && (!dynamicAwemeMaps.isEmpty()) && (brandZoneCard = searchMixFeed2.brandZoneCard) != null && (dynamicAwemeMaps2 = brandZoneCard.getDynamicAwemeMaps()) != null && (collectionValues = dynamicAwemeMaps2.values()) != null) {
            Iterator it2 = ((ArrayList) C15438062q.LJIJJLI(collectionValues)).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.LJFF(((Aweme) next).getAid(), str)) {
                    if (next != null) {
                        z = true;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
