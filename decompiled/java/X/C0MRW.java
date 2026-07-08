package X;

import Y.ARunnableS108S0100000_8;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.util.ShuffleAnimationController$1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MRW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MRW {
    public static final /* synthetic */ int LJIIZILJ = 0;
    public final C709150Rrl LIZ;
    public final Function0<FrameLayout> LIZIZ;
    public final View LIZJ;
    public final LifecycleOwner LIZLLL;
    public final Handler LJ;
    public ValueAnimator LJFF;
    public Animator LJI;
    public Animator LJII;
    public final MutableLiveData LJIIIIZZ;
    public FrameLayout LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public final ARunnableS108S0100000_8 LJIILJJIL;
    public final ARunnableS108S0100000_8 LJIILL;
    public final ARunnableS108S0100000_8 LJIILLIIL;

    public final void LIZ() {
        FrameLayout frameLayout;
        ValueAnimator valueAnimator = this.LJFF;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Animator animator = this.LJI;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.LJII;
        if (animator2 != null) {
            animator2.cancel();
        }
        this.LJ.removeCallbacksAndMessages(null);
        FrameLayout frameLayout2 = this.LJIIIZ;
        if (frameLayout2 == null || frameLayout2.indexOfChild(this.LIZJ) == -1 || (frameLayout = this.LJIIIZ) == null) {
            return;
        }
        C786410Ut5.LJJJZ(this.LIZJ, frameLayout);
    }

    public C0MRW(C709150Rrl c709150Rrl, AwS552S0100000_8 awS552S0100000_8, TuxTextView tuxTextView, LifecycleOwner lifecycleOwner) {
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        this.LIZ = c709150Rrl;
        this.LIZIZ = awS552S0100000_8;
        this.LIZJ = tuxTextView;
        this.LIZLLL = lifecycleOwner;
        this.LJ = bPEAHandler;
        this.LJIIIIZZ = new MutableLiveData(Boolean.FALSE);
        this.LJIILJJIL = new ARunnableS108S0100000_8(this, 61);
        this.LJIILL = new ARunnableS108S0100000_8(this, 64);
        this.LJIILLIIL = new ARunnableS108S0100000_8(this, 62);
        lifecycleOwner.getLifecycle().addObserver(new ShuffleAnimationController$1(this));
    }
}
