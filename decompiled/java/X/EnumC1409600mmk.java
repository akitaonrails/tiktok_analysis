package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mmk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1409600mmk {
    public static final C1409610mml Companion;
    public static final EnumC1409600mmk IDEAS;
    public static final /* synthetic */ EnumC1409600mmk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1409600mmk NONE;
    public static final EnumC1409600mmk TITLE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1409600mmk> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0mml] */
    static {
        EnumC1409600mmk enumC1409600mmk = new EnumC1409600mmk("TITLE", 0, "title_ideas");
        TITLE = enumC1409600mmk;
        EnumC1409600mmk enumC1409600mmk2 = new EnumC1409600mmk("IDEAS", 1, "writing_ideas");
        IDEAS = enumC1409600mmk2;
        EnumC1409600mmk enumC1409600mmk3 = new EnumC1409600mmk("NONE", 2, "none");
        NONE = enumC1409600mmk3;
        EnumC1409600mmk[] enumC1409600mmkArr = {enumC1409600mmk, enumC1409600mmk2, enumC1409600mmk3};
        LLILLJJLI = enumC1409600mmkArr;
        LLILLL = new C2254308sP(enumC1409600mmkArr);
        Companion = new Object() { // from class: X.0mml
        };
    }

    public static EnumC1409600mmk[] values() {
        return (EnumC1409600mmk[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1409600mmk valueOf(String str) {
        return (EnumC1409600mmk) C08FF.LIZ(EnumC1409600mmk.class, str);
    }

    public EnumC1409600mmk(String str, int i, String str2) {
        this.LL = str2;
    }
}
