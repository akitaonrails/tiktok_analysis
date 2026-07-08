package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q6D, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q6D {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Q6D)) {
            return false;
        }
        C0Q6D c0q6d = (C0Q6D) obj;
        return Intrinsics.LJFF(this.LIZ, c0q6d.LIZ) && this.LIZIZ == c0q6d.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0q6d.LIZJ);
    }

    public C0Q6D(String str, int i, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
    }
}
