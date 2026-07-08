package X;

import android.content.ContentValues;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.util.MultiProcessSharedProvider;

/* JADX INFO: renamed from: X.0VJ4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0VJ4 {
    public final Context LIZ;
    public final ContentValues LIZIZ = new ContentValues();

    public final synchronized void LIZ() {
        try {
            C2204961BRm.LJJIJLIJ(this.LIZ.getContentResolver(), MultiProcessSharedProvider.LIZ(this.LIZ, "key", "type"), this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKZTmhVITkWSj6weDpGnLojDMJYhdVY+954Vr01H9mVzyMBBGSOWw=", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C0VJ4(Context context) {
        this.LIZ = C786410Ut5.N3(context);
    }
}
