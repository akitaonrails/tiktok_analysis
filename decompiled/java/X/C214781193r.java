package X;

import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.193r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214781193r {
    public static final List<C19223110Ij> LIZ(List<C193Z> list, boolean z) {
        Integer numValueOf;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (C193Z c193z : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C19223110Ij c19223110IjLIZ = C214767193d.LIZ(c193z);
                if (i == 0) {
                    c19223110IjLIZ.LJIIZILJ = true;
                }
                if (i == list.size() - 1) {
                    c19223110IjLIZ.LJIJ = true;
                }
                if (z) {
                    numValueOf = Integer.valueOf(R.attr.a1b);
                } else {
                    numValueOf = Integer.valueOf(R.attr.a1c);
                }
                c19223110IjLIZ.LJIILLIIL = numValueOf;
                arrayList.add(c19223110IjLIZ);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }
}
