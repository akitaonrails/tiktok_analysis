package X;

/* JADX INFO: renamed from: X.0Ep1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376210Ep1 {
    public final EnumC375190EnN LIZ;
    public final boolean LIZIZ;

    public C376210Ep1() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C376210Ep1)) {
            return false;
        }
        C376210Ep1 c376210Ep1 = (C376210Ep1) obj;
        return this.LIZ == c376210Ep1.LIZ && this.LIZIZ == c376210Ep1.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CropPanelStates(currentCropMode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enableTouchEvent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C376210Ep1(int i) {
        this(EnumC375190EnN.FREE, true);
    }

    public C376210Ep1(EnumC375190EnN enumC375190EnN, boolean z) {
        this.LIZ = enumC375190EnN;
        this.LIZIZ = z;
    }
}
