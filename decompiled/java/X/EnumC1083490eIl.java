package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eIl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1083490eIl {
    public static final EnumC1083490eIl LEFT;
    public static final /* synthetic */ EnumC1083490eIl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1083490eIl RIGHT;

    public static InterfaceC2044707zh<EnumC1083490eIl> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1083490eIl enumC1083490eIl = new EnumC1083490eIl("LEFT", 0);
        LEFT = enumC1083490eIl;
        EnumC1083490eIl enumC1083490eIl2 = new EnumC1083490eIl("RIGHT", 1);
        RIGHT = enumC1083490eIl2;
        EnumC1083490eIl[] enumC1083490eIlArr = {enumC1083490eIl, enumC1083490eIl2};
        LL = enumC1083490eIlArr;
        LLILLJJLI = new C2254308sP(enumC1083490eIlArr);
    }

    public static EnumC1083490eIl[] values() {
        return (EnumC1083490eIl[]) LL.clone();
    }

    public static EnumC1083490eIl valueOf(String str) {
        return (EnumC1083490eIl) C08FF.LIZ(EnumC1083490eIl.class, str);
    }

    public EnumC1083490eIl(String str, int i) {
    }
}
