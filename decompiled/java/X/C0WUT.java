package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.jvm.internal.AwS449S0200000_13;

/* JADX INFO: renamed from: X.0WUT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WUT {
    public final Context LIZ;
    public final boolean LIZIZ;
    public final C833030Wm5 LIZJ;
    public C0W4T LIZLLL;
    public AwS449S0200000_13 LJ;

    public C0WUT(Context context) {
        int iB4;
        this.LIZ = context;
        try {
            iB4 = C786410Ut5.b4(GoogleApiAvailability.getInstance(), context);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            iB4 = 1;
        }
        this.LIZIZ = C0VEG.LIZ(this.LIZ) && iB4 == 0;
        this.LIZJ = new C833030Wm5(context);
    }
}
