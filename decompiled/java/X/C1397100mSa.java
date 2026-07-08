package X;

import java.util.LinkedList;

/* JADX INFO: renamed from: X.0mSa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397100mSa extends AbstractC1396950mSL {
    public final InterfaceC1396870mSD LJIIL;

    public final long LJ() {
        AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy;
        LinkedList<AbstractC1396720mRy<AbstractC1384320m7y>> linkedList = this.LIZIZ;
        if (!(!linkedList.isEmpty()) || (abstractC1396720mRy = linkedList.get(0)) == null) {
            return Long.MAX_VALUE;
        }
        return abstractC1396720mRy.LJIIIZ();
    }

    public final void LJIILIIL() {
        for (AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy : this.LIZIZ) {
            abstractC1396720mRy.LJIL(this.LIZ);
            abstractC1396720mRy.LJIILLIIL((this.LJI - abstractC1396720mRy.LJIIL()) / 2, this.LJIIIIZZ);
        }
    }

    public C1397100mSa(InterfaceC1384330m7z interfaceC1384330m7z, C1397110mSb c1397110mSb) {
        super(interfaceC1384330m7z, c1397110mSb);
        this.LJIIL = c1397110mSb;
    }

    @Override // X.InterfaceC1397040mSU
    public final int LIZJ(long j, boolean z, boolean z2) {
        AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy;
        if (z) {
            LinkedList<AbstractC1396720mRy<AbstractC1384320m7y>> linkedList = this.LIZIZ;
            if (!(!linkedList.isEmpty())) {
                linkedList = null;
            }
            if (linkedList == null || (abstractC1396720mRy = linkedList.get(0)) == null) {
                return 0;
            }
            if (!abstractC1396720mRy.LJIILL()) {
                abstractC1396720mRy.LJJIJ(abstractC1396720mRy.LJIIIZ() + 16);
            }
            long jLJIIIZ = abstractC1396720mRy.LJIIIZ();
            this.LIZ.LJI.getClass();
            if (jLJIIIZ >= 4000) {
                this.LJIIL.LJIILJJIL(abstractC1396720mRy);
                this.LIZIZ.clear();
            }
        }
        if (z2) {
            LJIILIIL();
        }
        return this.LIZIZ.size();
    }

    public final void LJIILJJIL(float f, float f2, float f3) {
        this.LJI = f;
        this.LJII = 54.0f;
        this.LJIIIIZZ = f3;
        LJIILIIL();
    }
}
