package X;

import android.graphics.Rect;
import android.view.View;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0yJR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852710yJR {
    public final C1618320sDO LIZ;
    public final Function0<Boolean> LIZIZ;
    public final Function0<List<View>> LIZJ;
    public final InterfaceC1852720yJS LIZLLL;
    public float LJ;
    public float LJFF;
    public boolean LJI;
    public boolean LJII;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 904));
    public final C1085640eME<Rect> LJIIIZ = new C1085640eME<>(8);

    public C1852710yJR(C1618320sDO c1618320sDO, AwS571S0100000_27 awS571S0100000_27, AwS571S0100000_27 awS571S0100000_272, C1852600yJG c1852600yJG) {
        this.LIZ = c1618320sDO;
        this.LIZIZ = awS571S0100000_27;
        this.LIZJ = awS571S0100000_272;
        this.LIZLLL = c1852600yJG;
        c1618320sDO.setOnDispatchTouchEvent(new AwS606S0100000_27(this, 654));
    }
}
