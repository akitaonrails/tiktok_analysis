package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import avg.f;
import com.ss.android.ugc.aweme.app.R$styleable;
import mf.a;

/* JADX INFO: renamed from: X.19Un, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class ViewOnClickListenerC21547919Un extends AppCompatTextView implements InterfaceC21549619Ve, View.OnClickListener, InterfaceC21550219Vk {
    public C21548219Uq LLIZLLLIL;
    public CharSequence LLJ;
    public Drawable LLJI;
    public InterfaceC21548019Uo LLJIJIL;
    public C19VL LLJILJIL;
    public AbstractC21548119Up LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final int LLJJI;
    public int LLJJIII;
    public final int LLJJIJI;

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public final void LJJJJ() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.LLJ);
        if (this.LLJI != null && ((this.LLIZLLLIL.LJJI & 4) != 4 || (!this.LLJILLL && !this.LLJJ))) {
            z = false;
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.LLJ : null);
        CharSequence charSequence = this.LLIZLLLIL.LJIILLIIL;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.LLIZLLLIL.LJ);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.LLIZLLLIL.LJIIZILJ;
        if (TextUtils.isEmpty(charSequence2)) {
            C1697050uGN.LIZ(this, z3 ? null : this.LLIZLLLIL.LJ);
        } else {
            C1697050uGN.LIZ(this, charSequence2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // X.InterfaceC21550219Vk
    public final boolean LIZIZ() {
        return LJJJI() && this.LLIZLLLIL.getIcon() == null;
    }

    @Override // X.InterfaceC21550219Vk
    public final boolean LJIILJJIL() {
        return LJJJI();
    }

    public final boolean LJJJI() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean LJJJIL() {
        Configuration configuration = getContext().getResources().getConfiguration();
        return configuration.screenWidthDp >= 480 || configuration.orientation == 2;
    }

    @Override // X.InterfaceC21549619Ve
    public C21548219Uq getItemData() {
        return this.LLIZLLLIL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.19VL] */
    @Override // X.InterfaceC21549619Ve
    public final void LJIIJJI(C21548219Uq c21548219Uq) {
        int i;
        this.LLIZLLLIL = c21548219Uq;
        setIcon(c21548219Uq.getIcon());
        setTitle(c21548219Uq.getTitleCondensed());
        setId(c21548219Uq.LIZ);
        if (c21548219Uq.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        int visibility = getVisibility();
        setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, this);
        setEnabled(c21548219Uq.isEnabled());
        if (c21548219Uq.hasSubMenu() && this.LLJILJIL == null) {
            this.LLJILJIL = new AbstractViewOnTouchListenerC21551119Vt() { // from class: X.19VL
                @Override // X.AbstractViewOnTouchListenerC21551119Vt
                public final InterfaceC21551219Vu LIZIZ() {
                    C19VI c19vi;
                    AbstractC21548119Up abstractC21548119Up = this.LLJI.LLJILJILJ;
                    if (abstractC21548119Up == null || (c19vi = ((C19VW) abstractC21548119Up).LIZ.LLJJJ) == null) {
                        return null;
                    }
                    return c19vi.LIZ();
                }

                @Override // X.AbstractViewOnTouchListenerC21551119Vt
                public final boolean LIZJ() {
                    InterfaceC21551219Vu interfaceC21551219VuLIZIZ;
                    ViewOnClickListenerC21547919Un viewOnClickListenerC21547919Un = this.LLJI;
                    InterfaceC21548019Uo interfaceC21548019Uo = viewOnClickListenerC21547919Un.LLJIJIL;
                    return interfaceC21548019Uo != null && interfaceC21548019Uo.LIZ(viewOnClickListenerC21547919Un.LLIZLLLIL) && (interfaceC21551219VuLIZIZ = LIZIZ()) != null && interfaceC21551219VuLIZIZ.isShowing();
                }

                {
                    super(this.LLJI);
                }
            };
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC21548019Uo interfaceC21548019Uo = this.LLJIJIL;
        if (interfaceC21548019Uo != null) {
            interfaceC21548019Uo.LIZ(this.LLIZLLLIL);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.LLJILLL = LJJJIL();
        LJJJJ();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C19VL c19vl;
        if (this.LLIZLLLIL.hasSubMenu() && (c19vl = this.LLJILJIL) != null && c19vl.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setExpandedFormat(boolean z) {
        if (this.LLJJ != z) {
            this.LLJJ = z;
            C21548219Uq c21548219Uq = this.LLIZLLLIL;
            if (c21548219Uq != null) {
                C19V6 c19v6 = c21548219Uq.LJIILIIL;
                c19v6.LJIIJ = true;
                c19v6.LJIILL(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.LLJI = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.LLJJIJI;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        LJJJJ();
    }

    public void setItemInvoker(InterfaceC21548019Uo interfaceC21548019Uo) {
        this.LLJIJIL = interfaceC21548019Uo;
    }

    public void setPopupCallback(AbstractC21548119Up abstractC21548119Up) {
        this.LLJILJILJ = abstractC21548119Up;
    }

    public void setTitle(CharSequence charSequence) {
        this.LLJ = charSequence;
        LJJJJ();
    }

    public ViewOnClickListenerC21547919Un(Context context, AttributeSet attributeSet) {
        View.OnClickListener fVar;
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.LLJILLL = LJJJIL();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionMenuItemView, 0, 0);
        this.LLJJI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.LLJJIJI = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        if (C1848410yCV.LIZ) {
            fVar = new f(this);
        } else {
            fVar = this;
        }
        a aVar = new a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        this.LLJJIII = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin;
        int i3;
        boolean zLJJJI = LJJJI();
        if (zLJJJI && (i3 = this.LLJJIII) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            iMin = Math.min(size, this.LLJJI);
        } else {
            iMin = this.LLJJI;
        }
        if (mode != 1073741824 && this.LLJJI > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (!zLJJJI && this.LLJI != null) {
            super.setPadding((getMeasuredWidth() - this.LLJI.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.LLJJIII = i;
        super.setPadding(i, i2, i3, i4);
    }
}
