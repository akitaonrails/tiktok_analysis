package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Dns, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350020Dns {
    public static final void LIZ(ArrayList<C350030Dnt> arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int i = 0;
        for (C350030Dnt c350030Dnt : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                C350030Dnt c350030Dnt2 = c350030Dnt;
                if (c350030Dnt2.LIZ > 300) {
                    ListProtector.set(arrayList, i, C350030Dnt.LIZ(c350030Dnt2, i));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
