package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.badge.BadgeDrawable;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.19Tz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21546519Tz extends LinearLayout {
    public View badgeAnchorView;
    public BadgeDrawable badgeDrawable;
    public Drawable baseBackgroundDrawable;
    public ImageView customIconView;
    public TextView customTextView;
    public View customView;
    public int defaultMaxLines;
    public ImageView iconView;
    public C19U0 tab;
    public TextView textView;
    public final /* synthetic */ C19U1 this$0;

    private FrameLayout getCustomParentForBadge(View view) {
        return null;
    }

    public int getContentHeight() {
        int i = 0;
        View[] viewArr = {this.textView, this.iconView, this.customView};
        int bottom = 0;
        int top = 0;
        boolean z = false;
        do {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    top = Math.min(top, view.getTop());
                    bottom = Math.max(bottom, view.getBottom());
                } else {
                    top = view.getTop();
                    bottom = view.getBottom();
                }
                z = true;
            }
            i++;
        } while (i < 3);
        return bottom - top;
    }

    public int getContentWidth() {
        int i = 0;
        View[] viewArr = {this.textView, this.iconView, this.customView};
        int right = 0;
        int left = 0;
        boolean z = false;
        do {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    left = Math.min(left, view.getLeft());
                    right = Math.max(right, view.getRight());
                } else {
                    left = view.getLeft();
                    right = view.getRight();
                }
                z = true;
            }
            i++;
        } while (i < 3);
        return right - left;
    }

    public void reset() {
        setTab(null);
        setSelected(false);
    }

    private FrameLayout createPreApi18BadgeAnchorRoot() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-2, -2));
        return frameLayout;
    }

    public BadgeDrawable getOrCreateBadge() {
        if (this.badgeDrawable == null) {
            Context context = getContext();
            BadgeDrawable badgeDrawable = new BadgeDrawable(context);
            TypedArray typedArrayLIZLLL = C19PG.LIZLLL(context, null, R$styleable.Badge, R.attr.bat, R.style.a3y, new int[0]);
            badgeDrawable.LJII(typedArrayLIZLLL.getInt(R$styleable.Badge_maxCharacterCount, 4));
            if (typedArrayLIZLLL.hasValue(R$styleable.Badge_number)) {
                int iMax = Math.max(0, typedArrayLIZLLL.getInt(R$styleable.Badge_number, 0));
                BadgeDrawable.SavedState savedState = badgeDrawable.LLIZLLLIL;
                if (savedState.number != iMax) {
                    savedState.number = iMax;
                    badgeDrawable.LLILLL.LIZLLL = true;
                    badgeDrawable.LJIIIZ();
                    badgeDrawable.invalidateSelf();
                }
            }
            int defaultColor = C19RN.LIZ(context, typedArrayLIZLLL, R$styleable.Badge_backgroundColor).getDefaultColor();
            badgeDrawable.LLIZLLLIL.backgroundColor = defaultColor;
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(defaultColor);
            C21538919Rb c21538919Rb = badgeDrawable.LLILLJJLI;
            if (c21538919Rb.LL.LIZJ != colorStateListValueOf) {
                c21538919Rb.LJIIJJI(colorStateListValueOf);
                badgeDrawable.invalidateSelf();
            }
            if (typedArrayLIZLLL.hasValue(R$styleable.Badge_badgeTextColor)) {
                int defaultColor2 = C19RN.LIZ(context, typedArrayLIZLLL, R$styleable.Badge_badgeTextColor).getDefaultColor();
                badgeDrawable.LLIZLLLIL.badgeTextColor = defaultColor2;
                if (badgeDrawable.LLILLL.LIZ.getColor() != defaultColor2) {
                    badgeDrawable.LLILLL.LIZ.setColor(defaultColor2);
                    badgeDrawable.invalidateSelf();
                }
            }
            badgeDrawable.LJI(typedArrayLIZLLL.getInt(R$styleable.Badge_badgeGravity, 8388661));
            badgeDrawable.LLIZLLLIL.horizontalOffset = typedArrayLIZLLL.getDimensionPixelOffset(R$styleable.Badge_horizontalOffset, 0);
            badgeDrawable.LJIIIZ();
            badgeDrawable.LLIZLLLIL.verticalOffset = typedArrayLIZLLL.getDimensionPixelOffset(R$styleable.Badge_verticalOffset, 0);
            badgeDrawable.LJIIIZ();
            typedArrayLIZLLL.recycle();
            this.badgeDrawable = badgeDrawable;
        }
        tryUpdateBadgeAnchor();
        BadgeDrawable badgeDrawable2 = this.badgeDrawable;
        if (badgeDrawable2 != null) {
            return badgeDrawable2;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    public boolean hasBadgeDrawable() {
        return this.badgeDrawable != null;
    }

    public void removeBadge() {
        if (this.badgeAnchorView != null) {
            tryRemoveBadgeFromAnchor();
        }
        this.badgeDrawable = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void update() {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21546519Tz.update():void");
    }

    public final void updateOrientation() {
        setOrientation(!this.this$0.inlineLabel ? 1 : 0);
        if (this.customTextView == null && this.customIconView == null) {
            updateTextAndIcon(this.textView, this.iconView);
        } else {
            updateTextAndIcon(this.customTextView, this.customIconView);
        }
    }

    private void inflateAndAddDefaultIconView() {
        ImageView imageView = (ImageView) C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.bjl, this, false);
        this.iconView = imageView;
        addView(imageView, 0);
    }

    private void inflateAndAddDefaultTextView() {
        TextView textView = (TextView) C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.bjm, this, false);
        this.textView = textView;
        addView(textView);
    }

    private void tryRemoveBadgeFromAnchor() {
        if (hasBadgeDrawable()) {
            clipViewToPaddingForBadge(true);
            View view = this.badgeAnchorView;
            if (view != null) {
                BadgeDrawable badgeDrawable = this.badgeDrawable;
                if (badgeDrawable != null) {
                    if (badgeDrawable.LIZLLL() != null) {
                        badgeDrawable.LIZLLL().setForeground(null);
                    } else {
                        view.getOverlay().remove(badgeDrawable);
                    }
                }
                this.badgeAnchorView = null;
            }
        }
    }

    private void tryUpdateBadgeAnchor() {
        C19U0 c19u0;
        C19U0 c19u02;
        if (hasBadgeDrawable()) {
            if (this.customView != null) {
                tryRemoveBadgeFromAnchor();
                return;
            }
            ImageView imageView = this.iconView;
            if (imageView != null && (c19u02 = this.tab) != null && c19u02.LIZIZ != null) {
                if (this.badgeAnchorView == imageView) {
                    tryUpdateBadgeDrawableBounds(imageView);
                    return;
                } else {
                    tryRemoveBadgeFromAnchor();
                    tryAttachBadgeToAnchor(this.iconView);
                    return;
                }
            }
            TextView textView = this.textView;
            if (textView == null || (c19u0 = this.tab) == null || c19u0.LJI != 1) {
                tryRemoveBadgeFromAnchor();
            } else if (this.badgeAnchorView == textView) {
                tryUpdateBadgeDrawableBounds(textView);
            } else {
                tryRemoveBadgeFromAnchor();
                tryAttachBadgeToAnchor(this.textView);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.baseBackgroundDrawable;
        if (drawable == null || !drawable.isStateful() || (!false && !this.baseBackgroundDrawable.setState(drawableState))) {
            return;
        }
        invalidate();
        this.this$0.invalidate();
    }

    @Override // android.view.View
    public boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.tab == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        this.tab.LIZIZ();
        return true;
    }

    public BadgeDrawable getBadge() {
        return this.badgeDrawable;
    }

    public C19U0 getTab() {
        return this.tab;
    }

    private void addOnLayoutChangeListener(final View view) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.19UD
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (view.getVisibility() == 0) {
                    this.LLILLJJLI.tryUpdateBadgeDrawableBounds(view);
                }
            }
        });
    }

    private void clipViewToPaddingForBadge(boolean z) {
        setClipChildren(z);
        setClipToPadding(z);
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(z);
            viewGroup.setClipToPadding(z);
        }
    }

    private void tryAttachBadgeToAnchor(View view) {
        if (hasBadgeDrawable() && view != null) {
            clipViewToPaddingForBadge(false);
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            FrameLayout customParentForBadge = getCustomParentForBadge(view);
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            badgeDrawable.setBounds(rect);
            badgeDrawable.LJIIIIZZ(view, customParentForBadge);
            if (badgeDrawable.LIZLLL() != null) {
                badgeDrawable.LIZLLL().setForeground(badgeDrawable);
            } else {
                view.getOverlay().add(badgeDrawable);
            }
            this.badgeAnchorView = view;
        }
    }

    public void drawBackground(Canvas canvas) {
        Drawable drawable = this.baseBackgroundDrawable;
        if (drawable != null) {
            drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
            this.baseBackgroundDrawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BadgeDrawable badgeDrawable = this.badgeDrawable;
        if (badgeDrawable != null && badgeDrawable.isVisible()) {
            CharSequence contentDescription = getContentDescription();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((Object) contentDescription);
            sbLIZ.append(", ");
            sbLIZ.append((Object) this.badgeDrawable.LIZJ());
            accessibilityNodeInfo.setContentDescription(C2188811AlT.LIZIZ(sbLIZ));
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatWrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        accessibilityNodeInfoCompatWrap.setCollectionItemInfo(C20092913jb.LIZ(0, 1, this.tab.LJ, 1, isSelected()));
        if (isSelected()) {
            accessibilityNodeInfoCompatWrap.setClickable(false);
            accessibilityNodeInfoCompatWrap.removeAction(C20092413jW.LJI);
        }
        accessibilityNodeInfoCompatWrap.setRoleDescription(getResources().getString(2131836254));
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.textView;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.iconView;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.customView;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(C19U0 c19u0) {
        if (c19u0 != this.tab) {
            this.tab = c19u0;
            update();
        }
    }

    public void tryUpdateBadgeDrawableBounds(View view) {
        if (hasBadgeDrawable() && view == this.badgeAnchorView) {
            BadgeDrawable badgeDrawable = this.badgeDrawable;
            FrameLayout customParentForBadge = getCustomParentForBadge(view);
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            badgeDrawable.setBounds(rect);
            badgeDrawable.LJIIIIZZ(view, customParentForBadge);
        }
    }

    public void updateBackgroundDrawable(Context context) {
        GradientDrawable gradientDrawable;
        int i = this.this$0.tabBackgroundResId;
        GradientDrawable gradientDrawable2 = null;
        if (i != 0) {
            Drawable drawableLIZ = C14MI.LIZ(context, i);
            this.baseBackgroundDrawable = drawableLIZ;
            if (drawableLIZ != null && drawableLIZ.isStateful()) {
                this.baseBackgroundDrawable.setState(getDrawableState());
            }
        } else {
            this.baseBackgroundDrawable = null;
        }
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(0);
        Drawable rippleDrawable = gradientDrawable3;
        if (this.this$0.tabRippleColorStateList != null) {
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            gradientDrawable4.setCornerRadius(1.0E-5f);
            gradientDrawable4.setColor(-1);
            ColorStateList colorStateListLIZ = C19Q7.LIZ(this.this$0.tabRippleColorStateList);
            if (this.this$0.unboundedRipple) {
                gradientDrawable = null;
            } else {
                gradientDrawable2 = gradientDrawable4;
                gradientDrawable = gradientDrawable3;
            }
            rippleDrawable = new RippleDrawable(colorStateListLIZ, gradientDrawable, gradientDrawable2);
        }
        setBackground(rippleDrawable);
        this.this$0.invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21546519Tz(C19U1 c19u1, Context context) {
        super(context);
        this.this$0 = c19u1;
        this.defaultMaxLines = 2;
        updateBackgroundDrawable(context);
        setPaddingRelative(c19u1.tabPaddingStart, c19u1.tabPaddingTop, c19u1.tabPaddingEnd, c19u1.tabPaddingBottom);
        setGravity(17);
        setOrientation(!c19u1.inlineLabel ? 1 : 0);
        setClickable(true);
        q0.LJJ(this, C20097213kI.LIZ(getContext()));
    }

    private void updateTextAndIcon(TextView textView, ImageView imageView) {
        Drawable drawableMutate;
        CharSequence charSequence;
        int iLIZIZ;
        Drawable drawable;
        C19U0 c19u0 = this.tab;
        CharSequence charSequence2 = null;
        if (c19u0 != null && (drawable = c19u0.LIZIZ) != null) {
            drawableMutate = drawable.mutate();
        } else {
            drawableMutate = null;
        }
        C19U0 c19u02 = this.tab;
        if (c19u02 != null) {
            charSequence = c19u02.LIZJ;
        } else {
            charSequence = null;
        }
        if (imageView != null) {
            if (drawableMutate != null) {
                imageView.setImageDrawable(drawableMutate);
                C786410Ut5.LJZI(0, imageView);
                int visibility = getVisibility();
                setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, this);
            } else {
                C786410Ut5.LJZI(8, imageView);
                imageView.setImageDrawable(null);
            }
        }
        boolean z = !TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (z) {
                textView.setText(charSequence);
                if (this.tab.LJI == 1) {
                    C786410Ut5.LLIL(textView, 0);
                } else {
                    C786410Ut5.LLIL(textView, 8);
                }
                int visibility2 = getVisibility();
                setVisibility(0);
                C1602160rnK.LIZIZ(visibility2, 0, this);
            } else {
                C786410Ut5.LLIL(textView, 8);
                textView.setText((CharSequence) null);
            }
        }
        if (imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            if (z && imageView.getVisibility() == 0) {
                iLIZIZ = (int) C21551419Vw.LIZIZ(8, getContext());
            } else {
                iLIZIZ = 0;
            }
            if (this.this$0.inlineLabel) {
                if (iLIZIZ != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iLIZIZ);
                    marginLayoutParams.bottomMargin = 0;
                    C786410Ut5.c6(imageView, marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iLIZIZ != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iLIZIZ;
                marginLayoutParams.setMarginEnd(0);
                C786410Ut5.c6(imageView, marginLayoutParams);
                imageView.requestLayout();
            }
        }
        C19U0 c19u03 = this.tab;
        if (c19u03 != null) {
            charSequence2 = c19u03.LIZLLL;
        }
        if (!z) {
            charSequence = charSequence2;
        }
        C1697050uGN.LIZ(this, charSequence);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int tabMaxWidth = this.this$0.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(this.this$0.tabMaxWidth, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.textView != null) {
            float f = this.this$0.tabTextSize;
            int i3 = this.defaultMaxLines;
            ImageView imageView = this.iconView;
            if (imageView != null && imageView.getVisibility() == 0) {
                i3 = 1;
            } else {
                TextView textView = this.textView;
                if (textView != null && textView.getLineCount() > 1) {
                    f = this.this$0.tabTextMultiLineSize;
                }
            }
            float textSize = this.textView.getTextSize();
            int lineCount = this.textView.getLineCount();
            int maxLines = this.textView.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (this.this$0.mode == 1 && f > textSize && lineCount == 1 && ((layout = this.textView.getLayout()) == null || approximateLineWidth(layout, 0, f) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                    return;
                }
                this.textView.setTextSize(0, f);
                this.textView.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    private float approximateLineWidth(Layout layout, int i, float f) {
        return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
    }
}
