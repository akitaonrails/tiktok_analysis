package Y;

import X.C1C7U;
import X.C435270H4z;
import android.animation.ObjectAnimator;
import android.graphics.Point;
import android.view.View;
import android.view.animation.OvershootInterpolator;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS0S0211000_6 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS0S0211000_6.LIZ$0():void");
    }

    public final void LIZ$1() {
        C435270H4z c435270H4z = (C435270H4z) this.l0;
        if (c435270H4z.LLJILLL == null) {
            return;
        }
        c435270H4z.getClass();
        C435270H4z c435270H4z2 = (C435270H4z) this.l0;
        int i = this.i3;
        View view = (View) this.l1;
        c435270H4z2.getClass();
        Point point = new Point(0, 0);
        if (i == 3) {
            point.x = (int) (view.getX() + view.getMeasuredWidth());
            point.y = (int) (view.getY() + c435270H4z2.LLILLJJLI.getBubbleOffset());
        } else if (i == 5) {
            point.x = (int) view.getX();
            point.y = (int) (view.getY() + c435270H4z2.LLILLJJLI.getBubbleOffset());
        } else if (i == 48) {
            point.x = (int) (view.getX() + c435270H4z2.LLILLJJLI.getBubbleOffset());
            point.y = (int) (view.getY() + view.getMeasuredHeight());
        } else if (i == 80) {
            point.x = (int) (view.getX() + c435270H4z2.LLILLJJLI.getBubbleOffset());
            point.y = (int) view.getY();
        }
        view.setPivotY(point.y);
        view.setPivotX(point.x);
        View view2 = (View) this.l1;
        float[] fArr = new float[2];
        boolean z = this.z2;
        fArr[0] = z ? 0.0f : 1.0f;
        fArr[1] = z ? 1.0f : 0.0f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, "scaleX", fArr);
        View view3 = (View) this.l1;
        float[] fArr2 = new float[2];
        boolean z2 = this.z2;
        fArr2[0] = z2 ? 0.0f : 1.0f;
        fArr2[1] = z2 ? 1.0f : 0.0f;
        ((C435270H4z) this.l0).LLJILLL.play(objectAnimatorOfFloat).with(ObjectAnimator.ofFloat(view3, "scaleY", fArr2));
        C435270H4z c435270H4z3 = (C435270H4z) this.l0;
        c435270H4z3.LLJILLL.setDuration(this.z2 ? c435270H4z3.LLJJI : c435270H4z3.LLJJIII);
        C435270H4z c435270H4z4 = (C435270H4z) this.l0;
        if (c435270H4z4.LLJIJIL) {
            c435270H4z4.LLJILLL.setInterpolator(new OvershootInterpolator(1.0f));
        }
        ((C435270H4z) this.l0).LLJILLL.addListener(new ALAdapterS1S0210000_6((C435270H4z) this.l0, (View) this.l1, this.z2, 4));
        ((C435270H4z) this.l0).LLJILLL.start();
    }

    public static final void run$0(ARunnableS0S0211000_6 aRunnableS0S0211000_6) {
        boolean zLIZ;
        C1C7U.LIZ("BubblePopupWindow@763e.animatorEasyInOut$1");
        try {
            aRunnableS0S0211000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BubblePopupWindow@763e.animatorEasyInOut$1");
    }

    public static final void run$1(ARunnableS0S0211000_6 aRunnableS0S0211000_6) {
        boolean zLIZ;
        C1C7U.LIZ("BubblePopupWindow@5b8e.animatorEasyInOut$1");
        try {
            aRunnableS0S0211000_6.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BubblePopupWindow@5b8e.animatorEasyInOut$1");
    }

    public ARunnableS0S0211000_6(Object obj, int i, Object obj2, boolean z, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i3 = i;
        this.l1 = obj2;
        this.z2 = z;
    }
}
