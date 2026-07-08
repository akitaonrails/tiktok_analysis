package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tnR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679110tnR extends C09AY implements Function1<AbstractC1683310tuD, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ AbstractC1686530tzP LLILLL;
    public final /* synthetic */ AbstractC1686530tzP LLILZ;
    public final /* synthetic */ AbstractC1686530tzP LLILZIL;
    public final /* synthetic */ AbstractC1686530tzP LLILZLL;
    public final /* synthetic */ AbstractC1686530tzP LLIZ;
    public final /* synthetic */ AbstractC1686530tzP LLIZLLLIL;
    public final /* synthetic */ C1679080tnO LLJ;
    public final /* synthetic */ InterfaceC1689940u4u LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1679110tnR(int i, int i2, AbstractC1686530tzP abstractC1686530tzP, AbstractC1686530tzP abstractC1686530tzP2, AbstractC1686530tzP abstractC1686530tzP3, AbstractC1686530tzP abstractC1686530tzP4, AbstractC1686530tzP abstractC1686530tzP5, AbstractC1686530tzP abstractC1686530tzP6, C1679080tnO c1679080tnO, InterfaceC1689940u4u interfaceC1689940u4u) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = abstractC1686530tzP;
        this.LLILZ = abstractC1686530tzP2;
        this.LLILZIL = abstractC1686530tzP3;
        this.LLILZLL = abstractC1686530tzP4;
        this.LLIZ = abstractC1686530tzP5;
        this.LLIZLLLIL = abstractC1686530tzP6;
        this.LLJ = c1679080tnO;
        this.LLJI = interfaceC1689940u4u;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1683310tuD abstractC1683310tuD) {
        int iLIZ;
        int iLIZ2;
        float fLJ;
        AbstractC1683310tuD abstractC1683310tuD2 = abstractC1683310tuD;
        int i = this.LL;
        int i2 = this.LLILLJJLI;
        AbstractC1686530tzP abstractC1686530tzP = this.LLILLL;
        AbstractC1686530tzP abstractC1686530tzP2 = this.LLILZ;
        AbstractC1686530tzP abstractC1686530tzP3 = this.LLILZIL;
        AbstractC1686530tzP abstractC1686530tzP4 = this.LLILZLL;
        AbstractC1686530tzP abstractC1686530tzP5 = this.LLIZ;
        AbstractC1686530tzP abstractC1686530tzP6 = this.LLIZLLLIL;
        C1679080tnO c1679080tnO = this.LLJ;
        float f = c1679080tnO.LIZJ;
        boolean z = c1679080tnO.LIZIZ;
        float density = this.LLJI.getDensity();
        EnumC1671200tag layoutDirection = this.LLJI.getLayoutDirection();
        InterfaceC1679150tnV interfaceC1679150tnV = this.LLJ.LIZLLL;
        int iLIZIZ = C814420VxA.LIZIZ(interfaceC1679150tnV.LIZLLL() * density);
        int iLIZIZ2 = C814420VxA.LIZIZ(C1682520tsw.LJI(interfaceC1679150tnV, layoutDirection) * density);
        float f2 = C1678940tnA.LIZJ * density;
        if (abstractC1686530tzP != null) {
            InterfaceC1668050tVb.LIZ.getClass();
            AbstractC1683310tuD.LJFF(abstractC1683310tuD2, abstractC1686530tzP, 0, C1668040tVa.LJIIJJI.LIZ(abstractC1686530tzP.LLILLJJLI, i));
        }
        if (abstractC1686530tzP2 != null) {
            int i3 = i2 - abstractC1686530tzP2.LL;
            InterfaceC1668050tVb.LIZ.getClass();
            AbstractC1683310tuD.LJFF(abstractC1683310tuD2, abstractC1686530tzP2, i3, C1668040tVa.LJIIJJI.LIZ(abstractC1686530tzP2.LLILLJJLI, i));
        }
        if (abstractC1686530tzP4 != null) {
            if (z) {
                InterfaceC1668050tVb.LIZ.getClass();
                iLIZ2 = C1668040tVa.LJIIJJI.LIZ(abstractC1686530tzP4.LLILLJJLI, i);
            } else {
                iLIZ2 = iLIZIZ;
            }
            int iLIZJ = C1677720tlC.LIZJ(f, iLIZ2, -(abstractC1686530tzP4.LLILLJJLI / 2));
            if (abstractC1686530tzP == null) {
                fLJ = 0.0f;
            } else {
                fLJ = (C1678940tnA.LJ(abstractC1686530tzP) - f2) * (1 - f);
            }
            AbstractC1683310tuD.LJFF(abstractC1683310tuD2, abstractC1686530tzP4, C814420VxA.LIZIZ(fLJ) + iLIZIZ2, iLIZJ);
        }
        if (z) {
            InterfaceC1668050tVb.LIZ.getClass();
            iLIZ = C1668040tVa.LJIIJJI.LIZ(abstractC1686530tzP3.LLILLJJLI, i);
        } else {
            iLIZ = iLIZIZ;
        }
        AbstractC1683310tuD.LJFF(abstractC1683310tuD2, abstractC1686530tzP3, C1678940tnA.LJ(abstractC1686530tzP), Math.max(iLIZ, C1678940tnA.LIZLLL(abstractC1686530tzP4) / 2));
        if (abstractC1686530tzP5 != null) {
            if (z) {
                InterfaceC1668050tVb.LIZ.getClass();
                iLIZIZ = C1668040tVa.LJIIJJI.LIZ(abstractC1686530tzP5.LLILLJJLI, i);
            }
            AbstractC1683310tuD.LJFF(abstractC1683310tuD2, abstractC1686530tzP5, C1678940tnA.LJ(abstractC1686530tzP), Math.max(iLIZIZ, C1678940tnA.LIZLLL(abstractC1686530tzP4) / 2));
        }
        AbstractC1683310tuD.LJ(abstractC1683310tuD2, abstractC1686530tzP6, 0L);
        return Unit.LIZ;
    }
}
