package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YKz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC872590YKz {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ EnumC872590YKz[] $VALUES;
    public static final EnumC872590YKz SUCCESS = new EnumC872590YKz("SUCCESS", 0);
    public static final EnumC872590YKz NETWORK_ERROR = new EnumC872590YKz("NETWORK_ERROR", 1);
    public static final EnumC872590YKz DB_ERROR = new EnumC872590YKz("DB_ERROR", 2);
    public static final EnumC872590YKz SKIPPED = new EnumC872590YKz("SKIPPED", 3);

    public static final /* synthetic */ EnumC872590YKz[] $values() {
        return new EnumC872590YKz[]{SUCCESS, NETWORK_ERROR, DB_ERROR, SKIPPED};
    }

    public static InterfaceC2044707zh<EnumC872590YKz> getEntries() {
        return $ENTRIES;
    }

    static {
        EnumC872590YKz[] enumC872590YKzArr$values = $values();
        $VALUES = enumC872590YKzArr$values;
        $ENTRIES = new C2254308sP(enumC872590YKzArr$values);
    }

    public static EnumC872590YKz[] values() {
        return (EnumC872590YKz[]) $VALUES.clone();
    }

    public static EnumC872590YKz valueOf(String str) {
        return (EnumC872590YKz) C08FF.LIZ(EnumC872590YKz.class, str);
    }

    public EnumC872590YKz(String str, int i) {
    }
}
