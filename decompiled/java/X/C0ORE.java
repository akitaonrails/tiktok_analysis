package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ORE, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ORE {
    public final List<InterfaceC1891350zJl> LIZ;
    public final List<C1203150hPl> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ORE)) {
            return false;
        }
        C0ORE c0ore = (C0ORE) obj;
        return Intrinsics.LJFF(this.LIZ, c0ore.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ore.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0ORE(List<? extends InterfaceC1891350zJl> list, List<C1203150hPl> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
