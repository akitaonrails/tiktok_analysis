package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0s2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1611690s2h {
    public static final EnumC1611690s2h DETAIL;
    public static final /* synthetic */ EnumC1611690s2h[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1611690s2h TAB;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1611690s2h> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1611690s2h enumC1611690s2h = new EnumC1611690s2h("TAB", 0, "tab");
        TAB = enumC1611690s2h;
        EnumC1611690s2h enumC1611690s2h2 = new EnumC1611690s2h("DETAIL", 1, "detail");
        DETAIL = enumC1611690s2h2;
        EnumC1611690s2h[] enumC1611690s2hArr = {enumC1611690s2h, enumC1611690s2h2};
        LLILLJJLI = enumC1611690s2hArr;
        LLILLL = new C2254308sP(enumC1611690s2hArr);
    }

    public static EnumC1611690s2h[] values() {
        return (EnumC1611690s2h[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1611690s2h valueOf(String str) {
        return (EnumC1611690s2h) C08FF.LIZ(EnumC1611690s2h.class, str);
    }

    public EnumC1611690s2h(String str, int i, String str2) {
        this.LL = str2;
    }
}
