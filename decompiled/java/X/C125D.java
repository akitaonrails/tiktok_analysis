package X;

import Y.ARunnableS98S0200000_29;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.125D, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C125D extends FrameLayout {
    public static final int[] LLIZLLLIL = {-1, -16777216, -1425344, -27843, -864954, -8863138, -8861530, -13265168, -14400333, -11053355, -469015, -5994149, -13479364, -13670003, -7170146, -13421773};
    public final Context LL;
    public final int LLILLJJLI;
    public int LLILLL;
    public C125K LLILZ;
    public final List<C19667311x9> LLILZIL;
    public LinearLayout LLILZLL;
    public C125O LLIZ;

    public final void LIZ() {
        for (C19667311x9 c19667311x9 : (ArrayList) this.LLILZIL) {
            if (c19667311x9.LLILZIL) {
                LIZIZ(c19667311x9, true);
                c19667311x9.LLILZIL = false;
            }
        }
    }

    public void setColorChangeListener(C125K c125k) {
        this.LLILZ = c125k;
    }

    public void setDefault(int i) {
        LIZ();
        C19667311x9 c19667311x9 = (C19667311x9) ListProtector.get(this.LLILZIL, 0);
        Iterator it2 = ((ArrayList) this.LLILZIL).iterator();
        while (true) {
            if (it2.hasNext()) {
                C19667311x9 c19667311x92 = (C19667311x9) it2.next();
                if (c19667311x92 != null && c19667311x92.getColor() == i) {
                    c19667311x9 = c19667311x92;
                    break;
                }
            } else if (c19667311x9 == null) {
                return;
            }
        }
        LIZIZ(c19667311x9, false);
        c19667311x9.LLILZIL = true;
        C125O c125o = this.LLIZ;
        c125o.getClass();
        HandlerHook.viewPostDelay(c125o, new ARunnableS98S0200000_29(c125o, c19667311x9, 9), 100L);
        int color = c19667311x9.getColor();
        C125K c125k = this.LLILZ;
        if (c125k != null) {
            C125C c125c = ((C125H) c125k).LIZ;
            c125c.LLILLL.LJIIIIZZ(c125c.LLILZIL, color);
            c125c.LLIZLLLIL = color;
        }
    }

    public void setSelectColorView(int i) {
        LIZ();
        for (C19667311x9 c19667311x9 : (ArrayList) this.LLILZIL) {
            if (c19667311x9 != null && c19667311x9.getColor() == i) {
                LIZIZ(c19667311x9, false);
                c19667311x9.LLILZIL = true;
                this.LLIZ.LIZ(c19667311x9);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C125D(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C125D.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void LIZIZ(View view, boolean z) {
        float f;
        float f2;
        float f3;
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = new float[2];
        float f4 = 1.2f;
        if (z) {
            f = 1.2f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 1.2f;
        }
        fArr[1] = f2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", fArr);
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 1.2f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (z) {
            f4 = 1.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", fArr2);
        animatorSet.setDuration(200L);
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2);
        animatorSet.start();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILLL = getMeasuredHeight();
    }
}
