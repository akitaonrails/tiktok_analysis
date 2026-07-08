package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UeR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC777330UeR {
    public static final EnumC777330UeR GO_SETTING;
    public static final EnumC777330UeR LEARN_MORE;
    public static final /* synthetic */ EnumC777330UeR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC777330UeR NOT_NOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC777330UeR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC777330UeR enumC777330UeR = new EnumC777330UeR("NOT_NOW", 0, "not_now");
        NOT_NOW = enumC777330UeR;
        EnumC777330UeR enumC777330UeR2 = new EnumC777330UeR("LEARN_MORE", 1, "learn_more");
        LEARN_MORE = enumC777330UeR2;
        EnumC777330UeR enumC777330UeR3 = new EnumC777330UeR("GO_SETTING", 2, "go_setting");
        GO_SETTING = enumC777330UeR3;
        EnumC777330UeR[] enumC777330UeRArr = {enumC777330UeR, enumC777330UeR2, enumC777330UeR3};
        LLILLJJLI = enumC777330UeRArr;
        LLILLL = new C2254308sP(enumC777330UeRArr);
    }

    public static EnumC777330UeR[] values() {
        return (EnumC777330UeR[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC777330UeR valueOf(String str) {
        return (EnumC777330UeR) C08FF.LIZ(EnumC777330UeR.class, str);
    }

    public EnumC777330UeR(String str, int i, String str2) {
        this.LL = str2;
    }
}
