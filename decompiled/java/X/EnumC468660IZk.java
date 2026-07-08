package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IZk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC468660IZk {
    public static final EnumC468660IZk LL;
    public static final EnumC468660IZk LLILLJJLI;
    public static final EnumC468660IZk LLILLL;
    public static final EnumC468660IZk LLILZ;
    public static final /* synthetic */ EnumC468660IZk[] LLILZIL;

    static {
        EnumC468660IZk enumC468660IZk = new EnumC468660IZk("NOT_ADDED", 0);
        LL = enumC468660IZk;
        EnumC468660IZk enumC468660IZk2 = new EnumC468660IZk("ADDING", 1);
        LLILLJJLI = enumC468660IZk2;
        EnumC468660IZk enumC468660IZk3 = new EnumC468660IZk("ADDED", 2);
        LLILLL = enumC468660IZk3;
        EnumC468660IZk enumC468660IZk4 = new EnumC468660IZk("REMOVING", 3);
        LLILZ = enumC468660IZk4;
        EnumC468660IZk[] enumC468660IZkArr = {enumC468660IZk, enumC468660IZk2, enumC468660IZk3, enumC468660IZk4};
        LLILZIL = enumC468660IZkArr;
        new C2254308sP(enumC468660IZkArr);
    }

    public static EnumC468660IZk[] values() {
        return (EnumC468660IZk[]) LLILZIL.clone();
    }

    public static EnumC468660IZk valueOf(String str) {
        return (EnumC468660IZk) C08FF.LIZ(EnumC468660IZk.class, str);
    }

    public EnumC468660IZk(String str, int i) {
    }
}
