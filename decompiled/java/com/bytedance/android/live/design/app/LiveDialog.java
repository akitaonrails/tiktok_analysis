package com.bytedance.android.live.design.app;

import X.C16F5;
import X.C16F6;
import X.C16FS;
import X.C1763660vzo;
import X.C1848410yCV;
import X.C19ME;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C431570Gw7;
import X.C494730Jah;
import X.C753530Th9;
import X.C755640TkY;
import X.C773790UWz;
import X.C782110Um9;
import X.C782160UmE;
import X.C782270UmP;
import X.C786410Ut5;
import X.InterfaceC517220KQe;
import X.InterfaceC753540ThA;
import X.InterfaceC782250UmN;
import Y.ACListenerS116S0200000_12;
import Y.ACListenerS134S0200000_32;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import avg.f;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import mf.a;

/* JADX INFO: loaded from: classes13.dex */
public class LiveDialog extends LifecycleAwareDialog {
    public static final /* synthetic */ int LLLIL = 0;
    public View LLJILJIL;
    public View LLJILJILJ;
    public LiveIconView LLJILLL;
    public ImageView LLJJ;
    public ImageView LLJJI;
    public TextView LLJJIII;
    public View LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public C16F5 LLJJIJIL;
    public ImageView LLJJJ;
    public FrameLayout LLJJJIL;
    public InterfaceC517220KQe LLJJJJ;
    public FrameLayout LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public CharSequence LLJJL;
    public CharSequence LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public C753530Th9 LLJLIL;
    public boolean LLJLILLLLZIIL;
    public ColorStateList LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public int LLJZ;
    public int LLJZIJLIL;
    public int LLL;
    public boolean LLLF;
    public float LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public ColorStateList LLLI;
    public C494730Jah LLLII;
    public C431570Gw7 LLLIIII;
    public C773790UWz LLLIIIIL;
    public LinearLayout LLLIIIL;
    public InterfaceC782250UmN LLLIIL;
    public int LLLIILIL;

