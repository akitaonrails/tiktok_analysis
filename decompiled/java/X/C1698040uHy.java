package X;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0uHy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698040uHy extends AbstractC214823195h {
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

    public static final int LJFF$0(C1698040uHy c1698040uHy, int i) {
        return ((AbstractC1640350smv) c1698040uHy.l0).LLLFZ(i, (GridLayoutManager) ((RecyclerView.LayoutManager) c1698040uHy.l1));
    }

    public static final int LJFF$1(C1698040uHy c1698040uHy, int i) {
        if (((AbstractC1636650sgx) c1698040uHy.l0).LLLIIIIL(i)) {
            return ((GridLayoutManager) ((RecyclerView.LayoutManager) c1698040uHy.l1)).LLILLJJLI;
        }
        return 1;
    }

    public C1698040uHy(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
