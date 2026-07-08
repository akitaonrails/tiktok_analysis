package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c5X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998410c5X {
    public final String LIZ;
    public final String LIZIZ;

    public C998410c5X() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C998410c5X)) {
            return false;
        }
        C998410c5X c998410c5X = (C998410c5X) obj;
        return Intrinsics.LJFF(this.LIZ, c998410c5X.LIZ) && Intrinsics.LJFF(this.LIZIZ, c998410c5X.LIZIZ);
    }

    public C998410c5X(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
