package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ams, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948400ams {
    public final boolean LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C948400ams)) {
            return false;
        }
        C948400ams c948400ams = (C948400ams) obj;
        return this.LIZ == c948400ams.LIZ && this.LIZIZ == c948400ams.LIZIZ && Intrinsics.LJFF(this.LIZJ, c948400ams.LIZJ) && this.LIZLLL == c948400ams.LIZLLL;
    }

    public C948400ams(boolean z, int i, String str, int i2) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = i2;
    }
}
