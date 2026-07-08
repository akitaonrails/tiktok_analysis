package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tnT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679130tnT extends C09AY implements Function1<AbstractC1683310tuD, Unit> {
    public final /* synthetic */ AbstractC1686530tzP LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ AbstractC1686530tzP LLILZLL;
    public final /* synthetic */ AbstractC1686530tzP LLIZ;
    public final /* synthetic */ AbstractC1686530tzP LLIZLLLIL;
    public final /* synthetic */ AbstractC1686530tzP LLJ;
    public final /* synthetic */ C1679100tnQ LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ int LLJILJIL;
    public final /* synthetic */ InterfaceC1689940u4u LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1679130tnT(AbstractC1686530tzP abstractC1686530tzP, int i, int i2, int i3, int i4, AbstractC1686530tzP abstractC1686530tzP2, AbstractC1686530tzP abstractC1686530tzP3, AbstractC1686530tzP abstractC1686530tzP4, AbstractC1686530tzP abstractC1686530tzP5, C1679100tnQ c1679100tnQ, int i5, int i6, InterfaceC1689940u4u interfaceC1689940u4u) {
        super(1);
        this.LL = abstractC1686530tzP;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = i4;
        this.LLILZLL = abstractC1686530tzP2;
        this.LLIZ = abstractC1686530tzP3;
        this.LLIZLLLIL = abstractC1686530tzP4;
        this.LLJ = abstractC1686530tzP5;
        this.LLJI = c1679100tnQ;
        this.LLJIJIL = i5;
        this.LLJILJIL = i6;
        this.LLJILJILJ = interfaceC1689940u4u;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1683310tuD abstractC1683310tuD) {
        int iLIZ;
        int iLIZIZ;
        AbstractC1683310tuD abstractC1683310tuD2 = abstractC1683310tuD;
        AbstractC1686530tzP abstractC1686530tzP = this.LL;
        if (abstractC1686530tzP != null) {
            int i = this.LLILLJJLI - this.LLILLL;
            if (i < 0) {
                i = 0;
            }
            int i2 = this.LLILZ;
            int i3 = this.LLILZIL;
            AbstractC1686530tzP abstractC1686530tzP2 = this.LLILZLL;
            AbstractC1686530tzP abstractC1686530tzP3 = this.LLIZ;
            AbstractC1686530tzP abstractC1686530tzP4 = this.LLIZLLLIL;
            AbstractC1686530tzP abstractC1686530tzP5 = this.LLJ;
            C1679100tnQ c1679100tnQ = this.LLJI;
            boolean z = c1679100tnQ.LIZ;
            int i4 = this.LLJIJIL + this.LLJILJIL;
            float f = c1679100tnQ.LIZIZ;
            float density = this.LLJILJILJ.getDensity();
            if (abstractC1686530tzP4 != null) {
                InterfaceC1668050tVb.LIZ.getClass();
                AbstractC1683310tuD.LJFF(abstractC1683310tuD2, abstractC1686530tzP4, 0, C1668040tVa.LJIIJJI.LIZ(abstractC1686530tzP4.LLILLJJLI, i3));
            }
            if (abstractC1686530tzP5 != null) {
                int i5 = i2 - abstractC1686530tzP5.LL;
                InterfaceC1668050tVb.LIZ.getClass();
                AbstractC1683310tuD.LJFF(abstractC1683310tuD2, abstractC1686530tzP5, i5, C1668040tVa.LJIIJJI.LIZ(abstractC1686530tzP5.LLILLJJLI, i3));
            }
            if (z) {
                InterfaceC1668050tVb.LIZ.getClass();
                iLIZIZ = C1668040tVa.LJIIJJI.LIZ(abstractC1686530tzP.LLILLJJLI, i3);
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C1678940tnA.LIZIZ * density);
            }
            AbstractC1683310tuD.LJFF(abstractC1683310tuD2, abstractC1686530tzP, C1678940tnA.LJ(abstractC1686530tzP4), iLIZIZ - C814420VxA.LIZIZ((iLIZIZ - i) * f));
            AbstractC1683310tuD.LJFF(abstractC1683310tuD2, abstractC1686530tzP2, C1678940tnA.LJ(abstractC1686530tzP4), i4);
            if (abstractC1686530tzP3 != null) {
                AbstractC1683310tuD.LJFF(abstractC1683310tuD2, abstractC1686530tzP3, C1678940tnA.LJ(abstractC1686530tzP4), i4);
            }
        } else {
            int i6 = this.LLILZ;
            int i7 = this.LLILZIL;
            AbstractC1686530tzP abstractC1686530tzP6 = this.LLILZLL;
            AbstractC1686530tzP abstractC1686530tzP7 = this.LLIZ;
            AbstractC1686530tzP abstractC1686530tzP8 = this.LLIZLLLIL;
            AbstractC1686530tzP abstractC1686530tzP9 = this.LLJ;
            boolean z2 = this.LLJI.LIZ;
            int iLIZIZ2 = C814420VxA.LIZIZ(this.LLJI.LIZJ.LIZLLL() * this.LLJILJILJ.getDensity());
            if (abstractC1686530tzP8 != null) {
                InterfaceC1668050tVb.LIZ.getClass();
                AbstractC1683310tuD.LJFF(abstractC1683310tuD2, abstractC1686530tzP8, 0, C1668040tVa.LJIIJJI.LIZ(abstractC1686530tzP8.LLILLJJLI, i7));
            }
            if (abstractC1686530tzP9 != null) {
                int i8 = i6 - abstractC1686530tzP9.LL;
                InterfaceC1668050tVb.LIZ.getClass();
                AbstractC1683310tuD.LJFF(abstractC1683310tuD2, abstractC1686530tzP9, i8, C1668040tVa.LJIIJJI.LIZ(abstractC1686530tzP9.LLILLJJLI, i7));
            }
            if (z2) {
                InterfaceC1668050tVb.LIZ.getClass();
                iLIZ = C1668040tVa.LJIIJJI.LIZ(abstractC1686530tzP6.LLILLJJLI, i7);
            } else {
                iLIZ = iLIZIZ2;
            }
            AbstractC1683310tuD.LJFF(abstractC1683310tuD2, abstractC1686530tzP6, C1678940tnA.LJ(abstractC1686530tzP8), iLIZ);
            if (abstractC1686530tzP7 != null) {
                if (z2) {
                    InterfaceC1668050tVb.LIZ.getClass();
                    iLIZIZ2 = C1668040tVa.LJIIJJI.LIZ(abstractC1686530tzP7.LLILLJJLI, i7);
                }
                AbstractC1683310tuD.LJFF(abstractC1683310tuD2, abstractC1686530tzP7, C1678940tnA.LJ(abstractC1686530tzP8), iLIZIZ2);
            }
        }
        return Unit.LIZ;
    }
}
