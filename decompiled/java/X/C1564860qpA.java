package X;

import Y.ARunnableS57S0300000_24;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.ss.android.ugc.aweme.tako.lazy.TakoLazyCache$addOwnerDestroyObserver$1;
import com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qpA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564860qpA {
    /* JADX WARN: Type inference failed for: r0v9, types: [T, com.ss.android.ugc.aweme.tako.lazy.TakoLazyCache$addOwnerDestroyObserver$1] */
    public static final void LIZ(TakoBaseFragment takoBaseFragment, EnumC1564840qp8 enumC1564840qp8, int i, String str, Function0 function0) {
        CopyOnWriteArrayList<C1564850qp9> copyOnWriteArrayList;
        LifecycleObserver lifecycleObserver;
        C19EG activity = takoBaseFragment.getActivity();
        C1564850qp9 c1564850qp9 = new C1564850qp9(i, str, !Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()), enumC1564840qp8, function0);
        if (enumC1564840qp8.getCache$tako_release().LIZ) {
            if (C1564870qpB.LIZIZ == null) {
                C1564870qpB.LIZIZ = AFwS264S0000000_24.get$arr$(440);
            }
            if (C1564870qpB.LIZJ == null) {
                C1564870qpB.LIZJ = AFwS264S0000000_24.get$arr$(441);
            }
            if (C1564870qpB.LIZLLL == null) {
                C1564870qpB.LIZLLL = AFwS264S0000000_24.get$arr$(442);
            }
            C1564870qpB.LIZJ(c1564850qp9);
            return;
        }
        C1564830qp7 cache$tako_release = enumC1564840qp8.getCache$tako_release();
        cache$tako_release.getClass();
        if (i == C0CMR.TOP_PRIORITY.getType()) {
            copyOnWriteArrayList = cache$tako_release.LIZIZ;
        } else if (i == C0CMR.HIGH_PRIORITY.getType()) {
            copyOnWriteArrayList = cache$tako_release.LIZJ;
        } else {
            copyOnWriteArrayList = cache$tako_release.LIZLLL;
        }
        if (copyOnWriteArrayList == cache$tako_release.LIZLLL) {
            copyOnWriteArrayList.add(0, c1564850qp9);
        } else {
            copyOnWriteArrayList.add(c1564850qp9);
        }
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS57S0300000_24(cache$tako_release, takoBaseFragment, c1564850qp9, 5));
            return;
        }
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new TakoLazyCache$addOwnerDestroyObserver$1(cache$tako_release, c1564850qp9, takoBaseFragment, c259800zU);
        Lifecycle lifecycle = takoBaseFragment.getLifecycle();
        T t = c259800zU.element;
        if (t == 0) {
            lifecycleObserver = null;
        } else {
            lifecycleObserver = (LifecycleObserver) t;
        }
        lifecycle.addObserver(lifecycleObserver);
    }
}
