package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: renamed from: X.15nd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20627515nd extends AbstractC20628015ni implements ValueAnimator.AnimatorUpdateListener {
    public final List<C0GR3> LLJILJIL;
    public boolean LLJILJILJ;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2217391BqT c2217391BqT = new C2217391BqT(this) { // from class: X.15ne
            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217311BqL
            public final Object get() {
                return ((AbstractC20628015ni) this.receiver).getAnimator();
            }

            @Override // X.C2217391BqT, X.AbstractC2217321BqM, X.InterfaceC2217291BqJ
            public final void set(Object obj) {
                ((AbstractC20628015ni) this.receiver).setAnimator((ValueAnimator) obj);
            }
        };
        this.LLILLL.put(c2217391BqT.getName(), new AwS645S0100000_31(this, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getAnimator().removeUpdateListener(this);
        this.LLJILJILJ = false;
    }

    public final List<C0GR3> getPlaceholders() {
        return this.LLJILJIL;
    }

    public final void LIZLLL(int i) {
        while (((ArrayList) this.LLJILJIL).size() > i) {
            ((Drawable) ListProtector.remove(this.LLJILJIL, 0)).setCallback(null);
        }
        while (((ArrayList) this.LLJILJIL).size() < i) {
            List<C0GR3> list = this.LLJILJIL;
            C0GR3 c0gr3 = new C0GR3();
            c0gr3.setCallback(this);
            ((ArrayList) list).add(c0gr3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!LIZJ()) {
            super.dispatchDraw(canvas);
            return;
        }
        if (!this.LLJILJILJ) {
            this.LLJILJILJ = true;
            getAnimator().addUpdateListener(this);
            if (!getAnimator().isStarted()) {
                getAnimator().start();
            }
        }
        for (C0GR3 c0gr3 : this.LLJILJIL) {
            c0gr3.LIZ = getRadius();
            c0gr3.draw(canvas);
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (C13LP.LJJJJ(drawable, this.LLJILJIL)) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (C0GR3 c0gr3 : this.LLJILJIL) {
            c0gr3.LIZIZ.setColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            invalidate();
        }
    }

    public AbstractC20627515nd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC20627515nd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJILJIL = new ArrayList();
    }
}
