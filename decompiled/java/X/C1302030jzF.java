package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0jzF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1302030jzF extends C1295960jpS implements GenericLifecycleObserver {
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;

    public C1302030jzF() {
        throw null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        boolean zIsAnimating = isAnimating();
        if (this.LLILLL) {
            this.LL = zIsAnimating;
        }
        if (zIsAnimating) {
            pauseAnimation();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LLILLJJLI) {
            this.LLILLJJLI = false;
            if (this.LL && this.LLILLL) {
                resumeAnimation();
            }
        }
    }

    @Override // X.C1295960jpS, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        LifecycleOwner lifecycleOwnerLJIIJ;
        super.onAttachedToWindow();
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        if (abstractC1896090zRP != null && (lifecycleOwnerLJIIJ = abstractC1896090zRP.LJIIJ(this)) != null) {
            lifecycleOwnerLJIIJ.getLifecycle().addObserver(this);
            return;
        }
        ComponentCallbacks2 componentCallbacks2LJ = LJ(this);
        if (componentCallbacks2LJ instanceof LifecycleOwner) {
            ((LifecycleOwner) componentCallbacks2LJ).getLifecycle().addObserver(this);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ComponentCallbacks2 componentCallbacks2LJ = LJ(this);
        if (componentCallbacks2LJ instanceof LifecycleOwner) {
            ((LifecycleOwner) componentCallbacks2LJ).getLifecycle().removeObserver(this);
        }
        C20597815iq.LIZ(this);
    }

    public final Activity LJ(View view) {
        if (view == null) {
            return null;
        }
        Context context = view.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    @Override // X.C1295960jpS, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // X.C1295960jpS
    public void setComposition(C1294720jnS c1294720jnS) {
        super.setComposition(c1294720jnS);
        onVisibilityChanged(this, getVisibility());
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public C1302030jzF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        try {
            getRepeatMode();
            if (isShown()) {
                if (!this.LLILLL) {
                    this.LLILLL = true;
                    if (!this.LLILLJJLI && this.LL) {
                        resumeAnimation();
                        return;
                    }
                    return;
                }
                return;
            }
            if (!this.LLILLL) {
                return;
            }
            this.LLILLL = false;
            boolean zIsAnimating = isAnimating();
            if (!this.LLILLJJLI) {
                this.LL = zIsAnimating;
            }
            if (!zIsAnimating) {
                return;
            }
            pauseAnimation();
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
