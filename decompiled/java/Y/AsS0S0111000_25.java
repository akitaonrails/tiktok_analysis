package Y;

import X.AbstractC1585810rMx;
import X.C13LP;
import X.C1640100smW;
import X.C1640110smX;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;

/* JADX INFO: loaded from: classes26.dex */
public class AsS0S0111000_25 extends AbstractC1585810rMx {
    public final int $t;
    public int i2 = -1;
    public Object l0;
    public boolean z1;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            default:
                super.LJJIIJ(recyclerView, i);
                break;
        }
    }

    public AsS0S0111000_25(C1640100smW c1640100smW, int i) {
        this.$t = i;
        this.l0 = c1640100smW;
    }

    public AsS0S0111000_25(C1640110smX c1640110smX, int i) {
        this.$t = i;
        this.l0 = c1640110smX;
    }

    public static final void LJJIIJ$0(AsS0S0111000_25 asS0S0111000_25, RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager;
        boolean z;
        if (i == 2) {
            if (asS0S0111000_25.i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            asS0S0111000_25.z1 = z;
        } else if (i == 0) {
            if (asS0S0111000_25.i2 != 1 && !asS0S0111000_25.z1) {
                return;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                C1640100smW c1640100smW = (C1640100smW) asS0S0111000_25.l0;
                Pair pair = (Pair) C13LP.LJJJLZIJ(c1640100smW.LJIIIIZZ.LLLIILIL(iFindFirstVisibleItemPosition), c1640100smW.LJII.getData());
                if (pair != null) {
                    c1640100smW.LJIILIIL.onNext(pair.getFirst());
                }
            }
        }
        asS0S0111000_25.i2 = i;
    }

    public static final void LJJIIJ$1(AsS0S0111000_25 asS0S0111000_25, RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager;
        boolean z;
        if (i == 2) {
            if (asS0S0111000_25.i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            asS0S0111000_25.z1 = z;
        } else if (i == 0) {
            if (asS0S0111000_25.i2 != 1 && !asS0S0111000_25.z1) {
                return;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                C1640110smX c1640110smX = (C1640110smX) asS0S0111000_25.l0;
                Pair pair = (Pair) C13LP.LJJJLZIJ(c1640110smX.LJII.LLLIILIL(iFindFirstVisibleItemPosition), c1640110smX.LJI.getData());
                if (pair != null) {
                    c1640110smX.LJIIL.onNext(pair.getFirst());
                }
            }
        }
        asS0S0111000_25.i2 = i;
    }
}
