package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fdv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1135050fdv {
    public static final EnumC1135050fdv HIDE;
    public static final EnumC1135050fdv HIDING;
    public static final /* synthetic */ EnumC1135050fdv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1135050fdv SHOW;
    public static final EnumC1135050fdv SHOWING;

    public static InterfaceC2044707zh<EnumC1135050fdv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1135050fdv enumC1135050fdv = new EnumC1135050fdv("HIDE", 0);
        HIDE = enumC1135050fdv;
        EnumC1135050fdv enumC1135050fdv2 = new EnumC1135050fdv("SHOW", 1);
        SHOW = enumC1135050fdv2;
        EnumC1135050fdv enumC1135050fdv3 = new EnumC1135050fdv("HIDING", 2);
        HIDING = enumC1135050fdv3;
        EnumC1135050fdv enumC1135050fdv4 = new EnumC1135050fdv("SHOWING", 3);
        SHOWING = enumC1135050fdv4;
        EnumC1135050fdv[] enumC1135050fdvArr = {enumC1135050fdv, enumC1135050fdv2, enumC1135050fdv3, enumC1135050fdv4};
        LL = enumC1135050fdvArr;
        LLILLJJLI = new C2254308sP(enumC1135050fdvArr);
    }

    public static EnumC1135050fdv[] values() {
        return (EnumC1135050fdv[]) LL.clone();
    }

    public static EnumC1135050fdv valueOf(String str) {
        return (EnumC1135050fdv) C08FF.LIZ(EnumC1135050fdv.class, str);
    }

    public EnumC1135050fdv(String str, int i) {
    }
}
