package X;

/* JADX INFO: renamed from: X.0eFi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1081600eFi {
    public final EnumC918970a1P LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final boolean LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiLiveLayoutEvent(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", guestWindowCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", btmEmptyViewHeight=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", guestWindowWidth=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", fixedDoubleCampLayout=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        EnumC918970a1P enumC918970a1P = this.LIZ;
        if (enumC918970a1P == EnumC918970a1P.NORMAL || enumC918970a1P == EnumC918970a1P.FLOATING) {
            return true;
        }
        if (enumC918970a1P == EnumC918970a1P.GRID && this.LIZIZ <= 0) {
            return true;
        }
        if (enumC918970a1P != EnumC918970a1P.GRID_FIX || this.LIZIZ > 0) {
            return enumC918970a1P == EnumC918970a1P.FLOATING_FIX && this.LIZIZ <= 0;
        }
        return true;
    }

    public final boolean LIZIZ() {
        EnumC918970a1P enumC918970a1P = this.LIZ;
        if (enumC918970a1P == EnumC918970a1P.GRID_FIX || enumC918970a1P == EnumC918970a1P.FLOATING_FIX) {
            return true;
        }
        if (enumC918970a1P != EnumC918970a1P.GRID || this.LIZIZ <= 0) {
            return enumC918970a1P == EnumC918970a1P.FLOATING && this.LIZIZ > 0;
        }
        return true;
    }

    public C1081600eFi(EnumC918970a1P enumC918970a1P, int i, int i2, int i3, boolean z) {
        this.LIZ = enumC918970a1P;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = z;
    }

    public /* synthetic */ C1081600eFi(EnumC918970a1P enumC918970a1P, int i, int i2, int i3, boolean z, int i4) {
        this(enumC918970a1P, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? false : z);
    }
}
