package X;

/* JADX INFO: renamed from: X.0qc8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556780qc8 implements InterfaceC0148002o {
    public final EnumC1563010qmB LL;

    public C1556780qc8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1556780qc8) && this.LL == ((C1556780qc8) obj).LL;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicCellFeaturedVideosIconState(pinnedVideoStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1556780qc8(int i) {
        this(EnumC1563010qmB.NOT_ALLOWED_SHOWN);
    }

    public C1556780qc8(EnumC1563010qmB enumC1563010qmB) {
        this.LL = enumC1563010qmB;
    }
}
