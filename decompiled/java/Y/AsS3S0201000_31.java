package Y;

import X.AbstractC1585810rMx;
import X.C1086520eNe;
import X.C1389340mG4;
import X.C13LQ;
import X.C15S3;
import X.C15TA;
import X.C15V2;
import X.C15W2;
import X.C20521215Rq;
import X.C20522315Sb;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedComponent;
import com.ss.android.ugc.aweme.explore.assem.ExploreTopicGeneralFeedListComponent;
import com.ss.android.ugc.aweme.explore.common.ExploreStaggeredGridLayoutManager;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public class AsS3S0201000_31 extends AbstractC1585810rMx {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            default:
                super.LJJIIJ(recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public AsS3S0201000_31(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LJJIIJ$0(AsS3S0201000_31 asS3S0201000_31, RecyclerView recyclerView, int i) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        int iIntValue;
        int iIntValue2;
        C20522315Sb c20522315Sb;
        if (i == 0) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof ExploreStaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) != null) {
                ExploreTopicGeneralFeedListComponent exploreTopicGeneralFeedListComponent = (ExploreTopicGeneralFeedListComponent) asS3S0201000_31.l0;
                int[] iArr = new int[staggeredGridLayoutManager.LL];
                staggeredGridLayoutManager.LJIJJ(iArr);
                Integer numLJJI = C13LQ.LJJI(iArr);
                if (numLJJI != null) {
                    iIntValue = numLJJI.intValue();
                } else {
                    iIntValue = 0;
                }
                Integer numLJJJJI = C13LQ.LJJJJI(iArr);
                if (numLJJJJI != null) {
                    iIntValue2 = numLJJJJI.intValue();
                } else {
                    iIntValue2 = 0;
                }
                int iMax = Math.max(iIntValue, iIntValue2);
                if (iMax != -1 && ((c20522315Sb = exploreTopicGeneralFeedListComponent.LLJIJIL) == null || !c20522315Sb.LLLFF)) {
                    exploreTopicGeneralFeedListComponent.ip().xm().LJ(iMax);
                }
            }
        } else if (i == 1) {
            ((ExploreTopicGeneralFeedListComponent) asS3S0201000_31.l0).ip().LLJJIJIL = false;
            return;
        } else if (i != 0) {
            return;
        }
        ((ExploreTopicGeneralFeedListComponent) asS3S0201000_31.l0).zp();
    }

    public static final void LJJIIJ$1(AsS3S0201000_31 asS3S0201000_31, RecyclerView recyclerView, int i) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        int iIntValue;
        int iIntValue2;
        if (i != 0) {
            if (i == 1) {
                ((ExploreFeedComponent) asS3S0201000_31.l0).ip().LLJJL = false;
                ((ExploreFeedComponent) asS3S0201000_31.l0).ip();
                C15W2 c15w2 = C15S3.LIZIZ;
                if (c15w2 == null) {
                    c15w2 = new C15W2("exploreScroll", 3000L);
                    C15S3.LIZIZ = c15w2;
                }
                c15w2.LIZ();
                return;
            }
            return;
        }
        C15W2 c15w22 = C15S3.LIZIZ;
        if (c15w22 != null) {
            c15w22.LIZIZ();
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof ExploreStaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) != null) {
            ExploreFeedComponent exploreFeedComponent = (ExploreFeedComponent) asS3S0201000_31.l0;
            int[] iArr = new int[staggeredGridLayoutManager.LL];
            staggeredGridLayoutManager.LJIJJ(iArr);
            Integer numLJJI = C13LQ.LJJI(iArr);
            if (numLJJI != null) {
                iIntValue = numLJJI.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numLJJJJI = C13LQ.LJJJJI(iArr);
            if (numLJJJJI != null) {
                iIntValue2 = numLJJJJI.intValue();
            } else {
                iIntValue2 = 0;
            }
            int iMax = Math.max(iIntValue, iIntValue2);
            if (iMax != -1) {
                C20522315Sb c20522315SbOo = exploreFeedComponent.Oo();
                if (!(c20522315SbOo instanceof C20522315Sb) || c20522315SbOo == null || !c20522315SbOo.LLLFF) {
                    exploreFeedComponent.ip().xm().LJ(iMax);
                }
            }
        }
        ExploreFeedComponent exploreFeedComponent2 = (ExploreFeedComponent) asS3S0201000_31.l0;
        exploreFeedComponent2.withStateSafe(exploreFeedComponent2.ip(), new AwS610S0100000_31((ExploreFeedComponent) asS3S0201000_31.l0, 487));
    }

    public static final void LJJIIZI$0(AsS3S0201000_31 asS3S0201000_31, RecyclerView recyclerView, int i, int i2) {
        String str;
        String str2;
        String str3;
        if (i2 > 0) {
            int i3 = asS3S0201000_31.i2 + i2;
            asS3S0201000_31.i2 = i3;
            Long l = null;
            if (i3 > ((double) C1389340mG4.LIZJ(((C1086520eNe) asS3S0201000_31.l1).getContext(), null).LIZJ) * 0.25d) {
                ((ExploreTopicGeneralFeedListComponent) asS3S0201000_31.l0).ip().getClass();
                if (Intrinsics.LJFF("homepage_explore", "explore_in_feed")) {
                    str = "explore_preview";
                } else {
                    str = "";
                }
                C15TA c15ta = C15TA.LIZ;
                ((ExploreTopicGeneralFeedListComponent) asS3S0201000_31.l0).ip().getClass();
                C20521215Rq c20521215RqEk = ((ExploreTopicGeneralFeedListComponent) asS3S0201000_31.l0).Ek();
                if (c20521215RqEk != null) {
                    str2 = c20521215RqEk.LIZ;
                } else {
                    str2 = null;
                }
                C15V2 c15v2Ja = ((ExploreTopicGeneralFeedListComponent) asS3S0201000_31.l0).ja();
                if (c15v2Ja != null) {
                    str3 = c15v2Ja.LIZ;
                } else {
                    str3 = null;
                }
                C15V2 c15v2Ja2 = ((ExploreTopicGeneralFeedListComponent) asS3S0201000_31.l0).ja();
                if (c15v2Ja2 != null) {
                    l = c15v2Ja2.LIZIZ;
                }
                c15ta.getClass();
                C15TA.LJIILIIL(l, str, str2, str3);
            }
        }
    }

    public static final void LJJIIZI$1(AsS3S0201000_31 asS3S0201000_31, RecyclerView recyclerView, int i, int i2) {
        String str;
        String str2;
        String str3;
        if (i2 > 0) {
            int i3 = asS3S0201000_31.i2 + i2;
            asS3S0201000_31.i2 = i3;
            Long l = null;
            if (i3 > ((double) C1389340mG4.LIZJ(((C1086520eNe) asS3S0201000_31.l1).getContext(), null).LIZJ) * 0.25d) {
                ((ExploreFeedComponent) asS3S0201000_31.l0).ip();
                if (Intrinsics.LJFF("homepage_explore", "explore_in_feed")) {
                    str = "explore_preview";
                } else {
                    str = "";
                }
                C15TA c15ta = C15TA.LIZ;
                ((ExploreFeedComponent) asS3S0201000_31.l0).ip();
                C20521215Rq c20521215RqEk = ((ExploreFeedComponent) asS3S0201000_31.l0).Ek();
                if (c20521215RqEk != null) {
                    str2 = c20521215RqEk.LIZ;
                } else {
                    str2 = null;
                }
                C15V2 c15v2Ja = ((ExploreFeedComponent) asS3S0201000_31.l0).ja();
                if (c15v2Ja != null) {
                    str3 = c15v2Ja.LIZ;
                } else {
                    str3 = null;
                }
                C15V2 c15v2Ja2 = ((ExploreFeedComponent) asS3S0201000_31.l0).ja();
                if (c15v2Ja2 != null) {
                    l = c15v2Ja2.LIZIZ;
                }
                c15ta.getClass();
                C15TA.LJIILIIL(l, str, str2, str3);
            }
        }
    }
}
