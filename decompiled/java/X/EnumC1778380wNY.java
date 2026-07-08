package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wNY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778380wNY {
    public static final /* synthetic */ EnumC1778380wNY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1778380wNY NONE;
    public static final EnumC1778380wNY QA_PAGE;
    public static final EnumC1778380wNY STATUS_SETTING_PAGE;

    public static InterfaceC2044707zh<EnumC1778380wNY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778380wNY enumC1778380wNY = new EnumC1778380wNY("NONE", 0);
        NONE = enumC1778380wNY;
        EnumC1778380wNY enumC1778380wNY2 = new EnumC1778380wNY("STATUS_SETTING_PAGE", 1);
        STATUS_SETTING_PAGE = enumC1778380wNY2;
        EnumC1778380wNY enumC1778380wNY3 = new EnumC1778380wNY("QA_PAGE", 2);
        QA_PAGE = enumC1778380wNY3;
        EnumC1778380wNY[] enumC1778380wNYArr = {enumC1778380wNY, enumC1778380wNY2, enumC1778380wNY3};
        LL = enumC1778380wNYArr;
        LLILLJJLI = new C2254308sP(enumC1778380wNYArr);
    }

    public static EnumC1778380wNY[] values() {
        return (EnumC1778380wNY[]) LL.clone();
    }

    public static EnumC1778380wNY valueOf(String str) {
        return (EnumC1778380wNY) C08FF.LIZ(EnumC1778380wNY.class, str);
    }

    public EnumC1778380wNY(String str, int i) {
    }
}
