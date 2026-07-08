package X;

import android.view.View;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionRecommendNameCell;
import com.ss.android.ugc.aweme.topic.book.creator.BookSearchItemCell;
import com.ss.android.ugc.aweme.topic.book.recommend.BookRecommendItemCell;
import com.ss.android.ugc.aweme.topic.book.recommend.BookRecommendSearchCell;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.aweme.topic.movie.creator.MovieSearchItemCell;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C638890P4d implements InterfaceC2211931Bhf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2211931Bhf
    public final void LIZ(View view, String str) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view, str);
                break;
            case 1:
                LIZ$1(this, view, str);
                break;
            case 2:
                LIZ$2(this, view, str);
                break;
            case 3:
                LIZ$3(this, view, str);
                break;
            case 4:
                LIZ$4(this, view, str);
                break;
        }
    }

    public C638890P4d(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C638890P4d c638890P4d, View view, String str) {
        String str2;
        CollectionRecommendNameCell collectionRecommendNameCell = (CollectionRecommendNameCell) c638890P4d.l0;
        C1875707Wh item = collectionRecommendNameCell.getItem();
        if (item != null) {
            str2 = item.LLILLJJLI;
        } else {
            str2 = null;
        }
        collectionRecommendNameCell.I5("ttls_ai_collection_name_show", str2);
    }

    public static final void LIZ$1(C638890P4d c638890P4d, View view, String str) {
        Map<String, String> map;
        C2344009Gk c2344009Gk;
        C0OAT item = ((BookSearchItemCell) c638890P4d.l0).getItem();
        if (item != null && Intrinsics.LJFF(item.LLILZ, Boolean.FALSE)) {
            C0OAT item2 = ((BookSearchItemCell) c638890P4d.l0).getItem();
            if (item2 != null && (c2344009Gk = item2.LLILLL) != null) {
                map = c2344009Gk.LIZ;
            } else {
                map = null;
            }
            C20684815ws.LJIILLIIL("trending_words_show", map);
        }
    }

    public static final void LIZ$2(C638890P4d c638890P4d, View view, String str) {
        String str2;
        TopicRawInfo topicRawInfo;
        TopicRawInfo topicRawInfo2;
        C626960OiU c626960OiU = C626960OiU.LIZ;
        C0OAT item = ((BookRecommendItemCell) c638890P4d.l0).getItem();
        String str3 = null;
        if (item != null && (topicRawInfo2 = item.LL) != null) {
            str2 = topicRawInfo2.id;
        } else {
            str2 = null;
        }
        C0OAT item2 = ((BookRecommendItemCell) c638890P4d.l0).getItem();
        if (item2 != null && (topicRawInfo = item2.LL) != null) {
            str3 = topicRawInfo.title;
        }
        c626960OiU.getClass();
        C626960OiU.LIZJ("topic_detail", str2, str3);
    }

    public static final void LIZ$3(C638890P4d c638890P4d, View view, String str) {
        boolean zLJFF;
        String str2;
        TopicRawInfo topicRawInfo;
        TopicRawInfo topicRawInfo2;
        C2344009Gk c2344009Gk;
        C0OAT item = ((BookRecommendSearchCell) c638890P4d.l0).getItem();
        if (item != null) {
            zLJFF = Intrinsics.LJFF(item.LLILZ, Boolean.FALSE);
        } else {
            zLJFF = false;
        }
        String str3 = null;
        map = null;
        Map<String, String> map = null;
        str3 = null;
        if (zLJFF) {
            C0OAT item2 = ((BookRecommendSearchCell) c638890P4d.l0).getItem();
            if (item2 != null && (c2344009Gk = item2.LLILLL) != null) {
                map = c2344009Gk.LIZ;
            }
            C20684815ws.LJIILLIIL("trending_words_show", map);
            return;
        }
        C626960OiU c626960OiU = C626960OiU.LIZ;
        C0OAT item3 = ((BookRecommendSearchCell) c638890P4d.l0).getItem();
        if (item3 != null && (topicRawInfo2 = item3.LL) != null) {
            str2 = topicRawInfo2.id;
        } else {
            str2 = null;
        }
        C0OAT item4 = ((BookRecommendSearchCell) c638890P4d.l0).getItem();
        if (item4 != null && (topicRawInfo = item4.LL) != null) {
            str3 = topicRawInfo.title;
        }
        c626960OiU.getClass();
        C626960OiU.LIZJ("topic_recommend_page", str2, str3);
    }

    public static final void LIZ$4(C638890P4d c638890P4d, View view, String str) {
        Map<String, String> map;
        C2344009Gk c2344009Gk;
        C0OAT item = ((MovieSearchItemCell) c638890P4d.l0).getItem();
        if (item != null && Intrinsics.LJFF(item.LLILZ, Boolean.FALSE)) {
            C0OAT item2 = ((MovieSearchItemCell) c638890P4d.l0).getItem();
            if (item2 != null && (c2344009Gk = item2.LLILLL) != null) {
                map = c2344009Gk.LIZ;
            } else {
                map = null;
            }
            C20684815ws.LJIILLIIL("trending_words_show", map);
        }
    }
}
