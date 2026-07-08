package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dSo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1051280dSo {
    public static final EnumC1051280dSo LL;
    public static final EnumC1051280dSo LLILLJJLI;
    public static final EnumC1051280dSo LLILLL;
    public static final EnumC1051280dSo LLILZ;
    public static final /* synthetic */ EnumC1051280dSo[] LLILZIL;

    static {
        EnumC1051280dSo enumC1051280dSo = new EnumC1051280dSo("NOT_LOADED", 0);
        LL = enumC1051280dSo;
        EnumC1051280dSo enumC1051280dSo2 = new EnumC1051280dSo("LOADING", 1);
        LLILLJJLI = enumC1051280dSo2;
        EnumC1051280dSo enumC1051280dSo3 = new EnumC1051280dSo("LOAD_SUCCESS", 2);
        LLILLL = enumC1051280dSo3;
        EnumC1051280dSo enumC1051280dSo4 = new EnumC1051280dSo("LOAD_FAILED", 3);
        LLILZ = enumC1051280dSo4;
        EnumC1051280dSo[] enumC1051280dSoArr = {enumC1051280dSo, enumC1051280dSo2, enumC1051280dSo3, enumC1051280dSo4};
        LLILZIL = enumC1051280dSoArr;
        new C2254308sP(enumC1051280dSoArr);
    }

    public static EnumC1051280dSo[] values() {
        return (EnumC1051280dSo[]) LLILZIL.clone();
    }

    public static EnumC1051280dSo valueOf(String str) {
        return (EnumC1051280dSo) C08FF.LIZ(EnumC1051280dSo.class, str);
    }

    public EnumC1051280dSo(String str, int i) {
    }
}
