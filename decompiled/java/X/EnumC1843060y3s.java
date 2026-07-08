package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0y3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1843060y3s {
    public static final EnumC1843060y3s ANIMATION_FOR_DIFFERENT_RANKING_TYPE;
    public static final EnumC1843060y3s ANIMATION_FOR_SAME_RANKING_CATEGORY;
    public static final EnumC1843060y3s ANIMATION_FOR_SAME_RANKING_TYPE;
    public static final /* synthetic */ EnumC1843060y3s[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1843060y3s> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1843060y3s enumC1843060y3s = new EnumC1843060y3s("ANIMATION_FOR_DIFFERENT_RANKING_TYPE", 0);
        ANIMATION_FOR_DIFFERENT_RANKING_TYPE = enumC1843060y3s;
        EnumC1843060y3s enumC1843060y3s2 = new EnumC1843060y3s("ANIMATION_FOR_SAME_RANKING_TYPE", 1);
        ANIMATION_FOR_SAME_RANKING_TYPE = enumC1843060y3s2;
        EnumC1843060y3s enumC1843060y3s3 = new EnumC1843060y3s("ANIMATION_FOR_SAME_RANKING_CATEGORY", 2);
        ANIMATION_FOR_SAME_RANKING_CATEGORY = enumC1843060y3s3;
        EnumC1843060y3s[] enumC1843060y3sArr = {enumC1843060y3s, enumC1843060y3s2, enumC1843060y3s3};
        LL = enumC1843060y3sArr;
        LLILLJJLI = new C2254308sP(enumC1843060y3sArr);
    }

    public static EnumC1843060y3s[] values() {
        return (EnumC1843060y3s[]) LL.clone();
    }

    public static EnumC1843060y3s valueOf(String str) {
        return (EnumC1843060y3s) C08FF.LIZ(EnumC1843060y3s.class, str);
    }

    public EnumC1843060y3s(String str, int i) {
    }
}
