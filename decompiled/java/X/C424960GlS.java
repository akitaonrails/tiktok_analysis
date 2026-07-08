package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0GlS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424960GlS extends FrameLayout {
    public float LL;
    public float LLILLJJLI;
    public final int LLILLL;
    public boolean LLILZ;
    public final List<InterfaceC424970GlT> LLILZIL;
    public boolean LLILZLL;

    public final void LIZ() {
        ViewGroup viewGroup;
        this.LL = 0.0f;
        this.LLILLJJLI = 0.0f;
        this.LLILZ = false;
        this.LLILZLL = false;
        ((ArrayList) this.LLILZIL).clear();
        ViewParent parent = getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this, viewGroup);
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
    }

    public C424960GlS(Context context) {
        super(context, null);
        this.LLILLL = 50;
        this.LLILZIL = new ArrayList();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2 && ((motionEvent.getRawX() != this.LL || motionEvent.getRawY() != this.LLILLJJLI) && Math.abs(motionEvent.getRawX() - this.LL) < Math.abs(motionEvent.getRawY() - this.LLILLJJLI) && motionEvent.getRawY() < this.LLILLJJLI && !this.LLILZLL)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("requestDisallow false, instance = ");
                    sbLIZ.append(motionEvent.getRawY() - this.LLILLJJLI);
                    C20441214yg.LIZIZ("LiveExtraCardContainer", C2188811AlT.LIZIZ(sbLIZ));
                    getParent().requestDisallowInterceptTouchEvent(false);
                    this.LLILZ = false;
                    return zDispatchTouchEvent;
                }
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
                this.LLILZ = false;
                if (Math.abs(motionEvent.getRawX() - this.LL) < Math.abs(motionEvent.getRawY() - this.LLILLJJLI) && motionEvent.getRawY() > this.LLILLJJLI && motionEvent.getRawY() - this.LLILLJJLI > this.LLILLL) {
                    Iterator<InterfaceC424970GlT> it2 = this.LLILZIL.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ();
                    }
                }
            }
            return zDispatchTouchEvent;
        }
        this.LL = motionEvent.getRawX();
        this.LLILLJJLI = motionEvent.getRawY();
        getParent().requestDisallowInterceptTouchEvent(true);
        this.LLILZ = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.LLILZLL = z;
        if (this.LLILZ && !z) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }
}
