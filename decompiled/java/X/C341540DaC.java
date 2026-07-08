package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS473S0200000_4;

/* JADX INFO: renamed from: X.0DaC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341540DaC {
    public static final void LIZ(Activity activity, Function0<Unit> function0) {
        C566110MIf.LIZ.getClass();
        C566110MIf.LIZLLL("show");
        if (activity != null) {
            if (C0DHG.LIZ() && C1388190mED.LIZ(activity) != null) {
                C632670Orh.LIZIZ(activity, new C19719212De(1663876645, new AwS473S0200000_4(activity, (Activity) function0, (Function0<Unit>) 0), true));
                return;
            }
            C1397580mTM c1397580mTM = new C1397580mTM(activity);
            c1397580mTM.LJI(activity.getResources().getString(2131825854));
            c1397580mTM.LIZIZ(activity.getResources().getString(2131825853));
            C985403tE.LIZ(c1397580mTM, new AwS370S0200000_4(activity, (Activity) function0, (Function0<Unit>) 2));
            c1397580mTM.LJIIIIZZ = false;
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }
}
