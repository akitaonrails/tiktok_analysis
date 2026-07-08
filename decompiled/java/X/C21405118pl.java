package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.lynx.tasm.behavior.render.PlatformRendererContext;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.swiper.XSwiperUI;

/* JADX INFO: renamed from: X.18pl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21405118pl extends FrameLayout implements InterfaceC1314720kJi, InterfaceC1311940kFE {
    public final C21606519h9 LL;
    public final LinearLayout LLILLJJLI;
    public final int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public InterfaceC1314130kIl LLIZLLLIL;
    public C1311970kFH LLJ;

    @Override // X.InterfaceC1311940kFE
    public View getView() {
        return this;
    }

    public final void LIZ() {
        View view = new View(getContext());
        view.setClickable(false);
        int i = this.LLILLL;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        if (this.LLIZ == 1) {
            int i2 = this.LLILLL / 2;
            layoutParams.bottomMargin = i2;
            layoutParams.topMargin = i2;
        } else {
            int i3 = this.LLILLL / 2;
            layoutParams.rightMargin = i3;
            layoutParams.leftMargin = i3;
        }
        this.LLILLJJLI.addView(view, layoutParams);
        int childCount = this.LLILLJJLI.getChildCount();
        int i4 = this.LLILZ;
        if (childCount == i4) {
            view.setBackground(LIZIZ(i4));
        } else {
            view.setBackground(LIZIZ(this.LLILZIL));
        }
    }

    public final void LIZJ() {
        for (int childCount = this.LLILLJJLI.getChildCount() - 1; childCount > -1; childCount--) {
            View childAt = this.LLILLJJLI.getChildAt(childCount);
            if (childCount == this.LLILZLL) {
                childAt.setBackground(LIZIZ(this.LLILZ));
            } else {
                childAt.setBackground(LIZIZ(this.LLILZIL));
            }
        }
    }

    @Override // X.InterfaceC1311940kFE
    public C1311970kFH getRenderer() {
        return this.LLJ;
    }

    public C21606519h9 getViewPager() {
        return this.LL;
    }

    public C21405118pl(Context context) {
        super(context, null);
        this.LLILZ = XSwiperUI.LLJLLL;
        this.LLILZIL = XSwiperUI.LLJZ;
        this.LLILLL = (int) C1311130kDv.LIZIZ(7.0f, 0.0f);
        C21606519h9 c21606519h9 = new C21606519h9(context);
        this.LL = c21606519h9;
        addView(c21606519h9, new FrameLayout.LayoutParams(-1, -1));
        this.LLILLJJLI = new LinearLayout(context);
        LIZLLL(0);
    }

    public static final GradientDrawable LIZIZ(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    public final void LIZLLL(int i) {
        FrameLayout.LayoutParams layoutParams;
        if (i == 1) {
            this.LLILLJJLI.setGravity(16);
            this.LLILLJJLI.setOrientation(1);
            layoutParams = new FrameLayout.LayoutParams(-2, -1);
            layoutParams.rightMargin = (int) C1311130kDv.LIZIZ(10.0f, 0.0f);
            layoutParams.gravity = 8388629;
        } else {
            this.LLILLJJLI.setGravity(17);
            this.LLILLJJLI.setOrientation(0);
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = (int) C1311130kDv.LIZIZ(10.0f, 0.0f);
            layoutParams.gravity = 81;
        }
        addView(this.LLILLJJLI, layoutParams);
        int childCount = this.LLILLJJLI.getChildCount();
        C786410Ut5.LJJJJJL(this.LLILLJJLI);
        for (int i2 = 0; i2 < childCount; i2++) {
            LIZ();
        }
        LIZJ();
    }

    @Override // X.InterfaceC1314720kJi
    public final void bindDrawChildHook(InterfaceC1314130kIl interfaceC1314130kIl) {
        this.LLIZLLLIL = interfaceC1314130kIl;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        InterfaceC1314130kIl interfaceC1314130kIl = this.LLIZLLLIL;
        if (interfaceC1314130kIl != null) {
            interfaceC1314130kIl.beforeDispatchDraw(canvas);
        }
        super.dispatchDraw(canvas);
        C1311970kFH c1311970kFH = this.LLJ;
        if (c1311970kFH != null) {
            c1311970kFH.LIZ(canvas);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LLJ != null) {
            this.LLJ.LJ(canvas);
        } else {
            super.onDraw(canvas);
        }
    }

    public void setIsRtl(boolean z) {
        if (z) {
            this.LLILLJJLI.setLayoutDirection(1);
        } else {
            this.LLILLJJLI.setLayoutDirection(0);
        }
        this.LL.setIsRTL(z);
    }

    public void setOrientation(int i) {
        this.LLIZ = i;
        LinearLayout linearLayout = this.LLILLJJLI;
        if (linearLayout != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, linearLayout);
            removeView(linearLayout);
            LIZLLL(i);
        }
        getViewPager().setOrientation(i);
    }

    @Override // X.InterfaceC1311940kFE
    public void setRenderer(C1311970kFH c1311970kFH) {
        this.LLJ = c1311970kFH;
    }

    public void setSelected(int i) {
        this.LLILZLL = i;
        LIZJ();
    }

    public void setSelectedColor(int i) {
        this.LLILZ = i;
        for (int childCount = this.LLILLJJLI.getChildCount() - 1; childCount > -1; childCount--) {
            if (childCount == this.LLILZLL) {
                this.LLILLJJLI.getChildAt(childCount).setBackground(LIZIZ(this.LLILZ));
                return;
            }
        }
    }

    public void setUnSelectedColor(int i) {
        this.LLILZIL = i;
        for (int childCount = this.LLILLJJLI.getChildCount() - 1; childCount > -1; childCount--) {
            if (childCount != this.LLILZLL) {
                this.LLILLJJLI.getChildAt(childCount).setBackground(LIZIZ(this.LLILZIL));
            }
        }
    }

    @Override // X.InterfaceC1311940kFE
    public final C1311970kFH createRenderer(PlatformRendererContext platformRendererContext, int i) {
        return new C1311970kFH(platformRendererContext, i);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C1311970kFH c1311970kFH = this.LLJ;
        if (c1311970kFH != null) {
            c1311970kFH.LIZIZ(canvas, view);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        C1311970kFH c1311970kFH2 = this.LLJ;
        if (c1311970kFH2 != null) {
            c1311970kFH2.getClass();
            canvas.restore();
        }
        return zDrawChild;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LynxUI<ViewGroup> lynxUI;
        C1311970kFH c1311970kFH = this.LLJ;
        if (c1311970kFH != null && (lynxUI = c1311970kFH.LJII) != null) {
            lynxUI.measure();
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
