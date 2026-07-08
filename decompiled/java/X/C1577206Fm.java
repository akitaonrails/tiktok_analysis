package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.streak.api.IStreakPSPContextProvider;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.UserStreakInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.tiktok.ttm.ttmparam.ITTMParamData;
import com.tiktok.ttm.ttmparam.TTMCollectionParam;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Fm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1577206Fm extends ITTMParamData {
    public final StreakData LIZIZ;
    public final boolean LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(890));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1577206Fm)) {
            return false;
        }
        C1577206Fm c1577206Fm = (C1577206Fm) obj;
        return Intrinsics.LJFF(this.LIZIZ, c1577206Fm.LIZIZ) && this.LIZJ == c1577206Fm.LIZJ;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final Object getInputData() {
        return this;
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final int getType() {
        return 2;
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreakDataParamModel(streakData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isSelfHitStreakExp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final IStreakService LIZLLL() {
        return (IStreakService) this.LIZLLL.getValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsKey(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1577206Fm.containsKey(java.lang.String):boolean");
    }

    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final ITTMParamData getObjectItem(String str) {
        List<UserStreakInfo> list;
        if (!Intrinsics.LJFF(str, "userStreak") || (list = this.LIZIZ.userStreak) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (final UserStreakInfo userStreakInfo : list) {
            arrayList.add(new ITTMParamData(userStreakInfo) { // from class: X.06EZ
                public final UserStreakInfo LIZIZ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C06EZ) && Intrinsics.LJFF(this.LIZIZ, ((C06EZ) obj).LIZIZ);
                }

                @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                public final int getType() {
                    return 2;
                }

                public final int hashCode() {
                    return this.LIZIZ.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("UserStreakParamModel(userStreakInfo=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                public final Object getInputData() {
                    return this.LIZIZ;
                }

                {
                    this.LIZIZ = userStreakInfo;
                }

                @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                public final long getIntValue(String str2, int i) {
                    if (Intrinsics.LJFF(str2, "uid")) {
                        return this.LIZIZ.uid;
                    }
                    if (Intrinsics.LJFF(str2, "timestamp_second")) {
                        return this.LIZIZ.timestamp;
                    }
                    return 0L;
                }
            });
        }
        return new TTMCollectionParam((List<Object>) arrayList);
    }

    public C1577206Fm(StreakData streakData, boolean z) {
        this.LIZIZ = streakData;
        this.LIZJ = z;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final long getIntValue(String str, int i) {
        long j;
        int iD0;
        List<UserStreakInfo> list;
        UserStreakInfo userStreakInfo;
        List<UserStreakInfo> list2;
        UserStreakInfo userStreakInfo2;
        List<UserStreakInfo> list3;
        UserStreakInfo userStreakInfo3;
        List<UserStreakInfo> list4;
        UserStreakInfo userStreakInfo4;
        if (str != null) {
            String str2 = "";
            int iIntValue = 0;
            switch (str.hashCode()) {
                case -1939608446:
                    if (!str.equals("endAtSecond")) {
                        return 0L;
                    }
                    return this.LIZIZ.endAt;
                case -1723389234:
                    if (!str.equals("client_timezone_offset_second")) {
                        return 0L;
                    }
                    return ((long) TimeZone.getTimeZone(this.LIZIZ.timeZoneId).getOffset(System.currentTimeMillis())) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                case -1299957432:
                    if (!str.equals("restoreAvailableTime")) {
                        return 0L;
                    }
                    return this.LIZIZ.restoreAvailableTime;
                case -1197798521:
                    if (!str.equals("remainRestoreCnt")) {
                        return 0L;
                    }
                    iD0 = this.LIZIZ.remainRestoreCnt;
                    return iD0;
                case -891990146:
                    if (!str.equals("streak")) {
                        return 0L;
                    }
                    iD0 = this.LIZIZ.streak;
                    return iD0;
                case -849022641:
                    if (!str.equals("firstTs") || (list4 = this.LIZIZ.userStreak) == null || list4.size() != 2 || (userStreakInfo4 = (UserStreakInfo) ListProtector.get(list4, 0)) == null) {
                        return 0L;
                    }
                    return userStreakInfo4.timestamp;
                case -817609924:
                    if (!str.equals("secondUid") || (list3 = this.LIZIZ.userStreak) == null || list3.size() != 2 || (userStreakInfo3 = (UserStreakInfo) ListProtector.get(list3, 1)) == null) {
                        return 0L;
                    }
                    return userStreakInfo3.uid;
                case -720405844:
                    if (!str.equals("remindAtSecond")) {
                        return 0L;
                    }
                    return this.LIZIZ.remindAt;
                case -565970802:
                    if (!str.equals("convType")) {
                        return 0L;
                    }
                    iD0 = this.LIZIZ.convType;
                    return iD0;
                case -549897344:
                    if (!str.equals("firstUid") || (list2 = this.LIZIZ.userStreak) == null || list2.size() != 2 || (userStreakInfo2 = (UserStreakInfo) ListProtector.get(list2, 0)) == null) {
                        return 0L;
                    }
                    return userStreakInfo2.uid;
                case -521491221:
                    if (!str.equals("currTimeWindowInDays")) {
                        return 0L;
                    }
                    String id = this.LIZIZ.timeZoneId;
                    if (id != null || (id = Calendar.getInstance().getTimeZone().getID()) != null) {
                        str2 = id;
                    }
                    iD0 = LIZLLL().d0(LIZLLL().g(0, str2).LL * ((long) LSPassThroughRecordSizeConfig.DEFAULT), str2);
                    return iD0;
                case 23924473:
                    if (!str.equals("activeBeforeSecond")) {
                        return 0L;
                    }
                    return this.LIZIZ.activeBefore;
                case 102865796:
                    if (!str.equals("level")) {
                        return 0L;
                    }
                    Integer num = this.LIZIZ.level;
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    return iIntValue;
                case 335105168:
                    if (!str.equals("activeStartSecond")) {
                        return 0L;
                    }
                    return this.LIZIZ.activeStart;
                case 359782946:
                    if (!str.equals("isSelfHitStreakExp") || !this.LIZJ) {
                        return 0L;
                    }
                    return 1L;
                case 884103060:
                    if (!str.equals("cmdType")) {
                        return 0L;
                    }
                    Integer num2 = this.LIZIZ.cmdType;
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    }
                    return iIntValue;
                case 943456787:
                    if (!str.equals("secondTs") || (list = this.LIZIZ.userStreak) == null || list.size() != 2 || (userStreakInfo = (UserStreakInfo) ListProtector.get(list, 1)) == null) {
                        return 0L;
                    }
                    return userStreakInfo.timestamp;
                case 1239546035:
                    if (!str.equals("currTimeWindowStart")) {
                        return 0L;
                    }
                    String id2 = this.LIZIZ.timeZoneId;
                    if (id2 != null || (id2 = Calendar.getInstance().getTimeZone().getID()) != null) {
                        str2 = id2;
                    }
                    j = LIZLLL().g(0, str2).LL;
                    return j * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                case 1243138282:
                    if (!str.equals("lastStreakDataEndTime")) {
                        return 0L;
                    }
                    IStreakPSPContextProvider.LIZ.getClass();
                    return C06GG.LIZ().LJFF(this.LIZIZ);
                case 1369213417:
                    if (!str.equals("createTime")) {
                        return 0L;
                    }
                    return this.LIZIZ.createTime;
                case 1849049422:
                    if (!str.equals("previousTimeWindowStart")) {
                        return 0L;
                    }
                    String id3 = this.LIZIZ.timeZoneId;
                    if (id3 != null || (id3 = Calendar.getInstance().getTimeZone().getID()) != null) {
                        str2 = id3;
                    }
                    j = LIZLLL().g(-1, str2).LL;
                    return j * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                case 1851598639:
                    if (!str.equals("total_restore_cnt_this_window")) {
                        return 0L;
                    }
                    iD0 = this.LIZIZ.totalRestoreCntThisWindow;
                    return iD0;
                case 1879003335:
                    if (!str.equals("previousTimeWindowEnd")) {
                        return 0L;
                    }
                    String id4 = this.LIZIZ.timeZoneId;
                    if (id4 != null || (id4 = Calendar.getInstance().getTimeZone().getID()) != null) {
                        str2 = id4;
                    }
                    j = LIZLLL().g(-1, str2).LLILLJJLI;
                    return j * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                case 2106301804:
                    if (!str.equals("currTimeWindowEnd")) {
                        return 0L;
                    }
                    String id5 = this.LIZIZ.timeZoneId;
                    if (id5 != null || (id5 = Calendar.getInstance().getTimeZone().getID()) != null) {
                        str2 = id5;
                    }
                    j = LIZLLL().g(0, str2).LLILLJJLI;
                    return j * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                default:
                    return 0L;
            }
        }
        return 0L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
    public final String getStringValue(String str, int i) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (str != null) {
            switch (str.hashCode()) {
                case -1440013438:
                    if (str.equals("messageId") && (str7 = this.LIZIZ.serverMsgId) != null) {
                        return str7;
                    }
                    break;
                case -1354777745:
                    if (str.equals("convId") && (str6 = this.LIZIZ.convId) != null) {
                        return str6;
                    }
                    break;
                case -1297673019:
                    if (str.equals("messageScene") && (str5 = this.LIZIZ.msgScene) != null) {
                        return str5;
                    }
                    break;
                case -892481550:
                    if (str.equals(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)) {
                        C06G2 c06g2 = EnumC1578706Gb.Companion;
                        EnumC1579606Gk enumC1579606GkO = LIZLLL().o(this.LIZIZ);
                        c06g2.getClass();
                        return C06G2.LIZ(enumC1579606GkO).getValue();
                    }
                    break;
                case -294460212:
                    if (str.equals("uniqueId") && (str4 = this.LIZIZ.serverMsgId) != null) {
                        return str4;
                    }
                    break;
                case 103148415:
                    if (str.equals("logId") && (str3 = this.LIZIZ.logId) != null) {
                        return str3;
                    }
                    break;
                case 988947220:
                    if (str.equals("timeZoneId") && (str2 = this.LIZIZ.timeZoneId) != null) {
                        return str2;
                    }
                    break;
            }
        }
        return "";
    }
}
