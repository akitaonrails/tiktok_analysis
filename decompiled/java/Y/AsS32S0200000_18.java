package Y;

import X.AbstractC1585810rMx;
import X.C1172320gc2;
import X.C1185430gxB;
import X.C1189060h32;
import X.C1204880hSY;
import X.C1204900hSa;
import X.C13LQ;
import X.C1558360qeg;
import X.C20684815ws;
import X.C2344009Gk;
import X.C415530GRb;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment;
import com.ss.android.ugc.aweme.poi.albummix.assem.PoiAlbumMixPageListAssem;
import com.ss.android.ugc.aweme.poi.collect.PoiCollectListAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.viewmodel.PoiHeaderTopVideosSharedViewModel;
import com.ss.android.ugc.nearby.toolzone.NearbyToolZoneCellAssem;

/* JADX INFO: loaded from: classes19.dex */
public class AsS32S0200000_18 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 2:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 3:
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
            case 2:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public AsS32S0200000_18(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void LJJIIJ$0(AsS32S0200000_18 asS32S0200000_18, RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i == 1) {
                ((NearbyToolZoneCellAssem) asS32S0200000_18.l0).LLJLILLLLZIIL = false;
            }
        } else {
            if (((NearbyToolZoneCellAssem) asS32S0200000_18.l0).LLJLILLLLZIIL) {
                return;
            }
            C1204900hSa c1204900hSa = C1204900hSa.LIZ;
            Integer num = (Integer) asS32S0200000_18.l1;
            c1204900hSa.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            C1189060h32.LJIJJLI(c2344009Gk, "all_item_cnt", num);
            C1189060h32.LJIJJLI(c2344009Gk, "all_item_name", C1204900hSa.LIZIZ);
            C1189060h32.LJIJJLI(c2344009Gk, "nearby_tab_city_id", C1204880hSY.LIZIZ());
            C20684815ws.LJIILLIIL("ttls_nearby_toolzone_slide", c2344009Gk.LIZ);
            ((NearbyToolZoneCellAssem) asS32S0200000_18.l0).LLJLILLLLZIIL = true;
        }
    }

    public static final void LJJIIJ$1(AsS32S0200000_18 asS32S0200000_18, RecyclerView recyclerView, int i) {
        String str;
        RecyclerView.LayoutManager layoutManager;
        int iIntValue;
        int iIntValue2;
        boolean z;
        boolean z2;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        boolean z3 = true;
        if (i == 1) {
            PoiAlbumMixPageListAssem poiAlbumMixPageListAssem = (PoiAlbumMixPageListAssem) asS32S0200000_18.l0;
            poiAlbumMixPageListAssem.LLJZ = true;
            poiAlbumMixPageListAssem.LLLFF = false;
            poiAlbumMixPageListAssem.LLLF = null;
            return;
        }
        if (i != 0) {
            return;
        }
        PoiAlbumMixPageListAssem poiAlbumMixPageListAssem2 = (PoiAlbumMixPageListAssem) asS32S0200000_18.l0;
        if (poiAlbumMixPageListAssem2.LLJZ) {
            poiAlbumMixPageListAssem2.LLJZ = false;
            PoiHeaderTopVideosSharedViewModel poiHeaderTopVideosSharedViewModelSp = poiAlbumMixPageListAssem2.sp();
            if (poiHeaderTopVideosSharedViewModelSp != null) {
                poiHeaderTopVideosSharedViewModelSp.DQ2((PageFinder) ((PoiAlbumMixPageListAssem) asS32S0200000_18.l0).LLJLLIL.getValue(), C1558360qeg.LJ((ViewOnAttachStateChangeListenerC20604515jv) asS32S0200000_18.l1, null), "scroll");
            }
        }
        PoiAlbumMixPageListAssem poiAlbumMixPageListAssem3 = (PoiAlbumMixPageListAssem) asS32S0200000_18.l0;
        if (!poiAlbumMixPageListAssem3.LLLFF || (str = poiAlbumMixPageListAssem3.LLLF) == null) {
            return;
        }
        int iOp = poiAlbumMixPageListAssem3.op(str);
        if (iOp >= 0) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = poiAlbumMixPageListAssem3.LLJLLL;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                layoutManager = viewOnAttachStateChangeListenerC20604515jv2.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if (layoutManager instanceof GridLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                iIntValue = linearLayoutManager.findFirstVisibleItemPosition();
                iIntValue2 = linearLayoutManager.findLastVisibleItemPosition();
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                Integer numLJJJJLL = C13LQ.LJJJJLL(staggeredGridLayoutManager.LJIJ(null));
                if (numLJJJJLL != null) {
                    iIntValue = numLJJJJLL.intValue();
                } else {
                    iIntValue = -1;
                }
                Integer numLJJJJJL = C13LQ.LJJJJJL(staggeredGridLayoutManager.LJIJJ(null));
                if (numLJJJJJL != null) {
                    iIntValue2 = numLJJJJJL.intValue();
                } else {
                    iIntValue2 = -1;
                }
            } else {
                poiAlbumMixPageListAssem3.LLLFF = false;
                poiAlbumMixPageListAssem3.LLLF = null;
                return;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = poiAlbumMixPageListAssem3.LLJLLL;
            if (viewOnAttachStateChangeListenerC20604515jv3 != null && !viewOnAttachStateChangeListenerC20604515jv3.canScrollVertically(1)) {
                z = true;
            } else {
                z = false;
            }
            if (iIntValue == iOp) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z || iIntValue > iOp || iOp > iIntValue2) {
                z3 = false;
            }
            if (!z2 && !z3) {
                String str2 = poiAlbumMixPageListAssem3.LLLF;
                if (str2 == null || (viewOnAttachStateChangeListenerC20604515jv = poiAlbumMixPageListAssem3.LLJLLL) == null) {
                    return;
                }
                HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS23S1100000_18(poiAlbumMixPageListAssem3, str2, 2));
                return;
            }
            poiAlbumMixPageListAssem3.LLLFF = false;
            poiAlbumMixPageListAssem3.LLLF = null;
            return;
        }
        poiAlbumMixPageListAssem3.LLLFF = false;
        poiAlbumMixPageListAssem3.LLLF = null;
    }

    public static final void LJJIIZI$0(AsS32S0200000_18 asS32S0200000_18, RecyclerView recyclerView, int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        if (((AddMultiVideoFragment.CandidateGridLayoutManager) asS32S0200000_18.l0).getItemCount() - 1 == ((AddMultiVideoFragment.CandidateGridLayoutManager) asS32S0200000_18.l0).findLastVisibleItemPosition() && ((AddMultiVideoFragment) asS32S0200000_18.l1).VR().LLIZ && ((AddMultiVideoFragment) asS32S0200000_18.l1).VR().LLILZLL && !((AddMultiVideoFragment) asS32S0200000_18.l1).VR().LLJILJIL) {
            ((AddMultiVideoFragment) asS32S0200000_18.l1).VR().LLJILJIL = true;
            ((PowerPageSource) ((AddMultiVideoFragment) asS32S0200000_18.l1).VR().LLJILLL.getValue()).getOperator().LIZ(null);
        }
    }

    public static final void LJJIIZI$1(AsS32S0200000_18 asS32S0200000_18, RecyclerView recyclerView, int i, int i2) {
        int iFindLastVisibleItemPosition = ((LinearLayoutManager) ((ViewOnAttachStateChangeListenerC20604515jv) asS32S0200000_18.l0).getLayoutManager()).findLastVisibleItemPosition();
        for (int iFindFirstVisibleItemPosition = ((LinearLayoutManager) ((ViewOnAttachStateChangeListenerC20604515jv) asS32S0200000_18.l0).getLayoutManager()).findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition < iFindLastVisibleItemPosition; iFindFirstVisibleItemPosition++) {
            try {
                String str = ((C1172320gc2) ((ViewOnAttachStateChangeListenerC20604515jv) asS32S0200000_18.l0).getState().LJI(iFindFirstVisibleItemPosition)).LLILLL;
                if (str == null) {
                    str = "";
                }
                C1185430gxB c1185430gxB = C1185430gxB.LIZ;
                boolean z = ((PoiCollectListAssem) asS32S0200000_18.l1).LLJILJILJ;
                c1185430gxB.getClass();
                C1185430gxB.LJJIII(str, z);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
    }

    public static final void LJJIIZI$2(AsS32S0200000_18 asS32S0200000_18, RecyclerView recyclerView, int i, int i2) {
        NearbyToolZoneCellAssem nearbyToolZoneCellAssem = (NearbyToolZoneCellAssem) asS32S0200000_18.l0;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = nearbyToolZoneCellAssem.LLJL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            int iComputeHorizontalScrollOffset = viewOnAttachStateChangeListenerC20604515jv.computeHorizontalScrollOffset();
            int iComputeHorizontalScrollExtent = viewOnAttachStateChangeListenerC20604515jv.computeHorizontalScrollExtent();
            int iComputeHorizontalScrollRange = viewOnAttachStateChangeListenerC20604515jv.computeHorizontalScrollRange();
            C415530GRb c415530GRb = nearbyToolZoneCellAssem.LLJLIL;
            if (c415530GRb != null) {
                c415530GRb.setScrollOffset(iComputeHorizontalScrollOffset);
                c415530GRb.setVisibleWidth(iComputeHorizontalScrollExtent);
                c415530GRb.setTotalWidth(iComputeHorizontalScrollRange);
            }
        }
    }
}
