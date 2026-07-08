package X;

/* JADX INFO: renamed from: X.0DgY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345480DgY extends AbstractC345490DgZ {
    public final EnumC904370Zdr LL;
    public final boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C345480DgY)) {
            return false;
        }
        C345480DgY c345480DgY = (C345480DgY) obj;
        return this.LL == c345480DgY.LL && this.LLILLJJLI == c345480DgY.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DetailGridEmptyCellItem(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", centerContent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C345480DgY(EnumC904370Zdr enumC904370Zdr, boolean z) {
        this.LL = enumC904370Zdr;
        this.LLILLJJLI = z;
    }
}
