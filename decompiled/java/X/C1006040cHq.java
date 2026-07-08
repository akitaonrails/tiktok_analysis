package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cHq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006040cHq {
    public final List<C1839120xxW> LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1006040cHq)) {
            return false;
        }
        C1006040cHq c1006040cHq = (C1006040cHq) obj;
        return Intrinsics.LJFF(this.LIZ, c1006040cHq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1006040cHq.LIZIZ) && this.LIZJ == c1006040cHq.LIZJ;
    }

    public C1006040cHq(List<C1839120xxW> list, String str, boolean z) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
