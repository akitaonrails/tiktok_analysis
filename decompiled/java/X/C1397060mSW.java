package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0mSW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1397060mSW extends AbstractC1396950mSL {
    public long LJIIL;
    public long LJIILIIL;
    public final InterfaceC1384330m7z LJIILJJIL;
    public final InterfaceC1396870mSD LJIILL;

    public AbstractC1396720mRy<AbstractC1384320m7y> LJJIJLIJ() {
        AbstractC1396720mRy<AbstractC1384320m7y> next;
        Iterator<AbstractC1396720mRy<AbstractC1384320m7y>> it2 = this.LIZIZ.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy = next;
                float fLJIILIIL = abstractC1396720mRy.LJIILIIL() + abstractC1396720mRy.LJIIL();
                do {
                    AbstractC1396720mRy<AbstractC1384320m7y> next2 = it2.next();
                    AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy2 = next2;
                    float fLJIILIIL2 = abstractC1396720mRy2.LJIILIIL() + abstractC1396720mRy2.LJIIL();
                    if (Float.compare(fLJIILIIL, fLJIILIIL2) < 0) {
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

    public float LJJIII() {
        AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRyLJJIJLIJ = LJJIJLIJ();
        if (abstractC1396720mRyLJJIJLIJ != null) {
            return abstractC1396720mRyLJJIJLIJ.LJIILIIL() + abstractC1396720mRyLJJIJLIJ.LJIIL();
        }
        return Float.MAX_VALUE;
    }

    public static void LJJJJJ(C1397060mSW c1397060mSW) {
        LinkedList<AbstractC1396720mRy<AbstractC1384320m7y>> linkedList = c1397060mSW.LIZIZ;
        c1397060mSW.getClass();
        int i = 0;
        for (AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy : linkedList) {
            int i2 = i + 1;
            if (i >= 0) {
                AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy2 = abstractC1396720mRy;
                AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy3 = (AbstractC1396720mRy) C13LP.LJJJLZIJ(i - 1, linkedList);
                if (abstractC1396720mRy3 != null && c1397060mSW.LIZ.LJFF.LJIIIZ.invoke(abstractC1396720mRy2.LJ()).booleanValue()) {
                    abstractC1396720mRy2.LJJIJIIJIL(c1397060mSW.LJIILJJIL(abstractC1396720mRy2, c1397060mSW.LJJIJIL(abstractC1396720mRy3)));
                } else {
                    abstractC1396720mRy2.LJJIJIIJIL(c1397060mSW.LIZ.LJFF.LIZ);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final float LJJIJIL(AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy) {
        if (abstractC1396720mRy.LJIIJJI() == 0) {
            abstractC1396720mRy.LJJIJIIJIL(this.LIZ.LJFF.LIZ);
        }
        return (abstractC1396720mRy.LJIIL() + this.LJI) / abstractC1396720mRy.LJIIJJI();
    }

    public boolean LJJJI(AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy) {
        if (abstractC1396720mRy.LJIILIIL() + abstractC1396720mRy.LJIIL() > 0) {
            return false;
        }
        return true;
    }

    public boolean LJJJIL(AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy) {
        if (abstractC1396720mRy.LJIILIIL() < this.LJI) {
            return true;
        }
        return false;
    }

    public void LJJJJ(List<? extends AbstractC1396720mRy<AbstractC1384320m7y>> list) {
        float fLJIILIIL;
        AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy = null;
        float fLJIIL = 0.0f;
        for (AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy2 : list) {
            float fLJIIL2 = abstractC1396720mRy2.LJIIL();
            float fLJI = abstractC1396720mRy2.LJI();
            abstractC1396720mRy2.LJIL(this.LIZ);
            if (fLJIIL2 != abstractC1396720mRy2.LJIIL() || fLJI != abstractC1396720mRy2.LJI()) {
                AbstractC1384320m7y abstractC1384320m7yLJ = abstractC1396720mRy2.LJ();
                if (!(abstractC1384320m7yLJ instanceof C1384310m7x)) {
                    abstractC1384320m7yLJ = null;
                }
                C1384310m7x c1384310m7x = (C1384310m7x) abstractC1384320m7yLJ;
                if (c1384310m7x != null) {
                    c1384310m7x.LJIIJ = true;
                }
            }
            abstractC1396720mRy2.LJIILLIIL(abstractC1396720mRy2.LJIILIIL(), this.LJIIIIZZ);
            if (this.LJIILJJIL.getConfig().LIZLLL.LJIILIIL) {
                if (abstractC1396720mRy != null && fLJIIL > 0) {
                    if (LJJJJJL(abstractC1396720mRy, abstractC1396720mRy2, abstractC1396720mRy2.LJIILIIL() + this.LIZ.LJFF.LJFF)) {
                        fLJIILIIL = Math.max(abstractC1396720mRy2.LJIILIIL(), abstractC1396720mRy.LJIILIIL() + abstractC1396720mRy.LJIIL() + this.LIZ.LJFF.LJFF);
                    } else {
                        fLJIILIIL = abstractC1396720mRy2.LJIILIIL() + Math.max(LJJI(abstractC1396720mRy, abstractC1396720mRy2, abstractC1396720mRy2.LJIILIIL() + this.LIZ.LJFF.LJFF), 0.0f);
                    }
                    abstractC1396720mRy2.LJIILLIIL(fLJIILIIL, abstractC1396720mRy2.LJIILJJIL());
                }
            } else if (fLJIIL > 0 && abstractC1396720mRy != null && !LJJJ(abstractC1396720mRy, abstractC1396720mRy2, abstractC1396720mRy2.LJIILIIL())) {
                abstractC1396720mRy2.LJIILLIIL(abstractC1396720mRy.LJIILIIL() + abstractC1396720mRy.LJIIL() + this.LIZ.LJFF.LJFF, abstractC1396720mRy2.LJIILJJIL());
            }
            fLJIIL = abstractC1396720mRy2.LJIIL() - fLJIIL2;
            abstractC1396720mRy = abstractC1396720mRy2;
        }
    }

    public void LJJJJI(AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy) {
        abstractC1396720mRy.LJIJ((-LJJIJIL(abstractC1396720mRy)) * this.LJIILIIL);
    }

    public C1397060mSW(InterfaceC1384330m7z interfaceC1384330m7z, AbstractC1397150mSf abstractC1397150mSf) {
        super(interfaceC1384330m7z, abstractC1397150mSf);
        this.LJIILJJIL = interfaceC1384330m7z;
        this.LJIILL = abstractC1397150mSf;
        this.LJIIL = -1L;
        this.LJIILIIL = 16L;
    }

    public boolean LJ(long j, AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy) {
        abstractC1396720mRy.LJJIJIIJIL(this.LIZ.LJFF.LIZ);
        AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRyLJJIJLIJ = LJJIJLIJ();
        if (abstractC1396720mRyLJJIJLIJ != null) {
            if (!this.LJIILJJIL.getConfig().LIZLLL.LJIILIIL ? !LJJJ(abstractC1396720mRyLJJIJLIJ, abstractC1396720mRy, this.LJI) : !(LJJJIL(abstractC1396720mRyLJJIJLIJ) && LJIJJ(abstractC1396720mRyLJJIJLIJ, this.LJI))) {
                return false;
            }
        } else {
            abstractC1396720mRyLJJIJLIJ = null;
        }
        abstractC1396720mRy.LJIILLIIL(LJIILIIL(abstractC1396720mRy, abstractC1396720mRyLJJIJLIJ), this.LJIIIIZZ);
        abstractC1396720mRy.LJJIJIIJI(j);
        this.LIZIZ.add(abstractC1396720mRy);
        return true;
    }

    public float LJIILIIL(AbstractC1396720mRy abstractC1396720mRy, AbstractC1396720mRy abstractC1396720mRy2) {
        this.LIZ.LJFF.getClass();
        if (this.LJIILJJIL.getConfig().LIZLLL.LJIILIIL) {
            if (LJJJJJL(abstractC1396720mRy2, abstractC1396720mRy, this.LJI)) {
                return this.LJI;
            }
            float f = this.LJI;
            return Math.max(LJJI(abstractC1396720mRy2, abstractC1396720mRy, f), 0.0f) + f;
        }
        return this.LJI;
    }

    public final long LJIILJJIL(AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy, float f) {
        if (f > 0) {
            return (long) ((abstractC1396720mRy.LJIIL() + this.LJI) / f);
        }
        return this.LIZ.LJFF.LIZ;
    }

    public boolean LJIJJ(AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy, float f) {
        if ((f - abstractC1396720mRy.LJIILIIL()) - abstractC1396720mRy.LJIIL() > this.LIZ.LJFF.LJFF) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1397040mSU
    public final int LIZJ(long j, boolean z, boolean z2) {
        if (this.LJIIL < 0) {
            this.LJIIL = System.currentTimeMillis();
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.LJIILJJIL.getConfig().LIZLLL.getClass();
            long j2 = jCurrentTimeMillis - this.LJIIL;
            if (j2 >= 14) {
                j2 = 16;
            }
            this.LJIILIIL = j2;
            this.LJIIL = jCurrentTimeMillis;
        }
        if (z) {
            for (AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy : this.LIZIZ) {
                if (!abstractC1396720mRy.LJIILL()) {
                    LJJJJI(abstractC1396720mRy);
                    if (this.LJIILJJIL.getConfig().LIZLLL.LJIILIIL) {
                        if (LJJJIL(abstractC1396720mRy)) {
                            if (abstractC1396720mRy.LJIIIZ() <= 0) {
                                this.LJIILJJIL.LJJIIJZLJL(LSPassThroughRecordSizeConfig.DEFAULT, abstractC1396720mRy.LJ(), null);
                                abstractC1396720mRy.LJJI(this.LIZ);
                            }
                            abstractC1396720mRy.LJJIJ(abstractC1396720mRy.LJIIIZ() + this.LJIILIIL);
                        }
                    } else {
                        abstractC1396720mRy.LJJIJ(abstractC1396720mRy.LJIIIZ() + this.LJIILIIL);
                    }
                }
            }
            Iterator<AbstractC1396720mRy<AbstractC1384320m7y>> it2 = this.LIZIZ.iterator();
            while (it2.hasNext()) {
                AbstractC1396720mRy<AbstractC1384320m7y> next = it2.next();
                if (!LJJJI(next)) {
                    break;
                }
                this.LJIILL.LJIILJJIL(next);
                it2.remove();
            }
        }
        return this.LIZIZ.size();
    }

    public float LJJI(AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy, AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy2, float f) {
        if (abstractC1396720mRy == null) {
            return 0.0f;
        }
        return (((abstractC1396720mRy2.LJIIL() + f) * (abstractC1396720mRy.LJIILIIL() + abstractC1396720mRy.LJIIL())) / (abstractC1396720mRy.LJIIL() + f)) - f;
    }

    public boolean LJJJ(AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy, AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy2, float f) {
        float fLJIILIIL = (f - abstractC1396720mRy.LJIILIIL()) - abstractC1396720mRy.LJIIL();
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

    public void LJJJJIZL(float f, float f2, float f3) {
        this.LJI = f;
        this.LJII = f2;
        this.LJIIIIZZ = f3;
        LJJJJ(this.LIZIZ);
    }

    public boolean LJJJJJL(AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy, AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy2, float f) {
        if (abstractC1396720mRy == null) {
            return false;
        }
        float fLJJIJIL = LJJIJIL(abstractC1396720mRy);
        float fLJJIJIL2 = LJJIJIL(abstractC1396720mRy2);
        if (fLJJIJIL < fLJJIJIL2) {
            if (this.LIZ.LJFF.LJIIIZ.invoke(abstractC1396720mRy2.LJ()).booleanValue()) {
                abstractC1396720mRy2.LJJIJIIJIL(LJIILJJIL(abstractC1396720mRy2, fLJJIJIL));
            } else if (((f - abstractC1396720mRy.LJIILIIL()) - abstractC1396720mRy.LJIIL()) + ((fLJJIJIL - fLJJIJIL2) * abstractC1396720mRy.LJIIJJI()) < this.LIZ.LJFF.LJFF) {
                return false;
            }
        }
        return true;
    }
}
