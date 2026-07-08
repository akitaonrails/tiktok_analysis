package X;

import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QGz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C667710QGz extends C09AY implements Function2<C667700QGy, C0QDP, C667700QGy> {
    public C667710QGz() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C667700QGy invoke(C667700QGy c667700QGy, C0QDP c0qdp) {
        boolean z;
        boolean z2;
        Map<?, ?> map;
        boolean z3;
        boolean z4;
        C667700QGy c667700QGy2 = c667700QGy;
        C0QDP c0qdp2 = c0qdp;
        if (c667700QGy2.LIZ != 0 && System.currentTimeMillis() - c667700QGy2.LIZ <= 15000) {
            z = true;
        } else {
            z = false;
        }
        if (!Intrinsics.LJFF(c0qdp2.LIZ, "homepage_hot") && !Intrinsics.LJFF(c0qdp2.LIZ, "homepage_follow") && !Intrinsics.LJFF(c0qdp2.LIZ, "homepage_friends") && !Intrinsics.LJFF(c0qdp2.LIZ, "homepage_now")) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!C1837507Hp.LIZ() ? (map = c667700QGy2.LIZIZ) == null || map.isEmpty() : c667700QGy2.LIZJ == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && z && !z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        return C667700QGy.LIZ(c667700QGy2, 0L, null, null, z4, 7);
    }
}
