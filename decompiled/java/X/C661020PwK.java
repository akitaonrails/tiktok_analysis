package X;

import X.C661020PwK;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import java.util.List;

/* JADX INFO: renamed from: X.0PwK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C661020PwK<T extends C661020PwK<T>> extends C650460PfI<T> {
    public C661020PwK(String str, Aweme aweme, List<SearchKeyFramePoint> list) {
        super(str);
        int size = list.size();
        LJIL(aweme.getAid());
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (SearchKeyFramePoint searchKeyFramePoint : list) {
            int i2 = i + 1;
            if (i >= 0) {
                sb.append(searchKeyFramePoint.title);
                if (i < size - 1) {
                    sb.append(",");
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        LJ("chapters_title", sb.toString());
        LIZLLL(size, "chapters_num");
        String strLIZ = C661050PwN.LIZ(aweme);
        if (strLIZ != null) {
            LJ("token_type", strLIZ);
        }
        C659580Pu0.LIZ.getClass();
        LIZIZ(C659580Pu0.LIZIZ(aweme, false));
    }
}
