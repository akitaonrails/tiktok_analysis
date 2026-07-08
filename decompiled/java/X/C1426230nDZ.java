package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nDZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426230nDZ extends AbstractC1664490tPr<C1426050nDH, C1426140nDQ> {
    public C1426240nDa LLJJJIL;
    public final C1427480nFa LLJJJJ = new C1427480nFa();

    @Override // X.AbstractC1664490tPr
    public final void onShow() {
        RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;
        C1427510nFd c1427510nFd;
        C1426830nEX c1426830nEXI5;
        InterfaceC1426290nDf interfaceC1426290nDf;
        C1426240nDa c1426240nDa = this.LLJJJIL;
        if (c1426240nDa == null || (recyclerView = c1426240nDa.LLILLJJLI) == null) {
            return;
        }
        C1427480nFa c1427480nFa = this.LLJJJJ;
        c1427480nFa.LLILZ.clear();
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
            if ((viewHolderFindViewHolderForAdapterPosition instanceof C1427510nFd) && (c1426830nEXI5 = (c1427510nFd = (C1427510nFd) viewHolderFindViewHolderForAdapterPosition).I5()) != null && c1427480nFa.LLILZ.add(c1426830nEXI5) && (interfaceC1426290nDf = c1427510nFd.LLILLJJLI) != null) {
                interfaceC1426290nDf.LIZIZ(c1426830nEXI5);
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0nDR] */
    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        RecyclerView recyclerView;
        super.onViewCreated(view, bundle);
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0nDI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1426050nDH) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS601S0100000_22(this, 81));
        AbstractC1664490tPr.LLLLLILLIL(this, LLLLILI(), new C2217381BqS() { // from class: X.0nDJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1426050nDH) obj).LIZJ;
            }
        }, new AwS601S0100000_22(this, 82));
        C1426240nDa c1426240nDa = this.LLJJJIL;
        if (c1426240nDa != null && (recyclerView = c1426240nDa.LLILLJJLI) != null) {
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setOverScrollMode(2);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(this.LLJJJJ);
        }
        this.LLJJJJ.LLILLL = new InterfaceC1426290nDf() { // from class: X.0nDR
            @Override // X.InterfaceC1426290nDf
            public final void LIZ(SearchSugEntity searchSugEntity) {
                this.LIZ.LLLLIL().LIZ.invoke(searchSugEntity.content);
            }

            @Override // X.InterfaceC1426290nDf
            public final void LIZIZ(C1426830nEX c1426830nEX) {
                this.LIZ.LLLLIL().LIZIZ.invoke(c1426830nEX);
            }
        };
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.eo7, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) C1616006Uk.LIZ(R.id.tx9, viewTd);
        if (recyclerView != null) {
            FrameLayout frameLayout = (FrameLayout) viewTd;
            this.LLJJJIL = new C1426240nDa(frameLayout, recyclerView);
            return frameLayout;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(R.id.tx9)));
    }
}
