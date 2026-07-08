package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SBg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717180SBg {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C717180SBg) && Intrinsics.LJFF(this.LIZ, ((C717180SBg) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C717180SBg(String str) {
        this.LIZ = str;
    }
}
