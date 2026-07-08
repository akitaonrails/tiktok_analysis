package X;

import android.text.format.DateFormat;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15UA, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15UA {
    public static final Keva LIZ = KevaImpl.getRepo("photo_mode_last_session_keva", 0);
    public static String LIZIZ = UUID.randomUUID().toString();

    public static final String LIZJ() {
        return String.valueOf(LIZ.getInt("explore_session_id", 1));
    }

    public static final void LIZLLL() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strLIZ = LIZ(jCurrentTimeMillis);
        Keva keva = LIZ;
        if (Intrinsics.LJFF(keva.getString("last_action_date", null), strLIZ)) {
            keva.storeLong("last_action_time", jCurrentTimeMillis);
            return;
        }
        keva.storeString("last_action_date", strLIZ);
        keva.storeInt("explore_session_id", 1);
        keva.storeLong("last_action_time", jCurrentTimeMillis);
        keva.storeInt("is_first_refresh", 1);
    }

    public static final void LJ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strLIZ = LIZ(jCurrentTimeMillis);
        Keva keva = LIZ;
        if (Intrinsics.LJFF(keva.getString("last_action_date", null), strLIZ)) {
            if (jCurrentTimeMillis - keva.getLong("last_action_time", 0L) > ((Number) C0ABQ.LIZ.getValue()).intValue() * 60 * LSPassThroughRecordSizeConfig.DEFAULT) {
                keva.storeInt("explore_session_id", keva.getInt("explore_session_id", 1) + 1);
                keva.storeLong("last_action_time", jCurrentTimeMillis);
                return;
            }
            return;
        }
        keva.storeString("last_action_date", strLIZ);
        keva.storeInt("explore_session_id", 1);
        keva.storeLong("last_action_time", jCurrentTimeMillis);
        keva.storeInt("is_first_refresh", 1);
    }

    public static String LIZ(long j) {
        if (j <= 0) {
            return "Unknown";
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(j);
        return DateFormat.format("yyyy-MM-dd", calendar).toString();
    }

    public static final String LIZIZ(String str) {
        if (LIZ.getString("request_id", "").equals(str)) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }
}
