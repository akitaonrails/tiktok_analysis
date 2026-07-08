package X;

import Y.ALAdapterS0S0200001_24;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0rwY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607880rwY implements InterfaceC21392018ne {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ Long LIZIZ;
    public final /* synthetic */ boolean LIZJ;

    @Override // X.InterfaceC21392018ne
    public final Animator LIZ(View view, View view2) {
        return C1607890rwZ.LJFF(view, view2, this.LIZIZ, this.LIZJ);
    }

    @Override // X.InterfaceC21392018ne
    public final Animator LIZIZ(View view, View view2) {
        boolean z;
        float f;
        long integer;
        List listLIZ;
        boolean z2 = this.LIZ;
        Long l = this.LIZIZ;
        float width = view2.getWidth();
        boolean z3 = false;
        if (view2.getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = width;
        } else {
            f = -width;
        }
        if (view2.getLayoutDirection() == 1) {
            z3 = true;
        }
        if (z3) {
            width = -width;
        }
        if (l != null) {
            integer = l.longValue();
        } else {
            integer = view2.getContext().getResources().getInteger(R.integer.b0);
        }
        if (z2) {
            return C1607890rwZ.LIZLLL(view, view2, f, width, integer);
        }
        try {
            listLIZ = C1607890rwZ.LIZ(view, view2, f, width, integer);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            listLIZ = C13BV.INSTANCE;
        }
        if (!(!listLIZ.isEmpty())) {
            return C1607890rwZ.LIZLLL(view, view2, f, width, integer);
        }
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(integer);
        duration.addListener(new ALAdapterS0S0200001_24(view, view2, f, 1));
        return duration;
    }

    public C1607880rwY(Long l, boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = l;
        this.LIZJ = z2;
    }
}
