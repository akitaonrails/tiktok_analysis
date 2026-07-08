package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0svs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1645900svs {
    public static final EnumC1645900svs LL;
    public static final EnumC1645900svs LLILLJJLI;
    public static final EnumC1645900svs LLILLL;
    public static final /* synthetic */ EnumC1645900svs[] LLILZ;

    static {
        EnumC1645900svs enumC1645900svs = new EnumC1645900svs("NONE", 0);
        LL = enumC1645900svs;
        EnumC1645900svs enumC1645900svs2 = new EnumC1645900svs("SHOW", 1);
        LLILLJJLI = enumC1645900svs2;
        EnumC1645900svs enumC1645900svs3 = new EnumC1645900svs("HIDE", 2);
        LLILLL = enumC1645900svs3;
        EnumC1645900svs[] enumC1645900svsArr = {enumC1645900svs, enumC1645900svs2, enumC1645900svs3};
        LLILZ = enumC1645900svsArr;
        new C2254308sP(enumC1645900svsArr);
    }

    public static EnumC1645900svs[] values() {
        return (EnumC1645900svs[]) LLILZ.clone();
    }

    public static EnumC1645900svs valueOf(String str) {
        return (EnumC1645900svs) C08FF.LIZ(EnumC1645900svs.class, str);
    }

    public EnumC1645900svs(String str, int i) {
    }
}
