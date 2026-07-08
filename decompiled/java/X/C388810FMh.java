package X;

import Y.ACListenerS109S0200000_5;
import Y.ARunnableS105S0100000_5;
import Y.ARunnableS74S0200000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import mf.a;

/* JADX INFO: renamed from: X.0FMh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C388810FMh extends FrameLayout {
    public static final /* synthetic */ int LLJI = 0;
    public final Context LL;
    public int LLILLJJLI;
    public int[] LLILLL;
    public InterfaceC388860FMm LLILZ;
    public C0FHE LLILZIL;
    public final List<C388820FMi> LLILZLL;
    public LinearLayout LLIZ;
    public C388840FMk LLIZLLLIL;
    public final HashSet<Integer> LLJ;

    public Integer getSelectedColor() {
        for (C388820FMi c388820FMi : (ArrayList) this.LLILZLL) {
            if (c388820FMi != null && c388820FMi.LLILZLL) {
                return Integer.valueOf(c388820FMi.getColor());
            }
        }
        return null;
    }

    public final void LIZ() {
        if (getVisibility() != 0 || getParent() == null) {
            return;
        }
        for (int i = 0; i < this.LLIZ.getChildCount(); i++) {
            View childAt = this.LLIZ.getChildAt(i);
            if (childAt != null && (childAt.getTag() instanceof Integer)) {
                int iIntValue = ((Integer) childAt.getTag()).intValue();
                if (!this.LLJ.contains(Integer.valueOf(iIntValue)) && Boolean.valueOf(childAt.getGlobalVisibleRect(new Rect())).booleanValue() && this.LLILZIL != null) {
                    this.LLJ.add(Integer.valueOf(iIntValue));
                    this.LLILZIL.LIZ(iIntValue);
                }
            }
        }
    }

    public final void LIZIZ(Integer num) {
        for (C388820FMi c388820FMi : (ArrayList) this.LLILZLL) {
            if (c388820FMi.LLILZLL && (num == null || c388820FMi.getColor() != num.intValue())) {
                LIZJ(c388820FMi, true);
                c388820FMi.LLILZLL = false;
                c388820FMi.setSelected(false);
            }
        }
    }

    public void setColorChangeListener(InterfaceC388860FMm interfaceC388860FMm) {
        this.LLILZ = interfaceC388860FMm;
    }

    public void setDefault(int i) {
        LIZIZ(null);
        C388820FMi c388820FMi = (C388820FMi) ListProtector.get(this.LLILZLL, 0);
        Iterator it2 = ((ArrayList) this.LLILZLL).iterator();
        while (true) {
            if (it2.hasNext()) {
                C388820FMi c388820FMi2 = (C388820FMi) it2.next();
                if (c388820FMi2 != null && c388820FMi2.getColor() == i) {
                    c388820FMi = c388820FMi2;
                    break;
                }
            } else if (c388820FMi == null) {
                return;
            }
        }
        LIZJ(c388820FMi, false);
        c388820FMi.LLILZLL = true;
        c388820FMi.setSelected(true);
        C388840FMk c388840FMk = this.LLIZLLLIL;
        c388840FMk.getClass();
        HandlerHook.viewPostDelay(c388840FMk, new ARunnableS74S0200000_5(c388840FMk, c388820FMi, 39), 100L);
        int color = c388820FMi.getColor();
        InterfaceC388860FMm interfaceC388860FMm = this.LLILZ;
        if (interfaceC388860FMm != null) {
            interfaceC388860FMm.LIZ(color);
        }
    }

    public void setOnColorShowListener(C0FHE c0fhe) {
        this.LLILZIL = c0fhe;
    }

    public void setSelectColorView(int i) {
        LIZIZ(Integer.valueOf(i));
        for (C388820FMi c388820FMi : (ArrayList) this.LLILZLL) {
            if (c388820FMi != null && c388820FMi.getColor() == i) {
                if (c388820FMi.getScaleX() != 1.1666666f || c388820FMi.getScaleY() != 1.1666666f) {
                    LIZJ(c388820FMi, false);
                }
                c388820FMi.LLILZLL = true;
                c388820FMi.setSelected(true);
                this.LLIZLLLIL.LIZ(c388820FMi);
                HandlerHook.viewPostDelay(this, new ARunnableS105S0100000_5(c388820FMi, 81), 100L);
                return;
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            HandlerHook.viewPost(this, new ARunnableS105S0100000_5(this, 83));
        } else {
            this.LLJ.clear();
        }
    }

    public C388810FMh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = 80;
        ArrayList arrayList = new ArrayList();
        this.LLILZLL = arrayList;
        this.LLJ = new HashSet<>();
        this.LL = context;
        C11VU.LIZIZ(6.0f, context);
        this.LLILLJJLI = (int) C11VU.LIZIZ(24.0f, context);
        this.LLIZ = new LinearLayout(getContext());
        this.LLIZLLLIL = new C388840FMk(getContext());
        this.LLIZLLLIL.addView(this.LLIZ, new FrameLayout.LayoutParams(-1, -1));
        this.LLIZLLLIL.setHorizontalScrollBarEnabled(false);
        addView(this.LLIZLLLIL, new FrameLayout.LayoutParams(-1, -1));
        this.LLILLL = C0F9I.LJ();
        arrayList.clear();
        for (int i = 0; i < this.LLILLL.length; i++) {
            int i2 = this.LLILLJJLI;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            C388820FMi c388820FMi = new C388820FMi(this.LL);
            int i3 = this.LLILLL[i];
            c388820FMi.LLILZIL = i3;
            c388820FMi.LL.setColor(i3);
            c388820FMi.invalidate();
            c388820FMi.setTag(Integer.valueOf(this.LLILLL[i]));
            layoutParams.setMarginEnd((int) C11VU.LIZIZ(12.0f, this.LL));
            if (i == 0) {
                layoutParams.setMarginStart((int) C11VU.LIZIZ(16.0f, this.LL));
            } else {
                layoutParams.setMarginStart((int) C11VU.LIZIZ(2.0f, this.LL));
            }
            layoutParams.gravity = 16;
            this.LLIZ.addView(c388820FMi, layoutParams);
            ((ArrayList) this.LLILZLL).add(c388820FMi);
            View.OnClickListener aCListenerS109S0200000_5 = new ACListenerS109S0200000_5(this, c388820FMi, 12);
            a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS109S0200000_5) : aCListenerS109S0200000_5);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c388820FMi);
            }
            c388820FMi.setOnClickListener(aVar);
            C1652270t69.LIZIZ(48.0f, 48.0f, c388820FMi);
        }
        this.LLIZLLLIL.setupScrollListenerWithApiCheck(new C388850FMl(this));
        HandlerHook.viewPost(this.LLIZLLLIL, new ARunnableS105S0100000_5(this, 83));
    }

    public static void LIZJ(View view, boolean z) {
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
        this.LLILLJJLI = getMeasuredHeight();
    }
}
