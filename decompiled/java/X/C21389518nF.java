package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.18nF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21389518nF implements InterfaceC21392018ne {
    public final /* synthetic */ boolean LIZ;

    public C21389518nF(boolean z) {
        this.LIZ = z;
    }

    @Override // X.InterfaceC21392018ne
    public final Animator LIZ(View view, View view2) {
        List listLIZIZ;
        if (this.LIZ) {
            return C21389618nG.LJ(view);
        }
        try {
            listLIZIZ = C21389618nG.LIZIZ(view);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            listLIZIZ = C13BV.INSTANCE;
        }
        if (!(!listLIZIZ.isEmpty())) {
            return C21389618nG.LJ(view);
        }
        return ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(Math.max(C294650Bgl.LIZ(), C289430BWb.LIZ()));
    }

    @Override // X.InterfaceC21392018ne
    public final Animator LIZIZ(View view, View view2) {
        return C21389618nG.LJI(view2, this.LIZ);
    }
}
