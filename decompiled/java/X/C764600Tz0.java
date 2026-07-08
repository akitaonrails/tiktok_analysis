package X;

/* JADX INFO: renamed from: X.0Tz0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C764600Tz0 extends AbstractC764660Tz6 {
    public final EnumC764520Tys LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C764600Tz0) && this.LIZ == ((C764600Tz0) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OpenContainer(defaultPage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C764600Tz0(EnumC764520Tys enumC764520Tys) {
        this.LIZ = enumC764520Tys;
    }
}
