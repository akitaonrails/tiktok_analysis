package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0C8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC308770C8l {
    public static final EnumC308770C8l CUTOUT;
    public static final EnumC308770C8l CUTOUT_OUTLINE;
    public static final /* synthetic */ EnumC308770C8l[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC308770C8l> getEntries() {
        return LLILLL;
    }

    static {
        EnumC308770C8l enumC308770C8l = new EnumC308770C8l("CUTOUT", 0, "cutout");
        CUTOUT = enumC308770C8l;
        EnumC308770C8l enumC308770C8l2 = new EnumC308770C8l("CUTOUT_OUTLINE", 1, "cutout_outline");
        CUTOUT_OUTLINE = enumC308770C8l2;
        EnumC308770C8l[] enumC308770C8lArr = {enumC308770C8l, enumC308770C8l2};
        LLILLJJLI = enumC308770C8lArr;
        LLILLL = new C2254308sP(enumC308770C8lArr);
    }

    public static EnumC308770C8l[] values() {
        return (EnumC308770C8l[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static EnumC308770C8l valueOf(String str) {
        return (EnumC308770C8l) C08FF.LIZ(EnumC308770C8l.class, str);
    }

    public EnumC308770C8l(String str, int i, String str2) {
        this.LL = str2;
    }
}
