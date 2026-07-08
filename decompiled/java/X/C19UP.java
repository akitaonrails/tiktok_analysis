package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import u4.q0;

/* JADX INFO: renamed from: X.19UP, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19UP extends C16GG implements InterfaceC21549619Ve {
    public static final int[] LLJLLIL = {R.attr.state_checked};
    public int LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public final CheckedTextView LLJJJJLIIL;
    public FrameLayout LLJJL;
    public C21548219Uq LLJJLIIIJLLLLLLLZ;
    public ColorStateList LLJL;
    public boolean LLJLIL;
    public Drawable LLJLILLLLZIIL;
    public final C19UO LLJLL;

    @Override // X.InterfaceC21549619Ve
    public C21548219Uq getItemData() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.LLJJL == null) {
                this.LLJJL = (FrameLayout) C786410Ut5.LJLLLL((ViewStub) findViewById(com.zhiliaoapp.musically.R.id.fpo));
            }
            C786410Ut5.LJJJJIZL(this.LLJJL);
            this.LLJJL.addView(view);
        }
    }

    @Override // X.InterfaceC21549619Ve
    public final void LJIIJJI(C21548219Uq c21548219Uq) {
        int i;
        StateListDrawable stateListDrawable;
        this.LLJJLIIIJLLLLLLLZ = c21548219Uq;
        int i2 = c21548219Uq.LIZ;
        if (i2 > 0) {
            setId(i2);
        }
        if (c21548219Uq.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        int visibility = getVisibility();
        setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, this);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.zhiliaoapp.musically.R.attr.big, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(LLJLLIL, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(c21548219Uq.isCheckable());
        setChecked(c21548219Uq.isChecked());
        setEnabled(c21548219Uq.isEnabled());
        setTitle(c21548219Uq.LJ);
        setIcon(c21548219Uq.getIcon());
        setActionView(c21548219Uq.getActionView());
        setContentDescription(c21548219Uq.LJIILLIIL);
        C1697050uGN.LIZ(this, c21548219Uq.LJIIZILJ);
        C21548219Uq c21548219Uq2 = this.LLJJLIIIJLLLLLLLZ;
        if (c21548219Uq2.LJ == null && c21548219Uq2.getIcon() == null && this.LLJJLIIIJLLLLLLLZ.getActionView() != null) {
            CheckedTextView checkedTextView = this.LLJJJJLIIL;
            int visibility2 = checkedTextView.getVisibility();
            checkedTextView.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, checkedTextView);
            FrameLayout frameLayout = this.LLJJL;
            if (frameLayout != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
                layoutParams.width = -1;
                C786410Ut5.a6(this.LLJJL, layoutParams);
                return;
            }
            return;
        }
        CheckedTextView checkedTextView2 = this.LLJJJJLIIL;
        int visibility3 = checkedTextView2.getVisibility();
        checkedTextView2.setVisibility(0);
        C1602160rnK.LIZIZ(visibility3, 0, checkedTextView2);
        FrameLayout frameLayout2 = this.LLJJL;
        if (frameLayout2 == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) frameLayout2.getLayoutParams();
        layoutParams2.width = -2;
        C786410Ut5.a6(this.LLJJL, layoutParams2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C21548219Uq c21548219Uq = this.LLJJLIIIJLLLLLLLZ;
        if (c21548219Uq != null && c21548219Uq.isCheckable() && this.LLJJLIIIJLLLLLLLZ.isChecked()) {
            ViewGroup.mergeDrawableStates(iArrOnCreateDrawableState, LLJLLIL);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.LLJJJJJIL != z) {
            this.LLJJJJJIL = z;
            sendAccessibilityEvent(this.LLJJJJLIIL, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.LLJJJJLIIL.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.LLJLIL) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                C16GF.LJII(drawable, this.LLJL);
            }
            int i = this.LLJJJIL;
            drawable.setBounds(0, 0, i, i);
        } else if (this.LLJJJJ) {
            if (this.LLJLILLLLZIIL == null) {
                Drawable drawableLIZ = C420660GeW.LIZ(getResources(), com.zhiliaoapp.musically.R.drawable.cp7, getContext().getTheme());
                this.LLJLILLLLZIIL = drawableLIZ;
                if (drawableLIZ != null) {
                    int i2 = this.LLJJJIL;
                    drawableLIZ.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.LLJLILLLLZIIL;
        }
        this.LLJJJJLIIL.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.LLJJJJLIIL.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.LLJJJIL = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.LLJL = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.LLJLIL = z;
        C21548219Uq c21548219Uq = this.LLJJLIIIJLLLLLLLZ;
        if (c21548219Uq != null) {
            setIcon(c21548219Uq.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.LLJJJJLIIL.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.LLJJJJ = z;
    }

    public void setTextAppearance(int i) {
        this.LLJJJJLIIL.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.LLJJJJLIIL.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.LLJJJJLIIL.setText(charSequence);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.13jo, X.19UO] */
    public C19UP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ?? r3 = new C20094213jo() { // from class: X.19UO
            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCheckable(this.LIZ.LLJJJJJIL);
            }
        };
        this.LLJLL = r3;
        setOrientation(0);
        C786410Ut5.Td(C786410Ut5.ne(context), com.zhiliaoapp.musically.R.layout.bjt, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.qu));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.zhiliaoapp.musically.R.id.fpp);
        this.LLJJJJLIIL = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        q0.LJIJ(checkedTextView, r3);
    }
}
