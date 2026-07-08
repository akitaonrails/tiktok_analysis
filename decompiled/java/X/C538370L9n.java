package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538370L9n {
    public final int LIZ;
    public final int LIZIZ;
    public final List<C538380L9o> LIZJ;

    public C538370L9n() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C538370L9n)) {
            return false;
        }
        C538370L9n c538370L9n = (C538370L9n) obj;
        return this.LIZ == c538370L9n.LIZ && this.LIZIZ == c538370L9n.LIZIZ && Intrinsics.LJFF(this.LIZJ, c538370L9n.LIZJ);
    }

    public C538370L9n(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = arrayList;
    }
}
