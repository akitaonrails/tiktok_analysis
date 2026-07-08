package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03CJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03CJ {
    public final List<String> LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03CJ)) {
            return false;
        }
        C03CJ c03cj = (C03CJ) obj;
        return Intrinsics.LJFF(this.LIZ, c03cj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c03cj.LIZIZ);
    }

    public C03CJ(List<String> list, String str) {
        this.LIZ = list;
        this.LIZIZ = str;
    }
}
