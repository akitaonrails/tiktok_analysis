package X;

import com.ss.android.ugc.aweme.search.performance.chunk.core.model.PreRenderCard;
import java.util.Map;

/* JADX INFO: renamed from: X.0Pcs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648960Pcs implements InterfaceC342110Db7 {
    public final C648970Pct LL;

    public C648960Pcs(C648970Pct c648970Pct) {
        this.LL = c648970Pct;
    }

    @Override // X.InterfaceC342110Db7
    public final void LIZ(PreRenderCard preRenderCard) {
        C648970Pct c648970Pct = this.LL;
        if (c648970Pct.LIZIZ > 0) {
            C19EG c19egLJ = C651290Pgd.LJ();
            if (c19egLJ != null) {
                C653690PkV c653690PkV = C653690PkV.LIZ;
                Map<Integer, Integer> map = c648970Pct.LIZ;
                c653690PkV.getClass();
                C653690PkV.LIZJ(c19egLJ, map);
            }
            c648970Pct.LIZIZ--;
        }
    }
}
