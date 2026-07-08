package X;

import android.view.View;
import android.view.animation.AnimationUtils;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10yG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19419410yG implements InterfaceC1215010hit {
    public final View LIZ;

    public C19419410yG(View view) {
        this.LIZ = view;
    }

    @Override // X.InterfaceC1215010hit
    public final void LIZ(Function0<Unit> function0) {
        View view = this.LIZ;
        view.clearAnimation();
        C786410Ut5.Ob(view, 1.0f);
        C786410Ut5.pc(view, 1.0f);
    }

    @Override // X.InterfaceC1215010hit
    public final void LIZIZ(Function0<Unit> function0) {
        View view = this.LIZ;
        if (view.getAnimation() == null) {
            view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.bw));
            view.getAnimation().setInterpolator(C1619980sG4.LJI());
            function0.invoke();
        }
    }
}
