package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rLo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1585100rLo {
    public static final EnumC1585100rLo BOTTOM_TAB;
    public static final /* synthetic */ EnumC1585100rLo[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1585100rLo TOP_ICON;
    public static final EnumC1585100rLo TOP_TAB;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1585100rLo> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1585100rLo enumC1585100rLo = new EnumC1585100rLo("TOP_TAB", 0, "top_tab");
        TOP_TAB = enumC1585100rLo;
        EnumC1585100rLo enumC1585100rLo2 = new EnumC1585100rLo("BOTTOM_TAB", 1, "bottom_tab");
        BOTTOM_TAB = enumC1585100rLo2;
        EnumC1585100rLo enumC1585100rLo3 = new EnumC1585100rLo("TOP_ICON", 2, "top_icon");
        TOP_ICON = enumC1585100rLo3;
        EnumC1585100rLo[] enumC1585100rLoArr = {enumC1585100rLo, enumC1585100rLo2, enumC1585100rLo3};
        LLILLJJLI = enumC1585100rLoArr;
        LLILLL = new C2254308sP(enumC1585100rLoArr);
    }

    public static EnumC1585100rLo[] values() {
        return (EnumC1585100rLo[]) LLILLJJLI.clone();
    }

    public final String getPartStr() {
        return this.LL;
    }

    public static EnumC1585100rLo valueOf(String str) {
        return (EnumC1585100rLo) C08FF.LIZ(EnumC1585100rLo.class, str);
    }

    public EnumC1585100rLo(String str, int i, String str2) {
        this.LL = str2;
    }
}
