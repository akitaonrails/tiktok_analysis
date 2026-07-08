package Y;

import X.AbstractC1585810rMx;
import X.AbstractC21673619ry;
import X.C013C;
import X.C118300cf;
import X.C1185430gxB;
import X.C1203200hPq;
import X.C13LP;
import X.C13LQ;
import X.C1558360qeg;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.poi.album.PoiAlbumViewModel;
import com.ss.android.ugc.aweme.poi.album.assem.PoiAlbumContentAssem;
import com.ss.android.ugc.aweme.poi.reviews.landing.ui.PoiReviewsContentAssem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS102S0201000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class AsS18S0300000_18 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
            case 2:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
        }
    }

    public static final void LJJIIJ$0(AsS18S0300000_18 asS18S0300000_18, RecyclerView recyclerView, int i) {
        if (i == 1) {
            PoiAlbumContentAssem poiAlbumContentAssem = (PoiAlbumContentAssem) asS18S0300000_18.l0;
            poiAlbumContentAssem.LLJILJILJ = false;
            poiAlbumContentAssem.LLJILLL = true;
        } else {
            if (i != 0) {
                return;
            }
            PoiAlbumContentAssem poiAlbumContentAssem2 = (PoiAlbumContentAssem) asS18S0300000_18.l0;
            if (!poiAlbumContentAssem2.LLJILLL) {
                return;
            }
            poiAlbumContentAssem2.LLJILLL = false;
            poiAlbumContentAssem2.Jo().wQ2((PageFinder) ((PoiAlbumContentAssem) asS18S0300000_18.l0).LLJJ.getValue(), C1558360qeg.LJ((ViewOnAttachStateChangeListenerC20604515jv) asS18S0300000_18.l1, null), "scroll");
        }
    }

    public static final void LJJIIJ$1(AsS18S0300000_18 asS18S0300000_18, RecyclerView recyclerView, int i) {
        if (i == 1) {
            ((C013C) asS18S0300000_18.l0).element = true;
            return;
        }
        if (i != 0) {
            return;
        }
        C013C c013c = (C013C) asS18S0300000_18.l0;
        if (!c013c.element) {
            return;
        }
        c013c.element = false;
        C1185430gxB.LJJIJL(C1185430gxB.LIZ, ((PoiReviewsContentAssem) asS18S0300000_18.l1).Lo().Xq1(), "scroll", C1558360qeg.LJ((ViewOnAttachStateChangeListenerC20604515jv) asS18S0300000_18.l2, null), "poi_secondary_reviews_page", "poi_review", PageFinder.via(((PoiReviewsContentAssem) asS18S0300000_18.l1).LJJIJL()));
    }

    public AsS18S0300000_18(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    public static final void LJJIIZI$0(AsS18S0300000_18 asS18S0300000_18, RecyclerView recyclerView, int i, int i2) {
        int iIntValue;
        if (((PoiAlbumContentAssem) asS18S0300000_18.l0).LLJILJILJ) {
            return;
        }
        Integer numLJJJJLL = C13LQ.LJJJJLL(((StaggeredGridLayoutManager) asS18S0300000_18.l2).LJIJ(null));
        int iIntValue2 = -1;
        if (numLJJJJLL != null) {
            iIntValue = numLJJJJLL.intValue();
        } else {
            iIntValue = -1;
        }
        Integer num = (Integer) C13LP.LJJJLZIJ(iIntValue, ((PoiAlbumContentAssem) asS18S0300000_18.l0).LLJIJIL);
        if (num != null) {
            iIntValue2 = num.intValue();
        }
        boolean z = true;
        if (iIntValue != 0) {
            if (Intrinsics.LJFF(C13LP.LJJJLZIJ(iIntValue, ((PoiAlbumContentAssem) asS18S0300000_18.l0).LLJIJIL), C13LP.LJJJLZIJ(iIntValue - 1, ((PoiAlbumContentAssem) asS18S0300000_18.l0).LLJIJIL))) {
                z = false;
            }
        }
        if (iIntValue2 != ((PoiAlbumContentAssem) asS18S0300000_18.l0).Jo().getState().LLILLJJLI.LIZ && z) {
            PoiAlbumViewModel poiAlbumViewModelJo = ((PoiAlbumContentAssem) asS18S0300000_18.l0).Jo();
            poiAlbumViewModelJo.withState(new AwS102S0201000_18(iIntValue2, poiAlbumViewModelJo, C1203200hPq.LIZ, 6));
        }
    }

    public static final void LJJIIZI$1(AsS18S0300000_18 asS18S0300000_18, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        if (i == 0 && i2 == 0) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            Function0 function0 = (Function0) asS18S0300000_18.l0;
            Function0 function02 = (Function0) asS18S0300000_18.l1;
            C118300cf c118300cf = (C118300cf) asS18S0300000_18.l2;
            AbstractC21673619ry adapter = recyclerView.getAdapter();
            if (adapter != null && adapter.getItemCount() == 1) {
                if (recyclerView.canScrollVertically(-1)) {
                    function0.invoke();
                    return;
                } else {
                    function02.invoke();
                    return;
                }
            }
            if (iFindLastVisibleItemPosition > 0) {
                if (iFindLastVisibleItemPosition != c118300cf.element) {
                    function0.invoke();
                }
            } else if (iFindLastVisibleItemPosition != c118300cf.element) {
                function02.invoke();
            }
            c118300cf.element = iFindLastVisibleItemPosition;
        }
    }
}
