package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.badge.BadgeDrawable;
import u4.q0;

/* JADX INFO: renamed from: X.19Ty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21546419Ty extends FrameLayout implements InterfaceC21549619Ve {
    public static final int[] LLJJIII = {R.attr.state_checked};
    public final int LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public final ImageView LLIZ;
    public final ViewGroup LLIZLLLIL;
    public final TextView LLJ;
    public final TextView LLJI;
    public int LLJIJIL;
    public C21548219Uq LLJILJIL;
    public ColorStateList LLJILJILJ;
    public Drawable LLJILLL;
    public Drawable LLJJ;
    public BadgeDrawable LLJJI;

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof C21546419Ty) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    public BadgeDrawable getBadge() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC21549619Ve
    public C21548219Uq getItemData() {
        return this.LLJILJIL;
    }

    public int getItemPosition() {
        return this.LLJIJIL;
    }

    public C21546419Ty(Context context) {
        super(context, null, 0);
        this.LLJIJIL = -1;
        Resources resources = getResources();
        C786410Ut5.Td(C786410Ut5.ne(context), com.zhiliaoapp.musically.R.layout.bjh, this, true);
        setBackgroundResource(com.zhiliaoapp.musically.R.drawable.bgf);
        this.LL = resources.getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.qf);
        ImageView imageView = (ImageView) findViewById(com.zhiliaoapp.musically.R.id.jxe);
        this.LLIZ = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(com.zhiliaoapp.musically.R.id.m46);
        this.LLIZLLLIL = viewGroup;
        TextView textView = (TextView) findViewById(com.zhiliaoapp.musically.R.id.vlp);
        this.LLJ = textView;
        TextView textView2 = (TextView) findViewById(com.zhiliaoapp.musically.R.id.m5v);
        this.LLJI = textView2;
        viewGroup.setTag(com.zhiliaoapp.musically.R.id.on5, Integer.valueOf(viewGroup.getPaddingBottom()));
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        float textSize = textView.getTextSize();
        float textSize2 = textView2.getTextSize();
        this.LLILLJJLI = textSize - textSize2;
        this.LLILLL = (textSize2 * 1.0f) / textSize;
        this.LLILZ = (textSize * 1.0f) / textSize2;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.19Tx
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (this.LL.LLIZ.getVisibility() == 0) {
                        C21546419Ty c21546419Ty = this.LL;
                        ImageView imageView2 = c21546419Ty.LLIZ;
                        if (c21546419Ty.LLJJI != null) {
                            BadgeDrawable badgeDrawable = c21546419Ty.LLJJI;
                            Rect rect = new Rect();
                            imageView2.getDrawingRect(rect);
                            badgeDrawable.setBounds(rect);
                            badgeDrawable.LJIIIIZZ(imageView2, null);
                        }
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC21549619Ve
    public final void LJIIJJI(C21548219Uq c21548219Uq) {
        CharSequence charSequence;
        int i;
        this.LLJILJIL = c21548219Uq;
        setCheckable(c21548219Uq.isCheckable());
        setChecked(c21548219Uq.isChecked());
        setEnabled(c21548219Uq.isEnabled());
        setIcon(c21548219Uq.getIcon());
        setTitle(c21548219Uq.LJ);
        setId(c21548219Uq.LIZ);
        if (!TextUtils.isEmpty(c21548219Uq.LJIILLIIL)) {
            setContentDescription(c21548219Uq.LJIILLIIL);
        }
        if (!TextUtils.isEmpty(c21548219Uq.LJIIZILJ)) {
            charSequence = c21548219Uq.LJIIZILJ;
        } else {
            charSequence = c21548219Uq.LJ;
        }
        C1697050uGN.LIZ(this, charSequence);
        if (c21548219Uq.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        int visibility = getVisibility();
        setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        C21548219Uq c21548219Uq = this.LLJILJIL;
        if (c21548219Uq != null && c21548219Uq.isCheckable() && this.LLJILJIL.isChecked()) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, LLJJIII);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.LLJJI;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            C21548219Uq c21548219Uq = this.LLJILJIL;
            CharSequence charSequence = c21548219Uq.LJ;
            if (!TextUtils.isEmpty(c21548219Uq.LJIILLIIL)) {
                charSequence = this.LLJILJIL.LJIILLIIL;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((Object) charSequence);
            sbLIZ.append(", ");
            sbLIZ.append((Object) this.LLJJI.LIZJ());
            accessibilityNodeInfo.setContentDescription(C2188811AlT.LIZIZ(sbLIZ));
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        accessibilityNodeInfoCompatWrap.setCollectionItemInfo(C20092913jb.LIZ(0, 1, getItemVisiblePosition(), 1, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompatWrap.setClickable(false);
            accessibilityNodeInfoCompatWrap.removeAction(C20092413jW.LJI);
        }
        accessibilityNodeInfoCompatWrap.setRoleDescription(getResources().getString(2131836254));
    }

    public void setBadge(BadgeDrawable badgeDrawable) {
        this.LLJJI = badgeDrawable;
        if (this.LLIZ != null) {
            ImageView imageView = this.LLIZ;
            if (badgeDrawable != null && imageView != null) {
                setClipChildren(false);
                setClipToPadding(false);
                BadgeDrawable badgeDrawable2 = this.LLJJI;
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                badgeDrawable2.setBounds(rect);
                badgeDrawable2.LJIIIIZZ(imageView, null);
                if (badgeDrawable2.LIZLLL() != null) {
                    badgeDrawable2.LIZLLL().setForeground(badgeDrawable2);
                } else {
                    imageView.getOverlay().add(badgeDrawable2);
                }
            }
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        this.LLJI.setPivotX(r1.getWidth() / 2);
        this.LLJI.setPivotY(r1.getBaseline());
        this.LLJ.setPivotX(r1.getWidth() / 2);
        this.LLJ.setPivotY(r1.getBaseline());
        int i = this.LLILZIL;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        LIZ(this.LL, 17, this.LLIZ);
                        C786410Ut5.LLIL(this.LLJI, 8);
                        C786410Ut5.LLIL(this.LLJ, 8);
                    }
                } else {
                    ViewGroup viewGroup = this.LLIZLLLIL;
                    LIZJ(((Integer) viewGroup.getTag(com.zhiliaoapp.musically.R.id.on5)).intValue(), viewGroup);
                    if (z) {
                        LIZ((int) (this.LL + this.LLILLJJLI), 49, this.LLIZ);
                        LIZIZ(1.0f, 1.0f, 0, this.LLJI);
                        TextView textView = this.LLJ;
                        float f = this.LLILLL;
                        LIZIZ(f, f, 4, textView);
                    } else {
                        LIZ(this.LL, 49, this.LLIZ);
                        TextView textView2 = this.LLJI;
                        float f2 = this.LLILZ;
                        LIZIZ(f2, f2, 4, textView2);
                        LIZIZ(1.0f, 1.0f, 0, this.LLJ);
                    }
                }
            } else {
                if (z) {
                    LIZ(this.LL, 49, this.LLIZ);
                    ViewGroup viewGroup2 = this.LLIZLLLIL;
                    LIZJ(((Integer) viewGroup2.getTag(com.zhiliaoapp.musically.R.id.on5)).intValue(), viewGroup2);
                    C786410Ut5.LLIL(this.LLJI, 0);
                } else {
                    LIZ(this.LL, 17, this.LLIZ);
                    LIZJ(0, this.LLIZLLLIL);
                    C786410Ut5.LLIL(this.LLJI, 4);
                }
                C786410Ut5.LLIL(this.LLJ, 4);
            }
        } else if (this.LLILZLL) {
            if (z) {
                LIZ(this.LL, 49, this.LLIZ);
                ViewGroup viewGroup3 = this.LLIZLLLIL;
                LIZJ(((Integer) viewGroup3.getTag(com.zhiliaoapp.musically.R.id.on5)).intValue(), viewGroup3);
                C786410Ut5.LLIL(this.LLJI, 0);
            } else {
                LIZ(this.LL, 17, this.LLIZ);
                LIZJ(0, this.LLIZLLLIL);
                C786410Ut5.LLIL(this.LLJI, 4);
            }
            C786410Ut5.LLIL(this.LLJ, 4);
        } else {
            ViewGroup viewGroup4 = this.LLIZLLLIL;
            LIZJ(((Integer) viewGroup4.getTag(com.zhiliaoapp.musically.R.id.on5)).intValue(), viewGroup4);
            if (z) {
                LIZ((int) (this.LL + this.LLILLJJLI), 49, this.LLIZ);
                LIZIZ(1.0f, 1.0f, 0, this.LLJI);
                TextView textView3 = this.LLJ;
                float f3 = this.LLILLL;
                LIZIZ(f3, f3, 4, textView3);
            } else {
                LIZ(this.LL, 49, this.LLIZ);
                TextView textView4 = this.LLJI;
                float f4 = this.LLILZ;
                LIZIZ(f4, f4, 4, textView4);
                LIZIZ(1.0f, 1.0f, 0, this.LLJ);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.LLJ.setEnabled(z);
        this.LLJI.setEnabled(z);
        this.LLIZ.setEnabled(z);
        if (z) {
            q0.LJJ(this, C20097213kI.LIZ(getContext()));
        } else {
            q0.LJJ(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.LLJILLL) {
            return;
        }
        this.LLJILLL = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.LLJJ = drawable;
            ColorStateList colorStateList = this.LLJILJILJ;
            if (colorStateList != null) {
                C16GF.LJII(drawable, colorStateList);
            }
        }
        this.LLIZ.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LLIZ.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        C786410Ut5.c6(this.LLIZ, layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.LLJILJILJ = colorStateList;
        if (this.LLJILJIL != null && (drawable = this.LLJJ) != null) {
            C16GF.LJII(drawable, colorStateList);
            this.LLJJ.invalidateSelf();
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        setBackground(drawable);
    }

    public void setItemPosition(int i) {
        this.LLJIJIL = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.LLILZIL != i) {
            this.LLILZIL = i;
            C21548219Uq c21548219Uq = this.LLJILJIL;
            if (c21548219Uq != null) {
                setChecked(c21548219Uq.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.LLILZLL != z) {
            this.LLILZLL = z;
            C21548219Uq c21548219Uq = this.LLJILJIL;
            if (c21548219Uq != null) {
                setChecked(c21548219Uq.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        this.LLJI.setTextAppearance(i);
        float textSize = this.LLJ.getTextSize();
        float textSize2 = this.LLJI.getTextSize();
        this.LLILLJJLI = textSize - textSize2;
        this.LLILLL = (textSize2 * 1.0f) / textSize;
        this.LLILZ = (textSize * 1.0f) / textSize2;
    }

    public void setTextAppearanceInactive(int i) {
        this.LLJ.setTextAppearance(i);
        float textSize = this.LLJ.getTextSize();
        float textSize2 = this.LLJI.getTextSize();
        this.LLILLJJLI = textSize - textSize2;
        this.LLILLL = (textSize2 * 1.0f) / textSize;
        this.LLILZ = (textSize * 1.0f) / textSize2;
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.LLJ.setTextColor(colorStateList);
            this.LLJI.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.LLJ.setText(charSequence);
        this.LLJI.setText(charSequence);
        C21548219Uq c21548219Uq = this.LLJILJIL;
        if (c21548219Uq == null || TextUtils.isEmpty(c21548219Uq.LJIILLIIL)) {
            setContentDescription(charSequence);
        }
        C21548219Uq c21548219Uq2 = this.LLJILJIL;
        if (c21548219Uq2 != null && !TextUtils.isEmpty(c21548219Uq2.LJIIZILJ)) {
            charSequence = this.LLJILJIL.LJIIZILJ;
        }
        C1697050uGN.LIZ(this, charSequence);
    }

    public void setItemBackground(int i) {
        Drawable drawableLIZIZ;
        if (i == 0) {
            drawableLIZIZ = null;
        } else {
            drawableLIZIZ = C800330VaR.LIZIZ(getContext(), i);
        }
        setItemBackground(drawableLIZIZ);
    }

    public static void LIZJ(int i, View view) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static void LIZ(int i, int i2, View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        C786410Ut5.W5(view, layoutParams);
    }

    public static void LIZIZ(float f, float f2, int i, View view) {
        C786410Ut5.Ob(view, f);
        C786410Ut5.pc(view, f2);
        C786410Ut5.LJLLLLLL(i, view);
    }
}
