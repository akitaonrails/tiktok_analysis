package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.performance.asyncprefetch.config.AsyncLoadConfig;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0PEh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641530PEh implements C0PT6 {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;

    @Override // X.C0PT6
    public final int LIZ() {
        return this.LJ;
    }

    public C641530PEh(RecyclerView recyclerView) {
        int iLIZJ = C641520PEg.LIZJ(recyclerView);
        this.LIZLLL = iLIZJ;
        AsyncLoadConfig asyncLoadConfig = C640690PBb.LIZIZ;
        this.LJ = asyncLoadConfig.preloadCount * iLIZJ;
        this.LJFF = asyncLoadConfig.scrollDistanceToPreLoad;
    }

    @Override // X.C0PT6
    public final IntRange LIZIZ(RecyclerView recyclerView, int i) {
        this.LIZ = i;
        int i2 = this.LJFF;
        if (i >= i2) {
            Integer numLIZIZ = C641520PEg.LIZIZ(recyclerView);
            int i3 = this.LIZJ;
            if (numLIZIZ == null || numLIZIZ.intValue() == i3) {
                return null;
            }
            this.LIZJ = numLIZIZ.intValue();
            return new IntRange(numLIZIZ.intValue() + 1, numLIZIZ.intValue() + Math.min(this.LIZLLL * 2, this.LJ));
        }
        if (i <= (-i2)) {
            Integer numLIZ = C641520PEg.LIZ(recyclerView);
            int i4 = this.LIZIZ;
            if (numLIZ == null || numLIZ.intValue() == i4) {
                return null;
            }
            this.LIZIZ = numLIZ.intValue();
            return C13LZ.LJIILJJIL(numLIZ.intValue() - Math.min(this.LIZLLL * 2, this.LJ), numLIZ.intValue());
        }
        return null;
    }

    @Override // X.C0PT6
    public final IntRange LLF(RecyclerView recyclerView, int i) {
        Integer numLIZ;
        if (i == 0) {
            int i2 = this.LIZ;
            if (i2 >= 1) {
                Integer numLIZIZ = C641520PEg.LIZIZ(recyclerView);
                if (numLIZIZ != null) {
                    return new IntRange(numLIZIZ.intValue() + 1, numLIZIZ.intValue() + this.LJ);
                }
                return null;
            }
            if (i2 <= -1 && (numLIZ = C641520PEg.LIZ(recyclerView)) != null) {
                return C13LZ.LJIILJJIL(numLIZ.intValue() - Math.min(this.LIZLLL * 2, this.LJ), numLIZ.intValue());
            }
            return null;
        }
        return null;
    }
}
