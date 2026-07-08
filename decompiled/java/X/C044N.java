package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.044N, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C044N implements InterfaceC201986141o {
    public static WeakReference<Activity> LIZJ;
    public static final C044N LIZ = new C044N();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(351));
    public static final List<C03XI> LIZLLL = C1697810uHb.LJIILJJIL(C03XH.LIZ(R.layout.azf, 1), C03XH.LIZ(R.layout.az5, 1), C03XH.LIZ(R.layout.b3c, 1), C03XH.LIZ(R.layout.azh, 1), C03XH.LIZ(R.layout.azn, 3), C03XH.LIZ(R.layout.b3a, 1), C03XH.LIZ(R.layout.b3f, 1), C03XH.LIZ(R.layout.az0, 1), C03XH.LIZ(R.layout.an8, 1), C03XH.LIZ(R.layout.ayu, 1), C03XH.LIZ(R.layout.aok, 1), C03XH.LIZ(R.layout.an8, 5), C03XH.LIZ(R.layout.ayu, 6), C03XH.LIZ(R.layout.aok, 4), C03XH.LIZ(R.layout.az6, 1), C03XH.LIZ(R.layout.an8, 6), C03XH.LIZ(R.layout.ayu, 7), C03XH.LIZ(R.layout.aok, 5), C03XH.LIZ(R.layout.azk, 3), C03XH.LIZ(R.layout.asu, 1), C03XH.LIZ(R.layout.b3e, 1), C03XH.LIZ(R.layout.b2g, 1));

    public static void LIZJ(long j, Context context) {
        Activity activityLIZ;
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(activityLIZ, 1649);
            if (j > 0) {
                C817503Hh c817503Hh = C817503Hh.LL;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C01RA(j, activityLIZ, awS545S0100000_1, null), 2);
                return;
            }
            awS545S0100000_1.invoke();
        }
    }

    public static View LIZIZ(Context context, int i, ViewGroup viewGroup) {
        Activity activity;
        Activity activityLIZ = C1388190mED.LIZ(context);
        WeakReference<Activity> weakReference = LIZJ;
        if (weakReference != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        if (Intrinsics.LJFF(activityLIZ, activity)) {
            LIZJ = null;
        }
        return ((C940303lx) LIZIZ.getValue()).inflate(context, i, viewGroup, false);
    }

    @Override // X.InterfaceC201986141o
    public final void LIZ(Context context, int i, View view, Function1 function1) {
        ViewGroup viewGroup;
        if (view instanceof ViewGroup) {
            viewGroup = (ViewGroup) view;
        } else {
            viewGroup = null;
        }
        function1.invoke(LIZIZ(context, i, viewGroup));
    }
}
