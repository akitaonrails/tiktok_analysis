package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nDA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425980nDA extends AbstractC1664490tPr<C1424400nAc, C1424370nAZ> {
    public RecyclerView LLJJJJ;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 232));
    public final C1427490nFb LLJJJJJIL = new C1427490nFb();

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        LinearLayoutManager linearLayoutManager;
        C1427500nFc c1427500nFc;
        C1424200nAI c1424200nAII5;
        InterfaceC1427550nFh interfaceC1427550nFh;
        C1427490nFb c1427490nFb = this.LLJJJJJIL;
        RecyclerView recyclerView = this.LLJJJJ;
        c1427490nFb.LLILZ.clear();
        if (recyclerView == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
            if ((viewHolderFindViewHolderForAdapterPosition instanceof C1427500nFc) && (c1424200nAII5 = (c1427500nFc = (C1427500nFc) viewHolderFindViewHolderForAdapterPosition).I5()) != null && c1427490nFb.LLILZ.add(c1424200nAII5) && (interfaceC1427550nFh = c1427500nFc.LL) != null) {
                interfaceC1427550nFh.LIZIZ(c1424200nAII5);
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0nAa] */
    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJJJJIL.LLILLL = new InterfaceC1427550nFh() { // from class: X.0nAa
            @Override // X.InterfaceC1427550nFh
            public final void LJ(SearchSugEntity searchSugEntity) {
            }

            @Override // X.InterfaceC1427550nFh
            public final void LIZJ() {
                this.LIZ.LLLLIL().LIZIZ.invoke();
            }

            @Override // X.InterfaceC1427550nFh
            public final void LIZIZ(C1424200nAI c1424200nAI) {
                this.LIZ.LLLLIL().LIZLLL.invoke(c1424200nAI);
            }

            @Override // X.InterfaceC1427550nFh
            public final void LIZLLL(SearchSugEntity searchSugEntity) {
                this.LIZ.LLLLIL().LIZJ.invoke(searchSugEntity.content);
            }

            @Override // X.InterfaceC1427550nFh
            public final void LIZ(int i, SearchSugEntity searchSugEntity) {
                this.LIZ.LLLLIL().LIZ.invoke(searchSugEntity.content, Integer.valueOf(i));
            }
        };
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nAd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1424400nAc) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 143));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout((Context) this.LLJJJIL.getValue());
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        RecyclerView recyclerView = new RecyclerView((Context) this.LLJJJIL.getValue());
        C786410Ut5.p6(recyclerView, new FrameLayout.LayoutParams(-1, -2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.LLJJJJJIL);
        frameLayout.addView(recyclerView);
        this.LLJJJJ = recyclerView;
        return frameLayout;
    }
}
