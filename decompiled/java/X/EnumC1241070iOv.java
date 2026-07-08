package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iOv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1241070iOv {
    public static final EnumC1241070iOv FAIL;
    public static final EnumC1241070iOv INIT;
    public static final /* synthetic */ EnumC1241070iOv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1241070iOv LOADING;
    public static final EnumC1241070iOv NO_RESULT;
    public static final EnumC1241070iOv SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1241070iOv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1241070iOv enumC1241070iOv = new EnumC1241070iOv("INIT", 0, "init");
        INIT = enumC1241070iOv;
        EnumC1241070iOv enumC1241070iOv2 = new EnumC1241070iOv("LOADING", 1, "loading");
        LOADING = enumC1241070iOv2;
        EnumC1241070iOv enumC1241070iOv3 = new EnumC1241070iOv("SUCCESS", 2, "success");
        SUCCESS = enumC1241070iOv3;
        EnumC1241070iOv enumC1241070iOv4 = new EnumC1241070iOv("NO_RESULT", 3, "no_result");
        NO_RESULT = enumC1241070iOv4;
        EnumC1241070iOv enumC1241070iOv5 = new EnumC1241070iOv("FAIL", 4, "fail");
        FAIL = enumC1241070iOv5;
        EnumC1241070iOv[] enumC1241070iOvArr = {enumC1241070iOv, enumC1241070iOv2, enumC1241070iOv3, enumC1241070iOv4, enumC1241070iOv5};
        LLILLJJLI = enumC1241070iOvArr;
        LLILLL = new C2254308sP(enumC1241070iOvArr);
    }

    public static EnumC1241070iOv[] values() {
        return (EnumC1241070iOv[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1241070iOv valueOf(String str) {
        return (EnumC1241070iOv) C08FF.LIZ(EnumC1241070iOv.class, str);
    }

    public EnumC1241070iOv(String str, int i, String str2) {
        this.LL = str2;
    }
}
