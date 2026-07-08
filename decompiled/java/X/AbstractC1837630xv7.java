package X;

import X.AbstractC1837610xv5;
import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0xv7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1837630xv7<FETCH_DATA extends AbstractC1837610xv5> extends AbstractC1837840xvS {
    public FETCH_DATA LLILLL;

    public abstract void LJII();

    public AbstractC1837630xv7(EnumC1837330xud enumC1837330xud) {
        super(enumC1837330xud);
    }

    @Override // X.AbstractC1837840xvS
    public void LJI(C1404610meh c1404610meh) {
        C1837830xvR c1837830xvRLIZJ;
        Activity activity;
        WeakReference<Activity> weakReference;
        FETCH_DATA fetch_data = this.LLILLL;
        if (fetch_data != null && (c1837830xvRLIZJ = fetch_data.LIZJ()) != null) {
            c1837830xvRLIZJ.LIZ(this.LL, "timestamp", String.valueOf(System.currentTimeMillis() / ((long) 1000000)));
            FETCH_DATA fetch_data2 = this.LLILLL;
            if (fetch_data2 != null && (weakReference = fetch_data2.LIZ) != null) {
                activity = weakReference.get();
            } else {
                activity = null;
            }
            C0KM7 c0km7LIZ = C0W0R.LIZ(activity);
            c1837830xvRLIZJ.LIZ(this.LL, "network_type", c0km7LIZ.LIZIZ);
            c1837830xvRLIZJ.LIZ(this.LL, "network_speed", c0km7LIZ.LIZ);
        }
        LJII();
    }
}
