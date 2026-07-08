package X;

/* JADX INFO: renamed from: X.0jnk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294900jnk implements InterfaceC1294510jn7 {
    public final String LIZ;
    public final EnumC1295660joy LIZIZ;
    public final boolean LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MergePaths{mode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1294900jnk(String str, EnumC1295660joy enumC1295660joy, boolean z) {
        this.LIZ = str;
        this.LIZIZ = enumC1295660joy;
        this.LIZJ = z;
    }

    @Override // X.InterfaceC1294510jn7
    public final InterfaceC1295810jpD LIZ(C1295950jpR c1295950jpR, C1294720jnS c1294720jnS, AbstractC1295030jnx abstractC1295030jnx) {
        if (!c1295950jpR.LLJJI) {
            C1292050jj9.LIZIZ("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new C1295070jo1(this);
    }
}
