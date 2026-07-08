package Y;

import X.AbstractC1585810rMx;
import X.C292460BdE;
import X.C722710SWn;
import X.C730090SkR;
import X.InterfaceC1602960roc;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListAssem;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel;
import com.ss.android.ugc.aweme.ui.fragment.PostModeCommentListFragmentV2;
import com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent;
import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.AwS26S0001000_11;
import kotlin.jvm.internal.AwS26S0010000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class AsS38S0100000_11 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 2:
                LJJIIJ$2(this, recyclerView, i);
                break;
            case 3:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 4:
                LJJIIJ$3(this, recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 1:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 2:
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
            case 3:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
        }
    }

    public AsS38S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJJIIJ$0(AsS38S0100000_11 asS38S0100000_11, RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager;
        if (i == 0) {
            int iFindLastVisibleItemPosition = 0;
            ((StoryViewerListAssem) asS38S0100000_11.l0).Jo().setState(new AwS26S0010000_11(false, 9));
            RecyclerView.LayoutManager layoutManager = ((StoryViewerListAssem) asS38S0100000_11.l0).Go().getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            }
            StoryViewerListViewModel storyViewerListViewModelJo = ((StoryViewerListAssem) asS38S0100000_11.l0).Jo();
            if (iFindLastVisibleItemPosition > ((C730090SkR) storyViewerListViewModelJo.getState()).LLJ) {
                storyViewerListViewModelJo.setState(new AwS26S0001000_11(iFindLastVisibleItemPosition, 2));
            }
        }
    }

    public static final void LJJIIJ$1(AsS38S0100000_11 asS38S0100000_11, RecyclerView recyclerView, int i) {
        if (C292460BdE.LIZ() && i == 1) {
            C722710SWn c722710SWn = ((PostModeCommentListFragmentV2) asS38S0100000_11.l0).VR().LLILZ;
            if (!c722710SWn.LJ) {
                c722710SWn.LJ = true;
            }
        }
    }

    public static final void LJJIIJ$2(AsS38S0100000_11 asS38S0100000_11, RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i == 1) {
                ((PostModePageViewModel) asS38S0100000_11.l0).LLLFF.setValue(Boolean.TRUE);
                return;
            }
            return;
        }
        ((PostModePageViewModel) asS38S0100000_11.l0).LLLFF.setValue(Boolean.FALSE);
    }

    public static final void LJJIIJ$3(AsS38S0100000_11 asS38S0100000_11, RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i != 1) {
                ((InterfaceC1602960roc) asS38S0100000_11.l0).start();
                return;
            } else {
                ((InterfaceC1602960roc) asS38S0100000_11.l0).start();
                return;
            }
        }
        ((InterfaceC1602960roc) asS38S0100000_11.l0).stop();
    }

    public static final void LJJIIZI$0(AsS38S0100000_11 asS38S0100000_11, RecyclerView recyclerView, int i, int i2) {
        ((PostModeCommentListFragmentV2) asS38S0100000_11.l0).DR().LLLF.setValue(Integer.valueOf(i2));
        if (C292460BdE.LIZ() && i2 > 0) {
            T value = ((PostModeCommentListFragmentV2) asS38S0100000_11.l0).DR().LLLJ.getValue();
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.LJFF(value, bool)) {
                ((PostModeCommentListFragmentV2) asS38S0100000_11.l0).DR().LLLIZZ.setValue(bool);
            }
        }
    }

    public static final void LJJIIZI$1(AsS38S0100000_11 asS38S0100000_11, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        Integer numValueOf;
        if (i2 != 0 && !Intrinsics.LJFF(((PostModeNestHeaderComponent) asS38S0100000_11.l0).LLILLL.LJIIIIZZ.LLJJI.getValue(), Unit.LIZ)) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && (numValueOf = Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition())) != null && numValueOf.intValue() == 0) {
                PostModeNestHeaderComponent postModeNestHeaderComponent = (PostModeNestHeaderComponent) asS38S0100000_11.l0;
                int top = 0;
                View childAt = recyclerView.getChildAt(0);
                if (childAt != null) {
                    top = childAt.getTop();
                }
                postModeNestHeaderComponent.LLJJIII = top;
                ((PostModeNestHeaderComponent) asS38S0100000_11.l0).LJIIJJI();
            }
        }
    }
}
