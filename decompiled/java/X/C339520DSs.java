package X;

import Y.AObserverS208S0100000_4;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DSs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339520DSs extends AbstractC1585810rMx {
    public final InterfaceC339530DSt LL;
    public final MutableLiveData<Boolean> LLILLJJLI;
    public Integer LLILLL;

    public C339520DSs(C318770CeZ c318770CeZ) {
        this.LL = c318770CeZ;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.LLILLJJLI = mutableLiveData;
        mutableLiveData.observeForever(new AObserverS208S0100000_4(this, 11));
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        boolean z;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            Integer num = this.LLILLL;
            if (num != null) {
                int iIntValue = num.intValue();
                if (iFindFirstVisibleItemPosition <= iIntValue && iIntValue <= iFindLastVisibleItemPosition) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
                    while (true) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(iFindFirstVisibleItemPosition);
                        if (viewHolderFindViewHolderForLayoutPosition != null && viewHolderFindViewHolderForLayoutPosition.getItemViewType() == R.layout.c3f) {
                            this.LLILLL = Integer.valueOf(iFindFirstVisibleItemPosition);
                            break;
                        } else if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                            break;
                        } else {
                            iFindFirstVisibleItemPosition++;
                        }
                    }
                }
                z = false;
            }
            C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onScrolled, ameEntryShow = ");
            sbLIZ.append(z);
            C201955140j.LIZLLL(c20012313Rx, "CreateTabBottomCreateBtnRvScrollListener", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILLJJLI.setValue(Boolean.valueOf(z));
        }
    }
}
