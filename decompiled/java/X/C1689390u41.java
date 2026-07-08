package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0u41, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689390u41 implements InterfaceC1420105h9 {
    public static final C1687100u0K LJIIIIZZ = new C1687100u0K(AFwS266S0000000_25.get$arr$(437), AFwS285S0000000_2.get$arr$(39));
    public final InterfaceC1676320tiw LIZ;
    public float LJ;
    public final InterfaceC1676320tiw LIZIZ = C1696870uG5.LIZ(0);
    public final C612270Nzt LIZJ = new C612270Nzt();
    public final InterfaceC1676320tiw LIZLLL = C1696870uG5.LIZ(Integer.MAX_VALUE);
    public final C594850NUt LJFF = new C594850NUt(new AwS604S0100000_25(this, 576));
    public final C13YZ LJI = C20028913Yh.LJ(new AwS569S0100000_25(this, 822));
    public final C13YZ LJII = C20028913Yh.LJ(new AwS569S0100000_25(this, 821));

    @Override // X.InterfaceC1420105h9
    public final boolean LIZIZ() {
        return this.LJFF.LIZIZ();
    }

    @Override // X.InterfaceC1420105h9
    public final boolean LIZJ() {
        return ((Boolean) this.LJI.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1420105h9
    public final boolean LIZLLL() {
        return ((Boolean) this.LJII.getValue()).booleanValue();
    }

    public final int LJI() {
        return ((C13FG) this.LIZLLL).LIZLLL();
    }

    public final int LJII() {
        return this.LIZ.LIZLLL();
    }

    public C1689390u41(int i) {
        this.LIZ = C1696870uG5.LIZ(i);
    }

    @Override // X.InterfaceC1420105h9
    public final float LJ(float f) {
        return this.LJFF.LJ(f);
    }

    public final Object LJIIIIZZ(int i, InterfaceC1364105Vn<? super Float> interfaceC1364105Vn) {
        return C1392905cl.LIZIZ(this, i - LJII(), interfaceC1364105Vn);
    }

    public static Object LJFF(C1689390u41 c1689390u41, int i, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objLIZ = C1392905cl.LIZ(c1689390u41, i - c1689390u41.LJII(), new C1676890tjr(null, 7), interfaceC1364105Vn);
        if (objLIZ != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLIZ;
    }

    @Override // X.InterfaceC1420105h9
    public final Object LIZ(EnumC1384205bM enumC1384205bM, Function2<? super InterfaceC1392705cj, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZ = this.LJFF.LIZ(enumC1384205bM, function2, interfaceC1364105Vn);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }
}
