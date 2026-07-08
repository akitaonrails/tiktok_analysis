package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mfI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404980mfI {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1404980mfI)) {
            return false;
        }
        C1404980mfI c1404980mfI = (C1404980mfI) obj;
        return Intrinsics.LJFF(this.LIZ, c1404980mfI.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1404980mfI.LIZIZ) && this.LIZJ == c1404980mfI.LIZJ && this.LIZLLL == c1404980mfI.LIZLLL;
    }

    public C1404980mfI(int i, String str, long j, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = i;
    }
}
