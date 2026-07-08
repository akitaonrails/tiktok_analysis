package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0ycT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1864510ycT extends AbstractC214823195h {
    public final int $t;
    public Object l0;

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

    public C1864510ycT(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int LJFF$0(C1864510ycT c1864510ycT, int i) {
        List<? extends InterfaceC1806790x7N> list;
        InterfaceC1806790x7N interfaceC1806790x7N;
        C1806980x7g c1806980x7g = (C1806980x7g) c1864510ycT.l0;
        if (c1806980x7g != null && (list = c1806980x7g.LLILZ) != null && (interfaceC1806790x7N = (InterfaceC1806790x7N) ListProtector.get(list, i)) != null) {
            return interfaceC1806790x7N.LIZ();
        }
        return 1;
    }

    public static final int LJFF$1(C1864510ycT c1864510ycT, int i) {
        int itemViewType = ((C1807180x80) c1864510ycT.l0).LIZJ().getItemViewType(i);
        if (itemViewType == -2 || itemViewType == -1 || itemViewType == 3 || itemViewType == 4 || itemViewType == 6) {
            return 3;
        }
        switch (itemViewType) {
        }
        return 3;
    }
}
