package X;

/* JADX INFO: renamed from: X.10yL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19419910yL implements InterfaceC0148002o {
    public final EnumC19371710qZ LL;
    public final long LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19419910yL)) {
            return false;
        }
        C19419910yL c19419910yL = (C19419910yL) obj;
        return this.LL == c19419910yL.LL && this.LLILLJJLI == c19419910yL.LLILLJJLI && this.LLILLL == c19419910yL.LLILLL && this.LLILZ == c19419910yL.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopStatusBarState(networkType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", time=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isCharging=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", batteryLevel=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19419910yL(EnumC19371710qZ enumC19371710qZ, long j, boolean z, int i) {
        this.LL = enumC19371710qZ;
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = i;
    }

    public static C19419910yL LIZ(C19419910yL c19419910yL, EnumC19371710qZ enumC19371710qZ, long j, boolean z, int i, int i2) {
        int i3 = i;
        boolean z2 = z;
        long j2 = j;
        EnumC19371710qZ enumC19371710qZ2 = enumC19371710qZ;
        if ((i2 & 1) != 0) {
            enumC19371710qZ2 = c19419910yL.LL;
        }
        if ((i2 & 2) != 0) {
            j2 = c19419910yL.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            z2 = c19419910yL.LLILLL;
        }
        if ((i2 & 8) != 0) {
            i3 = c19419910yL.LLILZ;
        }
        c19419910yL.getClass();
        return new C19419910yL(enumC19371710qZ2, j2, z2, i3);
    }
}
