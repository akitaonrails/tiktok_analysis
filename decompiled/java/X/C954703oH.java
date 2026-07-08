package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03oH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C954703oH {
    public static long LIZJ;
    public static WeakReference<Activity> LIZLLL;
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(349));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(350));
    public static final List<C03XI> LJ = C1697810uHb.LJIILJJIL(C03XH.LIZ(R.layout.arr, 1), C03XH.LIZ(R.layout.ars, 1), C03XH.LIZ(R.layout.b31, 1), C03XH.LIZ(R.layout.b32, 1), C03XH.LIZ(R.layout.arw, 1), C03XH.LIZ(R.layout.akz, 1), C03XH.LIZ(R.layout.arn, 1), C03XH.LIZ(R.layout.as1, 1), C03XH.LIZ(R.layout.arx, 2), C03XH.LIZ(R.layout.ary, 3), C03XH.LIZ(R.layout.at6, 1), C03XH.LIZ(R.layout.au4, 1), C03XH.LIZ(R.layout.arc, 2), C03XH.LIZ(R.layout.b3a, 1), C03XH.LIZ(R.layout.b3k, 1), C03XH.LIZ(R.layout.azl, 1), C03XH.LIZ(R.layout.ayx, 5), C03XH.LIZ(R.layout.ayu, 10), C03XH.LIZ(R.layout.bob, 2), C03XH.LIZ(R.layout.atl, 1), C03XH.LIZ(R.layout.au_, 1), C03XH.LIZ(R.layout.au7, 1), C03XH.LIZ(R.layout.ath, 1), C03XH.LIZ(R.layout.b3j, 1), C03XH.LIZ(R.layout.arl, 1), C03XH.LIZ(R.layout.att, 1), C03XH.LIZ(R.layout.ark, 2), C03XH.LIZ(R.layout.az_, 1), C03XH.LIZ(R.layout.azc, 1), C03XH.LIZ(R.layout.azb, 5), C03XH.LIZ(R.layout.az8, 1), C03XH.LIZ(R.layout.az9, 1), C03XH.LIZ(R.layout.aza, 2), C03XH.LIZ(R.layout.b35, 1));

    public static void LIZJ(Activity activity) {
        SystemClock.elapsedRealtime();
        ((C940303lx) LIZ.getValue()).LIZ(activity, Collections.singletonList(C03XH.LIZ(R.layout.ar3, 1)), null);
    }

    public static void LIZIZ(Activity activity, boolean z) {
        Activity activity2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!z) {
            WeakReference<Activity> weakReference = LIZLLL;
            if (weakReference != null) {
                activity2 = weakReference.get();
            } else {
                activity2 = null;
            }
            if (Intrinsics.LJFF(activity, activity2) && jElapsedRealtime - LIZJ < ((Number) LIZIZ.getValue()).longValue()) {
                return;
            }
        }
        LIZLLL = new WeakReference<>(activity);
        SystemClock.elapsedRealtime();
        ((C940303lx) LIZ.getValue()).LIZ(activity, LJ, null);
        LIZJ = SystemClock.elapsedRealtime();
    }

    public static View LIZ(Context context, int i, ViewGroup viewGroup, boolean z) {
        return ((C940303lx) LIZ.getValue()).inflate(context, i, viewGroup, z);
    }
}
