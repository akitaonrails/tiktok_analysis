package X;

/* JADX INFO: renamed from: X.0WQ8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WQ8 extends C0WR6 {
    public static final C0WQ8 LIZLLL = new C0WQ8(EnumC823400WRu.String, "pns-null");
    public final Object LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DirectValue{");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0WR6
    public final Object LIZIZ() {
        return this.LIZJ;
    }

    public C0WQ8(EnumC823400WRu enumC823400WRu, Object obj) {
        super(enumC823400WRu);
        this.LIZJ = obj;
    }
}
