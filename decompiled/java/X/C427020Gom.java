package X;

import Y.ARunnableS106S0100000_6;
import Y.ARunnableS11S1100000_6;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import com.ss.android.ugc.aweme.component.nativecountdownlabel.AnoleCountDownModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gom, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427020Gom {
    public final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS192S0000000_6.get$arr$(597));
    public Function1<? super String, Unit> LIZIZ = AFwS236S0000000_6.get$arr$(558);
    public Function1<? super Boolean, Unit> LIZJ = AFwS236S0000000_6.get$arr$(559);
    public Function0<Unit> LIZLLL = AFwS192S0000000_6.get$arr$(596);
    public AnoleCountDownModel LJ;
    public ValueAnimator LJFF;
    public boolean LJI;
    public ARunnableS11S1100000_6 LJII;

    public final void LIZ(Function0<Unit> function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII((Handler) this.LIZ.getValue(), new ARunnableS106S0100000_6((Function0) function0, 315));
        }
    }
}
