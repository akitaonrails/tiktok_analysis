package X;

import Y.ACListenerS137S0100000_2;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0zKW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891820zKW implements InterfaceC730350Skr {
    public boolean LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(671));
    public Function1<? super Boolean, Unit> LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC730350Skr
    public final AbstractC1906720ziY LIZJ() {
        return null;
    }

    public final C1891940zKi LJ() {
        return (C1891940zKi) this.LIZJ.getValue();
    }

    public final C1891790zKT LJFF() {
        return (C1891790zKT) this.LIZIZ.getValue();
    }

    public C1891820zKW(C1895007bY c1895007bY) {
        this.LIZIZ = C452501pT.LIZIZ(new AwS572S0100000_28(c1895007bY, 916));
    }

    @Override // X.InterfaceC730350Skr
    public final void LIZ(long j) {
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1891800zKU(this, j, null), 3);
    }

    @Override // X.InterfaceC730350Skr
    public final void LIZLLL(Aweme aweme) {
        boolean zLJI = MethodIDManager.LJI(202344);
        this.LJ = false;
        this.LIZ = false;
        LJ().LLILZLL.LJFF(null);
        LJFF().LIZJ(aweme);
        LJFF().LJ = 0L;
        LIZ(3L);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC730350Skr
    public final void LIZIZ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, Context context, Aweme aweme, Function1<? super Boolean, Unit> function1) {
        viewOnAttachStateChangeListenerC20604515jv.LIZJ(LJ());
        C1891940zKi c1891940zKiLJ = LJ();
        ((TextView) c1891940zKiLJ.LLJILJIL.getValue()).setText(context.getString(2131848588));
        ((TextView) c1891940zKiLJ.LLJILJILJ.getValue()).setText(context.getString(2131848592));
        c1891940zKiLJ.LJJI(false);
        c1891940zKiLJ.LJJ(false);
        C1891830zKX c1891830zKX = new C1891830zKX(this);
        C786410Ut5.I7(new ACListenerS137S0100000_2(c1891830zKX, 76), (View) c1891940zKiLJ.LLJIJIL.getValue());
        this.LIZLLL = function1;
        LJFF().LIZJ(aweme);
    }
}
