package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0329009n {
    public static final /* synthetic */ EnumC0329009n[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC0329009n SPECIFIC;
    public static final EnumC0329009n WRAP_CONTENT;

    public static InterfaceC2044707zh<EnumC0329009n> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0329009n enumC0329009n = new EnumC0329009n("WRAP_CONTENT", 0);
        WRAP_CONTENT = enumC0329009n;
        EnumC0329009n enumC0329009n2 = new EnumC0329009n("SPECIFIC", 1);
        SPECIFIC = enumC0329009n2;
        EnumC0329009n[] enumC0329009nArr = {enumC0329009n, enumC0329009n2};
        LL = enumC0329009nArr;
        LLILLJJLI = new C2254308sP(enumC0329009nArr);
    }

    public static EnumC0329009n[] values() {
        return (EnumC0329009n[]) LL.clone();
    }

    public static EnumC0329009n valueOf(String str) {
        return (EnumC0329009n) C08FF.LIZ(EnumC0329009n.class, str);
    }

    public EnumC0329009n(String str, int i) {
    }
}
