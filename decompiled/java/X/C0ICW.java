package X;

/* JADX INFO: renamed from: X.0ICW, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0ICW {
    public final boolean LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0ICW) && this.LIZ == ((C0ICW) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreStickerInfoState(isAnimationDisabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ICW(boolean z) {
        this.LIZ = z;
    }
}
