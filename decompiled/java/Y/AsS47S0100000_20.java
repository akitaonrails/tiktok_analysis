package Y;

import X.AbstractC1585810rMx;
import X.C1318540kPs;
import X.C1319030kQf;
import X.C1319060kQi;
import X.C1337560kuY;
import X.C2188811AlT;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.list.UIList;

/* JADX INFO: loaded from: classes21.dex */
public class AsS47S0100000_20 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (this.$t != 0) {
            super.LJJIIJ(recyclerView, i);
        } else {
            LJJIIJ$0(this, recyclerView, i);
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 1:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 2:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public AsS47S0100000_20(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS47S0100000_20 asS47S0100000_20, RecyclerView recyclerView, int i) {
        UIList uIList;
        if (recyclerView != null && (uIList = ((C1319060kQi) asS47S0100000_20.l0).LIZ) != null && uIList.LLILLL != null && i == 0) {
            for (int i2 = 0; i2 < recyclerView.getChildCount(); i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (childAt instanceof C1318540kPs) {
                    C1318540kPs c1318540kPs = (C1318540kPs) childAt;
                    if (c1318540kPs.getUIComponent() == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("the scroll state of recyclerView is idle, the component is null. position is :");
                        sbLIZ.append(c1318540kPs.LLILLL);
                        LynxLog.i("UIList", C2188811AlT.LIZIZ(sbLIZ));
                        ((C1319060kQi) asS47S0100000_20.l0).LIZ.LLILLL.notifyItemChanged(c1318540kPs.LLILLL);
                    }
                }
            }
        }
    }

    public static final void LJJIIZI$0(AsS47S0100000_20 asS47S0100000_20, RecyclerView recyclerView, int i, int i2) {
        UIList uIList = (UIList) asS47S0100000_20.l0;
        C1319030kQf c1319030kQf = uIList.LLILLL;
        if (c1319030kQf != null && c1319030kQf.LLJJJJLIIL) {
            C1319060kQi c1319060kQi = uIList.LLLII;
            if (c1319060kQi != null) {
                c1319060kQi.LIZJ();
            }
            ((UIList) asS47S0100000_20.l0).LLILLL.LLJJJJLIIL = false;
        }
    }

    public static final void LJJIIZI$1(AsS47S0100000_20 asS47S0100000_20, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        if (recyclerView != null && recyclerView.getVisibility() == 0 && recyclerView.getGlobalVisibleRect(new Rect()) && (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (iFindFirstVisibleItemPosition != -1 && iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition >= 0) {
                ((C1337560kuY) asS47S0100000_20.l0).LIZ(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition);
            }
        }
    }
}
