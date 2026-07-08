package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import webcast.data.host_board.HostBoard;
import webcast.data.host_board.Padding;

/* JADX INFO: renamed from: X.0fEo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ViewOnLayoutChangeListenerC1119480fEo implements View.OnLayoutChangeListener {
    public final InterfaceC1103990epp LL;
    public HostBoard LLILLJJLI;

    public ViewOnLayoutChangeListenerC1119480fEo(InterfaceC1103990epp interfaceC1103990epp) {
        this.LL = interfaceC1103990epp;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        LinearLayoutManager linearLayoutManager;
        int iLIZ;
        Padding padding;
        Padding padding2;
        if (!(view instanceof ViewOnAttachStateChangeListenerC20604515jv)) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = ((RecyclerView) view).getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            boolean zCanScrollVertically = view.canScrollVertically(-1);
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (!zCanScrollVertically && iFindFirstVisibleItemPosition == 0 && iFindLastVisibleItemPosition >= 0) {
                HostBoard hostBoard = this.LLILLJJLI;
                int iLIZ2 = 0;
                if (hostBoard != null && (padding2 = hostBoard.padding) != null) {
                    iLIZ = C439101nJ.LIZ(padding2.paddingTop);
                } else {
                    iLIZ = 0;
                }
                HostBoard hostBoard2 = this.LLILLJJLI;
                if (hostBoard2 != null && (padding = hostBoard2.padding) != null) {
                    iLIZ2 = C439101nJ.LIZ(padding.paddingBottom);
                }
                int i9 = (i4 - i2) + iLIZ + iLIZ2;
                InterfaceC1103990epp interfaceC1103990epp = this.LL;
                if (interfaceC1103990epp != null) {
                    HostBoard hostBoard3 = this.LLILLJJLI;
                    interfaceC1103990epp.LIZIZ(i9);
                }
            }
        }
    }
}
