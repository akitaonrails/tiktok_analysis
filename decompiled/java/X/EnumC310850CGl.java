package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CGl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC310850CGl {
    public static final /* synthetic */ EnumC310850CGl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC310850CGl MINIMAL;
    public static final EnumC310850CGl NORMAL;

    public static InterfaceC2044707zh<EnumC310850CGl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC310850CGl enumC310850CGl = new EnumC310850CGl("NORMAL", 0);
        NORMAL = enumC310850CGl;
        EnumC310850CGl enumC310850CGl2 = new EnumC310850CGl("MINIMAL", 1);
        MINIMAL = enumC310850CGl2;
        EnumC310850CGl[] enumC310850CGlArr = {enumC310850CGl, enumC310850CGl2};
        LL = enumC310850CGlArr;
        LLILLJJLI = new C2254308sP(enumC310850CGlArr);
    }

    public static EnumC310850CGl[] values() {
        return (EnumC310850CGl[]) LL.clone();
    }

    public static EnumC310850CGl valueOf(String str) {
        return (EnumC310850CGl) C08FF.LIZ(EnumC310850CGl.class, str);
    }

    public EnumC310850CGl(String str, int i) {
    }
}
