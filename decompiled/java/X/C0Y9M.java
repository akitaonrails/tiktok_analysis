package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Y9M, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y9M {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ C0Y9M[] $VALUES;
    public final String column;
    public final String direction;
    public static final C0Y9M INDEX_DESC = new C0Y9M("INDEX_DESC", 0, "index_in_conversation", "DESC");
    public static final C0Y9M INDEX_ASC = new C0Y9M("INDEX_ASC", 1, "index_in_conversation", "ASC");
    public static final C0Y9M ORDER_INDEX_DESC = new C0Y9M("ORDER_INDEX_DESC", 2, "order_index", "DESC");
    public static final C0Y9M ORDER_INDEX_ASC = new C0Y9M("ORDER_INDEX_ASC", 3, "order_index", "ASC");
    public static final C0Y9M CREATE_TIME_DESC = new C0Y9M("CREATE_TIME_DESC", 4, "created_time", "DESC");
    public static final C0Y9M CREATE_TIME_ASC = new C0Y9M("CREATE_TIME_ASC", 5, "created_time", "ASC");

    public static final /* synthetic */ C0Y9M[] $values() {
        return new C0Y9M[]{INDEX_DESC, INDEX_ASC, ORDER_INDEX_DESC, ORDER_INDEX_ASC, CREATE_TIME_DESC, CREATE_TIME_ASC};
    }

    public static InterfaceC2044707zh<C0Y9M> getEntries() {
        return $ENTRIES;
    }

    static {
        C0Y9M[] c0y9mArr$values = $values();
        $VALUES = c0y9mArr$values;
        $ENTRIES = new C2254308sP(c0y9mArr$values);
    }

    public static C0Y9M[] values() {
        return (C0Y9M[]) $VALUES.clone();
    }

    public final String getColumn() {
        return this.column;
    }

    public final String getDirection() {
        return this.direction;
    }

    public static C0Y9M valueOf(String str) {
        return (C0Y9M) C08FF.LIZ(C0Y9M.class, str);
    }

    public C0Y9M(String str, int i, String str2, String str3) {
        this.column = str2;
        this.direction = str3;
    }
}
