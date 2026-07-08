package X;

/* JADX INFO: renamed from: X.0gDu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157360gDu implements InterfaceC1673510teP {
    public final int LIZ;
    public final EnumC1154200g8o LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157360gDu)) {
            return false;
        }
        C1157360gDu c1157360gDu = (C1157360gDu) obj;
        return this.LIZ == c1157360gDu.LIZ && this.LIZIZ == c1157360gDu.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Number(count=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", maxCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157360gDu() {
        EnumC1154200g8o enumC1154200g8o = EnumC1154200g8o.Unlimited;
        this.LIZ = 0;
        this.LIZIZ = enumC1154200g8o;
    }
}
