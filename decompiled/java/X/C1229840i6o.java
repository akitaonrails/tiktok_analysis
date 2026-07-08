package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1229840i6o {
    public final List<C1229760i6g> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1229840i6o)) {
            return false;
        }
        C1229840i6o c1229840i6o = (C1229840i6o) obj;
        return Intrinsics.LJFF(this.LIZ, c1229840i6o.LIZ) && this.LIZIZ == c1229840i6o.LIZIZ && this.LIZJ == c1229840i6o.LIZJ;
    }

    public C1229840i6o(List<C1229760i6g> list, boolean z, boolean z2) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
