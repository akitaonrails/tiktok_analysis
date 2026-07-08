package X;

import Y.ACListenerS109S0200000_5;
import Y.ARunnableS74S0200000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import mf.a;
import u4.q0;

/* JADX INFO: renamed from: X.0FRI, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FRI extends FrameLayout {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final Context LL;
    public final int LLILLJJLI;
    public C0FRK LLILLL;
    public final List<C0FRJ> LLILZ;
    public LinearLayout LLILZIL;
    public C0FJ1 LLILZLL;
    public final HashMap<Integer, String> LLIZ;

    public void setColorPickerColor(Integer num) {
    }

    public final void LIZIZ() {
        for (C0FRJ c0frj : (ArrayList) this.LLILZ) {
            if (c0frj.LLILZIL) {
                LIZLLL(c0frj, true);
                c0frj.LLILZIL = false;
            }
        }
    }

    public static int[] getColorArray() {
        return C0F9I.LJ();
    }

    public final void LIZ(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        for (int i2 : C0F9I.LJ()) {
            arrayList.add(Integer.valueOf(i2));
        }
        LIZJ(arrayList);
        invalidate();
    }

    public final void LIZJ(List<Integer> list) {
        ((ArrayList) this.LLILZ).clear();
        C786410Ut5.LJJJJJL(this.LLILZIL);
        for (int i = 0; i < list.size(); i++) {
            int i2 = this.LLILLJJLI;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            C0FRJ c0frj = new C0FRJ(this.LL, null);
            int iIntValue = ((Integer) ListProtector.get(list, i)).intValue();
            c0frj.LLILZ = iIntValue;
            c0frj.LL.setColor(iIntValue);
            c0frj.invalidate();
            c0frj.setTag(Integer.valueOf(iIntValue));
            layoutParams.setMarginEnd((int) C11VU.LIZIZ(12.0f, this.LL));
            if (i == 0) {
                layoutParams.setMarginStart((int) C11VU.LIZIZ(16.0f, this.LL));
            } else {
                layoutParams.setMarginStart((int) C11VU.LIZIZ(2.0f, this.LL));
            }
            layoutParams.gravity = 16;
            this.LLILZIL.addView(c0frj, layoutParams);
            ((ArrayList) this.LLILZ).add(c0frj);
            View.OnClickListener aCListenerS109S0200000_5 = new ACListenerS109S0200000_5(this, c0frj, 1);
            if (C1848410yCV.LIZ) {
                aCListenerS109S0200000_5 = new f(aCListenerS109S0200000_5);
            }
            a aVar = new a(aCListenerS109S0200000_5);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c0frj);
            }
            c0frj.setOnClickListener(aVar);
            q0.LJIJ(c0frj, new C0FXM(0));
            c0frj.setContentDescription(this.LLIZ.get(Integer.valueOf(iIntValue)));
        }
    }

    public void setColorChangeListener(C0FRK c0frk) {
        this.LLILLL = c0frk;
    }

    public void setColorPickerClickListener(View.OnClickListener onClickListener) {
        C786410Ut5.O7(null, onClickListener);
    }

    public void setDefault(int i) {
        LIZIZ();
        C0FRJ c0frj = (C0FRJ) ListProtector.get(this.LLILZ, 0);
        Iterator it2 = ((ArrayList) this.LLILZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                C0FRJ c0frj2 = (C0FRJ) it2.next();
                if (c0frj2 != null && c0frj2.getColor() == i) {
                    c0frj = c0frj2;
                    break;
                }
            } else if (c0frj == null) {
                return;
            }
        }
        LIZLLL(c0frj, false);
        c0frj.LLILZIL = true;
        C0FJ1 c0fj1 = this.LLILZLL;
        c0fj1.getClass();
        HandlerHook.viewPostDelay(c0fj1, new ARunnableS74S0200000_5(c0fj1, c0frj, 6), 100L);
        int color = c0frj.getColor();
        C0FRK c0frk = this.LLILLL;
        if (c0frk != null) {
            c0frk.LIZ(color);
        }
    }

    public void setSelectColorView(int i) {
        LIZIZ();
        for (C0FRJ c0frj : (ArrayList) this.LLILZ) {
            if (c0frj != null && c0frj.getColor() == i) {
                LIZLLL(c0frj, false);
                c0frj.LLILZIL = true;
                this.LLILZLL.LIZ(c0frj);
                return;
            }
        }
    }

    public C0FRI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = 80;
        this.LLILZ = new ArrayList();
        HashMap<Integer, String> map = new HashMap<>();
        this.LLIZ = map;
        this.LL = context;
        C11VU.LIZIZ(6.0f, context);
        this.LLILLJJLI = (int) C11VU.LIZIZ(24.0f, context);
        map.put(-1, context.getResources().getString(2131823286));
        map.put(-16777216, context.getResources().getString(2131823269));
        map.put(-1425344, context.getString(2131823283));
        map.put(-27843, context.getString(2131823282));
        map.put(-864954, context.getString(2131823287));
        map.put(-8863138, context.getString(2131823277));
        map.put(-8861530, context.getString(2131823285));
        map.put(-16732005, context.getString(2131823285));
        map.put(-16734003, context.getString(2131823284));
        map.put(-13265168, context.getString(2131823270));
        map.put(-14400333, context.getString(2131823272));
        map.put(-11053355, context.getString(2131823278));
        map.put(-6723855, context.getString(2131823281));
        map.put(-3592449, context.getString(2131823275));
        map.put(-469015, context.getString(2131823280));
        map.put(-2988141, context.getString(2131823280));
        map.put(-12505560, context.getString(2131823262));
        map.put(-5090498, context.getString(2131823258));
        map.put(-5994149, context.getString(2131823279));
        map.put(-13479364, context.getString(2131823274));
        map.put(-13670003, context.getString(2131823271));
        map.put(-14600875, context.getString(2131823260));
        map.put(-7033857, context.getString(2131823263));
        map.put(-4935681, context.getString(2131823288));
        map.put(-343041, context.getString(2131823257));
        map.put(-466473, context.getString(2131823264));
        map.put(-2138, context.getString(2131823259));
        map.put(-7170146, context.getString(2131823276));
        map.put(-13421773, context.getString(2131823273));
        context.getString(2131824462);
        C786410Ut5.Sd(R.layout.c4s, C786410Ut5.ne(getContext()), this);
        C0FJ1 c0fj1 = (C0FJ1) findViewById(R.id.u3e);
        this.LLILZLL = c0fj1;
        c0fj1.setHorizontalScrollBarEnabled(false);
        this.LLILZIL = (LinearLayout) findViewById(R.id.e88);
        ArrayList arrayList = new ArrayList();
        for (int i : C0F9I.LJ()) {
            arrayList.add(Integer.valueOf(i));
        }
        LIZJ(arrayList);
    }

    public static void LIZLLL(View view, boolean z) {
        float f;
        float f2;
        float f3;
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = new float[2];
        float f4 = 1.1666666f;
        if (z) {
            f = 1.1666666f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 1.1666666f;
        }
        fArr[1] = f2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", fArr);
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 1.1666666f;
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
    }
}
