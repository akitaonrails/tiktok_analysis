package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0txl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685510txl {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1685510txl)) {
            return false;
        }
        C1685510txl c1685510txl = (C1685510txl) obj;
        return Intrinsics.LJFF(this.LIZ, c1685510txl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1685510txl.LIZIZ);
    }

    public C1685510txl(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
