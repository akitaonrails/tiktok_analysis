package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import com.ss.android.ugc.aweme.tako.model.SearchBingItem;
import com.ss.android.ugc.aweme.tako.model.TakoSearchCarryInItem;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0Q7F, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q7F {
    public static final TakoSearchCarryInItem LIZ(TakoInfo takoInfo) {
        List<String> listLL = null;
        if (takoInfo == null) {
            return null;
        }
        if (takoInfo.isNewStyle()) {
            return new TakoSearchCarryInItem(takoInfo.getRichMessage(), null, null, null, null, new HashMap(takoInfo.getPlaceholderSources()), null, null, takoInfo.getEventTracker(), 222, null);
        }
        String message = takoInfo.getMessage();
        List<Aweme> awemeList = takoInfo.getAwemeList();
        List<SearchBingItem> webDocList = takoInfo.getWebDocList();
        List<String> longSugList = takoInfo.getLongSugList();
        if (longSugList == null) {
            List<String> sugList = takoInfo.getSugList();
            if (sugList != null) {
                listLL = C13LP.LL(sugList, 4);
            }
        } else {
            listLL = longSugList;
        }
        return new TakoSearchCarryInItem(message, awemeList, webDocList, null, null, null, null, listLL, takoInfo.getEventTracker(), 120, null);
    }
}
