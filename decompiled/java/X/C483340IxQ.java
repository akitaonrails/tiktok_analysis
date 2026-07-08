package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IxQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C483340IxQ {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C483340IxQ)) {
            return false;
        }
        C483340IxQ c483340IxQ = (C483340IxQ) obj;
        return Intrinsics.LJFF(this.LIZ, c483340IxQ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c483340IxQ.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public C483340IxQ(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
