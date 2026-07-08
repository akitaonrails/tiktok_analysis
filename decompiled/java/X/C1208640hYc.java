package X;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionContentAssem;
import com.ss.android.ugc.aweme.favorites.business.collection.assem.CollectionListMainUIAssem;
import com.ss.android.ugc.aweme.mix.pickcandidate.AddMultiVideoFragment;
import com.ss.android.ugc.aweme.poi.albummix.assem.PoiAlbumMixPageListAssem;
import com.ss.android.ugc.aweme.poi.detail.videolist.PoiDetailVideoListAssem;
import com.ss.android.ugc.aweme.poi.detail.videolist.container.PoiDetailPostListAssem;
import com.ss.android.ugc.aweme.story.archive.StoryArchListAssem;
import com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListAssem;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0hYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208640hYc extends AbstractC214823195h {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC214823195h
    public final int LJFF(int i) {
        switch (this.$t) {
            case 0:
                return LJFF$0(this, i);
            case 1:
                return LJFF$1(this, i);
            case 2:
                return LJFF$2(this, i);
            case 3:
                return LJFF$3(this, i);
            case 4:
                return LJFF$4(this, i);
            case 5:
                return LJFF$5(this, i);
            case 6:
                return LJFF$6(this, i);
            case 7:
                return LJFF$7(this, i);
            case 8:
                return LJFF$8(this, i);
            default:
                return super.LJFF(i);
        }
    }

    public static final int LJFF$0(C1208640hYc c1208640hYc, int i) {
        GridLayoutManager gridLayoutManager;
        if ((((C1171210gaF) c1208640hYc.l0).getItemViewType(i) != 0 && ((C1171210gaF) c1208640hYc.l0).getItemViewType(i) != 2) || (gridLayoutManager = ((CollectionContentAssem) c1208640hYc.l1).LLJIJIL) == null) {
            return 1;
        }
        return gridLayoutManager.LLILLJJLI;
    }

    public static final int LJFF$1(C1208640hYc c1208640hYc, int i) {
        if (((C1171240gaI) c1208640hYc.l0).getItemViewType(i) == 0) {
            return ((CollectionListMainUIAssem) c1208640hYc.l1).Ho();
        }
        return 1;
    }

    public static final int LJFF$2(C1208640hYc c1208640hYc, int i) {
        List<InterfaceC1891350zJl> listLJII = ((AddMultiVideoFragment.CandidateGridLayoutManager) c1208640hYc.l0).LLJ.getState().LJII();
        int headerCount = ((AddMultiVideoFragment.CandidateGridLayoutManager) c1208640hYc.l0).LLJ.getHeaderCount();
        if (i < headerCount) {
            return ((AddMultiVideoFragment.CandidateGridLayoutManager) c1208640hYc.l0).LLILLJJLI;
        }
        if (i >= ((ArrayList) listLJII).size() + headerCount) {
            return ((AddMultiVideoFragment.CandidateGridLayoutManager) c1208640hYc.l0).LLILLJJLI;
        }
        int i2 = i - headerCount;
        if (ListProtector.get(listLJII, i2) instanceof C423460Gj2) {
            return ((AddMultiVideoFragment.CandidateGridLayoutManager) c1208640hYc.l0).LLILLJJLI;
        }
        AbstractC214823195h abstractC214823195h = (AbstractC214823195h) c1208640hYc.l1;
        if (abstractC214823195h != null) {
            return abstractC214823195h.LJFF(i2);
        }
        return 1;
    }

    public static final int LJFF$3(C1208640hYc c1208640hYc, int i) {
        int headerCount = ((StoryArchListAssem) c1208640hYc.l0).Go().getHeaderCount();
        List<InterfaceC1891350zJl> listLJII = ((StoryArchListAssem) c1208640hYc.l0).Go().getState().LJII();
        if (i < headerCount) {
            return ((GridLayoutManager) c1208640hYc.l1).LLILLJJLI;
        }
        if (i >= headerCount + ((ArrayList) listLJII).size()) {
            return ((GridLayoutManager) c1208640hYc.l1).LLILLJJLI;
        }
        return 1;
    }

    public static final int LJFF$4(C1208640hYc c1208640hYc, int i) {
        C20600815jK<InterfaceC1891350zJl> state;
        List<InterfaceC1891350zJl> listLJII;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((PoiAlbumMixPageListAssem) c1208640hYc.l0).LLJLLL;
        Object objLJJJLZIJ = null;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null && (listLJII = state.LJII()) != null) {
            objLJJJLZIJ = C13LP.LJJJLZIJ(i, listLJII);
        }
        if (!(objLJJJLZIJ instanceof C1183810guZ)) {
            return ((GridLayoutManager) c1208640hYc.l1).LLILLJJLI;
        }
        return 1;
    }

    public static final int LJFF$5(C1208640hYc c1208640hYc, int i) {
        int headerCount = ((RepostListAssem) c1208640hYc.l0).Go().getHeaderCount();
        List<InterfaceC1891350zJl> listLJII = ((RepostListAssem) c1208640hYc.l0).Go().getState().LJII();
        if (i < headerCount) {
            return ((GridLayoutManager) c1208640hYc.l1).LLILLJJLI;
        }
        if (i >= headerCount + ((ArrayList) listLJII).size()) {
            return ((GridLayoutManager) c1208640hYc.l1).LLILLJJLI;
        }
        return 1;
    }

    public static final int LJFF$6(C1208640hYc c1208640hYc, int i) {
        List<InterfaceC1891350zJl> listLJII = ((PoiDetailVideoListAssem) c1208640hYc.l0).Ep().getState().LJII();
        int headerCount = ((PoiDetailVideoListAssem) c1208640hYc.l0).Ep().getHeaderCount();
        if (i < headerCount) {
            return ((GridLayoutManager) c1208640hYc.l1).LLILLJJLI;
        }
        if (i >= headerCount + ((ArrayList) listLJII).size()) {
            return ((GridLayoutManager) c1208640hYc.l1).LLILLJJLI;
        }
        return 1;
    }

    public static final int LJFF$7(C1208640hYc c1208640hYc, int i) {
        List<InterfaceC1891350zJl> listLJII;
        int headerCount;
        C20600815jK<InterfaceC1891350zJl> state;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((PoiDetailPostListAssem) c1208640hYc.l0).LLIZLLLIL;
        Object objLJJJLZIJ = null;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            listLJII = state.LJII();
        } else {
            listLJII = null;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = ((PoiDetailPostListAssem) c1208640hYc.l0).LLIZLLLIL;
        int size = 0;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            headerCount = viewOnAttachStateChangeListenerC20604515jv2.getHeaderCount();
        } else {
            headerCount = 0;
        }
        if (listLJII != null) {
            objLJJJLZIJ = C13LP.LJJJLZIJ(i - headerCount, listLJII);
        }
        if (i < headerCount) {
            return ((GridLayoutManager) c1208640hYc.l1).LLILLJJLI;
        }
        if (listLJII != null) {
            size = listLJII.size();
        }
        if (i >= headerCount + size) {
            return ((GridLayoutManager) c1208640hYc.l1).LLILLJJLI;
        }
        if (objLJJJLZIJ instanceof C1278904zT) {
            return ((GridLayoutManager) c1208640hYc.l1).LLILLJJLI;
        }
        return 1;
    }

    public static final int LJFF$8(C1208640hYc c1208640hYc, int i) {
        int itemViewType = ((C1172210gbr) c1208640hYc.l0).getItemViewType(i);
        if (itemViewType != 1 && itemViewType != 2) {
            return 1;
        }
        return ((GridLayoutManager) ((RecyclerView.LayoutManager) c1208640hYc.l1)).LLILLJJLI;
    }

    public C1208640hYc(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
