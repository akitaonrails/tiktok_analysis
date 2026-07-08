package X;

import com.bytedance.keva.Keva;
import java.util.Calendar;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NnG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C604440NnG {
    public static final C604440NnG LIZ = new C604440NnG();
    public static final Keva LIZIZ = Keva.getRepo("click_on_this_day");

    public static boolean LIZIZ() {
        Keva keva = LIZIZ;
        return (Intrinsics.LJFF(LIZ(keva.getLong("click_on_this_day_inbox_entrance_time", -1L)), LIZ(System.currentTimeMillis())) ^ true) || (Intrinsics.LJFF(keva.getString("click_on_this_day_inbox_entrance_user_id", ""), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) ^ true);
    }

    public static Pair LIZ(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return new Pair(Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)));
    }
}
