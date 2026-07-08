package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03YR, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03YR {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03YR)) {
            return false;
        }
        C03YR c03yr = (C03YR) obj;
        return Intrinsics.LJFF(this.LIZ, c03yr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c03yr.LIZIZ);
    }

    public C03YR(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
