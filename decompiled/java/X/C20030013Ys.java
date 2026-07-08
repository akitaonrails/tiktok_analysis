package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.13Ys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20030013Ys implements InterfaceC1675110tgz {
    public static final /* synthetic */ int LJII = 0;
    public int LIZ;
    public InterfaceC20030213Yu LIZIZ;
    public C13Z7 LIZJ;
    public Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> LIZLLL;
    public int LJ;
    public C20028313Yb<Object> LJFF;
    public C19991913Kb<InterfaceC20029213Yk<?>, Object> LJI;

    public final boolean LIZ() {
        C13Z7 c13z7;
        return (this.LIZIZ == null || (c13z7 = this.LIZJ) == null || !c13z7.LIZ()) ? false : true;
    }

    public final void LIZJ() {
        InterfaceC20030213Yu interfaceC20030213Yu = this.LIZIZ;
        if (interfaceC20030213Yu != null) {
            interfaceC20030213Yu.LJIILL();
        }
        this.LIZIZ = null;
        this.LJFF = null;
        this.LJI = null;
    }

    @Override // X.InterfaceC1675110tgz
    public final void invalidate() {
        InterfaceC20030213Yu interfaceC20030213Yu = this.LIZIZ;
        if (interfaceC20030213Yu != null) {
            interfaceC20030213Yu.LIZIZ(this, null);
        }
    }

    public C20030013Ys(C20029913Yr c20029913Yr) {
        this.LIZIZ = c20029913Yr;
    }

    public final EnumC1783020wV2 LIZIZ(Object obj) {
        EnumC1783020wV2 enumC1783020wV2LIZIZ;
        InterfaceC20030213Yu interfaceC20030213Yu = this.LIZIZ;
        if (interfaceC20030213Yu == null || (enumC1783020wV2LIZIZ = interfaceC20030213Yu.LIZIZ(this, obj)) == null) {
            return EnumC1783020wV2.IGNORED;
        }
        return enumC1783020wV2LIZIZ;
    }

    public final void LIZLLL(Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2) {
        this.LIZLLL = function2;
    }
}
