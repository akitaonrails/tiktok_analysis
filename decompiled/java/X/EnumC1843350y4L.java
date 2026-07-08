package X;

import com.bytedance.android.livesdk.livesetting.rank.RankEntranceMonitorSamplingSetting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0y4L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1843350y4L {
    public static final EnumC1843350y4L BAD_UPDATES;
    public static final EnumC1843350y4L DISMISS_ENTER_RANK;
    public static final EnumC1843350y4L DUPLICATE_MSG;
    public static final EnumC1843350y4L ENTRANCES_TABS_MISMATCH;
    public static final /* synthetic */ EnumC1843350y4L[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1843350y4L LOOP_TO_LOCK_MSG;
    public static final EnumC1843350y4L LOW_END_DEVICE_DOWNGRADE;
    public static final EnumC1843350y4L RANK_UNAVAILABLE_TOAST;
    public static final EnumC1843350y4L UNEXPECTED_RANKING_CHANGE_MSG;
    public static final EnumC1843350y4L UNEXPECTED_SHIFT;
    public final String LL;
    public final long LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1843350y4L> getEntries() {
        return LLILZ;
    }

    static {
        RankEntranceMonitorSamplingSetting rankEntranceMonitorSamplingSetting = RankEntranceMonitorSamplingSetting.INSTANCE;
        EnumC1843350y4L enumC1843350y4L = new EnumC1843350y4L(0, "UNEXPECTED_SHIFT", rankEntranceMonitorSamplingSetting.getValue().unexpectedShiftSamplingRate, "unexpected_shift");
        UNEXPECTED_SHIFT = enumC1843350y4L;
        EnumC1843350y4L enumC1843350y4L2 = new EnumC1843350y4L(1, "ENTRANCES_TABS_MISMATCH", rankEntranceMonitorSamplingSetting.getValue().unexpectedTabSamplingRate, "unexpected_tab");
        ENTRANCES_TABS_MISMATCH = enumC1843350y4L2;
        EnumC1843350y4L enumC1843350y4L3 = new EnumC1843350y4L(2, "BAD_UPDATES", rankEntranceMonitorSamplingSetting.getValue().badUpdatesSamplingRate, "bad_updates");
        BAD_UPDATES = enumC1843350y4L3;
        EnumC1843350y4L enumC1843350y4L4 = new EnumC1843350y4L(3, "UNEXPECTED_RANKING_CHANGE_MSG", rankEntranceMonitorSamplingSetting.getValue().unexpectedRankSamplingRate, "unexpected_rank");
        UNEXPECTED_RANKING_CHANGE_MSG = enumC1843350y4L4;
        EnumC1843350y4L enumC1843350y4L5 = new EnumC1843350y4L(4, "DUPLICATE_MSG", rankEntranceMonitorSamplingSetting.getValue().duplicatedMsgSamplingRate, "duplicated_msg");
        DUPLICATE_MSG = enumC1843350y4L5;
        EnumC1843350y4L enumC1843350y4L6 = new EnumC1843350y4L(5, "LOOP_TO_LOCK_MSG", rankEntranceMonitorSamplingSetting.getValue().loopShutDownSamplingRate, "loop_shut_down");
        LOOP_TO_LOCK_MSG = enumC1843350y4L6;
        EnumC1843350y4L enumC1843350y4L7 = new EnumC1843350y4L(6, "DISMISS_ENTER_RANK", rankEntranceMonitorSamplingSetting.getValue().missEnterRankAnimationSamplingRate, "miss_enter_rank_animation");
        DISMISS_ENTER_RANK = enumC1843350y4L7;
        EnumC1843350y4L enumC1843350y4L8 = new EnumC1843350y4L(7, "RANK_UNAVAILABLE_TOAST", rankEntranceMonitorSamplingSetting.getValue().rankUnavailableToastSamplingRate, "rank_unavailable_toast");
        RANK_UNAVAILABLE_TOAST = enumC1843350y4L8;
        EnumC1843350y4L enumC1843350y4L9 = new EnumC1843350y4L(8, "LOW_END_DEVICE_DOWNGRADE", rankEntranceMonitorSamplingSetting.getValue().lowEndDeviceDowngradeSamplingRate, "low_end_device_downgrade");
        LOW_END_DEVICE_DOWNGRADE = enumC1843350y4L9;
        EnumC1843350y4L[] enumC1843350y4LArr = {enumC1843350y4L, enumC1843350y4L2, enumC1843350y4L3, enumC1843350y4L4, enumC1843350y4L5, enumC1843350y4L6, enumC1843350y4L7, enumC1843350y4L8, enumC1843350y4L9};
        LLILLL = enumC1843350y4LArr;
        LLILZ = new C2254308sP(enumC1843350y4LArr);
    }

    public static EnumC1843350y4L[] values() {
        return (EnumC1843350y4L[]) LLILLL.clone();
    }

    public final String getBadCaseType() {
        return this.LL;
    }

    public final long getReportBadCaseSamplingRate() {
        return this.LLILLJJLI;
    }

    public static EnumC1843350y4L valueOf(String str) {
        return (EnumC1843350y4L) C08FF.LIZ(EnumC1843350y4L.class, str);
    }

    public EnumC1843350y4L(int i, String str, long j, String str2) {
        this.LL = str2;
        this.LLILLJJLI = j;
    }
}
