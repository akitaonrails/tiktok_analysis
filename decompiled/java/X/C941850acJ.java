package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0acJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941850acJ {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public C941850acJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C941850acJ)) {
            return false;
        }
        C941850acJ c941850acJ = (C941850acJ) obj;
        return Intrinsics.LJFF(this.LIZ, c941850acJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c941850acJ.LIZIZ) && this.LIZJ == c941850acJ.LIZJ;
    }

    public /* synthetic */ C941850acJ(int i) {
        this(null, null, 0);
    }

    public C941850acJ(String str, String str2, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
    }
}
