package Y;

import X.AbstractC1585810rMx;
import X.C0TM3;
import X.C0TM6;
import X.C1454240nwk;
import X.C745280TLi;
import X.C781710UlV;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;

/* JADX INFO: loaded from: classes13.dex */
public class AsS17S0110000_12 extends AbstractC1585810rMx {
    public final int $t;
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

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        if (1 - this.$t != 0) {
            super.LJJIIZI(recyclerView, i, i2);
        } else {
            LJJIIZI$0(this, recyclerView, i, i2);
        }
    }

    public AsS17S0110000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS17S0110000_12 asS17S0110000_12, RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager;
        if (i != 0) {
            if (i == 1) {
                asS17S0110000_12.z1 = true;
                return;
            }
            return;
        }
        if (asS17S0110000_12.z1) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                if (iFindFirstVisibleItemPosition != -1) {
                    C0TM3 c0tm3LLLLLJLJLL = ((C1454240nwk) asS17S0110000_12.l0).LLLLLJLJLL();
                    if (iFindFirstVisibleItemPosition >= 0 && iFindFirstVisibleItemPosition < c0tm3LLLLLJLJLL.getItemCount()) {
                        C0TM6 c0tm6 = (C0TM6) ListProtector.get(c0tm3LLLLLJLJLL.LLILLJJLI, iFindFirstVisibleItemPosition);
                        if (c0tm6 != null) {
                            ((C745280TLi) ((C1454240nwk) asS17S0110000_12.l0).LLJZ.getValue()).LLLFZ(c0tm6.LIZ.getCells().size());
                        } else {
                            return;
                        }
                    } else {
                        c0tm3LLLLLJLJLL.getClass();
                        return;
                    }
                }
            } else {
                return;
            }
        }
        asS17S0110000_12.z1 = false;
    }

    public static final void LJJIIJ$1(AsS17S0110000_12 asS17S0110000_12, RecyclerView recyclerView, int i) {
        if (i == 0 && asS17S0110000_12.z1) {
            ((C781710UlV) asS17S0110000_12.l0).LIZ();
            ((C781710UlV) asS17S0110000_12.l0).LIZLLL();
            asS17S0110000_12.z1 = false;
        }
    }

    public static final void LJJIIZI$0(AsS17S0110000_12 asS17S0110000_12, RecyclerView recyclerView, int i, int i2) {
        asS17S0110000_12.z1 = true;
        ((C781710UlV) asS17S0110000_12.l0).LJIIJJI = false;
    }
}
