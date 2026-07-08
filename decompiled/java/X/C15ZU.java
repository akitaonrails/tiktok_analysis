package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS161S1200000_31;

/* JADX INFO: renamed from: X.15ZU, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15ZU extends C20540915Zf {
    public final C15ZP LJ;
    public final String LJFF;
    public final AwS161S1200000_31 LJI;

    @Override // X.C15ZW
    public final Function2<C20540515Zb, C15ZW, Unit> LIZ() {
        return this.LJI;
    }

    @Override // X.C15ZW
    public final boolean LIZIZ(C15ZP c15zp) {
        C15ZI c15zi;
        InterfaceC20540415Za interfaceC20540415Za;
        if ((c15zp instanceof C15ZI) && (c15zi = (C15ZI) c15zp) != null && (interfaceC20540415Za = c15zi.LIZJ) != null && interfaceC20540415Za.LIZLLL()) {
            return true;
        }
        return false;
    }

    public C15ZU(C15ZP c15zp, String str, String str2) {
        super(str, str2);
        this.LJ = c15zp;
        this.LJFF = str;
        this.LJI = new AwS161S1200000_31(this, str2, 2);
    }
}
