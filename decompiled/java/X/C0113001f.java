package X;

import com.bytedance.android.livesdk.model.message.RankNoticeMessage;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUser;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchTitleBarDisplayRule;
import com.bytedance.android.livesdkapi.depend.model.live.match.MatchTitleBarTrigger;
import com.bytedance.android.livesdkapi.depend.model.live.match.TitleBarDisplayResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.001f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0113001f {
    public static final Map<Long, BattleTeamResult> LIZ(Map<Long, BattleResult> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            for (Map.Entry<Long, BattleResult> entry : map.entrySet()) {
                Long key = entry.getKey();
                Long lValueOf = Long.valueOf(entry.getValue().userId);
                long j = entry.getValue().score;
                int i = entry.getValue().result;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new BattleTeamUser(Long.valueOf(entry.getValue().userId), Long.valueOf(entry.getValue().score)));
                linkedHashMap.put(key, new BattleTeamResult(lValueOf, j, i, arrayList));
            }
        }
        return linkedHashMap;
    }

    public static final List<Text> LIZIZ(RankNoticeMessage rankNoticeMessage) {
        Text[] textArr = new Text[2];
        Text text = rankNoticeMessage.contentText;
        Text text2 = null;
        if (text == null || !LIZLLL(text)) {
            text = null;
        }
        textArr[0] = text;
        Text text3 = rankNoticeMessage.affiliatedContentText;
        if (text3 != null && LIZLLL(text3)) {
            text2 = text3;
        }
        textArr[1] = text2;
        return C13LQ.LJIJI(textArr);
    }

    public static final boolean LIZLLL(Text text) {
        boolean z = false;
        if (text == null) {
            return false;
        }
        String str = text.defaultPattern;
        if (str == null || a0.LJJJIL(str)) {
            z = true;
        }
        return !z;
    }

    public static final Text LIZJ(int i, List list) {
        Object next;
        TitleBarDisplayResource titleBarDisplayResource;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                MatchTitleBarTrigger matchTitleBarTrigger = ((MatchTitleBarDisplayRule) next).trigger;
                if (matchTitleBarTrigger != null && matchTitleBarTrigger.type == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        MatchTitleBarDisplayRule matchTitleBarDisplayRule = (MatchTitleBarDisplayRule) next;
        if (matchTitleBarDisplayRule == null || (titleBarDisplayResource = matchTitleBarDisplayRule.displayResource) == null) {
            return null;
        }
        return titleBarDisplayResource.contentText;
    }
}
