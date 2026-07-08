package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tHn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659490tHn {
    public final Integer LIZ;
    public final String LIZIZ;
    public final Long LIZJ;
    public final Integer LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C1659490tHn() {
        this((String) null, (Integer) (0 == true ? 1 : 0), (Long) (0 == true ? 1 : 0), 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1659490tHn)) {
            return false;
        }
        C1659490tHn c1659490tHn = (C1659490tHn) obj;
        return Intrinsics.LJFF(this.LIZ, c1659490tHn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1659490tHn.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1659490tHn.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1659490tHn.LIZLLL);
    }

    public /* synthetic */ C1659490tHn(String str, Integer num, Long l, int i) {
        this((i & 4) != 0 ? null : l, (i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (Integer) null);
    }

    public C1659490tHn(Long l, Integer num, String str, Integer num2) {
        this.LIZ = num;
        this.LIZIZ = str;
        this.LIZJ = l;
        this.LIZLLL = num2;
    }
}
