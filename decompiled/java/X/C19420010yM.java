package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10yM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19420010yM implements InterfaceC1215010hit {
    public final ViewGroup LIZ;
    public final View LIZIZ;
    public final TextView LIZJ;

    public C19420010yM(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
        if (C19420110yN.LIZ()) {
            this.LIZIZ = viewGroup.findViewById(R.id.vz7);
        } else {
            this.LIZIZ = viewGroup.findViewById(R.id.vz_);
        }
        this.LIZJ = (TextView) viewGroup.findViewById(R.id.vze);
    }

    @Override // X.InterfaceC1215010hit
    public final void LIZ(Function0<Unit> function0) {
        View view = this.LIZIZ;
        if (view != null) {
            view.clearAnimation();
            C786410Ut5.Ob(view, 1.0f);
            C786410Ut5.pc(view, 1.0f);
            function0.invoke();
        }
    }

    @Override // X.InterfaceC1215010hit
    public final void LIZIZ(Function0<Unit> function0) {
        TextView textView = this.LIZJ;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 0);
        }
        View view = this.LIZIZ;
        if (view != null && view.getAnimation() == null) {
            view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), R.anim.bw));
            view.getAnimation().setInterpolator(C1619980sG4.LJI());
            function0.invoke();
        }
    }
}
