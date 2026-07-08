package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DNs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC338220DNs {
    public static final EnumC338220DNs CLICK_BACK;
    public static final EnumC338220DNs CLICK_RESEND;
    public static final EnumC338220DNs ENTER_CODE;
    public static final /* synthetic */ EnumC338220DNs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC338220DNs SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC338220DNs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC338220DNs enumC338220DNs = new EnumC338220DNs("SHOW", 0, "show");
        SHOW = enumC338220DNs;
        EnumC338220DNs enumC338220DNs2 = new EnumC338220DNs("CLICK_RESEND", 1, "click_resend");
        CLICK_RESEND = enumC338220DNs2;
        EnumC338220DNs enumC338220DNs3 = new EnumC338220DNs("CLICK_BACK", 2, "click_back");
        CLICK_BACK = enumC338220DNs3;
        EnumC338220DNs enumC338220DNs4 = new EnumC338220DNs("ENTER_CODE", 3, "enter_code");
        ENTER_CODE = enumC338220DNs4;
        EnumC338220DNs[] enumC338220DNsArr = {enumC338220DNs, enumC338220DNs2, enumC338220DNs3, enumC338220DNs4};
        LLILLJJLI = enumC338220DNsArr;
        LLILLL = new C2254308sP(enumC338220DNsArr);
    }

    public static EnumC338220DNs[] values() {
        return (EnumC338220DNs[]) LLILLJJLI.clone();
    }

    public final String getParamValue() {
        return this.LL;
    }

    public static EnumC338220DNs valueOf(String str) {
        return (EnumC338220DNs) C08FF.LIZ(EnumC338220DNs.class, str);
    }

    public EnumC338220DNs(String str, int i, String str2) {
        this.LL = str2;
    }
}
