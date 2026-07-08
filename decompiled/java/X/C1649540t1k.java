package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: X.0t1k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1649540t1k extends FrameLayout {
    public final LinkedHashSet<InterfaceC1649550t1l> LL;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            Iterator<InterfaceC1649550t1l> it2 = this.LL.iterator();
            while (it2.hasNext()) {
                if (it2.next().LIZ(motionEvent)) {
                    return true;
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        } catch (NullPointerException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return false;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        } catch (NullPointerException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return false;
        }
    }

    public C1649540t1k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new LinkedHashSet<>();
    }
}
