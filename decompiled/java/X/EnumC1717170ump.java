package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ump, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1717170ump {
    public static final EnumC1717170ump CLOSE;
    public static final /* synthetic */ EnumC1717170ump[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1717170ump REFRESH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1717170ump> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1717170ump enumC1717170ump = new EnumC1717170ump("CLOSE", 0, "close");
        CLOSE = enumC1717170ump;
        EnumC1717170ump enumC1717170ump2 = new EnumC1717170ump("REFRESH", 1, "refresh");
        REFRESH = enumC1717170ump2;
        EnumC1717170ump[] enumC1717170umpArr = {enumC1717170ump, enumC1717170ump2};
        LLILLJJLI = enumC1717170umpArr;
        LLILLL = new C2254308sP(enumC1717170umpArr);
    }

    public static EnumC1717170ump[] values() {
        return (EnumC1717170ump[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1717170ump valueOf(String str) {
        return (EnumC1717170ump) C08FF.LIZ(EnumC1717170ump.class, str);
    }

    public EnumC1717170ump(String str, int i, String str2) {
        this.LL = str2;
    }
}
