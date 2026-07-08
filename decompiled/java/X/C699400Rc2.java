package X;

/* JADX INFO: renamed from: X.0Rc2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699400Rc2 {
    public final EnumC699470Rc9 LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C699400Rc2)) {
            return false;
        }
        C699400Rc2 c699400Rc2 = (C699400Rc2) obj;
        return this.LIZ == c699400Rc2.LIZ && this.LIZIZ == c699400Rc2.LIZIZ && this.LIZJ == c699400Rc2.LIZJ && this.LIZLLL == c699400Rc2.LIZLLL && this.LJ == c699400Rc2.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CachedSlotState(availabilityState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", revision=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dispatched=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", suppressRemoveAnimationOnFirstDispatch=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", observedAsVisible=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C699400Rc2 LIZ(C699400Rc2 c699400Rc2, boolean z, int i) {
        EnumC699470Rc9 enumC699470Rc9;
        long j;
        boolean z2;
        boolean z3;
        boolean z4 = z;
        if ((i & 1) != 0) {
            enumC699470Rc9 = c699400Rc2.LIZ;
        } else {
            enumC699470Rc9 = null;
        }
        if ((i & 2) != 0) {
            j = c699400Rc2.LIZIZ;
        } else {
            j = 0;
        }
        if ((i & 4) != 0) {
            z2 = c699400Rc2.LIZJ;
        } else {
            z2 = true;
        }
        if ((i & 8) != 0) {
            z3 = c699400Rc2.LIZLLL;
        } else {
            z3 = false;
        }
        if ((i & 16) != 0) {
            z4 = c699400Rc2.LJ;
        }
        return new C699400Rc2(enumC699470Rc9, j, z2, z3, z4);
    }

    public C699400Rc2(EnumC699470Rc9 enumC699470Rc9, long j, boolean z, boolean z2, boolean z3) {
        this.LIZ = enumC699470Rc9;
        this.LIZIZ = j;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
    }
}
