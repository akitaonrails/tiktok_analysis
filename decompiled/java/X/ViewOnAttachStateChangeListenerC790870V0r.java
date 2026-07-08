package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0V0r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ViewOnAttachStateChangeListenerC790870V0r implements View.OnAttachStateChangeListener {
    public static final Map<Integer, ViewOnAttachStateChangeListenerC790870V0r> LLIZ = new ConcurrentHashMap();
    public static final List<String> LLIZLLLIL = new ArrayList();
    public final WeakReference<Fragment> LL;
    public final String LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final Set<ViewOnAttachStateChangeListenerC790870V0r> LLILZIL;
    public ViewOnAttachStateChangeListenerC790870V0r LLILZLL;

    public ViewOnAttachStateChangeListenerC790870V0r(Fragment fragment) {
        String name;
        this.LL = new WeakReference<>(fragment);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C19EG activity = fragment.getActivity();
        if (activity != null) {
            name = activity.getClass().getName();
        } else {
            name = null;
        }
        sbLIZ.append(name);
        sbLIZ.append('@');
        sbLIZ.append(fragment.getClass().getName());
        this.LLILLJJLI = C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZIL = new HashSet();
    }

    public final void LIZ(boolean z) {
        boolean z2;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        if (z == this.LLILZ) {
            return;
        }
        ViewOnAttachStateChangeListenerC790870V0r viewOnAttachStateChangeListenerC790870V0r = this.LLILZLL;
        if (viewOnAttachStateChangeListenerC790870V0r == null) {
            z2 = this.LLILLL;
        } else {
            z2 = viewOnAttachStateChangeListenerC790870V0r.LLILZ;
        }
        Boolean boolValueOf3 = Boolean.valueOf(z2);
        Fragment fragment = this.LL.get();
        String name = null;
        if (fragment != null) {
            boolValueOf = Boolean.valueOf(fragment.isVisible());
        } else {
            boolValueOf = null;
        }
        Fragment fragment2 = this.LL.get();
        if (fragment2 != null) {
            boolValueOf2 = Boolean.valueOf(fragment2.getUserVisibleHint());
        } else {
            boolValueOf2 = null;
        }
        boolean z3 = false;
        if (boolValueOf3 != null && boolValueOf3.booleanValue() && boolValueOf != null && boolValueOf.booleanValue() && boolValueOf2 != null && boolValueOf2.booleanValue()) {
            z3 = true;
        }
        if (z3 != this.LLILZ) {
            this.LLILZ = z3;
            if (z3) {
                Fragment fragment3 = this.LL.get();
                if (fragment3 != null) {
                    C790880V0s.LIZ(fragment3);
                }
            } else {
                Fragment fragment4 = this.LL.get();
                if (fragment4 != null) {
                    List<String> list = LLIZLLLIL;
                    synchronized (list) {
                        try {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            C19EG activity = fragment4.getActivity();
                            if (activity != null) {
                                name = activity.getClass().getName();
                            }
                            sbLIZ.append(name);
                            sbLIZ.append('@');
                            sbLIZ.append(fragment4.getClass().getName());
                            ((ArrayList) list).remove(C2188811AlT.LIZIZ(sbLIZ));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
            if (!((HashSet) this.LLILZIL).isEmpty()) {
                Iterator it2 = ((HashSet) this.LLILZIL).iterator();
                while (it2.hasNext()) {
                    ((ViewOnAttachStateChangeListenerC790870V0r) it2.next()).LIZ(z3);
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        LIZ(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        LIZ(false);
    }
}
