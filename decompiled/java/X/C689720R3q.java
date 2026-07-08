package X;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0R3q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C689720R3q extends AbstractC214823195h {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC214823195h
    public final int LJFF(int i) {
        switch (this.$t) {
            case 0:
                return LJFF$0(this, i);
            case 1:
                return LJFF$1(this, i);
            default:
                return super.LJFF(i);
        }
    }

    public static final int LJFF$0(C689720R3q c689720R3q, int i) {
        int headerCount = i - ((ViewOnAttachStateChangeListenerC20604515jv) c689720R3q.l0).getHeaderCount();
        if (headerCount >= 0 && headerCount < ((ViewOnAttachStateChangeListenerC20604515jv) c689720R3q.l0).getState().LJIIIIZZ() && (((ViewOnAttachStateChangeListenerC20604515jv) c689720R3q.l0).getState().LJI(headerCount) instanceof C675370QeN)) {
            return ((GridLayoutManager) c689720R3q.l1).LLILLJJLI;
        }
        if (i < ((ViewOnAttachStateChangeListenerC20604515jv) c689720R3q.l0).getHeaderCount()) {
            return ((GridLayoutManager) c689720R3q.l1).LLILLJJLI;
        }
        if (i < ((ViewOnAttachStateChangeListenerC20604515jv) c689720R3q.l0).getHeaderCount() + ((ViewOnAttachStateChangeListenerC20604515jv) c689720R3q.l0).getState().LJIIIIZZ()) {
            return 1;
        }
        return ((GridLayoutManager) c689720R3q.l1).LLILLJJLI;
    }

    public static final int LJFF$1(C689720R3q c689720R3q, int i) {
        int itemViewType = ((AbstractC683510QrV) c689720R3q.l0).getItemViewType(i);
        if (itemViewType == Integer.MIN_VALUE) {
            return ((GridLayoutManager) ((RecyclerView.LayoutManager) c689720R3q.l1)).LLILLJJLI;
        }
        AbstractC683510QrV abstractC683510QrV = (AbstractC683510QrV) c689720R3q.l0;
        AbstractC683540QrY abstractC683540QrY = abstractC683510QrV.spanSizeLookup2;
        if (abstractC683540QrY != null) {
            return abstractC683540QrY.LJII(itemViewType);
        }
        AbstractC214823195h abstractC214823195h = abstractC683510QrV.spanSizeLookup;
        if (abstractC214823195h != null) {
            return abstractC214823195h.LJFF(i);
        }
        return 1;
    }

    public C689720R3q(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
