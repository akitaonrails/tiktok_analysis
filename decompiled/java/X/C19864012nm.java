package X;

/* JADX INFO: renamed from: X.12nm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19864012nm {
    public final Object LIZ;
    public final Object LIZIZ;
    public final Object LIZJ;

    public C19864012nm(Object obj, Object obj2, Object obj3) {
        this.LIZ = obj;
        this.LIZIZ = obj2;
        this.LIZJ = obj3;
    }

    public final IllegalArgumentException LIZ() {
        Object obj = this.LIZJ;
        Object obj2 = this.LIZIZ;
        Object obj3 = this.LIZ;
        String strValueOf = String.valueOf(obj3);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(obj3);
        String strValueOf4 = String.valueOf(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Multiple entries with same key: ");
        sbLIZ.append(strValueOf);
        sbLIZ.append("=");
        sbLIZ.append(strValueOf2);
        sbLIZ.append(" and ");
        sbLIZ.append(strValueOf3);
        sbLIZ.append("=");
        sbLIZ.append(strValueOf4);
        return new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
