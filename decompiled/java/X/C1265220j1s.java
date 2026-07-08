package X;

import Y.AsS46S0100000_19;
import android.graphics.Rect;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0j1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1265220j1s {
    public final RecyclerView LIZ;
    public final InterfaceC1265210j1r LIZIZ;
    public boolean LIZJ = true;
    public final ArrayList<String> LIZLLL = new ArrayList<>();

    public final void LIZ() {
        int[] iArr;
        int i;
        int i2;
        if (this.LIZ.getVisibility() != 0 || !this.LIZ.isShown() || !this.LIZ.getGlobalVisibleRect(new Rect())) {
            return;
        }
        try {
            RecyclerView.LayoutManager layoutManager = this.LIZ.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                iArr = new int[]{linearLayoutManager.findFirstCompletelyVisibleItemPosition(), linearLayoutManager.findLastCompletelyVisibleItemPosition()};
            } else {
                if (!(layoutManager instanceof GridLayoutManager)) {
                    return;
                }
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                iArr = new int[]{gridLayoutManager.findFirstCompletelyVisibleItemPosition(), gridLayoutManager.findLastCompletelyVisibleItemPosition()};
            }
            if (iArr.length < 2 || (i = iArr[0]) > (i2 = iArr[1])) {
                return;
            }
            while (true) {
                try {
                    InterfaceC1265210j1r interfaceC1265210j1r = this.LIZIZ;
                    if (interfaceC1265210j1r != null) {
                        interfaceC1265210j1r.LIZ(i, this);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (i == i2) {
                    return;
                } else {
                    i++;
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public C1265220j1s(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, InterfaceC1265210j1r interfaceC1265210j1r) {
        this.LIZ = viewOnAttachStateChangeListenerC20604515jv;
        this.LIZIZ = interfaceC1265210j1r;
        viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS46S0100000_19(this, 9));
    }
}
