package X;

import Y.AsS42S0100000_15;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0ar0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950960ar0 {
    public final RecyclerView LIZ;
    public final boolean LIZIZ = true;
    public final Rect LIZJ = new Rect();

    public final void LIZ() {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view;
        Boolean boolValueOf;
        RecyclerView recyclerView = this.LIZ;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            RecyclerView recyclerView2 = this.LIZ;
            if (recyclerView2 != null && (viewHolderFindViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition)) != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null && (!this.LIZIZ || view.getGlobalVisibleRect(this.LIZJ))) {
                if (viewHolderFindViewHolderForAdapterPosition instanceof C950920aqw) {
                    C950920aqw c950920aqw = (C950920aqw) viewHolderFindViewHolderForAdapterPosition;
                    C950690aqZ c950690aqZ = c950920aqw.LLILZIL;
                    boolean zLJJJI = C500260Jjc.LJJJI(c950690aqZ != null ? c950690aqZ.LIZJ() : null);
                    if (!c950920aqw.LLIZ) {
                        c950920aqw.LLIZ = true;
                        C931740aM0.LJI("background", zLJJJI ? CardStruct.IStatusCode.DEFAULT : "1");
                    }
                    c950920aqw.P5(true);
                } else if (viewHolderFindViewHolderForAdapterPosition instanceof C953190aub) {
                    C953190aub c953190aub = (C953190aub) viewHolderFindViewHolderForAdapterPosition;
                    if (!c953190aub.LLILZIL) {
                        c953190aub.LLILZIL = true;
                        C931740aM0.LJI("notice_board", CardStruct.IStatusCode.DEFAULT);
                    }
                } else if (viewHolderFindViewHolderForAdapterPosition instanceof C951010ar5) {
                    C951010ar5 c951010ar5 = (C951010ar5) viewHolderFindViewHolderForAdapterPosition;
                    if (c951010ar5.LLILZIL != null) {
                        InterfaceC971790bOb interfaceC971790bObLIZIZ = C01OF.LIZIZ();
                        boolValueOf = Boolean.valueOf(interfaceC971790bObLIZIZ != null ? interfaceC971790bObLIZIZ.LJIILJJIL() : false);
                    } else {
                        boolValueOf = null;
                    }
                    boolean zLJJJI2 = C500260Jjc.LJJJI(boolValueOf);
                    if (!c951010ar5.LLILZLL) {
                        c951010ar5.LLILZLL = true;
                        C931740aM0.LJI("header", zLJJJI2 ? CardStruct.IStatusCode.DEFAULT : "1");
                    }
                }
            }
            if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                return;
            } else {
                iFindFirstVisibleItemPosition++;
            }
        }
    }

    public C950960ar0(RecyclerView recyclerView) {
        this.LIZ = recyclerView;
        if (recyclerView != null) {
            recyclerView.addOnScrollListener(new AsS42S0100000_15(this, 4));
        }
    }
}
