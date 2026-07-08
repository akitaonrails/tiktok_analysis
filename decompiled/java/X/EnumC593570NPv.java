package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NPv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC593570NPv {
    public static final EnumC593570NPv EXTREME_JAVA_MEMORY;
    public static final EnumC593570NPv HIGH_JAVA_MEMORY;
    public static final EnumC593570NPv IDLE_TIMER;
    public static final /* synthetic */ EnumC593570NPv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC593570NPv MOCK;
    public static final EnumC593570NPv UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC593570NPv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC593570NPv enumC593570NPv = new EnumC593570NPv("UNKNOWN", 0, 0);
        UNKNOWN = enumC593570NPv;
        EnumC593570NPv enumC593570NPv2 = new EnumC593570NPv("HIGH_JAVA_MEMORY", 1, 1);
        HIGH_JAVA_MEMORY = enumC593570NPv2;
        EnumC593570NPv enumC593570NPv3 = new EnumC593570NPv("EXTREME_JAVA_MEMORY", 2, 2);
        EXTREME_JAVA_MEMORY = enumC593570NPv3;
        EnumC593570NPv enumC593570NPv4 = new EnumC593570NPv("MOCK", 3, 3);
        MOCK = enumC593570NPv4;
        EnumC593570NPv enumC593570NPv5 = new EnumC593570NPv("IDLE_TIMER", 4, 4);
        IDLE_TIMER = enumC593570NPv5;
        EnumC593570NPv[] enumC593570NPvArr = {enumC593570NPv, enumC593570NPv2, enumC593570NPv3, enumC593570NPv4, enumC593570NPv5};
        LLILLJJLI = enumC593570NPvArr;
        LLILLL = new C2254308sP(enumC593570NPvArr);
    }

    public static EnumC593570NPv[] values() {
        return (EnumC593570NPv[]) LLILLJJLI.clone();
    }

    public final int getMobValue() {
        return this.LL;
    }

    public static EnumC593570NPv valueOf(String str) {
        return (EnumC593570NPv) C08FF.LIZ(EnumC593570NPv.class, str);
    }

    public EnumC593570NPv(String str, int i, int i2) {
        this.LL = i2;
    }
}
