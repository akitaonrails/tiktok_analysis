package X;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0mSX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1397070mSX extends C1397060mSW {
    @Override // X.C1397060mSW
    public final AbstractC1396720mRy<AbstractC1384320m7y> LJJIJLIJ() {
        AbstractC1396720mRy<AbstractC1384320m7y> next;
        Iterator<AbstractC1396720mRy<AbstractC1384320m7y>> it2 = this.LIZIZ.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                float fLJIILIIL = next.LJIILIIL();
                do {
                    AbstractC1396720mRy<AbstractC1384320m7y> next2 = it2.next();
                    float fLJIILIIL2 = next2.LJIILIIL();
                    if (Float.compare(fLJIILIIL, fLJIILIIL2) > 0) {
                        next = next2;
                        fLJIILIIL = fLJIILIIL2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        return next;
    }

    @Override // X.C1397060mSW
    public final float LJJIII() {
        AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRyLJJIJLIJ = LJJIJLIJ();
        return -(abstractC1396720mRyLJJIJLIJ != null ? abstractC1396720mRyLJJIJLIJ.LJIILIIL() : Float.MAX_VALUE);
    }

    @Override // X.C1397060mSW
    public final boolean LJJJI(AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy) {
        if (abstractC1396720mRy.LJIILIIL() >= this.LJI) {
            return true;
        }
        return false;
    }

    @Override // X.C1397060mSW
    public final boolean LJJJIL(AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy) {
        if (abstractC1396720mRy.LJIILIIL() + abstractC1396720mRy.LJIIL() <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.C1397060mSW
    public void LJJJJ(List<? extends AbstractC1396720mRy<AbstractC1384320m7y>> list) {
        float fLJIILIIL;
        AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy = null;
        float fLJIIL = 0.0f;
        for (AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy2 : list) {
            abstractC1396720mRy2.LJJIJLIJ(this.LJIIIIZZ);
            float fLJIIL2 = abstractC1396720mRy2.LJIIL();
            abstractC1396720mRy2.LJIL(this.LIZ);
            if (this.LJIILJJIL.getConfig().LIZLLL.LJIILIIL) {
                if (abstractC1396720mRy != null && fLJIIL > 0) {
                    float fLJIILIIL2 = ((this.LJI - abstractC1396720mRy2.LJIILIIL()) - abstractC1396720mRy2.LJIIL()) + this.LIZ.LJFF.LJFF;
                    if (LJJJJJL(abstractC1396720mRy, abstractC1396720mRy2, fLJIILIIL2)) {
                        fLJIILIIL = Math.min(abstractC1396720mRy2.LJIILIIL(), (abstractC1396720mRy.LJIILIIL() - this.LIZ.LJFF.LJFF) - abstractC1396720mRy2.LJIIL());
                    } else {
                        fLJIILIIL = (abstractC1396720mRy2.LJIILIIL() - abstractC1396720mRy2.LJIIL()) - Math.max(LJJI(abstractC1396720mRy, abstractC1396720mRy2, fLJIILIIL2), 0.0f);
                    }
                    abstractC1396720mRy2.LJJIJL(fLJIILIIL);
                }
            } else if (fLJIIL > 0 && abstractC1396720mRy != null && !LJJJ(abstractC1396720mRy, abstractC1396720mRy2, this.LJI)) {
                abstractC1396720mRy2.LJJIJL((abstractC1396720mRy.LJIILIIL() - abstractC1396720mRy2.LJIIL()) - this.LIZ.LJFF.LJFF);
            }
            fLJIIL = abstractC1396720mRy2.LJIIL() - fLJIIL2;
            abstractC1396720mRy2.LJJIJL(abstractC1396720mRy2.LJIILIIL() - fLJIIL);
            abstractC1396720mRy = abstractC1396720mRy2;
        }
    }

    @Override // X.C1397060mSW
    public final void LJJJJI(AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy) {
        abstractC1396720mRy.LJIJ(LJJIJIL(abstractC1396720mRy) * this.LJIILIIL);
    }

    public C1397070mSX(InterfaceC1384330m7z interfaceC1384330m7z, AbstractC1397150mSf abstractC1397150mSf) {
        super(interfaceC1384330m7z, abstractC1397150mSf);
    }

    @Override // X.C1397060mSW
    public final float LJIILIIL(AbstractC1396720mRy abstractC1396720mRy, AbstractC1396720mRy abstractC1396720mRy2) {
        this.LIZ.LJFF.getClass();
        if (!this.LJIILJJIL.getConfig().LIZLLL.LJIILIIL || LJJJJJL(abstractC1396720mRy2, abstractC1396720mRy, this.LJI)) {
            float fLJIIL = abstractC1396720mRy.LJIIL();
            return -fLJIIL;
        }
        return (-abstractC1396720mRy.LJIIL()) - Math.max(LJJI(abstractC1396720mRy2, abstractC1396720mRy, this.LJI), 0.0f);
    }

    @Override // X.C1397060mSW
    public final boolean LJIJJ(AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy, float f) {
        if (abstractC1396720mRy.LJIILIIL() > this.LIZ.LJFF.LJFF) {
            return true;
        }
        return false;
    }

    @Override // X.C1397060mSW
    public final float LJJI(AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy, AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy2, float f) {
        if (abstractC1396720mRy == null) {
            return 0.0f;
        }
        return abstractC1396720mRy2.LJIILIIL() + ((this.LIZ.LJFF.LJFF + (((f - abstractC1396720mRy.LJIILIIL()) * (abstractC1396720mRy2.LJIIL() + f)) / (abstractC1396720mRy.LJIIL() + f))) - f);
    }

    @Override // X.C1397060mSW
    public final boolean LJJJ(AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy, AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy2, float f) {
        float fLJIILIIL = abstractC1396720mRy.LJIILIIL() - (abstractC1396720mRy2.LJIILIIL() + abstractC1396720mRy2.LJIIL());
        if (fLJIILIIL < this.LIZ.LJFF.LJFF) {
            return false;
        }
        float fLJJIJIL = LJJIJIL(abstractC1396720mRy);
        float fLJJIJIL2 = LJJIJIL(abstractC1396720mRy2);
        if (fLJJIJIL < fLJJIJIL2) {
            if (this.LIZ.LJFF.LJIIIZ.invoke(abstractC1396720mRy2.LJ()).booleanValue()) {
                abstractC1396720mRy2.LJJIJIIJIL(LJIILJJIL(abstractC1396720mRy2, fLJJIJIL));
            } else if (fLJIILIIL + ((fLJJIJIL - fLJJIJIL2) * abstractC1396720mRy.LJIIJJI()) < this.LIZ.LJFF.LJFF) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C1397060mSW
    public final boolean LJJJJJL(AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy, AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy2, float f) {
        if (abstractC1396720mRy == null) {
            return false;
        }
        float fLJJIJIL = LJJIJIL(abstractC1396720mRy);
        float fLJJIJIL2 = LJJIJIL(abstractC1396720mRy2);
        if (fLJJIJIL < fLJJIJIL2) {
            if (this.LIZ.LJFF.LJIIIZ.invoke(abstractC1396720mRy2.LJ()).booleanValue()) {
                abstractC1396720mRy2.LJJIJIIJIL(LJIILJJIL(abstractC1396720mRy2, fLJJIJIL));
            } else if ((abstractC1396720mRy.LJIILIIL() - (abstractC1396720mRy2.LJIILIIL() + abstractC1396720mRy2.LJIIL())) + ((fLJJIJIL - fLJJIJIL2) * abstractC1396720mRy.LJIIJJI()) < this.LIZ.LJFF.LJFF) {
                return false;
            }
        }
        return true;
    }
}
