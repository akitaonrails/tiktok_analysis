package X;

import java.util.Calendar;

/* JADX INFO: renamed from: X.0s0Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1610280s0Q {
    public final int LIZ;

    public AbstractC1610280s0Q() {
        this(5);
    }

    public abstract C2230608oa<Long> LIZIZ();

    public AbstractC1610280s0Q(int i) {
        this.LIZ = i;
    }

    public final boolean LIZ(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(11);
        if (i >= 0 && i < this.LIZ) {
            calendar.add(5, -1);
        }
        calendar.set(11, this.LIZ);
        calendar.set(12, 0);
        calendar.set(13, 0);
        if (LIZIZ().LIZ().longValue() >= calendar.getTimeInMillis()) {
            return false;
        }
        return true;
    }
}
