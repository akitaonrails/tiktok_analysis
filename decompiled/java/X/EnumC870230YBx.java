package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0YBx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC870230YBx {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ EnumC870230YBx[] $VALUES;
    public static final C870240YBy Companion;
    public final int value;
    public static final EnumC870230YBx ONE_TO_ONE = new EnumC870230YBx("ONE_TO_ONE", 0, AbstractC1711506n3.LIZ);
    public static final EnumC870230YBx GROUP = new EnumC870230YBx("GROUP", 1, AbstractC1711506n3.LIZIZ);

    public static final /* synthetic */ EnumC870230YBx[] $values() {
        return new EnumC870230YBx[]{ONE_TO_ONE, GROUP};
    }

    public static InterfaceC2044707zh<EnumC870230YBx> getEntries() {
        return $ENTRIES;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0YBy] */
    static {
        EnumC870230YBx[] enumC870230YBxArr$values = $values();
        $VALUES = enumC870230YBxArr$values;
        $ENTRIES = new C2254308sP(enumC870230YBxArr$values);
        Companion = new Object() { // from class: X.0YBy
        };
    }

    public static EnumC870230YBx[] values() {
        return (EnumC870230YBx[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public static EnumC870230YBx valueOf(String str) {
        return (EnumC870230YBx) C08FF.LIZ(EnumC870230YBx.class, str);
    }

    public EnumC870230YBx(String str, int i, int i2) {
        this.value = i2;
    }
}
