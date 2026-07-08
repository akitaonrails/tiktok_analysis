package X;

import Y.ARunnableS37S0110000_18;
import Y.AsS45S0100000_18;
import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0h0T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187470h0T {
    public final RecyclerView LIZ;
    public int LIZIZ = -1;
    public final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public final AsS45S0100000_18 LJ;
    public final C1187480h0U LJFF;

    public final void LIZ() {
        LinearLayoutManager linearLayoutManager;
        View view;
        RecyclerView.LayoutManager layoutManager = this.LIZ.getLayoutManager();
        InterfaceC1187490h0V interfaceC1187490h0V = null;
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1) {
            LIZJ();
            return;
        }
        if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition) {
            while (true) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.LIZ.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                if (viewHolderFindViewHolderForAdapterPosition != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null && (viewHolderFindViewHolderForAdapterPosition instanceof InterfaceC1187490h0V)) {
                    Rect rect = new Rect();
                    if (view.getGlobalVisibleRect(rect) && rect.width() >= view.getWidth() && rect.height() >= view.getHeight()) {
                        if (iFindFirstVisibleItemPosition != -1) {
                            Object objFindViewHolderForAdapterPosition = this.LIZ.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                            if (objFindViewHolderForAdapterPosition instanceof InterfaceC1187490h0V) {
                                interfaceC1187490h0V = (InterfaceC1187490h0V) objFindViewHolderForAdapterPosition;
                            }
                        }
                    }
                }
                if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                    break;
                } else {
                    iFindFirstVisibleItemPosition++;
                }
            }
        } else {
            iFindFirstVisibleItemPosition = -1;
        }
        if (iFindFirstVisibleItemPosition != this.LIZIZ) {
            LIZJ();
            if (interfaceC1187490h0V != null) {
                interfaceC1187490h0V.play();
            }
            this.LIZIZ = iFindFirstVisibleItemPosition;
            return;
        }
        if (interfaceC1187490h0V == null || interfaceC1187490h0V.isPlaying()) {
            return;
        }
        interfaceC1187490h0V.play();
    }

    public final void LIZJ() {
        InterfaceC1187490h0V interfaceC1187490h0V;
        int i = this.LIZIZ;
        if (i != -1) {
            Object objFindViewHolderForAdapterPosition = this.LIZ.findViewHolderForAdapterPosition(i);
            if ((objFindViewHolderForAdapterPosition instanceof InterfaceC1187490h0V) && (interfaceC1187490h0V = (InterfaceC1187490h0V) objFindViewHolderForAdapterPosition) != null) {
                interfaceC1187490h0V.stop();
            }
            this.LIZIZ = -1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0h0U, X.19sR] */
    public C1187470h0T(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        this.LIZ = viewOnAttachStateChangeListenerC20604515jv;
        AsS45S0100000_18 asS45S0100000_18 = new AsS45S0100000_18(this, 10);
        this.LJ = asS45S0100000_18;
        ?? r0 = new InterfaceC21676519sR() { // from class: X.0h0U
            @Override // X.InterfaceC21676519sR
            public final void g5(View view) {
                C1180060goW.LJIILL(view, new AwS597S0100000_18(this.LL, 819));
            }

            @Override // X.InterfaceC21676519sR
            public final void m3(View view) {
                int childAdapterPosition = this.LL.LIZ.getChildAdapterPosition(view);
                C1187470h0T c1187470h0T = this.LL;
                if (childAdapterPosition == c1187470h0T.LIZIZ) {
                    c1187470h0T.LIZJ();
                }
            }
        };
        this.LJFF = r0;
        viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(asS45S0100000_18);
        viewOnAttachStateChangeListenerC20604515jv.addOnChildAttachStateChangeListener(r0);
    }

    public final void LIZIZ(boolean z) {
        this.LIZJ.removeCallbacksAndMessages(null);
        C786410Ut5.LJLIIL(500L, this.LIZJ, new ARunnableS37S0110000_18(this, z, 3));
    }
}
