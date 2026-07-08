package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Tyz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC764590Tyz {
    public static final EnumC764590Tyz LL;
    public static final EnumC764590Tyz LLILLJJLI;
    public static final EnumC764590Tyz LLILLL;
    public static final EnumC764590Tyz LLILZ;
    public static final /* synthetic */ EnumC764590Tyz[] LLILZIL;

    static {
        EnumC764590Tyz enumC764590Tyz = new EnumC764590Tyz("CONTAINER", 0);
        LL = enumC764590Tyz;
        EnumC764590Tyz enumC764590Tyz2 = new EnumC764590Tyz("LIBRARY", 1);
        LLILLJJLI = enumC764590Tyz2;
        EnumC764590Tyz enumC764590Tyz3 = new EnumC764590Tyz("SEARCH", 2);
        EnumC764590Tyz enumC764590Tyz4 = new EnumC764590Tyz("SETTING", 3);
        LLILLL = enumC764590Tyz4;
        EnumC764590Tyz enumC764590Tyz5 = new EnumC764590Tyz("PLAYLIST", 4);
        LLILZ = enumC764590Tyz5;
        EnumC764590Tyz[] enumC764590TyzArr = {enumC764590Tyz, enumC764590Tyz2, enumC764590Tyz3, enumC764590Tyz4, enumC764590Tyz5};
        LLILZIL = enumC764590TyzArr;
        new C2254308sP(enumC764590TyzArr);
    }

    public static EnumC764590Tyz[] values() {
        return (EnumC764590Tyz[]) LLILZIL.clone();
    }

    public static EnumC764590Tyz valueOf(String str) {
        return (EnumC764590Tyz) C08FF.LIZ(EnumC764590Tyz.class, str);
    }

    public EnumC764590Tyz(String str, int i) {
    }
}
