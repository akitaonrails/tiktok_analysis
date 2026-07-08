package X;

/* JADX INFO: renamed from: X.0wMQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777680wMQ {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777680wMQ)) {
            return false;
        }
        C1777680wMQ c1777680wMQ = (C1777680wMQ) obj;
        return this.LIZ == c1777680wMQ.LIZ && this.LIZIZ == c1777680wMQ.LIZIZ && this.LIZJ == c1777680wMQ.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DonationStickerTypeParseResult(displayStyle=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", legacyDonationNoDisplayStyleAttr=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isDynamicRender=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777680wMQ(int i, boolean z, boolean z2) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
