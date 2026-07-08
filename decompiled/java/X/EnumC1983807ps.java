package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07ps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1983807ps {
    public static final EnumC1983807ps CREATE_GROUP;
    public static final /* synthetic */ EnumC1983807ps[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1983807ps SELECT_TEMPLATE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1983807ps> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1983807ps enumC1983807ps = new EnumC1983807ps("CREATE_GROUP", 0, "create_group");
        CREATE_GROUP = enumC1983807ps;
        EnumC1983807ps enumC1983807ps2 = new EnumC1983807ps("SELECT_TEMPLATE", 1, "next");
        SELECT_TEMPLATE = enumC1983807ps2;
        EnumC1983807ps[] enumC1983807psArr = {enumC1983807ps, enumC1983807ps2};
        LLILLJJLI = enumC1983807psArr;
        LLILLL = new C2254308sP(enumC1983807psArr);
    }

    public static EnumC1983807ps[] values() {
        return (EnumC1983807ps[]) LLILLJJLI.clone();
    }

    public final String getTemplateActionVal() {
        return this.LL;
    }

    public static EnumC1983807ps valueOf(String str) {
        return (EnumC1983807ps) C08FF.LIZ(EnumC1983807ps.class, str);
    }

    public EnumC1983807ps(String str, int i, String str2) {
        this.LL = str2;
    }
}
