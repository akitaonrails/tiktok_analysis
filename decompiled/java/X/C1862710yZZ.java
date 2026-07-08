package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotHistory;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0yZZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862710yZZ {
    public static final TakoBotInfo LIZ(AIBotInfo aIBotInfo) {
        TakoBotInfo next;
        Iterator<TakoBotInfo> it2 = C1860520yW2.LIZ.LJIIIIZZ().botInfos.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.botId == aIBotInfo.botId) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        TakoBotInfo takoBotInfo = next;
        if (takoBotInfo == null) {
            long j = aIBotInfo.botId;
            int i = aIBotInfo.botSource;
            String str = aIBotInfo.botName;
            String str2 = aIBotInfo.botAvatar;
            return new TakoBotInfo(j, i, str, aIBotInfo.startMsg, aIBotInfo.botType, aIBotInfo.botMode, null, str2, aIBotInfo.noHistory, aIBotInfo.useIndependentDomain, null, false, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 67107904, null);
        }
        return takoBotInfo;
    }

    public static final TakoActiveBotHistory LIZIZ(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return new TakoActiveBotHistory(new ArrayList());
            }
            return (TakoActiveBotHistory) C597040NbK.LIZ().LJII(str, TakoActiveBotHistory.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new TakoActiveBotHistory(new ArrayList());
        }
    }
}
