package X;

import Y.AUListenerS278S0100000_31;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import avg.f;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.15pY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class ViewOnClickListenerC20639415pY extends CardView implements View.OnClickListener {
    public final ImageView LLIZLLLIL;
    public final TuxTextView LLJ;
    public boolean LLJI;
    public InterfaceC20639515pZ LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public final Drawable LLJJ;
    public final Drawable LLJJI;
    public boolean LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public final C20632215oO LLJJIJIL;
    public ValueAnimator LLJJJ;

    public final void LJIIIIZZ() {
        if (this.LLJJJ == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
            valueAnimatorOfFloat.setDuration(150L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS278S0100000_31(this, 16));
            this.LLJJJ = valueAnimatorOfFloat;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLJI = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJI = false;
    }

    public final InterfaceC20639515pZ getOnModeChangeListener() {
        return this.LLJIJIL;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.LLJJIII) {
            LJIIIIZZ();
            if (!this.LLJJJ.isRunning()) {
                this.LLJJJ.start();
                return;
            }
            return;
        }
        LJIIIIZZ();
        if (this.LLJJJ.isRunning()) {
            return;
        }
        this.LLJJJ.start();
    }

    public final void setOnModeChangeListener(InterfaceC20639515pZ interfaceC20639515pZ) {
        this.LLJIJIL = interfaceC20639515pZ;
    }

    public ViewOnClickListenerC20639415pY(Context context, AttributeSet attributeSet) {
        View.OnClickListener fVar;
        super(context, attributeSet, 0);
        ImageView imageView = new ImageView(context);
        this.LLIZLLLIL = imageView;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        this.LLJ = tuxTextView;
        this.LLJJIJIL = new C20632215oO();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MultiSelectView, 0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.MultiSelectView_content_height, 0);
        this.LLJILLL = dimensionPixelOffset;
        this.LLJILJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.MultiSelectView_multi_select_color, 0);
        this.LLJILJILJ = typedArrayObtainStyledAttributes.getColor(R$styleable.MultiSelectView_multi_unselect_color, 0);
        this.LLJJ = typedArrayObtainStyledAttributes.getDrawable(R$styleable.MultiSelectView_multi_select_src);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.MultiSelectView_multi_unselect_src);
        this.LLJJI = drawable;
        typedArrayObtainStyledAttributes.recycle();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelOffset, dimensionPixelOffset);
        ImageView imageView2 = this.LLIZLLLIL;
        C786410Ut5.c6(imageView2, layoutParams);
        imageView2.setImageDrawable(drawable);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        TuxTextView tuxTextView2 = this.LLJ;
        tuxTextView2.setGravity(17);
        tuxTextView2.setTuxFont(53);
        tuxTextView2.setMaxLines(1);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.setMarginStart(dimensionPixelOffset);
        C786410Ut5.R6(tuxTextView2, layoutParams2);
        tuxTextView2.setText(tuxTextView2.getResources().getString(2131837608));
        if (C1388580mEq.LIZIZ(context)) {
            tuxTextView2.setPadding(dimensionPixelOffset / 2, 0, 0, 0);
        } else {
            tuxTextView2.setPadding(0, 0, dimensionPixelOffset / 2, 0);
        }
        tuxTextView2.setTextColor(C960203pA.LIZ(R.attr.a1h, tuxTextView2.getContext()));
        ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams3);
        addView(imageView);
        addView(tuxTextView);
        if (C1848410yCV.LIZ) {
            fVar = new f(this);
        } else {
            fVar = this;
        }
        View.OnClickListener aVar = new a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        setClipChildren(false);
        C786410Ut5.x3(getViewTreeObserver(), new C16HN(this, 1));
    }
}
