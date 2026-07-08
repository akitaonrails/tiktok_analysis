package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fES, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1119260fES {
    public static final EnumC1119260fES FixedWidth;
    public static final EnumC1119260fES HugContent;
    public static final /* synthetic */ EnumC1119260fES[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1119260fES> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1119260fES enumC1119260fES = new EnumC1119260fES("HugContent", 0);
        HugContent = enumC1119260fES;
        EnumC1119260fES enumC1119260fES2 = new EnumC1119260fES("FixedWidth", 1);
        FixedWidth = enumC1119260fES2;
        EnumC1119260fES[] enumC1119260fESArr = {enumC1119260fES, enumC1119260fES2};
        LL = enumC1119260fESArr;
        LLILLJJLI = new C2254308sP(enumC1119260fESArr);
    }

    public static EnumC1119260fES[] values() {
        return (EnumC1119260fES[]) LL.clone();
    }

    public static EnumC1119260fES valueOf(String str) {
        return (EnumC1119260fES) C08FF.LIZ(EnumC1119260fES.class, str);
    }

    public EnumC1119260fES(String str, int i) {
    }
}
