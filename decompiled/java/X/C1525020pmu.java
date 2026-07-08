package X;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pmu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525020pmu {
    public final Context LIZ;
    public final InterfaceC1525070pmz LIZIZ;
    public final InterfaceC1525090pn1 LIZJ;
    public final C1304160k2g LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1525020pmu)) {
            return false;
        }
        C1525020pmu c1525020pmu = (C1525020pmu) obj;
        return Intrinsics.LJFF(this.LIZ, c1525020pmu.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1525020pmu.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1525020pmu.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1525020pmu.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        return "InitializeParam(context=" + this.LIZ + ", udpSocketService=" + this.LIZIZ + ", jsApiCenter=" + this.LIZJ + ", commonAPPData=" + this.LIZLLL + ")";
    }

    public C1525020pmu(Context context, C09U3 c09u3, C21346018gE c21346018gE, C1304160k2g c1304160k2g) {
        this.LIZ = context;
        this.LIZIZ = c09u3;
        this.LIZJ = c21346018gE;
        this.LIZLLL = c1304160k2g;
    }
}
