package X;

import com.bytedance.keva.Keva;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599920rji {
    public static final C1599920rji LIZ = new C1599920rji();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(460));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(463));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(462));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(461));

    public static long LIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        long j = ((Keva) LIZJ.getValue()).getLong(curUserId, 0L);
        if (LIZJ(Long.valueOf(((Keva) LIZLLL.getValue()).getLong(curUserId, 0L)))) {
            return j;
        }
        return 0L;
    }

    public static boolean LIZIZ() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        C01GW c01gw = LJ;
        if (((Map) c01gw.getValue()).get(curUserId) != null) {
            return LIZJ((Long) ((Map) c01gw.getValue()).get(curUserId));
        }
        C01GW c01gw2 = LIZIZ;
        long j = ((Keva) c01gw2.getValue()).getLong(curUserId, 0L);
        ((Map) c01gw.getValue()).put(curUserId, Long.valueOf(j));
        if (j == 0) {
            return false;
        }
        if (LIZJ(Long.valueOf(j))) {
            return true;
        }
        ((Keva) c01gw2.getValue()).erase(curUserId);
        return false;
    }

    public static void LIZLLL() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        long days = TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis());
        ((Map) LJ.getValue()).put(curUserId, Long.valueOf(days));
        ((Keva) LIZIZ.getValue()).storeLong(curUserId, days);
    }

    public static boolean LIZJ(Long l) {
        if (l != null) {
            l.longValue();
            if (l.longValue() == TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis())) {
                return true;
            }
            return false;
        }
        return false;
    }
}
