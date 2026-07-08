package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154120g8g {
    public static final /* synthetic */ EnumC1154120g8g[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154120g8g OTHERS;
    public static final EnumC1154120g8g TAKO_FRAGMENT;
    public static final EnumC1154120g8g TAKO_TEMPLATE_ACTIVITY;

    public static InterfaceC2044707zh<EnumC1154120g8g> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154120g8g enumC1154120g8g = new EnumC1154120g8g("TAKO_TEMPLATE_ACTIVITY", 0);
        TAKO_TEMPLATE_ACTIVITY = enumC1154120g8g;
        EnumC1154120g8g enumC1154120g8g2 = new EnumC1154120g8g("TAKO_FRAGMENT", 1);
        TAKO_FRAGMENT = enumC1154120g8g2;
        EnumC1154120g8g enumC1154120g8g3 = new EnumC1154120g8g("OTHERS", 2);
        OTHERS = enumC1154120g8g3;
        EnumC1154120g8g[] enumC1154120g8gArr = {enumC1154120g8g, enumC1154120g8g2, enumC1154120g8g3};
        LL = enumC1154120g8gArr;
        LLILLJJLI = new C2254308sP(enumC1154120g8gArr);
    }

    public static EnumC1154120g8g[] values() {
        return (EnumC1154120g8g[]) LL.clone();
    }

    public static EnumC1154120g8g valueOf(String str) {
        return (EnumC1154120g8g) C08FF.LIZ(EnumC1154120g8g.class, str);
    }

    public EnumC1154120g8g(String str, int i) {
    }
}
