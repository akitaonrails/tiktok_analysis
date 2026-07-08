package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.recommendfeature.detail.component.feed.PoiRecommendFeatureDetailFeedItemData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gtX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183170gtX extends AbstractC1183180gtY {
    public final PoiRecommendFeatureDetailFeedItemData LL;
    public final int LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1183170gtX)) {
            return false;
        }
        C1183170gtX c1183170gtX = (C1183170gtX) obj;
        return Intrinsics.LJFF(this.LL, c1183170gtX.LL) && this.LLILLJJLI == c1183170gtX.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRecommendFeatureDetailVideoPowerItem(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", userDigChanged=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String aid;
        if (interfaceC1891350zJl instanceof C1183170gtX) {
            Aweme aweme = this.LL.aweme;
            String aid2 = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            Aweme aweme2 = ((C1183170gtX) interfaceC1891350zJl).LL.aweme;
            if (aweme2 != null) {
                aid2 = aweme2.getAid();
            }
            if (Intrinsics.LJFF(aid, aid2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1183170gtX(PoiRecommendFeatureDetailFeedItemData poiRecommendFeatureDetailFeedItemData, int i) {
        this.LL = poiRecommendFeatureDetailFeedItemData;
        this.LLILLJJLI = i;
    }
}
