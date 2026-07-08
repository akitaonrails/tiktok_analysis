package X;

import Y.ARunnableS129S0100000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/* JADX INFO: renamed from: X.11wu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19665811wu extends FrameLayout {
    public int LL;
    public int LLILLJJLI;
    public FrameLayout.LayoutParams LLILLL;
    public Drawable[] LLILZ;
    public final Random LLILZIL;
    public Queue<ImageView> LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public final BPEAHandler LLJIJIL;
    public final ARunnableS129S0100000_29 LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;
    public float LLJJJ;
    public PointF LLJJJIL;
    public PointF LLJJJJ;
    public PointF LLJJJJJIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJIJIL.removeCallbacksAndMessages(null);
    }

    public final void LIZ(View view) {
        C19663711wZ c19663711wZ;
        if (view.getTag() == null) {
            return;
        }
        this.LLILZLL.add(view);
        ValueAnimator valueAnimator = (ValueAnimator) view.getTag();
        if (valueAnimator != null) {
            valueAnimator.setTarget(null);
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        if ((view.getTag(R.id.y6d) instanceof C19663711wZ) && (c19663711wZ = (C19663711wZ) view.getTag(R.id.y6d)) != null) {
            c19663711wZ.LL = null;
        }
        C786410Ut5.T4(view, 0.0f);
        C786410Ut5.Ob(view, 0.3f);
        C786410Ut5.pc(view, 0.3f);
        C786410Ut5.Ab(view, 0.0f);
        view.setTag(null);
    }

    public C19665811wu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = new Random();
        this.LLJIJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJILJIL = new ARunnableS129S0100000_29(this, 97);
        this.LLJILLL = 0;
        this.LLJJIJIL = -1.0f;
        this.LLJJJ = -1.0f;
        this.LLILZLL = new LinkedList();
        this.LLILZ = new Drawable[2];
        Drawable drawable = getResources().getDrawable(R.drawable.cee);
        Drawable drawable2 = getResources().getDrawable(R.drawable.cef);
        Drawable[] drawableArr = this.LLILZ;
        drawableArr[0] = drawable;
        drawableArr[1] = drawable2;
        this.LLIZ = drawable.getIntrinsicHeight();
        this.LLIZLLLIL = drawable.getIntrinsicWidth();
        this.LLILLL = new FrameLayout.LayoutParams(this.LLIZLLLIL, this.LLIZ);
        this.LLJJ = C12ES.LIZJ(51.0f, getContext());
        this.LLJJI = C12ES.LIZJ(48.0f, getContext());
        this.LLJJIII = C12ES.LIZJ(20.0f, getContext());
        this.LLJJIJI = C12ES.LIZJ(8.0f, getContext());
        this.LLJJIJIIJIL = C12ES.LIZJ(2.0f, getContext());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILLJJLI = getMeasuredWidth();
        this.LL = getMeasuredHeight();
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        this.LLJILJILJ = z;
        this.LLJJIJIL = -1.0f;
    }
}
