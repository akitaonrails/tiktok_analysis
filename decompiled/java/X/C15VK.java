package X;

import Y.AsS56S0100000_31;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.ss.android.ugc.aweme.explore.experiment.performance.ExploreLoadMoreOptConfig;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.15VK, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15VK {
    public final C15VE LIZ;
    public final ExploreLoadMoreOptConfig LIZIZ;
    public final boolean LIZJ;
    public RecyclerView LIZLLL;
    public double LJ;
    public long LJFF;
    public C15VY LJI;
    public int LJII;
    public long LJIIIIZZ;
    public final AsS56S0100000_31 LJIIIZ;

    public final void LIZ() {
        RecyclerView recyclerView = this.LIZLLL;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.LJIIIZ);
        }
        this.LIZLLL = null;
        this.LJ = 0.0d;
        this.LJFF = 0L;
        this.LJIIIIZZ = 0L;
        this.LJII = 0;
    }

    public C15VK(C15VE c15ve) {
        this.LIZ = c15ve;
        C01GW c01gw = C1867180ygm.LIZIZ;
        this.LIZIZ = (ExploreLoadMoreOptConfig) c01gw.getValue();
        this.LIZJ = ((ExploreLoadMoreOptConfig) c01gw.getValue()).enable;
        this.LJI = C15VY.DOWN;
        this.LJIIIZ = new AsS56S0100000_31(this, 14);
    }

    public final void LIZIZ(RecyclerView recyclerView) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        IntRange intRange;
        IntRange intRange2;
        AnonymousClass0956 anonymousClass0956LIZLLL;
        int i;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) != null) {
            int[] iArr = new int[staggeredGridLayoutManager.LJJIII()];
            staggeredGridLayoutManager.LJIJ(iArr);
            int[] iArr2 = new int[staggeredGridLayoutManager.LJJIII()];
            staggeredGridLayoutManager.LJIJJ(iArr2);
            Integer numLJJJJLL = C13LQ.LJJJJLL(iArr);
            if (numLJJJJLL != null) {
                int iIntValue = numLJJJJLL.intValue();
                Integer numLJJJJJL = C13LQ.LJJJJJL(iArr2);
                if (numLJJJJJL != null) {
                    int iIntValue2 = numLJJJJJL.intValue();
                    if (iIntValue >= 0 && iIntValue2 >= 0) {
                        double dAbs = Math.abs(this.LJ);
                        ExploreLoadMoreOptConfig exploreLoadMoreOptConfig = this.LIZIZ;
                        int iLJ = exploreLoadMoreOptConfig.baseCount;
                        int i2 = 0;
                        if (iLJ < 0) {
                            iLJ = 0;
                        }
                        int i3 = exploreLoadMoreOptConfig.maxCount;
                        if (i3 < iLJ) {
                            i3 = iLJ;
                        }
                        if (this.LJI != C15VY.UP) {
                            double d = exploreLoadMoreOptConfig.velocityLowPxPerSec;
                            double d2 = exploreLoadMoreOptConfig.velocityHighPxPerSec;
                            double d3 = 1.0d + d;
                            if (d2 < d3) {
                                d2 = d3;
                            }
                            if (dAbs > d) {
                                if (dAbs >= d2) {
                                    iLJ = i3;
                                } else {
                                    iLJ = C13LZ.LJ((int) (((double) iLJ) + (((dAbs - d) / (d2 - d)) * ((double) (i3 - iLJ)))), iLJ, i3);
                                }
                            }
                        }
                        int i4 = this.LIZIZ.baseCount;
                        if (i4 < 0) {
                            i4 = 0;
                        }
                        int i5 = C15VX.LIZ[this.LJI.ordinal()];
                        if (i5 != 1) {
                            if (i5 == 2) {
                                int i6 = iIntValue - iLJ;
                                if (i6 < 0) {
                                    i = 0;
                                } else {
                                    i = i6;
                                }
                                intRange = new IntRange(i, iIntValue - 1);
                                if (i6 >= 0) {
                                    i2 = i6;
                                }
                                intRange2 = new IntRange(i2, iIntValue2 + i4);
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            int i7 = iIntValue2 + 1;
                            int i8 = iIntValue2 + iLJ;
                            intRange = new IntRange(i7, i8);
                            int i9 = iIntValue - i4;
                            if (i9 >= 0) {
                                i2 = i9;
                            }
                            intRange2 = new IntRange(i2, i8);
                        }
                        if (!intRange.isEmpty()) {
                            C15VE c15ve = this.LIZ;
                            c15ve.getClass();
                            if (!intRange.isEmpty() && intRange.LL >= 0) {
                                AnonymousClass0956 anonymousClass0956 = c15ve.LJ;
                                if (anonymousClass0956 != null) {
                                    anonymousClass0956.LIZIZ(null);
                                }
                                InterfaceC497601wk interfaceC497601wk = c15ve.LIZJ;
                                if (interfaceC497601wk == null && (interfaceC497601wk = c15ve.LIZLLL) == null) {
                                    anonymousClass0956LIZLLL = null;
                                } else {
                                    anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C15VI(c15ve, intRange, null), 2);
                                }
                                c15ve.LJ = anonymousClass0956LIZLLL;
                            }
                        }
                        if (!intRange2.isEmpty()) {
                            C15VE c15ve2 = this.LIZ;
                            c15ve2.getClass();
                            if (!intRange2.isEmpty()) {
                                InterfaceC497601wk interfaceC497601wk2 = c15ve2.LIZJ;
                                if (interfaceC497601wk2 == null && (interfaceC497601wk2 = c15ve2.LIZLLL) == null) {
                                    return;
                                }
                                C23250099c.LIZLLL(interfaceC497601wk2, C0PEM.LIZJ, null, new C15VG(c15ve2, intRange2, null), 2);
                            }
                        }
                    }
                }
            }
        }
    }
}
