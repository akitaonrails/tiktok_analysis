package X;

import android.view.View;
import android.view.ViewStub;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0PjX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653090PjX extends AbstractC653080PjW {
    public final Function0<Unit> LIZLLL;
    public final View LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;

    public final boolean LIZIZ() {
        return ((Boolean) this.LJFF.getValue()).booleanValue();
    }

    public C653090PjX(ViewStub viewStub, AwS554S0100000_10 awS554S0100000_10) {
        this.LIZLLL = awS554S0100000_10;
        viewStub.setLayoutResource(R.layout.exp);
        this.LJ = C786410Ut5.LJLLLL(viewStub);
        this.LJFF = C452501pT.LIZIZ(new AwS554S0100000_10(this, 965));
        this.LJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 966));
        this.LJII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 967));
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 968));
        this.LJIIIZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 970));
        this.LJIIJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 969));
    }
}
