package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UBH, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UBH {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0UBH)) {
            return false;
        }
        C0UBH c0ubh = (C0UBH) obj;
        return Intrinsics.LJFF(this.LIZ, c0ubh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ubh.LIZIZ) && this.LIZJ == c0ubh.LIZJ;
    }

    public C0UBH(String str, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
    }
}
