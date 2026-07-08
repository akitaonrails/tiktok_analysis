package X;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mSh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1397170mSh extends AbstractC1397150mSf<AbstractC1396950mSL> {
    public AbstractC1396720mRy<AbstractC1384320m7y> LJIIJ;
    public final List<AbstractC1396720mRy<AbstractC1384320m7y>> LJIIJJI = new ArrayList();
    public final Matrix LJIIL = new Matrix();
    public final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(549));

    @Override // X.AbstractC1397150mSf, X.InterfaceC1396870mSD
    public final int LIZJ(long j, boolean z, boolean z2) {
        return 0;
    }

    @Override // X.AbstractC1397150mSf
    public final void LJI() {
    }

    @Override // X.AbstractC1397150mSf
    public final boolean LJII(long j, AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy) {
        return true;
    }

    @Override // X.AbstractC1397150mSf, X.InterfaceC1396870mSD
    public final void LJIILJJIL(AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy) {
    }

    @Override // X.InterfaceC1396870mSD
    public final int LJJIJLIJ() {
        return 1004;
    }

    @Override // X.AbstractC1397150mSf, X.InterfaceC1396870mSD
    public final List<AbstractC1396720mRy<AbstractC1384320m7y>> LJ() {
        ArrayList arrayList = new ArrayList();
        AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy = this.LJIIJ;
        if (abstractC1396720mRy != null) {
            arrayList.add(abstractC1396720mRy);
        }
        return arrayList;
    }

    @Override // X.AbstractC1397150mSf
    public final C1396790mS5 LJIIIIZZ() {
        return new C1396790mS5(this.LIZLLL, this.LIZIZ, 1, 1L);
    }

    @Override // X.InterfaceC1396870mSD
    public final int LIZIZ() {
        return Integer.MAX_VALUE;
    }

    public final void LJIIIZ(C1396680mRu c1396680mRu) {
        if (c1396680mRu.LL != 0) {
            this.LJIIL.reset();
            float f = 0;
            float f2 = this.LJIIIIZZ / f;
            float f3 = this.LJIIIZ / f;
            if (f2 < f3) {
                this.LJIIL.postScale(f2, f2, 0.0f, 0.0f);
            } else {
                this.LJIIL.postScale(f3, f3, 0.0f, 0.0f);
            }
        }
    }

    @Override // X.AbstractC1397150mSf, X.InterfaceC1396870mSD
    public final void LJJI(Function1<? super AbstractC1384320m7y, Boolean> function1) {
        new AwS565S0100000_21(this, 1440).invoke();
    }

    @Override // X.InterfaceC1385080m9C
    public final void LJJIII(int i) {
        if (i == 1700) {
            new AwS565S0100000_21(this, 1441).invoke();
        }
    }

    @Override // X.AbstractC1397150mSf, X.InterfaceC1396870mSD
    public final void LIZ(int i, int i2) {
        this.LJIIIIZZ = i;
        this.LJIIIZ = i2;
        this.LIZLLL.LJIIIIZZ.getClass();
        AbstractC1396720mRy<AbstractC1384320m7y> abstractC1396720mRy = this.LJIIJ;
        if (!(abstractC1396720mRy instanceof C1396680mRu)) {
            abstractC1396720mRy = null;
        }
        C1396680mRu c1396680mRu = (C1396680mRu) abstractC1396720mRy;
        if (c1396680mRu != null) {
            LJIIIZ(c1396680mRu);
        }
    }

    @Override // X.AbstractC1397150mSf, X.InterfaceC1396870mSD
    public final void LJJIJIL(long j, List<? extends AbstractC1396720mRy<AbstractC1384320m7y>> list) {
        new AwS422S0200000_21(this, list, 110).invoke();
    }
}
