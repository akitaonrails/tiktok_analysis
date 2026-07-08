package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SoU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732600SoU {
    public final int LIZ;
    public final Float LIZIZ;
    public final String LIZJ;

    public C732600SoU() {
        this(0, (String) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C732600SoU)) {
            return false;
        }
        C732600SoU c732600SoU = (C732600SoU) obj;
        return this.LIZ == c732600SoU.LIZ && Intrinsics.LJFF(this.LIZIZ, c732600SoU.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c732600SoU.LIZJ);
    }

    public /* synthetic */ C732600SoU(int i, String str, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (Float) null, (i2 & 4) != 0 ? null : str);
    }

    public C732600SoU(int i, Float f, String str) {
        this.LIZ = i;
        this.LIZIZ = f;
        this.LIZJ = str;
    }
}
