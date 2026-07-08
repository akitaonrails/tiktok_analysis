package X;

import Y.ARunnableS30S0101000_19;
import android.app.Activity;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0he6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1212040he6 {
    public static final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());

    public static View LIZ(Fragment fragment) {
        View view;
        if (fragment == null || !fragment.isAdded() || !fragment.getUserVisibleHint() || (view = fragment.getView()) == null || !view.isAttachedToWindow()) {
            return null;
        }
        return view;
    }

    public static void LIZIZ(int i, View view) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            LIZLLL(i, view);
        } else {
            C786410Ut5.LJJZZIII(LIZ, new ARunnableS30S0101000_19(i, view, 5));
        }
    }

    public static void LIZJ(int i, Activity activity) {
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(i);
            c1389890mGx.LJIIL(64);
            c1389890mGx.LJIIJJI();
        }
    }

    public static void LIZLLL(int i, View view) {
        if (view != null && view.isAttachedToWindow()) {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIIZ(i);
            c1389890mGx.LJIIL(64);
            c1389890mGx.LJIIJJI();
        }
    }
}
