package X;

import com.ss.android.ugc.aweme.feed.model.story.RichTextInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.story.experiment.thought.StoryThoughtHolidayConfigSettings;
import com.ss.android.ugc.aweme.story.note.prompt.IFriendInteractionSettingsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.15gT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20583115gT {
    public static final C20583115gT LIZ = new C20583115gT();
    public static final StoryThoughtHolidayConfigSettings.StoryThoughtHolidayConfig LIZIZ;

    static {
        IFriendInteractionSettingsService iFriendInteractionSettingsService = (IFriendInteractionSettingsService) PluggableExtentionKt.pluggableSpi$default(IFriendInteractionSettingsService.class, false, false, false, 14, null);
        LIZIZ = iFriendInteractionSettingsService != null ? iFriendInteractionSettingsService.LIZJ() : null;
    }

    public static List LIZ() {
        List list;
        List listLJLI = C13LQ.LJLI(C11GY.LIZ());
        StoryThoughtHolidayConfigSettings.StoryThoughtHolidayConfig storyThoughtHolidayConfig = LIZIZ;
        if (storyThoughtHolidayConfig == null || (list = storyThoughtHolidayConfig.backgroundImageList) == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = (ArrayList) listLJLI;
        if (arrayList.isEmpty()) {
            return list;
        }
        arrayList.addAll(1, list);
        return listLJLI;
    }

    public static List LIZIZ(String str, Function1 function1) {
        List<String> list;
        List listLLIIII;
        StoryThoughtHolidayConfigSettings.StoryThoughtHolidayConfig storyThoughtHolidayConfig = LIZIZ;
        if (storyThoughtHolidayConfig != null && (!storyThoughtHolidayConfig.keyWords.isEmpty()) && (list = storyThoughtHolidayConfig.keyWords) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJIFFI(arrayList, Regex.findAll$default(new Regex(it2.next(), EnumC688760Qzy.IGNORE_CASE), str, 0, 2, null));
            }
            List<MatchResult> listLJLLLL = C13LP.LJLLLL(C20085613iQ.LIZ(AFwS232S0000000_4.get$arr$(271), AFwS232S0000000_4.get$arr$(272)), arrayList);
            ArrayList<MatchResult> arrayList2 = new ArrayList();
            for (MatchResult matchResult : listLJLLLL) {
                if (!arrayList2.isEmpty()) {
                    IntRange intRangeLIZIZ = ((MatchResult) C13LP.LJJLIIIJJI(arrayList2)).LIZIZ();
                    IntRange intRangeLIZIZ2 = matchResult.LIZIZ();
                    if (intRangeLIZIZ.LL > intRangeLIZIZ2.LL || intRangeLIZIZ.LLILLJJLI < intRangeLIZIZ2.LLILLJJLI) {
                    }
                }
                arrayList2.add(matchResult);
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            for (MatchResult matchResult2 : arrayList2) {
                int i = matchResult2.LIZIZ().LL;
                int i2 = matchResult2.LIZIZ().LLILLJJLI + 1;
                List<String> listLIZIZ = C1360590lVh.LIZIZ(str);
                int iLIZ = C1360590lVh.LIZ(i, listLIZIZ);
                int iLIZ2 = C1360590lVh.LIZ(i2, listLIZIZ);
                if (function1 != null) {
                    function1.invoke(matchResult2);
                }
                arrayList3.add(new RichTextInfo(iLIZ, iLIZ2, LIZIZ.gradientColors));
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList3);
            if (setLLIIJI != null && (listLLIIII = C13LP.LLIIII(setLLIIJI)) != null) {
                return listLLIIII;
            }
        }
        return C13BV.INSTANCE;
    }
}
