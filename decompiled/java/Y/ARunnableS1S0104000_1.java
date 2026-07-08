package Y;

import X.C1C7U;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class ARunnableS1S0104000_1 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
    public int i3;
    public int i4;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Rect rect = new Rect();
        ((View) this.l0).setEnabled(true);
        ((View) this.l0).getHitRect(rect);
        rect.top -= this.i1;
        rect.bottom += this.i2;
        rect.left -= this.i3;
        rect.right += this.i4;
        TouchDelegate touchDelegate = new TouchDelegate(rect, (View) this.l0);
        if (((View) this.l0).getParent() instanceof View) {
            ((View) ((View) this.l0).getParent()).setTouchDelegate(touchDelegate);
        }
    }

    public final void LIZ$1() {
        View view;
        if (((View) this.l0).getParent() != null) {
            Object parent = ((View) this.l0).getParent();
            if (!(parent instanceof View) || (view = (View) parent) == null) {
                return;
            }
            view.setEnabled(true);
            Rect rect = new Rect();
            ((View) this.l0).getHitRect(rect);
            rect.left -= this.i1;
            rect.top -= this.i2;
            rect.right += this.i3;
            rect.bottom += this.i4;
            view.setTouchDelegate(new TouchDelegate(rect, (View) this.l0));
        }
    }

    public final void LIZ$2() {
        View view = (View) this.l0;
        if (view == null || view.getParent() == null) {
            return;
        }
        Rect rect = new Rect();
        ((View) this.l0).setEnabled(true);
        ((View) this.l0).getHitRect(rect);
        rect.top -= this.i1;
        rect.bottom += this.i2;
        rect.left -= this.i3;
        rect.right += this.i4;
        TouchDelegate touchDelegate = new TouchDelegate(rect, (View) this.l0);
        if (View.class.isInstance(((View) this.l0).getParent())) {
            ((View) ((View) this.l0).getParent()).setTouchDelegate(touchDelegate);
        }
    }

    public static final void run$0(ARunnableS1S0104000_1 aRunnableS1S0104000_1) {
        boolean zLIZ;
        C1C7U.LIZ("MusViewUtils@a8ea.expandViewTouchDelegate$1");
        try {
            aRunnableS1S0104000_1.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusViewUtils@a8ea.expandViewTouchDelegate$1");
    }

    public static final void run$1(ARunnableS1S0104000_1 aRunnableS1S0104000_1) {
        boolean zLIZ;
        C1C7U.LIZ("ViewHelperKt@3033.expendTouchArea$1");
        try {
            aRunnableS1S0104000_1.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ViewHelperKt@3033.expendTouchArea$1");
    }

    public static final void run$2(ARunnableS1S0104000_1 aRunnableS1S0104000_1) {
        boolean zLIZ;
        C1C7U.LIZ("SplashAdUtils@766d.expandViewTouchDelegate$1");
        try {
            aRunnableS1S0104000_1.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SplashAdUtils@766d.expandViewTouchDelegate$1");
    }

    public ARunnableS1S0104000_1(View view, int i, int i2, int i3, int i4, int i5) {
        this.$t = i5;
        this.l0 = view;
        this.i1 = i;
        this.i2 = i2;
        this.i3 = i3;
        this.i4 = i4;
    }
}
