package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15io, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20597615io {
    public static final EnumC20597615io ALL;
    public static final /* synthetic */ EnumC20597615io[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20597615io SELF;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20597615io> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20597615io enumC20597615io = new EnumC20597615io("SELF", 0, "self");
        SELF = enumC20597615io;
        EnumC20597615io enumC20597615io2 = new EnumC20597615io("ALL", 1, "all");
        ALL = enumC20597615io2;
        EnumC20597615io[] enumC20597615ioArr = {enumC20597615io, enumC20597615io2};
        LLILLJJLI = enumC20597615ioArr;
        LLILLL = new C2254308sP(enumC20597615ioArr);
    }

    public static EnumC20597615io[] values() {
        return (EnumC20597615io[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20597615io valueOf(String str) {
        return (EnumC20597615io) C08FF.LIZ(EnumC20597615io.class, str);
    }

    public EnumC20597615io(String str, int i, String str2) {
        this.LL = str2;
    }
}
