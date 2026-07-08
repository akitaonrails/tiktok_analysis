package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Y9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC869560Y9i {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ EnumC869560Y9i[] $VALUES;
    public static final C869570Y9j Companion;
    public final int value;
    public static final EnumC869560Y9i NOT_DELETED = new EnumC869560Y9i("NOT_DELETED", 0, 0);
    public static final EnumC869560Y9i DELETED = new EnumC869560Y9i("DELETED", 1, 1);

    public static final /* synthetic */ EnumC869560Y9i[] $values() {
        return new EnumC869560Y9i[]{NOT_DELETED, DELETED};
    }

    public static InterfaceC2044707zh<EnumC869560Y9i> getEntries() {
        return $ENTRIES;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Y9j] */
    static {
        EnumC869560Y9i[] enumC869560Y9iArr$values = $values();
        $VALUES = enumC869560Y9iArr$values;
        $ENTRIES = new C2254308sP(enumC869560Y9iArr$values);
        Companion = new Object() { // from class: X.0Y9j
        };
    }

    public static EnumC869560Y9i[] values() {
        return (EnumC869560Y9i[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static EnumC869560Y9i valueOf(String str) {
        return (EnumC869560Y9i) C08FF.LIZ(EnumC869560Y9i.class, str);
    }

    public EnumC869560Y9i(String str, int i, int i2) {
        this.value = i2;
    }
}
