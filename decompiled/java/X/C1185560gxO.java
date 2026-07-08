package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.detail.prefab.ability.PageHeaderScrollAbility;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0gxO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185560gxO extends AbstractC1181640gr4 implements InterfaceC1181650gr5 {
    public int LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2759));

    @Override // X.InterfaceC1181650gr5
    public final void LLF(RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager;
        View childAt;
        if (i != 1) {
            RecyclerView.LayoutManager layoutManager = null;
            if (recyclerView != null) {
                layoutManager = recyclerView.getLayoutManager();
            }
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && linearLayoutManager.findFirstVisibleItemPosition() == 0 && (childAt = recyclerView.getChildAt(0)) != null && childAt.getTop() == 0) {
                this.LLILLJJLI = 0;
                PageHeaderScrollAbility pageHeaderScrollAbility = (PageHeaderScrollAbility) this.LLILLL.getValue();
                if (pageHeaderScrollAbility != null) {
                    pageHeaderScrollAbility.bq(this.LLILLJJLI);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onScrollStateChanged() offsetY:");
                sbLIZ.append(this.LLILLJJLI);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    @Override // X.InterfaceC1181650gr5
    public final void LLFF(RecyclerView recyclerView, int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onScrolled() called with: dx = ");
        sbLIZ.append(i);
        sbLIZ.append(", dy = ");
        sbLIZ.append(i2);
        sbLIZ.append(",offsetY:");
        sbLIZ.append(this.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLJJLI = recyclerView.computeVerticalScrollOffset();
        PageHeaderScrollAbility pageHeaderScrollAbility = (PageHeaderScrollAbility) this.LLILLL.getValue();
        if (pageHeaderScrollAbility != null) {
            pageHeaderScrollAbility.bq(this.LLILLJJLI);
        }
    }
}
