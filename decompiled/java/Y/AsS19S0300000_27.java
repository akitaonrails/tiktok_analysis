package Y;

import X.AbstractC1585810rMx;
import X.C13LP;
import X.C1805380x56;
import X.C1806630x77;
import X.C1806800x7O;
import X.C1806980x7g;
import X.C19744212Mu;
import X.InterfaceC1806790x7N;
import X.InterfaceC1806820x7Q;
import X.InterfaceC1807160x7y;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes28.dex */
public class AsS19S0300000_27 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public AsS19S0300000_27(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    public static final void LJJIIZI$0(AsS19S0300000_27 asS19S0300000_27, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        List<? extends InterfaceC1806790x7N> list;
        int i3;
        long jLongValue;
        C1805380x56 c1805380x56;
        Long l;
        C1805380x56 c1805380x562;
        int i4;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            C1806980x7g c1806980x7g = (C1806980x7g) asS19S0300000_27.l0;
            if (c1806980x7g != null && (list = c1806980x7g.LLILZ) != null) {
                ((C1806800x7O) asS19S0300000_27.l1).getClass();
                int[] iArr = new int[list.size() + 1];
                int size = list.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = ListProtector.get(list, i5);
                    if (!(obj instanceof C1805380x56) && !(obj instanceof C1806630x77)) {
                        i4 = 0;
                    } else {
                        i4 = 1;
                    }
                    int i6 = i5 + 1;
                    iArr[i6] = iArr[i5] + i4;
                    i5 = i6;
                }
                if (iFindFirstCompletelyVisibleItemPosition > iFindLastCompletelyVisibleItemPosition) {
                    return;
                }
                while (true) {
                    InterfaceC1806790x7N interfaceC1806790x7N = (InterfaceC1806790x7N) C13LP.LJJJLZIJ(iFindFirstCompletelyVisibleItemPosition, list);
                    if (interfaceC1806790x7N == null) {
                        return;
                    }
                    boolean z = interfaceC1806790x7N instanceof C1805380x56;
                    if (!z && !(interfaceC1806790x7N instanceof C1806630x77)) {
                        if (interfaceC1806790x7N instanceof InterfaceC1806820x7Q) {
                            ((InterfaceC1807160x7y) asS19S0300000_27.l2).LJIILL((InterfaceC1806820x7Q) interfaceC1806790x7N);
                        }
                    } else {
                        int i7 = iArr[iFindFirstCompletelyVisibleItemPosition];
                        InterfaceC1807160x7y interfaceC1807160x7y = (InterfaceC1807160x7y) asS19S0300000_27.l2;
                        if (z && (c1805380x562 = (C1805380x56) interfaceC1806790x7N) != null) {
                            i3 = c1805380x562.LJIIIIZZ;
                        } else {
                            i3 = 0;
                        }
                        if (z && (c1805380x56 = (C1805380x56) interfaceC1806790x7N) != null && (l = c1805380x56.LJIIL) != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        interfaceC1807160x7y.LJII(jLongValue, i7, i3, interfaceC1806790x7N instanceof C1806630x77);
                    }
                    if (iFindFirstCompletelyVisibleItemPosition != iFindLastCompletelyVisibleItemPosition) {
                        iFindFirstCompletelyVisibleItemPosition++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static final void LJJIIZI$1(AsS19S0300000_27 asS19S0300000_27, RecyclerView recyclerView, int i, int i2) {
        C19744212Mu.LIZ((LinearLayoutManager) asS19S0300000_27.l0, (List) asS19S0300000_27.l1, (Function2) asS19S0300000_27.l2);
    }
}
