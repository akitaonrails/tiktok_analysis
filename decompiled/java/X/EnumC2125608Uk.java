package X;

/* JADX INFO: renamed from: X.08Uk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC2125608Uk {
    DEX_FILES(0),
    /* JADX INFO: Fake field, exist only in values array */
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATION_COUNT(4);

    public final long LL;

    public static EnumC2125608Uk valueOf(String str) {
        return (EnumC2125608Uk) C08FF.LIZ(EnumC2125608Uk.class, str);
    }

    EnumC2125608Uk(long j) {
        this.LL = j;
    }
}
