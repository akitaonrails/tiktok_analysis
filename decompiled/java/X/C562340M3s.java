package X;

import com.ss.android.ugc.aweme.experiment.StoryAILiveInboxFreqency;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0M3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562340M3s {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(416));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(415));
    public static boolean LIZJ;

    public static StoryAILiveInboxFreqency.AILiveInboxConfig LIZIZ() {
        return (StoryAILiveInboxFreqency.AILiveInboxConfig) LIZ.getValue();
    }

    public static boolean LIZ(Date date, float f) {
        Calendar.getInstance().setTime(date);
        if (r1.get(11) + (r1.get(12) / 60.0f) >= f) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(Date date, Date date2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            return true;
        }
        return false;
    }
}
