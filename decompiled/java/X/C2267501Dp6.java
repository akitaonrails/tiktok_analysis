package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS401S0200000_35;

/* JADX INFO: renamed from: X.1Dp6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2267501Dp6 {
    public final Object LIZ;
    public final List<Function1<C2267041DoM, Unit>> LIZIZ;
    public final C2267581DpE LIZJ;
    public final C2267481Dp4 LIZLLL;
    public final C2267461Dp2 LJ;
    public final C2267481Dp4 LJFF;
    public final C2267461Dp2 LJI;

    public C2267501Dp6(Object obj) {
        this.LIZ = obj;
        ArrayList arrayList = new ArrayList();
        this.LIZIZ = arrayList;
        this.LIZJ = new C2267581DpE(C2267051DoN.LJ);
        this.LIZLLL = new C2267481Dp4(arrayList, -2, obj);
        this.LJ = new C2267461Dp2(arrayList, 0, obj);
        this.LJFF = new C2267481Dp4(arrayList, -1, obj);
        this.LJI = new C2267461Dp2(arrayList, 1, obj);
        InterfaceC2267531Dp9.LIZ.getClass();
        AFwS283S0000000_35 aFwS283S0000000_35 = AFwS283S0000000_35.get$arr$(192);
        new C2267511Dp7(aFwS283S0000000_35);
        new C2267511Dp7(aFwS283S0000000_35);
    }

    public final void LIZ(C2267511Dp7 c2267511Dp7) {
        ((ArrayList) this.LIZIZ).add(new AwS401S0200000_35(this, c2267511Dp7, 66));
    }

    public final void LIZIZ(C2267541DpA c2267541DpA) {
        ((ArrayList) this.LIZIZ).add(new AwS401S0200000_35(this, c2267541DpA, 67));
    }

    public final void LIZJ(C2267511Dp7 c2267511Dp7) {
        ((ArrayList) this.LIZIZ).add(new AwS401S0200000_35(this, c2267511Dp7, 68));
    }
}
