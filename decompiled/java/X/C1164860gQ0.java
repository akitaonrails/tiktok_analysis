package X;

/* JADX INFO: renamed from: X.0gQ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1164860gQ0 extends Throwable {
    public final int LL;
    public final EnumC1488950oqj type;

    public final C1164860gQ0 copy(EnumC1488950oqj enumC1488950oqj) {
        return new C1164860gQ0(enumC1488950oqj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1164860gQ0) && this.type == ((C1164860gQ0) obj).type;
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ArticleModeNetworkException(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getErrMsgId() {
        return this.LL;
    }

    public C1164860gQ0(EnumC1488950oqj enumC1488950oqj) {
        this.type = enumC1488950oqj;
        this.LL = enumC1488950oqj.getErrMsgId();
    }
}
