package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dxb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356050Dxb {
    public static final EnumC356050Dxb AUTO_SUBTITLE;
    public static final EnumC356050Dxb COLLECTION;
    public static final EnumC356050Dxb IMAGE;
    public static final EnumC356050Dxb INFO;
    public static final /* synthetic */ EnumC356050Dxb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356050Dxb TEXT;

    public static InterfaceC2044707zh<EnumC356050Dxb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356050Dxb enumC356050Dxb = new EnumC356050Dxb("IMAGE", 0);
        IMAGE = enumC356050Dxb;
        EnumC356050Dxb enumC356050Dxb2 = new EnumC356050Dxb("TEXT", 1);
        TEXT = enumC356050Dxb2;
        EnumC356050Dxb enumC356050Dxb3 = new EnumC356050Dxb("INFO", 2);
        INFO = enumC356050Dxb3;
        EnumC356050Dxb enumC356050Dxb4 = new EnumC356050Dxb("AUTO_SUBTITLE", 3);
        AUTO_SUBTITLE = enumC356050Dxb4;
        EnumC356050Dxb enumC356050Dxb5 = new EnumC356050Dxb("COLLECTION", 4);
        COLLECTION = enumC356050Dxb5;
        EnumC356050Dxb[] enumC356050DxbArr = {enumC356050Dxb, enumC356050Dxb2, enumC356050Dxb3, enumC356050Dxb4, enumC356050Dxb5};
        LL = enumC356050DxbArr;
        LLILLJJLI = new C2254308sP(enumC356050DxbArr);
    }

    public static EnumC356050Dxb[] values() {
        return (EnumC356050Dxb[]) LL.clone();
    }

    public static EnumC356050Dxb valueOf(String str) {
        return (EnumC356050Dxb) C08FF.LIZ(EnumC356050Dxb.class, str);
    }

    public EnumC356050Dxb(String str, int i) {
    }
}
