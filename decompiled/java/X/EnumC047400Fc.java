package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Fc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC047400Fc {
    public static final EnumC047400Fc CLICKABLE_SPAN;
    public static final /* synthetic */ EnumC047400Fc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC047400Fc NEW_LINE;
    public static final EnumC047400Fc PURE_TEXT;
    public static final EnumC047400Fc SPACE;

    public static InterfaceC2044707zh<EnumC047400Fc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC047400Fc enumC047400Fc = new EnumC047400Fc("PURE_TEXT", 0);
        PURE_TEXT = enumC047400Fc;
        EnumC047400Fc enumC047400Fc2 = new EnumC047400Fc("CLICKABLE_SPAN", 1);
        CLICKABLE_SPAN = enumC047400Fc2;
        EnumC047400Fc enumC047400Fc3 = new EnumC047400Fc("NEW_LINE", 2);
        NEW_LINE = enumC047400Fc3;
        EnumC047400Fc enumC047400Fc4 = new EnumC047400Fc("SPACE", 3);
        SPACE = enumC047400Fc4;
        EnumC047400Fc[] enumC047400FcArr = {enumC047400Fc, enumC047400Fc2, enumC047400Fc3, enumC047400Fc4};
        LL = enumC047400FcArr;
        LLILLJJLI = new C2254308sP(enumC047400FcArr);
    }

    public static EnumC047400Fc[] values() {
        return (EnumC047400Fc[]) LL.clone();
    }

    public static EnumC047400Fc valueOf(String str) {
        return (EnumC047400Fc) C08FF.LIZ(EnumC047400Fc.class, str);
    }

    public EnumC047400Fc(String str, int i) {
    }
}
