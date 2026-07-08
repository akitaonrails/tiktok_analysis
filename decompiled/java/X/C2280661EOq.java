package X;

import Y.ARunnableS112S0100000_12;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS12S0302000_35;
import kotlin.jvm.internal.AwS161S0400000_35;
import kotlin.jvm.internal.AwS279S0300000_35;
import kotlin.jvm.internal.AwS4S0312000_35;

/* JADX INFO: renamed from: X.1EOq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2280661EOq extends AbstractC1446660nkW {
    public final AbstractC1446660nkW LJ;
    public final InterfaceC742020T8u LJFF;
    public boolean LJI;

    public final AbstractC1446660nkW LJI() {
        if (this.LJI) {
            return this.LJ;
        }
        return null;
    }

    public final void LJII(Function0<Unit> function0) {
        this.LJFF.LIZ(new ARunnableS112S0100000_12(function0, (Function0<Unit>) 400));
    }

    @Override // X.AbstractC1446660nkW
    public final void LJ(Object obj, C1404610meh c1404610meh) {
        LJII(new AwS279S0300000_35(this, obj, c1404610meh, 3));
    }

    public C2280661EOq(Object obj, AbstractC1446660nkW abstractC1446660nkW, InterfaceC742020T8u interfaceC742020T8u) {
        super(2, obj);
        this.LJ = abstractC1446660nkW;
        this.LJFF = interfaceC742020T8u;
        this.LJI = true;
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZIZ(C556300Lro c556300Lro, Object obj, Object obj2) {
        LJII(new AwS161S0400000_35(this, obj, c556300Lro, obj2, 2));
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZLLL(Object obj, C556300Lro c556300Lro, AbstractC556190Lrd abstractC556190Lrd) {
        LJII(new AwS161S0400000_35(this, obj, c556300Lro, abstractC556190Lrd, 1));
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
        LJII(new AwS12S0302000_35(this, obj, abstractC1404540mea, i, i2, 0));
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
        LJII(new AwS12S0302000_35(this, obj, c1435220nS4, i, i2, 1));
    }

    @Override // X.AbstractC1446660nkW
    public final void LJFF(Object obj, Object obj2, boolean z, int i, int i2) {
        LJII(new AwS4S0312000_35(this, obj, obj2, z, i, i2, 0));
    }
}
