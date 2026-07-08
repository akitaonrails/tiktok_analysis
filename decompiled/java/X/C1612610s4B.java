package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s4B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612610s4B {
    public final String LIZ;
    public final C1612510s41 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1612610s4B)) {
            return false;
        }
        C1612610s4B c1612610s4B = (C1612610s4B) obj;
        return Intrinsics.LJFF(this.LIZ, c1612610s4B.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1612610s4B.LIZIZ);
    }

    public C1612610s4B(String str, C1612510s41 c1612510s41) {
        this.LIZ = str;
        this.LIZIZ = c1612510s41;
    }
}
