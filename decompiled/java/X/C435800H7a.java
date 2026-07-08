package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import java.util.List;

/* JADX INFO: renamed from: X.0H7a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435800H7a extends C661020PwK<C435800H7a> {
    public /* synthetic */ C435800H7a(Aweme aweme, List list) {
        this(aweme, list, "click_enter", null);
    }

    public C435800H7a(Aweme aweme, List<SearchKeyFramePoint> list, String str, Integer num) {
        super("chapters_click", aweme, list);
        LJ("click_type", str);
        if (num != null) {
            int iIntValue = num.intValue();
            LIZLLL(iIntValue, "click_chapter_rank");
            SearchKeyFramePoint searchKeyFramePoint = (SearchKeyFramePoint) C13LP.LJJJLZIJ(iIntValue, list);
            if (searchKeyFramePoint != null) {
                LJ("click_chapter_title", searchKeyFramePoint.title);
                LJ("click_chapter_note", searchKeyFramePoint.contentDetails);
            }
        }
    }
}
