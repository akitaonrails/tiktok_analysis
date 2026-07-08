package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dxa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356040Dxa {
    public static final /* synthetic */ EnumC356040Dxa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356040Dxa LOCAL_ALG;
    public static final EnumC356040Dxa LOCAL_CACHE;
    public static final EnumC356040Dxa MUSIC_INFO;
    public static final EnumC356040Dxa NONE;

    public static InterfaceC2044707zh<EnumC356040Dxa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356040Dxa enumC356040Dxa = new EnumC356040Dxa("LOCAL_CACHE", 0);
        LOCAL_CACHE = enumC356040Dxa;
        EnumC356040Dxa enumC356040Dxa2 = new EnumC356040Dxa("MUSIC_INFO", 1);
        MUSIC_INFO = enumC356040Dxa2;
        EnumC356040Dxa enumC356040Dxa3 = new EnumC356040Dxa("LOCAL_ALG", 2);
        LOCAL_ALG = enumC356040Dxa3;
        EnumC356040Dxa enumC356040Dxa4 = new EnumC356040Dxa("NONE", 3);
        NONE = enumC356040Dxa4;
        EnumC356040Dxa[] enumC356040DxaArr = {enumC356040Dxa, enumC356040Dxa2, enumC356040Dxa3, enumC356040Dxa4};
        LL = enumC356040DxaArr;
        LLILLJJLI = new C2254308sP(enumC356040DxaArr);
    }

    public static EnumC356040Dxa[] values() {
        return (EnumC356040Dxa[]) LL.clone();
    }

    public static EnumC356040Dxa valueOf(String str) {
        return (EnumC356040Dxa) C08FF.LIZ(EnumC356040Dxa.class, str);
    }

    public EnumC356040Dxa(String str, int i) {
    }
}
