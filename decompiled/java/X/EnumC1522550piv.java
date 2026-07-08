package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0piv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1522550piv {
    public static final EnumC1522550piv COMMON;
    public static final EnumC1522550piv DATA_NULL;
    public static final /* synthetic */ EnumC1522550piv[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1522550piv LYNX_ERROR;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1522550piv> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1522550piv enumC1522550piv = new EnumC1522550piv("COMMON", 0, LSPassThroughRecordSizeConfig.DEFAULT, "common");
        COMMON = enumC1522550piv;
        EnumC1522550piv enumC1522550piv2 = new EnumC1522550piv("DATA_NULL", 1, 1001, "response data is null");
        DATA_NULL = enumC1522550piv2;
        EnumC1522550piv enumC1522550piv3 = new EnumC1522550piv("LYNX_ERROR", 2, 1002, "lynx load error");
        LYNX_ERROR = enumC1522550piv3;
        EnumC1522550piv[] enumC1522550pivArr = {enumC1522550piv, enumC1522550piv2, enumC1522550piv3};
        LLILLL = enumC1522550pivArr;
        LLILZ = new C2254308sP(enumC1522550pivArr);
    }

    public static EnumC1522550piv[] values() {
        return (EnumC1522550piv[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getMsg() {
        return this.LLILLJJLI;
    }

    public static EnumC1522550piv valueOf(String str) {
        return (EnumC1522550piv) C08FF.LIZ(EnumC1522550piv.class, str);
    }

    public EnumC1522550piv(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
