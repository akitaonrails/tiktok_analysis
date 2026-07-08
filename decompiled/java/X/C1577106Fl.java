package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.impl.api.StreakValueParams;

/* JADX INFO: renamed from: X.06Fl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1577106Fl {
    public static final StreakValueParams LIZ(StreakData streakData) {
        return new StreakValueParams(Integer.valueOf(streakData.convType), streakData.convId, streakData.serverMsgId, streakData.timeZoneId, Long.valueOf(streakData.activeStart), Long.valueOf(streakData.activeBefore), Long.valueOf(streakData.endAt), Long.valueOf(streakData.remindAt), Integer.valueOf(streakData.streak), streakData.userStreak, Long.valueOf(streakData.restoreAvailableTime), Integer.valueOf(streakData.remainRestoreCnt), Integer.valueOf(streakData.totalRestoreCntThisWindow), streakData.cmdType, streakData.level, streakData.dayBeginArray, Long.valueOf(streakData.createTime), streakData.logId, streakData.uuid, streakData.version, streakData.source, streakData.msgScene, 0L);
    }
}
