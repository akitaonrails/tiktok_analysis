package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18Vl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21295518Vl {
    public static final EnumC21295518Vl ADD;
    public static final /* synthetic */ EnumC21295518Vl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21295518Vl REPLACE;

    public static InterfaceC2044707zh<EnumC21295518Vl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC21295518Vl enumC21295518Vl = new EnumC21295518Vl("REPLACE", 0);
        REPLACE = enumC21295518Vl;
        EnumC21295518Vl enumC21295518Vl2 = new EnumC21295518Vl("ADD", 1);
        ADD = enumC21295518Vl2;
        EnumC21295518Vl[] enumC21295518VlArr = {enumC21295518Vl, enumC21295518Vl2};
        LL = enumC21295518VlArr;
        LLILLJJLI = new C2254308sP(enumC21295518VlArr);
    }

    public static EnumC21295518Vl[] values() {
        return (EnumC21295518Vl[]) LL.clone();
    }

    public static EnumC21295518Vl valueOf(String str) {
        return (EnumC21295518Vl) C08FF.LIZ(EnumC21295518Vl.class, str);
    }

    public EnumC21295518Vl(String str, int i) {
    }
}
