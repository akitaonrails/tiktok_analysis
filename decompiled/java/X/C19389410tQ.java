package X;

import Y.ARunnableS129S0100000_29;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: renamed from: X.10tQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19389410tQ {
    public final ViewGroup LIZ;
    public View LIZJ;
    public C16F5 LIZLLL;
    public final int LIZIZ = R.id.mvk;
    public final ARunnableS129S0100000_29 LJ = new ARunnableS129S0100000_29(this, 151);

    public final void LIZ() {
        View view = this.LIZJ;
        if (view == null) {
            return;
        }
        try {
            C786410Ut5.LJJJLZIJ(view, this.LIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LIZJ = null;
        this.LIZLLL = null;
    }

    public C19389410tQ(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }
}
