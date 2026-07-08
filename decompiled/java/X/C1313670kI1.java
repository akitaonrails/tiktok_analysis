package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.bytedance.sdui.render.tasm.base.TraceEvent;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0kI1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1313670kI1 extends FrameLayout implements InterfaceC1314700kJg {
    public C1318840kQM mAccessibilityNodeProvider;
    public InterfaceC1314190kIr mDrawChildHook;
    public String mDrawEndFlag;
    public boolean mHasMeaningfulLayout;
    public boolean mHasMeaningfulPaint;
    public long mMeaningfulPaintTiming;
    public boolean mNeedDrawEnd;
    public WeakReference<C1317120kNa> mTimingHandlerRef;

    public void clearMeaningfulFlag() {
        this.mHasMeaningfulLayout = false;
        this.mHasMeaningfulPaint = false;
        this.mMeaningfulPaintTiming = 0L;
    }

    public void notifyMeaningfulLayout() {
        this.mHasMeaningfulLayout = true;
    }

    public long getMeaningfulPaintTiming() {
        return this.mMeaningfulPaintTiming;
    }

    public C1313670kI1(Context context) {
        super(context);
    }

    public void bindAccessibilityNodeProvider(C1318840kQM c1318840kQM) {
        this.mAccessibilityNodeProvider = c1318840kQM;
    }

    @Override // X.InterfaceC1314700kJg
    public void bindDrawChildHook(InterfaceC1314190kIr interfaceC1314190kIr) {
        this.mDrawChildHook = interfaceC1314190kIr;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        InterfaceC1314190kIr interfaceC1314190kIr = this.mDrawChildHook;
        if (interfaceC1314190kIr != null) {
            interfaceC1314190kIr.beforeDispatchDraw(canvas);
        }
        super.dispatchDraw(canvas);
        InterfaceC1314190kIr interfaceC1314190kIr2 = this.mDrawChildHook;
        if (interfaceC1314190kIr2 != null) {
            interfaceC1314190kIr2.afterDispatchDraw(canvas);
        }
        if (this.mHasMeaningfulLayout && !this.mHasMeaningfulPaint) {
            TraceEvent.LIZ("FirstMeaningfulPaint");
            this.mMeaningfulPaintTiming = System.currentTimeMillis();
            this.mHasMeaningfulPaint = true;
        }
        if (this.mNeedDrawEnd) {
            C1317120kNa c1317120kNa = this.mTimingHandlerRef.get();
            if (c1317120kNa != null) {
                String str = this.mDrawEndFlag;
                if (TextUtils.isEmpty(str)) {
                    TraceEvent.LIZ("setup_draw_end");
                    c1317120kNa.LIZJ(System.currentTimeMillis(), "setup_draw_end", null);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("update_draw_end.");
                    sbLIZ.append(str);
                    TraceEvent.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    c1317120kNa.LIZJ(System.currentTimeMillis(), "update_draw_end", str);
                }
            }
            this.mNeedDrawEnd = false;
            this.mDrawEndFlag = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        C1318840kQM c1318840kQM = this.mAccessibilityNodeProvider;
        if (c1318840kQM == null) {
            return onHoverEvent(motionEvent);
        }
        c1318840kQM.getClass();
        motionEvent.getX();
        motionEvent.getY();
        throw null;
    }

    @Override // android.view.ViewGroup
    public void setChildrenDrawingOrderEnabled(boolean z) {
        super.setChildrenDrawingOrderEnabled(z);
    }

    public void setTimingHandler(C1317120kNa c1317120kNa) {
        this.mTimingHandlerRef = new WeakReference<>(c1317120kNa);
    }

    public C1313670kI1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        InterfaceC1314190kIr interfaceC1314190kIr = this.mDrawChildHook;
        if (interfaceC1314190kIr != null) {
            return interfaceC1314190kIr.getChildDrawingOrder(i, i2);
        }
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 2048) {
            accessibilityEvent.setSource(this);
        }
        return super.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public void updateDrawEndTimingState(boolean z, String str) {
        if (!z) {
            return;
        }
        this.mNeedDrawEnd = z;
        this.mDrawEndFlag = str;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean zDrawChild;
        Rect rectBeforeDrawChild;
        InterfaceC1314190kIr interfaceC1314190kIr = this.mDrawChildHook;
        if (interfaceC1314190kIr != null && (rectBeforeDrawChild = interfaceC1314190kIr.beforeDrawChild(canvas, view, j)) != null) {
            canvas.save();
            canvas.clipRect(rectBeforeDrawChild);
            zDrawChild = super.drawChild(canvas, view, j);
            canvas.restore();
        } else {
            zDrawChild = super.drawChild(canvas, view, j);
        }
        InterfaceC1314190kIr interfaceC1314190kIr2 = this.mDrawChildHook;
        if (interfaceC1314190kIr2 != null) {
            interfaceC1314190kIr2.afterDrawChild(canvas, view, j);
        }
        return zDrawChild;
    }
}
