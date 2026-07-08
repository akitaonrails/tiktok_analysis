package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0erl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1105190erl {
    public static final /* synthetic */ EnumC1105190erl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1105190erl OPEN_LYNX_PAGE;
    public static final EnumC1105190erl OPEN_WEBVIEW_PAGE;
    public final C1ET4 LL;

    public static InterfaceC2044707zh<EnumC1105190erl> getEntries() {
        return LLILLL;
    }

    static {
        C1ET4 c1et4 = C1ET4.DY_TAB_LIVING_LOAD;
        EnumC1105190erl enumC1105190erl = new EnumC1105190erl("OPEN_LYNX_PAGE", 0, c1et4);
        OPEN_LYNX_PAGE = enumC1105190erl;
        EnumC1105190erl enumC1105190erl2 = new EnumC1105190erl("OPEN_WEBVIEW_PAGE", 1, c1et4);
        OPEN_WEBVIEW_PAGE = enumC1105190erl2;
        EnumC1105190erl[] enumC1105190erlArr = {enumC1105190erl, enumC1105190erl2};
        LLILLJJLI = enumC1105190erlArr;
        LLILLL = new C2254308sP(enumC1105190erlArr);
    }

    public static EnumC1105190erl[] values() {
        return (EnumC1105190erl[]) LLILLJJLI.clone();
    }

    public final C1ET4 getTargetScene() {
        return this.LL;
    }

    public static EnumC1105190erl valueOf(String str) {
        return (EnumC1105190erl) C08FF.LIZ(EnumC1105190erl.class, str);
    }

    public EnumC1105190erl(String str, int i, C1ET4 c1et4) {
        this.LL = c1et4;
    }
}
