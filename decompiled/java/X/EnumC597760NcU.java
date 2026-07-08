package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NcU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC597760NcU {
    public static final /* synthetic */ EnumC597760NcU[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC597760NcU SUBMIT_FAIL;
    public static final EnumC597760NcU SUBMIT_SUCCESS;

    public static InterfaceC2044707zh<EnumC597760NcU> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC597760NcU enumC597760NcU = new EnumC597760NcU("SUBMIT_SUCCESS", 0);
        SUBMIT_SUCCESS = enumC597760NcU;
        EnumC597760NcU enumC597760NcU2 = new EnumC597760NcU("SUBMIT_FAIL", 1);
        SUBMIT_FAIL = enumC597760NcU2;
        EnumC597760NcU[] enumC597760NcUArr = {enumC597760NcU, enumC597760NcU2};
        LL = enumC597760NcUArr;
        LLILLJJLI = new C2254308sP(enumC597760NcUArr);
    }

    public static EnumC597760NcU[] values() {
        return (EnumC597760NcU[]) LL.clone();
    }

    public static EnumC597760NcU valueOf(String str) {
        return (EnumC597760NcU) C08FF.LIZ(EnumC597760NcU.class, str);
    }

    public EnumC597760NcU(String str, int i) {
    }
}
