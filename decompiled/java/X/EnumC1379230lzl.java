package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lzl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1379230lzl {
    public static final EnumC1379230lzl DISABLE;
    public static final EnumC1379230lzl HIDE;
    public static final /* synthetic */ EnumC1379230lzl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1379230lzl SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1379230lzl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1379230lzl enumC1379230lzl = new EnumC1379230lzl("SHOW", 0, "show");
        SHOW = enumC1379230lzl;
        EnumC1379230lzl enumC1379230lzl2 = new EnumC1379230lzl("HIDE", 1, "hide");
        HIDE = enumC1379230lzl2;
        EnumC1379230lzl enumC1379230lzl3 = new EnumC1379230lzl("DISABLE", 2, "disable");
        DISABLE = enumC1379230lzl3;
        EnumC1379230lzl[] enumC1379230lzlArr = {enumC1379230lzl, enumC1379230lzl2, enumC1379230lzl3};
        LLILLJJLI = enumC1379230lzlArr;
        LLILLL = new C2254308sP(enumC1379230lzlArr);
    }

    public static EnumC1379230lzl[] values() {
        return (EnumC1379230lzl[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1379230lzl valueOf(String str) {
        return (EnumC1379230lzl) C08FF.LIZ(EnumC1379230lzl.class, str);
    }

    public EnumC1379230lzl(String str, int i, String str2) {
        this.LL = str2;
    }
}
