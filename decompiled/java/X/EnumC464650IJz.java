package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC464650IJz {
    public static final EnumC464650IJz CONFIG_CLOSE;
    public static final EnumC464650IJz CONFIG_DISPLAY;
    public static final EnumC464650IJz CONFIG_RETAIN;
    public static final /* synthetic */ EnumC464650IJz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC464650IJz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC464650IJz enumC464650IJz = new EnumC464650IJz("CONFIG_DISPLAY", 0, "display");
        CONFIG_DISPLAY = enumC464650IJz;
        EnumC464650IJz enumC464650IJz2 = new EnumC464650IJz("CONFIG_CLOSE", 1, "close");
        CONFIG_CLOSE = enumC464650IJz2;
        EnumC464650IJz enumC464650IJz3 = new EnumC464650IJz("CONFIG_RETAIN", 2, "retain");
        CONFIG_RETAIN = enumC464650IJz3;
        EnumC464650IJz[] enumC464650IJzArr = {enumC464650IJz, enumC464650IJz2, enumC464650IJz3};
        LLILLJJLI = enumC464650IJzArr;
        LLILLL = new C2254308sP(enumC464650IJzArr);
    }

    public static EnumC464650IJz[] values() {
        return (EnumC464650IJz[]) LLILLJJLI.clone();
    }

    public final String getConfig() {
        return this.LL;
    }

    public static EnumC464650IJz valueOf(String str) {
        return (EnumC464650IJz) C08FF.LIZ(EnumC464650IJz.class, str);
    }

    public EnumC464650IJz(String str, int i, String str2) {
        this.LL = str2;
    }
}
