package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0q4w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1536200q4w {
    public static final EnumC1536200q4w FIRST_JUMP_BYPASS;
    public static final EnumC1536200q4w ISOLATED_WEBVIEW;
    public static final /* synthetic */ EnumC1536200q4w[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1536200q4w SINGLE_PAGE_BYPASS;
    public static final EnumC1536200q4w THIRD_INITIAL_PAGE_BYPASS;
    public static final EnumC1536200q4w THIRD_PARTY_URL;

    public static InterfaceC2044707zh<EnumC1536200q4w> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1536200q4w enumC1536200q4w = new EnumC1536200q4w("ISOLATED_WEBVIEW", 0);
        ISOLATED_WEBVIEW = enumC1536200q4w;
        EnumC1536200q4w enumC1536200q4w2 = new EnumC1536200q4w("SINGLE_PAGE_BYPASS", 1);
        SINGLE_PAGE_BYPASS = enumC1536200q4w2;
        EnumC1536200q4w enumC1536200q4w3 = new EnumC1536200q4w("THIRD_INITIAL_PAGE_BYPASS", 2);
        THIRD_INITIAL_PAGE_BYPASS = enumC1536200q4w3;
        EnumC1536200q4w enumC1536200q4w4 = new EnumC1536200q4w("FIRST_JUMP_BYPASS", 3);
        FIRST_JUMP_BYPASS = enumC1536200q4w4;
        EnumC1536200q4w enumC1536200q4w5 = new EnumC1536200q4w("THIRD_PARTY_URL", 4);
        THIRD_PARTY_URL = enumC1536200q4w5;
        EnumC1536200q4w[] enumC1536200q4wArr = {enumC1536200q4w, enumC1536200q4w2, enumC1536200q4w3, enumC1536200q4w4, enumC1536200q4w5};
        LL = enumC1536200q4wArr;
        LLILLJJLI = new C2254308sP(enumC1536200q4wArr);
    }

    public static EnumC1536200q4w[] values() {
        return (EnumC1536200q4w[]) LL.clone();
    }

    public static EnumC1536200q4w valueOf(String str) {
        return (EnumC1536200q4w) C08FF.LIZ(EnumC1536200q4w.class, str);
    }

    public EnumC1536200q4w(String str, int i) {
    }
}
