package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1000540c8y implements InterfaceC593520NPq<String> {
    public static final EnumC1000540c8y BOTTOM_CARD;
    public static final EnumC1000540c8y DESCRIPTIVE_CARD;
    public static final EnumC1000540c8y EMPTY;
    public static final /* synthetic */ EnumC1000540c8y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1000540c8y TOP_CARD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1000540c8y> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1000540c8y enumC1000540c8y = new EnumC1000540c8y("EMPTY", 0, "empty");
        EMPTY = enumC1000540c8y;
        EnumC1000540c8y enumC1000540c8y2 = new EnumC1000540c8y("TOP_CARD", 1, "top_card");
        TOP_CARD = enumC1000540c8y2;
        EnumC1000540c8y enumC1000540c8y3 = new EnumC1000540c8y("BOTTOM_CARD", 2, "bottom_card");
        BOTTOM_CARD = enumC1000540c8y3;
        EnumC1000540c8y enumC1000540c8y4 = new EnumC1000540c8y("DESCRIPTIVE_CARD", 3, "descriptive_card");
        DESCRIPTIVE_CARD = enumC1000540c8y4;
        EnumC1000540c8y[] enumC1000540c8yArr = {enumC1000540c8y, enumC1000540c8y2, enumC1000540c8y3, enumC1000540c8y4};
        LLILLJJLI = enumC1000540c8yArr;
        LLILLL = new C2254308sP(enumC1000540c8yArr);
    }

    public static EnumC1000540c8y[] values() {
        return (EnumC1000540c8y[]) LLILLJJLI.clone();
    }

    @Override // X.InterfaceC593520NPq
    public String getParamValue() {
        return this.LL;
    }

    public static EnumC1000540c8y valueOf(String str) {
        return (EnumC1000540c8y) C08FF.LIZ(EnumC1000540c8y.class, str);
    }

    public EnumC1000540c8y(String str, int i, String str2) {
        this.LL = str2;
    }
}
