package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rXg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1592460rXg extends LinearLayout implements InterfaceC20343214is {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public float LLILZ;
    public final Paint LLILZIL;
    public int LLILZLL;
    public float LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public ValueAnimator LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public LinearGradient LLJILLL;
    public LinearGradient LLJJ;
    public LinearGradient LLJJI;
    public Paint LLJJIII;
    public PorterDuffXfermode LLJJIJI;
    public int LLJJIJIIJIL;
    public C443120HZe<Float, Float, ? extends Paint> LLJJIJIL;
    public float LLJJJ;
    public float LLJJJIL;
    public final /* synthetic */ C1592450rXf LLJJJJ;

    @Override // X.InterfaceC20343214is
    public String getCustomRiskId() {
        return null;
    }

    @Override // X.InterfaceC20343214is
    public String getRiskId() {
        return "TAB_TOP/slidingtab";
    }

    public void setCustomRiskId(String str) {
    }

    public final void LJII() {
        int left;
        int right;
        C1592080rX4 c1592080rX4;
        TextView customTextView;
        int i;
        int iLJ;
        int iLJFF;
        View childAt = getChildAt(this.LLILZLL);
        if (childAt == null || childAt.getWidth() <= 0) {
            left = -1;
            right = -1;
        } else {
            if (this.LLJJJJ.LLJJJJ) {
                left = LJ(this.LLILZLL);
                right = LJFF(this.LLILZLL, left);
                if (this.LLILZLL == 0) {
                    left += this.LLJJJJ.getTabPadding();
                }
            } else {
                left = LIZLLL(this.LLILZLL);
                right = LJFF(this.LLILZLL, left);
            }
            if (this.LLILLJJLI > 0) {
                int iAbs = Math.abs(right - left) / 2;
                int i2 = this.LLILLL;
                left = (left + iAbs) - i2;
                right = (right - iAbs) + i2;
            }
            if (this.LLIZ > 0.0f && this.LLILZLL < getChildCount() - 1) {
                if (this.LLJJJJ.LLJJJJ) {
                    iLJ = LJ(this.LLILZLL + 1);
                    iLJFF = LJFF(this.LLILZLL + 1, iLJ);
                } else {
                    iLJ = LIZLLL(this.LLILZLL + 1);
                    iLJFF = LJFF(this.LLILZLL + 1, iLJ);
                }
                if (this.LLILLJJLI > 0) {
                    int iAbs2 = Math.abs(iLJFF - iLJ) / 2;
                    int i3 = this.LLILLL;
                    iLJ = (iLJ + iAbs2) - i3;
                    iLJFF = (iLJFF - iAbs2) + i3;
                }
                float f = this.LLIZ;
                float f2 = iLJ * f;
                float f3 = 1.0f - f;
                left = (int) (f2 + (left * f3));
                right = (int) ((iLJFF * f) + (f3 * right));
            }
        }
        if ((childAt instanceof C1592080rX4) && (c1592080rX4 = (C1592080rX4) childAt) != null && (customTextView = c1592080rX4.getCustomTextView()) != null) {
            C1592450rXf c1592450rXf = this.LLJJJJ;
            if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "top_tab_indicator_bugfix", true, false) && (((i = this.LLILZLL) == 0 || i == getChildCount() - 1) && childAt.getWidth() - c1592450rXf.getTabPadding() < c1592450rXf.LLJJIJI && (customTextView.getPaddingRight() == 0 || customTextView.getPaddingLeft() == 0))) {
                if (left < 0) {
                    left = childAt.getLeft();
                }
                if (right < 0) {
                    right = childAt.getRight();
                }
                if (getWidth() + (c1592450rXf.getTabPadding() * 2) <= C497820Jfg.LIZIZ(getContext()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(56)) * 2)) {
                    int paddingLeft = customTextView.getPaddingLeft();
                    int paddingRight = customTextView.getPaddingRight();
                    if (paddingLeft < paddingRight) {
                        paddingLeft = paddingRight;
                    }
                    int paddingLeft2 = customTextView.getPaddingLeft();
                    int paddingRight2 = customTextView.getPaddingRight();
                    if (paddingLeft2 < paddingRight2) {
                        paddingLeft2 = paddingRight2;
                    }
                    customTextView.setPadding(paddingLeft, 0, paddingLeft2, 0);
                } else {
                    left = customTextView.getPaddingLeft() > 0 ? childAt.getLeft() - c1592450rXf.getTabPadding() : childAt.getLeft();
                    right = customTextView.getPaddingRight() > 0 ? childAt.getRight() - c1592450rXf.getTabPadding() : childAt.getRight();
                }
            }
        }
        if (left == this.LLIZLLLIL && right == this.LLJ) {
            return;
        }
        this.LLIZLLLIL = left;
        this.LLJ = right;
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final ViewPropertyAnimator animate() {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ANIMATE;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, "");
        ViewPropertyAnimator viewPropertyAnimatorAnimate = super.animate();
        C2180551AVp.LIZ(enumC2180541AVo, this, "");
        return viewPropertyAnimatorAnimate;
    }

    public final float getIndicatorPosition() {
        return this.LLILZLL + this.LLIZ;
    }

    public final void LIZ() {
        Integer numLIZJ;
        if (C1591480rW6.LIZ() == 2) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.f500io, getContext());
            if (numLIZJ2 != null) {
                int iIntValue = numLIZJ2.intValue();
                Paint paint = this.LLILZIL;
                if (paint != null) {
                    C844470XAv.LIZ.getClass();
                    paint.setShadowLayer(C12ES.LIZJ(12.0f, C844470XAv.LIZ()), 0.0f, 0.0f, iIntValue);
                    return;
                }
                return;
            }
            return;
        }
        if (C1591480rW6.LIZ() == 3) {
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.iq, getContext());
            if (numLIZJ3 != null) {
                int iIntValue2 = numLIZJ3.intValue();
                Paint paint2 = this.LLILZIL;
                if (paint2 != null) {
                    C844470XAv.LIZ.getClass();
                    paint2.setShadowLayer(C12ES.LIZJ(2.0f, C844470XAv.LIZ()), 0.0f, C12ES.LIZJ(1.0f, C844470XAv.LIZ()), iIntValue2);
                    return;
                }
                return;
            }
            return;
        }
        if (!C1591480rW6.LJ()) {
            this.LLILZIL.setShadowLayer(getHeight(), 0.0f, getWidth(), ColorProtector.parseColor("#26000000"));
            return;
        }
        Context context = getContext();
        if (context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.bp, context)) == null) {
            return;
        }
        int iIntValue3 = numLIZJ.intValue();
        Paint paint3 = this.LLILZIL;
        C844470XAv.LIZ.getClass();
        paint3.setShadowLayer(C12ES.LIZJ(0.3f, C844470XAv.LIZ()), 0.0f, C12ES.LIZJ(0.6f, C844470XAv.LIZ()), iIntValue3);
    }

    public final C443120HZe<Float, Float, Paint> getBarrierTriple() {
        return this.LLJJIJIL;
    }

    public final float getIndicatorLineCorner() {
        return this.LLJJJIL;
    }

    public final LinearGradient getLeftGradientRTL() {
        return this.LLJJ;
    }

    public final PorterDuffXfermode getMDuffXferMode() {
        return this.LLJJIJI;
    }

    public final boolean getMIsDragged() {
        return this.LLJILJIL;
    }

    public final int getMLayerId() {
        return this.LLJJIJIIJIL;
    }

    public final LinearGradient getMLeftGradient() {
        return this.LLJILLL;
    }

    public final Paint getMOverBorderPaint() {
        return this.LLJJIII;
    }

    public final LinearGradient getMRightGradient() {
        return this.LLJJI;
    }

    public final Paint getMSelectedIndicatorPaint() {
        return this.LLILZIL;
    }

    public final int getMSelectedPosition() {
        return this.LLILZLL;
    }

    public final float getMSelectionOffset() {
        return this.LLIZ;
    }

    public final float getStripMargin() {
        return this.LLJJJ;
    }

    public final int LIZLLL(int i) {
        C1592450rXf c1592450rXf = this.LLJJJJ;
        if (c1592450rXf.LLLII && !((Boolean) c1592450rXf.LLLI.getValue()).booleanValue()) {
            C1592450rXf c1592450rXf2 = this.LLJJJJ;
            if (c1592450rXf2.LLLIIII) {
                int width = c1592450rXf2.getWidth();
                C1592450rXf c1592450rXf3 = this.LLJJJJ;
                if (c1592450rXf3.LLLFF <= 0) {
                    c1592450rXf3.LLLFF = width;
                }
                if (width == c1592450rXf3.LLLFF) {
                    Integer num = (Integer) ((LinkedHashMap) c1592450rXf3.LLLF).get(Integer.valueOf(i));
                    if (num != null && num.intValue() >= 0) {
                        return num.intValue();
                    }
                } else {
                    c1592450rXf3.LLLFF = width;
                    c1592450rXf3.LLLF = new LinkedHashMap();
                }
            }
        }
        int iLIZJ = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iLIZJ += LIZJ(i2, i);
        }
        if (this.LLJJJJ.LLLII) {
            this.LLJJJJ.LLLF.put(Integer.valueOf(i), Integer.valueOf(iLIZJ));
        }
        return iLIZJ;
    }

    public final int LJ(int i) {
        C1592450rXf c1592450rXf = this.LLJJJJ;
        if (c1592450rXf.LLLII && !((Boolean) c1592450rXf.LLLI.getValue()).booleanValue()) {
            C1592450rXf c1592450rXf2 = this.LLJJJJ;
            if (c1592450rXf2.LLLIIII) {
                int width = c1592450rXf2.getWidth();
                C1592450rXf c1592450rXf3 = this.LLJJJJ;
                if (c1592450rXf3.LLLFF <= 0) {
                    c1592450rXf3.LLLFF = width;
                }
                if (width == c1592450rXf3.LLLFF) {
                    Integer num = (Integer) ((LinkedHashMap) c1592450rXf3.LLLF).get(Integer.valueOf(i));
                    if (num != null && num.intValue() >= 0) {
                        return num.intValue();
                    }
                } else {
                    c1592450rXf3.LLLFF = width;
                    c1592450rXf3.LLLF = new LinkedHashMap();
                }
            }
        }
        int tabCount = this.LLJJJJ.getTabCount() - 1;
        int i2 = i + 1;
        int iLIZJ = 0;
        if (i2 <= tabCount) {
            while (true) {
                iLIZJ += LIZJ(tabCount, i);
                if (tabCount == i2) {
                    break;
                }
                tabCount--;
            }
        }
        if (this.LLJJJJ.LLLII) {
            this.LLJJJJ.LLLF.put(Integer.valueOf(i), Integer.valueOf(iLIZJ));
        }
        return iLIZJ;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int tabCount;
        float f;
        float f2;
        int gradientWidth;
        LinearGradient linearGradient;
        int i2;
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        Paint third;
        int tabCount2;
        int paddingRight;
        int paddingLeft;
        float f3;
        float f4;
        C1592080rX4 c1592080rX4;
        TextView customTextView;
        Canvas canvas2 = canvas;
        super.draw(canvas2);
        if (C052X.LIZIZ() && !this.LLJJJJ.LLJJJIL) {
            return;
        }
        int gradientWidth2 = 0;
        if (C0C64.LJIILLIIL().LJIIIIZZ(31744, 2, "top_tab_indicator_bugfix", true, false)) {
            int i3 = this.LLJ;
            int i4 = this.LLIZLLLIL;
            if (i3 > i4) {
                float f5 = i4;
                float f6 = this.LLJILJILJ;
                float f7 = f5 + f6;
                float f8 = i3 - f6;
                List<TopTabProtocol> topTabProtocolList = this.LLJJJJ.getTopTabProtocolList();
                if (topTabProtocolList != null) {
                    tabCount2 = topTabProtocolList.size();
                } else {
                    tabCount2 = this.LLJJJJ.getTabCount();
                }
                if (C0S4G.LIZ() && !C296130Bj9.LIZ()) {
                    int tabPadding = this.LLJJJJ.getTabPadding() / 2;
                    View childAt = getChildAt(this.LLILZLL);
                    if ((childAt instanceof C1592080rX4) && (c1592080rX4 = (C1592080rX4) childAt) != null && (customTextView = c1592080rX4.getCustomTextView()) != null) {
                        paddingLeft = customTextView.getPaddingLeft();
                        paddingRight = customTextView.getPaddingRight();
                    } else {
                        paddingRight = 0;
                        paddingLeft = 0;
                    }
                    if (childAt != null && (paddingLeft <= 0 || paddingRight <= 0)) {
                        int width = childAt.getWidth() - this.LLJJJJ.getTabPadding();
                        C1592450rXf c1592450rXf = this.LLJJJJ;
                        if (width >= c1592450rXf.LLJJIJI) {
                            if (this.LLILZLL == 0) {
                                if (getLayoutDirection() == 1) {
                                    f3 = tabPadding * this.LLIZ;
                                    f7 += f3;
                                    f8 += f3;
                                } else {
                                    f4 = (1 - this.LLIZ) * tabPadding;
                                    f7 -= f4;
                                    f8 -= f4;
                                }
                            } else {
                                C1591980rWu c1591980rWu = c1592450rXf.LLILLJJLI;
                                if (c1591980rWu != null && c1591980rWu.LIZ == tabCount2 - 1) {
                                    if (getLayoutDirection() == 1) {
                                        f4 = tabPadding;
                                        f7 -= f4;
                                        f8 -= f4;
                                    } else {
                                        f3 = tabPadding;
                                        f7 += f3;
                                        f8 += f3;
                                    }
                                }
                            }
                        }
                    }
                    if (this.LLJJJIL > 0.0f) {
                        float height = this.LLJJJ + (getHeight() - this.LL);
                        float height2 = this.LLJJJ + getHeight();
                        float f9 = this.LLJJJIL;
                        canvas2.drawRoundRect(f7, height, f8, height2, f9, f9, this.LLILZIL);
                    } else {
                        canvas2.drawRect(f7, this.LLJJJ + (getHeight() - this.LL), f8, this.LLJJJ + getHeight(), this.LLILZIL);
                    }
                }
            }
        } else {
            int i5 = this.LLIZLLLIL;
            if (i5 >= 0 && (i = this.LLJ) > i5) {
                float f10 = i5;
                float f11 = this.LLJILJILJ;
                float f12 = f10 + f11;
                float f13 = i - f11;
                List<TopTabProtocol> topTabProtocolList2 = this.LLJJJJ.getTopTabProtocolList();
                if (topTabProtocolList2 != null) {
                    tabCount = topTabProtocolList2.size();
                } else {
                    tabCount = this.LLJJJJ.getTabCount();
                }
                if (C0S4G.LIZ() && !C296130Bj9.LIZ()) {
                    int tabPadding2 = this.LLJJJJ.getTabPadding() / 2;
                    if (this.LLILZLL == 0) {
                        if (getLayoutDirection() == 1) {
                            f = tabPadding2 * this.LLIZ;
                            f12 += f;
                            f13 += f;
                        } else {
                            f2 = (1 - this.LLIZ) * tabPadding2;
                            f12 -= f2;
                            f13 -= f2;
                        }
                    } else {
                        C1591980rWu c1591980rWu2 = this.LLJJJJ.LLILLJJLI;
                        if (c1591980rWu2 != null && c1591980rWu2.LIZ == tabCount - 1) {
                            if (getLayoutDirection() == 1) {
                                f2 = tabPadding2;
                                f12 -= f2;
                                f13 -= f2;
                            } else {
                                f = tabPadding2;
                                f12 += f;
                                f13 += f;
                            }
                        }
                    }
                }
                if (this.LLJJJIL > 0.0f) {
                    float height3 = this.LLJJJ + (getHeight() - this.LL);
                    float height4 = this.LLJJJ + getHeight();
                    float f14 = this.LLJJJIL;
                    canvas2.drawRoundRect(f12, height3, f13, height4, f14, f14, this.LLILZIL);
                } else {
                    canvas2.drawRect(f12, this.LLJJJ + (getHeight() - this.LL), f13, this.LLJJJ + getHeight(), this.LLILZIL);
                }
            }
        }
        int childCount = getChildCount();
        if (childCount > 1 && this.LLJJIJIL != null) {
            if (getLayoutDirection() == 1) {
                childCount--;
                i2 = 0;
            } else {
                i2 = 1;
            }
            while (i2 < childCount) {
                float height5 = getHeight();
                C443120HZe<Float, Float, ? extends Paint> c443120HZe = this.LLJJIJIL;
                if (c443120HZe != null) {
                    fFloatValue = c443120HZe.getSecond().floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                float f15 = 2;
                float f16 = (height5 - fFloatValue) / f15;
                View childAt2 = getChildAt(i2);
                C443120HZe<Float, Float, ? extends Paint> c443120HZe2 = this.LLJJIJIL;
                if (c443120HZe2 != null) {
                    fFloatValue2 = c443120HZe2.getFirst().floatValue();
                } else {
                    fFloatValue2 = 0.0f;
                }
                float left = childAt2.getLeft() - (fFloatValue2 / f15);
                float left2 = childAt2.getLeft();
                C443120HZe<Float, Float, ? extends Paint> c443120HZe3 = this.LLJJIJIL;
                if (c443120HZe3 != null) {
                    fFloatValue3 = c443120HZe3.getFirst().floatValue();
                } else {
                    fFloatValue3 = 0.0f;
                }
                float f18 = fFloatValue3 + left2;
                C443120HZe<Float, Float, ? extends Paint> c443120HZe4 = this.LLJJIJIL;
                if (c443120HZe4 != null) {
                    fFloatValue4 = c443120HZe4.getSecond().floatValue();
                } else {
                    fFloatValue4 = 0.0f;
                }
                float f19 = f16 + fFloatValue4;
                C443120HZe<Float, Float, ? extends Paint> c443120HZe5 = this.LLJJIJIL;
                if (c443120HZe5 != null) {
                    third = c443120HZe5.getThird();
                } else {
                    third = null;
                }
                canvas2.drawRect(left, f16, f18, f19, third);
                i2++;
            }
        }
        if (this.LLILZ > 0.0f && this.LLJJIJIIJIL > 0) {
            Paint paint = this.LLJJIII;
            if (paint != null) {
                paint.setXfermode(this.LLJJIJI);
            }
            canvas2.save();
            canvas2.translate(this.LLJJJJ.getScrollX(), 0.0f);
            if (this.LLJJJJ.canScrollHorizontally(-1)) {
                Paint paint2 = this.LLJJIII;
                if (paint2 != null) {
                    int gradientWidth3 = this.LLJJJJ.getGradientWidth();
                    C1592450rXf c1592450rXf2 = this.LLJJJJ;
                    if (gradientWidth3 == c1592450rXf2.LLL && c1592450rXf2.LLJJJJ) {
                        linearGradient = this.LLJJ;
                    } else {
                        linearGradient = this.LLJILLL;
                    }
                    paint2.setShader(linearGradient);
                }
                if (C444960Hcc.LIZIZ()) {
                    gradientWidth = this.LLJJJJ.getGradientWidth();
                } else {
                    gradientWidth = 0;
                }
                if (this.LLJJIII != null) {
                    canvas2 = canvas2;
                    canvas2.drawRect(0.0f, 0.0f, this.LLILZ + gradientWidth, getHeight(), this.LLJJIII);
                }
            }
            if (this.LLJJJJ.canScrollHorizontally(1)) {
                int iLJIIIZ = this.LLJJJJ.LJIIIZ(4);
                if (!C444960Hcc.LIZIZ()) {
                    gradientWidth2 = this.LLJJJJ.getGradientWidth();
                }
                int i6 = iLJIIIZ + gradientWidth2;
                canvas2.translate((this.LLJJJJ.getWidth() - this.LLILZ) - gradientWidth2, 0.0f);
                Paint paint3 = this.LLJJIII;
                if (paint3 != null) {
                    paint3.setShader(this.LLJJI);
                }
                if (this.LLJJIII != null) {
                    canvas2.drawRect(0.0f, 0.0f, this.LLILZ + i6, getHeight(), this.LLJJIII);
                }
            }
            Paint paint4 = this.LLJJIII;
            if (paint4 != null) {
                paint4.setXfermode(null);
            }
            canvas2.restore();
            canvas2.restoreToCount(this.LLJJIJIIJIL);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = -1;
        if (this.LLJJJJ.getMMode() == 0 && this.LLILZ > 0.0f) {
            C1592450rXf c1592450rXf = this.LLJJJJ;
            if (c1592450rXf.canScrollHorizontally(-1) || c1592450rXf.canScrollHorizontally(1)) {
                iSaveLayer = canvas.saveLayer(this.LLJJJJ.getScrollX(), 0.0f, this.LLJJJJ.getScrollX() + getWidth(), getHeight(), this.LLJJIII, 31);
            }
        }
        this.LLJJIJIIJIL = iSaveLayer;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_ALPHA;
        if (C2180571AVr.LIZIZ(enumC2180541AVo, Float.valueOf(f))) {
            super.setAlpha(f);
            return;
        }
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Float.valueOf(f));
        super.setAlpha(f);
        C2180551AVp.LIZ(enumC2180541AVo, this, Float.valueOf(f));
    }

    public final void setBarrierTriple(C443120HZe<Float, Float, ? extends Paint> c443120HZe) {
        this.LLJJIJIL = c443120HZe;
    }

    public final void setIndicatorLineCorner(float f) {
        this.LLJJJIL = f;
    }

    public final void setLeftGradientRTL(LinearGradient linearGradient) {
        this.LLJJ = linearGradient;
    }

    public final void setMDuffXferMode(PorterDuffXfermode porterDuffXfermode) {
        this.LLJJIJI = porterDuffXfermode;
    }

    public final void setMIsDragged(boolean z) {
        this.LLJILJIL = z;
    }

    public final void setMLayerId(int i) {
        this.LLJJIJIIJIL = i;
    }

    public final void setMLeftGradient(LinearGradient linearGradient) {
        this.LLJILLL = linearGradient;
    }

    public final void setMOverBorderPaint(Paint paint) {
        this.LLJJIII = paint;
    }

    public final void setMRightGradient(LinearGradient linearGradient) {
        this.LLJJI = linearGradient;
    }

    public final void setMSelectedPosition(int i) {
        this.LLILZLL = i;
    }

    public final void setMSelectionOffset(float f) {
        this.LLIZ = f;
    }

    public final void setOverBorderWidth(float f) {
        this.LLILZ = f;
        float fLJIIIZ = f + this.LLJJJJ.LJIIIZ(4);
        int i = this.LLJJJJ.LLL;
        float f2 = this.LLILZ;
        float f3 = i / (i + f2);
        if (f2 > 0.0f) {
            this.LLJILLL = new LinearGradient(0.0f, 0.0f, f, 0.0f, new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.LLJJ = new LinearGradient(0.0f, 0.0f, f + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), 0.0f, new int[]{0, 0, -16777216}, new float[]{0.0f, f3, 1.0f}, Shader.TileMode.CLAMP);
            this.LLJJI = new LinearGradient(0.0f, 0.0f, fLJIIIZ, 0.0f, new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.LLJJIJIIJIL = -1;
            if (this.LLJJIII == null) {
                this.LLJJIII = new Paint(1);
            }
            if (this.LLJJIJI == null) {
                this.LLJJIJI = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
            }
        }
    }

    public final void setSelectedIndicatorColor(int i) {
        if (this.LLILZIL.getColor() != i) {
            this.LLILZIL.setColor(i);
            postInvalidateOnAnimation();
        }
    }

    public final void setSelectedIndicatorHeight(int i) {
        if (this.LL != i) {
            this.LL = i;
            postInvalidateOnAnimation();
        }
    }

    public final void setSelectedTabHorizontalPadding(int i) {
        this.LLJILJILJ = i;
    }

    public final void setStripMargin(float f) {
        this.LLJJJ = f;
    }

    public final void setTabStripMargin(float f) {
        this.LLJJJ = f;
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        Map<EnumC2180541AVo, InterfaceC2180591AVt<?>> map = C2180551AVp.LIZ;
        EnumC2180541AVo enumC2180541AVo = EnumC2180541AVo.V_VISIBLITY;
        C2180551AVp.LIZIZ(enumC2180541AVo, this, Integer.valueOf(i));
        super.setVisibility(i);
        C2180551AVp.LIZ(enumC2180541AVo, this, Integer.valueOf(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1592460rXg(C1592450rXf c1592450rXf, Context context) {
        super(context);
        this.LLJJJJ = c1592450rXf;
        this.LLILZLL = -1;
        this.LLIZLLLIL = -1;
        this.LLJ = -1;
        this.LLJIJIL = Integer.MAX_VALUE;
        this.LLJJIJIIJIL = -1;
        this.LLJJJIL = -1.0f;
        setWillNotDraw(false);
        this.LLILZIL = new Paint();
    }

    public final void LIZIZ(final int i, int i2) {
        int iLIZLLL;
        int iLJFF;
        final int i3;
        final int i4;
        int i5;
        int i6;
        ValueAnimator valueAnimator = this.LLJI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LLJI.cancel();
        }
        View childAt = getChildAt(i);
        if (childAt == null) {
            LJII();
            return;
        }
        final C118300cf c118300cf = new C118300cf();
        c118300cf.element = childAt.getLeft();
        final C118300cf c118300cf2 = new C118300cf();
        c118300cf2.element = childAt.getRight();
        if (this.LLJJJJ.LLJJJJ) {
            iLIZLLL = LJ(i);
            iLJFF = LJFF(i, iLIZLLL);
            if (i == 0) {
                iLIZLLL += this.LLJJJJ.getTabPadding();
            }
        } else {
            iLIZLLL = LIZLLL(i);
            iLJFF = LJFF(i, iLIZLLL);
        }
        if (iLIZLLL >= 0) {
            c118300cf.element = iLIZLLL;
            c118300cf2.element = iLJFF;
        }
        C1592630rXx tabAnimationHelper = this.LLJJJJ.getTabAnimationHelper();
        if (Math.abs(i - this.LLILZLL) > 1 && tabAnimationHelper == null && !C1581510rG1.LIZ()) {
            int iLJIIIZ = this.LLJJJJ.LJIIIZ(24);
            if (i < this.LLILZLL) {
                C1592450rXf c1592450rXf = this.LLJJJJ;
                c1592450rXf.getClass();
                C1591790rWb.LIZ();
                if (c1592450rXf.LLJJJJ) {
                    i5 = c118300cf.element;
                    i4 = i5 - iLJIIIZ;
                } else {
                    i6 = c118300cf2.element;
                    i4 = i6 + iLJIIIZ;
                }
            } else {
                C1592450rXf c1592450rXf2 = this.LLJJJJ;
                c1592450rXf2.getClass();
                C1591790rWb.LIZ();
                if (c1592450rXf2.LLJJJJ) {
                    i6 = c118300cf2.element;
                    i4 = i6 + iLJIIIZ;
                } else {
                    i5 = c118300cf.element;
                    i4 = i5 - iLJIIIZ;
                }
            }
            i3 = i4;
        } else {
            i3 = this.LLIZLLLIL;
            i4 = this.LLJ;
        }
        if (i3 != c118300cf.element || i4 != c118300cf2.element) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.LLJI = valueAnimator2;
            valueAnimator2.setInterpolator(C1592450rXf.LLLJIL);
            valueAnimator2.setDuration(i2);
            valueAnimator2.setFloatValues(0.0f, 1.0f);
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0rXl
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    float animatedFraction = valueAnimator3.getAnimatedFraction();
                    if (this.LL.LLILLJJLI > 0) {
                        int iAbs = Math.abs(c118300cf2.element - c118300cf.element) / 2;
                        C1591790rWb.LIZ();
                        C118300cf c118300cf3 = c118300cf;
                        int i7 = c118300cf3.element + iAbs;
                        int i8 = this.LL.LLILLL;
                        if (i7 >= i8) {
                            c118300cf3.element = i7 - i8;
                            C118300cf c118300cf4 = c118300cf2;
                            c118300cf4.element = (c118300cf4.element - iAbs) + i8;
                        }
                    }
                    C1592460rXg c1592460rXg = this.LL;
                    int i9 = i3;
                    int i10 = c118300cf.element;
                    c1592460rXg.getClass();
                    int iRound = i9 + Math.round((i10 - i9) * animatedFraction);
                    C1592460rXg c1592460rXg2 = this.LL;
                    int i11 = i4;
                    int i12 = c118300cf2.element;
                    c1592460rXg2.getClass();
                    int iRound2 = i11 + Math.round(animatedFraction * (i12 - i11));
                    if (iRound != c1592460rXg.LLIZLLLIL || iRound2 != c1592460rXg.LLJ) {
                        c1592460rXg.LLIZLLLIL = iRound;
                        c1592460rXg.LLJ = iRound2;
                        c1592460rXg.postInvalidateOnAnimation();
                    }
                }
            });
            final C1592450rXf c1592450rXf3 = this.LLJJJJ;
            valueAnimator2.addListener(new AnimatorListenerAdapter() { // from class: X.0rXn
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    this.LL.setMSelectedPosition(i);
                    this.LL.setMSelectionOffset(0.0f);
                    C1592450rXf c1592450rXf4 = c1592450rXf3;
                    c1592450rXf4.setSelectedScrollX(c1592450rXf4.getTabStripScrollX());
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    this.LL.setMSelectedPosition(i);
                }
            });
            valueAnimator2.start();
        }
    }

    public final int LIZJ(int i, int i2) {
        TuxIconView tuxIconView;
        int width;
        Integer numValueOf;
        int i3;
        Drawable drawable;
        TuxIconDrawable tuxIconDrawable;
        Object obj;
        int iLIZJ;
        Drawable[] compoundDrawables;
        View childAt = getChildAt(i);
        Integer numValueOf2 = null;
        if (childAt != null) {
            tuxIconView = (TuxIconView) childAt.findViewById(R.id.jqj);
        } else {
            tuxIconView = null;
        }
        if (childAt != null) {
            width = childAt.getWidth();
        } else {
            width = 0;
        }
        if (childAt instanceof C1592080rX4) {
            if (this.LLJJJJ.LLJJJJ) {
                i3 = 0;
            } else {
                i3 = 2;
            }
            C1592080rX4 c1592080rX4 = (C1592080rX4) childAt;
            TextView mCustomTextView$homepage_common_release = c1592080rX4.getMCustomTextView$homepage_common_release();
            if (mCustomTextView$homepage_common_release != null && (compoundDrawables = mCustomTextView$homepage_common_release.getCompoundDrawables()) != null) {
                drawable = (Drawable) C13LQ.LJJIIZ(i3, compoundDrawables);
            } else {
                drawable = null;
            }
            if ((drawable instanceof TuxIconDrawable) && (tuxIconDrawable = (TuxIconDrawable) drawable) != null) {
                C1591980rWu tab = c1592080rX4.getTab();
                if (tab != null) {
                    obj = tab.LJ;
                } else {
                    obj = null;
                }
                if (Intrinsics.LJFF(obj, "FRIENDS_FEED")) {
                    iLIZJ = this.LLJJJJ.LLLFZ;
                } else {
                    iLIZJ = tuxIconDrawable.LIZJ();
                }
                width -= iLIZJ;
            }
        }
        if (tuxIconView != null && tuxIconView.getVisibility() == 0) {
            width -= tuxIconView.getWidth();
        }
        if (Math.abs(i2 - i) > 1 && tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getTabViewLeft, visibility: left:");
        sbLIZ.append(width);
        sbLIZ.append(", ");
        if (tuxIconView != null) {
            numValueOf = Integer.valueOf(tuxIconView.getVisibility());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", ");
        if (tuxIconView != null) {
            numValueOf2 = Integer.valueOf(tuxIconView.getWidth());
        }
        sbLIZ.append(numValueOf2);
        C2188811AlT.LIZIZ(sbLIZ);
        return width;
    }

    public final int LJFF(int i, int i2) {
        int width;
        InterfaceC1583070rIX interfaceC1583070rIX;
        C1591980rWu c1591980rWuLJIILIIL = this.LLJJJJ.LJIILIIL(i);
        KeyEvent.Callback callback = null;
        if (c1591980rWuLJIILIIL != null) {
            callback = c1591980rWuLJIILIIL.LIZIZ;
        }
        if ((callback instanceof InterfaceC1583070rIX) && (interfaceC1583070rIX = (InterfaceC1583070rIX) callback) != null) {
            width = interfaceC1583070rIX.LIZ();
        } else {
            View childAt = getChildAt(i);
            if (childAt != null) {
                width = childAt.getWidth();
            } else {
                width = 0;
            }
        }
        return i2 + width;
    }

    public final void LJI(int i, float f) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (!C1581510rG1.LIZ() && (valueAnimator = this.LLJI) != null && valueAnimator.isRunning() && (valueAnimator2 = this.LLJI) != null) {
            valueAnimator2.cancel();
        }
        this.LLILZLL = i;
        this.LLIZ = f;
        LJII();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        boolean z;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        int childCount = getChildCount();
        int iMax = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
                this.LLJIJIL = Math.min(this.LLJIJIL, childAt.getMeasuredWidth());
            }
        }
        if (this.LLJJJJ.getMMode() == 1 && this.LLJJJJ.getMTabGravity() == 1) {
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (this.LLJJJJ.LJIIIZ(16) * 2)) {
                boolean z2 = false;
                for (int i4 = 0; i4 < childCount; i4++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z2 = true;
                    }
                }
                if (!z2) {
                    return;
                }
            } else {
                this.LLJJJJ.setMTabGravity(0);
                this.LLJJJJ.LJJIIJ(false);
            }
            super.onMeasure(i, i2);
            return;
        }
        if (this.LLJJJJ.getMMode() == 0) {
            C1592450rXf c1592450rXf = this.LLJJJJ;
            if (!c1592450rXf.LLJILJIL || c1592450rXf.LLJJIII != getResources().getConfiguration().orientation || iMax <= 0) {
                return;
            }
            int measuredWidth2 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt2 = getChildAt(i5);
                if (childAt2.getVisibility() != 8) {
                    measuredWidth2 += childAt2.getMeasuredWidth();
                }
            }
            if (measuredWidth2 > 0 && measuredWidth2 < (measuredWidth = (this.LLJJJJ.getMeasuredWidth() - this.LLJJJJ.LLILLL.getPaddingLeft()) - this.LLJJJJ.LLILLL.getPaddingRight())) {
                if (iMax * childCount < measuredWidth) {
                    z = false;
                    for (int i6 = 0; i6 < childCount; i6++) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) getChildAt(i6).getLayoutParams();
                        if (layoutParams2.width != 0 || layoutParams2.weight != 1.0f) {
                            layoutParams2.width = 0;
                            layoutParams2.weight = 1.0f;
                            z = true;
                        }
                    }
                } else {
                    int i7 = (measuredWidth - measuredWidth2) / (childCount * 2);
                    z = false;
                    for (int i8 = 0; i8 < childCount; i8++) {
                        if (getChildAt(i8).getVisibility() != 8) {
                            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) getChildAt(i8).getLayoutParams();
                            layoutParams3.leftMargin = i7;
                            layoutParams3.rightMargin = i7;
                            z = true;
                        }
                    }
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AnimatorSet animatorSet;
        long duration;
        float animatedFraction;
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.LLJI;
        boolean z2 = true;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            C1591700rWS c1591700rWS = this.LLJJJJ.LLLIIIL;
            if (c1591700rWS != null && ((animatorSet = c1591700rWS.LJII) == null || !animatorSet.isRunning())) {
                ValueAnimator valueAnimator2 = this.LLJI;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = this.LLJI;
                if (valueAnimator3 != null) {
                    duration = valueAnimator3.getDuration();
                } else {
                    duration = 200;
                }
                int i5 = this.LLILZLL;
                ValueAnimator valueAnimator4 = this.LLJI;
                if (valueAnimator4 != null) {
                    animatedFraction = valueAnimator4.getAnimatedFraction();
                } else {
                    animatedFraction = 0.0f;
                }
                LIZIZ(i5, Math.round((1.0f - animatedFraction) * duration));
            }
        } else {
            LJII();
        }
        C1592450rXf c1592450rXf = this.LLJJJJ;
        if (c1592450rXf.getMeasuredWidth() >= getMeasuredWidth()) {
            z2 = false;
        }
        c1592450rXf.setTouchable(z2);
    }
}
