package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h93, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1192790h93 {
    public static final EnumC1192790h93 CLOSE_AND_REFRESH;
    public static final EnumC1192790h93 CLOSE_PAGE;
    public static final /* synthetic */ EnumC1192790h93[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1192790h93 NONE;
    public static final EnumC1192790h93 REDIRECT;
    public static final EnumC1192790h93 REFRESH;
    public static final EnumC1192790h93 RESUBMIT_ORDER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1192790h93> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1192790h93 enumC1192790h93 = new EnumC1192790h93("NONE", 0, 0);
        NONE = enumC1192790h93;
        EnumC1192790h93 enumC1192790h932 = new EnumC1192790h93("CLOSE_PAGE", 1, 1);
        CLOSE_PAGE = enumC1192790h932;
        EnumC1192790h93 enumC1192790h933 = new EnumC1192790h93("CLOSE_AND_REFRESH", 2, 2);
        CLOSE_AND_REFRESH = enumC1192790h933;
        EnumC1192790h93 enumC1192790h934 = new EnumC1192790h93("REFRESH", 3, 3);
        REFRESH = enumC1192790h934;
        EnumC1192790h93 enumC1192790h935 = new EnumC1192790h93("REDIRECT", 4, 4);
        REDIRECT = enumC1192790h935;
        EnumC1192790h93 enumC1192790h936 = new EnumC1192790h93("RESUBMIT_ORDER", 5, 5);
        RESUBMIT_ORDER = enumC1192790h936;
        EnumC1192790h93[] enumC1192790h93Arr = {enumC1192790h93, enumC1192790h932, enumC1192790h933, enumC1192790h934, enumC1192790h935, enumC1192790h936};
        LLILLJJLI = enumC1192790h93Arr;
        LLILLL = new C2254308sP(enumC1192790h93Arr);
    }

    public static EnumC1192790h93[] values() {
        return (EnumC1192790h93[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1192790h93 valueOf(String str) {
        return (EnumC1192790h93) C08FF.LIZ(EnumC1192790h93.class, str);
    }

    public EnumC1192790h93(String str, int i, int i2) {
        this.LL = i2;
    }
}
