package X;

import webcast.data.multi_guest_play.CountdownConfig;
import webcast.data.multi_guest_play.CountdownContent;
import webcast.data.multi_guest_play.CountdownUser;

/* JADX INFO: renamed from: X.00XQ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00XQ {
    public static final CountdownContent LIZ(CountdownContent countdownContent, int i) {
        CountdownConfig countdownConfig;
        CountdownContent countdownContent2 = new CountdownContent();
        countdownContent2.status = i;
        countdownContent2.countdownId = countdownContent.countdownId;
        countdownContent2.channelId = countdownContent.channelId;
        countdownContent2.roomId = countdownContent.roomId;
        countdownContent2.startTime = countdownContent.startTime;
        countdownContent2.endTime = countdownContent.endTime;
        CountdownConfig countdownConfig2 = countdownContent.countdownConfig;
        CountdownUser countdownUser = null;
        if (countdownConfig2 != null) {
            countdownConfig = new CountdownConfig();
            countdownConfig.autoExpand = countdownConfig2.autoExpand;
            countdownConfig.duration = countdownConfig2.duration;
            countdownConfig.targetScore = countdownConfig2.targetScore;
        } else {
            countdownConfig = null;
        }
        countdownContent2.countdownConfig = countdownConfig;
        CountdownUser countdownUser2 = countdownContent.countdownUser;
        if (countdownUser2 != null) {
            countdownUser = new CountdownUser();
            countdownUser.userId = countdownUser2.userId;
            countdownUser.linkmicId = countdownUser2.linkmicId;
            countdownUser.score = countdownUser2.score;
            countdownUser.completionProgressPercent = countdownUser2.completionProgressPercent;
        }
        countdownContent2.countdownUser = countdownUser;
        return countdownContent2;
    }
}
