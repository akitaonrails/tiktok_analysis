package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vjY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1753580vjY extends FrameLayout {
    public final float LL;
    public final float LLILLJJLI;
    public boolean LLILLL;
    public final ValueAnimator LLILZ;
    public RectF LLILZIL;
    public int LLILZLL;
    public final ImageView LLIZ;
    public final TuxTextView LLIZLLLIL;
    public final SmartImageView LLJ;
    public final View LLJI;
    public ViewGroup LLJIJIL;
    public View LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;

    public final boolean LIZ() {
        View view;
        ViewGroup viewGroup = this.LLJIJIL;
        if (viewGroup == null || (view = this.LLJILJIL) == null || !viewGroup.isLaidOut() || viewGroup.getWidth() == 0 || viewGroup.getHeight() == 0 || !view.isLaidOut() || view.getWidth() == 0 || view.getHeight() == 0) {
            return false;
        }
        measure(0, 0);
        RectF rectFLIZ = C1753610vjb.LIZ(viewGroup);
        RectF rectFLIZ2 = C1753610vjb.LIZ(view);
        rectFLIZ2.offset(-rectFLIZ.left, -rectFLIZ.top);
        float f = rectFLIZ2.right + this.LLJILJILJ;
        float f2 = rectFLIZ2.bottom + this.LLJILLL;
        if (C426750GoL.LIZLLL(getContext())) {
            this.LLILZLL = 8388611;
        }
        int i = this.LLILZLL;
        if (i == 8388611) {
            float f3 = rectFLIZ2.left - this.LLJILJILJ;
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
            C786410Ut5.Hd(this.LLIZ, Math.min(-(((this.LLILZIL.right - (this.LLIZ.getMeasuredWidth() / 2)) - ((rectFLIZ2.right + rectFLIZ2.left) / f6)) + f6), -30.0f));
        } else {
            float f7 = 2;
            C786410Ut5.Hd(this.LLIZ, Math.max(((((rectFLIZ2.right + rectFLIZ2.left) / f7) - this.LLILZIL.left) - (this.LLIZ.getMeasuredWidth() / 2)) + f7, 30.0f));
        }
        float f8 = this.LLILZIL.top;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setY(f8);
        return true;
    }

    public final View getAnchor() {
        return this.LLJILJIL;
    }

    public final View getContent() {
        return this.LLJI;
    }

    public final SmartImageView getIcon() {
        return this.LLJ;
    }

    public final float getOffX() {
        return this.LLJILJILJ;
    }

    public final float getOffY() {
        return this.LLJILLL;
    }

    public final ViewGroup getParentView() {
        return this.LLJIJIL;
    }

    public final TuxTextView getText() {
        return this.LLIZLLLIL;
    }

    public final ImageView getTriangle() {
        return this.LLIZ;
    }

    public C1753580vjY(Context context) {
        super(context, null, R.attr.z6);
        this.LL = C497820Jfg.LIZIZ(context);
        this.LLILLJJLI = C497820Jfg.LIZ(context);
        this.LLILZ = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLILZIL = new RectF();
        this.LLILZLL = 8388613;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.avd, this, true);
        this.LLIZ = (ImageView) findViewById(R.id.ykv);
        this.LLIZLLLIL = (TuxTextView) findViewById(R.id.text);
        this.LLJI = findViewById(R.id.eu1);
        this.LLJ = (SmartImageView) findViewById(R.id.jxe);
    }

    public final void setAnchor(View view) {
        this.LLJILJIL = view;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setBubbleData(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitItem r7) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1753580vjY.setBubbleData(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitItem):void");
    }

    public final void setOffX(float f) {
        this.LLJILJILJ = f;
    }

    public final void setOffY(float f) {
        this.LLJILLL = f;
    }

    public final void setParentView(ViewGroup viewGroup) {
        this.LLJIJIL = viewGroup;
    }
}
