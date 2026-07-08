package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zOa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1894340zOa {
    public static final /* synthetic */ EnumC1894340zOa[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1894340zOa TAB_COIN;
    public static final EnumC1894340zOa TAB_PUBLISH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1894340zOa> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1894340zOa enumC1894340zOa = new EnumC1894340zOa("TAB_COIN", 0, "incentive");
        TAB_COIN = enumC1894340zOa;
        EnumC1894340zOa enumC1894340zOa2 = new EnumC1894340zOa("TAB_PUBLISH", 1, "publish");
        TAB_PUBLISH = enumC1894340zOa2;
        EnumC1894340zOa[] enumC1894340zOaArr = {enumC1894340zOa, enumC1894340zOa2};
        LLILLJJLI = enumC1894340zOaArr;
        LLILLL = new C2254308sP(enumC1894340zOaArr);
    }

    public static EnumC1894340zOa[] values() {
        return (EnumC1894340zOa[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1894340zOa valueOf(String str) {
        return (EnumC1894340zOa) C08FF.LIZ(EnumC1894340zOa.class, str);
    }

    public EnumC1894340zOa(String str, int i, String str2) {
        this.LL = str2;
    }
}
