package X;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1D8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251021D8q {
    public final ArrayList<C1437500nVk> LIZ;
    public final C1D84 LIZIZ;

    public final Integer LIZ(Object obj) {
        int i = 0;
        for (C1437500nVk c1437500nVk : this.LIZ) {
            int i2 = i + 1;
            if (i >= 0) {
                if (Intrinsics.LJFF(c1437500nVk.LIZ, obj)) {
                    return Integer.valueOf(i);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return null;
    }

    public C2251021D8q(ArrayList<C1437500nVk> arrayList, C1D84 c1d84) {
        this.LIZ = arrayList;
        this.LIZIZ = c1d84;
    }
}
