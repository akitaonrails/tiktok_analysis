package X;

import Y.ACListenerS154S0100000_19;
import android.view.View;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0icr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1249710icr {
    public final C19EG LIZ;
    public final float LIZIZ;
    public final int LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2841));
    public final C01GW LJ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS563S0100000_19(this, 2842));
    public final ACListenerS154S0100000_19 LJFF = new ACListenerS154S0100000_19(this, 208);
    public final C1266190j3R LJI = new C1266190j3R(this, 6);

    public final View LIZ() {
        return (View) this.LIZLLL.getValue();
    }

    public C1249710icr(C19EG c19eg) {
        this.LIZ = c19eg;
        this.LIZIZ = C12ES.LIZJ(250.0f, c19eg);
        this.LIZJ = C497820Jfg.LIZIZ(c19eg);
    }

    public final void LIZIZ(int i) {
        View viewLIZ;
        View viewLIZ2 = LIZ();
        if ((viewLIZ2 != null && viewLIZ2.getVisibility() == i) || (viewLIZ = LIZ()) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(i, viewLIZ);
    }
}
