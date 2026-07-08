package X;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;

/* JADX INFO: renamed from: X.0MqB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C580770MqB extends AbstractC214823195h {
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
            case 2:
                return LJFF$2(this, i);
            case 3:
                return LJFF$3(this, i);
            case 4:
                return LJFF$4(this, i);
            case 5:
                return LJFF$5(this, i);
            case 6:
                return LJFF$6(this, i);
            case 7:
                return LJFF$7(this, i);
            default:
                return super.LJFF(i);
        }
    }

    public static final int LJFF$0(C580770MqB c580770MqB, int i) {
        if (((C528350Knp) c580770MqB.l0).LLJJJ.getItemViewType(i) != 1) {
            return 1;
        }
        return ((WrapGridLayoutManager) c580770MqB.l1).LLILLJJLI;
    }

    public static final int LJFF$1(C580770MqB c580770MqB, int i) {
        if (((C528330Knn) c580770MqB.l0).LLJJJ.getItemViewType(i) != 1) {
            return 1;
        }
        return ((WrapGridLayoutManager) c580770MqB.l1).LLILLJJLI;
    }

    public static final int LJFF$2(C580770MqB c580770MqB, int i) {
        InterfaceC529800KqA interfaceC529800KqA = (InterfaceC529800KqA) C13LP.LJJJLZIJ(i, ((C528320Knm) c580770MqB.l0).LLLILZ);
        if (interfaceC529800KqA != null && interfaceC529800KqA.needFullSpan()) {
            return ((WrapGridLayoutManager) c580770MqB.l1).LLILLJJLI;
        }
        C528320Knm c528320Knm = (C528320Knm) c580770MqB.l0;
        InterfaceC529800KqA interfaceC529800KqA2 = (InterfaceC529800KqA) C13LP.LJJJLZIJ(i - (c528320Knm.LLJJJ.getItemCount() - ((C528320Knm) c580770MqB.l0).LLLILZJ.size()), c528320Knm.LLLILZJ);
        if (interfaceC529800KqA2 != null && interfaceC529800KqA2.needFullSpan()) {
            return ((WrapGridLayoutManager) c580770MqB.l1).LLILLJJLI;
        }
        if (((C528320Knm) c580770MqB.l0).LLJJJ.getItemViewType(i) != 1) {
            return 1;
        }
        return ((WrapGridLayoutManager) c580770MqB.l1).LLILLJJLI;
    }

    public static final int LJFF$3(C580770MqB c580770MqB, int i) {
        if (((C528310Knl) c580770MqB.l1).LLJJJ.getItemViewType(i) != 1) {
            return 1;
        }
        return ((WrapGridLayoutManager) c580770MqB.l0).LLILLJJLI;
    }

    public static final int LJFF$4(C580770MqB c580770MqB, int i) {
        if (((C528340Kno) c580770MqB.l0).LLJJJ.getItemViewType(i) != 1) {
            return 1;
        }
        return ((WrapGridLayoutManager) c580770MqB.l1).LLILLJJLI;
    }

    public static final int LJFF$5(C580770MqB c580770MqB, int i) {
        if (((C528760KoU) c580770MqB.l0).LLJJJ.getItemViewType(i) != 1) {
            return 1;
        }
        return ((WrapGridLayoutManager) c580770MqB.l1).LLILLJJLI;
    }

    public static final int LJFF$6(C580770MqB c580770MqB, int i) {
        int itemViewType = ((C562020M2m) c580770MqB.l0).getItemViewType(i);
        if (itemViewType != 105) {
            if (itemViewType != 112) {
                if (itemViewType != 107) {
                    if (itemViewType != 108) {
                        return 1;
                    }
                    return ((GridLayoutManager) ((RecyclerView.LayoutManager) c580770MqB.l1)).LLILLJJLI;
                }
                return ((GridLayoutManager) ((RecyclerView.LayoutManager) c580770MqB.l1)).LLILLJJLI;
            }
            return ((GridLayoutManager) ((RecyclerView.LayoutManager) c580770MqB.l1)).LLILLJJLI;
        }
        return ((GridLayoutManager) ((RecyclerView.LayoutManager) c580770MqB.l1)).LLILLJJLI;
    }

    public static final int LJFF$7(C580770MqB c580770MqB, int i) {
        int itemViewType = ((C561900M2a) c580770MqB.l0).getItemViewType(i);
        if (itemViewType != 108) {
            if (itemViewType != 112) {
                if (itemViewType != 115) {
                    if (itemViewType != 117) {
                        if (itemViewType != 121) {
                            return 1;
                        }
                        return ((GridLayoutManager) ((RecyclerView.LayoutManager) c580770MqB.l1)).LLILLJJLI;
                    }
                    return ((GridLayoutManager) ((RecyclerView.LayoutManager) c580770MqB.l1)).LLILLJJLI;
                }
                return ((GridLayoutManager) ((RecyclerView.LayoutManager) c580770MqB.l1)).LLILLJJLI;
            }
            return ((GridLayoutManager) ((RecyclerView.LayoutManager) c580770MqB.l1)).LLILLJJLI;
        }
        return ((GridLayoutManager) ((RecyclerView.LayoutManager) c580770MqB.l1)).LLILLJJLI;
    }

    public C580770MqB(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
