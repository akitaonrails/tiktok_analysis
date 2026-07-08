package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0acf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC942070acf {
    public static final /* synthetic */ EnumC942070acf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC942070acf NORMAL_STATE;
    public static final EnumC942070acf PAUSE_STATE;
    public static final EnumC942070acf UNKNOWN_STATE;

    public static InterfaceC2044707zh<EnumC942070acf> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC942070acf enumC942070acf = new EnumC942070acf("UNKNOWN_STATE", 0);
        UNKNOWN_STATE = enumC942070acf;
        EnumC942070acf enumC942070acf2 = new EnumC942070acf("NORMAL_STATE", 1);
        NORMAL_STATE = enumC942070acf2;
        EnumC942070acf enumC942070acf3 = new EnumC942070acf("PAUSE_STATE", 2);
        PAUSE_STATE = enumC942070acf3;
        EnumC942070acf[] enumC942070acfArr = {enumC942070acf, enumC942070acf2, enumC942070acf3};
        LL = enumC942070acfArr;
        LLILLJJLI = new C2254308sP(enumC942070acfArr);
    }

    public static EnumC942070acf[] values() {
        return (EnumC942070acf[]) LL.clone();
    }

    public static EnumC942070acf valueOf(String str) {
        return (EnumC942070acf) C08FF.LIZ(EnumC942070acf.class, str);
    }

    public EnumC942070acf(String str, int i) {
    }
}
