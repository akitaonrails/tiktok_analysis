package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hVW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1206720hVW {
    public final Class<?> LIZ;
    public final String LIZIZ;

    public C1206720hVW() {
        this(null, null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1206720hVW)) {
            return false;
        }
        C1206720hVW c1206720hVW = (C1206720hVW) obj;
        return Intrinsics.LJFF(this.LIZ, c1206720hVW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1206720hVW.LIZIZ);
    }

    public C1206720hVW(Class cls, String str, int i) {
        cls = (i & 1) != 0 ? null : cls;
        str = (i & 2) != 0 ? "" : str;
        this.LIZ = cls;
        this.LIZIZ = str;
    }
}
