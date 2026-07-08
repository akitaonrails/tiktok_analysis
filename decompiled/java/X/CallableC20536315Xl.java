package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.compliance.api.model.DigitalWellbeingBean;
import com.ss.android.ugc.aweme.compliance.api.model.DigitalWellbeingMissionStatus;
import com.ss.android.ugc.aweme.compliance.api.model.DoNotDisturbSettings;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourConfigSettings;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHoursAdditionalSettings;
import com.ss.android.ugc.aweme.compliance.api.model.SleepStreakStatus;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.15Xl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class CallableC20536315Xl<V> implements Callable {
    public static final CallableC20536315Xl<V> LL = new CallableC20536315Xl<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("DigitalWellbeingManager@1b01.updateDigitalWellbeingData$1");
        C15Y7 c15y7 = C15Y7.LL;
        C20536115Xj.LIZ.getClass();
        SleepHourConfigSettings sleepHourConfigSettingsLIZLLL = C20536115Xj.LIZLLL();
        DoNotDisturbSettings doNotDisturbSettingsLJFF = C20536115Xj.LJFF();
        DoNotDisturbSettings doNotDisturbSettingsLIZ = C20536115Xj.LIZ();
        int i = C20536115Xj.LIZIZ.getInt(C20536115Xj.LJI("screen_time_management_repeat_type"), 0);
        List listLIZJ = C20536115Xj.LIZJ();
        DigitalWellbeingBean digitalWellbeingBean = new DigitalWellbeingBean(0, 0, 0, 0, 0, 0, 0, 0, Boolean.FALSE, sleepHourConfigSettingsLIZLLL, doNotDisturbSettingsLIZ, doNotDisturbSettingsLJFF, Integer.valueOf(i), listLIZJ, new SleepHoursAdditionalSettings(0L, 0L, 0, 0, ""), Boolean.FALSE, Boolean.FALSE, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), Boolean.FALSE, Boolean.FALSE, new DigitalWellbeingMissionStatus(new SleepStreakStatus(0, Boolean.FALSE, Boolean.FALSE), Boolean.FALSE));
        c15y7.getClass();
        C15Y7.LLILZIL = digitalWellbeingBean;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DigitalWellbeingManager@1b01.updateDigitalWellbeingData$1");
        return unit;
    }
}
