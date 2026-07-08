package X;

import android.content.ContentValues;
import android.content.Context;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WFV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WFV {
    public final Context LIZ;
    public final ContentValues LIZIZ = new ContentValues();

    public final synchronized void LIZ() {
        try {
            C2204961BRm.LJJIJLIJ(this.LIZ.getContentResolver(), WsChannelMultiProcessSharedProvider.LIZ(this.LIZ, "key", "type"), this.LIZIZ, new C0WZX("dzBzEgAjS8/YVFkiQFyHacu2SzYe/bvZip/6gIBD6s5VEfn+T9fnirLcQeLPotovHeCvPS8w4YkKDjFSRJNgbuuT", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final synchronized void LIZIZ() {
        LIZ();
    }

    public C0WFV(Context context) {
        this.LIZ = C786410Ut5.N3(context);
    }
}
