package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MVn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C569570MVn {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final long LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C569570MVn)) {
            return false;
        }
        C569570MVn c569570MVn = (C569570MVn) obj;
        return Intrinsics.LJFF(this.LIZ, c569570MVn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c569570MVn.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c569570MVn.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c569570MVn.LIZLLL) && this.LJ == c569570MVn.LJ && this.LJFF == c569570MVn.LJFF;
    }

    public /* synthetic */ C569570MVn(String str, String str2, String str3, String str4) {
        this(str, str2, str3, 500L, str4, true);
    }

    public C569570MVn(String str, String str2, String str3, long j, String str4, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = z;
        this.LJFF = j;
    }
}
