package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h2y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1189020h2y {
    public static final /* synthetic */ EnumC1189020h2y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1189020h2y LYNXVIEW;
    public static final EnumC1189020h2y LYNXVIEW_POPUP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1189020h2y> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1189020h2y enumC1189020h2y = new EnumC1189020h2y("LYNXVIEW", 0, "lynxview");
        LYNXVIEW = enumC1189020h2y;
        EnumC1189020h2y enumC1189020h2y2 = new EnumC1189020h2y("LYNXVIEW_POPUP", 1, "lynxview_popup");
        LYNXVIEW_POPUP = enumC1189020h2y2;
        EnumC1189020h2y[] enumC1189020h2yArr = {enumC1189020h2y, enumC1189020h2y2};
        LLILLJJLI = enumC1189020h2yArr;
        LLILLL = new C2254308sP(enumC1189020h2yArr);
    }

    public static EnumC1189020h2y[] values() {
        return (EnumC1189020h2y[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1189020h2y valueOf(String str) {
        return (EnumC1189020h2y) C08FF.LIZ(EnumC1189020h2y.class, str);
    }

    public EnumC1189020h2y(String str, int i, String str2) {
        this.LL = str2;
    }
}
