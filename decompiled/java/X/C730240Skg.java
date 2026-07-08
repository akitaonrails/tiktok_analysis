package X;

import Y.ATListenerS440S0100000_6;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS220S0300000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: renamed from: X.0Skg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730240Skg {
    public static final C730240Skg LIZ = new C730240Skg();

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZIZ(StoryViewerListViewModel storyViewerListViewModel, C01GW<? extends InterfaceC730270Skj> c01gw, C013C c013c, C013C c013c2) {
        Aweme aweme;
        InterfaceC730270Skj value = c01gw.getValue();
        C730050SkN c730050SkN = ((C730090SkR) storyViewerListViewModel.getState()).LLJJ;
        if (c730050SkN != null) {
            aweme = c730050SkN.LIZJ;
        } else {
            aweme = null;
        }
        value.LIZ(aweme, new AwS377S0200000_11(c013c, c013c2, 112));
    }

    public static void LIZ(final StoryViewerListViewModel storyViewerListViewModel, C730050SkN c730050SkN, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, final RecyclerView recyclerView, C19EG c19eg) {
        boolean z;
        int i;
        final C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(391));
        final C013C c013c = new C013C();
        final C013C c013c2 = new C013C();
        c013c2.element = true;
        if (c730050SkN != null) {
            z = c730050SkN.LIZ;
        } else {
            z = false;
        }
        int i2 = 8;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLF(i, viewOnAttachStateChangeListenerC20604515jv);
        }
        if (recyclerView != null) {
            if (z) {
                i2 = 0;
            }
            C786410Ut5.LLIZLLLIL(recyclerView, i2);
        }
        ArrayList arrayList = new ArrayList();
        if (z && c730050SkN != null && c730050SkN.LIZIZ != null) {
            if (recyclerView != null) {
                C1233110iC5 c1233110iC5 = new C1233110iC5(storyViewerListViewModel, arrayList, true, c19eg);
                recyclerView.setAdapter(c1233110iC5);
                recyclerView.setLayoutManager(new GridLayoutManager(2, 1, recyclerView.getContext(), false));
                LIZIZ(storyViewerListViewModel, c01gwLIZIZ, c013c, c013c2);
                ((InterfaceC730270Skj) c01gwLIZIZ.getValue()).LIZLLL(new AwS220S0300000_11((List) arrayList, (List<C730340Skq>) storyViewerListViewModel, (StoryViewerListViewModel) c1233110iC5, (C1233110iC5) 22));
                recyclerView.setOnTouchListener(new ATListenerS440S0100000_6(recyclerView, 9));
                recyclerView.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0Skh
                    @Override // X.AbstractC1585810rMx
                    public final void LJJIIZI(RecyclerView recyclerView2, int i3, int i4) {
                        if (!recyclerView.canScrollVertically(1)) {
                            C013C c013c3 = c013c;
                            if (!c013c3.element) {
                                C013C c013c4 = c013c2;
                                if (c013c4.element) {
                                    c013c3.element = true;
                                    C730240Skg.LIZIZ(storyViewerListViewModel, c01gwLIZIZ, c013c3, c013c4);
                                }
                            }
                        }
                    }
                });
            }
            AssemViewModel.selectSubscribe$default(storyViewerListViewModel, C729170Six.LL, null, null, null, new AwS590S0100000_11((Function2) new AwS620S0100000_6(recyclerView, 136), 423), 14, null);
        }
    }
}
