package X;

/* JADX INFO: renamed from: X.07Yy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1882607Yy extends Throwable {
    public static final int $stable = 8;
    public final EnumC1488960oqk type;

    public final C1882607Yy copy(EnumC1488960oqk enumC1488960oqk) {
        return new C1882607Yy(enumC1488960oqk);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1882607Yy) && this.type == ((C1882607Yy) obj).type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoModeNetworkException(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1882607Yy(EnumC1488960oqk enumC1488960oqk) {
        this.type = enumC1488960oqk;
    }
}
