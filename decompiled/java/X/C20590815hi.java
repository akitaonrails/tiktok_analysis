package X;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.Observer;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15hi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20590815hi implements Observer<C20591115hl> {
    public static WeakReference<Activity> LLILLJJLI;
    public static final C20590815hi LL = new C20590815hi();
    public static final C01GW LLILLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(94));

    public static final C19389510tR LIZ(View view) {
        View decorView;
        Activity activity;
        Window window;
        if (view != null && view.getWidth() > 0 && view != null && view.getHeight() > 0 && view != null && view.isAttachedToWindow()) {
            float width = view.getWidth();
            C01GW c01gw = LLILLL;
            return new C19389510tR(width / ((DisplayMetrics) c01gw.getValue()).density, view.getHeight() / ((DisplayMetrics) c01gw.getValue()).density);
        }
        WeakReference<Activity> weakReference = LLILLJJLI;
        if (weakReference != null && (activity = weakReference.get()) != null && (window = activity.getWindow()) != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        return C20591015hk.LIZJ(decorView).LIZIZ;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C20591115hl c20591115hl) {
        WeakReference<View> weakReference;
        View view;
        CopyOnWriteArraySet copyOnWriteArraySet;
        C20591115hl c20591115hl2 = c20591115hl;
        if (c20591115hl2 != null && (weakReference = c20591115hl2.LJIIJJI) != null && (view = weakReference.get()) != null) {
            Object obj = C20591015hk.LJFF(view).get(Integer.valueOf(R.id.z1q));
            if ((obj instanceof CopyOnWriteArraySet) && (copyOnWriteArraySet = (CopyOnWriteArraySet) obj) != null) {
                Iterator it2 = copyOnWriteArraySet.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw null;
                }
            }
        }
    }
}
