package X;

/* JADX INFO: renamed from: X.0M8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C563540M8i extends C0M8P {
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C563540M8i) && this.LIZIZ == ((C563540M8i) obj).LIZIZ;
    }

    public final int hashCode() {
        return this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeleteSelectItemClicked(index=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C563540M8i(int i) {
        super(false);
        this.LIZIZ = i;
    }
}
