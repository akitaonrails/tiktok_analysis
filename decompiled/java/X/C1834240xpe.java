package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: X.0xpe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1834240xpe {
    public static final String LIZJ(int i) {
        switch (i) {
            case 1:
                return "moderator";
            case 2:
                return "guest";
            case 3:
                return "friend";
            case 4:
                return "viewer_gift";
            case 5:
                return "bb_follower";
            case 6:
                return "campaign_clipper";
            default:
                return "anchor";
        }
    }

    public static final String LIZ(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        long j2 = j * 1000;
        Date date = new Date(j2);
        if (j2 > timeInMillis) {
            return C497740JfY.LJIJJ(2131851077, new SimpleDateFormat("HH:mm", Locale.ENGLISH).format(date));
        }
        return new SimpleDateFormat("d/M/yyyy HH:mm", Locale.ENGLISH).format(date);
    }

    public static final boolean LIZLLL(Integer num) {
        if (num != null && num.intValue() == 19) {
            return true;
        }
        return false;
    }

    public static final Uri.Builder LIZIZ(String str, String str2) {
        return UriProtector.parse((String) C1338270kvh.LIZ(str2, str)).buildUpon();
    }
}
