package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ear, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1094710ear {
    public static final EnumC1094710ear ANCHOR;
    public static final EnumC1094710ear AUDIENCE;
    public static final /* synthetic */ EnumC1094710ear[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1094710ear> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1094710ear enumC1094710ear = new EnumC1094710ear("ANCHOR", 0);
        ANCHOR = enumC1094710ear;
        EnumC1094710ear enumC1094710ear2 = new EnumC1094710ear("AUDIENCE", 1);
        AUDIENCE = enumC1094710ear2;
        EnumC1094710ear[] enumC1094710earArr = {enumC1094710ear, enumC1094710ear2};
        LL = enumC1094710earArr;
        LLILLJJLI = new C2254308sP(enumC1094710earArr);
    }

    public static EnumC1094710ear[] values() {
        return (EnumC1094710ear[]) LL.clone();
    }

    public static EnumC1094710ear valueOf(String str) {
        return (EnumC1094710ear) C08FF.LIZ(EnumC1094710ear.class, str);
    }

    public EnumC1094710ear(String str, int i) {
    }
}
