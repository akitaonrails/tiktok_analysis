package X;

import Y.ARunnableS106S0100000_6;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Gwj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431950Gwj {
    public final View LIZ;
    public final LifecycleCoroutineScope LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public AnonymousClass0956 LJFF;

    public final void LIZIZ() {
        AnonymousClass0956 anonymousClass0956 = this.LJFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJFF = null;
        View view = (View) this.LIZJ.getValue();
        view.animate().cancel();
        C786410Ut5.ed(view, 0.0f);
        View view2 = (View) this.LIZLLL.getValue();
        view2.animate().cancel();
        C786410Ut5.ed(view2, 0.0f);
        View view3 = (View) this.LJ.getValue();
        view3.animate().cancel();
        C786410Ut5.ed(view3, 0.0f);
    }

    public static void LIZ(View view) {
        view.animate().translationY(C418440Gaw.LIZIZ(-7)).setDuration(300L).withEndAction(new ARunnableS106S0100000_6(view, 155)).start();
    }

    public C431950Gwj(View view, LifecycleCoroutineScope lifecycleCoroutineScope) {
        this.LIZ = view;
        this.LIZIZ = lifecycleCoroutineScope;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LIZJ = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 1081));
        this.LIZLLL = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 1083));
        this.LJ = C452501pT.LIZ(enumC452301pR, new AwS550S0100000_6(this, 1082));
    }
}
