package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hrT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1220330hrT {
    public final String LIZ;
    public final String LIZIZ;

    public C1220330hrT() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1220330hrT)) {
            return false;
        }
        C1220330hrT c1220330hrT = (C1220330hrT) obj;
        return Intrinsics.LJFF(this.LIZ, c1220330hrT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1220330hrT.LIZIZ);
    }

    public C1220330hrT(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
