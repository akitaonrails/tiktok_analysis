package X;

/* JADX INFO: renamed from: X.053o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12914053o implements InterfaceC12901053b {
    public final long LIZ;
    public final EnumC12927054b LIZIZ;
    public final EnumC12926054a LIZJ = EnumC12926054a.EXIT_DURATION;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12914053o)) {
            return false;
        }
        C12914053o c12914053o = (C12914053o) obj;
        return this.LIZ == c12914053o.LIZ && this.LIZIZ == c12914053o.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExitDurationConfig(timeDuration=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timeUnit=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC12901053b
    public final String getTag() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ.getTag());
        sbLIZ.append('_');
        sbLIZ.append(this.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C12914053o(long j, EnumC12927054b enumC12927054b) {
        this.LIZ = j;
        this.LIZIZ = enumC12927054b;
    }
}
