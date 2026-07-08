package X;

import Y.ARunnableS116S0100000_16;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.1887, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1887 {
    public final View LIZ;
    public final LifecycleCoroutineScope LIZIZ;
    public final int LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public AnonymousClass0956 LJIIIIZZ;

    public static void LIZ(View view) {
        view.animate().translationY(C418440Gaw.LIZIZ(-7)).setDuration(300L).withEndAction(new ARunnableS116S0100000_16(view, 11)).start();
    }

    public AnonymousClass1887(View view, LifecycleCoroutineScope lifecycleCoroutineScope) {
        this.LIZ = view;
        this.LIZIZ = lifecycleCoroutineScope;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LIZLLL = C452501pT.LIZ(enumC452301pR, new AwS576S0100000_32(this, 43));
        this.LJ = C452501pT.LIZ(enumC452301pR, new AwS576S0100000_32(this, 45));
        this.LJFF = C452501pT.LIZ(enumC452301pR, new AwS576S0100000_32(this, 44));
        this.LJI = C452501pT.LIZ(enumC452301pR, new AwS576S0100000_32(this, 46));
        this.LJII = C452501pT.LIZ(enumC452301pR, new AwS576S0100000_32(this, 42));
    }
}
