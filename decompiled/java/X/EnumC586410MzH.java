package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MzH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586410MzH {
    public static final EnumC586410MzH CLICKTYPE;
    public static final EnumC586410MzH DEFAULTTYPE;
    public static final /* synthetic */ EnumC586410MzH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC586410MzH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC586410MzH enumC586410MzH = new EnumC586410MzH("CLICKTYPE", 0);
        CLICKTYPE = enumC586410MzH;
        EnumC586410MzH enumC586410MzH2 = new EnumC586410MzH("DEFAULTTYPE", 1);
        DEFAULTTYPE = enumC586410MzH2;
        EnumC586410MzH[] enumC586410MzHArr = {enumC586410MzH, enumC586410MzH2};
        LL = enumC586410MzHArr;
        LLILLJJLI = new C2254308sP(enumC586410MzHArr);
    }

    public static EnumC586410MzH[] values() {
        return (EnumC586410MzH[]) LL.clone();
    }

    public static EnumC586410MzH valueOf(String str) {
        return (EnumC586410MzH) C08FF.LIZ(EnumC586410MzH.class, str);
    }

    public EnumC586410MzH(String str, int i) {
    }
}
