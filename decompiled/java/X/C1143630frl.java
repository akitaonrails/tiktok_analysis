package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0frl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1143630frl {
    public final long LIZ;
    public final long LIZIZ;
    public InterfaceC1143640frm LIZJ;
    public C1118840fDm LIZLLL;
    public C1295960jpS LJ;
    public boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1143630frl)) {
            return false;
        }
        C1143630frl c1143630frl = (C1143630frl) obj;
        return this.LIZ == c1143630frl.LIZ && this.LIZIZ == c1143630frl.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1143630frl.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1143630frl.LIZLLL) && Intrinsics.LJFF(this.LJ, c1143630frl.LJ) && this.LJFF == c1143630frl.LJFF;
    }

    public C1143630frl(long j, long j2, InterfaceC1143640frm interfaceC1143640frm, C1118840fDm c1118840fDm, C1295960jpS c1295960jpS, boolean z) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = interfaceC1143640frm;
        this.LIZLLL = c1118840fDm;
        this.LJ = c1295960jpS;
        this.LJFF = z;
    }
}
