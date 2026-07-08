package X;

/* JADX INFO: renamed from: X.09EL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public enum C09EL {
    /* JADX INFO: Fake field, exist only in values array */
    INT("int"),
    STRING("java.lang.String"),
    /* JADX INFO: Fake field, exist only in values array */
    LONG("long"),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE("double"),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN("boolean");

    public final String LL;

    @Override // java.lang.Enum
    public final String toString() {
        return this.LL;
    }

    public static C09EL valueOf(String str) {
        return (C09EL) C08FF.LIZ(C09EL.class, str);
    }

    C09EL(String str) {
        this.LL = str;
    }
}
