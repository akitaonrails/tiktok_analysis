package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wVN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1783230wVN {
    public static final EnumC1783230wVN BACK_ARROW;
    public static final EnumC1783230wVN CLOSE_ICON;
    public static final EnumC1783230wVN COLLAPSE;
    public static final /* synthetic */ EnumC1783230wVN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1783230wVN NONE;

    public static InterfaceC2044707zh<EnumC1783230wVN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1783230wVN enumC1783230wVN = new EnumC1783230wVN("CLOSE_ICON", 0);
        CLOSE_ICON = enumC1783230wVN;
        EnumC1783230wVN enumC1783230wVN2 = new EnumC1783230wVN("BACK_ARROW", 1);
        BACK_ARROW = enumC1783230wVN2;
        EnumC1783230wVN enumC1783230wVN3 = new EnumC1783230wVN("COLLAPSE", 2);
        COLLAPSE = enumC1783230wVN3;
        EnumC1783230wVN enumC1783230wVN4 = new EnumC1783230wVN("NONE", 3);
        NONE = enumC1783230wVN4;
        EnumC1783230wVN[] enumC1783230wVNArr = {enumC1783230wVN, enumC1783230wVN2, enumC1783230wVN3, enumC1783230wVN4};
        LL = enumC1783230wVNArr;
        LLILLJJLI = new C2254308sP(enumC1783230wVNArr);
    }

    public static EnumC1783230wVN[] values() {
        return (EnumC1783230wVN[]) LL.clone();
    }

    public static EnumC1783230wVN valueOf(String str) {
        return (EnumC1783230wVN) C08FF.LIZ(EnumC1783230wVN.class, str);
    }

    public EnumC1783230wVN(String str, int i) {
    }
}
