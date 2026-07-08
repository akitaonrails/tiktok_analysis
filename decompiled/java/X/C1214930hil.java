package X;

import Y.ALAdapterS14S0200000_19;
import Y.AUListenerS226S0200000_19;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.RadiusLayout;
import com.google.android.flexbox.FlexboxLayout$LayoutParams;
import com.zhiliaoapp.musically.R;
import irm.AkS88S0100000_19;
import irm.AkS9S0201000_19;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0hil, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1214930hil extends FrameLayout {
    public final C21532619Oq LL;
    public List<? extends C1226110i0n<?>> LLILLJJLI;
    public List<Integer> LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final int LLJILJIL;
    public boolean LLJILJILJ;
    public final C01GW LLJILLL;
    public Function2<? super C1226110i0n<?>, ? super Integer, Unit> LLJJ;

    private final int getAvailableWidth() {
        int width = (this.LL.getWidth() - this.LL.getPaddingLeft()) - this.LL.getPaddingRight();
        if (width < 0) {
            return 0;
        }
        return width;
    }

    private final C1361400lX0 getDarkThemeCtx() {
        return (C1361400lX0) this.LLJILLL.getValue();
    }

    private final List<Integer> getMeasuredWidths() {
        List<Integer> list = this.LLILLL;
        if (list != null) {
            return list;
        }
        List<? extends C1226110i0n<?>> list2 = this.LLILLJJLI;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<? extends C1226110i0n<?>> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(LJFF(it2.next().LIZ)));
        }
        this.LLILLL = arrayList;
        return arrayList;
    }

    public final RadiusLayout LIZLLL() {
        RadiusLayout radiusLayout = new RadiusLayout(getContext(), null, 6);
        FlexboxLayout$LayoutParams flexboxLayout$LayoutParams = new FlexboxLayout$LayoutParams(this.LLJIJIL, this.LLJILJIL);
        flexboxLayout$LayoutParams.setMargins(0, 0, 0, this.LLJ);
        C786410Ut5.b7(radiusLayout, flexboxLayout$LayoutParams);
        radiusLayout.setRadius(C418440Gaw.LIZIZ(8));
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a1c, radiusLayout.getContext());
        radiusLayout.setBackground(c384050F3z.LIZ(radiusLayout.getContext()));
        TuxIconView tuxIconView = new TuxIconView(getContext(), null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        layoutParams.gravity = 17;
        C786410Ut5.M6(tuxIconView, layoutParams);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = this.LLILZLL ? R.raw.icon_chevron_up : R.raw.icon_chevron_down;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1h, tuxIconView.getContext());
        tuxIconView.setTuxIcon(c419910GdJ);
        radiusLayout.addView(tuxIconView);
        LJ(this.LLJIJIL, this.LLJILJIL, radiusLayout);
        C786410Ut5.I7(new AkS88S0100000_19(this, 10), radiusLayout);
        return radiusLayout;
    }

    public final void LJI() {
        int width;
        int i;
        C786410Ut5.LJJJJZI(this.LL);
        if (!this.LLILLJJLI.isEmpty() && this.LLILZ && (width = (this.LL.getWidth() - this.LL.getPaddingLeft()) - this.LL.getPaddingRight()) > 0) {
            List<Integer> measuredWidths = getMeasuredWidths();
            int i2 = 1;
            if (!this.LLILZIL) {
                this.LL.setFlexWrap(1);
                int size = measuredWidths.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    int iIntValue = ((Number) ListProtector.get(measuredWidths, i4)).intValue();
                    int i5 = i3 == 0 ? iIntValue : this.LLIZLLLIL + iIntValue;
                    if (iIntValue <= width) {
                        i3 += i5;
                        if (i3 <= width) {
                            this.LL.addView(LIZIZ((C1226110i0n) ListProtector.get(this.LLILLJJLI, i4), i4, false));
                        } else {
                            i2++;
                            if (i2 > 10) {
                                return;
                            }
                            this.LL.addView(LIZIZ((C1226110i0n) ListProtector.get(this.LLILLJJLI, i4), i4, false));
                            i3 = iIntValue;
                        }
                    } else {
                        if (i3 != 0 && (i2 = i2 + 1) > 10) {
                            return;
                        }
                        this.LL.addView(LIZJ(this, (C1226110i0n) ListProtector.get(this.LLILLJJLI, i4), width, i4, false, 24));
                        i3 = width;
                    }
                }
                return;
            }
            if (this.LLILZLL) {
                int i6 = 1;
                this.LL.setFlexWrap(1);
                int size2 = measuredWidths.size();
                int i7 = 1;
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    if (i9 >= size2) {
                        break;
                    }
                    boolean z = i9 == measuredWidths.size() - i6;
                    if (i7 == 10) {
                        i6 = 0;
                    }
                    int i10 = z ? (width - this.LLJIJIL) - this.LLIZLLLIL : width;
                    int iIntValue2 = ((Number) ListProtector.get(measuredWidths, i9)).intValue();
                    int i11 = i8 == 0 ? iIntValue2 : this.LLIZLLLIL + iIntValue2;
                    if (iIntValue2 <= i10) {
                        i = i11 + i8;
                        if (i <= i10) {
                            this.LL.addView(LIZIZ((C1226110i0n) ListProtector.get(this.LLILLJJLI, i9), i9, false));
                            i8 = i;
                        } else if (!z) {
                            i7++;
                            if (i7 > 10) {
                                break;
                            }
                            this.LL.addView(LIZIZ((C1226110i0n) ListProtector.get(this.LLILLJJLI, i9), i9, false));
                            i8 = iIntValue2;
                        } else if (i6 != 0) {
                            this.LL.addView(LIZIZ((C1226110i0n) ListProtector.get(this.LLILLJJLI, i9), i9, true));
                        } else {
                            this.LL.addView(LIZJ(this, (C1226110i0n) ListProtector.get(this.LLILLJJLI, i9), i10 - i8, i9, false, 24));
                        }
                    } else {
                        if (i8 != 0 && (i7 = i7 + 1) > 10) {
                            break;
                        }
                        this.LL.addView(LIZJ(this, (C1226110i0n) ListProtector.get(this.LLILLJJLI, i9), width, i9, z, 16));
                        i = width;
                        i8 = i;
                    }
                    i9++;
                    i6 = 1;
                }
                this.LL.addView(LIZLLL());
                return;
            }
            this.LL.setFlexWrap(1);
            int width2 = (this.LL.getWidth() - this.LL.getPaddingLeft()) - this.LL.getPaddingRight();
            Iterator<Integer> it2 = measuredWidths.iterator();
            int i12 = 1;
            loop1: while (true) {
                int i13 = 0;
                while (it2.hasNext()) {
                    int iIntValue3 = it2.next().intValue();
                    int i14 = i13 == 0 ? iIntValue3 : this.LLIZLLLIL + iIntValue3;
                    int i15 = i12 == this.LLIZ ? (width2 - this.LLJIJIL) - this.LLIZLLLIL : width2;
                    if (iIntValue3 > i15) {
                        break;
                    }
                    i13 += i14;
                    if (i13 >= i15) {
                        i12++;
                        i13 = iIntValue3;
                    }
                }
                i12++;
            }
            if (i12 <= this.LLIZ) {
                int size3 = measuredWidths.size();
                int i16 = 0;
                for (int i17 = 0; i17 < size3; i17++) {
                    int iIntValue4 = ((Number) ListProtector.get(measuredWidths, i17)).intValue();
                    int i18 = i16 == 0 ? iIntValue4 : this.LLIZLLLIL + iIntValue4;
                    if (iIntValue4 > width) {
                        this.LL.addView(LIZJ(this, (C1226110i0n) ListProtector.get(this.LLILLJJLI, i17), width, i17, false, 24));
                        i16 = width;
                    } else {
                        i16 += i18;
                        if (i16 <= width) {
                            this.LL.addView(LIZIZ((C1226110i0n) ListProtector.get(this.LLILLJJLI, i17), i17, false));
                        } else {
                            this.LL.addView(LIZIZ((C1226110i0n) ListProtector.get(this.LLILLJJLI, i17), i17, false));
                            i16 = iIntValue4;
                        }
                    }
                }
                return;
            }
            int size4 = measuredWidths.size();
            int i19 = 1;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                if (i21 >= size4 || i19 > this.LLIZ) {
                    break;
                }
                int iIntValue5 = ((Number) ListProtector.get(measuredWidths, i21)).intValue();
                int i23 = (i20 == 0 ? 0 : this.LLIZLLLIL) + iIntValue5;
                int i24 = this.LLIZ;
                if (i19 == i24) {
                    int i25 = (i20 == 0 ? 0 : this.LLIZLLLIL) + this.LLJIJIL;
                    int i26 = width - i25;
                    int i27 = i23 + i20;
                    int i28 = i25 + i27;
                    if (i28 > width && i20 != 0) {
                        break;
                    }
                    if (iIntValue5 <= i26) {
                        if (i28 >= width) {
                            break;
                        }
                        this.LL.addView(LIZIZ((C1226110i0n) ListProtector.get(this.LLILLJJLI, i21), i21, false));
                        i22++;
                        i20 = i27;
                        i21++;
                    } else {
                        if (i26 < 0) {
                            i26 = 0;
                        }
                        this.LL.addView(LIZJ(this, (C1226110i0n) ListProtector.get(this.LLILLJJLI, i21), i26, i21, true, 16));
                        i22++;
                    }
                } else {
                    if (iIntValue5 > width) {
                        this.LL.addView(LIZJ(this, (C1226110i0n) ListProtector.get(this.LLILLJJLI, i21), width, i21, false, 24));
                        i19++;
                        i22++;
                    } else {
                        i20 += i23;
                        if (i20 >= width) {
                            i19++;
                            if (i19 > i24) {
                                break;
                            }
                            int i29 = width - (this.LLJIJIL + this.LLIZLLLIL);
                            if (i19 != i24 || i29 >= i23) {
                                this.LL.addView(LIZIZ((C1226110i0n) ListProtector.get(this.LLILLJJLI, i21), i21, false));
                            } else {
                                this.LL.addView(LIZJ(this, (C1226110i0n) ListProtector.get(this.LLILLJJLI, i21), i29, i21, false, 24));
                            }
                            i22++;
                            i20 = iIntValue5;
                        } else {
                            this.LL.addView(LIZIZ((C1226110i0n) ListProtector.get(this.LLILLJJLI, i21), i21, false));
                            i22++;
                            Integer num = (Integer) C13LP.LJJJLZIJ(i21 + 1, measuredWidths);
                            if (num != null && num.intValue() + this.LLIZLLLIL + i20 >= width) {
                                i19++;
                            }
                        }
                        i21++;
                    }
                    i20 = 0;
                    i21++;
                }
            }
            if (i22 == 0) {
                int i30 = (width - this.LLIZLLLIL) - this.LLJIJIL;
                if (i30 < 0) {
                    i30 = 0;
                }
                this.LL.addView(LIZJ(this, (C1226110i0n) C13LP.LJJJJZI(this.LLILLJJLI), i30, 0, false, 24));
            }
            this.LL.addView(LIZLLL());
        }
    }

    public final void LJII() {
        C21532619Oq c21532619Oq = this.LL;
        int i = 1;
        if (!this.LLILZLL && this.LLIZ <= 1 && this.LLILZIL) {
            i = 0;
        }
        c21532619Oq.setFlexWrap(i);
    }

    public final int LJFF(String str) {
        int iIntValue;
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView.setText(str);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getDarkThemeCtx());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        tuxTextView.setTextColor(iIntValue);
        tuxTextView.setTuxFont(41);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(null);
        int i = this.LLJI;
        tuxTextView.setPadding(i, 0, i, 0);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a1c, getDarkThemeCtx());
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
        tuxTextView.setBackground(c384050F3z.LIZ(getDarkThemeCtx()));
        tuxTextView.setGravity(17);
        tuxTextView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(this.LLJILJIL, 1073741824));
        return tuxTextView.getMeasuredWidth();
    }

    public final void setCollapseMaxLines(int i) {
        if (i < 1) {
            i = 1;
        }
        this.LLIZ = i;
        LJII();
        LJI();
    }

    public final void setDataSource(List<? extends C1226110i0n<?>> list) {
        this.LLILLJJLI = list;
        this.LLILLL = null;
        LJII();
        LJI();
    }

    public final void setEnableToggleChip(boolean z) {
        this.LLILZIL = z;
        if (!z) {
            this.LLILZLL = true;
        }
        LJII();
        LJI();
    }

    public final void setOnChipClickListener(Function2<? super C1226110i0n<?>, ? super Integer, Unit> function2) {
        this.LLJJ = function2;
    }

    public C1214930hil(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C21532619Oq c21532619Oq = new C21532619Oq(context, null);
        c21532619Oq.setFlexWrap(0);
        c21532619Oq.setAlignItems(2);
        c21532619Oq.setJustifyContent(0);
        C786410Ut5.d7(c21532619Oq, new FrameLayout.LayoutParams(-1, -2));
        c21532619Oq.setPadding(0, 0, 0, 0);
        this.LL = c21532619Oq;
        this.LLILLJJLI = C13BV.INSTANCE;
        this.LLILZIL = true;
        this.LLIZ = 2;
        this.LLIZLLLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        this.LLJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        this.LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        this.LLJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        this.LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
        this.LLJILLL = C452501pT.LIZIZ(new AwS563S0100000_19(context, 3289));
        addView(c21532619Oq);
        C786410Ut5.x3(getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1265990j37(this, 9));
    }

    public final void LIZ(int i, int i2) {
        if (i != i2 && i > 0 && i2 > 0 && !this.LLJILJILJ) {
            this.LLJILJILJ = true;
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = i;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfInt.addUpdateListener(new AUListenerS226S0200000_19(layoutParams, this, 0));
            valueAnimatorOfInt.addListener(new ALAdapterS14S0200000_19(this, layoutParams, 0));
            valueAnimatorOfInt.start();
        }
    }

    public static void LJ(int i, int i2, View view) {
        try {
            view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final TuxTextView LIZIZ(C1226110i0n c1226110i0n, int i, boolean z) {
        int iIntValue;
        FlexboxLayout$LayoutParams flexboxLayout$LayoutParams = new FlexboxLayout$LayoutParams(LJFF(c1226110i0n.LIZ), this.LLJILJIL);
        flexboxLayout$LayoutParams.setMargins(0, 0, this.LLIZLLLIL, this.LLJ);
        if (z) {
            flexboxLayout$LayoutParams.LIZIZ();
        }
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView.setText(c1226110i0n.LIZ);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getDarkThemeCtx());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        tuxTextView.setTextColor(iIntValue);
        tuxTextView.setTuxFont(41);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(null);
        int i2 = this.LLJI;
        tuxTextView.setPadding(i2, 0, i2, 0);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a1c, getDarkThemeCtx());
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
        tuxTextView.setBackground(c384050F3z.LIZ(getDarkThemeCtx()));
        tuxTextView.setGravity(17);
        C786410Ut5.R6(tuxTextView, flexboxLayout$LayoutParams);
        C786410Ut5.I7(new AkS9S0201000_19(this, c1226110i0n, i, 0), tuxTextView);
        LJ(((ViewGroup.MarginLayoutParams) flexboxLayout$LayoutParams).width, this.LLJILJIL, tuxTextView);
        return tuxTextView;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0) {
            this.LLILLL = null;
            LJI();
        }
    }

    public static TuxTextView LIZJ(C1214930hil c1214930hil, C1226110i0n c1226110i0n, int i, int i2, boolean z, int i3) {
        int availableWidth;
        int iIntValue;
        if ((i3 & 8) != 0) {
            z = false;
        }
        if (c1214930hil.LLILZIL && z) {
            availableWidth = (c1214930hil.getAvailableWidth() - c1214930hil.LLIZLLLIL) - c1214930hil.LLJIJIL;
            if (availableWidth < 0) {
                availableWidth = 0;
            }
        } else {
            availableWidth = i;
        }
        if (availableWidth <= i) {
            i = availableWidth;
        }
        FlexboxLayout$LayoutParams flexboxLayout$LayoutParams = new FlexboxLayout$LayoutParams(i, c1214930hil.LLJILJIL);
        flexboxLayout$LayoutParams.setMargins(0, 0, c1214930hil.LLIZLLLIL, c1214930hil.LLJ);
        TuxTextView tuxTextView = new TuxTextView(c1214930hil.getContext(), null, 6, 0);
        tuxTextView.setText(c1226110i0n.LIZ);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c1214930hil.getDarkThemeCtx());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        tuxTextView.setTextColor(iIntValue);
        tuxTextView.setTuxFont(41);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        int i4 = c1214930hil.LLJI;
        tuxTextView.setPadding(i4, 0, i4, 0);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.a1c, c1214930hil.getDarkThemeCtx());
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
        tuxTextView.setBackground(c384050F3z.LIZ(c1214930hil.getDarkThemeCtx()));
        C786410Ut5.R6(tuxTextView, flexboxLayout$LayoutParams);
        tuxTextView.setGravity(17);
        C786410Ut5.I7(new AkS9S0201000_19(c1214930hil, c1226110i0n, i2, 1), tuxTextView);
        LJ(((ViewGroup.MarginLayoutParams) flexboxLayout$LayoutParams).width, c1214930hil.LLJILJIL, tuxTextView);
        return tuxTextView;
    }
}
