package X;

import android.util.SparseArray;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.19ov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21654719ov implements InterfaceC21654919ox {
    public final SparseArray<List<C21680219t2>> LIZ = new SparseArray<>();

    @Override // X.InterfaceC21654919ox
    public final InterfaceC21680519t5 LIZ(final C21680219t2 c21680219t2) {
        return new InterfaceC21680519t5(c21680219t2) { // from class: X.19ow
            public final C21680219t2 LIZ;

            @Override // X.InterfaceC21680519t5
            public final int LIZIZ(int i) {
                return i;
            }

            @Override // X.InterfaceC21680519t5
            public final void dispose() {
                C21654719ov c21654719ov = this.LIZIZ;
                C21680219t2 c21680219t22 = this.LIZ;
                int size = c21654719ov.LIZ.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        return;
                    }
                    List<C21680219t2> listValueAt = c21654719ov.LIZ.valueAt(size);
                    if (listValueAt.remove(c21680219t22) && listValueAt.isEmpty()) {
                        c21654719ov.LIZ.removeAt(size);
                    }
                }
            }

            @Override // X.InterfaceC21680519t5
            public final int LIZ(int i) {
                List<C21680219t2> arrayList = this.LIZIZ.LIZ.get(i);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.LIZIZ.LIZ.put(i, arrayList);
                }
                if (!arrayList.contains(this.LIZ)) {
                    arrayList.add(this.LIZ);
                }
                return i;
            }

            {
                this.LIZ = c21680219t2;
            }
        };
    }

    @Override // X.InterfaceC21654919ox
    public final C21680219t2 LIZIZ(int i) {
        List<C21680219t2> list = this.LIZ.get(i);
        if (list != null && !list.isEmpty()) {
            return (C21680219t2) ListProtector.get(list, 0);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot find the wrapper for global view type ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
