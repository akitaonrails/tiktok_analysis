package X;

/* JADX INFO: renamed from: X.11UF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public enum C11UF {
    FIRST("awaitFirst"),
    FIRST_OR_DEFAULT("awaitFirstOrDefault"),
    /* JADX INFO: Fake field, exist only in values array */
    LAST("awaitLast"),
    SINGLE("awaitSingle");

    public final String LL;

    public static C11UF valueOf(String str) {
        return (C11UF) C08FF.LIZ(C11UF.class, str);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.LL;
    }

    C11UF(String str) {
        this.LL = str;
    }
}
