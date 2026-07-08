package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.dataChannel.ServerTimeGapChangeEvent;
import com.bytedance.android.livesdkapi.host.IHostPerformanceOpt;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0bAe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963140bAe {
    public static final SimpleDateFormat LIZ;
    public static final SimpleDateFormat LIZIZ;
    public static final SimpleDateFormat LIZJ;
    public static volatile long LIZLLL;
    public static volatile long LJ;

    static {
        new SimpleDateFormat("yyyy-MM-dd");
        LIZ = new SimpleDateFormat("MM/dd/yyyy");
        LIZIZ = new SimpleDateFormat("HH:mm:dd.SSS");
        LIZJ = new SimpleDateFormat("MM-dd HH:mm");
        LIZLLL = 0L;
        LJ = 0L;
    }

    public static long LIZJ() {
        return LJ <= 0 ? LIZIZ() : SystemClock.elapsedRealtime() + LJ;
    }

    public static long LIZIZ() {
        return System.currentTimeMillis() + LIZLLL;
    }

    public static String LJFF(long j) {
        return LIZIZ.format(new Date(j));
    }

    public static String LJI(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(new Date(j));
    }

    public static String LJII(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("KK:mma");
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(new Date(j));
    }

    public static int LJIIIIZZ(int i) {
        boolean z;
        if (i <= 0) {
            return 1;
        }
        if (i % 60 > 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = i / 60;
        if (z) {
            return i2 + 1;
        }
        return i2;
    }

    public static String LJIIIZ(int i) {
        StringBuilder sb = new StringBuilder();
        if (i <= 0) {
            return "";
        }
        long j = i / 3600;
        long j2 = ((long) i) - (3600 * j);
        long j3 = j2 / 60;
        long j4 = j2 - (60 * j3);
        if (j < 10) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(j);
        sb.append(":");
        if (j3 < 10) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(j3);
        sb.append(":");
        if (j4 < 10) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(j4);
        return sb.toString();
    }

    public static String LJIIJ(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j / 60;
        long j3 = j - (60 * j2);
        if (j2 < 10) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(j2);
        sb.append(":");
        if (j3 < 10) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(j3);
        return sb.toString();
    }

    public static String LJIIJJI(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j / 60;
        long j3 = j - (60 * j2);
        if (j2 < 10) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(j2);
        sb.append(":");
        if (j3 < 10) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(j3);
        return sb.toString();
    }

    public static String LJIIL(long j) {
        StringBuilder sb = new StringBuilder();
        if (j <= 0) {
            return "";
        }
        long j2 = j / 3600;
        long j3 = j - (3600 * j2);
        long j4 = j3 / 60;
        long j5 = j3 - (60 * j4);
        if (j2 > 0) {
            if (j2 < 10) {
                sb.append(CardStruct.IStatusCode.DEFAULT);
            }
            sb.append(j2);
            sb.append(":");
        }
        if (j4 < 10) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(j4);
        sb.append(":");
        if (j5 < 10) {
            sb.append(CardStruct.IStatusCode.DEFAULT);
        }
        sb.append(j5);
        return sb.toString();
    }

    public static String LIZ(Long l, String str) {
        if (TextUtils.isEmpty(str)) {
            str = "yyyy-MM-dd HH:mm:ss";
        }
        return new SimpleDateFormat(str).format(new Date(l.longValue() * 1000));
    }

    public static boolean LIZLLL(long j, long j2) {
        if (((int) (j / 86400000)) == ((int) (j2 / 86400000))) {
            return true;
        }
        return false;
    }

    public static boolean LJ(long j, long j2) {
        return LIZLLL(j + ((long) Calendar.getInstance().get(15)), j2 + ((long) Calendar.getInstance().get(15)));
    }

    public static void LJIILIIL(long j, long j2, long j3, long j4, String str) {
        long j5 = j + j4;
        if (j5 > 0) {
            LIZLLL = j5 - j3;
            LJ = j5 - j2;
            DataChannelGlobal.LLILZ.FQ2(ServerTimeGapChangeEvent.class, Long.valueOf(LIZLLL));
            HashMap map = new HashMap();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LIZLLL);
            sbLIZ.append("");
            map.put("gap_current", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(LJ);
            sbLIZ2.append("");
            map.put("gap_elapse", C2188811AlT.LIZIZ(sbLIZ2));
            map.put("path", str);
            map.put("source", "http");
            if (!((IHostPerformanceOpt) C1161920gLG.LIZJ(IHostPerformanceOpt.class)).fN2()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("livesdk_ntp_");
                sbLIZ3.append("server_time");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                map.put("event_name", strLIZIZ);
                C1CC2.LJIILJJIL(0, 1, strLIZIZ, map);
                C1143300frE.LJIIJJI().LJII("ttlive_ntp", map);
            }
        }
    }
}
