package X;

import com.ss.android.ugc.aweme.compliance.api.model.DailyScreenTimeMeditation;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourConfigSettings;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourSettings;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHoursAdditionalSettings;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS66S0010000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15YW, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15YW {
    public static final C15YW LIZ = new C15YW();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(327));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(221));
    public static EnumC20538815Yk LIZLLL = EnumC20538815Yk.DISMISS;
    public static String LJ = "";
    public static String LJFF = "";
    public static long LJI;
    public static boolean LJII;
    public static volatile boolean LJIIIIZZ;
    public static DailyScreenTimeMeditation LJIIIZ;

    public static int LIZ() {
        return ((Number) LIZIZ.getValue()).intValue();
    }

    public static boolean LIZIZ() {
        return ((Boolean) LIZJ.getValue()).booleanValue();
    }

    public static boolean LIZLLL() {
        PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) PluggableExtentionKt.pluggableSpi$default(PnSDigitalWellbeingSDKService.class, false, false, false, 14, null);
        if (pnSDigitalWellbeingSDKService != null) {
            return pnSDigitalWellbeingSDKService.LJIILIIL();
        }
        return false;
    }

    public static boolean LIZJ() {
        Long l;
        Long l2;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return false;
        }
        C20536115Xj.LIZ.getClass();
        SleepHourConfigSettings sleepHourConfigSettingsLIZLLL = C20536115Xj.LIZLLL();
        if (sleepHourConfigSettingsLIZLLL != null && Intrinsics.LJFF(sleepHourConfigSettingsLIZLLL.sleepHourEnabled, Boolean.TRUE)) {
            SleepHoursAdditionalSettings sleepHoursAdditionalSettingsLJ = C20536115Xj.LJ();
            long jLongValue = 0;
            long jLongValue2 = (sleepHoursAdditionalSettingsLJ == null || (l2 = sleepHoursAdditionalSettingsLJ.sleepHoursStartTimestamp) == null) ? 0L : l2.longValue();
            SleepHoursAdditionalSettings sleepHoursAdditionalSettingsLJ2 = C20536115Xj.LJ();
            if (sleepHoursAdditionalSettingsLJ2 != null && (l = sleepHoursAdditionalSettingsLJ2.sleepHoursEndTimestamp) != null) {
                jLongValue = l.longValue();
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            if (jLongValue2 <= jCurrentTimeMillis && jCurrentTimeMillis <= jLongValue) {
                return true;
            }
        }
        return false;
    }

    public static void LJI() {
        if (C294510BgX.LIZ()) {
            return;
        }
        if (!LIZJ()) {
            C15YX.LIZ.getClass();
            C15YX.LJFF(null);
            C15YX.LJI(0L);
        }
        if (!LJIIIIZZ()) {
            if (LIZLLL == EnumC20538815Yk.MEDITATION_VIDEO) {
                if (LIZLLL() || LJII) {
                    LJII = false;
                    C1440005kM.LIZ(new C1571830r0P(EnumC20538815Yk.DISMISS, "dismiss_by_manager"));
                    return;
                }
                return;
            }
            return;
        }
        if (!LIZLLL() || LJII) {
            EnumC20538815Yk enumC20538815Yk = LIZLLL;
            EnumC20538815Yk enumC20538815Yk2 = EnumC20538815Yk.MEDITATION_VIDEO;
            if (enumC20538815Yk == enumC20538815Yk2 || System.currentTimeMillis() - LJI < 20000) {
                return;
            }
            LJI = System.currentTimeMillis();
            LJII = false;
            if (enumC20538815Yk2 != LIZLLL) {
                C20536115Xj.LIZ.getClass();
                SleepHourConfigSettings sleepHourConfigSettingsLIZLLL = C20536115Xj.LIZLLL();
                Integer num = sleepHourConfigSettingsLIZLLL != null ? sleepHourConfigSettingsLIZLLL.sleepTimeStartHour : null;
                SleepHourConfigSettings sleepHourConfigSettingsLIZLLL2 = C20536115Xj.LIZLLL();
                LJ = LJIIIZ(num, sleepHourConfigSettingsLIZLLL2 != null ? sleepHourConfigSettingsLIZLLL2.sleepTimeStartMinute : null);
                SleepHourConfigSettings sleepHourConfigSettingsLIZLLL3 = C20536115Xj.LIZLLL();
                Integer num2 = sleepHourConfigSettingsLIZLLL3 != null ? sleepHourConfigSettingsLIZLLL3.sleepTimeEndHour : null;
                SleepHourConfigSettings sleepHourConfigSettingsLIZLLL4 = C20536115Xj.LIZLLL();
                LJFF = LJIIIZ(num2, sleepHourConfigSettingsLIZLLL4 != null ? sleepHourConfigSettingsLIZLLL4.sleepTimeEndMinute : null);
                C1440005kM.LIZ(new C1571830r0P(enumC20538815Yk2, "try_show_sleep_hour"));
            }
        }
    }

    public static boolean LJIIIIZZ() {
        if (C294510BgX.LIZ()) {
            boolean z = LJIIIIZZ && !C288680BTe.LIZ();
            new AwS66S0010000_31(z, 1);
            return z;
        }
        C15YX.LIZ.getClass();
        SleepHourSettings sleepHourSettingsLIZJ = C15YX.LIZJ();
        if (sleepHourSettingsLIZJ == null) {
            return false;
        }
        if (LIZ() != EnumC1781490wSZ.MEDITATION_RESHOW.getI() && LIZ() != EnumC1781490wSZ.MEDITATION_NO_RESHOW.getI() && LIZ() != EnumC1781490wSZ.EXPAND_ENTRANCE.getI() && LIZ() != EnumC1781490wSZ.EXPAND_ENTRANCE_NO_RESHOW.getI()) {
            return false;
        }
        if (LIZ() != EnumC1781490wSZ.MEDITATION_NO_RESHOW.getI() || sleepHourSettingsLIZJ.isFirstShownPrompt) {
            return (LIZ() != EnumC1781490wSZ.EXPAND_ENTRANCE_NO_RESHOW.getI() || sleepHourSettingsLIZJ.isFirstShownPrompt) && LIZJ() && C15YX.LIZLLL() >= sleepHourSettingsLIZJ.allowedUsageTimeInSecond;
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LJ(String str) {
        String value;
        if (!LIZLLL()) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("business", "pns_popup_exit");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        switch (lowerCase.hashCode()) {
            case -1376148670:
                if (lowerCase.equals("homepage_explore")) {
                    lowerCase = "explore";
                }
                break;
            case -1049482625:
                if (lowerCase.equals("nearby")) {
                    lowerCase = "local";
                }
                break;
            case 3599307:
                if (lowerCase.equals("user")) {
                    lowerCase = "profile";
                }
                break;
            case 595233003:
                if (lowerCase.equals("notification")) {
                    lowerCase = "inbox";
                }
                break;
            case 1406100971:
                if (lowerCase.equals("friends_tab")) {
                    lowerCase = "friends";
                }
                break;
        }
        c2344009Gk.LJIIIIZZ("exit_method", lowerCase);
        EnumC20538815Yk enumC20538815Yk = LIZLLL;
        int i = C20538715Yj.LIZ[enumC20538815Yk.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    value = enumC20538815Yk.getValue();
                } else {
                    value = "feed_lynx_overlay";
                }
            } else {
                value = "daily_screentime_limit_v2";
            }
        } else {
            value = "sleep_hour_reminder";
        }
        c2344009Gk.LJIIIIZZ("feature", value);
        C20684815ws.LJIILLIIL("pns_content_click", c2344009Gk.LIZ);
    }

    public static void LJFF(long j) {
        int iIntValue;
        Integer num;
        Integer num2;
        C20536115Xj c20536115Xj = C20536115Xj.LIZ;
        Long lValueOf = Long.valueOf(j);
        Long lValueOf2 = Long.valueOf(j + 28800);
        c20536115Xj.getClass();
        SleepHoursAdditionalSettings sleepHoursAdditionalSettingsLJ = C20536115Xj.LJ();
        int iIntValue2 = 0;
        if (sleepHoursAdditionalSettingsLJ != null && (num2 = sleepHoursAdditionalSettingsLJ.abGroup) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        SleepHoursAdditionalSettings sleepHoursAdditionalSettingsLJ2 = C20536115Xj.LJ();
        if (sleepHoursAdditionalSettingsLJ2 != null && (num = sleepHoursAdditionalSettingsLJ2.cumulativeUseLimit) != null) {
            iIntValue2 = num.intValue();
        }
        Integer numValueOf2 = Integer.valueOf(iIntValue2);
        Long.valueOf(0L);
        C20536115Xj.LJIIL(new SleepHoursAdditionalSettings(lValueOf, lValueOf2, numValueOf, numValueOf2, ""));
        LJII(0L);
    }

    public static void LJII(long j) {
        int value;
        boolean z;
        SleepHourSettings sleepHourSettingsLIZ;
        if (j < 0) {
            return;
        }
        C15YX.LIZ.getClass();
        SleepHourSettings sleepHourSettingsLIZJ = C15YX.LIZJ();
        if (sleepHourSettingsLIZJ == null) {
            return;
        }
        if (j == 900) {
            value = EnumC1779300wP2.FIFTEEN_MINS.getValue();
        } else {
            value = EnumC1779300wP2.ONE_HOUR.getValue();
        }
        long jLIZLLL = C15YX.LIZLLL() + (j / 1);
        if (j == 3600 && sleepHourSettingsLIZJ.isFirstShownPrompt) {
            z = false;
        } else {
            z = sleepHourSettingsLIZJ.isFirstShownPrompt;
        }
        SleepHourSettings sleepHourSettingsLIZJ2 = C15YX.LIZJ();
        if (sleepHourSettingsLIZJ2 != null) {
            sleepHourSettingsLIZ = SleepHourSettings.LIZ(sleepHourSettingsLIZJ2, z, jLIZLLL, 0, value, 4);
        } else {
            sleepHourSettingsLIZ = null;
        }
        C15YX.LJFF(sleepHourSettingsLIZ);
        LJII = true;
        LJI();
    }

    public static String LJIIIZ(Integer num, Integer num2) {
        int iIntValue;
        int iIntValue2 = 0;
        if (num != null) {
            iIntValue = num.intValue() * 60;
        } else {
            iIntValue = 0;
        }
        int i = iIntValue * 60;
        if (num2 != null) {
            iIntValue2 = num2.intValue() * 60;
        }
        int i2 = (i + iIntValue2) * LSPassThroughRecordSizeConfig.DEFAULT;
        return C2215101Bmm.LIZ((new Date(i2).getTimezoneOffset() * C538540LAe.LLJJJIL) + i2, "lt");
    }

    public static void LJIIJ(Function0 function0, Function0 function02) {
        SleepHourConfigSettings sleepHourConfigSettings;
        C20536115Xj.LIZ.getClass();
        SleepHourConfigSettings sleepHourConfigSettingsLIZLLL = C20536115Xj.LIZLLL();
        if (sleepHourConfigSettingsLIZLLL == null || (sleepHourConfigSettings = sleepHourConfigSettingsLIZLLL.copy(sleepHourConfigSettingsLIZLLL.sleepTimeStartHour, sleepHourConfigSettingsLIZLLL.sleepTimeStartMinute, sleepHourConfigSettingsLIZLLL.sleepTimeEndHour, sleepHourConfigSettingsLIZLLL.sleepTimeEndMinute, sleepHourConfigSettingsLIZLLL.sleepHourEnabled, sleepHourConfigSettingsLIZLLL.sleepTimeABTest, sleepHourConfigSettingsLIZLLL.sleepTimeOriginalValue, sleepHourConfigSettingsLIZLLL.sleepTimeType, sleepHourConfigSettingsLIZLLL.skipSleepHours)) == null) {
            sleepHourConfigSettings = new SleepHourConfigSettings(0, 0, 0, 0, Boolean.FALSE, Boolean.FALSE, "", 0, Boolean.FALSE);
        }
        sleepHourConfigSettings.setSkipSleepHours(Boolean.TRUE);
        C247300xT c247300xT = C247300xT.LIZ;
        AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(function0, (Function0<Unit>) 273);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(function02, (Function0<Unit>) 1302);
        c247300xT.getClass();
        C247300xT.LIZ(sleepHourConfigSettings, awS610S0100000_31, awS575S0100000_31);
    }
}
