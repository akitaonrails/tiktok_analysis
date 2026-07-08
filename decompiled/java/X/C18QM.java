package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18QM, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C18QM extends AnimationSet implements Runnable {
    public final ViewGroup LL;
    public final View LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.LLILLL || !this.LLILZIL) {
                this.LL.endViewTransition(this.LLILLJJLI);
                this.LLILZ = true;
            } else {
                this.LLILZIL = false;
                this.LL.post(this);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.LLILZIL = true;
        if (this.LLILLL) {
            return !this.LLILZ;
        }
        if (!super.getTransformation(j, transformation)) {
            this.LLILLL = true;
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(this.LL, this);
        }
        return true;
    }

    public C18QM(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.LLILZIL = true;
        this.LL = viewGroup;
        this.LLILLJJLI = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.LLILZIL = true;
        if (this.LLILLL) {
            return !this.LLILZ;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.LLILLL = true;
            ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(this.LL, this);
        }
        return true;
    }
}
