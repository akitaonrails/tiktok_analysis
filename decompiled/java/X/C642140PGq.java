package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchHubEntityCard;

/* JADX INFO: renamed from: X.0PGq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642140PGq {
    public static final boolean LIZ(SearchHubEntityCard searchHubEntityCard) {
        EntityCardTitle entityCardTitle;
        if (searchHubEntityCard == null || !C0BY8.LIZ() || !searchHubEntityCard.useMixEntityStyle) {
            return false;
        }
        EntityCardTitle entityCardTitle2 = searchHubEntityCard.topCardInfo;
        if ((entityCardTitle2 == null || entityCardTitle2.titleStyle != EnumC654070Pl7.WIKI.getType()) && ((entityCardTitle = searchHubEntityCard.topCardInfo) == null || entityCardTitle.titleStyle != EnumC654070Pl7.IMDB.getType())) {
            return false;
        }
        return true;
    }

    public static final boolean LIZIZ(SearchHubEntityCard searchHubEntityCard) {
        EntityCardTitle entityCardTitle;
        if (searchHubEntityCard != null && (entityCardTitle = searchHubEntityCard.topCardInfo) != null && entityCardTitle.dynamicPatch != null) {
            return false;
        }
        return true;
    }
}
