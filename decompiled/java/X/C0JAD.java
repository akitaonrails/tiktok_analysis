package X;

import Y.ARunnableS40S0300000_7;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RemoteViews;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0JAD, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@RemoteViews.RemoteView
public final class C0JAD extends View {
    public static final BPEAHandler LLILZIL = new BPEAHandler(Looper.getMainLooper());
    public static boolean LLILZLL = false;
    public static final Object LLIZ = new Object();
    public WeakReference<View> LL;
    public C0JAE LLILLJJLI;
    public Set<Integer> LLILLL;
    public boolean LLILZ;

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final boolean hasTransientState() {
        if (!this.LLILZ && !LLILZLL && getParent() != null) {
            LIZIZ(false);
        }
        return super.hasTransientState();
    }

    public C0JAE getInflater() {
        return this.LLILLJJLI;
    }

    public C0JAD(Context context) {
        super(context);
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        setWillNotDraw(true);
    }

    public static void setIsOptOpen(boolean z) {
        LLILZLL = z;
    }

    public final void LIZ(int i) {
        if (this.LLILLL == null) {
            this.LLILLL = new HashSet();
        }
        this.LLILLL.add(Integer.valueOf(i));
    }

    public final View LIZIZ(boolean z) {
        View viewLIZ;
        View view;
        this.LLILZ = true;
        WeakReference<View> weakReference = this.LL;
        if (weakReference != null && (view = weakReference.get()) != null) {
            return view;
        }
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            try {
                viewLIZ = this.LLILLJJLI.LIZ(getContext(), viewGroup, getLayoutParams());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                viewLIZ = null;
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null && viewLIZ != null) {
                C786410Ut5.W5(viewLIZ, layoutParams);
            }
            if (z && Looper.getMainLooper() != Looper.myLooper()) {
                C786410Ut5.LJJZZIII(LLILZIL, new ARunnableS40S0300000_7(viewLIZ, viewGroup, this, 1));
            } else {
                int iIndexOfChild = viewGroup.indexOfChild(this);
                C786410Ut5.LJJLJLI(this, viewGroup);
                viewGroup.addView(viewLIZ, iIndexOfChild);
            }
            this.LL = new WeakReference<>(viewLIZ);
            return viewLIZ;
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    public void setInflater(C0JAE c0jae) {
        this.LLILLJJLI = c0jae;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.LL;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                C786410Ut5.LJLLLLLL(i, view);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i != 0 && i != 4) {
            return;
        }
        C786410Ut5.LJLLLLLL(i, LIZIZ(false));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
