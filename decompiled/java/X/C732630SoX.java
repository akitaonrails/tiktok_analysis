package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SoX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732630SoX {
    public final boolean LIZ;
    public final Float LIZIZ;
    public final boolean LIZJ;

    public C732630SoX() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C732630SoX)) {
            return false;
        }
        C732630SoX c732630SoX = (C732630SoX) obj;
        return this.LIZ == c732630SoX.LIZ && Intrinsics.LJFF(this.LIZIZ, c732630SoX.LIZIZ) && this.LIZJ == c732630SoX.LIZJ;
    }

    public /* synthetic */ C732630SoX(int i) {
        this(true, null, true);
    }

    public C732630SoX(boolean z, Float f, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = f;
        this.LIZJ = z2;
    }
}
