package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.reflist.core.model.ReferenceItemBridge;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.FeedIconBubbleInfo;
import com.ss.android.ugc.aweme.tako.model.FeedbarDrawCreateInfo;
import com.ss.android.ugc.aweme.tako.model.NimbleParams;
import com.ss.android.ugc.aweme.tako.model.SearchBingItem;
import com.ss.android.ugc.aweme.tako.model.SmartSearchItem;
import com.ss.android.ugc.aweme.tako.model.SuggestionWordInfo;
import com.ss.android.ugc.aweme.tako.model.TakoActionItem;
import com.ss.android.ugc.aweme.tako.model.TakoEntranceRequestInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEventTracker;
import com.ss.android.ugc.aweme.tako.model.TakoImageItem;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0ybh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1864030ybh {
    void LIZ(Context context, String str, String str2, long j, AIBotInfo aIBotInfo, String str3, String str4, String str5, Map map, String str6, String str7, boolean z);

    String LIZIZ(C2189821An6 c2189821An6);

    void LIZJ(Context context, String str, String str2, long j, View view, String str3, String str4, String str5, List<String> list, String str6, String str7, String str8, String str9, Long l, String str10, List<? extends Aweme> list2, List<String> list3, List<SearchBingItem> list4, List<TakoImageItem> list5, List<ReferenceItemBridge> list6, Map<String, String> map, List<? extends Aweme> list7, TakoEventTracker takoEventTracker, TakoActionItem takoActionItem, boolean z, Aweme aweme, FeedbarDrawCreateInfo feedbarDrawCreateInfo, String str11, String str12, AIBotInfo aIBotInfo, String str13, String str14, Integer num, boolean z2, String str15, String str16, String str17, boolean z3, FeedIconBubbleInfo feedIconBubbleInfo, SuggestionWordInfo suggestionWordInfo, TakoEntranceRequestInfo takoEntranceRequestInfo, String str18, String str19, String str20, String str21, String str22, SmartSearchItem smartSearchItem, boolean z4, boolean z5, boolean z6, boolean z7, InterfaceC19396010uU interfaceC19396010uU, InterfaceC19395910uT interfaceC19395910uT, String str23, String str24, Integer num2, NimbleParams nimbleParams, C665120Q7a c665120Q7a, String str25);
}
