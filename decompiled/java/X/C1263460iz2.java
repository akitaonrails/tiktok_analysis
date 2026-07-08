package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263460iz2 {
    public final List<InterfaceC1262160iww> LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1263460iz2)) {
            return false;
        }
        C1263460iz2 c1263460iz2 = (C1263460iz2) obj;
        return Intrinsics.LJFF(this.LIZ, c1263460iz2.LIZ) && this.LIZIZ == c1263460iz2.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1263460iz2(List<? extends InterfaceC1262160iww> list, int i) {
        this.LIZ = list;
        this.LIZIZ = i;
    }
}
