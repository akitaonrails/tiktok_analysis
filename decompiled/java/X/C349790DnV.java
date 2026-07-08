package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0DnV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349790DnV {
    public final List<C349800DnW> LIZ;

    public final List<C349800DnW> LIZ() {
        if (this.LIZ.isEmpty()) {
            return this.LIZ;
        }
        ArrayList arrayList = new ArrayList();
        C349800DnW c349800DnW = (C349800DnW) C13LP.LJJLIIIJL(this.LIZ);
        int i = c349800DnW != null ? c349800DnW.LIZJ : 0;
        for (int size = this.LIZ.size() - 1; -1 < size; size--) {
            C349800DnW c349800DnW2 = (C349800DnW) ListProtector.get(this.LIZ, size);
            if (c349800DnW2.LIZ()) {
                c349800DnW2.LIZJ = i;
                c349800DnW2.LIZIZ = i;
                C349800DnW c349800DnW3 = (C349800DnW) C13LP.LJJLIIIJL(arrayList);
                if (c349800DnW3 != null && !c349800DnW3.LIZ()) {
                    arrayList.add(c349800DnW2);
                }
            } else {
                c349800DnW2.LIZJ = i;
                i = c349800DnW2.LIZIZ;
                arrayList.add(c349800DnW2);
            }
        }
        C349800DnW c349800DnW4 = (C349800DnW) C13LP.LJJLIIIJL(arrayList);
        if (c349800DnW4 != null && c349800DnW4.LIZ()) {
            arrayList.remove(c349800DnW4);
        }
        return C13LP.LJLJJLL(arrayList);
    }

    public C349790DnV(List<C349800DnW> list) {
        this.LIZ = list;
    }
}
