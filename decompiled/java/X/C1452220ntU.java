package X;

import Y.ARunnableS122S0100000_22;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;

/* JADX INFO: renamed from: X.0ntU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452220ntU implements InterfaceC1464200oCo {
    public final /* synthetic */ AbstractC1452680nuE LL;

    public C1452220ntU(AbstractC1452680nuE abstractC1452680nuE) {
        this.LL = abstractC1452680nuE;
    }

    @Override // X.InterfaceC1464200oCo
    public final void onCallback(int i, int i2, float f, String str) {
        FilterBean filterBean;
        if (i == 4143 && (filterBean = this.LL.LJJIIZI) != null && C1643880ssc.LJ(filterBean)) {
            AbstractC1452680nuE abstractC1452680nuE = this.LL;
            if (abstractC1452680nuE.LJIJ == null) {
                abstractC1452680nuE.LJIJ = new SafeHandler(this.LL.LJIJJLI);
            }
            AbstractC1452680nuE abstractC1452680nuE2 = this.LL;
            SafeHandler safeHandler = abstractC1452680nuE2.LJIJ;
            if (safeHandler != null) {
                safeHandler.post(new ARunnableS122S0100000_22(abstractC1452680nuE2, 93));
            }
        }
    }
}
