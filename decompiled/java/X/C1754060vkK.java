package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0vkK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1754060vkK extends FrameLayout {
    public final float LL;
    public final float LLILLJJLI;
    public boolean LLILLL;
    public final ValueAnimator LLILZ;
    public RectF LLILZIL;
    public final int LLILZLL;
    public int LLIZ;
    public final ImageView LLIZLLLIL;
    public final TuxTextView LLJ;
    public final SmartImageView LLJI;
    public final View LLJIJIL;
    public ViewGroup LLJILJIL;
    public View LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;

    public final boolean LIZIZ() {
        View view;
        ViewGroup viewGroup = this.LLJILJIL;
        if (viewGroup == null || (view = this.LLJILJILJ) == null || !viewGroup.isLaidOut() || viewGroup.getWidth() == 0 || viewGroup.getHeight() == 0 || !view.isLaidOut() || view.getWidth() == 0 || view.getHeight() == 0) {
            return false;
        }
        measure(0, 0);
        RectF rectFLIZ = C1753610vjb.LIZ(viewGroup);
        RectF rectFLIZ2 = C1753610vjb.LIZ(view);
        rectFLIZ2.offset(-rectFLIZ.left, -rectFLIZ.top);
        float f = rectFLIZ2.right + this.LLJILLL;
        float f2 = rectFLIZ2.bottom + this.LLJJ;
        if (C426750GoL.LIZLLL(getContext())) {
            this.LLIZ = 8388611;
        }
        int i = this.LLIZ;
        if (i == 8388611) {
            float f3 = rectFLIZ2.left - this.LLJILLL;
            this.LLILZIL = new RectF(Math.max(f3, 0.0f), Math.max(f2, 0.0f), Math.min(f3 + getMeasuredWidth(), this.LL), Math.min(f2 + getMeasuredHeight(), this.LLILLJJLI));
            float f4 = C426750GoL.LIZLLL(getContext()) ? -(this.LL - this.LLILZIL.right) : this.LL - this.LLILZIL.right;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setX(f4);
        } else if (i == 8388613) {
            this.LLILZIL = new RectF(Math.max(f - getMeasuredWidth(), 0.0f), Math.max(f2, 0.0f), Math.min(f, this.LL), Math.min(f2 + getMeasuredHeight(), this.LLILLJJLI));
            float f5 = C426750GoL.LIZLLL(getContext()) ? -(this.LL - this.LLILZIL.left) : this.LLILZIL.left;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setX(f5);
        }
        if (C426750GoL.LIZLLL(getContext())) {
            float f6 = 2;
            C786410Ut5.Hd(this.LLIZLLLIL, Math.min(-((((this.LLILZIL.right - (this.LLIZLLLIL.getMeasuredWidth() / 2)) - ((rectFLIZ2.right + rectFLIZ2.left) / f6)) - this.LLILZLL) + f6), -30.0f));
        } else {
            float f7 = 2;
            C786410Ut5.Hd(this.LLIZLLLIL, Math.max((((((rectFLIZ2.right + rectFLIZ2.left) / f7) - this.LLILZIL.left) - (this.LLIZLLLIL.getMeasuredWidth() / 2)) - this.LLILZLL) + f7, 30.0f));
        }
        float f8 = this.LLILZIL.top;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setY(f8);
        return true;
    }

    public final View getAnchor() {
        return this.LLJILJILJ;
    }

    public final View getContent() {
        return this.LLJIJIL;
    }

    public final SmartImageView getIcon() {
        return this.LLJI;
    }

    public final float getOffX() {
        return this.LLJILLL;
    }

    public final float getOffY() {
        return this.LLJJ;
    }

    public final ViewGroup getParentView() {
        return this.LLJILJIL;
    }

    public final TuxTextView getText() {
        return this.LLJ;
    }

    public final ImageView getTriangle() {
        return this.LLIZLLLIL;
    }

    public C1754060vkK(Context context) {
        super(context, null, R.attr.z6);
        this.LL = C497820Jfg.LIZIZ(context);
        this.LLILLJJLI = C497820Jfg.LIZ(context);
        this.LLILZ = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLILZIL = new RectF();
        int iLIZIZ = C0H9H.LIZIZ(4);
        this.LLILZLL = iLIZIZ;
        this.LLIZ = 8388613;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.akj, this, true);
        C426750GoL.LJIIL(this, Integer.valueOf(iLIZIZ), 0, Integer.valueOf(iLIZIZ), 0, 16);
        this.LLIZLLLIL = (ImageView) findViewById(R.id.ykv);
        this.LLJ = (TuxTextView) findViewById(R.id.text);
        this.LLJIJIL = findViewById(R.id.eu1);
        this.LLJI = (SmartImageView) findViewById(R.id.jxe);
    }

    public final void setAnchor(View view) {
        this.LLJILJILJ = view;
    }

    public final void setOffX(float f) {
        this.LLJILLL = f;
    }

    public final void setOffY(float f) {
        this.LLJJ = f;
    }

    public final void setParentView(ViewGroup viewGroup) {
        this.LLJILJIL = viewGroup;
    }

    public final void LIZ(final TextView textView, final String str, final String str2, final long j) {
        String strLJJIFFI = null;
        if (j > 0) {
            long j2 = 3600;
            long j3 = j / j2;
            long j4 = j % j2;
            long j5 = 60;
            String strJ4 = C786410Ut5.j4("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4 / j5), Long.valueOf(j % j5)}, 3));
            if (str != null) {
                strLJJIFFI = u.LJJIFFI(str, str2, strJ4, false);
            }
            C0H1U.LJIIJJI(textView, strLJJIFFI, textView.getContext().getString(2131834891));
            HandlerHook.viewPostDelay(textView, new Runnable() { // from class: X.0he2
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CartBenefitBubbleView@d13f.setCountDownText$1");
                    try {
                        this.LL.LIZ(textView, str, str2, j - 1);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CartBenefitBubbleView@d13f.setCountDownText$1");
                }
            }, 1000L);
            return;
        }
        C12ES.LJIILL(4, this);
        this.LLILLL = false;
        this.LLILZ.cancel();
        ViewGroup viewGroup = this.LLJILJIL;
        if (viewGroup != null) {
            C786410Ut5.LJJJLZIJ(this, viewGroup);
        }
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
    }
}
