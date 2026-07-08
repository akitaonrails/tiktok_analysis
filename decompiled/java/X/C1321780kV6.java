package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kV6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321780kV6 {
    public final String LIZ;
    public final DialogC1321720kV0 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1321780kV6)) {
            return false;
        }
        C1321780kV6 c1321780kV6 = (C1321780kV6) obj;
        return Intrinsics.LJFF(this.LIZ, c1321780kV6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1321780kV6.LIZIZ);
    }

    public C1321780kV6(String str, DialogC1321720kV0 dialogC1321720kV0) {
        this.LIZ = str;
        this.LIZIZ = dialogC1321720kV0;
    }
}
