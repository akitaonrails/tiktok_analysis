package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0e55, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075010e55 extends AbstractC1002380cBw {
    public static C1074840e4o LJI;
    public final boolean LIZJ;
    public final C2218501BsG LIZLLL;
    public final C2218431Bs9 LJ;
    public final C1075030e57 LJFF;

    public C1075010e55(EnumC1074240e3q enumC1074240e3q) {
        C1DFB c1dfb = C0PEM.LIZJ;
        C2218501BsG c2218501BsG = new C2218501BsG(enumC1074240e3q, EnumC1995407rk.THIRD_PART_NAME, true, 120);
        C2218431Bs9 c2218431Bs9 = new C2218431Bs9(c2218501BsG, new C1075050e59(enumC1074240e3q));
        C1075030e57 c1075030e57 = new C1075030e57(c2218501BsG);
        super(c2218501BsG, c1dfb);
        this.LIZJ = true;
        this.LIZLLL = c2218501BsG;
        this.LJ = c2218431Bs9;
        this.LJFF = c1075030e57;
    }

    @Override // X.AbstractC1002380cBw
    public final Object LIZJ(InterfaceC1364105Vn<? super C1074840e4o> interfaceC1364105Vn) {
        C1074840e4o c1074840e4o = LJI;
        if (this.LIZJ && c1074840e4o != null) {
            return c1074840e4o;
        }
        List listLJII = this.LIZLLL.LJII(new AwS560S0100000_16(this, 972));
        return this.LIZLLL.LJFF(new AwS260S0300000_16(listLJII, (List<C1075020e56>) this.LIZLLL.LJI(new AwS417S0200000_16(this, (C1075010e55) listLJII, (List<C1075020e56>) 118)), (Map<String, C1074830e4n>) this, (C1075010e55) 32));
    }
}
