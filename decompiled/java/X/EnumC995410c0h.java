package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995410c0h {
    public static final EnumC995410c0h Assembler;
    public static final EnumC995410c0h Content;
    public static final EnumC995410c0h Footer;
    public static final EnumC995410c0h Keyboard;
    public static final /* synthetic */ EnumC995410c0h[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC995410c0h Novel;
    public static final EnumC995410c0h Scroll;
    public static final EnumC995410c0h VM;
    public final String LL;

    public static InterfaceC2044707zh<EnumC995410c0h> getEntries() {
        return LLILLL;
    }

    static {
        EnumC995410c0h enumC995410c0h = new EnumC995410c0h("Assembler", 0, "Assembler");
        Assembler = enumC995410c0h;
        EnumC995410c0h enumC995410c0h2 = new EnumC995410c0h("Footer", 1, "Footer");
        Footer = enumC995410c0h2;
        EnumC995410c0h enumC995410c0h3 = new EnumC995410c0h("Scroll", 2, "Scroll");
        Scroll = enumC995410c0h3;
        EnumC995410c0h enumC995410c0h4 = new EnumC995410c0h("Keyboard", 3, "Keyboard");
        Keyboard = enumC995410c0h4;
        EnumC995410c0h enumC995410c0h5 = new EnumC995410c0h("Content", 4, "Content");
        Content = enumC995410c0h5;
        EnumC995410c0h enumC995410c0h6 = new EnumC995410c0h("VM", 5, "VM");
        VM = enumC995410c0h6;
        EnumC995410c0h enumC995410c0h7 = new EnumC995410c0h("Novel", 6, "Novel");
        Novel = enumC995410c0h7;
        EnumC995410c0h[] enumC995410c0hArr = {enumC995410c0h, enumC995410c0h2, enumC995410c0h3, enumC995410c0h4, enumC995410c0h5, enumC995410c0h6, enumC995410c0h7};
        LLILLJJLI = enumC995410c0hArr;
        LLILLL = new C2254308sP(enumC995410c0hArr);
    }

    public static EnumC995410c0h[] values() {
        return (EnumC995410c0h[]) LLILLJJLI.clone();
    }

    public final String getLabel() {
        return this.LL;
    }

    public static EnumC995410c0h valueOf(String str) {
        return (EnumC995410c0h) C08FF.LIZ(EnumC995410c0h.class, str);
    }

    public EnumC995410c0h(String str, int i, String str2) {
        this.LL = str2;
    }
}
