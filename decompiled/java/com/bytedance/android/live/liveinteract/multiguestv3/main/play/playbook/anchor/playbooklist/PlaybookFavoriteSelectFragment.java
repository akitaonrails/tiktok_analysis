package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist;

import X.AbstractC1585810rMx;
import X.C01GW;
import X.C098200Yq;
import X.C1117360fBO;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20398114rj;
import X.C20401314sF;
import X.C20404014sg;
import X.C20736316Cj;
import X.C452501pT;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC1631620sYq;
import X.InterfaceC20403914sf;
import X.InterfaceC20405014sq;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist.PlaybookFavoriteSelectFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookFavoriteSelectFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZz8/KTHELIOSxiOSMyMScjJiR9KSsvISAhZjUgKDYxJyonJSYgPGscJS4qKiojIgkyPio+IDs2GyAgLCwnDjctLiI2JjE=";
    public DataChannel LL;
    public PlaybookAnchorViewModel LLILLL;
    public InterfaceC20403914sf LLILZ;
    public InterfaceC1631620sYq<? super String, ? super C1117360fBO, ? super LinearLayoutManager, Unit> LLILZIL;
    public RecyclerView LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public String LLILLJJLI = "";
    public final C20401314sF LLJ = new InterfaceC20405014sq() { // from class: X.14sF
        @Override // X.InterfaceC20405014sq
        public final long LLJJ() {
            InterfaceC20403914sf interfaceC20403914sf = this.LL.LLILZ;
            if (interfaceC20403914sf != null) {
                return interfaceC20403914sf.LLJJ();
            }
            return 0L;
        }

        @Override // X.InterfaceC20405014sq
        public final long m2() {
            InterfaceC20403914sf interfaceC20403914sf = this.LL.LLILZ;
            if (interfaceC20403914sf != null) {
                return interfaceC20403914sf.m2();
            }
            return 0L;
        }

        @Override // X.InterfaceC20405014sq
        public final void tq(Playbook playbook, C20402114sN c20402114sN) {
            PlaybookFavoriteSelectFragment playbookFavoriteSelectFragment = this.LL;
            InterfaceC20403914sf interfaceC20403914sf = playbookFavoriteSelectFragment.LLILZ;
            if (interfaceC20403914sf != null) {
                interfaceC20403914sf.p2(playbook, playbookFavoriteSelectFragment.MR(), c20402114sN);
            }
        }

        @Override // X.InterfaceC20405014sq
        public final void nn(Playbook playbook, boolean z, C978410bZH c978410bZH) {
            PlaybookFavoriteSelectFragment playbookFavoriteSelectFragment = this.LL;
            InterfaceC20403914sf interfaceC20403914sf = playbookFavoriteSelectFragment.LLILZ;
            if (interfaceC20403914sf != null) {
                interfaceC20403914sf.o2(playbook, playbookFavoriteSelectFragment.MR(), c978410bZH);
            }
        }
    };
    public final C01GW LLJI = C452501pT.LIZIZ(new C20398114rj(this));
    public final LinearLayoutManager LLJIJIL = new LinearLayoutManager(getContext(), 1, false);

    public final C1117360fBO MR() {
        return (C1117360fBO) this.LLJI.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MutableLiveData<List<Playbook>> mutableLiveData;
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.mek).setBackgroundColor(C20736316Cj.LIZIZ(R.attr.exw, getContext()));
        this.LLILZLL = (RecyclerView) view.findViewById(R.id.tvf);
        this.LLIZ = view.findViewById(R.id.vg_empty);
        View viewFindViewById = view.findViewById(R.id.cnf);
        this.LLIZLLLIL = viewFindViewById;
        if (viewFindViewById != null) {
            C500260Jjc.LJLIIIL(500L, viewFindViewById, new C20404014sg(this));
        }
        RecyclerView recyclerView = this.LLILZLL;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(this.LLJIJIL);
        }
        RecyclerView recyclerView2 = this.LLILZLL;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(MR());
        }
        RecyclerView recyclerView3 = this.LLILZLL;
        if (recyclerView3 != null) {
            recyclerView3.setItemAnimator(null);
        }
        RecyclerView recyclerView4 = this.LLILZLL;
        if (recyclerView4 != null) {
            recyclerView4.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.14rz
                @Override // X.AbstractC1585810rMx
                public final void LJJIIJ(RecyclerView recyclerView5, int i) {
                    PlaybookFavoriteSelectFragment playbookFavoriteSelectFragment = this.LL;
                    InterfaceC1631620sYq<? super String, ? super C1117360fBO, ? super LinearLayoutManager, Unit> interfaceC1631620sYq = playbookFavoriteSelectFragment.LLILZIL;
                    if (interfaceC1631620sYq != null) {
                        interfaceC1631620sYq.invoke("onScrollStateChanged", playbookFavoriteSelectFragment.MR(), this.LL.LLJIJIL);
                    }
                }
            });
        }
        PlaybookAnchorViewModel playbookAnchorViewModel = this.LLILLL;
        if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLJILJILJ) != null) {
            mutableLiveData.observe(this, new Observer() { // from class: X.14rL
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00a3 A[PHI: r14
                  0x00a3: PHI (r14v4 java.util.List) = (r14v2 java.util.List), (r14v5 java.util.List), (r14v1 java.util.List) binds: [B:41:0x00a2, B:50:0x00bb, B:30:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00b2  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
                /* JADX WARN: Type inference failed for: r8v0, types: [X.13BV] */
                /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Collection] */
                /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
                @Override // androidx.lifecycle.Observer
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onChanged(java.lang.Object r14) {
                    /*
                        Method dump skipped, instruction units count: 329
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C20395714rL.onChanged(java.lang.Object):void");
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.h9n, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
