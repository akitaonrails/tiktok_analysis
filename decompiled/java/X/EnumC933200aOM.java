package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aOM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC933200aOM {
    public static final EnumC933200aOM ANCHOR;
    public static final EnumC933200aOM AUDIENCE;
    public static final EnumC933200aOM GUEST;
    public static final /* synthetic */ EnumC933200aOM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC933200aOM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC933200aOM enumC933200aOM = new EnumC933200aOM("ANCHOR", 0);
        ANCHOR = enumC933200aOM;
        EnumC933200aOM enumC933200aOM2 = new EnumC933200aOM("GUEST", 1);
        GUEST = enumC933200aOM2;
        EnumC933200aOM enumC933200aOM3 = new EnumC933200aOM("AUDIENCE", 2);
        AUDIENCE = enumC933200aOM3;
        EnumC933200aOM[] enumC933200aOMArr = {enumC933200aOM, enumC933200aOM2, enumC933200aOM3};
        LL = enumC933200aOMArr;
        LLILLJJLI = new C2254308sP(enumC933200aOMArr);
    }

    public static EnumC933200aOM[] values() {
        return (EnumC933200aOM[]) LL.clone();
    }

    public static EnumC933200aOM valueOf(String str) {
        return (EnumC933200aOM) C08FF.LIZ(EnumC933200aOM.class, str);
    }

    public EnumC933200aOM(String str, int i) {
    }
}
