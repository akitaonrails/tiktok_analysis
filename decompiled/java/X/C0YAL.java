package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YAL, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YAL {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ C0YAL[] $VALUES;
    public final String column;
    public final String direction;
    public static final C0YAL SORT_ORDER_DESC = new C0YAL("SORT_ORDER_DESC", 0, "sort_order", "DESC");
    public static final C0YAL SORT_ORDER_ASC = new C0YAL("SORT_ORDER_ASC", 1, "sort_order", "ASC");

    public static final /* synthetic */ C0YAL[] $values() {
        return new C0YAL[]{SORT_ORDER_DESC, SORT_ORDER_ASC};
    }

    public static InterfaceC2044707zh<C0YAL> getEntries() {
        return $ENTRIES;
    }

    static {
        C0YAL[] c0yalArr$values = $values();
        $VALUES = c0yalArr$values;
        $ENTRIES = new C2254308sP(c0yalArr$values);
    }

    public static C0YAL[] values() {
        return (C0YAL[]) $VALUES.clone();
    }

    public final String getColumn() {
        return this.column;
    }

    public final String getDirection() {
        return this.direction;
    }

    public static C0YAL valueOf(String str) {
        return (C0YAL) C08FF.LIZ(C0YAL.class, str);
    }

    public C0YAL(String str, int i, String str2, String str3) {
        this.column = str2;
        this.direction = str3;
    }
}
