package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FGZ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FGZ {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C0FGZ() {
        this("", "", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0FGZ)) {
            return false;
        }
        C0FGZ c0fgz = (C0FGZ) obj;
        return Intrinsics.LJFF(this.LIZ, c0fgz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0fgz.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0fgz.LIZJ);
    }

    public C0FGZ(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
