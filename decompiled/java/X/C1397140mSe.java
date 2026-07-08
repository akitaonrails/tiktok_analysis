package X;

import Y.AComparatorS40S0000000_21;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS42S0200100_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mSe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397140mSe extends AbstractC1397150mSf<C1397060mSW> {
    public final boolean LJIIL = false;
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1458));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(558));

    @Override // X.InterfaceC1396870mSD
    public final int LIZIZ() {
        return LSPassThroughRecordSizeConfig.DEFAULT;
    }

    @Override // X.InterfaceC1396870mSD
    public final int LJJIJLIJ() {
        return 1001;
    }

    @Override // X.AbstractC1397150mSf
    public final void LJI() {
        new AwS565S0100000_21(this, 1455).invoke();
    }

    @Override // X.AbstractC1397150mSf
    public final C1396790mS5 LJIIIIZZ() {
        C1384750m8f c1384750m8f = this.LIZLLL;
        InterfaceC1396800mS6 interfaceC1396800mS6 = this.LIZIZ;
        C1384510m8H c1384510m8H = c1384750m8f.LJFF;
        return new C1396790mS5(c1384750m8f, interfaceC1396800mS6, c1384510m8H.LJI, c1384510m8H.LJII);
    }

    @Override // X.AbstractC1397150mSf, X.InterfaceC1396970mSN
    public final InterfaceC1397010mSR LIZLLL(MotionEvent motionEvent) {
        Iterator it2 = this.LJI.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            AbstractC1396950mSL abstractC1396950mSL = (AbstractC1396950mSL) it2.next();
            if (motionEvent.getY() <= abstractC1396950mSL.LJIIIIZZ + abstractC1396950mSL.LJII) {
                if (motionEvent.getY() < abstractC1396950mSL.LJIIIIZZ || !abstractC1396950mSL.onTouchEvent(motionEvent)) {
                    break;
                }
                return abstractC1396950mSL;
            }
        }
        return null;
    }

    @Override // X.InterfaceC1385080m9C
    public final void LJJIII(int i) {
        switch (i) {
            case 1400:
                new AwS565S0100000_21(this, 1457).invoke();
                break;
            case 1401:
            case 1402:
            case 1403:
            case 1404:
                LJI();
                break;
            case 1406:
            case 1407:
                new AwS565S0100000_21(this, 1456).invoke();
                break;
            case 1410:
                for (T t : this.LJI) {
                    this.LIZ.LJIIIIZZ(t);
                    this.LJI.remove(t);
                }
                LJI();
                break;
        }
    }

    @Override // X.AbstractC1397150mSf, X.InterfaceC1396870mSD
    public final void LIZ(int i, int i2) {
        int i3;
        int i4 = this.LJIIIIZZ;
        if (i > 0 && i4 > 0) {
            i3 = i - i4;
        } else {
            i3 = 0;
        }
        super.LIZ(i, i2);
        if (i3 != 0) {
            for (AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy : LJ()) {
                abstractC1396720mRy.LJIJ(((i * abstractC1396720mRy.LJIILIIL()) / i4) - abstractC1396720mRy.LJIILIIL());
            }
        }
    }

    @Override // X.AbstractC1397150mSf
    public final boolean LJII(long j, AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy) {
        Long lValueOf;
        abstractC1396720mRy.LJJIIJZLJL(LSPassThroughRecordSizeConfig.DEFAULT);
        if (this.LIZLLL.LJFF.LJIIIIZZ) {
            Iterator<AbstractC1396720mRy<AbstractC1384320m7y>> it2 = LJ().iterator();
            while (true) {
                Long lValueOf2 = null;
                if (!it2.hasNext()) {
                    break;
                }
                AbstractC1396720mRy<AbstractC1384320m7y> next = it2.next();
                AbstractC1384320m7y abstractC1384320m7yLJ = next.LJ();
                if (abstractC1384320m7yLJ != null) {
                    lValueOf = Long.valueOf(abstractC1384320m7yLJ.LIZJ);
                } else {
                    lValueOf = null;
                }
                AbstractC1384320m7y abstractC1384320m7yLJ2 = abstractC1396720mRy.LJ();
                if (abstractC1384320m7yLJ2 != null) {
                    lValueOf2 = Long.valueOf(abstractC1384320m7yLJ2.LIZJ);
                }
                if (Intrinsics.LJFF(lValueOf, lValueOf2)) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        if (this.LIZLLL.LIZLLL.LJIILIIL) {
            Iterator it3 = C13LP.LJLLLL(new AComparatorS40S0000000_21(10), this.LJI).iterator();
            while (it3.hasNext()) {
                if (((C1397060mSW) it3.next()).LJ(j, abstractC1396720mRy)) {
                    return true;
                }
            }
            return false;
        }
        Iterator it4 = this.LJI.iterator();
        while (it4.hasNext()) {
            if (((C1397060mSW) it4.next()).LJ(j, abstractC1396720mRy)) {
                return true;
            }
        }
        return false;
    }

    public final void LJIIIZ(long j, List<? extends AbstractC1396720mRy<AbstractC1384320m7y>> list) {
        super.LJJIJIL(j, list);
    }

    @Override // X.AbstractC1397150mSf, X.InterfaceC1396870mSD
    public final void LJJIJIL(long j, List<? extends AbstractC1396720mRy<AbstractC1384320m7y>> list) {
        new AwS42S0200100_21(this, (List) list, j, 1).invoke();
    }

    @Override // X.AbstractC1397150mSf, X.InterfaceC1396870mSD
    public final int LIZJ(long j, boolean z, boolean z2) {
        new C1397210mSl(this, j).invoke();
        return super.LIZJ(j, z, z2);
    }
}
