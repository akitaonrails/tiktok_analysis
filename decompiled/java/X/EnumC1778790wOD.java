package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778790wOD {
    public static final EnumC1778790wOD FAIL;
    public static final /* synthetic */ EnumC1778790wOD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778790wOD NET_ERR;
    public static final EnumC1778790wOD SUCCESS;

    public static InterfaceC2044707zh<EnumC1778790wOD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778790wOD enumC1778790wOD = new EnumC1778790wOD("SUCCESS", 0);
        SUCCESS = enumC1778790wOD;
        EnumC1778790wOD enumC1778790wOD2 = new EnumC1778790wOD("NET_ERR", 1);
        NET_ERR = enumC1778790wOD2;
        EnumC1778790wOD enumC1778790wOD3 = new EnumC1778790wOD("FAIL", 2);
        FAIL = enumC1778790wOD3;
        EnumC1778790wOD[] enumC1778790wODArr = {enumC1778790wOD, enumC1778790wOD2, enumC1778790wOD3};
        LL = enumC1778790wODArr;
        LLILLJJLI = new C2254308sP(enumC1778790wODArr);
    }

    public static EnumC1778790wOD[] values() {
        return (EnumC1778790wOD[]) LL.clone();
    }

    public static EnumC1778790wOD valueOf(String str) {
        return (EnumC1778790wOD) C08FF.LIZ(EnumC1778790wOD.class, str);
    }

    public EnumC1778790wOD(String str, int i) {
    }
}
