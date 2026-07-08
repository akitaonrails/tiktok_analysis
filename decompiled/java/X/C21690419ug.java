package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19ug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21690419ug extends FrameLayout implements InterfaceC21690919ul {
    public C21690519uh mViewOptHelper;

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        int i;
        C21690519uh c21690519uh = this.mViewOptHelper;
        if (c21690519uh == null) {
            super.requestLayout();
            return;
        }
        if (!c21690519uh.LIZJ) {
            c21690519uh.LIZLLL.requestLayoutDelegate();
            return;
        }
        if (!c21690519uh.LIZIZ) {
            c21690519uh.LIZLLL.requestLayoutDelegate();
            return;
        }
        if (Looper.getMainLooper().getThread() != C786410Ut5.u3()) {
            final String str = "Only the original thread that created a view hierarchy can touch its views.";
            throw new AndroidRuntimeException(str) { // from class: X.19uk
            };
        }
        try {
            Object obj = c21690519uh.LJFF.LIZ.get(c21690519uh.LIZLLL);
            if (obj != null) {
                i = c21690519uh.LJFF.LIZLLL.getInt(obj);
                if (i != 0) {
                    C21690619ui c21690619ui = c21690519uh.LJFF;
                    c21690619ui.LIZLLL.setInt(obj, c21690619ui.LJI | i);
                }
            } else {
                i = 0;
            }
            c21690519uh.LIZLLL.requestLayoutDelegate();
            if (obj == null || i == 0) {
                return;
            }
            c21690519uh.LJFF.LIZLLL.setInt(obj, i);
            if (c21690519uh.LIZ) {
                return;
            }
            c21690519uh.LJ.postOnAnimation(c21690519uh.LJI);
            View view = c21690519uh.LJ;
            RunnableC1700570uM3 runnableC1700570uM3 = C21690519uh.LJIIIIZZ;
            HandlerHook.viewRemoveCallbacks(view, runnableC1700570uM3);
            ViewTreeObserver viewTreeObserver = c21690519uh.LJ.getViewTreeObserver();
            if (viewTreeObserver != null) {
                runnableC1700570uM3.LL = viewTreeObserver;
            }
            c21690519uh.LJ.postOnAnimation(runnableC1700570uM3);
            c21690519uh.LIZ = true;
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            c21690519uh.LIZLLL.requestLayoutDelegate();
        }
    }

    @Override // X.InterfaceC21690919ul
    public void requestLayoutDelegate() {
        super.requestLayout();
    }

    public void requestLayoutMarginChanged() {
        super.requestLayout();
    }

    public C21690419ug(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setHasFixSize(boolean z) {
        if (this.mViewOptHelper == null) {
            this.mViewOptHelper = new C21690519uh(this);
        }
        this.mViewOptHelper.LIZIZ = z;
    }

    public C21690419ug(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C21690419ug(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
