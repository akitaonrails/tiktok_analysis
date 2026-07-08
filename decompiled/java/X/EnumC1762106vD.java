package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06vD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1762106vD {
    public static final EnumC1762106vD DB_ERROR;
    public static final /* synthetic */ EnumC1762106vD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1762106vD NETWORK_ERROR;
    public static final EnumC1762106vD SKIPPED;
    public static final EnumC1762106vD SUCCESS;

    public static InterfaceC2044707zh<EnumC1762106vD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1762106vD enumC1762106vD = new EnumC1762106vD("SUCCESS", 0);
        SUCCESS = enumC1762106vD;
        EnumC1762106vD enumC1762106vD2 = new EnumC1762106vD("NETWORK_ERROR", 1);
        NETWORK_ERROR = enumC1762106vD2;
        EnumC1762106vD enumC1762106vD3 = new EnumC1762106vD("DB_ERROR", 2);
        DB_ERROR = enumC1762106vD3;
        EnumC1762106vD enumC1762106vD4 = new EnumC1762106vD("SKIPPED", 3);
        SKIPPED = enumC1762106vD4;
        EnumC1762106vD[] enumC1762106vDArr = {enumC1762106vD, enumC1762106vD2, enumC1762106vD3, enumC1762106vD4};
        LL = enumC1762106vDArr;
        LLILLJJLI = new C2254308sP(enumC1762106vDArr);
    }

    public static EnumC1762106vD[] values() {
        return (EnumC1762106vD[]) LL.clone();
    }

    public static EnumC1762106vD valueOf(String str) {
        return (EnumC1762106vD) C08FF.LIZ(EnumC1762106vD.class, str);
    }

    public EnumC1762106vD(String str, int i) {
    }
}
