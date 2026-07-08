package X;

/* JADX INFO: renamed from: X.07tB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2004307tB extends AbstractC2004407tC {
    public final EnumC2004207tA LL;

    public C2004307tB() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2004307tB) && this.LL == ((C2004307tB) obj).LL;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SceneryPictureSelectorCellData(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2004307tB(int i) {
        this.LL = EnumC2004207tA.PICK_ALBUM;
    }
}
