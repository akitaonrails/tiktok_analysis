package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yAt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1847410yAt {
    public static final EnumC1847410yAt ICON;
    public static final /* synthetic */ EnumC1847410yAt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1847410yAt TEXT;

    public static InterfaceC2044707zh<EnumC1847410yAt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1847410yAt enumC1847410yAt = new EnumC1847410yAt("ICON", 0);
        ICON = enumC1847410yAt;
        EnumC1847410yAt enumC1847410yAt2 = new EnumC1847410yAt("TEXT", 1);
        TEXT = enumC1847410yAt2;
        EnumC1847410yAt[] enumC1847410yAtArr = {enumC1847410yAt, enumC1847410yAt2};
        LL = enumC1847410yAtArr;
        LLILLJJLI = new C2254308sP(enumC1847410yAtArr);
    }

    public static EnumC1847410yAt[] values() {
        return (EnumC1847410yAt[]) LL.clone();
    }

    public static EnumC1847410yAt valueOf(String str) {
        return (EnumC1847410yAt) C08FF.LIZ(EnumC1847410yAt.class, str);
    }

    public EnumC1847410yAt(String str, int i) {
    }
}
