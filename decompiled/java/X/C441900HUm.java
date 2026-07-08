package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C441900HUm {
    public final String LIZ;
    public final Integer LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    public C441900HUm() {
        this(null, null, 0, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C441900HUm)) {
            return false;
        }
        C441900HUm c441900HUm = (C441900HUm) obj;
        return Intrinsics.LJFF(this.LIZ, c441900HUm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c441900HUm.LIZIZ) && this.LIZJ == c441900HUm.LIZJ && this.LIZLLL == c441900HUm.LIZLLL;
    }

    public C441900HUm(Integer num, String str, int i, boolean z) {
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = i;
        this.LIZLLL = z;
    }
}
