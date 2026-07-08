package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hyL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1224590hyL {
    public final EnumC1227730i3P LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1224590hyL)) {
            return false;
        }
        C1224590hyL c1224590hyL = (C1224590hyL) obj;
        return this.LIZ == c1224590hyL.LIZ && this.LIZIZ == c1224590hyL.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1224590hyL.LIZJ) && this.LIZLLL == c1224590hyL.LIZLLL && this.LJ == c1224590hyL.LJ;
    }

    public C1224590hyL(EnumC1227730i3P enumC1227730i3P, boolean z, String str, boolean z2, boolean z3) {
        this.LIZ = enumC1227730i3P;
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = z2;
        this.LJ = z3;
    }
}
