package X;

import Y.ALAdapterS6S0110000_17;
import android.animation.Animator;
import android.animation.AnimatorSet;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fPw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126380fPw {
    public final long LIZ = -1;
    public final AnimatorSet LIZIZ = new AnimatorSet();
    public final ArrayList<Animator> LIZJ = new ArrayList<>();
    public C09AY LIZLLL;
    public C09AY LJ;

    public final void LIZ(Function1<? super C1126390fPx, Unit> function1) {
        C1126390fPx c1126390fPx = new C1126390fPx();
        function1.invoke(c1126390fPx);
        AnimatorSet animatorSet = c1126390fPx.LIZ;
        animatorSet.setStartDelay(c1126390fPx.LJFF);
        animatorSet.setDuration(c1126390fPx.LIZLLL);
        animatorSet.setInterpolator(c1126390fPx.LJ);
        animatorSet.playTogether(c1126390fPx.LIZIZ);
        long j = this.LIZ;
        if (j >= 0) {
            animatorSet.setDuration(j);
        }
        this.LIZJ.add(animatorSet);
    }

    public final void LIZIZ(Function1<? super C1126380fPw, Unit> function1) {
        C1126380fPw c1126380fPw = new C1126380fPw();
        function1.invoke(c1126380fPw);
        AnimatorSet animatorSet = c1126380fPw.LIZIZ;
        if (animatorSet.getDuration() >= 0) {
            animatorSet.setDuration(c1126380fPw.LIZ);
        }
        if (c1126380fPw.LIZLLL != null || c1126380fPw.LJ != null) {
            animatorSet.addListener(new ALAdapterS6S0110000_17(c1126380fPw, 1));
        }
        animatorSet.playSequentially(c1126380fPw.LIZJ);
        this.LIZJ.add(animatorSet);
    }

    public final void LIZJ(Function1<? super C1126380fPw, Unit> function1) {
        C1126380fPw c1126380fPw = new C1126380fPw();
        function1.invoke(c1126380fPw);
        AnimatorSet animatorSet = c1126380fPw.LIZIZ;
        if (animatorSet.getDuration() >= 0) {
            animatorSet.setDuration(c1126380fPw.LIZ);
        }
        if (c1126380fPw.LIZLLL != null || c1126380fPw.LJ != null) {
            animatorSet.addListener(new ALAdapterS6S0110000_17(c1126380fPw, 2));
        }
        animatorSet.playTogether(c1126380fPw.LIZJ);
        this.LIZJ.add(animatorSet);
    }
}
