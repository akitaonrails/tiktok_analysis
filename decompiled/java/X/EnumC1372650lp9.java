package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lp9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1372650lp9 {
    public static final /* synthetic */ EnumC1372650lp9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1372650lp9 NORMAL_SHARE;
    public static final EnumC1372650lp9 SCREENSHOT_SHARE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1372650lp9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1372650lp9 enumC1372650lp9 = new EnumC1372650lp9("SCREENSHOT_SHARE", 0, "screenshot_share");
        SCREENSHOT_SHARE = enumC1372650lp9;
        EnumC1372650lp9 enumC1372650lp92 = new EnumC1372650lp9("NORMAL_SHARE", 1, "normal_share");
        NORMAL_SHARE = enumC1372650lp92;
        EnumC1372650lp9[] enumC1372650lp9Arr = {enumC1372650lp9, enumC1372650lp92};
        LLILLJJLI = enumC1372650lp9Arr;
        LLILLL = new C2254308sP(enumC1372650lp9Arr);
    }

    public static EnumC1372650lp9[] values() {
        return (EnumC1372650lp9[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1372650lp9 valueOf(String str) {
        return (EnumC1372650lp9) C08FF.LIZ(EnumC1372650lp9.class, str);
    }

    public EnumC1372650lp9(String str, int i, String str2) {
        this.LL = str2;
    }
}
