package Y;

import X.AbstractC1585810rMx;
import X.C1370370llT;
import X.InterfaceC1366500lfE;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes22.dex */
public class AsS8S0000000_21 extends AbstractC1585810rMx {
    public final int $t;

    public static final void LJJIIJ$2(AsS8S0000000_21 asS8S0000000_21, RecyclerView recyclerView, int i) {
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 2:
                LJJIIJ$2(this, recyclerView, i);
                break;
            default:
                super.LJJIIJ(recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        if (2 - this.$t != 0) {
            super.LJJIIZI(recyclerView, i, i2);
        } else {
            LJJIIZI$0(this, recyclerView, i, i2);
        }
    }

    public AsS8S0000000_21(int i) {
        this.$t = i;
    }

    public static final void LJJIIJ$0(AsS8S0000000_21 asS8S0000000_21, RecyclerView recyclerView, int i) {
        InterfaceC1366500lfE interfaceC1366500lfE;
        if (i == 1 && (interfaceC1366500lfE = C1370370llT.LJIIIIZZ) != null) {
            interfaceC1366500lfE.LJFF();
        }
    }

    public static final void LJJIIJ$1(AsS8S0000000_21 asS8S0000000_21, RecyclerView recyclerView, int i) {
        InterfaceC1366500lfE interfaceC1366500lfE;
        if (i == 1 && (interfaceC1366500lfE = C1370370llT.LJIIIIZZ) != null) {
            interfaceC1366500lfE.LJI();
        }
    }

    public static final void LJJIIZI$0(AsS8S0000000_21 asS8S0000000_21, RecyclerView recyclerView, int i, int i2) {
        if (!recyclerView.canScrollVertically(1)) {
            recyclerView.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, 0.0f, 0.0f, 0));
        }
    }
}
