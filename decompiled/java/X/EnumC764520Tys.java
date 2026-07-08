package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Tys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC764520Tys {
    public static final EnumC764520Tys LIBRARY;
    public static final /* synthetic */ EnumC764520Tys[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC764520Tys QUEUE;
    public static final EnumC764520Tys REQUEST;
    public static final EnumC764520Tys SETTING;

    public static InterfaceC2044707zh<EnumC764520Tys> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC764520Tys enumC764520Tys = new EnumC764520Tys("LIBRARY", 0);
        LIBRARY = enumC764520Tys;
        EnumC764520Tys enumC764520Tys2 = new EnumC764520Tys("SETTING", 1);
        SETTING = enumC764520Tys2;
        EnumC764520Tys enumC764520Tys3 = new EnumC764520Tys("QUEUE", 2);
        QUEUE = enumC764520Tys3;
        EnumC764520Tys enumC764520Tys4 = new EnumC764520Tys("REQUEST", 3);
        REQUEST = enumC764520Tys4;
        EnumC764520Tys[] enumC764520TysArr = {enumC764520Tys, enumC764520Tys2, enumC764520Tys3, enumC764520Tys4};
        LL = enumC764520TysArr;
        LLILLJJLI = new C2254308sP(enumC764520TysArr);
    }

    public static EnumC764520Tys[] values() {
        return (EnumC764520Tys[]) LL.clone();
    }

    public static EnumC764520Tys valueOf(String str) {
        return (EnumC764520Tys) C08FF.LIZ(EnumC764520Tys.class, str);
    }

    public EnumC764520Tys(String str, int i) {
    }
}
