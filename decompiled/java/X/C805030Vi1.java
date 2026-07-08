package X;

import java.util.Calendar;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0Vi1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C805030Vi1 {
    public static final C805030Vi1 LIZ = new C805030Vi1();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(131));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(130));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(132));

    public static InterfaceC805040Vi2 LIZ() {
        return (InterfaceC805040Vi2) LIZIZ.getValue();
    }

    public static Pair LIZIZ(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(6, -i);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(6, 1);
        calendar.add(14, -1);
        return new Pair(Long.valueOf(timeInMillis), Long.valueOf(calendar.getTimeInMillis()));
    }
}
