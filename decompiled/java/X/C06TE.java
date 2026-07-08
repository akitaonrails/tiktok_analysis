package X;

/* JADX INFO: renamed from: X.06TE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06TE {
    public final EnumC904370Zdr LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06TE)) {
            return false;
        }
        C06TE c06te = (C06TE) obj;
        return this.LIZ == c06te.LIZ && this.LIZIZ == c06te.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaGridTypeClass(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iconResId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C06TE(EnumC904370Zdr enumC904370Zdr, int i) {
        this.LIZ = enumC904370Zdr;
        this.LIZIZ = i;
    }
}
