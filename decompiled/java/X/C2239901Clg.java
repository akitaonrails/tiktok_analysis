package X;

import Y.ARunnableS112S0100000_12;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.preload.experiment.PhotoModePreloadConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1Clg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239901Clg extends C2239861Clc {
    public int LJIILL = -1;
    public int LJIILLIIL = -1;
    public final int LJIIZILJ = C2239941Clk.LIZ().detailGroupRangeSize;
    public final List<Aweme> LJIJ = new ArrayList();

    @Override // X.C2239861Clc
    public final List<Aweme> LIZJ() {
        int i = this.LJIILL;
        if (i >= this.LJIILLIIL || i >= ((ArrayList) this.LJIJ).size()) {
            return C13BV.INSTANCE;
        }
        List<Aweme> list = this.LJIJ;
        List listSubList = ((ArrayList) list).subList(this.LJIILL, Math.min(this.LJIILLIIL, ((ArrayList) list).size()));
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
        Iterator it2 = listSubList.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    @Override // X.C2239861Clc
    public final void LJ() {
        C1498600p6I.LIZIZ(new ARunnableS112S0100000_12(this, 213));
    }

    @Override // X.C2239861Clc
    public final int LJIILIIL() {
        return C2239941Clk.LIZ().detailHorizontalLoadCount;
    }

    @Override // X.C2239861Clc
    public final int LJIIZILJ() {
        return C2239941Clk.LIZ().detailVerticalTriggerDelta;
    }

    @Override // X.C2239861Clc
    public final int LJIIJJI(int i) {
        return i + this.LJIILL;
    }

    @Override // X.C2239861Clc
    public final void LJIILJJIL(int i) {
        this.LJIIIIZZ = i;
        int i2 = this.LJIIZILJ;
        int iMin = (i / i2) * i2;
        int iMin2 = Math.min(((ArrayList) this.LJIJ).size(), this.LJIIZILJ + iMin);
        int i3 = this.LJIILL;
        if (i3 != -1) {
            iMin = Math.min(iMin, i3);
        }
        int i4 = this.LJIILLIIL;
        if (i4 != -1) {
            iMin2 = Math.max(i4, iMin2);
        }
        if (iMin != this.LJIILL || iMin2 != this.LJIILLIIL) {
            this.LJIILL = iMin;
            this.LJIILLIIL = iMin2;
            try {
                LJFF();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        super.LJIILJJIL(i);
        C2239921Cli c2239921Cli = this.LJIILJJIL;
        if (c2239921Cli.LL != null) {
            c2239921Cli.onPageSelected(0);
        }
    }

    @Override // X.C2239861Clc
    public final int LJIILLIIL(PhotoModePreloadConfig photoModePreloadConfig) {
        return photoModePreloadConfig.detailVerticalLoadHorizontalCount;
    }
}
