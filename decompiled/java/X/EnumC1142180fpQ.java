package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fpQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1142180fpQ {
    public static final /* synthetic */ EnumC1142180fpQ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1142180fpQ PANEL_ITEM;
    public static final EnumC1142180fpQ SECONDARY_PAGE;
    public static final EnumC1142180fpQ TOP_BANNER;
    public static final EnumC1142180fpQ UNKNOWN;

    public static InterfaceC2044707zh<EnumC1142180fpQ> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1142180fpQ enumC1142180fpQ = new EnumC1142180fpQ("PANEL_ITEM", 0);
        PANEL_ITEM = enumC1142180fpQ;
        EnumC1142180fpQ enumC1142180fpQ2 = new EnumC1142180fpQ("TOP_BANNER", 1);
        TOP_BANNER = enumC1142180fpQ2;
        EnumC1142180fpQ enumC1142180fpQ3 = new EnumC1142180fpQ("SECONDARY_PAGE", 2);
        SECONDARY_PAGE = enumC1142180fpQ3;
        EnumC1142180fpQ enumC1142180fpQ4 = new EnumC1142180fpQ("UNKNOWN", 3);
        UNKNOWN = enumC1142180fpQ4;
        EnumC1142180fpQ[] enumC1142180fpQArr = {enumC1142180fpQ, enumC1142180fpQ2, enumC1142180fpQ3, enumC1142180fpQ4};
        LL = enumC1142180fpQArr;
        LLILLJJLI = new C2254308sP(enumC1142180fpQArr);
    }

    public static EnumC1142180fpQ[] values() {
        return (EnumC1142180fpQ[]) LL.clone();
    }

    public static EnumC1142180fpQ valueOf(String str) {
        return (EnumC1142180fpQ) C08FF.LIZ(EnumC1142180fpQ.class, str);
    }

    public EnumC1142180fpQ(String str, int i) {
    }
}
