package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mfK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1405000mfK {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1405000mfK)) {
            return false;
        }
        C1405000mfK c1405000mfK = (C1405000mfK) obj;
        return this.LIZ == c1405000mfK.LIZ && Intrinsics.LJFF(this.LIZIZ, c1405000mfK.LIZIZ);
    }

    public C1405000mfK(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