    @Override // X.C19GJ
    public final boolean LJLI() {
        return false;
    }

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.C19GJ
    public final String LJJZ() {
        CharSequence charSequence = this.LLJJLIIIJLLLLLLLZ;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // X.C19GJ
    public final String LJJZZI() {
        C755640TkY c755640TkYLIZ;
        CharSequence charSequence;
        C494730Jah c494730Jah = this.LLLII;
        if (c494730Jah == null || (c755640TkYLIZ = c494730Jah.LIZ(2)) == null || (charSequence = c755640TkYLIZ.LIZ) == null) {
            return null;
        }
        return charSequence.toString();
    }

    @Override // X.C19GJ
    public final String LJJZZIII() {
        C755640TkY c755640TkYLIZ;
        CharSequence charSequence;
        C494730Jah c494730Jah = this.LLLII;
        if (c494730Jah == null || (c755640TkYLIZ = c494730Jah.LIZ(1)) == null || (charSequence = c755640TkYLIZ.LIZ) == null) {
            return null;
        }
        return charSequence.toString();
    }

    @Override // X.C19GJ
    public final String LJL() {
        CharSequence charSequence = this.LLJJL;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final void LJLIIIL() {
        ImageView imageView = this.LLJJI;
        if (imageView == null) {
            return;
        }
        C19ME c19me = (C19ME) imageView.getLayoutParams();
        if (this.LLLF) {
            ((ViewGroup.MarginLayoutParams) c19me).height = this.LLL;
            c19me.dimensionRatio = null;
        } else if (this.LLLFFI) {
            ((ViewGroup.MarginLayoutParams) c19me).height = 0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("w, ");
            sbLIZ.append(this.LLLFF);
            c19me.dimensionRatio = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            ((ViewGroup.MarginLayoutParams) c19me).height = -2;
            c19me.dimensionRatio = null;
        }
        C786410Ut5.c6(this.LLJJI, c19me);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C753530Th9 c753530Th9 = this.LLJLIL;
        if (c753530Th9 == null || c753530Th9.LIZ() == null) {
            return;
        }
        this.LLJLIL.LIZ().stop();
    }

    public final void LJLIL(C753530Th9 c753530Th9) {
        C753530Th9 c753530Th92 = this.LLJLIL;
        if (c753530Th9 == c753530Th92) {
            return;
        }
        if (c753530Th92 != null && c753530Th92.LIZ() != null) {
            this.LLJLIL.LIZ().stop();
        }
        this.LLJLIL = null;
    }

    public final void LJLILLLLZI(InterfaceC517220KQe interfaceC517220KQe) {
        this.LLJJJJ = interfaceC517220KQe;
        FrameLayout frameLayout = this.LLJJJIL;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
            InterfaceC517220KQe interfaceC517220KQe2 = this.LLJJJJ;
            if (interfaceC517220KQe2 != null) {
                View viewLIZ = interfaceC517220KQe2.LIZ(getContext(), this.LLJJJIL, this);
                if (viewLIZ != null) {
                    ViewGroup.LayoutParams layoutParams = viewLIZ.getLayoutParams();
                    if (layoutParams != null) {
                        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
                            layoutParams = new FrameLayout.LayoutParams(layoutParams);
                        }
                    } else {
                        layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    }
                    this.LLJJJIL.addView(viewLIZ, layoutParams);
                    C786410Ut5.LJZ(0, this.LLJJJIL);
                    return;
                }
                C786410Ut5.LJZ(8, this.LLJJJIL);
                return;
            }
            C786410Ut5.LJZ(8, this.LLJJJIL);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X.0Gw7] */
    public final void LJLJI(C494730Jah c494730Jah) {
        if (this.LLLII == null && c494730Jah == null) {
            return;
        }
        this.LLLIIIIL = null;
        this.LLLII = c494730Jah;
        FrameLayout frameLayout = this.LLJJJJJIL;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
            if (this.LLLII != null) {
                if (this.LLLIIII == null) {
                    final Context context = getContext();
                    this.LLLIIII = new ViewGroup(context) { // from class: X.0Gw7
                        public int LL;
                        public int LLILLJJLI;
                        public int LLILLL;
                        public Paint LLILZ;
                        public final TextPaint LLILZIL = new TextPaint();
                        public int LLILZLL;
                        public int LLIZ;

                        {
                            setWillNotDraw(false);
                            this.LLILLL = getContext().getResources().getDimensionPixelSize(R.dimen.a4n);
                            Paint paint = new Paint(1);
                            this.LLILZ = paint;
                            paint.setColor(C20736316Cj.LIZIZ(R.attr.fxk, getContext()));
                            this.LLILZ.setStrokeWidth(this.LLILLL);
                            this.LLILZLL = getContext().getResources().getDimensionPixelSize(R.dimen.a41);
                            this.LLIZ = getContext().getResources().getDimensionPixelSize(R.dimen.a40);
                        }

                        @Override // android.view.View
                        public final void draw(Canvas canvas) {
                            super.draw(canvas);
                            int childCount = getChildCount();
                            if (childCount > 0) {
                                canvas.drawRect(0.0f, this.LLIZ, getWidth(), this.LLIZ + this.LLILLL, this.LLILZ);
                                int i = 1;
                                if (this.LLILLJJLI == 1) {
                                    int width = (getWidth() - ((childCount - 1) * this.LLILLL)) / childCount;
                                    while (i < childCount) {
                                        int i2 = this.LLILLL;
                                        float f = (i * width) + ((i - 1) * i2);
                                        int i3 = this.LLIZ;
                                        canvas.drawRect(f, i3 + i2, f + i2, i3 + i2 + this.LLILZLL, this.LLILZ);
                                        i++;
                                    }
                                    return;
                                }
                                while (i < childCount) {
                                    View childAt = getChildAt(i - 1);
                                    canvas.drawRect(0.0f, childAt.getBottom(), getWidth(), childAt.getBottom() + this.LLILLL, this.LLILZ);
                                    i++;
                                }
                            }
                        }

                        public void setOrientation(int i) {
                            this.LL = i;
                            requestLayout();
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // android.view.View
                        public final void onMeasure(int i, int i2) {
                            int autoSizeMaxTextSize;
                            int childCount = getChildCount();
                            if (childCount > 0) {
                                int size = View.MeasureSpec.getSize(i);
                                int childCount2 = (size - ((getChildCount() - 1) * this.LLILLL)) / getChildCount();
                                int i3 = this.LL;
                                int i4 = 0;
                                if (i3 == 0) {
                                    int i5 = 0;
                                    do {
                                        TextView textView = (TextView) getChildAt(i5);
                                        int paddingLeft = (childCount2 - textView.getPaddingLeft()) - textView.getPaddingRight();
                                        CharSequence text = textView.getText();
                                        if (paddingLeft > 0 && !TextUtils.isEmpty(text)) {
                                            this.LLILZIL.reset();
                                            this.LLILZIL.set(textView.getPaint());
                                            TextPaint textPaint = this.LLILZIL;
                                            if (Build.VERSION.SDK_INT >= 27) {
                                                autoSizeMaxTextSize = C20745716Fz.LIZ(textView);
                                            } else if (textView instanceof InterfaceC20745616Fy) {
                                                autoSizeMaxTextSize = ((InterfaceC20745616Fy) textView).getAutoSizeMaxTextSize();
                                            } else {
                                                autoSizeMaxTextSize = -1;
                                            }
                                            textPaint.setTextSize(autoSizeMaxTextSize);
                                            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(text, 0, text.length(), this.LLILZIL, paddingLeft).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(textView.getMaxLines()).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).build();
                                            if (staticLayoutBuild.getLineCount() != 1 || staticLayoutBuild.getLineEnd(staticLayoutBuild.getLineCount() - 1) != text.length()) {
                                                this.LLILLJJLI = 2;
                                                break;
                                            }
                                            i5++;
                                        } else {
                                            i5++;
                                        }
                                    } while (i5 < childCount);
                                    this.LLILLJJLI = 1;
                                } else {
                                    this.LLILLJJLI = i3;
                                }
                                if (this.LLILLJJLI == 1) {
                                    do {
                                        getChildAt(i4).measure(View.MeasureSpec.makeMeasureSpec(childCount2, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LLILZLL, 1073741824));
                                        i4++;
                                    } while (i4 < childCount);
                                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LLIZ + this.LLILLL + this.LLILZLL, 1073741824));
                                    return;
                                }
                                do {
                                    getChildAt(i4).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LLILZLL, 1073741824));
                                    i4++;
                                } while (i4 < childCount);
                                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LLIZ + ((this.LLILLL + this.LLILZLL) * childCount), 1073741824));
                                return;
                            }
                            super.onMeasure(i, i2);
                        }

                        @Override // android.view.ViewGroup, android.view.View
                        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                            boolean z2;
                            int measuredWidth;
                            int childCount = getChildCount();
                            int i5 = 0;
                            if (getLayoutDirection() == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (childCount > 0) {
                                if (this.LLILLJJLI == 1) {
                                    int i6 = this.LLIZ + this.LLILLL;
                                    int i7 = this.LLILZLL + i6;
                                    do {
                                        View childAt = getChildAt(i5);
                                        if (z2) {
                                            measuredWidth = (childAt.getMeasuredWidth() + this.LLILLL) * i5;
                                        } else {
                                            measuredWidth = ((i3 - i) - ((i5 + 1) * childAt.getMeasuredWidth())) - (this.LLILLL * i5);
                                        }
                                        childAt.layout(measuredWidth, i6, childAt.getMeasuredWidth() + measuredWidth, i7);
                                        i5++;
                                    } while (i5 < childCount);
                                    return;
                                }
                                int measuredHeight = this.LLIZ + this.LLILLL;
                                int i8 = 0;
                                do {
                                    View childAt2 = getChildAt(i8);
                                    childAt2.layout(0, measuredHeight, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight() + measuredHeight);
                                    measuredHeight += childAt2.getMeasuredHeight() + this.LLILLL;
                                    i8++;
                                } while (i8 < childCount);
                            }
                        }
                    };
                }
                List<C755640TkY> listUnmodifiableList = Collections.unmodifiableList(this.LLLII.LIZ);
                C431570Gw7 c431570Gw7 = this.LLLIIII;
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c431570Gw7, null);
                c431570Gw7.removeAllViews();
                if (listUnmodifiableList != null && !listUnmodifiableList.isEmpty()) {
                    for (C755640TkY c755640TkY : listUnmodifiableList) {
                        C16F6 c16f6 = new C16F6(getContext());
                        c16f6.LLJJ.LJI(c755640TkY.LIZIZ);
                        c16f6.setText(c755640TkY.LIZ);
                        if (c755640TkY.LIZJ != null) {
                            View.OnClickListener aCListenerS134S0200000_32 = new ACListenerS134S0200000_32(this, c755640TkY, 26);
                            if (C1848410yCV.LIZ) {
                                aCListenerS134S0200000_32 = new f(aCListenerS134S0200000_32);
                            }
                            a aVar = new a(aCListenerS134S0200000_32);
                            if (C2213981Bky.LIZIZ.isOffline()) {
                                C2211941Bhg.LIZ.injectViewListener(c16f6);
                            }
                            c16f6.setOnClickListener(aVar);
                        }
                        c16f6.setEnabled(true);
                        addView(c16f6);
                    }
                }
                requestLayout();
                setOrientation(this.LLLII.LIZIZ);
                this.LLJJJJJIL.addView(this.LLLIIII, -1, -2);
                return;
            }
            C431570Gw7 c431570Gw72 = this.LLLIIII;
            if (c431570Gw72 != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c431570Gw72, null);
                c431570Gw72.removeAllViews();
            }
        }
    }

    public final void LJLJJLL(Drawable drawable) {
        ImageView imageView = this.LLJJI;
        if (imageView != null && this.LLJILJILJ != null) {
            if (drawable == null) {
                imageView.setImageDrawable(null);
                C786410Ut5.LJZI(8, this.LLJJI);
                C786410Ut5.LJLLLLLL(8, this.LLJILJILJ);
            } else {
                imageView.setImageDrawable(drawable);
                C786410Ut5.LJZI(0, this.LLJJI);
                C786410Ut5.LJLLLLLL(0, this.LLJILJILJ);
            }
        }
    }

    public final void LJLJLJ(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        LJLLI(null);
        LJLJJLL(null);
        LJLIL(null);
        this.LLJLIL = new C753530Th9(drawable, 1);
        LiveIconView liveIconView = this.LLJILLL;
        if (liveIconView != null) {
            liveIconView.setIconAutoMirrored(this.LLJLILLLLZIIL);
            this.LLJILLL.setIconTintList(this.LLJLL);
        }
        LJLJLLL(drawable);
    }

    public final void LJLJLLL(Drawable drawable) {
        LiveIconView liveIconView = this.LLJILLL;
        if (liveIconView != null && this.LLJILJILJ != null) {
            if (drawable == null) {
                liveIconView.setImageDrawable(null);
                C786410Ut5.LLJJIJIL(this.LLJILLL, 8);
                C786410Ut5.LJLLLLLL(8, this.LLJILJILJ);
            } else {
                liveIconView.setImageDrawable(drawable);
                C786410Ut5.LLJJIJIL(this.LLJILLL, 0);
                C786410Ut5.LJLLLLLL(0, this.LLJILJILJ);
            }
        }
    }

    public final void LJLLI(Drawable drawable) {
        ImageView imageView = this.LLJJ;
        if (imageView != null && this.LLJILJILJ != null) {
            if (drawable == null) {
                imageView.setImageDrawable(null);
                C786410Ut5.LJZI(8, this.LLJJ);
                C786410Ut5.LJLLLLLL(8, this.LLJILJILJ);
            } else {
                imageView.setImageDrawable(drawable);
                C786410Ut5.LJZI(0, this.LLJJ);
                C786410Ut5.LJLLLLLL(0, this.LLJILJILJ);
            }
        }
    }

    public final void LJLLILLLL(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.LLJJLIIIJLLLLLLLZ) && TextUtils.isEmpty(charSequence)) {
            return;
        }
        LJLIIL(null, charSequence);
    }

    @Override // X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.setNavigationBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.getDecorView().setSystemUiVisibility(512);
            window.setLayout(-1, -1);
        }
        setContentView(C786410Ut5.LJLLJ(getContext(), R.layout.dee, null), new ViewGroup.LayoutParams(-1, -1));
        this.LLJILJIL = findViewById(R.id.mwk);
        ((C782270UmP) findViewById(R.id.euw)).setLayoutStyle(this.LLLIILIL);
        setCanceledOnTouchOutside(this.LLJJJJLIIL);
        this.LLJILJILJ = findViewById(R.id.mwe);
        this.LLJILLL = (LiveIconView) findViewById(R.id.mwc);
        this.LLJJ = (ImageView) findViewById(R.id.mwd);
        this.LLJJI = (ImageView) findViewById(R.id.mwb);
        C753530Th9 c753530Th9 = this.LLJLIL;
        if (c753530Th9 != null) {
            Drawable drawable = c753530Th9.LIZIZ;
            if (drawable != null) {
                int i = c753530Th9.LIZJ;
                if (i == 1) {
                    LJLJLJ(drawable);
                    boolean z = this.LLJLILLLLZIIL;
                    this.LLJLILLLLZIIL = z;
                    LiveIconView liveIconView = this.LLJILLL;
                    if (liveIconView != null) {
                        liveIconView.setIconAutoMirrored(z);
                    }
                    ColorStateList colorStateList = this.LLJLL;
                    LiveIconView liveIconView2 = this.LLJILLL;
                    if (liveIconView2 != null) {
                        liveIconView2.setIconTintList(colorStateList);
                    }
                    int i2 = this.LLJLLIL;
                    this.LLJLLIL = i2;
                    LiveIconView liveIconView3 = this.LLJILLL;
                    if (liveIconView3 != null) {
                        ViewGroup.LayoutParams layoutParams = liveIconView3.getLayoutParams();
                        layoutParams.width = i2;
                        C786410Ut5.w6(this.LLJILLL, layoutParams);
                    }
                    int i3 = this.LLJLLL;
                    this.LLJLLL = i3;
                    LiveIconView liveIconView4 = this.LLJILLL;
                    if (liveIconView4 != null) {
                        ViewGroup.LayoutParams layoutParams2 = liveIconView4.getLayoutParams();
                        layoutParams2.height = i3;
                        C786410Ut5.w6(this.LLJILLL, layoutParams2);
                    }
                } else if (i == 2) {
                    LJLL(drawable, this.LLJZ, this.LLJZIJLIL);
                } else if (i == 3) {
                    if (this.LLLF) {
                        LJLJJL(drawable, this.LLL);
                    } else if (this.LLLFFI) {
                        LJLJJI(drawable, this.LLLFF);
                    }
                }
            } else if (c753530Th9.LIZ() != null) {
                C753530Th9 c753530Th92 = this.LLJLIL;
                int i4 = c753530Th92.LIZJ;
                if (i4 == 1) {
                    int i5 = this.LLJLLIL;
                    this.LLJLLIL = i5;
                    LiveIconView liveIconView5 = this.LLJILLL;
                    if (liveIconView5 != null) {
                        ViewGroup.LayoutParams layoutParams3 = liveIconView5.getLayoutParams();
                        layoutParams3.width = i5;
                        C786410Ut5.w6(this.LLJILLL, layoutParams3);
                    }
                    int i6 = this.LLJLLL;
                    this.LLJLLL = i6;
                    LiveIconView liveIconView6 = this.LLJILLL;
                    if (liveIconView6 != null) {
                        ViewGroup.LayoutParams layoutParams4 = liveIconView6.getLayoutParams();
                        layoutParams4.height = i6;
                        C786410Ut5.w6(this.LLJILLL, layoutParams4);
                    }
                    boolean z2 = this.LLJLILLLLZIIL;
                    this.LLJLILLLLZIIL = z2;
                    LiveIconView liveIconView7 = this.LLJILLL;
                    if (liveIconView7 != null) {
                        liveIconView7.setIconAutoMirrored(z2);
                    }
                    ColorStateList colorStateList2 = this.LLJLL;
                    LiveIconView liveIconView8 = this.LLJILLL;
                    if (liveIconView8 != null) {
                        liveIconView8.setIconTintList(colorStateList2);
                    }
                    C753530Th9 c753530Th93 = this.LLJLIL;
                    LJLIL(c753530Th93);
                    c753530Th93.LIZJ = 1;
                    this.LLJLIL = c753530Th93;
                    c753530Th93.LIZ = new InterfaceC753540ThA() { // from class: X.0UmK
                        @Override // X.InterfaceC753540ThA
                        public final void LIZ(Drawable drawable2) {
                            this.LIZ.LJLJLJ(drawable2);
                        }
                    };
                    if (c753530Th93.LIZ() != null) {
                        this.LLJLIL.LIZ().start();
                    }
                } else if (i4 == 2) {
                    final int i7 = this.LLJZ;
                    final int i8 = this.LLJZIJLIL;
                    LJLIL(c753530Th92);
                    c753530Th92.LIZJ = 2;
                    this.LLJLIL = c753530Th92;
                    c753530Th92.LIZ = new InterfaceC753540ThA() { // from class: X.0UmL
                        @Override // X.InterfaceC753540ThA
                        public final void LIZ(Drawable drawable2) {
                            this.LIZJ.LJLL(drawable2, i7, i8);
                        }
                    };
                    if (c753530Th92.LIZ() != null) {
                        this.LLJLIL.LIZ().start();
                    }
                } else if (i4 == 3) {
                    if (this.LLLF) {
                        final int i9 = this.LLL;
                        LJLIL(c753530Th92);
                        c753530Th92.LIZJ = 3;
                        this.LLJLIL = c753530Th92;
                        c753530Th92.LIZ = new InterfaceC753540ThA() { // from class: X.0UmM
                            @Override // X.InterfaceC753540ThA
                            public final void LIZ(Drawable drawable2) {
                                this.LIZIZ.LJLJJL(drawable2, i9);
                            }
                        };
                        if (c753530Th92.LIZ() != null) {
                            this.LLJLIL.LIZ().start();
                        }
                    } else if (this.LLLFFI) {
                        final float f = this.LLLFF;
                        LJLIL(c753530Th92);
                        c753530Th92.LIZJ = 3;
                        this.LLJLIL = c753530Th92;
                        c753530Th92.LIZ = new InterfaceC753540ThA() { // from class: X.0UmF
                            @Override // X.InterfaceC753540ThA
                            public final void LIZ(Drawable drawable2) {
                                this.LIZIZ.LJLJJI(drawable2, f);
                            }
                        };
                        if (c753530Th92.LIZ() != null) {
                            this.LLJLIL.LIZ().start();
                        }
                    }
                }
            }
        }
        this.LLJJIII = (TextView) findViewById(R.id.mwj);
        setTitle(this.LLJJL);
        this.LLJJIJI = findViewById(R.id.mwh);
        this.LLJJIJIIJIL = (FrameLayout) findViewById(R.id.mwg);
        C16F5 c16f5 = (C16F5) findViewById(R.id.mwi);
        this.LLJJIJIL = c16f5;
        c16f5.setMovementMethod(LinkMovementMethod.getInstance());
        LJLIIL(this.LLJL, this.LLJJLIIIJLLLLLLLZ);
        ImageView imageView = (ImageView) findViewById(R.id.mw_);
        this.LLJJJ = imageView;
        C786410Ut5.Q7(imageView, new ACListenerS147S0100000_12(this, 478));
        boolean z3 = this.LLLFZ;
        this.LLLFZ = z3;
        ImageView imageView2 = this.LLJJJ;
        if (imageView2 != null) {
            if (z3) {
                C786410Ut5.LJZI(0, imageView2);
            } else {
                C786410Ut5.LJZI(8, imageView2);
            }
        }
        ColorStateList colorStateList3 = this.LLLI;
        this.LLLI = colorStateList3;
        ImageView imageView3 = this.LLJJJ;
        if (imageView3 != null) {
            C1763660vzo.LIZJ(imageView3, colorStateList3);
        }
        this.LLJJJIL = (FrameLayout) findViewById(R.id.mw8);
        LJLILLLLZI(this.LLJJJJ);
        this.LLJJJJJIL = (FrameLayout) findViewById(R.id.mw9);
        LJLJI(this.LLLII);
        C773790UWz c773790UWz = this.LLLIIIIL;
        if (c773790UWz != null) {
            this.LLLII = null;
            this.LLLIIIIL = c773790UWz;
            FrameLayout frameLayout = this.LLJJJJJIL;
            if (frameLayout != null) {
                C786410Ut5.LJJJJIZL(frameLayout);
                if (this.LLLIIIIL != null) {
                    LinearLayout linearLayout = this.LLLIIIL;
                    if (linearLayout == null) {
                        LinearLayout linearLayout2 = new LinearLayout(getContext());
                        linearLayout2.setOrientation(1);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams5.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.a42);
                        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.a5f);
                        layoutParams5.rightMargin = dimensionPixelSize;
                        layoutParams5.leftMargin = dimensionPixelSize;
                        C786410Ut5.d6(linearLayout2, layoutParams5);
                        this.LLLIIIL = linearLayout2;
                    } else {
                        C786410Ut5.LJJJJJL(linearLayout);
                    }
                    List listUnmodifiableList = Collections.unmodifiableList(this.LLLIIIIL.LIZ);
                    int size = listUnmodifiableList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        C782160UmE c782160UmE = (C782160UmE) ListProtector.get(listUnmodifiableList, i10);
                        C16FS c16fs = new C16FS(getContext(), null);
                        c16fs.j0(c782160UmE.LIZIZ);
                        if (c782160UmE.LIZJ != null) {
                            C786410Ut5.h8(c16fs, new ACListenerS116S0200000_12(this, c782160UmE, 104));
                        }
                        c16fs.setText(c782160UmE.LIZ);
                        c16fs.setEnabled(true);
                        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                        if (i10 > 0) {
                            layoutParams6.topMargin = getContext().getResources().getDimensionPixelSize(R.dimen.a43);
                        }
                        C786410Ut5.x6(c16fs, layoutParams6);
                        this.LLLIIIL.addView(c16fs);
                    }
                    if (size > 1) {
                        LinearLayout linearLayout3 = this.LLLIIIL;
                        linearLayout3.setPadding(linearLayout3.getPaddingLeft(), this.LLLIIIL.getPaddingTop(), this.LLLIIIL.getPaddingRight(), getContext().getResources().getDimensionPixelSize(R.dimen.a5j));
                    } else {
                        LinearLayout linearLayout4 = this.LLLIIIL;
                        linearLayout4.setPadding(linearLayout4.getPaddingLeft(), this.LLLIIIL.getPaddingTop(), this.LLLIIIL.getPaddingRight(), getContext().getResources().getDimensionPixelSize(R.dimen.a4d));
                    }
                    this.LLJJJJJIL.addView(this.LLLIIIL);
                    return;
                }
                C786410Ut5.LJJJJJL(this.LLLIIIL);
            }
        }
    }

    @Override // X.C19GJ, android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.LLJJJJLIIL = z;
        View view = this.LLJILJIL;
        if (view != null) {
            if (z) {
                C786410Ut5.I7(new ACListenerS147S0100000_12(this, 479), view);
            } else {
                C786410Ut5.I7(null, view);
            }
        }
    }

    @Override // X.C19GU, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.LLJJL = charSequence;
        if (this.LLJJIII != null) {
            if (TextUtils.isEmpty(charSequence)) {
                this.LLJJIII.setText("");
                C786410Ut5.LLIL(this.LLJJIII, 8);
            } else {
                this.LLJJIII.setText(this.LLJJL);
                C786410Ut5.LLIL(this.LLJJIII, 0);
            }
        }
        LJLIIL(this.LLJL, this.LLJJLIIIJLLLLLLLZ);
    }

    @Override // X.C19GU, android.app.Dialog
    public final void setTitle(int i) {
        setTitle(getContext().getResources().getString(i));
    }

    public LiveDialog(Context context, C782110Um9 c782110Um9) {
        super(context, c782110Um9);
        this.LLJLIL = c782110Um9.LJFF;
        this.LLJLILLLLZIIL = c782110Um9.LJII;
        this.LLJLL = c782110Um9.LJI;
        this.LLJLLIL = c782110Um9.LJIIIIZZ;
        this.LLJLLL = c782110Um9.LJIIIZ;
        this.LLJZ = c782110Um9.LJIIJ;
        this.LLJZIJLIL = c782110Um9.LJIIJJI;
        this.LLL = 0;
        this.LLLFF = c782110Um9.LJIIL;
        this.LLLF = false;
        this.LLLFFI = c782110Um9.LJIILIIL;
        this.LLJJL = c782110Um9.LIZJ;
        this.LLJJLIIIJLLLLLLLZ = c782110Um9.LJ;
        this.LLJL = c782110Um9.LIZLLL;
        this.LLLFZ = c782110Um9.LJIILJJIL;
        this.LLLI = null;
        this.LLJJJJ = c782110Um9.LJIJJ;
        setOnShowListener(c782110Um9.LJIIZILJ);
        setOnCancelListener(c782110Um9.LJIJI);
        setOnDismissListener(c782110Um9.LJIJ);
        setOnKeyListener(null);
        setCancelable(c782110Um9.LJIILLIIL);
        setCanceledOnTouchOutside(c782110Um9.LJIILL);
        this.LLLII = c782110Um9.LJIJJLI;
        this.LLLIIIIL = c782110Um9.LJIL;
        this.LLLIIL = c782110Um9.LJJIII;
        this.LLLIILIL = c782110Um9.LJJIIJ;
    }

    public final void LJLIIL(View view, CharSequence charSequence) {
        FrameLayout frameLayout;
        if (this.LLJJIJI != null && this.LLJJIJIL != null && (frameLayout = this.LLJJIJIIJIL) != null) {
            View view2 = this.LLJL;
            if (view2 != null) {
                C786410Ut5.LJJJZ(view2, frameLayout);
            }
            this.LLJJLIIIJLLLLLLLZ = charSequence;
            this.LLJL = view;
            if (!TextUtils.isEmpty(charSequence)) {
                this.LLJJIJIL.setText(this.LLJJLIIIJLLLLLLLZ);
                if (TextUtils.isEmpty(this.LLJJL)) {
                    this.LLJJIJIL.LJJJI(R.style.a8w);
                } else {
                    this.LLJJIJIL.LJJJI(R.style.a8z);
                }
                C786410Ut5.LLJJJJ(this.LLJJIJIL, 0);
                C786410Ut5.LJLLLLLL(0, this.LLJJIJI);
                return;
            }
            View view3 = this.LLJL;
            if (view3 != null) {
                this.LLJJIJIIJIL.addView(view3, -1, -2);
                this.LLJJIJIL.setText("");
                C786410Ut5.LLJJJJ(this.LLJJIJIL, 8);
                C786410Ut5.LJLLLLLL(0, this.LLJJIJI);
                return;
            }
            this.LLJJIJIL.setText("");
            C786410Ut5.LLJJJJ(this.LLJJIJIL, 8);
            C786410Ut5.LJLLLLLL(8, this.LLJJIJI);
        }
    }

    public final void LJLJJI(Drawable drawable, float f) {
        if (this.LLJLIL == null && drawable == null) {
            return;
        }
        LJLJLLL(null);
        LJLLI(null);
        LJLIL(null);
        this.LLJLIL = new C753530Th9(drawable, 3);
        LJLJJLL(drawable);
        this.LLLFF = f;
        this.LLLFFI = true;
        this.LLLF = false;
        LJLIIIL();
    }

    public final void LJLJJL(Drawable drawable, int i) {
        if (this.LLJLIL == null && drawable == null) {
            return;
        }
        LJLJLLL(null);
        LJLLI(null);
        LJLIL(null);
        this.LLJLIL = new C753530Th9(drawable, 3);
        LJLJJLL(drawable);
        this.LLL = i;
        this.LLLF = true;
        this.LLLFFI = false;
        LJLIIIL();
    }

    public final void LJLL(Drawable drawable, int i, int i2) {
        if (this.LLJLIL == null && drawable == null) {
            return;
        }
        LJLJLLL(null);
        LJLJJLL(null);
        LJLIL(null);
        this.LLJLIL = new C753530Th9(drawable, 2);
        LJLLI(drawable);
        this.LLJZ = i;
        this.LLJZIJLIL = i2;
        ImageView imageView = this.LLJJ;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = this.LLJZ;
            layoutParams.height = this.LLJZIJLIL;
            C786410Ut5.c6(this.LLJJ, layoutParams);
        }
    }
}
