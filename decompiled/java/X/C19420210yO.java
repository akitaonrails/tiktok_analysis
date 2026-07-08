package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10yO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19420210yO implements InterfaceC1215010hit {
    public final Context LIZ;
    public final ViewGroup LIZIZ;
    public final View LIZJ;

    @Override // X.InterfaceC1215010hit
    public final void LIZ(Function0<Unit> function0) {
        this.LIZJ.clearAnimation();
        C786410Ut5.LJLLLLLL(8, this.LIZJ);
    }

    @Override // X.InterfaceC1215010hit
    public final void LIZIZ(Function0<Unit> function0) {
        if (this.LIZJ.getAnimation() != null) {
            this.LIZJ.clearAnimation();
        }
        if (!C19420110yN.LIZ() && C19420110yN.LIZIZ() && !C19420110yN.LIZJ()) {
            C786410Ut5.LJLLLLLL(0, this.LIZJ);
        } else {
            C786410Ut5.LJLLLLLL(8, this.LIZJ);
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.LIZ, R.anim.bu);
        animationLoadAnimation.setInterpolator(C1619980sG4.LJI());
        animationLoadAnimation.setAnimationListener(new C12Y9(function0, 3));
        this.LIZJ.startAnimation(animationLoadAnimation);
    }

    public C19420210yO(Context context, ViewGroup viewGroup) {
        this.LIZ = context;
        this.LIZIZ = viewGroup;
        this.LIZJ = viewGroup.findViewById(R.id.vzd);
    }
}
