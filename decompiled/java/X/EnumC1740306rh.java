package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06rh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1740306rh {
    public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
    public static final /* synthetic */ EnumC1740306rh[] $VALUES;
    public static final EnumC1740306rh CONTENT = new EnumC1740306rh("CONTENT", 0);
    public static final EnumC1740306rh EXT = new EnumC1740306rh("EXT", 1);
    public static final EnumC1740306rh LOCAL_EXT = new EnumC1740306rh("LOCAL_EXT", 2);
    public static final EnumC1740306rh REACTIONS = new EnumC1740306rh("REACTIONS", 3);
    public static final EnumC1740306rh STATUS = new EnumC1740306rh("STATUS", 4);
    public static final EnumC1740306rh READ_STATUS = new EnumC1740306rh("READ_STATUS", 5);
    public static final EnumC1740306rh ATTACHMENTS = new EnumC1740306rh("ATTACHMENTS", 6);

    public static final /* synthetic */ EnumC1740306rh[] $values() {
        return new EnumC1740306rh[]{CONTENT, EXT, LOCAL_EXT, REACTIONS, STATUS, READ_STATUS, ATTACHMENTS};
    }

    public static InterfaceC2044707zh<EnumC1740306rh> getEntries() {
        return $ENTRIES;
    }

    static {
        EnumC1740306rh[] enumC1740306rhArr$values = $values();
        $VALUES = enumC1740306rhArr$values;
        $ENTRIES = new C2254308sP(enumC1740306rhArr$values);
    }

    public static EnumC1740306rh[] values() {
        return (EnumC1740306rh[]) $VALUES.clone();
    }

    public static EnumC1740306rh valueOf(String str) {
        return (EnumC1740306rh) C08FF.LIZ(EnumC1740306rh.class, str);
    }

    public EnumC1740306rh(String str, int i) {
    }
}
