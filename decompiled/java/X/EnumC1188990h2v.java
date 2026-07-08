package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1188990h2v {
    public static final EnumC1188990h2v CARD;
    public static final /* synthetic */ EnumC1188990h2v[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1188990h2v PAGE;
    public static final EnumC1188990h2v SHEET;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1188990h2v> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1188990h2v enumC1188990h2v = new EnumC1188990h2v("CARD", 0, "card");
        CARD = enumC1188990h2v;
        EnumC1188990h2v enumC1188990h2v2 = new EnumC1188990h2v("PAGE", 1, "page");
        PAGE = enumC1188990h2v2;
        EnumC1188990h2v enumC1188990h2v3 = new EnumC1188990h2v("SHEET", 2, "sheet");
        SHEET = enumC1188990h2v3;
        EnumC1188990h2v[] enumC1188990h2vArr = {enumC1188990h2v, enumC1188990h2v2, enumC1188990h2v3};
        LLILLJJLI = enumC1188990h2vArr;
        LLILLL = new C2254308sP(enumC1188990h2vArr);
    }

    public static EnumC1188990h2v[] values() {
        return (EnumC1188990h2v[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1188990h2v valueOf(String str) {
        return (EnumC1188990h2v) C08FF.LIZ(EnumC1188990h2v.class, str);
    }

    public EnumC1188990h2v(String str, int i, String str2) {
        this.LL = str2;
    }
}
