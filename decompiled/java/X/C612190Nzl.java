package X;

/* JADX INFO: renamed from: X.0Nzl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612190Nzl<S> {
    public final String LIZ;
    public final S LIZIZ;
    public final EnumC612200Nzm LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StateChange(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", newState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C612190Nzl(String str, S s, EnumC612200Nzm enumC612200Nzm) {
        this.LIZ = str;
        this.LIZIZ = s;
        this.LIZJ = enumC612200Nzm;
    }
}
