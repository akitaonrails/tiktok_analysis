package Y;

import X.C1C7U;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public class ARunnableS0S0204000_1 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public int i4;
    public int i5;
    public Object l0;
    public Object l1;

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
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
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
        rect.top -= this.i2;
        rect.bottom += this.i3;
        rect.left -= this.i4;
        rect.right += this.i5;
        ((View) this.l1).setTouchDelegate(new TouchDelegate(rect, (View) this.l0));
    }

    public final void LIZ$1() {
        Rect rect = new Rect();
        ((View) this.l0).setEnabled(true);
        ((View) this.l0).getHitRect(rect);
        rect.top -= this.i2;
        rect.bottom += this.i3;
        rect.left -= this.i4;
        rect.right += this.i5;
        ((View) this.l1).setTouchDelegate(new TouchDelegate(rect, (View) this.l0));
    }

    public final void LIZ$2() {
        Rect rect = new Rect();
        ((View) this.l0).getHitRect(rect);
        rect.top -= this.i2;
        rect.bottom += this.i3;
        rect.left -= this.i4;
        rect.right += this.i5;
        ((View) this.l1).setTouchDelegate(new TouchDelegate(rect, (View) this.l0));
    }

    public final void LIZ$3() {
        Rect rect = new Rect();
        ((View) this.l0).getHitRect(rect);
        rect.top -= this.i2;
        rect.bottom += this.i3;
        rect.left -= this.i4;
        rect.right += this.i5;
        ((View) this.l1).setTouchDelegate(new TouchDelegate(rect, (View) this.l0));
    }

    public final void LIZ$4() {
        Rect rect = new Rect();
        ((View) this.l0).setEnabled(true);
        ((View) this.l0).getHitRect(rect);
        rect.top -= this.i2;
        rect.bottom += this.i3;
        rect.left -= this.i4;
        rect.right += this.i5;
        ((View) this.l1).setTouchDelegate(new TouchDelegate(rect, (View) this.l0));
    }

    public static final void run$0(ARunnableS0S0204000_1 aRunnableS0S0204000_1) {
        boolean zLIZ;
        C1C7U.LIZ("CommentHelperKt@bf7f.expandViewTouchArea$1$1");
        try {
            aRunnableS0S0204000_1.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommentHelperKt@bf7f.expandViewTouchArea$1$1");
    }

    public static final void run$1(ARunnableS0S0204000_1 aRunnableS0S0204000_1) {
        boolean zLIZ;
        C1C7U.LIZ("CommonExtKt@fdcd.expandViewTouchArea$1$1");
        try {
            aRunnableS0S0204000_1.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommonExtKt@fdcd.expandViewTouchArea$1$1");
    }

    public static final void run$2(ARunnableS0S0204000_1 aRunnableS0S0204000_1) {
        boolean zLIZ;
        C1C7U.LIZ("EditProfileExtensionsKt@e771.expandViewTouchArea$1$1");
        try {
            aRunnableS0S0204000_1.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditProfileExtensionsKt@e771.expandViewTouchArea$1$1");
    }

    public static final void run$3(ARunnableS0S0204000_1 aRunnableS0S0204000_1) {
        boolean zLIZ;
        C1C7U.LIZ("TouchDelegateExtKt@bd02.expandViewTouchArea$2$1");
        try {
            aRunnableS0S0204000_1.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TouchDelegateExtKt@bd02.expandViewTouchArea$2$1");
    }

    public static final void run$4(ARunnableS0S0204000_1 aRunnableS0S0204000_1) {
        boolean zLIZ;
        C1C7U.LIZ("ViewKTXKt@ddfb.expandViewTouchArea$1$1");
        try {
            aRunnableS0S0204000_1.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ViewKTXKt@ddfb.expandViewTouchArea$1$1");
    }

    public ARunnableS0S0204000_1(int i, int i2, View view, View view2, int i3) {
        this.$t = i3;
        this.l0 = view;
        this.i2 = i;
        this.i3 = i2;
        this.i4 = 0;
        this.i5 = 0;
        this.l1 = view2;
    }

    public ARunnableS0S0204000_1(int i, int i2, int i3, int i4, View view, View view2, int i5) {
        this.$t = i5;
        this.l0 = view;
        this.i2 = i;
        this.i3 = i2;
        this.i4 = i3;
        this.i5 = i4;
        this.l1 = view2;
    }
}
