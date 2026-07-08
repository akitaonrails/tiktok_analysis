package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZZE, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZZE {
    public final C0ZZI LIZ;
    public final C0ZZM LIZIZ;
    public final C0ZZL LIZJ;
    public final C0ZZD LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZZE)) {
            return false;
        }
        C0ZZE c0zze = (C0ZZE) obj;
        return Intrinsics.LJFF(this.LIZ, c0zze.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0zze.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0zze.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0zze.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareComment(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", text=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", media=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", metadata=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZZE(C0ZZI c0zzi, C0ZZM c0zzm, C0ZZL c0zzl, C0ZZD c0zzd) {
        this.LIZ = c0zzi;
        this.LIZIZ = c0zzm;
        this.LIZJ = c0zzl;
        this.LIZLLL = c0zzd;
    }
}
