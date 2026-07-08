package X;

/* JADX INFO: renamed from: X.0jnC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294560jnC implements InterfaceC1294510jn7 {
    public final String LIZ;
    public final EnumC994250byp LIZIZ;
    public final C1295020jnw LIZJ;
    public final C1295020jnw LIZLLL;
    public final C1295020jnw LJ;
    public final boolean LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Trim Path: {start: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", end: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", offset: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1294510jn7
    public final InterfaceC1295810jpD LIZ(C1295950jpR c1295950jpR, C1294720jnS c1294720jnS, AbstractC1295030jnx abstractC1295030jnx) {
        return new C1294570jnD(abstractC1295030jnx, this);
    }

    public C1294560jnC(String str, EnumC994250byp enumC994250byp, C1295020jnw c1295020jnw, C1295020jnw c1295020jnw2, C1295020jnw c1295020jnw3, boolean z) {
        this.LIZ = str;
        this.LIZIZ = enumC994250byp;
        this.LIZJ = c1295020jnw;
        this.LIZLLL = c1295020jnw2;
        this.LJ = c1295020jnw3;
        this.LJFF = z;
    }
}
