package X;

import X.C16GX;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.render.PlatformRendererContext;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.zhiliaoapp.musically.R;
import j27.s;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0kR6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1319300kR6<T extends C16GX> extends C16G0 implements InterfaceC1311940kFE {
    public boolean LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public T LLJLIL;
    public C21543519Sv LLJLILLLLZIIL;
    public C19V8 LLJLL;
    public C1311970kFH LLJLLIL;

    public abstract int getLayoutIntRes();

    @Override // X.InterfaceC1311940kFE
    public View getView() {
        return this;
    }

    public abstract void setScrollEnable(boolean z);

    public final T getAppBarLayout() {
        return this.LLJLIL;
    }

    public final C21543519Sv getCollapsingToolbarLayout() {
        return this.LLJLILLLLZIIL;
    }

    public final C19V8 getFoldToolBar() {
        return this.LLJLL;
    }

    public final T getMAppBarLayout() {
        return this.LLJLIL;
    }

    public final C21543519Sv getMCollapsingToolbarLayout() {
        return this.LLJLILLLLZIIL;
    }

    public final C19V8 getMFoldToolBar() {
        return this.LLJLL;
    }

    public final int getMInitScrollFlag() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public final boolean getMScrollEnable() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC1311940kFE
    public C1311970kFH getRenderer() {
        return this.LLJLLIL;
    }

    public AbstractC1319300kR6(Context context) {
        new LinkedHashMap();
        super(context, null);
        this.LLJJL = true;
        if (context instanceof s) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("context is: ");
            sbLIZ.append(((ContextWrapper) context).getBaseContext());
            LynxLog.i("FoldToolbarLayout", C2188811AlT.LIZIZ(sbLIZ));
        }
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), getLayoutIntRes(), this, true);
        this.LLJLIL = (T) findViewById(R.id.b6m);
        this.LLJLILLLLZIIL = (C21543519Sv) findViewById(R.id.e6d);
        this.LLJLL = (C19V8) findViewById(R.id.x_fold_toolbar);
        C786410Ut5.W5(viewTd, new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = this.LLJLILLLLZIIL.getLayoutParams();
        if (layoutParams instanceof C16GZ) {
            this.LLJJLIIIJLLLLLLLZ = ((C16GZ) layoutParams).LIZ;
        }
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        ViewGroup.LayoutParams layoutParams = this.LLJLIL.getLayoutParams();
        if (layoutParams != null) {
            C16BC c16bc = ((C16G1) layoutParams).LIZ;
            if (this.LLJL && (c16bc instanceof AppBarLayout$Behavior)) {
                C16GU c16gu = (C16GU) c16bc;
                if (c16gu.getTopAndBottomOffset() >= 0) {
                    if (i > 0) {
                        if (c16gu.getTopAndBottomOffset() == 0) {
                            return true;
                        }
                    } else if (i < 0 && c16gu.getTopAndBottomOffset() == 0) {
                        return false;
                    }
                    return super.canScrollVertically(i);
                }
                return true;
            }
            return super.canScrollVertically(i);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C1311970kFH c1311970kFH = this.LLJLLIL;
        if (c1311970kFH != null) {
            c1311970kFH.LIZ(canvas);
        }
    }

    @Override // X.C16G0, android.view.View
    public final void onDraw(Canvas canvas) {
        C1311970kFH c1311970kFH = this.LLJLLIL;
        if (c1311970kFH != null) {
            c1311970kFH.LJ(canvas);
        } else {
            super.onDraw(canvas);
        }
    }

    public final void setCompatContainerPopup(boolean z) {
        this.LLJL = z;
    }

    public final void setMAppBarLayout(T t) {
        this.LLJLIL = t;
    }

    public final void setMCollapsingToolbarLayout(C21543519Sv c21543519Sv) {
        this.LLJLILLLLZIIL = c21543519Sv;
    }

    public final void setMFoldToolBar(C19V8 c19v8) {
        this.LLJLL = c19v8;
    }

    public final void setMInitScrollFlag(int i) {
        this.LLJJLIIIJLLLLLLLZ = i;
    }

    public final void setMScrollEnable(boolean z) {
        this.LLJJL = z;
    }

    @Override // X.InterfaceC1311940kFE
    public void setRenderer(C1311970kFH c1311970kFH) {
        this.LLJLLIL = c1311970kFH;
    }

    @Override // X.InterfaceC1311940kFE
    public final C1311970kFH createRenderer(PlatformRendererContext platformRendererContext, int i) {
        return new C1311970kFH(platformRendererContext, i);
    }

    @Override // X.C16G0, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C1311970kFH c1311970kFH = this.LLJLLIL;
        if (c1311970kFH != null) {
            c1311970kFH.LIZIZ(canvas, view);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (this.LLJLLIL != null) {
            canvas.restore();
        }
        return zDrawChild;
    }

    @Override // X.C16G0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LynxUI<ViewGroup> lynxUI;
        C1311970kFH c1311970kFH = this.LLJLLIL;
        if (c1311970kFH != null && (lynxUI = c1311970kFH.LJII) != null) {
            lynxUI.measure();
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}
