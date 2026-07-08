package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gPD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1164370gPD {
    public static final EnumC1164370gPD API_ERROR;
    public static final /* synthetic */ EnumC1164370gPD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1164370gPD NETWORK_ERROR;

    public static InterfaceC2044707zh<EnumC1164370gPD> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1164370gPD enumC1164370gPD = new EnumC1164370gPD("NETWORK_ERROR", 0);
        NETWORK_ERROR = enumC1164370gPD;
        EnumC1164370gPD enumC1164370gPD2 = new EnumC1164370gPD("API_ERROR", 1);
        API_ERROR = enumC1164370gPD2;
        EnumC1164370gPD[] enumC1164370gPDArr = {enumC1164370gPD, enumC1164370gPD2};
        LL = enumC1164370gPDArr;
        LLILLJJLI = new C2254308sP(enumC1164370gPDArr);
    }

    public static EnumC1164370gPD[] values() {
        return (EnumC1164370gPD[]) LL.clone();
    }

    public static EnumC1164370gPD valueOf(String str) {
        return (EnumC1164370gPD) C08FF.LIZ(EnumC1164370gPD.class, str);
    }

    public EnumC1164370gPD(String str, int i) {
    }
}
