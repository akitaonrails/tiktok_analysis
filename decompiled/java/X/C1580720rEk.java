package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rEk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580720rEk {
    public final Integer LIZ;
    public final EnumC1580710rEj LIZIZ;
    public final List<InterfaceC1891350zJl> LIZJ;

    public C1580720rEk() {
        this(null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1580720rEk)) {
            return false;
        }
        C1580720rEk c1580720rEk = (C1580720rEk) obj;
        return Intrinsics.LJFF(this.LIZ, c1580720rEk.LIZ) && this.LIZIZ == c1580720rEk.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1580720rEk.LIZJ);
    }

    public C1580720rEk(EnumC1580710rEj enumC1580710rEj, List list, int i) {
        enumC1580710rEj = (i & 2) != 0 ? null : enumC1580710rEj;
        list = (i & 4) != 0 ? null : list;
        this.LIZ = null;
        this.LIZIZ = enumC1580710rEj;
        this.LIZJ = list;
    }
}
