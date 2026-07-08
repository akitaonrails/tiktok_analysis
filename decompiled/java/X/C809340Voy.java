package X;

import android.content.ContentValues;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;

/* JADX INFO: renamed from: X.0Voy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C809340Voy {
    public final Context LIZ;
    public final ContentValues LIZIZ = new ContentValues();

    public final synchronized void LIZ() {
        try {
            C2204961BRm.LJJIJLIJ(this.LIZ.getContentResolver(), PushMultiProcessSharedProvider.LIZJ(this.LIZ, "key", "type"), this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKdnVOFpN6X1hLB4FBmHz6zVGF7O0xaK8jOLKpA1mLHLyL9bOH0WeCnrhIzkeiGnkhyac=", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C809340Voy(Context context) {
        this.LIZ = C786410Ut5.N3(context);
    }
}
