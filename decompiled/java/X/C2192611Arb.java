package X;

/* JADX INFO: renamed from: X.1Arb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192611Arb extends AbstractC2192621Arc {
    public final EnumC2008307tp LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2192611Arb) && this.LIZ == ((C2192611Arb) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PermanentBlocked(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2192611Arb(EnumC2008307tp enumC2008307tp) {
        this.LIZ = enumC2008307tp;
    }
}
