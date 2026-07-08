package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OzQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC637460OzQ {
    public static final EnumC637460OzQ CLICK_ALL;
    public static final EnumC637460OzQ CLICK_BUTTON;
    public static final EnumC637460OzQ CLICK_CLOSE;
    public static final EnumC637460OzQ HIGHLIGHT;
    public static final /* synthetic */ EnumC637460OzQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC637460OzQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC637460OzQ enumC637460OzQ = new EnumC637460OzQ("CLICK_ALL", 0, "all");
        CLICK_ALL = enumC637460OzQ;
        EnumC637460OzQ enumC637460OzQ2 = new EnumC637460OzQ("CLICK_BUTTON", 1, "button");
        CLICK_BUTTON = enumC637460OzQ2;
        EnumC637460OzQ enumC637460OzQ3 = new EnumC637460OzQ("CLICK_CLOSE", 2, "close");
        CLICK_CLOSE = enumC637460OzQ3;
        EnumC637460OzQ enumC637460OzQ4 = new EnumC637460OzQ("HIGHLIGHT", 3, "highlight");
        HIGHLIGHT = enumC637460OzQ4;
        EnumC637460OzQ[] enumC637460OzQArr = {enumC637460OzQ, enumC637460OzQ2, enumC637460OzQ3, enumC637460OzQ4};
        LLILLJJLI = enumC637460OzQArr;
        LLILLL = new C2254308sP(enumC637460OzQArr);
    }

    public static EnumC637460OzQ[] values() {
        return (EnumC637460OzQ[]) LLILLJJLI.clone();
    }

    public final String getEventName() {
        return this.LL;
    }

    public static EnumC637460OzQ valueOf(String str) {
        return (EnumC637460OzQ) C08FF.LIZ(EnumC637460OzQ.class, str);
    }

    public EnumC637460OzQ(String str, int i, String str2) {
        this.LL = str2;
    }
}
