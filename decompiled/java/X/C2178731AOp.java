package X;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1AOp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2178731AOp {
    public final C1519760peQ<C1APF> LIZ = new C1519760peQ<>();
    public final C2178721AOo LIZIZ;
    public final Context LIZJ;
    public boolean LIZLLL;

    public C2178731AOp(Context context) {
        Context contextN3 = C786410Ut5.N3(context);
        this.LIZJ = contextN3;
        try {
            this.LIZIZ = new C2178721AOo(this, contextN3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Logger.throwException(e);
        }
    }
}
