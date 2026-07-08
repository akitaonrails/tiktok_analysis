package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dES, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1042380dES {
    public static final EnumC1042380dES FRAGMENT;
    public static final /* synthetic */ EnumC1042380dES[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1042380dES PRE_WARM;
    public static final EnumC1042380dES VIEW;

    public static InterfaceC2044707zh<EnumC1042380dES> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1042380dES enumC1042380dES = new EnumC1042380dES("PRE_WARM", 0);
        PRE_WARM = enumC1042380dES;
        EnumC1042380dES enumC1042380dES2 = new EnumC1042380dES("FRAGMENT", 1);
        FRAGMENT = enumC1042380dES2;
        EnumC1042380dES enumC1042380dES3 = new EnumC1042380dES("VIEW", 2);
        VIEW = enumC1042380dES3;
        EnumC1042380dES[] enumC1042380dESArr = {enumC1042380dES, enumC1042380dES2, enumC1042380dES3};
        LL = enumC1042380dESArr;
        LLILLJJLI = new C2254308sP(enumC1042380dESArr);
    }

    public static EnumC1042380dES[] values() {
        return (EnumC1042380dES[]) LL.clone();
    }

    public static EnumC1042380dES valueOf(String str) {
        return (EnumC1042380dES) C08FF.LIZ(EnumC1042380dES.class, str);
    }

    public EnumC1042380dES(String str, int i) {
    }
}
