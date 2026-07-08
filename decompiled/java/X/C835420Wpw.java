package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wpw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835420Wpw {
    public static final <E> int LIZ(C835410Wpv<E> c835410Wpv, Object obj, int i) {
        int i2 = c835410Wpv.LLILLL;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iLIZ = C830540Wi4.LIZ(i2, i, c835410Wpv.LL);
            if (iLIZ < 0 || Intrinsics.LJFF(obj, c835410Wpv.LLILLJJLI[iLIZ])) {
                return iLIZ;
            }
            int i3 = iLIZ + 1;
            while (i3 < i2 && c835410Wpv.LL[i3] == i) {
                if (Intrinsics.LJFF(obj, c835410Wpv.LLILLJJLI[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iLIZ - 1; i4 >= 0 && c835410Wpv.LL[i4] == i; i4--) {
                if (Intrinsics.LJFF(obj, c835410Wpv.LLILLJJLI[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new ConcurrentModificationException();
        }
    }
}
