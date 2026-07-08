package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Fv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC813703Fv {
    public static final EnumC813703Fv HORIZONTAL;
    public static final /* synthetic */ EnumC813703Fv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC813703Fv VERTICAL;

    public static InterfaceC2044707zh<EnumC813703Fv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC813703Fv enumC813703Fv = new EnumC813703Fv("HORIZONTAL", 0);
        HORIZONTAL = enumC813703Fv;
        EnumC813703Fv enumC813703Fv2 = new EnumC813703Fv("VERTICAL", 1);
        VERTICAL = enumC813703Fv2;
        EnumC813703Fv[] enumC813703FvArr = {enumC813703Fv, enumC813703Fv2};
        LL = enumC813703FvArr;
        LLILLJJLI = new C2254308sP(enumC813703FvArr);
    }

    public static EnumC813703Fv[] values() {
        return (EnumC813703Fv[]) LL.clone();
    }

    public static EnumC813703Fv valueOf(String str) {
        return (EnumC813703Fv) C08FF.LIZ(EnumC813703Fv.class, str);
    }

    public EnumC813703Fv(String str, int i) {
    }
}
