package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hH2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1197740hH2 {
    public static final /* synthetic */ EnumC1197740hH2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1197740hH2 RECOMMEND;
    public static final EnumC1197740hH2 SEARCH;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1197740hH2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1197740hH2 enumC1197740hH2 = new EnumC1197740hH2("RECOMMEND", 0, 0);
        RECOMMEND = enumC1197740hH2;
        EnumC1197740hH2 enumC1197740hH22 = new EnumC1197740hH2("SEARCH", 1, 1);
        SEARCH = enumC1197740hH22;
        EnumC1197740hH2[] enumC1197740hH2Arr = {enumC1197740hH2, enumC1197740hH22};
        LLILLJJLI = enumC1197740hH2Arr;
        LLILLL = new C2254308sP(enumC1197740hH2Arr);
    }

    public static EnumC1197740hH2[] values() {
        return (EnumC1197740hH2[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC1197740hH2 valueOf(String str) {
        return (EnumC1197740hH2) C08FF.LIZ(EnumC1197740hH2.class, str);
    }

    public EnumC1197740hH2(String str, int i, int i2) {
        this.LL = i2;
    }
}
