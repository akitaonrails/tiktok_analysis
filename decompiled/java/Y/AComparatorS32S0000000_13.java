package Y;

import X.AbstractC2213701BkW;
import X.C0V47;
import X.C0VAG;
import X.C0VLB;
import X.C0VXJ;
import X.C0VYK;
import X.C0WMB;
import X.C1635170seZ;
import X.C20085613iQ;
import X.C791260V2e;
import X.C792840V8g;
import X.C815070VyD;
import X.C818420W8q;
import X.C830610WiB;
import X.C849680XUw;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.crash.crash.CrashSummary;
import com.bytedance.crash.general.AppInfo;
import com.bytedance.sdk.account.otl.OneTapLoginShareInfo;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.oneclicklogin.storage.EncryptedLoginMethod;
import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import com.ss.android.ugc.aweme.report.ShowReportInfo;
import com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class AComparatorS32S0000000_13 implements Comparator {
    public final int $t;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, obj, obj2);
            case 1:
                return compare$1(this, obj, obj2);
            case 2:
                return compare$2(this, obj, obj2);
            case 3:
                return compare$3(this, obj, obj2);
            case 4:
                return compare$4(this, obj, obj2);
            case 5:
                return compare$5(this, obj, obj2);
            case 6:
                return compare$6(this, obj, obj2);
            case 7:
                return compare$7(this, obj, obj2);
            case 8:
                return compare$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return compare$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return compare$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return compare$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return compare$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return compare$13(this, obj, obj2);
            case 14:
                return compare$14(this, obj, obj2);
            case 15:
                return compare$15(this, obj, obj2);
            case 16:
                return compare$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return compare$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return compare$18(this, obj, obj2);
            case 19:
                return compare$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return compare$20(this, obj, obj2);
            case 21:
                return compare$21(this, obj, obj2);
            case 22:
                return compare$22(this, obj, obj2);
            case 23:
                return compare$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return compare$24(this, obj, obj2);
            case 25:
                return compare$25(this, obj, obj2);
            case 26:
                return compare$26(this, obj, obj2);
            case 27:
                return compare$27(this, obj, obj2);
            case 28:
                return compare$28(this, obj, obj2);
            case 29:
                return compare$29(this, obj, obj2);
            case 30:
                return compare$30(this, obj, obj2);
            case 31:
                return compare$31(this, obj, obj2);
            case 32:
                return compare$32(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return compare$33(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return compare$34(this, obj, obj2);
            case 35:
                return compare$35(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return compare$36(this, obj, obj2);
            case 37:
                return compare$37(this, obj, obj2);
            case 38:
                return compare$38(this, obj, obj2);
            case 39:
                return compare$39(this, obj, obj2);
            case 40:
                return compare$40(this, obj, obj2);
            case 41:
                return compare$41(this, obj, obj2);
            case 42:
                return compare$42(this, obj, obj2);
            case 43:
                return compare$43(this, obj, obj2);
            case 44:
                return compare$44(this, obj, obj2);
            case 45:
                return compare$45(this, obj, obj2);
            default:
                return 0;
        }
    }

    public AComparatorS32S0000000_13(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return Integer.compare(((Integer) ((Map.Entry) obj2).getValue()).intValue(), ((Integer) ((Map.Entry) obj).getValue()).intValue());
    }

    public static final int compare$1(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return String.CASE_INSENSITIVE_ORDER.compare(obj, obj2);
    }

    public static final int compare$10(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(C849680XUw.LIZIZ((BaseLoginMethod) obj2, 31536000000L)), Long.valueOf(C849680XUw.LIZIZ((BaseLoginMethod) obj, 31536000000L)));
    }

    public static final int compare$11(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        long j = ((C815070VyD) obj).LIZIZ;
        long j2 = ((C815070VyD) obj2).LIZIZ;
        if (j == j2) {
            return 0;
        }
        if (j > j2) {
            return -1;
        }
        return 1;
    }

    public static final int compare$12(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((BaseLoginMethod) obj2).getLastActiveTime(), ((BaseLoginMethod) obj).getLastActiveTime());
    }

    public static final int compare$13(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C0WMB) obj2).LIZLLL().LIZJ.ordinal()), Integer.valueOf(((C0WMB) obj).LIZLLL().LIZJ.ordinal()));
    }

    public static final int compare$14(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        long jLastModified = ((File) obj).lastModified() - ((File) obj2).lastModified();
        if (jLastModified > 0) {
            return 1;
        }
        if (jLastModified == 0) {
            return 0;
        }
        return -1;
    }

    public static final int compare$15(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return String.CASE_INSENSITIVE_ORDER.compare(obj, obj2);
    }

    public static final int compare$16(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        long j = ((C0VYK) ((Map.Entry) obj).getValue()).LJ - ((C0VYK) ((Map.Entry) obj2).getValue()).LJ;
        if (j > 0) {
            return 1;
        }
        if (j < 0) {
            return -1;
        }
        return 0;
    }

    public static final int compare$17(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        long j = ((C0VYK) ((Map.Entry) obj).getValue()).LJ - ((C0VYK) ((Map.Entry) obj2).getValue()).LJ;
        if (j > 0) {
            return 1;
        }
        if (j < 0) {
            return -1;
        }
        return 0;
    }

    public static final int compare$18(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return String.CASE_INSENSITIVE_ORDER.compare(obj, obj2);
    }

    public static final int compare$19(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return String.CASE_INSENSITIVE_ORDER.compare(obj, obj2);
    }

    public static final int compare$2(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return ((CrashSummary) obj2).compareTo(obj);
    }

    public static final int compare$20(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return (int) ((((C0V47) obj2).LIZ * 100.0d) - (((C0V47) obj).LIZ * 100.0d));
    }

    public static final int compare$21(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(C849680XUw.LIZIZ((BaseLoginMethod) obj2, 31536000000L)), Long.valueOf(C849680XUw.LIZIZ((BaseLoginMethod) obj, 31536000000L)));
    }

    public static final int compare$22(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(C849680XUw.LIZIZ((BaseLoginMethod) obj2, 31536000000L)), Long.valueOf(C849680XUw.LIZIZ((BaseLoginMethod) obj, 31536000000L)));
    }

    public static final int compare$23(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return (int) ((((C792840V8g) obj2).LIZLLL * 100.0d) - (((C792840V8g) obj).LIZLLL * 100.0d));
    }

    public static final int compare$24(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((AbstractC2213701BkW) obj2).LIZJ), Integer.valueOf(((AbstractC2213701BkW) obj).LIZJ));
    }

    public static final int compare$25(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        int i = ((C791260V2e) obj2).LJFF;
        int i2 = ((C791260V2e) obj).LJFF;
        if (i < i2) {
            return -1;
        }
        if (i == i2) {
            return 0;
        }
        return 1;
    }

    public static final int compare$26(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((EncryptedLoginMethod) obj2).lastActiveTime, ((EncryptedLoginMethod) obj).lastActiveTime);
    }

    public static final int compare$27(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((EncryptedLoginMethod) obj2).lastActiveTime, ((EncryptedLoginMethod) obj).lastActiveTime);
    }

    public static final int compare$28(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(C849680XUw.LIZIZ((BaseLoginMethod) obj2, 31536000000L)), Long.valueOf(C849680XUw.LIZIZ((BaseLoginMethod) obj, 31536000000L)));
    }

    public static final int compare$29(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C0WMB) obj2).LIZLLL().LIZJ.ordinal()), Integer.valueOf(((C0WMB) obj).LIZLLL().LIZJ.ordinal()));
    }

    public static final int compare$3(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return ((CrashSummary) obj2).compareTo(obj);
    }

    public static final int compare$30(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C0VLB) obj2).LIZJ), Long.valueOf(((C0VLB) obj).LIZJ));
    }

    public static final int compare$31(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C830610WiB) obj).LJ), Long.valueOf(((C830610WiB) obj2).LJ));
    }

    public static final int compare$32(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((PublishBehaviorModel) obj).timeStamp), Long.valueOf(((PublishBehaviorModel) obj2).timeStamp));
    }

    public static final int compare$33(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((PublishBehaviorModel) obj2).timeStamp), Long.valueOf(((PublishBehaviorModel) obj).timeStamp));
    }

    public static final int compare$34(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C830610WiB) obj2).LJ), Long.valueOf(((C830610WiB) obj).LJ));
    }

    public static final int compare$35(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        long jLastModified = ((File) obj).lastModified() - ((File) obj2).lastModified();
        if (jLastModified > 0) {
            return 1;
        }
        if (jLastModified == 0) {
            return 0;
        }
        return -1;
    }

    public static final int compare$36(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        long jLongValue;
        long time;
        long time2;
        BaseLoginMethod baseLoginMethod = (BaseLoginMethod) obj2;
        Long lastActiveTime = baseLoginMethod.getLastActiveTime();
        if (lastActiveTime != null) {
            jLongValue = lastActiveTime.longValue();
        } else {
            jLongValue = -1;
        }
        if (jLongValue > 0) {
            time = baseLoginMethod.getLastActiveTime().longValue();
        } else {
            time = baseLoginMethod.safeExpires().getTime() - 31536000000L;
        }
        Long lValueOf = Long.valueOf(time);
        BaseLoginMethod baseLoginMethod2 = (BaseLoginMethod) obj;
        Long lastActiveTime2 = baseLoginMethod2.getLastActiveTime();
        if (lastActiveTime2 != null && lastActiveTime2.longValue() > 0) {
            time2 = baseLoginMethod2.getLastActiveTime().longValue();
        } else {
            time2 = baseLoginMethod2.safeExpires().getTime() - 31536000000L;
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(time2));
    }

    public static final int compare$37(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C0WMB) obj2).LIZLLL().LIZJ.ordinal()), Integer.valueOf(((C0WMB) obj).LIZLLL().LIZJ.ordinal()));
    }

    public static final int compare$38(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        long jLIZ;
        ShowReportInfo showReportInfo = ((OutreachFlowReportItem) obj2).showReportInfo;
        long jLIZ2 = -1;
        if (showReportInfo != null) {
            jLIZ = C818420W8q.LIZ(showReportInfo);
        } else {
            jLIZ = -1;
        }
        Long lValueOf = Long.valueOf(jLIZ);
        ShowReportInfo showReportInfo2 = ((OutreachFlowReportItem) obj).showReportInfo;
        if (showReportInfo2 != null) {
            jLIZ2 = C818420W8q.LIZ(showReportInfo2);
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(jLIZ2));
    }

    public static final int compare$39(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
    }

    public static final int compare$4(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        long j = ((C0VXJ) obj).LIZ;
        long j2 = ((C0VXJ) obj2).LIZ;
        if (j > j2) {
            return -1;
        }
        if (j == j2) {
            return 0;
        }
        return 1;
    }

    public static final int compare$40(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return (int) (((C0VAG) obj2).LJIILIIL - ((C0VAG) obj).LJIILIIL);
    }

    public static final int compare$41(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C0WMB) obj2).LIZLLL().LIZJ.ordinal()), Integer.valueOf(((C0WMB) obj).LIZLLL().LIZJ.ordinal()));
    }

    public static final int compare$42(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return ((Comparable) obj).compareTo(obj2);
    }

    public static final int compare$43(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Boolean.valueOf(((OneTapLoginShareInfo) obj2).isSelected), Boolean.valueOf(((OneTapLoginShareInfo) obj).isSelected));
    }

    public static final int compare$44(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C1635170seZ) obj2).LIZJ), Long.valueOf(((C1635170seZ) obj).LIZJ));
    }

    public static final int compare$45(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C0WMB) obj2).LIZLLL().LIZJ.ordinal()), Integer.valueOf(((C0WMB) obj).LIZLLL().LIZJ.ordinal()));
    }

    public static final int compare$5(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return Long.compare(AppInfo.getLastUpdateTime((File) obj2), AppInfo.getLastUpdateTime((File) obj));
    }

    public static final int compare$6(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return ((File) obj).getName().compareTo(((File) obj2).getName());
    }

    public static final int compare$7(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        long jLastModified = ((File) obj).lastModified();
        long jLastModified2 = ((File) obj2).lastModified();
        if (jLastModified < jLastModified2) {
            return -1;
        }
        if (jLastModified == jLastModified2) {
            return 0;
        }
        return 1;
    }

    public static final int compare$8(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return ((File) obj).getName().compareTo(((File) obj2).getName());
    }

    public static final int compare$9(AComparatorS32S0000000_13 aComparatorS32S0000000_13, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Boolean.valueOf(((OneTapLoginShareInfo) obj2).isSelected), Boolean.valueOf(((OneTapLoginShareInfo) obj).isSelected));
    }
}
