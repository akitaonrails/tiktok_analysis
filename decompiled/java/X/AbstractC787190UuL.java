package X;

import android.content.IntentFilter;
import androidx.appcompat.app.AppCompatDelegateImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0UuL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC787190UuL {
    public C854540Xfg LIZ;
    public final /* synthetic */ AppCompatDelegateImpl LIZIZ;

    public abstract IntentFilter LIZIZ();

    public abstract int LIZJ();

    public abstract void LIZLLL();

    public final void LIZ() {
        C854540Xfg c854540Xfg = this.LIZ;
        if (c854540Xfg != null) {
            try {
                C786410Ut5.LJJIFFI(this.LIZIZ.LLJIJIL, c854540Xfg);
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LIZ = null;
        }
    }

    public final void LJ() {
        LIZ();
        IntentFilter intentFilterLIZIZ = LIZIZ();
        if (intentFilterLIZIZ == null || intentFilterLIZIZ.countActions() == 0) {
            return;
        }
        if (this.LIZ == null) {
            this.LIZ = new C854540Xfg(this, 1);
        }
        C786410Ut5.LJIJJ(this.LIZIZ.LLJIJIL, this.LIZ, intentFilterLIZIZ);
    }

    public AbstractC787190UuL(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.LIZIZ = appCompatDelegateImpl;
    }
}
