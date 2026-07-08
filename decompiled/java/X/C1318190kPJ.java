package X;

import Y.ATListenerS453S0100000_20;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.scroll.LynxUIScrollViewInternal;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0kPJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1318190kPJ extends C1318240kPO implements InterfaceC1314720kJi {
    public InterfaceC1314130kIl LLJJIII;

    public void setFooter(View view) {
    }

    public void setHeader(View view) {
    }

    public void setLayoutFromEnd(boolean z) {
    }

    public C1318190kPJ(Context context) {
        super(context);
        setNestedScrollingEnabled(true);
        setOnTouchListener(new ATListenerS453S0100000_20(this, 2));
    }

    @Override // X.InterfaceC1314720kJi
    public final void bindDrawChildHook(InterfaceC1314130kIl interfaceC1314130kIl) {
        this.LLJJIII = interfaceC1314130kIl;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        InterfaceC1314130kIl interfaceC1314130kIl = this.LLJJIII;
        if (interfaceC1314130kIl != null) {
            interfaceC1314130kIl.beforeDispatchDraw(canvas);
        }
        super.dispatchDraw(canvas);
        InterfaceC1314130kIl interfaceC1314130kIl2 = this.LLJJIII;
        if (interfaceC1314130kIl2 != null) {
            interfaceC1314130kIl2.afterDispatchDraw(canvas);
        }
    }

    public void setBackwardNestedScrollMode(int i) {
        this.LLJJI = i;
    }

    public void setForwardNestedScrollMode(int i) {
        this.LLJJ = i;
    }

    public void setVertical(boolean z) {
        this.LLILLL = z;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        InterfaceC1314130kIl interfaceC1314130kIl;
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (!getRootView().isLayoutRequested() && (interfaceC1314130kIl = this.LLJJIII) != null) {
            interfaceC1314130kIl.performMeasureChildrenUI();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean zDrawChild;
        Rect rectBeforeDrawChild;
        InterfaceC1314130kIl interfaceC1314130kIl = this.LLJJIII;
        if (interfaceC1314130kIl != null && (rectBeforeDrawChild = interfaceC1314130kIl.beforeDrawChild(canvas, view, j)) != null) {
            canvas.save();
            canvas.clipRect(rectBeforeDrawChild);
            zDrawChild = super.drawChild(canvas, view, j);
            canvas.restore();
        } else {
            zDrawChild = super.drawChild(canvas, view, j);
        }
        InterfaceC1314130kIl interfaceC1314130kIl2 = this.LLJJIII;
        if (interfaceC1314130kIl2 != null) {
            interfaceC1314130kIl2.afterDrawChild(canvas, view, j);
        }
        return zDrawChild;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        LynxUIScrollViewInternal lynxUIScrollViewInternal = (LynxUIScrollViewInternal) this.LLJ;
        if (lynxUIScrollViewInternal.LL != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - lynxUIScrollViewInternal.LLILLJJLI >= lynxUIScrollViewInternal.LL) {
                int[] scrollOffset = ((C1318220kPM) lynxUIScrollViewInternal.mView).getScrollOffset();
                HashMap<String, Object> map = new HashMap<>();
                map.put("deltaX", Float.valueOf(C1311130kDv.LIZJ(scrollOffset[0] - lynxUIScrollViewInternal.LLILLL[0])));
                map.put("deltaY", Float.valueOf(C1311130kDv.LIZJ(scrollOffset[1] - lynxUIScrollViewInternal.LLILLL[1])));
                lynxUIScrollViewInternal.LJJIJ("scroll", map);
                lynxUIScrollViewInternal.LLILLL = scrollOffset;
                lynxUIScrollViewInternal.LLILLJJLI = jCurrentTimeMillis;
            }
        } else {
            int[] scrollOffset2 = ((C1318220kPM) lynxUIScrollViewInternal.mView).getScrollOffset();
            HashMap<String, Object> map2 = new HashMap<>();
            map2.put("deltaX", Float.valueOf(C1311130kDv.LIZJ(scrollOffset2[0] - lynxUIScrollViewInternal.LLILLL[0])));
            map2.put("deltaY", Float.valueOf(C1311130kDv.LIZJ(scrollOffset2[1] - lynxUIScrollViewInternal.LLILLL[1])));
            lynxUIScrollViewInternal.LJJIJ("scroll", map2);
            lynxUIScrollViewInternal.LLILLL = scrollOffset2;
        }
        lynxUIScrollViewInternal.LJJIJIIJI();
        int[] scrollOffset3 = ((C1318220kPM) lynxUIScrollViewInternal.mView).getScrollOffset();
        boolean z = false;
        for (int i5 = 0; i5 < lynxUIScrollViewInternal.mChildren.size(); i5++) {
            if (((LynxBaseUI) ListProtector.get(lynxUIScrollViewInternal.mChildren, i5)).checkStickyOnParentScroll(scrollOffset3[0], scrollOffset3[1])) {
                z = true;
            }
        }
        if (z) {
            lynxUIScrollViewInternal.invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        InterfaceC1314130kIl interfaceC1314130kIl;
        if (!getRootView().isLayoutRequested() && (interfaceC1314130kIl = this.LLJJIII) != null) {
            interfaceC1314130kIl.performLayoutChildrenUI();
        }
    }
}
