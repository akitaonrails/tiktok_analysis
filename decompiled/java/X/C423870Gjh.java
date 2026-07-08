package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gjh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423870Gjh {
    public final int LIZ;
    public final List<InterfaceC423860Gjg> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C423870Gjh)) {
            return false;
        }
        C423870Gjh c423870Gjh = (C423870Gjh) obj;
        return this.LIZ == c423870Gjh.LIZ && Intrinsics.LJFF(this.LIZIZ, c423870Gjh.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C423870Gjh(int i, List<? extends InterfaceC423860Gjg> list) {
        this.LIZ = i;
        this.LIZIZ = list;
    }
}
