package X;

import Y.ARunnableS122S0100000_22;
import android.text.format.DateFormat;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.wavepublish.monitor.feedback.PublisherEvent;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0n1I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418620n1I {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(307));

    public static int LIZIZ() {
        C0CHQ.LIZ().getApplicationService().getClass();
        C844470XAv.LIZ.getClass();
        return (int) C844470XAv.LIZLLL();
    }

    public static String LIZJ() {
        int rawOffset = (TimeZone.getDefault().getRawOffset() / 3600) / LSPassThroughRecordSizeConfig.DEFAULT;
        StringBuilder sb = new StringBuilder("UTC ");
        if (rawOffset >= 0) {
            sb.append("+");
            sb.append(rawOffset);
        } else {
            sb.append(rawOffset);
        }
        return sb.toString();
    }

    public static String LIZ(long j) {
        if (j <= 0) {
            return "";
        }
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(j);
        return DateFormat.format("yyyy-MM-dd hh:mm:ss a", calendar).toString();
    }

    public static void LJ(PublisherEvent publisherEvent) {
        C823050WQl.LIZLLL().execute(new ARunnableS122S0100000_22(publisherEvent, 95));
    }

    public static final void LIZLLL(int i, String str, String str2) {
        String str3 = str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str3 == null) {
            str3 = "";
        }
        LJ(new PublisherEvent("click_post", str3, str2, LIZIZ(), jCurrentTimeMillis, LIZ(jCurrentTimeMillis), LIZJ(), i));
    }
}
