package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15sW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20657815sW {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public long LJFF = -1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20657815sW)) {
            return false;
        }
        C20657815sW c20657815sW = (C20657815sW) obj;
        return Intrinsics.LJFF(this.LIZ, c20657815sW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20657815sW.LIZIZ) && this.LIZJ == c20657815sW.LIZJ && Intrinsics.LJFF(this.LIZLLL, c20657815sW.LIZLLL) && this.LJ == c20657815sW.LJ && this.LJFF == c20657815sW.LJFF;
    }

    public C20657815sW(String str, String str2, String str3, boolean z, long j) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = str3;
        this.LJ = j;
    }
}
