package X;

import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: X.198m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C214906198m extends PopupWindow {
    public static final C214908198o Companion = new C214908198o();
    public boolean prevTouchable;
    public int prevVisibility;

    public final void hookHideTemporary$saf_release() {
        if (this.prevTouchable) {
            setTouchable(false);
            this.prevTouchable = true;
        }
        View contentView = getContentView();
        if (contentView == null) {
            return;
        }
        this.prevVisibility = contentView.getVisibility();
        if (contentView.getVisibility() == 8) {
            return;
        }
        try {
            C786410Ut5.LJLLLLLL(4, contentView);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS112S0100000_12(contentView, 334));
    }

    public final void hookShowIfNeeded$saf_release() {
        if (this.prevTouchable && !isTouchable()) {
            setTouchable(this.prevTouchable);
        }
        View contentView = getContentView();
        if (contentView == null) {
            return;
        }
        try {
            int visibility = contentView.getVisibility();
            int i = this.prevVisibility;
            if (visibility == i) {
                return;
            }
            C786410Ut5.LJLLLLLL(i, contentView);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C214906198m() {
        this.prevTouchable = isTouchable();
    }

    private final View getHookTargetView() {
        return getContentView();
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        InterfaceC214902198i interfaceC214902198i;
        List<C214906198m> list;
        if (C07GT.LIZ()) {
            C214905198l.LIZLLL(new C785400UrS(this));
        } else {
            WeakHashMap<InterfaceC214902198i, List<C214906198m>> weakHashMap = C480900ItU.LIZ;
            synchronized (weakHashMap) {
                try {
                    WeakReference<InterfaceC214902198i> weakReferenceRemove = C480900ItU.LIZIZ.remove(this);
                    if (weakReferenceRemove != null && (interfaceC214902198i = weakReferenceRemove.get()) != null && (list = weakHashMap.get(interfaceC214902198i)) != null) {
                        list.remove(this);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        super.dismiss();
    }

    public C214906198m(Context context) {
        super(context, (AttributeSet) null);
        this.prevTouchable = isTouchable();
    }

    @Override // android.widget.PopupWindow
    public void setTouchable(boolean z) {
        this.prevTouchable = z;
        super.setTouchable(z);
    }

    public C214906198m(View view) {
        super(view);
        this.prevTouchable = isTouchable();
    }

    public C214906198m(int i, int i2) {
        super((View) null, i, i2);
        this.prevTouchable = isTouchable();
    }

    public C214906198m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.prevTouchable = isTouchable();
    }

    public C214906198m(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.prevTouchable = isTouchable();
    }

    public C214906198m(View view, int i, int i2) {
        super(view, i, i2);
        this.prevTouchable = isTouchable();
    }

    public C214906198m(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.prevTouchable = isTouchable();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        InterfaceC214902198i interfaceC214902198iLIZ;
        super.showAsDropDown(view, i, i2, i3);
        if (C07GT.LIZ()) {
            if (view != null) {
                C214905198l.LIZJ(view, new C785400UrS(this));
            }
        } else {
            if (view == null || (interfaceC214902198iLIZ = C480900ItU.LIZ(view)) == null) {
                return;
            }
            WeakHashMap<InterfaceC214902198i, List<C214906198m>> weakHashMap = C480900ItU.LIZ;
            synchronized (weakHashMap) {
                try {
                    List<C214906198m> list = weakHashMap.get(interfaceC214902198iLIZ);
                    if (list == null) {
                        weakHashMap.put(interfaceC214902198iLIZ, C1697810uHb.LJ(this));
                    } else {
                        list.add(this);
                    }
                    C480900ItU.LIZIZ.put(this, new WeakReference<>(interfaceC214902198iLIZ));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(View view, int i, int i2, int i3) {
        InterfaceC214902198i interfaceC214902198iLIZ;
        super.showAtLocation(view, i, i2, i3);
        if (C07GT.LIZ()) {
            if (view != null) {
                C214905198l.LIZJ(view, new C785400UrS(this));
            }
        } else {
            if (view == null || (interfaceC214902198iLIZ = C480900ItU.LIZ(view)) == null) {
                return;
            }
            WeakHashMap<InterfaceC214902198i, List<C214906198m>> weakHashMap = C480900ItU.LIZ;
            synchronized (weakHashMap) {
                try {
                    List<C214906198m> list = weakHashMap.get(interfaceC214902198iLIZ);
                    if (list == null) {
                        weakHashMap.put(interfaceC214902198iLIZ, C1697810uHb.LJ(this));
                    } else {
                        list.add(this);
                    }
                    C480900ItU.LIZIZ.put(this, new WeakReference<>(interfaceC214902198iLIZ));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public C214906198m(View view, int i, int i2, boolean z) {
        super(view, i, i2, z);
        this.prevTouchable = isTouchable();
    }
}
