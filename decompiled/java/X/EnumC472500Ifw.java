package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ifw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC472500Ifw {
    public static final EnumC472500Ifw DEFAULT_48;
    public static final /* synthetic */ EnumC472500Ifw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC472500Ifw TOPLIVE_56;

    public static InterfaceC2044707zh<EnumC472500Ifw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC472500Ifw enumC472500Ifw = new EnumC472500Ifw("DEFAULT_48", 0);
        DEFAULT_48 = enumC472500Ifw;
        EnumC472500Ifw enumC472500Ifw2 = new EnumC472500Ifw("TOPLIVE_56", 1);
        TOPLIVE_56 = enumC472500Ifw2;
        EnumC472500Ifw[] enumC472500IfwArr = {enumC472500Ifw, enumC472500Ifw2};
        LL = enumC472500IfwArr;
        LLILLJJLI = new C2254308sP(enumC472500IfwArr);
    }

    public static EnumC472500Ifw[] values() {
        return (EnumC472500Ifw[]) LL.clone();
    }

    public static EnumC472500Ifw valueOf(String str) {
        return (EnumC472500Ifw) C08FF.LIZ(EnumC472500Ifw.class, str);
    }

    public EnumC472500Ifw(String str, int i) {
    }
}
