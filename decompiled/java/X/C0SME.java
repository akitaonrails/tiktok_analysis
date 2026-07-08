package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SME, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SME {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SME)) {
            return false;
        }
        C0SME c0sme = (C0SME) obj;
        return Intrinsics.LJFF(this.LIZ, c0sme.LIZ) && this.LIZIZ == c0sme.LIZIZ;
    }

    public C0SME(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
