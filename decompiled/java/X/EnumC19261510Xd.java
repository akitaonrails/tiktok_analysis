package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10Xd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19261510Xd {
    public static final EnumC19261510Xd DEEP_LINK;
    public static final /* synthetic */ EnumC19261510Xd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19261510Xd MAIN;
    public static final EnumC19261510Xd NONE;
    public static final EnumC19261510Xd OPEN_SHARE;
    public static final EnumC19261510Xd SHORTCUT;
    public static final EnumC19261510Xd WIDGET;
    public final String LL;

    public static InterfaceC2044707zh<EnumC19261510Xd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19261510Xd enumC19261510Xd = new EnumC19261510Xd("MAIN", 0, "enter_launch");
        MAIN = enumC19261510Xd;
        EnumC19261510Xd enumC19261510Xd2 = new EnumC19261510Xd("DEEP_LINK", 1, "deep_link");
        DEEP_LINK = enumC19261510Xd2;
        EnumC19261510Xd enumC19261510Xd3 = new EnumC19261510Xd("SHORTCUT", 2, "client_shortcut");
        SHORTCUT = enumC19261510Xd3;
        EnumC19261510Xd enumC19261510Xd4 = new EnumC19261510Xd("WIDGET", 3, "client_widget");
        WIDGET = enumC19261510Xd4;
        EnumC19261510Xd enumC19261510Xd5 = new EnumC19261510Xd("OPEN_SHARE", 4, "open_share");
        OPEN_SHARE = enumC19261510Xd5;
        EnumC19261510Xd enumC19261510Xd6 = new EnumC19261510Xd("NONE", 5, "none");
        NONE = enumC19261510Xd6;
        EnumC19261510Xd[] enumC19261510XdArr = {enumC19261510Xd, enumC19261510Xd2, enumC19261510Xd3, enumC19261510Xd4, enumC19261510Xd5, enumC19261510Xd6};
        LLILLJJLI = enumC19261510XdArr;
        LLILLL = new C2254308sP(enumC19261510XdArr);
    }

    public static EnumC19261510Xd[] values() {
        return (EnumC19261510Xd[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC19261510Xd valueOf(String str) {
        return (EnumC19261510Xd) C08FF.LIZ(EnumC19261510Xd.class, str);
    }

    public EnumC19261510Xd(String str, int i, String str2) {
        this.LL = str2;
    }
}
