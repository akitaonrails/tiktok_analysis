package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.15vD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20674515vD {
    public final WeakReference<FrameLayout> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final WeakReference<Context> LIZLLL;
    public final C01GW LJ = C1935107i1.LIZ(new AwS575S0100000_31(this, 1357));
    public AnonymousClass0956 LJFF;

    public final void LIZ() {
        View view = (View) this.LJ.getValue();
        if (view == null) {
            this.LIZIZ.invoke();
            return;
        }
        AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(this, 371);
        C786410Ut5.T4(view, 1.0f);
        view.animate().alpha(0.0f).setDuration(250L).withEndAction(new RunnableC514501zT(awS610S0100000_31, view, 27));
    }

    public C20674515vD(C19EG c19eg, WeakReference weakReference, AwS575S0100000_31 awS575S0100000_31, AwS575S0100000_31 awS575S0100000_312) {
        this.LIZ = weakReference;
        this.LIZIZ = awS575S0100000_31;
        this.LIZJ = awS575S0100000_312;
        this.LIZLLL = new WeakReference<>(c19eg);
    }
}
