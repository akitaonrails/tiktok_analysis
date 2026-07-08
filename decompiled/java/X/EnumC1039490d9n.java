package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0d9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1039490d9n {
    public static final EnumC1039490d9n ADOBE_SESSION_START;
    public static final EnumC1039490d9n CLICK_ON_LOAD;
    public static final EnumC1039490d9n DEFAULT_SESSION_START;
    public static final EnumC1039490d9n GA_SESSION_START;
    public static final /* synthetic */ EnumC1039490d9n[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1039490d9n LOAD_FINISH;
    public static final EnumC1039490d9n LOAD_URL;
    public static final EnumC1039490d9n VIEW_EXPOSE_CALLBACK;
    public static final EnumC1039490d9n VIEW_HIDE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1039490d9n> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1039490d9n enumC1039490d9n = new EnumC1039490d9n("VIEW_EXPOSE_CALLBACK", 0, "exposeCallBack");
        VIEW_EXPOSE_CALLBACK = enumC1039490d9n;
        EnumC1039490d9n enumC1039490d9n2 = new EnumC1039490d9n("VIEW_HIDE", 1, "close");
        VIEW_HIDE = enumC1039490d9n2;
        EnumC1039490d9n enumC1039490d9n3 = new EnumC1039490d9n("LOAD_FINISH", 2, "loadFinish");
        LOAD_FINISH = enumC1039490d9n3;
        EnumC1039490d9n enumC1039490d9n4 = new EnumC1039490d9n("CLICK_ON_LOAD", 3, "clickOnLoad");
        CLICK_ON_LOAD = enumC1039490d9n4;
        EnumC1039490d9n enumC1039490d9n5 = new EnumC1039490d9n("LOAD_URL", 4, "loadUrl");
        LOAD_URL = enumC1039490d9n5;
        EnumC1039490d9n enumC1039490d9n6 = new EnumC1039490d9n("GA_SESSION_START", 5, "gaSession");
        GA_SESSION_START = enumC1039490d9n6;
        EnumC1039490d9n enumC1039490d9n7 = new EnumC1039490d9n("ADOBE_SESSION_START", 6, "adobeSession");
        ADOBE_SESSION_START = enumC1039490d9n7;
        EnumC1039490d9n enumC1039490d9n8 = new EnumC1039490d9n("DEFAULT_SESSION_START", 7, "defaultSession");
        DEFAULT_SESSION_START = enumC1039490d9n8;
        EnumC1039490d9n[] enumC1039490d9nArr = {enumC1039490d9n, enumC1039490d9n2, enumC1039490d9n3, enumC1039490d9n4, enumC1039490d9n5, enumC1039490d9n6, enumC1039490d9n7, enumC1039490d9n8};
        LLILLJJLI = enumC1039490d9nArr;
        LLILLL = new C2254308sP(enumC1039490d9nArr);
    }

    public static EnumC1039490d9n[] values() {
        return (EnumC1039490d9n[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1039490d9n valueOf(String str) {
        return (EnumC1039490d9n) C08FF.LIZ(EnumC1039490d9n.class, str);
    }

    public EnumC1039490d9n(String str, int i, String str2) {
        this.LL = str2;
    }
}
