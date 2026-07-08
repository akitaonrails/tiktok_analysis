package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.Deque;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0eW9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1091790eW9 extends ConstraintLayout implements InterfaceC1090410eTv {
    public C1090400eTu LL;
    public int LLILLJJLI;

    @Override // X.InterfaceC1090410eTv
    public final void LLJL() {
        this.LLILLJJLI++;
    }

    @Override // X.InterfaceC1090410eTv
    public C1090400eTu getCacheHelper() {
        if (this.LL == null) {
            this.LL = new C1090400eTu();
        }
        return this.LL;
    }

    @Override // X.InterfaceC1090410eTv
    public int getCallCount() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1090410eTv
    public final void LLZZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        try {
            return super.dispatchApplyWindowInsets(windowInsets);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            String strLIZIZ = C2450809j0.LIZIZ(this);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("current view ids: ");
            sbLIZ.append(strLIZIZ);
            e.addSuppressed(new Exception(C2188811AlT.LIZIZ(sbLIZ)));
            throw e;
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1090380eTs.LIZ(this, layoutParams);
    }

    public C1091790eW9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void e0(View view, Deque deque) {
        Object parent = view.getParent();
        if (parent == null) {
            return;
        }
        View view2 = (View) parent;
        if (view2.getId() == 16908290) {
            ((ArrayDeque) deque).push(C2450809j0.LIZ(view2));
        } else {
            ((ArrayDeque) deque).push(C2450809j0.LIZ(view));
            e0(view2, deque);
        }
    }

    public C1091790eW9(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) throws Exception {
        try {
            return super.drawChild(canvas, view, j);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sb = new StringBuilder("current view id:");
            sb.append(C2450809j0.LIZ(this));
            sb.append(", child(");
            sb.append(view.getClass().getSimpleName());
            sb.append(")'s id: ");
            sb.append(C2450809j0.LIZ(view));
            sb.append(", coordinate: [");
            ArrayDeque arrayDeque = new ArrayDeque();
            e0(this, arrayDeque);
            while (!arrayDeque.isEmpty()) {
                sb.append((String) arrayDeque.pop());
                if (arrayDeque.peek() != null) {
                    sb.append(", ");
                }
            }
            sb.append(e3.f);
            e.addSuppressed(new RuntimeException(sb.toString()));
            throw e;
        }
    }
}
