package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YGn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC871430YGn {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ EnumC871430YGn[] $VALUES;
    public static final EnumC871430YGn STRANGER_NOT_RISKY = new EnumC871430YGn("STRANGER_NOT_RISKY", 0);
    public static final EnumC871430YGn ALL_RISKY = new EnumC871430YGn("ALL_RISKY", 1);
    public static final EnumC871430YGn ALL_STRANGER = new EnumC871430YGn("ALL_STRANGER", 2);

    public static final /* synthetic */ EnumC871430YGn[] $values() {
        return new EnumC871430YGn[]{STRANGER_NOT_RISKY, ALL_RISKY, ALL_STRANGER};
    }

    public static InterfaceC2044707zh<EnumC871430YGn> getEntries() {
        return $ENTRIES;
    }

    static {
        EnumC871430YGn[] enumC871430YGnArr$values = $values();
        $VALUES = enumC871430YGnArr$values;
        $ENTRIES = new C2254308sP(enumC871430YGnArr$values);
    }

    public static EnumC871430YGn[] values() {
        return (EnumC871430YGn[]) $VALUES.clone();
    }

    public static EnumC871430YGn valueOf(String str) {
        return (EnumC871430YGn) C08FF.LIZ(EnumC871430YGn.class, str);
    }

    public EnumC871430YGn(String str, int i) {
    }
}
