package X;

/* JADX INFO: renamed from: X.13gg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20074813gg {
    public final long LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20074813gg)) {
            return false;
        }
        C20074813gg c20074813gg = (C20074813gg) obj;
        return C1378605aS.LIZJ(this.LIZ, c20074813gg.LIZ) && this.LIZIZ == c20074813gg.LIZIZ && this.LIZJ == c20074813gg.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MouseWheelScrollDelta(value=");
        sbLIZ.append((Object) C1378605aS.LJIIIIZZ(this.LIZ));
        sbLIZ.append(", timeMillis=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", shouldApplyImmediately=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final C20074813gg LIZ(C20074813gg c20074813gg) {
        return new C20074813gg(C1378605aS.LJI(this.LIZ, c20074813gg.LIZ), Math.max(this.LIZIZ, c20074813gg.LIZIZ), this.LIZJ);
    }

    public C20074813gg(long j, long j2, boolean z) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = z;
    }
}
