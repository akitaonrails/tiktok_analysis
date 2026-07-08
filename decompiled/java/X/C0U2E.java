package X;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U2E, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0U2E extends AbstractC765930U2t<C0U22> {
    public static boolean LJFF(C0U22 c0u22, C0U22 c0u222) {
        if (c0u22.LJIILL != c0u222.LJIILL) {
            return false;
        }
        while (true) {
            boolean z = true;
            for (Pair pair : C13LP.LL(C13LP.LLIILII(c0u22.LJIIJ(), c0u222.LJIIJ()), 3)) {
                if (!z || !Intrinsics.LJFF(pair.getFirst(), pair.getSecond())) {
                    z = false;
                }
            }
            return z;
        }
    }

    @Override // X.AbstractC765930U2t
    public final boolean LIZIZ(Object obj, Object obj2) {
        return Intrinsics.LJFF(obj, obj2);
    }

    @Override // X.AbstractC765930U2t
    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public boolean LIZ(C0U22 c0u22, C0U22 c0u222, int i, int i2) {
        if ((c0u22.LJIIL() && c0u222.LJIIL()) || c0u22.LJIIJ != c0u222.LJIIJ || c0u22.LJIIJJI != c0u222.LJIIJJI || c0u22.LJIIL != c0u222.LJIIL || c0u22.LJIILIIL != c0u222.LJIILIIL || c0u22.LJIILJJIL != c0u222.LJIILJJIL || !Intrinsics.LJFF(c0u22.LJFF, c0u222.LJFF) || !LJFF(c0u22, c0u222) || c0u22.LIZ != c0u222.LIZ) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC765930U2t
    /* JADX INFO: renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public Object LIZJ(C0U22 c0u22, C0U22 c0u222, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        if (c0u22.LJIIJ != c0u222.LJIIJ) {
            arrayList.add(C0U2K.FAV_CHANGE);
        }
        if (c0u22.LJIIJJI != c0u222.LJIIJJI) {
            arrayList.add(C0U2K.ADDED);
        }
        if (c0u22.LJIIL != c0u222.LJIIL) {
            arrayList.add(C0U2K.REQUESTED);
        }
        if (c0u22.LJIILIIL != c0u222.LJIILIIL) {
            arrayList.add(C0U2K.REQUESTED_FOR_SELF);
        }
        if (c0u22.LJIILJJIL != c0u222.LJIILJJIL) {
            arrayList.add(C0U2K.PLAY_STATUS);
        }
        if (!Intrinsics.LJFF(c0u22.LJFF, c0u222.LJFF)) {
            arrayList.add(C0U2K.COVER_CHANGED);
        }
        if (!LJFF(c0u22, c0u222)) {
            arrayList.add(C0U2K.USER_INFO_CHANGED);
        }
        return arrayList;
    }
}
